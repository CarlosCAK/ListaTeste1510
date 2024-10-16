public class UserService {
    private EmailServiceStub emailService;
    public UserService(EmailServiceStub emailService) {
        this.emailService = emailService;
    }
    public boolean registerUser(String email) {
        return emailService.sendEmail(email, "Bem-vindo ao sistema!");
    }
}