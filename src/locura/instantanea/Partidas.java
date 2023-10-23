/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locura.instantanea;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class Partidas implements Serializable {
    
    public Cubos Cubo1 = new Cubos();
    public Cubos Cubo2 = new Cubos();
    public Cubos Cubo3 = new Cubos();
    public Cubos Cubo4 = new Cubos();
    boolean solucion;
    public ArrayList<Soluciones> soluciones = new ArrayList<>();
    
    public Partidas(Cubos Cubo1, Cubos Cubo2, Cubos Cubo3, Cubos Cubo4, boolean solucion, ArrayList<Soluciones> soluciones) {
        this.Cubo1 = Cubo1;
        this.Cubo2 = Cubo2;
        this.Cubo3 = Cubo3;
        this.Cubo4 = Cubo4;
        this.solucion = solucion;
        this.soluciones = soluciones;
    }
    
    
    
}
