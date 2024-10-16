public class EmailService {
    public boolean sendEmail(String recipient, String message) {
// Simulação do envio de email
        return recipient != null && !recipient.isBlank() && message != null && !
                message.isBlank();
    }
}