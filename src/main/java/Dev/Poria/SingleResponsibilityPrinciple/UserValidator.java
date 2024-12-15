package Dev.Poria.SingleResponsibilityPrinciple;

// This class only for validate user !

public class UserValidator {
    public boolean validate(String name) {
        return name != null && !name.isEmpty();
    }
}
