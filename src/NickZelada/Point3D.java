package NickZelada;
import java.util.*;

/**
 * This is the Point3D class in which gets the pointers.
 * @author Nick Zelada
 * @version October 29,2018
 */
public class Point3D {
    
  
    private int x, y, z;   // x,y,z pointers    
  
    /**
     * The Point3D constructor gets the x,y,z values
     * @param x gets x value
     * @param y gets y value
     * @param z gets z value
     */
    public Point3D(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
/**
 * Gets the x value
 * @return the x value
 */
    public int getX()
    {
        return x;
    }

   /**
    * Gets the y value
    * @return  the y value
    */
    public int getY()
    {
        return y;
    }

    /**
     * Gets the z value
     * @return the z value
     */
    public int getZ()
    {
        return z;
    }
   /**
    * Prints the toString method
    * @return prints out the x,y,z values
    */
    public String toString()
    {
        return " (" + getX() + "," + getY() + "," + getZ() + ") ";
    }
    
}
