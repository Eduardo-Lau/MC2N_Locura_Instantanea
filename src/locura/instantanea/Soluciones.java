/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locura.instantanea;

import java.io.Serializable;

/**
 *
 * @author carlo
 */
public class Soluciones implements Serializable {

    // Solucion Horizontal
    String Cubo1aristaI;
    String Cubo1aristaF;
    int posI;

    String Cubo2aristaI;
    String Cubo2aristaF;
    int posC;

    String Cubo3aristaI;
    String Cubo3aristaF;
    int posW;

    String Cubo4aristaI;
    String Cubo4aristaF;
    int posR;

    public Soluciones(int posI, String Cubo1aristaI, String Cubo1aristaF, int posC, String Cubo2aristaI, String Cubo2aristaF,
            int posW, String Cubo3aristaI, String Cubo3aristaF, int posR, String Cubo4aristaI, String Cubo4aristaF) {
        this.posI = posI;
        this.Cubo1aristaI = Cubo1aristaI;
        this.Cubo1aristaF = Cubo1aristaF;
        
        this.posC = posC;
        this.Cubo2aristaI = Cubo2aristaI;
        this.Cubo2aristaF = Cubo2aristaF;
        
        this.posW = posW;
        this.Cubo3aristaI = Cubo3aristaI;
        this.Cubo3aristaF = Cubo3aristaF;
        
        this.posR = posR;
        this.Cubo4aristaI = Cubo4aristaI;
        this.Cubo4aristaF = Cubo4aristaF;
    }

    public Soluciones() {
        
    }

   

}
