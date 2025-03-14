public class Client implements InjectionMessage {
  private MessageService service;

  // Construct injection
  // public Client(MessageService messageServiceParam) {
  // this.service = messageServiceParam;
  // }

  // Setter injection
  // public void setMessageService(MessageService messageServiceParam) {
  // this.service = messageServiceParam;
  // }

  public void processMessage() {
    service.sendMessage();
  }

  @Override
  public void setService(MessageService messageService) {
    this.service = messageService;
  }
}
