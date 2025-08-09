import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

public class MJ_04_Operator {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        
        
        
        // User Input
        System.out.println("----- Enter Two Numbers -----");
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();




        // Arithmetic Operators
        System.out.println("\n----- Arithmetic Operators -----");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));




        // Relational Operators
        System.out.println("\n----- Relational Operators -----");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));




        // Logical Operators
        System.out.println("\n----- Logical Operators -----");
        boolean cond1 = (a > 0);
        boolean cond2 = (b > 0);
        System.out.println("(a > 0) && (b > 0) : " + (cond1 && cond2));
        System.out.println("(a > 0) || (b > 0) : " + (cond1 || cond2));
        System.out.println("!(a > 0)           : " + (!cond1));



        // Bitwise Operators
        System.out.println("\n----- Bitwise Operators -----");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a    = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));




        // Assignment Operators
        System.out.println("\n----- Assignment Operators -----");
        int x = a;
        x += b;
        System.out.println("x += b : " + x);
        x -= b;
        System.out.println("x -= b : " + x);
        x *= b;
        System.out.println("x *= b : " + x);
        x /= (b == 0 ? 1 : b); // Avoid divide by zero
        System.out.println("x /= b : " + x);
        x %= (b == 0 ? 1 : b);
        System.out.println("x %= b : " + x);



        // Unary Operators
        System.out.println("\n----- Unary Operators -----");
        System.out.println("++a = " + (++a));
        System.out.println("--b = " + (--b));
        System.out.println("-a  = " + (-a));
        System.out.println("+b  = " + (+b));



        
        // Ternary Operator
        System.out.println("\n----- Ternary Operator -----");
        String result = (a > b) ? "a is greater" : "b is greater or equal";
        System.out.println("Result: " + result);

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
