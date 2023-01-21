package scalar_dp.designPattern.adapter;

public interface BankAPIAdapter {
    float checkBalance(String accountNo, String pin);
    boolean authenticate(String accountNo, String pin);
    boolean transaction(String fromAccountNo, String toAccountNo);
}
