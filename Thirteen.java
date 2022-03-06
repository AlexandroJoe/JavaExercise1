import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Thirteen {
    public static void main (String [] args){
        double a = 0;
        
        Scanner b = new Scanner(System.in); //use scanner to get user input
        System.out.println("Enter value for b: "); //print question for user

        double myb = b.nextInt(); //put user input value to new variable

        Scanner c = new Scanner(System.in); //use scanner to get user input
        System.out.println("Enter value for c: "); //print question for user

        double myc = c.nextInt(); //put user input value to new variable

        // check determinant
        double determinant = (myb * myb) - (4 * a * myc);

        //making 2 possible roots
        double pRoot = (-myb + Math.sqrt(determinant)) / (2*a);
        double nRoot = (-myb - Math.sqrt(determinant)) / (2*a);
        
        //determinant cannot be <0 because a = 0 and if I put negative number on b, it will be always positive because of the square
        if (determinant > 0){
            System.out.println("Value for X in this equation is : "+ pRoot + nRoot);
        }
        else {
            double x = -myb / (2 * a);

            System.out.println("Value for X in this equation is : "+ x );
        }
        
    }
}
