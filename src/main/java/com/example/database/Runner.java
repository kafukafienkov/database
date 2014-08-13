package com.example.database;

import com.example.database.dao.UserDao;
import com.example.database.model.User;

import java.util.List;

/**
 * author: Bartek
 */
public class Runner {

    public static void main(String[] args) {

        UserDao userDao = new UserDao();
        List<User> users = userDao.findAll();

        for (User user : users) {
            System.out.println(user);
        }

    }
}
