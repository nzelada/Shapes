package NickZelada;
import java.util.*;

/**
 *This sis the Sphere class that extends from Shape.
 * @author Nick Zelada
 * @version October 29, 2018
 */
public class Sphere extends Shape {

    private final double radius; // final double for radius

    
    /**
     * This is a Sphere constructor that gets the values and calls super class.
     * @param x gets the integer for x
     * @param y gets the integer for y
     * @param z gets the integer for z
     * @param radius gets the integer for radius
     */
    public Sphere(int x, int y, int z, double radius) {
        super(x, y, z);
        this.radius = radius;
    }
/**
 * Gets the radius
 * @return the radius value
 */
    public double getRadius() {
        return radius;
    }
/**
 * Calculates the values of the surface area
 * @return the final result of the area.
 */
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }
/**
 * Calculates the values of the volume
 * @return the final results of the volume.
 */
    public double volume() {
        return ((4.0 / 3.0) * Math.PI * (Math.pow(getRadius(), 3)));
    }
/**
 * Displays the class name with the values and radius
 * @return the string with class, values, and radius.
 */
    public String toString() {
        return this.getClass().getSimpleName() + "" + super.toString() + " Radius: " + getRadius();
    }

}
