package locura_instantanea;

import locura_instantanea.logic.MotorGrafo;
import java.util.List;

public class EdgeCasesTest {
    public static void main(String[] args) {
        // CASO A: Juego Original Instant Insanity (Parker Brothers 1967)
        // Cubo 1: (V,B), (V,R), (A,V)
        // Cubo 2: (V,A), (R,B), (B,A)
        // Cubo 3: (V,B), (A,R), (R,V)
        // Cubo 4: (R,B), (A,V), (A,R)
        byte[][][] clasico = new byte[4][3][2];
        clasico[0][0] = new byte[]{2, 1}; clasico[0][1] = new byte[]{2, 0}; clasico[0][2] = new byte[]{3, 2};
        clasico[1][0] = new byte[]{2, 3}; clasico[1][1] = new byte[]{0, 1}; clasico[1][2] = new byte[]{1, 3};
        clasico[2][0] = new byte[]{2, 1}; clasico[2][1] = new byte[]{3, 0}; clasico[2][2] = new byte[]{0, 2};
        clasico[3][0] = new byte[]{0, 1}; clasico[3][1] = new byte[]{3, 2}; clasico[3][2] = new byte[]{3, 0};

        List<MotorGrafo.SolucionGrafos> solClasico = MotorGrafo.resolver(clasico);
        System.out.println("CASO_CLASICO (Parker Brothers): " + solClasico.size() + " soluciones");

        // CASO B: Amarillo ausente (0 soluciones esperadas)
        byte[][][] sinAmarillo = new byte[4][3][2];
        for (int c = 0; c < 4; c++) {
            for (int p = 0; p < 3; p++) {
                sinAmarillo[c][p][0] = 0;
                sinAmarillo[c][p][1] = 1;
            }
        }
        List<MotorGrafo.SolucionGrafos> solSinAmarillo = MotorGrafo.resolver(sinAmarillo);
        System.out.println("CASO_SIN_AMARILLO: " + solSinAmarillo.size() + " soluciones");

        // CASO C: 4 cubos idénticos con pares (R,R), (B,B), (V,A)
        byte[][][] identicos = new byte[4][3][2];
        for (int c = 0; c < 4; c++) {
            identicos[c][0] = new byte[]{0, 0}; // (R,R)
            identicos[c][1] = new byte[]{1, 1}; // (B,B)
            identicos[c][2] = new byte[]{2, 3}; // (V,A)
        }
        List<MotorGrafo.SolucionGrafos> solIdenticos = MotorGrafo.resolver(identicos);
        System.out.println("CASO_IDENTICOS: " + solIdenticos.size() + " soluciones");
    }
}

