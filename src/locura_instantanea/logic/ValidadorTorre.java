package locura_instantanea.logic;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

/**
 * Validador para determinar si la configuración actual de la torre de cubos resuelve el juego.
 * Cada una de las 4 caras laterales de la columna debe contener los 4 colores distintos.
 */
public class ValidadorTorre {

    /**
     * Comprueba si cuatro colores son todos distintos y no nulos.
     */
    public static boolean sonCuatroColoresDistintos(Color c1, Color c2, Color c3, Color c4) {
        if (c1 == null || c2 == null || c3 == null || c4 == null) {
            return false;
        }
        Set<Color> colores = new HashSet<>(4);
        colores.add(c1);
        colores.add(c2);
        colores.add(c3);
        colores.add(c4);
        return colores.size() == 4;
    }

    /**
     * Valida si las cuatro columnas de la torre (las 4 caras laterales visibles)
     * cumplen la condición de victoria sin repetición de colores.
     */
    public static boolean esTorreResuelta(
            Color cubo1Cara3, Color cubo2Cara3, Color cubo3Cara3, Color cubo4Cara3,
            Color cubo1Cara5, Color cubo2Cara5, Color cubo3Cara5, Color cubo4Cara5,
            Color cubo1Cara4, Color cubo2Cara4, Color cubo3Cara4, Color cubo4Cara4,
            Color cubo1Cara6, Color cubo2Cara6, Color cubo3Cara6, Color cubo4Cara6) {

        boolean columna1Valida = sonCuatroColoresDistintos(cubo1Cara3, cubo2Cara3, cubo3Cara3, cubo4Cara3);
        boolean columna2Valida = sonCuatroColoresDistintos(cubo1Cara5, cubo2Cara5, cubo3Cara5, cubo4Cara5);
        boolean columna3Valida = sonCuatroColoresDistintos(cubo1Cara4, cubo2Cara4, cubo3Cara4, cubo4Cara4);
        boolean columna4Valida = sonCuatroColoresDistintos(cubo1Cara6, cubo2Cara6, cubo3Cara6, cubo4Cara6);

        return columna1Valida && columna2Valida && columna3Valida && columna4Valida;
    }
}

