package NickZelada;

import java.util.*;

/**
 * This is the abstract class of Shape that implements Comparable
 *
 * @author Nick Zelada
 * @version October 29, 2018
 */
public abstract class Shape implements Comparable {

    private Point3D threeDPoint;  // Object

    /**
     * The shape constructor gets the x, y, and z integer from the parameter.
     *
     * @param x gets the integer of x
     * @param y gets the integer of y
     * @param z gets the integer of z
     */
    public Shape(int x, int y, int z) {
        threeDPoint = new Point3D(x, y, z);
    }

    /**
     * The string method calls to print out the string
     *
     * @return the object string from threeDPoint
     */
    public String toString() {
        return threeDPoint.toString();
    }

    /**
     * This method would calculate the distance from start and print it.
     *
     * @return the distance from start which is (0,0)
     */
    public double distanceFromStart() {

        return Math.sqrt(Math.pow(threeDPoint.getX(), 2)
                + Math.pow(threeDPoint.getY(), 2)
                + Math.pow(threeDPoint.getZ(), 2));

    }

    /**
     * This method compares the object and returns a -1 if it's less than or 1
     * if it's greater. if its anything else than that then it will return a 0.
     *
     * @param s Object s
     * @return the value that belongs with the results.
     */
    public int compareTo(Object s) {
        Shape other = (Shape) s;   // downcasting from Object to Shape

        if (this.volume() < other.volume()) {
            return -1;
        } else if (this.volume() > other.volume()) {
            return 1;
        } else {
            return 0;
        }

    }

    /**
     * This is an abstract method for surface area
     *
     * @return the value that shows the result for the area.
     */
    public abstract double surfaceArea();

    /**
     * This is an abstract method for the volume.
     *
     * @return the value that shows the result for the volume.
     */
    public abstract double volume();

}
