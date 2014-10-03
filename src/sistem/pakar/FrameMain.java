/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.BorderLayout;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import sistem.pakar.view.PanelDiagnosa;
import sistem.pakar.view.PanelMenuUtama;

/**
 *
 * @author casper
 */
public class FrameMain extends JFrame {

    public static void main(String[] args) {
        try {
            Locale.setDefault(Locale.ENGLISH);
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
        }
        FrameMain frameMain = new FrameMain();
        frameMain.init();
    }

    private JFrame frame;
    private JPanel panelMain;
    private PanelMenuUtama panelMenuUtama;
    private PanelDiagnosa panelDiagnosa;

    public void init() {

        panelMain = new JPanel(new BorderLayout());
        panelMenuUtama = new PanelMenuUtama(this);
        panelDiagnosa = new PanelDiagnosa(this);

        frame = new JFrame("Sistem Pakar Diagnosa Awal Perilaku Abnormal");
        frame.setLayout(new BorderLayout());
        frame.add(panelMain, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        setPanel(panelMenuUtama);
        frame.setVisible(true);
    }

    public void setPanel(JPanel panel) {
        panelMain.removeAll();
        panelMain.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.repaint();
        frame.revalidate();
        frame.setLocationRelativeTo(null);
    }

    public PanelMenuUtama getPanelMenuUtama() {
        return panelMenuUtama;
    }

    public PanelDiagnosa getPanelDiagnosa() {
        return panelDiagnosa;
    }

}
