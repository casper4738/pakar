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
import java.util.Comparator;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;
import sistem.pakar.sugeno.WeightAverage;

/**
 *
 * @author fa
 */
public class TableModelPredikat extends AbstractTableModel {

    private List<WeightAverage> list = new ArrayList<>();
    private TableRowSorter<TableModelPredikat> sorter;
    private DecimalFormat decimalFormat;

    public TableModelPredikat() {
        decimalFormat = new DecimalFormat("#0.000");
        sorter = new TableRowSorter<>(this);
        sorter.setComparator(0, new Comparator<WeightAverage>() {
            @Override
            public int compare(WeightAverage o1, WeightAverage o2) {
                return o1.getKode().compareTo(o2.getKode());
            }
        });
    }

    public List<WeightAverage> getList() {
        return list;
    }

    public void setList(List<WeightAverage> list) {
        this.list = list;
        sorter.setModel(this);
    }

    public boolean add(WeightAverage e) {
        try {
            return list.add(e);
        } finally {
            fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
        }
    }

    public WeightAverage update(int index, WeightAverage e) {
        try {
            return list.set(index, e);
        } finally {
            fireTableRowsUpdated(index, index);
        }
    }

    public WeightAverage remove(int index) {
        try {
            return list.remove(index);
        } finally {
            fireTableRowsDeleted(index, index);
        }
    }

    public WeightAverage get(int index) {
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
                return list.get(rowIndex).getKode();
            case 1:
                return decimalFormat.format(list.get(rowIndex).getPredikatAturan());
            case 2:
                return list.get(rowIndex).getNilaiOutput();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "RULE";
            case 1:
                return "NILAI α";
            case 2:
                return "NILAI z";
            default:
                return null;
        }
    }

    public void setFilter(String key, int column) {
        this.sorter.setRowFilter(RowFilter.regexFilter("(?i)" + key.trim(), column));
    }

    public TableRowSorter<TableModelPredikat> getSorter() {
        return sorter;
    }

}
