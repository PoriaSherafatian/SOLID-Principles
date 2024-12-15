package Dev.Poria.SingleResponsibilityPrinciple;

// This class is only for add client.

public class UserService {
    private UserValidator userValidator;

    public UserService(UserValidator userValidator) {
        this.userValidator = userValidator;
    }

    public void addUser(String name) {
        if (userValidator.validate(name)) {
            System.out.println("User " + name + " added.");
        } else {
            System.out.println("Invalid user name.");
        }
    }
}

