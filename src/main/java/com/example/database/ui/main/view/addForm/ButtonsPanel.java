package com.example.database.ui.main.view.addForm;

import com.example.database.dao.TextsDao;

import javax.swing.*;

/**
 * author: Bartek
 */
public class ButtonsPanel extends JPanel {

    private JButton okButton;

    private JButton cancelButton;

    public ButtonsPanel() {

        initComponents();
    }

    private void initComponents() {
        okButton = new JButton(TextsDao
                .getText("buttonsPanel.okButton"));
        cancelButton = new JButton(TextsDao
                .getText("buttonsPanel.cancelButton"));
    }

    public JButton getOkButton() {
        return okButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }
}
