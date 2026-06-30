
interface Printer {
    void printDocument();
}

interface Scanner {
    void scanDocument();
}

interface FaxMachine {
    void faxDocument();
}
class MultiFunctionCopier implements Printer, Scanner, FaxMachine {

    @Override
    public void printDocument() {
        System.out.println("Printing...");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning...");
    }

    @Override
    public void faxDocument() {
        System.out.println("Faxing...");
    }
}

class BasicPrinter implements Printer {

    @Override
    public void printDocument() {
        System.out.println("Printing...");
    }
}

public class Main {

    public static void main(String[] args){
        Printer basic = new BasicPrinter();
        basic.printDocument();
        MultiFunctionCopier copier = new MultiFunctionCopier();
        copier.printDocument();
        copier.scanDocument();
        copier.faxDocument(); 
    }
}
