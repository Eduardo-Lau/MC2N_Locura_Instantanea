package locura_instantanea.model;

import java.awt.Color;
import java.io.Serializable;

/**
 * Representa un cubo del juego con sus 6 caras.
 * Pares de caras opuestas:
 * - Par 0: Cara 1 (Frontal) y Cara 2 (Trasera)
 * - Par 1: Cara 3 (Superior) y Cara 4 (Inferior)
 * - Par 2: Cara 5 (Derecha) y Cara 6 (Izquierda)
 */
public class Cubo implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final int CARA_FRONTAL = 0;
    public static final int CARA_TRASERA = 1;
    public static final int CARA_SUPERIOR = 2;
    public static final int CARA_INFERIOR = 3;
    public static final int CARA_DERECHA = 4;
    public static final int CARA_IZQUIERDA = 5;

    // Campos de compatibilidad directa con UI
    public Color C1;
    public String C1I;
    public Color C2;
    public String C2I;
    public Color C3;
    public String C3I;
    public Color C4;
    public String C4I;
    public Color C5;
    public String C5I;
    public Color C6;
    public String C6I;

    public Cubo() {
    }

    public Cubo(Color c1, Color c2, Color c3, Color c4, Color c5, Color c6) {
        setColores(c1, c2, c3, c4, c5, c6);
    }

    public void setColores(Color c1, Color c2, Color c3, Color c4, Color c5, Color c6) {
        this.C1 = c1;
        this.C2 = c2;
        this.C3 = c3;
        this.C4 = c4;
        this.C5 = c5;
        this.C6 = c6;
        actualizarCodigosDesdeColores();
    }

    public void actualizarCodigosDesdeColores() {
        ColorCubo cc1 = ColorCubo.desdeColorAwt(C1);
        ColorCubo cc2 = ColorCubo.desdeColorAwt(C2);
        ColorCubo cc3 = ColorCubo.desdeColorAwt(C3);
        ColorCubo cc4 = ColorCubo.desdeColorAwt(C4);
        ColorCubo cc5 = ColorCubo.desdeColorAwt(C5);
        ColorCubo cc6 = ColorCubo.desdeColorAwt(C6);

        if (cc1 != null) this.C1I = cc1.getCodigo();
        if (cc2 != null) this.C2I = cc2.getCodigo();
        if (cc3 != null) this.C3I = cc3.getCodigo();
        if (cc4 != null) this.C4I = cc4.getCodigo();
        if (cc5 != null) this.C5I = cc5.getCodigo();
        if (cc6 != null) this.C6I = cc6.getCodigo();
    }

    /**
     * Retorna las 3 aristas (pares de caras opuestas) del cubo como bytes [3][2]
     */
    public byte[][] obtenerParesOpuestosBytes() {
        byte[][] pares = new byte[3][2];
        pares[0][0] = obtenerByteCara(C1I);
        pares[0][1] = obtenerByteCara(C2I);

        pares[1][0] = obtenerByteCara(C3I);
        pares[1][1] = obtenerByteCara(C4I);

        pares[2][0] = obtenerByteCara(C5I);
        pares[2][1] = obtenerByteCara(C6I);
        return pares;
    }

    private byte obtenerByteCara(String codigo) {
        ColorCubo c = ColorCubo.desdeCodigo(codigo);
        return c != null ? c.getId() : -1;
    }

    public boolean estaInicializado() {
        return C1 != null && C2 != null && C3 != null && C4 != null && C5 != null && C6 != null;
    }
}

