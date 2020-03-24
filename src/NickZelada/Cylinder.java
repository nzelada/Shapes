package NickZelada;
import java.util.*;

/**
 * This is the Cylinder Class that extends from the Shape super class.
 * @author Nick Zelada
 * @version October 29, 2018
 */
public class Cylinder extends Shape
{
    
    private final double radius, height; // radius and height values
  
    /**
     * The Cylinder constructor gets the x,y,z, radius, and height values
     * and calls the super class after.
     * @param x the x value put in place
     * @param y the y value put in place
     * @param z the z value put in place
     * @param radius the radius value put in place
     * @param height the height value put in place
     */
    public Cylinder(int x, int y, int z, double radius, double height)
    {
        super(x, y, z);
        this.radius = radius;
        this.height = height;
    }
    /**
     * Gets the radius value
     * @return the radius value
     */
    public double getRadius()
    {
        return radius;
    }
    /**
     * Gets the height value
     * @return the height value
     */
    public double getHeight()
    {
        return height;
    }
/**
 * Calculate the surface area with the formula presented
 * @return the final calculation of the area. 
 */
   
    public double surfaceArea()
    {
        return 2 * Math.PI * getRadius() *( getHeight() + getRadius());
    }
    /**
     * Calculate the volume with the formula presented.
     * @return the final calculation of the volume.
     */
    public double volume()
    {
        return (( Math.PI * Math.pow(getRadius(), 2) * getHeight()));
    }
   /**
    * Prints out the toString method
    * @return the class name with the x,y,z values and radius and height
    */
    public String toString()
    {
       return this.getClass().getSimpleName() + " " + super.toString() + " Radius: " + getRadius()
                + " Height: " + getHeight();
    }

}
