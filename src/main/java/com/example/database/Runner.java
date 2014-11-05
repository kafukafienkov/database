package com.example.database;

import com.example.database.ui.add_user.view.AddUserFrame;
import com.example.database.ui.main.view.MainFrame;

import javax.swing.*;
import java.awt.*;

/**
 * author: Bartek
 */
public class Runner {

    public static void main(String[] args) {
        changeLookAndFeel();

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
//                MainFrame frame = new MainFrame();
//                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//                frame.setVisible(true);
                AddUserFrame addUserFrame = new AddUserFrame();
                addUserFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                addUserFrame.setVisible(true);

            }
        });
    }

    private static void changeLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

