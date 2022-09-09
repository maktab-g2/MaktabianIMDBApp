package ir.maktab.repository;

import ir.maktab.model.entity.User;

import java.sql.*;

public class UserRepository {
    private static UserRepository userRepository;
    private UserRepository() {
    }

    public static UserRepository getInstance(){
        if(userRepository == null){
            userRepository = new UserRepository();
        }
        return userRepository;
    }

    public boolean insert(User user) throws SQLException {
        Connection connection = ApplicationConstant.getConnection();
        String insertQuery = "INSERT INTO \"user\" (user_name, paas_word, age, mobile_number, email)" +
                " VALUES (?, ?, ?, ?, ?)";
        PreparedStatement prepareStatement = connection.prepareStatement(insertQuery);
        prepareStatement.setString(1, user.getUserName());
        prepareStatement.setString(2, user.getPassword());
        prepareStatement.setInt(3, user.getAge());
        prepareStatement.setString(4, user.getMobileNumber());
        prepareStatement.setString(5, user.getEmail());
        prepareStatement.executeUpdate();
        connection.close();
        return true;
    }

    public boolean isUserExist(String username, String password) throws SQLException {
        Connection connection = ApplicationConstant.getConnection();
        String selectQuery = "SELECT user_name, pass_word FROM user WHERE user_name = ? AND pass_word = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.next();
    }

    public boolean isUserNameExist(String username) throws SQLException {
        Connection connection = ApplicationConstant.getConnection();
        String selectQuery = "SELECT user_name FROM user WHERE user_name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
        preparedStatement.setString(1, username);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.next();
    }


}
