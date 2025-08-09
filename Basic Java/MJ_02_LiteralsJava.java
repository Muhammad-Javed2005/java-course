import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

public class MJ_02_LiteralsJava {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        int age = 34;
        char c = 'J';
        float number = 45.67f;
        double d = 45.67D;
        long emd = 4457864356l;

        System.out.println("IMPLICIT CASTING");

        byte b = 10;
        short s = b;           // byte → short
        int i = s;             // short → int
        long l = i;            // int → long
        float f = l;           // long → float
        double df = f; // float → double
        
        System.out.println("byte to short: " + s);
        System.out.println("short to int: " + i);
        System.out.println("int to long: " + l);
        System.out.println("long to float: " + f);
        System.out.println("float to double: " + df);



        System.out.println("EXPLICIT CASTING");



        double d2 = 123.456;
        float f2 = (float) d2;         // double → float
        long l2 = (long) f2;           // float → long
        int i2 = (int) l2;             // long → int
        short s2 = (short) i2;         // int → short
        byte b2 = (byte) s2;
        
        System.out.println("double to float: " + f2);
        System.out.println("float to long: " + l2);
        System.out.println("long to int: " + i2);
        System.out.println("int to short: " + s2);
        System.out.println("short to byte: " + b2);

        System.out.println("CHAR AND INT CASTING");
        char c= 'A';
        int cInt = c;                  // char → int (implicit)
        char c2 = (char) (cInt + 1);   // int → char (explicit)

        System.out.println("char to int: " + cInt);
        System.out.println("int to char (A+1): " + c2);

        
        System.out.println("MIXED CASTING");
        int x = 100;
        double y = 23.5;
        double result = x + y;         // int → double (implicit)
        int z = (int) result;          // double → int (explicit)

        System.out.println("int + double = " + result);
        System.out.println("double to int = " + z);


        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
