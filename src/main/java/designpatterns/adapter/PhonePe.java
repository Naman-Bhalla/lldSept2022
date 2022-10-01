package designpatterns.adapter;

public class PhonePe {
    private BankAPIAdapter bankAPI;

    public PhonePe(BankAPIAdapter bankAPI) {
        this.bankAPI = bankAPI;
    }

    double doSomething() throws InterruptedException {
        double currentBalance = bankAPI.getBalance("accountNumber");
        Thread.sleep(25 * 24 * 60 * 60 * 1000);
        return currentBalance * 2;
    }
}

// Break till 10:06 PM
// Intro to Decorator -> end by 10:30ish