package com.example.database.ui;

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
        setTitle("Tabela użytkowników");
        setSize(700, 400);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void initComponents() {
        MainPanel mainPanel = new MainPanel();
        add(mainPanel);
    }
}

