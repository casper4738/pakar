/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.view;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EventObject;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import sistem.pakar.component.TableModelAdmin;
import sistem.pakar.sugeno.Admin;
import swingx.component.table.renderer.TableCellColorAlignmentRenderer;
import swingx.component.table.renderer.TableCellColorRenderer;

/**
 *
 * @author casper
 */
public class PanelAdmin extends javax.swing.JPanel {

    /**
     * Creates new form PanelAdmin
     */
    private FrameMain frameMain;

    private JTable table;
    private JComboBox comboSearch;
    private JTextField textSearch;

    public PanelAdmin(FrameMain frameMain) {
        initComponents();
        this.frameMain = frameMain;

        table = iTable1.getTable();
        comboSearch = iTable1.getComboSearch();
        textSearch = iTable1.getTextSearch();
    }

    public void setData() {
        File file = new File("./report/");
        String[] listFile = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                String lowercaseName = name.toLowerCase();
                if (lowercaseName.endsWith(".pdf")) {
                    return true;
                } else {
                    return false;
                }
            }
        });

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        List<Admin> list = new ArrayList<>();
        for (String string : listFile) {
            String[] vstring = string.split(";");
            Admin e = new Admin();
            e.setNama(vstring[0]);
            e.setStatus(vstring[1]);
            e.setNamaAnak(vstring[2]);
            e.setJenisKelamin(vstring[3]);
            e.setUsia(new Integer(vstring[4].trim()));
            try {
                e.setTanggal(format.parse(vstring[5]));
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            list.add(e);
        }

        final TableModelAdmin tableModel = new TableModelAdmin();
        tableModel.setList(list);
        table.setModel(tableModel);

        comboSearch.removeAllItems();
        for (int i = 0; i < table.getColumnCount() - 1; i++) {
            comboSearch.addItem(table.getColumnName(i));
        }

        textSearch.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                tableModel.setFilter(textSearch.getText(), comboSearch.getSelectedIndex());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                tableModel.setFilter(textSearch.getText(), comboSearch.getSelectedIndex());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                tableModel.setFilter(textSearch.getText(), comboSearch.getSelectedIndex());
            }
        });

        table.setRowHeight(36);
        table.setRowSorter(tableModel.getSorter());

        new swingx.component.table.renderer.TableColumnSizeRenderer().setRenderSizeColumn(table, JTable.AUTO_RESIZE_OFF);

        table.getColumnModel().getColumn(0).setCellRenderer(new TableCellColorAlignmentRenderer(JLabel.CENTER));
        table.getColumnModel().getColumn(1).setCellRenderer(new TableCellColorRenderer());
        table.getColumnModel().getColumn(2).setCellRenderer(new TableCellColorRenderer());
        table.getColumnModel().getColumn(3).setCellRenderer(new TableCellColorAlignmentRenderer(JLabel.CENTER));
        table.getColumnModel().getColumn(4).setCellRenderer(new TableCellColorAlignmentRenderer(JLabel.CENTER));
//        table.getColumnModel().getColumn(5).setCellRenderer(new DefaultTableCellRenderer() {
//
//            @Override
//            public Component getTableCellRendererComponent(JTable table, final Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//                JButton button1 = new JButton("PRINT");
//                JButton button2 = new JButton("HAPUS");
//
//                JPanel panel = new JPanel(new java.awt.GridLayout(1, 2));
//                panel.add(button1);
//                panel.add(button2);
//                button1.addActionListener(new ActionListener() {
//
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        try {
//                            String cmd = "cmd.exe /C start ";
//                            Runtime.getRuntime().exec(cmd + "./report/" + value.toString());
//                        } catch (Exception ex) {
//                        }
//                    }
//                });
//
//                return button1;
//            }
//
//        });
        table.getColumnModel().getColumn(5).setCellRenderer(new ButtonsRenderer());
        table.getColumnModel().getColumn(5).setCellEditor(new ButtonsEditor(table, tableModel));

        table.getColumnModel().getColumn(5).setPreferredWidth(150);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iPanelBorder1 = new sistem.pakar.component.IPanelBorder();
        jLabel1 = new javax.swing.JLabel();
        iTable1 = new sistem.pakar.component.ITable();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA ADMIN");

        iTable1.setOpaque(false);

        javax.swing.GroupLayout iPanelBorder1Layout = new javax.swing.GroupLayout(iPanelBorder1);
        iPanelBorder1.setLayout(iPanelBorder1Layout);
        iPanelBorder1Layout.setHorizontalGroup(
            iPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iPanelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(iTable1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );
        iPanelBorder1Layout.setVerticalGroup(
            iPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iPanelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE))
        );

        add(iPanelBorder1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sistem.pakar.component.IPanelBorder iPanelBorder1;
    private sistem.pakar.component.ITable iTable1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

class ButtonsPanel extends JPanel {

    public final List<JButton> buttons = Arrays.asList(new JButton("Print"), new JButton("Hapus"));

    public ButtonsPanel() {
        super();
        setOpaque(true);
        for (JButton b : buttons) {
            b.setFocusable(false);
            b.setRolloverEnabled(false);
            add(b);
        }
    }
//     @Override public void updateUI() {
//         super.updateUI();
//     }
}

class ButtonsRenderer extends ButtonsPanel implements TableCellRenderer {

    public ButtonsRenderer() {
        super();
        setName("Table.cellRenderer");
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        this.setBackground(isSelected ? table.getSelectionBackground() : table.getBackground());
        return this;
    }
}

class ViewAction extends AbstractAction {

    private final JTable table;
    private final TableModelAdmin tableModel;

    public ViewAction(JTable table, TableModelAdmin tableModel) {
        super("Print");
        this.table = table;
        this.tableModel = tableModel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int row = table.convertRowIndexToModel(table.getEditingRow());
            Object object = table.getModel().getValueAt(row, 5);
            String cmd = "cmd.exe /C start ";
            Runtime.getRuntime().exec(cmd + "report/" + "\"" + object + "\"");
        } catch (Exception ex) {
        }

    }
}

