package com.example.database.ui.add_user.view;

import com.example.database.dao.TextsDao;
import com.example.database.ui.add_user.controller.AddUserController;

import javax.swing.*;

/**
 * author: Bartek
 */
public class AddUserFrame extends JFrame {

    public AddUserFrame() {
        setFrameUp();
        initComponents();
    }

    public void setFrameUp() {
        setTitle(TextsDao.getText("addForm.mainTitle"));

        setSize(220, 200);
        setLocationRelativeTo(null);
    }

    public void initComponents() {
        AddUserPanel addUserPanel = new AddUserPanel();
        add(addUserPanel);

        AddUserController addUserController = new AddUserController();

        addUserController.setNameTF(addUserPanel.getNameTF());
        addUserController.setSurnameTF(addUserPanel.getSurnameTF());
        addUserController.setBirthdateTF(addUserPanel.getBirthdateDC());
        addUserController.setSalaryTF(addUserPanel.getSalaryTF());
        addUserController.setAddButton(addUserPanel.getAddButton());
        addUserController.setCancelButton(addUserPanel.getCancelButton());
    }
}