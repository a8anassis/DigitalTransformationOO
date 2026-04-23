package gr.aueb.dt.ch2;

public class Account {
    private long id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account() {

    }


    public Account(long id, String iban, String firstname,
                   String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    // Public API

    /**
     * Deposits a specific amount of money to the account.
     * @param amount   the amount of money to be deposited.
     */
    public void deposit(double amount) throws Exception {
        try {
            if (amount < 0) throw new Exception("The amount should be positive.");
            balance += amount;
            // log
        } catch (Exception e) {
            // logging
            System.err.println("Negative amount = " + amount + " is not allowed." + "\n");
            throw e;
        }
    }

    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if (amount < 0) throw new Exception("The amount should be positive.");
            if (amount > balance) throw new Exception("The balance is insufficient.");
            if (!isSsnValid(ssn)) throw new Exception("The SSN is invalid.");
            balance -= amount;
        } catch (Exception e) {
            System.err.println("Withdrawal failed: " + e.getMessage() + "\n");
            throw e;
        }
    }

    public double getAccountBalance() {
        return balance;     // return getBalance();
    }


    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }
}
