package calculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");
        int choice;
        int x, y,s;
        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("1. addition");
            System.out.println("2. substraction");
            System.out.println("3. multiplication");
            System.out.println("4. division");
            System.out.println("5. exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    x=sc.nextInt();
                    y=sc.nextInt();
                    System.out.println(x + y);
                    break;
                case 2:
                    x=sc.nextInt();
                    y=sc.nextInt();
                    System.out.println(x - y);
                    break;
                case 3:
                    x=sc.nextInt();
                    y=sc.nextInt();
                    System.out.println(x * y);
                    break;
                case 4:
                    x=sc.nextInt();
                    y=sc.nextInt();
                    try {
                        s = x / y;
                    }
                    catch(ArithmeticException e) {
                        System.out.println("2nd no. zero");
                        y = sc.nextInt();
                        s = x / y;
                    }
                    System.out.println("Division "+s);
                    break;
                case 5:
                    System.exit(0);
            }

        }
    }
}
