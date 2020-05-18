package lt.vu.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.interceptors.LoggedInvocation;
import lt.vu.services.SongsDatabaseTool;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@ViewScoped
@Named
@Getter @Setter
public class CheckIfSongExists implements Serializable {
    @Inject
    SongsDatabaseTool songsDatabaseTool;

    private CompletableFuture<Boolean> existenceTask = null;

    @Getter
    @Setter
    private Boolean validSongLink = false;

    @LoggedInvocation
    public String checkIfExists() {
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();

        existenceTask = CompletableFuture.supplyAsync(() -> songsDatabaseTool.checkSongExistence());

        return  "/song.xhtml?faces-redirect=true&songId=" + requestParameters.get("songId");
    }

    public boolean isTaskRunning() {
        return existenceTask != null && !existenceTask.isDone();
    }

    public String getCheckingStatus() throws ExecutionException, InterruptedException {
        if (existenceTask == null) {
            return null;
        } else if (isTaskRunning()) {
            return "Connecting to song database";
        }
        validSongLink = existenceTask.get();
        if(validSongLink){
            return "Song found";
        }else{
            return "Song doesn't exists";
        }
    }
}
