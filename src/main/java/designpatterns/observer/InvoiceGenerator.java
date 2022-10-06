package designpatterns.observer;

public class InvoiceGenerator implements OrderPlacedSubscriber {

    public InvoiceGenerator() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        generateInvoice();
    }


    public void generateInvoice() {
        System.out.println("Generating Invoice");
    }
}
