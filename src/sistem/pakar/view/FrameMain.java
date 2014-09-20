/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.view;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import sistem.pakar.sugeno.Rule;

/**
 *
 * @author casper
 */
public class FrameMain extends JFrame {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
        } catch (Exception e) {
        }
        FrameMain frameMain = new FrameMain();
        frameMain.init();
    }

    private JFrame frame;
    private JPanel panelMain;
    private Rule rule;

    public void init() {
        rule = new Rule();

        panelMain = new JPanel(new BorderLayout());

        frame = new JFrame("Sistem Pakar Diagnosa Awal Perilaku Abnormal");
        frame.setLayout(new BorderLayout());
        frame.add(panelMain, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPanel(new PanelMain(this));
        frame.setVisible(true);
    }

    public void setPanel(JPanel panel) {
        panelMain.removeAll();
        panelMain.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.revalidate();
        frame.setLocationRelativeTo(null);
    }

    public Rule getRule() {
        return rule;
    }

}
