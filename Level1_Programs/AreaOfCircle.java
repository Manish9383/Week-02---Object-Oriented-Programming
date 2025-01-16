class Circle{
     double radius;
    Circle(double radius){
        this.radius = radius;
    }
    double Area(){
        return Math.PI * radius * radius;
    }
    double Circumference(){
        return 2 * Math.PI * radius;
    }
    void display(){
        System.out.printf("Area of Circle :%.2f%n",Area());
        System.out.printf("Circumferece of Circle is :%.2f%n",Circumference());
    }
}
public class AreaOfCircle{
    public static void main(String[] args){
        Circle c1 = new Circle(5);
        c1.display();
    }
}