package com.example.database.ui.main.view.addForm;

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
        setTitle(TextsDao.getText("addForm.mainTitle"));
        setSize(300, 200);
        setLocationRelativeTo(null);
        setResizable(true);
    }

    private void initComponents() {

    }
}
