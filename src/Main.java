import ir.maktab.repository.UserRepository;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserRepository userRepository = new UserRepository();
        System.out.println(userRepository.isUserExist("reihaneh", "rm123456"));

    }
}
