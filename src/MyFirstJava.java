import java.util.Scanner;

public class MyFirstJava {
    public static void main (String args[]){
        System.out.println("Welcome to my world!");
        System.out.println("My name is Efrem.");

        Scanner keyboard = new Scanner (System.in);
        System.out.println("Whats your name?");
        String userResponse = keyboard.nextLine();
        System.out.println("Your name is "+ userResponse);

        System.out.println("What is the first number that you want to add?");
        int firstNo = keyboard.nextInt();
        System.out.println("What is the second number that you want to add?");
        int secondNo = keyboard.nextInt();
        int sum = firstNo + secondNo;
        System.out.println("The sum of this numbers is " + sum);



    }
}
