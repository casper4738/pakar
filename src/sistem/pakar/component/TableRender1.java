/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.component;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import org.jdesktop.swingx.renderer.DefaultTableRenderer;

/**
 *
 * @author casper
 */
public class TableRender1 extends DefaultTableRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        String[] string = value.toString().split(";");
        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        JTextField textField3 = new JTextField();
        JTextField textField4 = new JTextField();
        JTextField textField5 = new JTextField();
        JTextField textField6 = new JTextField();

        textField1.setHorizontalAlignment(JLabel.LEFT);
        textField2.setHorizontalAlignment(JLabel.LEFT);
        textField3.setHorizontalAlignment(JLabel.LEFT);
        textField4.setHorizontalAlignment(JLabel.LEFT);
        textField5.setHorizontalAlignment(JLabel.LEFT);
        textField6.setHorizontalAlignment(JLabel.LEFT);
        
        textField1.setBackground(Color.WHITE);
        textField2.setBackground(Color.LIGHT_GRAY);
        textField3.setBackground(Color.WHITE);
        textField4.setBackground(Color.LIGHT_GRAY);
        textField5.setBackground(Color.WHITE);
        textField6.setBackground(Color.LIGHT_GRAY);

        try {
            textField1.setText(string[0]);
            textField2.setText(string[1]);
            textField3.setText(string[2]);
            textField4.setText(string[3]);
            textField5.setText(string[4]);
            textField6.setText(string[5]);
        } catch (Exception e) {
        }

        if (string.length - 1 == 3) {
            JPanel panel = new JPanel(new java.awt.GridLayout(3, 0));
            panel.add(textField1);
            panel.add(textField2);
            panel.add(textField3);
            table.setRowHeight(75);
            return panel;
        } else if (string.length - 1 == 4) {
            JPanel panel = new JPanel(new java.awt.GridLayout(4, 0));
            panel.add(textField1);
            panel.add(textField2);
            panel.add(textField3);
            panel.add(textField4);
            table.setRowHeight(100);
            return panel;
        } else if (string.length - 1 == 5) {
            JPanel panel = new JPanel(new java.awt.GridLayout(5, 0));
            panel.add(textField1);
            panel.add(textField2);
            panel.add(textField3);
            panel.add(textField4);
            panel.add(textField5);
            table.setRowHeight(125);
            return panel;
        } else {
            JPanel panel = new JPanel(new java.awt.GridLayout(6, 0));
            panel.add(textField1);
            panel.add(textField2);
            panel.add(textField3);
            panel.add(textField4);
            panel.add(textField5);
            panel.add(textField6);
            table.setRowHeight(150);
            return panel;
        }

    }

}
