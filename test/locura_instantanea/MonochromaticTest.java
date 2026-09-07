package locura_instantanea;

import locura_instantanea.logic.MotorGrafo;
import java.util.List;

public class MonochromaticTest {
    public static void main(String[] args) {
        byte[][][] cubos = new byte[4][3][2];
        // Cubo 1: todo Rojo (0)
        for (int p = 0; p < 3; p++) { cubos[0][p][0] = 0; cubos[0][p][1] = 0; }
        // Cubo 2: todo Blanco (1)
        for (int p = 0; p < 3; p++) { cubos[1][p][0] = 1; cubos[1][p][1] = 1; }
        // Cubo 3: todo Verde (2)
        for (int p = 0; p < 3; p++) { cubos[2][p][0] = 2; cubos[2][p][1] = 2; }
        // Cubo 4: todo Amarillo (3)
        for (int p = 0; p < 3; p++) { cubos[3][p][0] = 3; cubos[3][p][1] = 3; }

        List<MotorGrafo.SolucionGrafos> sols = MotorGrafo.resolver(cubos);
        System.out.println("SOLUCIONES_MONOCROMATICAS: " + sols.size());
    }
}

