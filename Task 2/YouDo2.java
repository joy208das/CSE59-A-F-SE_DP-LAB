class NumberChecker{
    
    void check(int num){
        if(num%2==0 && num>10){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

public class Main{
    public static void main(String[] args){
        NumberChecker ch = new NumberChecker();
        ch.check(25);
    }
}
