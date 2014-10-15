package com.example.database.ui.main.model;

import com.example.database.model.User;

import javax.swing.table.AbstractTableModel;
import java.util.LinkedList;
import java.util.List;

/**
 * author: Bartek
 */
public class UserTableModel extends AbstractTableModel {

    private String[] columns = {"ID", "Imię", "Nazwisko", "Data urodzenia", "Pensja"};

    private List<User> users = new LinkedList<>();

    public void addUser(User user) {
        users.add(user);
        fireTableDataChanged(); //przerysowanie tabeli od nowa
    }

    public void deleteUser(User user) {
        users.remove(user);
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return users.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        User user = users.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return user.getId();
            case 1:
                return user.getName();
            case 2:
                return user.getSurname();
            case 3:
                return user.getBirthdate();
            case 4:
                return user.getSalary();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
}
