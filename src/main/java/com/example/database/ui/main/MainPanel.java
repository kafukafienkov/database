package com.example.database.ui.main;

import javax.swing.*;
import java.awt.*;

/**
 * author: Bartek
 */
public class MainPanel extends JPanel {

    public MainPanel() {

        setPanelUp();
        initComponents();
    }

    private void setPanelUp() {
        setLayout(new BorderLayout());
    }

    private void initComponents() {
        TablePanel tablePanel = new TablePanel();
        ButtonsPanel buttonsPanel = new ButtonsPanel();

        add(tablePanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);
    }
}
