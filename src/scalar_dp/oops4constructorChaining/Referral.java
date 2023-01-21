package scalar_dp.oops4constructorChaining;

public class Referral  extends User{
    public Referral(String name, String email, String password) {
        super(name, email, password);
        System.out.println("Referral Constructor Start");
        System.out.println("Referral Constructor End");
    }

}
