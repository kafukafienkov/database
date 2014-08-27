package com.example.database.dao;

import java.util.ResourceBundle;

/**
 * author: Bartek
 */
public class TextsDao {

    public static String getText(String key) {
        ResourceBundle bundle = ResourceBundle.getBundle("texts");
        return bundle.getString(key);
    }
}
