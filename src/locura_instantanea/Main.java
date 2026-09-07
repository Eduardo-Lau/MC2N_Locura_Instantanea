package locura_instantanea;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Font;
import javax.swing.UIManager;
import locura_instantanea.ui.LocuraInstantaneaFrame;

/**
 * Punto de entrada principal de la aplicación.
 */
public class Main {

    public static void main(String[] args) {
        try {
            FlatMacDarkLaf.registerCustomDefaultsSource("style");
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
            UIManager.put("Label.font", new Font("Consolas", Font.PLAIN, 16));
            UIManager.put("Button.font", new Font("Consolas", Font.BOLD, 16));
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(() -> {
            new LocuraInstantaneaFrame().setVisible(true);
        });
    }
}

