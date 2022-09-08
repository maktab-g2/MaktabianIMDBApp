package ir.maktab.repository;

import ir.maktab.model.entity.User;

import java.sql.*;

public class UserRepository {
    public boolean insertNewUser(User user) throws SQLException {
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
    public boolean checkExistUser(String username, String password) throws SQLException {
        Connection connection = ApplicationConstant.getConnection();
        String selectQuery = "SELECT user_name, pass_word FROM user WHERE user_name = ? AND pass_word = ?";
        PreparedStatement preparedStatement = ApplicationConstant.getConnection().prepareStatement(selectQuery);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next() == false)
            return false;
        return true;

    }
}
