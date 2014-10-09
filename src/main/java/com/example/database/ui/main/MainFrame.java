package com.example.database.ui.main;

import com.example.database.dao.TextsDao;

import javax.swing.*;

/**
 * author: Bartek
 */
public class MainFrame extends JFrame {

    public MainFrame() {
        frameSetup();
        initComponents();
    }

    private void frameSetup() {
        setTitle(TextsDao.getText("main.title"));
        setSize(500, 300);
        setLocationRelativeTo(null);
        setResizable(false);

    }

    private void initComponents() {
        MainPanel mainPanel = new MainPanel();
        add(mainPanel);
    }
}

