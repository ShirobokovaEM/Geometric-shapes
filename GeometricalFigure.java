
package geometricalfigure;
public class GeometricalFigure {

    
    public static void main(String[] args) {
       
        Shape[] m = {
            new Rect(2, 3, -1, 2.5, "Rectangle - 1"),
            new Circle(10, .7, -.2, "Circle - 1"),
            new Circle(1, 2, 3.5, "Circle - 2")
        };
        for (Shape shape : m) {
            System.out.println(shape.area());
        }
        
        for (Shape shape : m) {
            if(shape instanceof Rect){
                Rect tmp = (Rect) shape;
                System.out.println(tmp.area());
            } else if(shape instanceof Circle){
                System.out.println(((Circle)shape).area());
            }
        }
    }
    
}
