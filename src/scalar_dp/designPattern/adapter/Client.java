package scalar_dp.designPattern.adapter;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe(new YesBankAPIAdapter());
    }
}
