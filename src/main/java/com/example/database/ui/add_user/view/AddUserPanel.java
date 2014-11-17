package com.example.database.ui.add_user.view;

import com.example.database.dao.TextsDao;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;

/**
 * author: Bartek
 */
public class AddUserPanel extends JPanel {

    private JTextField nameTF;
    private JTextField surnameTF;
    private JDateChooser birthdateDC;
    private JTextField salaryTF;

    private JButton addButton;
    private JButton cancelButton;

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

        nameTF = new JTextField();
        surnameTF = new JTextField();
        birthdateDC = new JDateChooser();
        salaryTF = new JTextField();

        addButton = new JButton(TextsDao.getText("buttonsPanel.addButton"));
        cancelButton = new JButton(TextsDao.getText("buttonsPanel.cancelButton"));

        add(nameLbl);
        add(nameTF);
        add(surnameLbl);
        add(surnameTF);
        add(birthdateLbl);
        add(birthdateDC);
        add(salaryLbl);
        add(salaryTF);
        add(addButton);
        add(cancelButton);
    }

    public JButton getCancelButton() {
        return cancelButton;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JTextField getSalaryTF() {
        return salaryTF;
    }

    public JDateChooser getBirthdateDC() {
        return birthdateDC;
    }

    public JTextField getSurnameTF() {
        return surnameTF;
    }

    public JTextField getNameTF() {
        return nameTF;
    }
}
