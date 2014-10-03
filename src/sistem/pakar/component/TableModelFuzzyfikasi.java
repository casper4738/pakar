/*
 *  Author : fa
 *  Email  : casperadam91@gmail.com
 *  Blog   : fandy-alfa.blogspot.com
 *  IDE    : netbeans 7.2.x
 *  NOTEOOK ACER ASPIRE 4738
 */
package sistem.pakar.component;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import sistem.pakar.sugeno.Fuzzyfikasi;

/**
 *
 * @author fa
 */
public class TableModelFuzzyfikasi extends AbstractTableModel {

    private List<Fuzzyfikasi> list = new ArrayList<>();
    private DecimalFormat format = new DecimalFormat("#0.000");

    public List<Fuzzyfikasi> getList() {
        return list;
    }

    public void setList(List<Fuzzyfikasi> list) {
        this.list = list;
        Collections.sort(list, new Comparator<Fuzzyfikasi>() {
            @Override
            public int compare(Fuzzyfikasi o1, Fuzzyfikasi o2) {
                return o1.getKode().compareTo(o2.getKode());
            }
        });
        fireTableDataChanged();
    }

    public boolean add(Fuzzyfikasi e) {
        try {
            return list.add(e);
        } finally {
            fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
        }
    }

    public Fuzzyfikasi update(int index, Fuzzyfikasi e) {
        try {
            return list.set(index, e);
        } finally {
            fireTableRowsUpdated(index, index);
        }
    }

    public Fuzzyfikasi remove(int index) {
        try {
            return list.remove(index);
        } finally {
            fireTableRowsDeleted(index, index);
        }
    }

    public Fuzzyfikasi get(int index) {
        return list.get(index);
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getGejala();
            case 1:
                return format.format(list.get(rowIndex).getJarang());
            case 2:
                return format.format(list.get(rowIndex).getSedang());
            case 3:
                return format.format(list.get(rowIndex).getSering());
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "GEJALA";
            case 1:
                return "µ JARANG";
            case 2:
                return "µ SEDANG";
            case 3:
                return "µ SERING";
            default:
                return null;
        }
    }

}
