import java.util.Scanner;

public class Ten {
    public static void main (String [] args){
        Scanner x1 = new Scanner(System.in); //using scanner to get user input
        System.out.println("Enter x1"); // printing question 

        double myX1 = x1.nextDouble(); // put the user input to new variable

        Scanner x2 = new Scanner(System.in); //using scanner to get user input
        System.out.println("Enter x2"); // printing question 

        double myX2 = x2.nextDouble(); // put the user input to new variable

        Scanner x3 = new Scanner(System.in); //using scanner to get user input
        System.out.println("Enter x1"); // printing question 

        double myX3 = x3.nextDouble(); // put the user input to new variable

        // calculate the user input with given formula
        double mean = (myX1 + myX2 + myX3) / 3;
        double variance1 = ((myX1 - mean) * (myX1 - mean) + (myX2 - mean) * (myX2 - mean) + (myX3 - mean) * (myX3 - mean)) / 3;
        double variance2 = variance1*variance1;
        double standard_deviation  = variance1;

        System.out.println(mean);
        System.out.println(variance2);
        System.out.println(standard_deviation);
    }
}
