package org.st.log;

public class Shop {
    private Payments payments;

    public Shop(Payments payments) {
        this.payments = payments;
    }

    public void doSell() {
        payments.doTransaction();
    }
}
