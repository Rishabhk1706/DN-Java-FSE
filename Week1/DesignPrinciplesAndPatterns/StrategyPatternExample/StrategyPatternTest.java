public class StrategyPatternTest {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment(2500);

        context.setPaymentStrategy(new PayPalPayment());
        context.executePayment(1800);
    }
}