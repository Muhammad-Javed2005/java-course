import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

public class MJ_02_PracticeSet {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        



        // Square Pattern with Numbers
        System.out.println("Square Pattern with Numbers!");
        System.out.print("Enter your pattern size: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }



        // Square Pattern with Stars
        System.out.println("Square Pattern with Stars!");
        System.out.print("Enter your pattern size: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }





        // Square Pattern with Alphabets
        System.out.println("Square Pattern with Alphabets!");
        System.out.print("Enter your pattern size: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }





        // Square Pattern with Increasing Numbers
        System.out.println("Square Pattern with Increasing Numbers!");
        System.out.print("Enter your pattern size: ");
        n = sc.nextInt();
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d ", num++);
            }
            System.out.println();
        }





        // Square Pattern with Increasing Alphabets
        System.out.println("Square Pattern with Increasing Alphabets!");
        System.out.print("Enter your pattern size: ");
        n = sc.nextInt();
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4c ", ch++);
            }
            System.out.println();
        }



        // Triangle Pattern with Stars
        System.out.println("Triangle Pattern with Stars!");
        System.out.print("Enter your pattern size: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }



        // Triangle Pattern with Same Number per Line
        System.out.println("Triangle Pattern with Same Number per Line!");
        System.out.print("Enter your pattern size: ");
        n = sc.nextInt();
        num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%3d", num);
            }
            System.out.println();
            num++;
        }




        // Triangle Pattern with Increasing Numbers per Line
        System.out.println("Triangle Pattern with Increasing Numbers!");
        System.out.print("Enter your pattern size: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%3d", num++);
            }
            System.out.println();
        }




        // Triangle Pattern with Same Alphabet per Line
        System.out.println("Triangle Pattern with Same Alphabet per Line!");
        System.out.print("Enter your pattern size: ");
        n = sc.nextInt();
        ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%3c", ch);
            }
            ch++;
            System.out.println();
        }




        // Triangle Pattern with Increasing Alphabets per Line
        System.out.println("Triangle Pattern with Increasing Alphabets!");
        System.out.print("Enter your pattern size: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.printf("%3c", ch++);
            }
            System.out.println();
        }




        // Reverse Triangle Pattern with Numbers
        System.out.println("Reverse Triangle Pattern with Numbers!");
        System.out.print("Enter your pattern size: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j > 0; j--) {
                System.out.printf("%3d", j);
            }
            System.out.println();
        }




        // Reverse Triangle Pattern with Alphabets
        System.out.println("Reverse Triangle Pattern with Alphabets!");
        System.out.print("Enter your pattern size: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }




        // Floyd's Triangle with Numbers
        System.out.println("Floyd's Triangle with Numbers!");
        System.out.print("Enter your pattern size: ");
        n = sc.nextInt();
        num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%3d", num++);
            }
            System.out.println();
        }




        // Floyd's Triangle with Alphabets
        System.out.println("Floyd's Triangle with Alphabets!");
        System.out.print("Enter your pattern size: ");
        n = sc.nextInt();
        ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%3c", ch++);
            }
            System.out.println();
        }





        // Inverse Triangle with Numbers
        System.out.println("Inverse Triangle with Numbers!");
        System.out.print("Enter your pattern size: ");
        n = sc.nextInt();
        num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(num);
            }
            num++;
            System.out.println();
        }





        // Inverse Triangle with Alphabets
        System.out.println("Inverse Triangle with Alphabets!");
        System.out.print("Enter your pattern size: ");
        n = sc.nextInt();
        ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }





        sc.close();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}