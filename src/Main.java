public class Main {
    public static void main(String[] args) {
        validate("login", "pass", "pass");
        validate("@fdsgds", "pass", "pass");
        validate("dfdf", "p&ass", "pass");
        validate("sdgjakslghjasdlkhfjkdsalhfjsdlabgjalsdjghadsl", "pass", "pass");
        validate("ddffdf", "pass", "342111");

    }

    private static void validate(String login, String password, String confirmPassword) {
        try {
            checkLogin(login);
            checkPassword(password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Invalid login: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Invalid password: " + e.getMessage());
        }
    }

    private static void checkLogin(String login) {
        if (hasLengthMoreThan(login) || isNoneAlphanumeric(login)) {
            throw new WrongLoginException("Login is wrong");
        }
    }

    private static void checkPassword(String password, String password2) {
        if (hasLengthMoreThan(password) || isNoneAlphanumeric(password) ||
                passwordsNotEquals(password, password2)) {
            throw new WrongPasswordException("Password is wrong");
        }
    }

    private static boolean passwordsNotEquals(String password, String password2) {
        return !password.equals(password2);
    }

    private static boolean isNoneAlphanumeric(String str) {
        final String alphabet = "abcdefghijklmnopqrstuvwxyz1234567890_";
        for (int i = 0; i < str.length(); i++) {
            if (!alphabet.contains(String.valueOf(str.charAt(i)))){
                return true;
            }
        }
        return false;
    }

    private static boolean hasLengthMoreThan(String str) {
        return str.length() > 20;
    }
}