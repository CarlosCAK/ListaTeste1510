public class EmailServiceStub {
    public boolean sendEmail(String recipient, String message) {
// Simulação do envio de email
        return recipient != null && !recipient.isEmpty();
    }
}