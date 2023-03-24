import java.io.IOException;

public class Printer {
    public static void main(String[] args) throws IOException {
        Printer.printNonSense();
        Printer.printHello();
        Stats.testSomeMethod();
    }

    private static void printNonSense(){
        System.out.println("dfsggfusafiasds");
    }

    private static void printHello(){
        System.out.println("Hello, this is a test project!");
    }
}
