import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        String login = "user";
        String password = "password1";
        String confirmPassword = "password";
        try {
            System.out.println(Validator.validate(login, password, confirmPassword));
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
        System.out.println("Программа ещё живёт!");
    }
}
