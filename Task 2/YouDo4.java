class Sensor {
    String name ;
    int batterylevel;
     
    void charge(){
        batterylevel = 100;
        System.out.println("Sensor fully charged");
    }
    
}

public class  Main{
    
    public static void main(String[] args){
        Sensor se = new Sensor();
        se.charge();
        System.out.println("new battery level"+ Sensor.batterylevel);
    }
}
