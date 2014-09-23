package com.example.database;

import com.example.database.ui.main.MainFrame;

import javax.swing.*;
import java.awt.*;

/**
 * author: Bartek
 */
public class Runner {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame frame = new MainFrame();
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });

    }
}

