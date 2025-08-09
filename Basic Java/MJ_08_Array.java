import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

public class MJ_08_Array {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);



         // 1. String Method..
        // 1) Concatenate Strings
        String fname = "Muhammad";
        String Mname = "Javed";
        String lname = "Khan";
        String full_name = fname + " " + Mname + " " + lname;
        System.out.println(full_name);


        String name = "Muhammad Javed";
        System.out.println(name.length());

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));

        String new_name = name.replace("Javed", "Ayan");
        System.out.println(new_name);
        System.out.println(name.substring(3, 9));


        // 2. Arrays....
        // 1) Declaration of Array
        int[] numbers = new int[5];
        boolean[] boolean_array = new boolean[5];
        float[] float_array = { 12.45f, 23.67f, 34.00f, 67.45f, 90.09f };
        System.out.println(Arrays.toString(float_array));
        System.out.println(float_array.length);
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println(numbers[0]);
        System.out.println(numbers);

        // 2.1D Arrays Methods

        // 1) Arrays.sort()
        int[] numbers1 = { 20, 10, 50, 40, 30 };
        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));



        // 2) Arrays.binarySearch()
        int[] numbers2 = { 10, 20, 30, 40, 50 };
        int index = Arrays.binarySearch(numbers2, 30);
        System.out.println(index);



        // 3) Arrays.fill()
        int[] numbers3 = { 10, 20, 30, 40, 50 };
        Arrays.fill(numbers3, 100);
        System.out.println(Arrays.toString(numbers3));


        // 4) Arrays.copyOf()
        int[] numbers4 = { 10, 20, 30, 40, 50 };
        int[] numbers5 = Arrays.copyOf(numbers4, 10);
        System.out.println(Arrays.toString(numbers5));


        // 2D Array Method...
        // 1) Arrays.sort()
        int[][] marks = { { 23, 56, 87, 56, 89 }, { 34, 57, 98, 76, 43 }, { 12, 34, 56, 78, 90 } };
        System.out.println(Arrays.deepToString(marks));
        System.out.println(marks[2][3]);
        System.out.println(marks[2][0]);
        
        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
