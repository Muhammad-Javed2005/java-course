import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

public class MJ__01Practice_Set {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        // Question no 01:
        System.out.print("Enter number of rows of pattern : ");
        int n = sc.nextInt();
        System.out.print("Enter number of column of pattern :");
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        


        // Question no 02:
        System.out.print("Enter number of rows of pattern : ");
        int n1 = sc.nextInt();
        System.out.print("Enter number of column of pattern :");
        int m1 = sc.nextInt();

        for (int i = 1; i <= n1; i++) 
        {
            if (i == 1 || i == n1) {
                for (int j = 1; j <= m1; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j <= m1 - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        


        // Question no 03:
        System.out.print("Enter number of rows of pattern : ");
        int n2 = sc.nextInt();

        for (int i = 0; i <= n2; i++) 
        {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         


        // Question no 04:
        System.out.print("Enter number of rows of pattern : ");
        int n3 = sc.nextInt();

        for (int i = n3; i >= 0; i--) 
        {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        

        // Question no 05:
        System.out.print("Enter number of rows of pattern : ");
        int n4 = sc.nextInt();
        for (int i = 1; i <= n4; i++) 
        {
            for (int j = 1; j <= n4 - i; j++) 
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("*");
            }
            
            System.out.println();
        }

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
