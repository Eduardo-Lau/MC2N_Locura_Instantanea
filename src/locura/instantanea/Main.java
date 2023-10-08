/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package locura.instantanea;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author carlo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            FlatMacDarkLaf.registerCustomDefaultsSource("style");
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Locura_Instantánea().setVisible(true);
    }
    
    
}
