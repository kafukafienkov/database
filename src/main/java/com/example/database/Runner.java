package com.example.database;

import com.example.database.dao.UserDao;
import com.example.database.model.User;

import java.util.Date;
import java.util.List;

/**
 * author: Bartek
 */
public class Runner {

    public static void main(String[] args) {
        saveUser();
        findAllUsers();
    }

    private static void saveUser() {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setName("Jan");
        user.setSurname("Nowak");
        user.setBirthdate(new Date());
        user.setSalary(15000);

        userDao.saveUser(user);
    }

    private static void findAllUsers() {
        UserDao userDao = new UserDao();
        List<User> users = userDao.findAll();

        for (User user : users) {
            System.out.println(user);
        }
    }
}
