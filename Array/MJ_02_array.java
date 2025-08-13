import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.net.Socket;
import java.util.Arrays;

public class MJ_02_array {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");

        int size = sc.nextInt();
        int num[] = new int[size];
        System.out.println("Enter value of x to find in array: ");
        int x = sc.nextInt();

        for (int i : num) {
            
        }
        
        for (int i = 0; i < num.length; i++) 
        {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (x == num[i]) {
                System.out.println("X found at index " + i);
            }
        }
        

        int[] mark = { 12, 46, 76, 87, 65, 43, 45, 78, 98 };
        float[] percentage = { 23.665f, 76.90f, 90.78f, 78.56f };
        String[] name = { "Javed", "Zunaira", "Ayan", "Ghulam" };
        System.out.println(Arrays.toString(mark));
        for (float i : percentage) 
        {
            System.out.println(i);
        }
        for (String string : name) 
        {
            System.out.println(string);
        }
        
        
        int[][] marks = { { 23, 56, 87, 56, 89 }, { 34, 57, 98, 76, 43 }, { 12, 34, 56, 78, 90 } };
        System.out.println(Arrays.deepToString(marks));
        System.out.println(marks[2][3]);
        System.out.println(marks[2][0]);

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
