package refactoring_guru.strategy;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
