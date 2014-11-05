package com.example.database.ui.add_user.view;

import com.example.database.dao.TextsDao;

import javax.swing.*;
import java.awt.*;

/**
 * author: Bartek
 */
public class AddUserPanel extends JPanel {

    public AddUserPanel() {
        setPanelUp();
        initComponents();
    }

    private void setPanelUp() {
        setLayout(new GridLayout(5, 2, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }

    public void initComponents() {
        JLabel nameLbl = new JLabel(TextsDao.getText("addPanel.nameLbl"));
        JLabel surnameLbl = new JLabel(TextsDao.getText("addPanel.surnameLbl"));
        JLabel birthdateLbl = new JLabel(TextsDao.getText("addPanel.dobLbl"));
        JLabel salaryLbl = new JLabel(TextsDao.getText("addPanel.salaryLbl"));

        JTextField nameTF = new JTextField();
        JTextField surnameTF = new JTextField();
        JTextField birthdateTF = new JTextField();
        JTextField salaryTF = new JTextField();

        add(nameLbl);
        add(nameTF);
        add(surnameLbl);
        add(surnameTF);
        add(birthdateLbl);
        add(birthdateTF);
        add(salaryLbl);
        add(salaryTF);
    }
}
