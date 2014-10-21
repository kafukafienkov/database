package com.example.database.dao;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * author: Bartek
 */
public class TextsDao {

    public static String getText(String key) {
        Locale locale = Locale.getDefault();
        ResourceBundle bundle = ResourceBundle.getBundle("texts", locale);
        return bundle.getString(key);
    }
}
