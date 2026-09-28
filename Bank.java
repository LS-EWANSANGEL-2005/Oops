package oops;

public class Bank {

    private String Username;
    private String Password;
    private String email;
    private int loginAttempts;

    Bank(String username, String password, String email) {
        this.Username = username;
        this.Password = password;
        this.email = email;
        this.loginAttempts = 0;
    }

    String getUsername() {
        return Username;
    }

    String getEmail() {
        return email;
    }

    public void login(String Password) {

        if (loginAttempts >= 3) {
            System.out.println("can't login");
            return;
        }

        if (this.Password.equals(Password)) {
            System.out.println("login successful");
            return;
        } else {
            loginAttempts++;
            System.out.println("invalid password");
        }

        if (loginAttempts == 3) {
            System.out.println("Account locked");
        }
    }

    public void resetPassword(String oldpassword, String newpassword) {

        if (this.Password.equals(oldpassword)) {
            this.Password = newpassword;
            System.out.println("password reset successful");
        } else {
            System.out.println("Invalid password");
        }
    }

    public static void main(String[] args) {

        Bank a = new Bank(
                "Angel",
                "user123",
                "ewansangel2005@gmail.com"
        );

        System.out.println(a.getUsername());
        System.out.println(a.getEmail());

        a.login("1209");
        a.login("1209");
        a.login("1209");

        a.resetPassword("user123", "Angel2005");

        a.login("Angel2005");
    }
}