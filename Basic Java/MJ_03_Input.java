import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

public class MJ_03_Input {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        System.out.print("Enter your grade:");
        char grade = sc.next().charAt(0);
        System.out.print("Enter your marks: ");
        float marks = sc.nextFloat();
        System.out.print("Enter your percentage : ");
        double percentage = sc.nextDouble();
        System.out.println("As-salāmu ʿalaykum " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your grade is " + grade);
        System.out.println("You obtained marks in exam is " + marks);
        System.out.println("Your Percentage is " + percentage);
            


        

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
