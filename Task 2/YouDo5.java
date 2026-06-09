class Printer {
    void printData(String text) {
        System.out.println("Text: " + text);
    }

    void printData(int number) {
        System.out.println("Number: " + number);
    }
}

public class Main {

    public static void main(String[] args) {
        Printer print = new Printer();

        print.printData("joy");
        print.printData(100);
    }
}
