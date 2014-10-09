package com.example.database.model;

import javax.swing.table.AbstractTableModel;

/**
 * author: Bartek
 */
public class UserTableModel extends AbstractTableModel {

    private String[] columns = {"ID", "Imię", "Nazwisko", "Data urodzenia", "Pensja"};

    @Override
    public int getRowCount() {
        return 10;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return " ";
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
}
