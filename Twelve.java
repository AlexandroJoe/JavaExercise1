import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        System.out.println("number" + "   square" + "   cube");
        for (int i = 0; i <= 10; i++ ) { // using for loop until 10 to make 1 rows
            System.out.println(i + "         " + i*i + "         " + i*i*i); // make the spacin, square, and cube calculation
        }
    }
}