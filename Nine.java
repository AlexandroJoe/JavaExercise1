import java.util.Scanner;

public class Nine {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in); //use scanner
        System.out.println("Enter degree in Celcius: "); //printing the question

        int degree = userInput.nextInt(); //put the user input to the new variable

        int fahrehenit = (degree *  + 160)/5; // calculate the fahrenheit with formula

        System.out.println(degree + " Celsius degrees are " + fahrehenit + " Fahrenheit degrees" );
}
}