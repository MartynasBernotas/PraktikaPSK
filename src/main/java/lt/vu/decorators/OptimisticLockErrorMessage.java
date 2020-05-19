package lt.vu.decorators;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@Decorator
public class OptimisticLockErrorMessage implements IMessage {

    @Inject
    @Delegate
    @Any
    ErrorMessage errorMessage;

    @Override
    public String message() {
        String message = errorMessage.message();
        return message + " Object was updated moments ago. Please refresh and try again.";
    }
}
