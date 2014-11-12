package com.example.database.ui.main.view;

import com.example.database.dao.TextsDao;

import javax.swing.*;


/**
 * author: Bartek
 */
public class ButtonsPanel extends JPanel {

    private JButton addButton;

    private JButton deleteButton;

    public ButtonsPanel() {
        initComponents();
    }

    private void initComponents() {
        addButton = new JButton(TextsDao
                .getText("buttonsPanel.addButton"));
        deleteButton = new JButton(TextsDao
                .getText("buttonsPanel.deleteButton"));

        add(addButton);
        add(deleteButton);
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }
}
