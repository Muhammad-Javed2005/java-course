import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

public class MJ_03_PracticeSet {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        int n;





        // ... (previous patterns remain unchanged)

        // Pyramid Pattern with Numbers
        System.out.println("Pyramid Pattern with Numbers!");
        System.out.print("Enter your pattern size: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) System.out.print(" ");
            int num = 1;
            for (int j = 1; j <= i + 1; j++) System.out.print(num++);
            int num1 = i;
            for (int j = i; j >= 1; j--) System.out.print(num1--);
            System.out.println();
        }

        // Pyramid Pattern with Alphabets
        System.out.println("Pyramid Pattern with Alphabets!");
        System.out.print("Enter your pattern size: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            char num = 'A';
            for (int j = 1; j <= i + 1; j++)
                System.out.print(num++);
            char num1 = (char) (num - 2);
            for (int j = i; j >= 1; j--)
                System.out.print(num1--);
            System.out.println();
        }

        


        // Hollow Diamond Pattern
        System.out.println("Hollow Diamond Pattern!");
        System.out.print("Enter your pattern size: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) System.out.print(" ");
            System.out.print("*");
            if (i != 0) {
                for (int j = 0; j < 2 * i - 1; j++) System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print(" ");
            System.out.print("*");
            if (i != (n - 2)) {
                for (int j = 0; j < 2 * (n - i) - 5; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }

        




        // Butterfly Pattern
        System.out.println("Butterfly Pattern!");
        System.out.print("Enter your pattern size: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) System.out.print("*");
            for (int j = 0; j < 2 * (n - i - 1); j++) System.out.print(" ");
            for (int j = 0; j < i + 1; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < i + 1; j++)
                System.out.print("*");
            for (int j = 0; j < 2 * (n - i - 1); j++)
                System.out.print(" ");
            for (int j = 0; j < i + 1; j++)
                System.out.print("*");
            System.out.println();
        }
        




        // 
        System.out.println("Enter number of pattern : ");
        int n5 = sc.nextInt();
        for (int i = 1; i <= n5; i++) 
        {
            for (int j = 1; j <= n5-i; j++) 
            {
                System.out.print(" ");   
            }
            for (int j = 1; j <= n5; j++)
            {
                char ch = '*';
                System.out.printf("%3c" , ch);
            }
            System.out.println();
        }


        sc.close();
        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}