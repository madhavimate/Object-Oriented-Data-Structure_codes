abstract class Shape{
    double a;
    double b;
    public abstract void prntArea();
}

class Rectangle extends Shape{
    public void Dimensions(int length, int breadth){
        a=length;
        b=breadth;
    }
    
    public void prntArea(){
        double area= a * b;
        System.out.println("The area of the rectangle is: "+area);
    }
}

class Triangle extends Shape{
    public void Dimensions(int base, int height){
        a=base;
        b=height;
    }

    public void prntArea(){
        double area= 0.5 * a * b;
        System.out.println("The area of the triangle is: "+area);
    }
}

class Circle extends Shape{
    public void Dimensions(int radius){
        a=radius;
    }
  
    public void prntArea(){
        double area= 3.14 * a * a ;
        System.out.println("The area of the circle is: "+area);
    }
}

public class MainMadhu{
    public static void main(String[] args){
        Rectangle objR= new Rectangle();
        objR.Dimensions(4,9);
        objR.prntArea();

        Triangle objT= new Triangle();
        objT.Dimensions(2,3);
        objT.prntArea();

        Circle objC= new Circle();
        objC.Dimensions(4);
        objC.prntArea();
        
        System.out.println("------------------------------");
        System.out.println("The code is developed by MADHU");

    }
}
