package com.example.database.ui.main.controller;

import com.example.database.dao.TextsDao;
import com.example.database.ui.main.model.UserTableModel;
import com.example.database.ui.main.view.addForm.MainFrame;
import com.example.database.ui.main.view.addForm.MainPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * author: Bartek
 */
public class UserController {

    private JTable usersTable;

    private class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //TODO nowe okno z formularzem dla nowego usera
            MainFrame frame = new MainFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
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

    public void addListenerToAddBtn(JButton addBtn) {
        addBtn.addActionListener(new AddButtonListener());
    }

    public void addListenerToDeleteBtn(JButton deleteBtn) {
        deleteBtn.addActionListener(new DeleteButtonListener());
    }

    public void setUsersTable(JTable usersTable) {
        this.usersTable = usersTable;
    }
}
