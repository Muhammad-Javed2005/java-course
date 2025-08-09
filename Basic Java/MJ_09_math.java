import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

public class MJ_09_math {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);




               // Integers .....

        int a = 34;
        int b = 89;
        int sum = a + b;
        int sub = a - b;
        int multi = a * b;
        int div = b / a;
        int remain = a % b; 
        


//         Format	Type
//         %d -->	integer
//         %f -->	float/double
//         %s -->	string
//         %c -->	character
//         %b -->	boolean


        System.out.printf("\nAddition of a and b  = %d , \nSubraction of a and b = %d , \nMutiplication of a and b = %d ,\nDivision of b by a  = %d , \nRemainder of b %% a = %d " , sum , sub , multi , div , remain  );
        System.out.println("This program is developed by Engr. Muhammad Javed");
        



        // Float ....
        // %.2f, %.3f, etc. format specifiers ka use kar ke decimal values ko control kar sakte ho.
        float x = 34.5f;
        float y = 89.25f;



        float sum1 = x + y;
        float sub1 = x - y;
        float multi1 = x * y;
        float div1 = y / x;
        float remain1 = y % x;

        System.out.printf("\nAddition of a and b      = %.2f", sum1);
        System.out.printf("\nSubtraction of a and b   = %.2f", sub1);
        System.out.printf("\nMultiplication of a and b= %.2f", multi1);
        System.out.printf("\nDivision of b by a       = %.2f", div1);
        System.out.printf("\nRemainder of b %% a       = %.2f", remain1);




        // Double .....
        double m = 34.5;
        double n = 89.25;

        double  sum2 = m + n;
        double  sub2 = m - n;
        double  multi2 = m * n;
        double  div2 = n / m;
        double  remain2 = n % m;

        System.out.printf("\nAddition of a and b      = %.2f", sum2);
        System.out.printf("\nSubtraction of a and b   = %.2f", sub2);
        System.out.printf("\nMultiplication of a and b= %.2f", multi2);
        System.out.printf("\nDivision of b by a       = %.2f", div2);
        System.out.printf("\nRemainder of b %% a       = %.2f", remain2);


        // Increment and Decrement Operators
        int o = 10;

        System.out.println("Value of o before increment: " + o);
        o++;
        System.out.println("Value of o after increment: " + o);
        System.out.println("Value of o before decrement: " + o);
        o--;
        System.out.println("Value of o after decrement: " + o);


        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
