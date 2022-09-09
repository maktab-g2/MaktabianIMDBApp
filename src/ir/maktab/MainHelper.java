package ir.maktab;

import java.util.Scanner;

public class MainHelper {
    public static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("Enter your choice :");
            System.out.println("1. sign up" + "\n 2. sign in");
            switch (Integer.parseInt(scanner.nextLine())){
                case 1:
                    System.out.println("enter your userName:");
                    String userName = scanner.nextLine();
                    System.out.println("enter your password:");
                    String password = scanner.nextLine();
                    break;
            }

        }
    }
}
