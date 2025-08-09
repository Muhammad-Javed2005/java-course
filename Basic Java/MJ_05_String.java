import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

public class MJ_05_String {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);


        String name = "Muhammad Javed";
        String name2 = "               Javed          ";


        System.out.println(name);

        int value = name.length();

        System.out.println(value);

        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());

        System.out.println(name2);

        
        System.out.println(name2.trim());
        
        System.out.println(name.substring(3));
        
        System.out.println(name.substring(4, 10));
        
        System.out.println(name.replace("Javed", "Anus"));
        
        
        System.out.println(name.startsWith("Muh"));
        
        System.out.println(name.endsWith("ed"));
        
        System.out.println(name.charAt(5));
        
        System.out.println(name.indexOf("Jav"));
        
        System.out.println(name.indexOf("Jav", 10));
        
        System.out.println(name.equals(name2));

        System.out.println(name.equalsIgnoreCase(name2.trim()));





        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
