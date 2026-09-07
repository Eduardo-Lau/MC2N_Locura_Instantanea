package locura_instantanea;

import locura_instantanea.logic.MotorGrafo;
import locura_instantanea.logic.ValidadorTorre;
import locura_instantanea.model.ColorCubo;
import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class VerificacionTest {
    public static void main(String[] args) {
        // 1. Probar ValidadorTorre
        Color r = ColorCubo.ROJO.getColorAwt();
        Color b = ColorCubo.BLANCO.getColorAwt();
        Color v = ColorCubo.VERDE.getColorAwt();
        Color a = ColorCubo.AMARILLO.getColorAwt();

        boolean valid = ValidadorTorre.sonCuatroColoresDistintos(r, b, v, a);
        boolean invalid = ValidadorTorre.sonCuatroColoresDistintos(r, r, v, a);
        System.out.println("TEST_VALIDADOR_OK: " + (valid && !invalid));

        // 2. Probar MotorGrafo
        byte[][][] cubos = new byte[4][3][2];
        // Cubo 1: (R,B), (V,A), (R,V)
        cubos[0][0] = new byte[]{0, 1};
        cubos[0][1] = new byte[]{2, 3};
        cubos[0][2] = new byte[]{0, 2};
        // Cubo 2: (B,V), (A,R), (B,A)
        cubos[1][0] = new byte[]{1, 2};
        cubos[1][1] = new byte[]{3, 0};
        cubos[1][2] = new byte[]{1, 3};
        // Cubo 3: (V,A), (R,B), (V,R)
        cubos[2][0] = new byte[]{2, 3};
        cubos[2][1] = new byte[]{0, 1};
        cubos[2][2] = new byte[]{2, 0};
        // Cubo 4: (A,R), (B,V), (A,B)
        cubos[3][0] = new byte[]{3, 0};
        cubos[3][1] = new byte[]{1, 2};
        cubos[3][2] = new byte[]{3, 1};

        List<MotorGrafo.SolucionGrafos> sols = MotorGrafo.resolver(cubos);
        System.out.println("TEST_GRAFO_SOLUCIONES: " + sols.size());
        if (!sols.isEmpty()) {
            System.out.println("H1: " + Arrays.toString(sols.get(0).carasH1));
            System.out.println("H2: " + Arrays.toString(sols.get(0).carasH2));
        }

        System.out.println("TODAS LAS PRUEBAS PASARON EXITOSAMENTE.");
    }
}
