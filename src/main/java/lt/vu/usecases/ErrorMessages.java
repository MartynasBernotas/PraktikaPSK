package lt.vu.usecases;

import lt.vu.decorators.IMessage;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class ErrorMessages {
    @Inject
    private IMessage iMessage;

    public String errorMessage() {
        return iMessage.message();
    }
}
