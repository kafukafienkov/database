package com.example.database.ui.add_user.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * author: Bartek
 */
public class AddUserController {

    private JTextField nameTF;
    private JTextField surnameTF;
    private JTextField birthdateTF;
    private JTextField salaryTF;

    class SaveButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("SAVE");
        }
    }
    class CancelButtonListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Cancel");
        }
    }

    public void setNameTF(JTextField nameTF) {
        this.nameTF = nameTF;
    }

    public void setSurnameTF(JTextField surnameTF) {
        this.surnameTF = surnameTF;
    }

    public void setBirthdateTF(JTextField birthdateTF) {
        this.birthdateTF = birthdateTF;
    }

    public void setSalaryTF(JTextField salaryTF) {
        this.salaryTF = salaryTF;
    }

    public void setAddButton(JButton addButton) {
        addButton.addActionListener(new SaveButtonListener());
    }

    public void setCancelButton(JButton cancelButton) {
        cancelButton.addActionListener(new CancelButtonListener());
    }
}
