package locura_instantanea.persistence;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import locura_instantanea.model.Cubo;
import locura_instantanea.model.Solucion;

/**
 * Objeto de transferencia de datos (DTO) para serializar el estado de una partida o cubos.
 */
public class EstadoPartidaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    public Cubo Cubo1 = new Cubo();
    public Cubo Cubo2 = new Cubo();
    public Cubo Cubo3 = new Cubo();
    public Cubo Cubo4 = new Cubo();
    public boolean solucion;
    public ArrayList<Solucion> soluciones = new ArrayList<>();
    public int solucionAplicada;

    // Colores y textos de las caras
    public Color C1, C2, C3, C4, C5, C6;
    public String C1I, C2I, C3I, C4I, C5I, C6I;

    // Colores y textos UI Cubo 1
    public String Cubo1C1JN, Cubo1C2JN, Cubo1C3JN, Cubo1C4JN, Cubo1C5JN, Cubo1C6JN;
    public Color Cubo1C1JB, Cubo1C2JB, Cubo1C3JB, Cubo1C4JB, Cubo1C5JB, Cubo1C6JB;

    // Colores y textos UI Cubo 2
    public String Cubo2C1JN, Cubo2C2JN, Cubo2C3JN, Cubo2C4JN, Cubo2C5JN, Cubo2C6JN;
    public Color Cubo2C1JB, Cubo2C2JB, Cubo2C3JB, Cubo2C4JB, Cubo2C5JB, Cubo2C6JB;

    // Colores y textos UI Cubo 3
    public String Cubo3C1JN, Cubo3C2JN, Cubo3C3JN, Cubo3C4JN, Cubo3C5JN, Cubo3C6JN;
    public Color Cubo3C1JB, Cubo3C2JB, Cubo3C3JB, Cubo3C4JB, Cubo3C5JB, Cubo3C6JB;

    // Colores y textos UI Cubo 4
    public String Cubo4C1JN, Cubo4C2JN, Cubo4C3JN, Cubo4C4JN, Cubo4C5JN, Cubo4C6JN;
    public Color Cubo4C1JB, Cubo4C2JB, Cubo4C3JB, Cubo4C4JB, Cubo4C5JB, Cubo4C6JB;

    public EstadoPartidaDTO() {
    }

    public EstadoPartidaDTO(Cubo cubo1, Cubo cubo2, Cubo cubo3, Cubo cubo4, boolean solucion, ArrayList<Solucion> soluciones) {
        this.Cubo1 = cubo1;
        this.Cubo2 = cubo2;
        this.Cubo3 = cubo3;
        this.Cubo4 = cubo4;
        this.solucion = solucion;
        this.soluciones = soluciones;
    }
}

