package gr.aueb.dt.ch4.bankapp;

public class NegativeAmountException extends Exception {

    public NegativeAmountException(String message) {
        super(message);
    }
}
