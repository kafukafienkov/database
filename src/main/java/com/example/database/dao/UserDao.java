package com.example.database.dao;

import com.example.database.model.User;
import com.example.database.util.Const;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Korzystamy ze wzorca Data Access Object
 * author: Bartek
 */
public class UserDao {

    public List<User> findAll() {
        List<User> users = new ArrayList<User>();

        try {
            Class.forName(Const.DB_DRIVER);
            Connection connection = DriverManager.getConnection(
                    Const.DB_URL, Const.DB_USER, Const.DB_PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM user_info");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                java.util.Date birthdate = rs.getDate("birthdate");
                double salary = rs.getDouble("salary");

                User user = new User();
                user.setId(id);
                user.setName(name);
                user.setSurname(surname);
                user.setBirthdate(birthdate);
                user.setSalary(salary);

                users.add(user);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public void saveUser(User user) {
        try {
            Class.forName(Const.DB_DRIVER);
            Connection connection = DriverManager.getConnection(
                    Const.DB_URL, Const.DB_USER, Const.DB_PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT nextval('user_info_id_seq)");
            resultSet.next();
            int id = resultSet.getInt(1);

            String query = "INSERT INTO user_info VALUES (?, ?, ?, ?, ?)";
            PreparedStatement prepStat = connection.prepareStatement(query);
            prepStat.setLong(1, id);
            prepStat.setString(2, user.getName());
            prepStat.setString(3, user.getSurname());
            java.util.Date birthdate = user.getBirthdate();
            prepStat.setDate(4, new java.sql.Date(birthdate.getTime()));
            prepStat.setDouble(5, user.getSalary());
            prepStat.execute();
            prepStat.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
