/*Exercise 2
Write a program to represent a class called Point3D that stores the coordinates of a point in 3D
space. Add a constructor to initialize the variables passed. Add a method called distance () to
calculate the distance from origin to a point.
Create another class called PointApp with the main function and create two objects of the class
Point3D. Calculate and display the distance to the origin of these objects.
Note: distance = sqrt( x
2 +y2 + z2
)
*/

// Java program to create a point 3D  
// object and display its coordinates 
// and find its distance from origin 
import javafx.geometry.Point3D; 
  
public class Point3D_1 { 
  
    // Main Method 
    public static void main(String args[]) 
    { 
  
        // Create a point3D object 
        Point3D point3d_1 = new Point3D(20.0f, 50.0f, 70.0f); 
  
        double x, y, z; 
  
        // get the coordinates of the point 
        x = point3d_1.getX(); 
        y = point3d_1.getY(); 
        z = point3d_1.getZ(); 
  
        // display the coordinates of the point 
        System.out.println("x coordinate = " + x  
                            + ", y coordinate = " 
                            + y + ", z coordinate = " + z); 
  
        // print its distance from origin 
        System.out.println("Distance From Origin = " 
                     + point3d_1.distance(0, 0, 0)); 
    } 
} 
