package gr.aueb.dt.ch6;

public class Main {

    public static void main(String[] args) {
        doPrint(new IPrintable() {
            @Override
            public void print() {
                System.out.println("Hello");
            }
        });

        IPrintable printable = () -> System.out.println("Hello");

        // Lambdas are like functions
        doPrint(() -> System.out.println("Hello"));
        doPrint(Main::sayHello);
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void doPrint(IPrintable printable) {
        printable.print();
    }
}
