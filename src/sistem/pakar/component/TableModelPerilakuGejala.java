/*
 *  Author : fa
 *  Email  : casperadam91@gmail.com
 *  Blog   : fandy-alfa.blogspot.com
 *  IDE    : netbeans 7.2.x
 *  NOTEOOK ACER ASPIRE 4738
 */
package sistem.pakar.component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;
import sistem.pakar.sugeno.Gejala;

/**
 *
 * @author fa
 */
public class TableModelPerilakuGejala extends AbstractTableModel {

    private List<Gejala> list = new ArrayList<>();
    private TableRowSorter<TableModelPerilakuGejala> sorter;

    public TableModelPerilakuGejala() {
        sorter = new TableRowSorter<>(this);
        sorter.setComparator(0, new Comparator<Gejala>() {
            @Override
            public int compare(Gejala o1, Gejala o2) {
                return o1.getKode().compareTo(o2.getKode());
            }
        });
    }

    public void setList(List<Gejala> list) {
        this.list = list;
        sorter.setModel(this);
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
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getKode();
            case 1:
                return list.get(rowIndex).getGejala();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "KODE";
            case 1:
                return "GEJALA";
            default:
                return null;
        }
    }

    public void setFilter(String key, int column) {
        this.sorter.setRowFilter(RowFilter.regexFilter("(?i)" + key.trim(), column));
    }

    public TableRowSorter<TableModelPerilakuGejala> getSorter() {
        return sorter;
    }


}
