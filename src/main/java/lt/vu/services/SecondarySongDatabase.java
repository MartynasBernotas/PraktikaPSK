package lt.vu.services;

import lt.vu.interceptors.LoggedInvocation;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

@ApplicationScoped
@Alternative
public class SecondarySongDatabase implements ISongsDatabase {
    @LoggedInvocation
    public Boolean checkSongExistence() {
        try {
            Thread.sleep(2000); // Simulate intensive work
        } catch (InterruptedException e) {
        }
        return false;
    }
}
