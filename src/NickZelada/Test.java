package NickZelada;

import NickZelada.Cone;
import NickZelada.Cylinder;
import NickZelada.Parallelepiped;
import NickZelada.Point3D;
import NickZelada.Shape;
import NickZelada.ShapeComparator;
import NickZelada.Sphere;
import java.util.*;

/**
 * This is the Test class in which will get the measurement of the shapes and
 * print out the calculations.
 *
 * @author Nick Zelada
 * @version October 29, 2018
 */
public class Test {

    /**
     * The Test file would get the array of shapes with each shape and their
     * measurements. From there it would print out in a for loop each shape with
     * the surface area and volume, along side the name of the shape. It would
     * also print out the distance from the origin in the array.
     *
     * @param args the parameter of args
     */
    public static void main(String[] args) {

        Shape[] shapes = {new Sphere(2, -7, 5, 15), // Data of Sphere
            new Parallelepiped(7, 3, 9, 37, 9, 12), // Data of Parallelepiped
            new Cylinder(3, -5, 5, 10, 13), // Data of Cylinder
            new Cone(-5, 3, -1, 11, 14)}; // Data of Cone

        // enhanced for loop for shapes
        for (Shape a : shapes) {
            System.out.println(a.toString()); // prints the toString
            System.out.printf("Surface Area: %.2f \n", a.surfaceArea()); // prints surface area
            System.out.printf("Volume: %.2f \n", a.volume()); // prints the volume and new line
            System.out.println();
        }

        Arrays.sort(shapes); // arrays sorting the shapes

        // enhanced for loop 
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName()); // prints the toString
            System.out.printf("Volume: %.2f" , shape.volume()); //  prints the volume
            System.out.println("\n"); // new line
        }

        // sort the list once again by distance from the center
        Arrays.sort(shapes, new ShapeComparator());
        // enhanced for loop 
        for (Shape b : shapes) {
            System.out.println(b.getClass().getSimpleName());
            System.out.printf("Distance from Origin: %.2f \n" //  prints distance
                    , b.distanceFromStart()); 
            System.out.println();
        }

    }
}
