package lt.vu.services;

import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;

@ApplicationScoped
public class SongsDatabaseTool implements Serializable {
    public Boolean checkSongExistence() {
        try {
            Thread.sleep(2000); // Simulate intensive work
        } catch (InterruptedException e) {
        }
        return true;
    }
}
