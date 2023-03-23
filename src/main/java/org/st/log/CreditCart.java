package org.st.log;

public class CreditCart implements Payments {
    @Override
    public void doTransaction() {
        System.out.println("Credit");
    }
}
