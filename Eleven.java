public class Eleven {
    public static void main (String[] args){
       int x, y; //initialize the variable and each value
       x = 10;
       y = 5;

       int a = x = 10; // using a as thee "bridge" to switch the variable
       x = y; 
       y = a;

       System.out.print("New x: " + x + " New y: " + y);
    }
}
