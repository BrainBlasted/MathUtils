/**
 * QuadraticVertex.java
 *  This class will calculate the vertex of a Quadratic function.
 *  It takes the leading coefficient, the second coefficient, 
 * +and the C value, then calculates the vertex.
 * w
 * @author Christopher Davis
 * @version 20170905
 */
package brainblasted.math;

import java.util.*;

public class QuadraticVertex
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the leading coefficient: ");
        double leadCoeff = keyboard.nextDouble();
        System.out.print("Enter the next coefficient: ");
        double secondaryCoeff = keyboard.nextDouble();
        System.out.print("Enter the constant value: ");
        double constantVal = keyboard.nextDouble();
        keyboard.close();
        vertexFinder(leadCoeff, secondaryCoeff, constantVal);
    }

    public static void vertexFinder(double leadCoeff, double secondaryCoeff, double constantVal) 
    {
        // These are set so that the code xVertex & yVertex are properly initialized.
        double xVertex = 0;
        double yVertex = 0;

        if (leadCoeff == 0)
        {
            System.err.println("This is not a proper quadratic function.");
        } else 
        {
            xVertex = (-secondaryCoeff)/(2*(leadCoeff));
            yVertex = (leadCoeff * (Math.pow(xVertex, 2))) + 
                        (secondaryCoeff * xVertex) + constantVal;
        }

        System.out.printf("The vertex of this function is at (%.2f,%.2f)%n", xVertex, yVertex);
    }

}