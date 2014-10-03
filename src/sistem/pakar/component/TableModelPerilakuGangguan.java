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
import sistem.pakar.sugeno.JenisGangguan;

/**
 *
 * @author fa
 */
public class TableModelPerilakuGangguan extends AbstractTableModel {

    private List<JenisGangguan> list = new ArrayList<>();
    private TableRowSorter<TableModelPerilakuGangguan> sorter;

    public TableModelPerilakuGangguan() {
        sorter = new TableRowSorter<>(this);
        sorter.setComparator(0, new Comparator<JenisGangguan>() {
            @Override
            public int compare(JenisGangguan o1, JenisGangguan o2) {
                return o1.getKode().compareTo(o2.getKode());
            }
        });
    }


    public void setList(List<JenisGangguan> list) {
        this.list = list;
        sorter.setModel(this);
    }

    public boolean add(JenisGangguan e) {
        try {
            return list.add(e);
        } finally {
            fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
        }
    }

    public JenisGangguan update(int index, JenisGangguan e) {
        try {
            return list.set(index, e);
        } finally {
            fireTableRowsUpdated(index, index);
        }
    }

    public JenisGangguan remove(int index) {
        try {
            return list.remove(index);
        } finally {
            fireTableRowsDeleted(index, index);
        }
    }

    public JenisGangguan get(int index) {
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
                return list.get(rowIndex).getJenis();
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
                return "PERILAKU";
            default:
                return null;
        }
    }

    public void setFilter(String key, int column) {
        this.sorter.setRowFilter(RowFilter.regexFilter("(?i)" + key.trim(), column));
    }

    public TableRowSorter<TableModelPerilakuGangguan> getSorter() {
        return sorter;
    }


}
