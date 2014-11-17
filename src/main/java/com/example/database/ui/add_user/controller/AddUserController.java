package com.example.database.ui.add_user.controller;

import com.example.database.dao.UserDao;
import com.example.database.model.User;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * author: Bartek
 */
public class AddUserController {

    private JTextField nameTF;
    private JTextField surnameTF;
    private JDateChooser birthdateTF;
    private JTextField salaryTF;

    class SaveButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = nameTF.getText();
            String surname = surnameTF.getText();
            Date birthdate = birthdateTF.getDate();
            double salary = Double.parseDouble(salaryTF.getText());

            User user = new User();
            user.setName(name);
            user.setSurname(surname);
            user.setBirthdate(birthdate);
            user.setSalary(salary);

            UserDao.saveUser(user);

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

    public void setBirthdateTF(JDateChooser birthdateTF) {
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
