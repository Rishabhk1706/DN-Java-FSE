interface PaymentProcessor {
    void processPayment(double amount);
}

// Adaptee 1
class PayPalGateway {
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " processed using PayPal.");
    }
}

// Adaptee 2
class StripeGateway {
    public void chargeCard(double amount) {
        System.out.println("Payment of " + amount + " processed using Stripe.");
    }
}

// Adaptee 3
class RazorpayGateway {
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " processed using Razorpay.");
    }
}

// Adapter for PayPal
class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway gateway;

    public PayPalAdapter(PayPalGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void processPayment(double amount) {
        gateway.makePayment(amount);
    }
}

// Adapter for Stripe
class StripeAdapter implements PaymentProcessor {
    private StripeGateway gateway;

    public StripeAdapter(StripeGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void processPayment(double amount) {
        gateway.chargeCard(amount);
    }
}

// Adapter for Razorpay
class RazorpayAdapter implements PaymentProcessor {
    private RazorpayGateway gateway;

    public RazorpayAdapter(RazorpayGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void processPayment(double amount) {
        gateway.pay(amount);
    }
}

public class AdapterPatternExample {
    public static void main(String[] args) {

        PaymentProcessor paypal =
                new PayPalAdapter(new PayPalGateway());

        PaymentProcessor stripe =
                new StripeAdapter(new StripeGateway());

        PaymentProcessor razorpay =
                new RazorpayAdapter(new RazorpayGateway());

        paypal.processPayment(1000);
        stripe.processPayment(2000);
        razorpay.processPayment(3000);
    }
}