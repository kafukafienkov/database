package com.example.database.ui.main.view;

import com.example.database.ui.main.model.UserTableModel;

import javax.swing.*;

/**
 * author: Bartek
 */
public class TablePanel extends JPanel {

    private JTable usersTable;

    public TablePanel() {
        initComponents();
    }

    private void initComponents() {
        UserTableModel model = new UserTableModel();
        usersTable = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(usersTable);
        add(scrollPane);
    }

    public JTable getUsersTable() {
        return usersTable;
    }
}
