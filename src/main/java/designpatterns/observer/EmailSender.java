package designpatterns.observer;

public class EmailSender implements OrderPlacedSubscriber {

    public EmailSender() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        sendEmail();
    }

    public void sendEmail() {
        System.out.println("Sending Email");
    }
}
