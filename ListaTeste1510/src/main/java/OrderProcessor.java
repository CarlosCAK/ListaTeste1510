public class OrderProcessor {

    private PaymentService paymentService;
    public OrderProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public boolean processOrder(String account, double amount) {
        return paymentService.processPayment(account, amount);
    }
}