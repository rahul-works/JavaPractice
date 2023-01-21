package scalar_dp.oops4constructorChaining;

public class User {
    public String name;
    public String email;
    public String password;

    public User(String uName, String uEmail, String uPassword) {
        System.out.println("User Constructor - Start");
        name = uName;
        email = uEmail;
        password = uPassword;
        System.out.println("User Constructor - End");
    }
}
