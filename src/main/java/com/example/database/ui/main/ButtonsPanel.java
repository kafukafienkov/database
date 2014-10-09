package com.example.database.ui.main;

import com.example.database.dao.TextsDao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * author: Bartek
 */
public class ButtonsPanel extends JPanel {

    public ButtonsPanel() {
        initComponents();
    }

    private void initComponents() {
        JButton addButton = new JButton(TextsDao
                .getText("buttonsPanel.addButton"));
        JButton deleteButton = new JButton(TextsDao
                .getText("buttonsPanel.deleteButton"));

        addButton.addActionListener(new AddButtonListener());
        deleteButton.addActionListener(new DeleteButtonListener());

        add(addButton);
        add(deleteButton);
    }

    class AddButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Kliknięto przycisk Dodaj");
        }
    }

    private class DeleteButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Kliknięto przycisk Usuń");
        }
    }
}
