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
import sistem.pakar.sugeno.DerajatKeanggotaan;

/**
 *
 * @author fa
 */
public class TableModelDerajatKeanggotaan extends AbstractTableModel {

    private List<DerajatKeanggotaan> list = new ArrayList<>();
    private DecimalFormat format = new DecimalFormat("#0.000");

    public List<DerajatKeanggotaan> getList() {
        return list;
    }

    public void setList(List<DerajatKeanggotaan> list) {
        this.list = list;
        Collections.sort(list, new Comparator<DerajatKeanggotaan>() {
            @Override
            public int compare(DerajatKeanggotaan o1, DerajatKeanggotaan o2) {
                return o1.getKode().compareTo(o2.getKode());
            }
        });
        fireTableDataChanged();
    }

    public boolean add(DerajatKeanggotaan e) {
        try {
            return list.add(e);
        } finally {
            fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
        }
    }

    public DerajatKeanggotaan update(int index, DerajatKeanggotaan e) {
        try {
            return list.set(index, e);
        } finally {
            fireTableRowsUpdated(index, index);
        }
    }

    public DerajatKeanggotaan remove(int index) {
        try {
            return list.remove(index);
        } finally {
            fireTableRowsDeleted(index, index);
        }
    }

    public DerajatKeanggotaan get(int index) {
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
                return format.format(list.get(rowIndex).getRingan());
            case 2:
                return format.format(list.get(rowIndex).getSedang());
            case 3:
                return format.format(list.get(rowIndex).getBerat());
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
                return "µ RINGAN";
            case 2:
                return "µ SEDANG";
            case 3:
                return "µ BERAT";
            default:
                return null;
        }
    }

}
