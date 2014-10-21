package com.example.database.ui.main.view;

import javax.swing.*;
import java.awt.*;

/**
 * author: Bartek
 */
public class MainPanel extends JPanel {

    private TablePanel tablePanel;

    private ButtonsPanel buttonsPanel;

    public MainPanel() {

        setPanelUp();
        initComponents();
    }

    private void setPanelUp() {
        setLayout(new BorderLayout());
    }

    private void initComponents() {
        tablePanel = new TablePanel();
        buttonsPanel = new ButtonsPanel();

        add(tablePanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);
    }

    public TablePanel getTablePanel() {
        return tablePanel;
    }

    public ButtonsPanel getButtonsPanel() {
        return buttonsPanel;
    }
}
