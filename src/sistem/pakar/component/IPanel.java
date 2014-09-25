/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.component;

/**
 *
 * @author casper
 */
public class IPanel extends swingx.component.CurvesPanelOther {

    public IPanel() {
        try {
            setImage(getClass().getResource("/sistem/pakar/resources/BACKGROUNG1.jpg").openStream());
        } catch (Exception ex) { }
    }

}
