import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.regex.Pattern;

public class Validator {
    public static boolean validate(
            String login,
            String password,
            String confirmPassword
    ) throws WrongLoginException,WrongPasswordException {
        if (!Pattern.matches("^[a-zA-z0-9_]{1,20}$", login)) {
            throw new WrongLoginException("Неверный формат логина.");
        }
        if (!Pattern.matches("^[a-zA-z0-9_]{1,19}$", password)) {
            throw new WrongPasswordException("Неверный формат пароля.");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают.");
        }
        return true;
    }

}






