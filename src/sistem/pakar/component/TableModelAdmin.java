/*
 *  Author : fa
 *  Email  : casperadam91@gmail.com
 *  Blog   : fandy-alfa.blogspot.com
 *  IDE    : netbeans 7.2.x
 *  NOTEOOK ACER ASPIRE 4738
 */
package sistem.pakar.component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;
import sistem.pakar.sugeno.Admin;

/**
 *
 * @author fa
 */
public class TableModelAdmin extends AbstractTableModel {

    private List<Admin> list = new ArrayList<>();
    private TableRowSorter<TableModelAdmin> sorter;
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public TableModelAdmin() {
        sorter = new TableRowSorter<>(this);
        sorter.setComparator(0, new Comparator<Admin>() {
            @Override
            public int compare(Admin o1, Admin o2) {
                return o1.getTanggal().compareTo(o2.getTanggal());
            }
        });
    }

    public List<Admin> getList() {
        return list;
    }

    public void setList(List<Admin> list) {
        this.list = list;
        sorter.setModel(this);
    }

    public Admin remove(int index) {
        try {
            return list.remove(index);
        } finally {
            fireTableRowsDeleted(index, index);
        }
    }

    public Admin get(int index) {
        return list.get(index);
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return rowIndex + 1;
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getNamaAnak();
            case 3:
                return list.get(rowIndex).getJenisKelamin();
            case 4:
                return format.format(list.get(rowIndex).getTanggal());
            case 5: {
                String pdf = list.get(rowIndex).getNama() + " ; " + list.get(rowIndex).getStatus() + " ; "
                        + list.get(rowIndex).getNamaAnak() + " ; " + list.get(rowIndex).getJenisKelamin() + " ; "
                        + list.get(rowIndex).getUsia() + " ; " + format.format(list.get(rowIndex).getTanggal()) + ".pdf";
                return pdf;
            }
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NO";
            case 1:
                return "ADMIN";
            case 2:
                return "NAMA ANAK";
            case 3:
                return "JENIS KELAMIN";
            case 4:
                return "TANGGAL";
            case 5:
                return "HASIL DIAGNOSA";
            default:
                return null;
        }
    }

    public void setFilter(String key, int column) {
        this.sorter.setRowFilter(RowFilter.regexFilter("(?i)" + key.trim(), column));
    }

    public TableRowSorter<TableModelAdmin> getSorter() {
        return sorter;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 5;
    }

}
