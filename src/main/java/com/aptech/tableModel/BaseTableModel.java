/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.tableModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ducsang
 * @param <T>
 */
public abstract class BaseTableModel<T> extends AbstractTableModel{
    protected final List<T> entities = new ArrayList<>();
    public abstract String[] getColumnLabels();

    @Override
    public int getRowCount() {
        return entities.size();
    }

    @Override
    public int getColumnCount() {
        return getColumnLabels().length;
    }

    @Override
    public String getColumnName(int column) {
        return getColumnLabels()[column];
    }

    public void addEntity(T entity) {
        entities.add(entity);
        fireTableDataChanged();
    }

    public void addEntities(List<T> entities) {
        this.entities.addAll(entities);
        fireTableDataChanged();
    }

    public T getEntityByRow(int rowIndex) {
        return entities.get(rowIndex);
    }

    public void removeRow(int row) {
        entities.remove(row);
        fireTableDataChanged();
    }

    public void clear() {
        entities.clear();
    }
    
}
