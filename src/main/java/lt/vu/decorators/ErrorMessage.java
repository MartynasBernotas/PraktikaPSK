package lt.vu.decorators;

import javax.inject.Named;

@Named
public class ErrorMessage implements IMessage {
    @Override
    public String message() {
        return "Error occured.";
    }
}
