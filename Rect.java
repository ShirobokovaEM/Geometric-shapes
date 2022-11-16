
package geometricalfigure;


public class Rect extends Shape{
    
    private double a, b;

    public Rect(double a, double b, double x, double y, String name) {
        super(x, y, name);
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return super.toString() + ", a=" + a + ", b=" + b;
    }
    
    @Override
    public double area(){
        return a * b;
    }  
    
}
