package UI;

public class Geometry extends Maths {
    public Geometry(){
        System.out.println("Constructor Called");
    }
   void accessPi(){
       System.out.println(getPi());
       setPi(34f);
       System.out.println(getPi());
   }

    float mutiply(float num1, float num2) {
        return super.mutiply(num1, num2);
    }
    public float areaOfSquare(float length) {

        return powTwo(length);
    }
    float areaOfTriangle(float length, float breadth) {
        return divide( 1, 2) * mutiply(breadth, length);
    }
    float areaOfRectangle(float length, float breadth) {
        return mutiply(length,breadth);
    }
}

// static polymorphism imethod overload
// dynamic polymorphismmethod overriding