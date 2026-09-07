package locura_instantanea.model;

import java.io.Serializable;

/**
 * Representa una configuración de caras seleccionadas para un eje de la solución (Horizontal o Vertical).
 */
public class Solucion implements Serializable {
    private static final long serialVersionUID = 1L;

    // Aristas para cada cubo (cara inicial y cara final del par opuesto)
    public String Cubo1aristaI;
    public String Cubo1aristaF;
    public int posI;

    public String Cubo2aristaI;
    public String Cubo2aristaF;
    public int posC;

    public String Cubo3aristaI;
    public String Cubo3aristaF;
    public int posW;

    public String Cubo4aristaI;
    public String Cubo4aristaF;
    public int posR;

    public Solucion() {
    }

    public Solucion(int posI, String cubo1aristaI, String cubo1aristaF,
                    int posC, String cubo2aristaI, String cubo2aristaF,
                    int posW, String cubo3aristaI, String cubo3aristaF,
                    int posR, String cubo4aristaI, String cubo4aristaF) {
        this.posI = posI;
        this.Cubo1aristaI = cubo1aristaI;
        this.Cubo1aristaF = cubo1aristaF;

        this.posC = posC;
        this.Cubo2aristaI = cubo2aristaI;
        this.Cubo2aristaF = cubo2aristaF;

        this.posW = posW;
        this.Cubo3aristaI = cubo3aristaI;
        this.Cubo3aristaF = cubo3aristaF;

        this.posR = posR;
        this.Cubo4aristaI = cubo4aristaI;
        this.Cubo4aristaF = cubo4aristaF;
    }
}

