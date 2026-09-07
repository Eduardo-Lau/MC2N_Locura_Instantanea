package locura_instantanea.logic;

import java.util.ArrayList;
import java.util.List;
import locura_instantanea.model.ColorCubo;

/**
 * Motor de resolución matemática de Locura Instantánea basado en Teoría de Grafos.
 *
 * Cada cubo tiene 3 pares de caras opuestas (3 aristas).
 * Se buscan dos subgrafos H1 (eje Frente-Atrás) y H2 (eje Izquierda-Derecha) tales que:
 * 1. Cada subgrafo tenga exactamente 1 arista de cada uno de los 4 cubos.
 * 2. Cada vértice (color) tenga grado exactamente 2.
 * 3. H1 y H2 sean disjuntos en aristas.
 */
public class MotorGrafo {

    public static byte fromString(String color) {
        ColorCubo c = ColorCubo.desdeCodigo(color);
        return c != null ? c.getId() : -1;
    }

    public static class SolucionGrafos {
        public final int[] carasH1; // Índices de pares opuestos para H1 [cubo1, cubo2, cubo3, cubo4]
        public final int[] carasH2; // Índices de pares opuestos para H2 [cubo1, cubo2, cubo3, cubo4]

        public SolucionGrafos(int[] carasH1, int[] carasH2) {
            this.carasH1 = carasH1;
            this.carasH2 = carasH2;
        }
    }

    /**
     * Resuelve el rompecabezas de Locura Instantánea.
     * @param cubos Array tridimensional [4 cubos][3 pares de caras opuestas][2 colores]
     * @return Lista de soluciones encontradas
     */
    public static List<SolucionGrafos> resolver(byte[][][] cubos) {
        List<SolucionGrafos> soluciones = new ArrayList<>();

        // Iterar sobre las combinaciones de aristas para el subgrafo H1 (3^4 = 81 combinaciones)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        int[] h1 = {i, j, k, l};
                        if (esSubgrafoValido(cubos, h1)) {
                            // Para un H1 válido, iterar las 2 aristas restantes por cubo para H2 (2^4 = 16 combinaciones)
                            for (int i2 = 0; i2 < 3; i2++) {
                                if (i2 == i) continue;
                                for (int j2 = 0; j2 < 3; j2++) {
                                    if (j2 == j) continue;
                                    for (int k2 = 0; k2 < 3; k2++) {
                                        if (k2 == k) continue;
                                        for (int l2 = 0; l2 < 3; l2++) {
                                            if (l2 == l) continue;
                                            int[] h2 = {i2, j2, k2, l2};
                                            if (esSubgrafoValido(cubos, h2)) {
                                                soluciones.add(new SolucionGrafos(
                                                        new int[]{i, j, k, l},
                                                        new int[]{i2, j2, k2, l2}
                                                ));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return soluciones;
    }

    private static boolean esSubgrafoValido(byte[][][] cubos, int[] aristas) {
        int[] grados = new int[4];
        for (int c = 0; c < 4; c++) {
            byte color1 = cubos[c][aristas[c]][0];
            byte color2 = cubos[c][aristas[c]][1];
            if (color1 < 0 || color2 < 0 || color1 > 3 || color2 > 3) {
                return false;
            }
            grados[color1]++;
            grados[color2]++;
        }
        return grados[0] == 2 && grados[1] == 2 && grados[2] == 2 && grados[3] == 2;
    }
}

