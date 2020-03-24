package NickZelada;

import java.util.*;

/**
 * This is the Cone class that extends from Shape.
 *
 * @author Nick Zelada
 * @version October 29, 2018
 */
public class Cone extends Shape {

    private final double radius, height; // double values of height and radius

    /**
     * This method gets the values listed in the parameter, and calls the super
     * class besides that makes radius and height to this.
     *
     * @param x gets the x integer
     * @param y gets the y integer
     * @param z gets the z integer
     * @param radius gets the radius number
     * @param height gets the height number
     */
    public Cone(int x, int y, int z, double radius, double height) {
        super(x, y, z);
        this.radius = radius;
        this.height = height;
    }

    /**
     * Gets the radius
     *
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Gets the height
     *
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Gets the surface area
     *
     * @return the calculation of the surface area
     */
    public double surfaceArea() {
        return (Math.PI * getRadius()) * (getRadius()
                + Math.sqrt(Math.pow(getRadius(), 2) + Math.pow(getHeight(), 2)));
    }

    /**
     * Calculate the volume
     *
     * @return gets the final calculation of the volume by getting the pie,
     * radius, and height.
     */
    public double volume() {
        return ((Math.PI * Math.pow(getRadius(), 2) * getHeight()) / 3);
    }

    /**
     * The toStrong method will print out the string.
     *
     * @return it would print out the class name, with the x,y,z integers by
     * calling super and the getting the radius also with the height.
     */
    public String toString() {
        return this.getClass().getSimpleName() + " " + super.toString() + " Radius: " + getRadius()
                + " Height: " + getHeight();
    }

}
