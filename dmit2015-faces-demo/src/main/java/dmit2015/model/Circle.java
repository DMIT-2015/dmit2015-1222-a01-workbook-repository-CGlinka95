package dmit2015.model;

/**
 * This class models a Circle shape
 * @author Christopher Glinka
 * @version 2023/01/20
 */
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

    /**
     * Change the radius of this circle
     * @param radius the new radius of this circle
     */
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
        //this.radius = radius;
        setRadius(radius);
    }

    /**
     * Compute and return the area of this circle
     * @return area of this circle
     */
    public double area() {
        return Math.PI * radius * radius;
    }

    /**
     * Compute and return the diameter of this circle
     * @return diameter of this circle
     */
    public double diameter() {
        return 2 * radius;
    }

    /**
     * Compute and return the circumference of this circle
     * @return circumference of this circle
     */
    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
