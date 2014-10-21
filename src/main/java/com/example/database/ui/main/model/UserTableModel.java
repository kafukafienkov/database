package com.example.database.ui.main.model;

import com.example.database.dao.TextsDao;
import com.example.database.model.User;

import javax.swing.table.AbstractTableModel;
import java.util.LinkedList;
import java.util.List;

/**
 * author: Bartek
 */
public class UserTableModel extends AbstractTableModel {

    private List<User> users = new LinkedList<>();

    {
        User user1 = new User();
        user1.setName("Marek");
        user1.setSurname("Nowak");
        users.add(user1);

    }

    public void addUser(User user) {
        users.add(user);
        fireTableDataChanged(); //przerysowanie tabeli od nowa
    }

    public void deleteRow(int userID) {
        users.remove(userID);
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return users.size();
    }

    @Override
    public int getColumnCount() {
        String[] columnsTitles = getColumnsTitles();
        return columnsTitles.length;
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
        String[] columnsTitles = getColumnsTitles();
        return columnsTitles[column];
    }

    public String[] getColumnsTitles() {
        return new String[]{
                TextsDao.getText("column.ID"),
                TextsDao.getText("column.Name"),
                TextsDao.getText("column.Surname"),
                TextsDao.getText("column.Age"),
                TextsDao.getText("column.Salary")
        };
    }
}
