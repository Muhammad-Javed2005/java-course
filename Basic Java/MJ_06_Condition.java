import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

public class MJ_06_Condition {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
         System.out.println("Now Sun is up  or down ? :");
        boolean a = sc.nextBoolean();
        if (a == true) {
            System.out.println("Sun is up ");
            System.out.println("Now its day...");
        } else {
            System.out.println("Sun is down");
            System.out.println("Now its night...");
        }

        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }



        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();
        if (marks >= 40 && name == "Javed")
        {
            System.out.println("You are passed");
        }
        else if (marks > 33 || name == "Samia")
        {
            System.out.println("You are passed but gain more marks");

        }
        else if (marks >= 40 && ((name != "Samia" || name != "Javed")))
        {
            System.out.println("You are passed but not gain position");
        }
        else
        {
            System.out.println("You are failed");
        }


        // Switch Case 
        System.out.println("Enter your choice:");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Today is Monday");
                break;

            case 2:
                System.out.println("Today is Tuesday");
                break;

            case 3:
                System.out.println("Today is Wednesday");
                break;

            case 4:
                System.out.println("Today is Thursday");
                break;

            case 5:
                System.out.println("Today is Friday");
                break;

            case 7:
                System.out.println("Today is Saturday");
                break;

            default:
                System.out.println("Invalid day");
        }

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
