package NickZelada;
import java.util.*;

/**
 * This is the ShapeComparator class that implements from Comparator
 * @author Nick Zelada
 * @version October 29, 2018
 */
public class ShapeComparator implements Comparator
{
    /**
     * This method compares both object from their distance. 
     * @param firstObject the first object
     * @param secondObject the second object
     * @return It's will return a 1, -1, or 0 values depending on their end results.
     */
    public int compare(Object firstObject, Object secondObject)
    {
        
      
        Shape shape1 = (Shape) firstObject;
      
        Shape shape2 = (Shape) secondObject;
      
      
      
        double distFromStart1 = shape1.distanceFromStart();
        double distFromStart2 = shape2.distanceFromStart();
      
      
      
        if (distFromStart1 < distFromStart2)
        {
            return 1;
        }
        if (distFromStart1 > distFromStart2)
        {
            return -1;
        }
        return 0;
    }
}
