package locura_instantanea;

import locura_instantanea.model.Cubo;
import locura_instantanea.model.ColorCubo;
import locura_instantanea.logic.MotorGrafo;
import locura_instantanea.model.Solucion;
import java.util.ArrayList;
import java.util.List;

public class SilentSolverTest {
    public static void main(String[] args) {
        Cubo c1 = new Cubo(ColorCubo.ROJO.getColorAwt(), ColorCubo.ROJO.getColorAwt(), ColorCubo.ROJO.getColorAwt(), ColorCubo.ROJO.getColorAwt(), ColorCubo.ROJO.getColorAwt(), ColorCubo.ROJO.getColorAwt());
        Cubo c2 = new Cubo(ColorCubo.BLANCO.getColorAwt(), ColorCubo.BLANCO.getColorAwt(), ColorCubo.BLANCO.getColorAwt(), ColorCubo.BLANCO.getColorAwt(), ColorCubo.BLANCO.getColorAwt(), ColorCubo.BLANCO.getColorAwt());
        Cubo c3 = new Cubo(ColorCubo.VERDE.getColorAwt(), ColorCubo.VERDE.getColorAwt(), ColorCubo.VERDE.getColorAwt(), ColorCubo.VERDE.getColorAwt(), ColorCubo.VERDE.getColorAwt(), ColorCubo.VERDE.getColorAwt());
        Cubo c4 = new Cubo(ColorCubo.AMARILLO.getColorAwt(), ColorCubo.AMARILLO.getColorAwt(), ColorCubo.AMARILLO.getColorAwt(), ColorCubo.AMARILLO.getColorAwt(), ColorCubo.AMARILLO.getColorAwt(), ColorCubo.AMARILLO.getColorAwt());

        byte[][][] cubos = new byte[4][3][2];
        cubos[0] = c1.obtenerParesOpuestosBytes();
        cubos[1] = c2.obtenerParesOpuestosBytes();
        cubos[2] = c3.obtenerParesOpuestosBytes();
        cubos[3] = c4.obtenerParesOpuestosBytes();

        List<MotorGrafo.SolucionGrafos> solucionesGraph = MotorGrafo.resolver(cubos);
        System.out.println("SOLUCIONES GRAPH SIZE: " + solucionesGraph.size());

        ArrayList<Solucion> soluciones = new ArrayList<>();
        String[] v1 = {c1.C1I, c1.C2I, c1.C3I, c1.C4I, c1.C5I, c1.C6I};
        String[] v2 = {c2.C1I, c2.C2I, c2.C3I, c2.C4I, c2.C5I, c2.C6I};
        String[] v3 = {c3.C1I, c3.C2I, c3.C3I, c3.C4I, c3.C5I, c3.C6I};
        String[] v4 = {c4.C1I, c4.C2I, c4.C3I, c4.C4I, c4.C5I, c4.C6I};

        for (MotorGrafo.SolucionGrafos solG : solucionesGraph) {
            soluciones.add(new Solucion(solG.carasH1[0]*2, v1[0], v1[1], solG.carasH1[1]*2, v2[0], v2[1], solG.carasH1[2]*2, v3[0], v3[1], solG.carasH1[3]*2, v4[0], v4[1]));
            soluciones.add(new Solucion(solG.carasH2[0]*2, v1[0], v1[1], solG.carasH2[1]*2, v2[0], v2[1], solG.carasH2[2]*2, v3[0], v3[1], solG.carasH2[3]*2, v4[0], v4[1]));
        }

        System.out.println("TOTAL SOLUCIONES PARES: " + (soluciones.size() / 2));
    }
}

