package locura_instantanea.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Representa una partida guardada con el estado de los 4 cubos y sus soluciones.
 */
public class Partida implements Serializable {
    private static final long serialVersionUID = 1L;

    public Cubo Cubo1 = new Cubo();
    public Cubo Cubo2 = new Cubo();
    public Cubo Cubo3 = new Cubo();
    public Cubo Cubo4 = new Cubo();
    public boolean solucion;
    public ArrayList<Solucion> soluciones = new ArrayList<>();

    public Partida() {
    }

    public Partida(Cubo cubo1, Cubo cubo2, Cubo cubo3, Cubo cubo4, boolean solucion, ArrayList<Solucion> soluciones) {
        this.Cubo1 = cubo1;
        this.Cubo2 = cubo2;
        this.Cubo3 = cubo3;
        this.Cubo4 = cubo4;
        this.solucion = solucion;
        this.soluciones = soluciones;
    }
}

