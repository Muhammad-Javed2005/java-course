import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

public class MJ_01_FirstJavaProgram {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);


        System.out.println("Muhammad Javed");

        
        int a, b, result;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        result = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + result);
        



        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        
        System.out.println("Enter Your age : ");
        int age = sc.nextInt();

        System.out.println("Enter Your marks : ");
        double marks = sc.nextDouble();


        sc.nextLine(); 
        System.out.println("Enter Your address : ");
        String address = sc.nextLine();
        

        System.out.println("Enter Your phone number : ");
        String phone = sc.nextLine();

        

        System.out.println("Enter Your email : ");
        String email = sc.nextLine();
        System.out.println("Assalamu Alaikum" +  ", " + name + "!");
        System.out.println("You are " + age + " years old");
        System.out.println("Your marks are " + marks);
        System.out.println("Your address is " + address);
        System.out.println("Your Phone number is " + phone);
        System.out.println("Your Emial Address is " + email);



        // Use next()to take a word for input  and nextline() to take  a sentence  input from user
        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}