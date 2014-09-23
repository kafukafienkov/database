package com.example.database.ui.main;

import javax.swing.*;
import java.awt.*;

/**
 * author: Bartek
 */
public class MainPanel extends JPanel {

    public MainPanel() {

        setLayout(new BorderLayout());
        TablePanel tablePanel = new TablePanel();
        ButtonsPanel buttonsPanel = new ButtonsPanel();

        add(tablePanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);
    }
}
