package ir.maktab;

import ir.maktab.model.entity.User;
import ir.maktab.service.FilmServiceImpl;
import ir.maktab.service.UserServiceImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class MainHelper {
    public static Scanner scanner = new Scanner(System.in);

    public static void showMenu() throws SQLException {
        UserServiceImpl userService = UserServiceImpl.getInstance();
        FilmServiceImpl filmService = FilmServiceImpl.getInstance();

        boolean flag = true;
        while (flag) {
            System.out.println("Enter your choice :");
            System.out.println("1. sign up" + "\n 2. sign in");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    User user = new User();
                    System.out.println("enter your userName:");
                    String userName = scanner.nextLine();
                    if (userService.isExistUser(userName)) {
                        user.setUserName(userName);
                        System.out.println("enter your password:");
                        String password = scanner.nextLine();
                        if (userService.validPassword(password)) {
                            user.setPassword(password);
                            System.out.println("enter your age");
                            user.setAge(Integer.parseInt(scanner.nextLine()));
                            System.out.println("enter your mobile");
                            user.setMobileNumber(scanner.nextLine());
                            System.out.println("enter your email");
                            String email = scanner.nextLine();
                            if (userService.validEmail(email))
                                user.setEmail(email);
                        }
                    }
                    break;
            }

        }
    }
}
