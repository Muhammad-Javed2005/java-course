import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

public class MJ_07_loop {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
               System.out.print("Enter your number of sum: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++)
        {
            sum = sum + i;

        }
        System.out.println("Sum is " + sum);

        System.out.print("Enter your number of table: ");
        int num = sc.nextInt();

        for (int i = 1 ; i <= 10; i++) 
        {
            System.out.println(num + " x " + i + " = " + num * i);
        }



        System.out.print("Enter your number of factorial: ");
        int b = sc.nextInt();
        int fact = 1;
        int i = 1;
        while (i <= b)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial is " + fact);
         



        System.out.print("Enter your number of series :  ");
        int c = sc.nextInt();
        do
        {
            System.out.println(c);
            c--;
        }
        while (c >= 0);
        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
