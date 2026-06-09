
class printer {
    void printdata(string text){
        System.out.println("text: "+text);
    }
    
    void printdata(int number){
        System.out.println("number: "+number);
    }
}


public class Main{
    
    public static void main(String[] args){
        printer print = new printer();
        print.printdata("joy");
        print.printdata(100);
    }
}
