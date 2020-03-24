package NickZelada;

import java.util.*;

/**
 * This is the Parallelepiped class that extends from Shape super class
 *
 * @author Nick Zelada
 * @version October 29, 2018
 */
public class Parallelepiped extends Shape {

    private final double length, width, height; // double of height, length and width

    /**
     * The constructor has the parameter of x,y,z,length, width, and height. It
     * also calls the super class.
     *
     * @param x gets the x value
     * @param y gets the y value
     * @param z gets the z value
     * @param length gets the length value
     * @param width gets the width value
     * @param height gets the height value
     */
    public Parallelepiped(int x, int y, int z, double length, double width,
            int height) {
        super(x, y, z);
        this.length = length;
        this.width = width;
        this.height = height;
    }
/**
 * Gets the length value
 * @return the length value
 */
    public double getLength() {
        return length;
    }
/**
 * Gets the width value
 * @return the width value
 */
    public double getWidth() {
        return width;
    }
/**
 * Gets the height value
 * @return the height value
 */
    public double getHeight() {
        return height;
    }
/**
 * Calculates the surface area
 * @return the final calculation of the area
 */
    public double surfaceArea() {
        return 2 * ((getLength() * getWidth()) + (getLength() * getHeight())
                + (getWidth() * getHeight()));
    }
/**
 * Calculates the volume
 * @return the final calculation of the volume
 */
    public double volume() {
        return (getLength() * getWidth() * getHeight());
    }
/**
 * Prints out the string method
 * @return the class name with x,y,z, length, width, and height.
 */
    public String toString() {
        return this.getClass().getSimpleName() + " " + super.toString() + "Length: " + getLength()
                + " Width: " + getWidth() + " Height: " + getHeight();
    }

}
