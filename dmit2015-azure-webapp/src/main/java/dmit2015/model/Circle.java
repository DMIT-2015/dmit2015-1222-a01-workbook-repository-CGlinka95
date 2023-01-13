package dmit2015.model;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    /*
    ------------Checked-exception example------------
    public void setRadius(double radius) throws Exception {
        if (radius <= 0) {
            throw new Exception("Radius must be a positive non-zero number");
        }
        this.radius = radius;
    }
*/

    //------------Runtime exception example------------
    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Radius must be a positive non-zero number");
        }
        this.radius = radius;
    }

    public Circle() {
        setRadius(1);
    }

    public Circle(double radius) {
//      this.radius = radius;
        setRadius(radius);
    }

    public double Area()
    {
        return Math.PI * radius * radius;
    }

    public double Perimeter()
    {
        return 2 * Math.PI * radius;
    }
}
