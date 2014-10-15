package com.example.database.ui.main.view;

import com.example.database.ui.main.model.UserTableModel;

import javax.swing.*;

/**
 * author: Bartek
 */
public class TablePanel extends JPanel {

    public TablePanel() {
        initComponents();
    }

    private void initComponents() {
        UserTableModel model = new UserTableModel();
        JTable usersTable = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(usersTable);
        add(scrollPane);
    }
}
