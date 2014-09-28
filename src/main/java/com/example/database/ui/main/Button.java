package com.example.database.ui.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

/**
 * author: Bartek
 */
public class Button extends JButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public Button() {

        addActionListener(this);
        setBackground(Color.yellow);

    }
}
