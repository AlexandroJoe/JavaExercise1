import java.util.Scanner;

public class Fourteen {
    public static void main (String[] args){
        Scanner second = new Scanner(System.in); //use scanner to get user input
        System.out.println("Enter duration in seconds: "); //print question for user

        int mysecond = second.nextInt(); //put user input to new variable

        int hour = mysecond / 3600; // divide the user input to 3600, set the data type to int, so no decimals
        int mHour = mysecond % 3600; // get the modulo of the fraction to use it with minute formula
        int minute = mHour / 60; // divide the modulo to 60, set data type to int to get int, so no decimals
        int newsecond = mysecond % 60; // get the modulo and set it to second
        

        
        if (hour > 0){
            if (minute > 0){ 
                if (newsecond > 0){ 
                    System.out.println(hour + " hour " + minute + " minute " + newsecond + " second"); // print format if the input have hour, minute, and second
                } else {
                    System.out.println(hour + " hour " + minute + " minute " ); // print format if the input have hour and minute
                }
            } else { 
                if (newsecond > 0){
                    System.out.println(hour + " hour " + newsecond + " second"); // print format if the input have hour and second
                } else {
                    System.out.println(hour + " hour" ); // print format if the input has only hour
                }
            }

        }
        else{
            //hour == 0
            if (minute > 0){
                if (newsecond > 0){
                    System.out.println(minute + " minute" + newsecond + " second"); // print format if the input has minute and second
                } else {
                    System.out.println(minute + " minute");  // print format if the input has only minute
                }
            } else {
                if (newsecond > 0){
                    System.out.println(newsecond + " second");  // print format if the input has only second
                }
            }
        }
        }
        
    }

