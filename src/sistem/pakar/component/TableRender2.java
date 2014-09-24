/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.component;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import org.jdesktop.swingx.renderer.DefaultTableRenderer;

/**
 *
 * @author casper
 */
public class TableRender2 extends DefaultTableRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel("<html>" + value.toString() + "</html>");

        if (isSelected) {
            label.setForeground(table.getSelectionForeground());
            label.setBackground(table.getSelectionBackground());
        } else {
            label.setForeground(table.getForeground());
            label.setBackground(table.getBackground());
        }

        return label;
    }

}
