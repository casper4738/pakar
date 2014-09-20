/*
 *  Author : fa
 *  Email  : casperadam91@gmail.com
 *  Blog   : fandy-alfa.blogspot.com
 *  IDE    : netbeans 7.2.x
 *  NOTEOOK ACER ASPIRE 4738
 */
package sistem.pakar.component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import sistem.pakar.sugeno.Gejala;

/**
 *
 * @author fa
 */
public class TableModelGejala extends AbstractTableModel {

    private List<Gejala> list = new ArrayList<>();

    public List<Gejala> getList() {
        return list;
    }

    public void setList(List<Gejala> list) {
        this.list = list;
        Collections.sort(list, new Comparator<Gejala>() {

            @Override
            public int compare(Gejala o1, Gejala o2) {
                return o1.getKode().compareTo(o2.getKode());
            }
        });
    }

    public boolean add(Gejala e) {
        try {
            return list.add(e);
        } finally {
            fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
        }
    }

    public Gejala update(int index, Gejala e) {
        try {
            return list.set(index, e);
        } finally {
            fireTableRowsUpdated(index, index);
        }
    }

    public Gejala remove(int index) {
        try {
            return list.remove(index);
        } finally {
            fireTableRowsDeleted(index, index);
        }
    }

    public Gejala get(int index) {
        return list.get(index);
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: 
                //list.get(rowIndex).setSelected(true);
                return list.get(rowIndex).isSelected();
            case 1:
                return list.get(rowIndex).getKode();
            case 2:
                return list.get(rowIndex).getGejala();
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 0;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return java.lang.Boolean.class;
            default:
                return java.lang.Object.class;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: {
                boolean b = (boolean) aValue;
                list.get(rowIndex).setSelected(b);
            }
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "";
            case 1:
                return "KODE";
            case 2:
                return "GEJALA";
            default:
                return null;
        }
    }

}
