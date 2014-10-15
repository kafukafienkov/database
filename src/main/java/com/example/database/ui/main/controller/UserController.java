package com.example.database.ui.main.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * author: Bartek
 */
public class UserController {

    private class AddButtonListener implements ActionListener {
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

    public void addListenerToAddBtn(JButton addBtn) {
        addBtn.addActionListener(new AddButtonListener());
    }

    public void addListenerToDeleteBtn(JButton deleteBtn) {
        deleteBtn.addActionListener(new DeleteButtonListener());
    }
}
