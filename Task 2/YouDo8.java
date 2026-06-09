
public class Main{
    public static void main(String[] args){
        Item mouse = new Item("Mouse",25.33);
        Item keyboard = new Item("keyboard",30.33);
        
        Order or = new Order(mouse,keyboard);
        
        or.printbill();
    }
}

class Item {
    String name;
    double price;
     Item(String name, double price){
         this.name = name;
         this.price = price;
         
     }
}

class Order{
    Item item1;
    Item item2;
    
    Order(Item item1,Item item2){
        this.item1 = item1;
        this.item2 = item2;
    }
    
    void printbill(){
        double total = item1.price + item2.price;
        System.out.println("total:"+total);
    }
}

