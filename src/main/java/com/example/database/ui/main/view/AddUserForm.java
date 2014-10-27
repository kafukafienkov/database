package com.example.database.ui.main.view;

import com.example.database.dao.TextsDao;

import javax.swing.*;
import java.awt.*;

/**
 * author: Bartek
 */
public class AddUserForm {

    JFrame frame;

    JLabel nameLbl, surnameLbl, ageLbl, salaryLbl;

    JTextField nameTxt, surnameTxt, ageTxt, salaryTxt;

    JButton okBtn, cancelBtn;

    JPanel jPanel, jPanel1;

    GridLayout gl42, gl12;

    FlowLayout flowLayout;

    public AddUserForm() {

        //TODO czy można utworzyć metodę korzystającą z TextsDao.getText

        frame = new JFrame(TextsDao.getText("addForm.mainTitle"));

        nameLbl = new JLabel(TextsDao.getText("column.Name" + " :"));
        surnameLbl = new JLabel(TextsDao.getText("column.Surname" + " :"));
        ageLbl = new JLabel(TextsDao.getText("column.Age" + " :"));
        salaryLbl = new JLabel(TextsDao.getText("column.Salary" + " :"));

        nameTxt = new JTextField(0);
        surnameTxt = new JTextField(0);
        ageTxt = new JTextField(0);
        salaryTxt = new JTextField(0);

        okBtn = new JButton(TextsDao.getText("buttonsPanel.okButton"));
        cancelBtn = new JButton(TextsDao.getText("buttonsPanel.cancelButton"));

        jPanel = new JPanel();
        jPanel1 = new JPanel();

        gl42 = new GridLayout(4, 2);
        gl12 = new GridLayout(1, 2);
        flowLayout = new FlowLayout();

        jPanel.setLayout(gl42);
        jPanel.add(nameLbl);
        jPanel.add(nameTxt);
        jPanel.add(surnameLbl);
        jPanel.add(surnameTxt);
        jPanel.add(ageLbl);
        jPanel.add(ageTxt);
        jPanel.add(salaryLbl);
        jPanel.add(salaryTxt);

        jPanel1.setLayout(gl12);
        jPanel1.add(okBtn);
        jPanel1.add(cancelBtn);
    }
}
