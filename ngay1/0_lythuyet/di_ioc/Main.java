public class Main {
  public static void main(String[] args) {
    MessageService emailService = new EmailService();
    MessageService smsService = new SMSService();

    // Constructor injection
    // Client client = new Client(smsService);
    // Client client = new Client(emailService);

    // Setter injection
    // Client client = new Client();
    // client.setMessageService(smsService);
    // client.setMessageService(emailService);

    // Interface injection
    Client client = new Client();
    client.setService(smsService);
    client.setService(emailService);

    client.processMessage();
  }
}