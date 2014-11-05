package com.example.database.ui.main.controller;

import com.example.database.dao.TextsDao;
import com.example.database.ui.main.model.UserTableModel;
import com.example.database.ui.add_user.view.AddUserFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * author: Bartek
 */
public class UserController {

    private JTable usersTable;

    public void addListenerToAddBtn(JButton addBtn) {
        addBtn.addActionListener(new AddButtonListener());
    }

    public void addListenerToDeleteBtn(JButton deleteBtn) {
        deleteBtn.addActionListener(new DeleteButtonListener());
    }

    public void setUsersTable(JTable usersTable) {
        this.usersTable = usersTable;
    }

    private class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            AddUserFrame addUserFrame = new AddUserFrame();
            addUserFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            addUserFrame.setVisible(true);
        }
    }

    private class DeleteButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedRow = usersTable.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, TextsDao.getText("userController.noRowSelected"));
            } else {
                UserTableModel tableModel = (UserTableModel) usersTable.getModel();
                tableModel.deleteRow(selectedRow);
            }
        }
    }
}
