package gr.aueb.dt.ch2;

public class Main {

    public static void main(String[] args) {
        Account aliceAccount = new Account(1, "GR1234", "Alice", "Smith", "AB12345", 1000.0);

        try {
            aliceAccount.deposit(500.0);
            aliceAccount.withdraw(1000.0, "GR1234");
            System.out.println("Alice's balance is " + aliceAccount.getBalance());
        } catch (Exception e) {
            System.out.println("An error occurred: ");
        }


    }
}