class EditAction extends AbstractAction {

    private final JTable table;
    private final TableModelAdmin tableModel;

    public EditAction(JTable table, TableModelAdmin tableModel) {
        super("Hapus");
        this.table = table;
        this.tableModel = tableModel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int row = table.convertRowIndexToModel(table.getEditingRow());
            Object object = table.getModel().getValueAt(row, 5);
            tableModel.remove(row);
            Path path = Paths.get("report\\" + object.toString().replaceAll("  ", " "));
            Files.delete(path);
        } catch (IOException ex) {
            Logger.getLogger(EditAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class ButtonsEditor extends ButtonsPanel implements TableCellEditor {

    protected transient ChangeEvent changeEvent;
    private final JTable table;
    private final TableModelAdmin tableModel;

    private class EditingStopHandler extends MouseAdapter implements ActionListener {

        @Override
        public void mousePressed(MouseEvent e) {
            Object o = e.getSource();
            if (o instanceof TableCellEditor) {
                actionPerformed(null);
            } else if (o instanceof JButton) {
                //DEBUG: view button click -> control key down + edit button(same cell) press -> remain selection color
                ButtonModel m = ((JButton) e.getComponent()).getModel();
                if (m.isPressed() && table.isRowSelected(table.getEditingRow()) && e.isControlDown()) {
                    setBackground(table.getBackground());
                }
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    fireEditingStopped();
                }
            });
        }
    }

    public ButtonsEditor(JTable table, TableModelAdmin tableModel) {
        super();
        this.table = table;
        this.tableModel = tableModel;
        buttons.get(0).setAction(new ViewAction(table, tableModel));
        buttons.get(1).setAction(new EditAction(table, tableModel));

        EditingStopHandler handler = new EditingStopHandler();
        for (JButton b : buttons) {
            b.addMouseListener(handler);
            b.addActionListener(handler);
        }
        addMouseListener(handler);
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.setBackground(table.getSelectionBackground());
        return this;
    }

    @Override
    public Object getCellEditorValue() {
        return "";
    }

    //Copied from AbstractCellEditor
    //protected EventListenerList listenerList = new EventListenerList();
    //protected transient ChangeEvent changeEvent;
    @Override
    public boolean isCellEditable(EventObject e) {
        return true;
    }

    @Override
    public boolean shouldSelectCell(EventObject anEvent) {
        return true;
    }

    @Override
    public boolean stopCellEditing() {
        fireEditingStopped();
        return true;
    }

    @Override
    public void cancelCellEditing() {
        fireEditingCanceled();
    }

    @Override
    public void addCellEditorListener(CellEditorListener l) {
        listenerList.add(CellEditorListener.class, l);
    }

    @Override
    public void removeCellEditorListener(CellEditorListener l) {
        listenerList.remove(CellEditorListener.class, l);
    }

    public CellEditorListener[] getCellEditorListeners() {
        return listenerList.getListeners(CellEditorListener.class);
    }

    protected void fireEditingStopped() {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == CellEditorListener.class) {
                // Lazily create the event:
                if (changeEvent == null) {
                    changeEvent = new ChangeEvent(this);
                }
                ((CellEditorListener) listeners[i + 1]).editingStopped(changeEvent);
            }
        }
    }

    protected void fireEditingCanceled() {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == CellEditorListener.class) {
                // Lazily create the event:
                if (changeEvent == null) {
                    changeEvent = new ChangeEvent(this);
                }
                ((CellEditorListener) listeners[i + 1]).editingCanceled(changeEvent);
            }
        }
    }
}
