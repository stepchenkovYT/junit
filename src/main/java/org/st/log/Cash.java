package org.st.log;

public class Cash implements Payments {
    @Override
    public void doTransaction() {
        System.out.println("Cash");
    }
}
