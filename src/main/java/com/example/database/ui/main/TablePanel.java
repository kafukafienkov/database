package com.example.database.ui.main;

import com.example.database.model.UserTableModel;

import javax.swing.*;
import java.awt.*;

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
