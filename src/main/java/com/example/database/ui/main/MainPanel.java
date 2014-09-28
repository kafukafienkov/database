package com.example.database.ui.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * author: Bartek
 */
public class MainPanel extends JPanel implements ActionListener {

    public MainPanel() {

        setLayout(new BorderLayout());
        TablePanel tablePanel = new TablePanel();
        ButtonsPanel buttonsPanel = new ButtonsPanel();
        Button addButton = new Button();
        Button deleteButton = new Button();

        buttonsPanel.add(addButton);
        buttonsPanel.add(deleteButton);

        addButton.addActionListener(this);
        deleteButton.addActionListener(this);

        add(tablePanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
