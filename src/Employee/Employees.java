package Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Employees {
    public static void main(String[] args) {
        System.out.println("employee");
        int choice;
        String empName;

        ArrayList<String> empList=new ArrayList<String>();

        while(true){
            System.out.println("choose option");
            System.out.println("1. add employee");
            System.out.println("2. view employee");
            System.out.println("3. exit");
            Scanner scanner=new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("add employee name");
                    empName=scanner.next();
                    empList.add(empName);
                    break;
                case 2:
                    if(empList.size()==0){
                        System.out.println("no employee added");

                    }else {
                        System.out.println(empList);
                    }
                    break;
                case 3:
                    System.exit(0);

            }
        }
    }
}
