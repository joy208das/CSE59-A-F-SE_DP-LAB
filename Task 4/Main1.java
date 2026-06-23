
interface Shape {
double calculateArea();
    
}
class Rectangle implements Shape{
    public double length;
    public double width;

    public Rectangle (double length, double width){
        this.length = length;
        this.width = width ;
    }
    @Override
    public double calculateArea(){
        return length * width ;
    }
}

class Circle implements Shape{
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI * radius * radius ;
    }
}

class Triangle implements Shape{
    private double base ;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return 0.5*base* height;
    }
}

public class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes){
        double totalArea = 0;

        for (Shape shape: shapes){
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    public static void main(String[] args){
        Shape[] shapes ={
            new Rectangle(10,5),
            
        };
        AreaCalculator calculator = new AreaCalculator();

        System.out.println(calculator.calculateTotalArea(shapes)
        );
    }
}
