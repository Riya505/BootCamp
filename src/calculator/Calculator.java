package calculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");
        int choice;
        int x, y;

        while (true) {
            System.out.println("1. addition");
            System.out.println("2. substraction");
            System.out.println("3. multiplication");
            System.out.println("4. division");
            System.out.println("5. exit");
            Scanner sc=new Scanner(System.in);
            choice = sc.nextInt();
            x=sc.nextInt();
            y=sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(x + y);
                    break;
                case 2:
                    System.out.println(x - y);
                    break;
                case 3:
                    System.out.println(x * y);
                    break;
                case 4:
                    System.out.println(x / y);
                    break;
                case 5:
                    System.exit(0);
            }

        }
    }
}
