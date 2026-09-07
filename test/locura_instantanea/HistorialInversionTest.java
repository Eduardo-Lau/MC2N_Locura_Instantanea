package locura_instantanea;

import locura_instantanea.model.Cubo;
import locura_instantanea.model.Partida;
import locura_instantanea.ui.LocuraInstantaneaFrame;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class HistorialInversionTest {
    static Cubo dummyCubo(String col) {
        Cubo c = new Cubo();
        c.C1I = col; c.C2I = col; c.C3I = col;
        c.C4I = col; c.C5I = col; c.C6I = col;
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Starting HistorialInversionTest...");
        LocuraInstantaneaFrame frame = new LocuraInstantaneaFrame();

        Color expectedBg = new Color(122, 37, 55);
        Color expectedFg = new Color(255, 255, 255);

        try {
            var prevField = LocuraInstantaneaFrame.class.getDeclaredField("solucionPrev");
            prevField.setAccessible(true);
            javax.swing.JButton prev = (javax.swing.JButton) prevField.get(frame);

            var postField = LocuraInstantaneaFrame.class.getDeclaredField("solucionPost");
            postField.setAccessible(true);
            javax.swing.JButton post = (javax.swing.JButton) postField.get(frame);

            var prevExpField = LocuraInstantaneaFrame.class.getDeclaredField("solucionPrevExp");
            prevExpField.setAccessible(true);
            javax.swing.JButton prevExp = (javax.swing.JButton) prevExpField.get(frame);

            var postExpField = LocuraInstantaneaFrame.class.getDeclaredField("solucionPostExp");
            postExpField.setAccessible(true);
            javax.swing.JButton postExp = (javax.swing.JButton) postExpField.get(frame);

            var noSolExpField = LocuraInstantaneaFrame.class.getDeclaredField("noSolucionesExp");
            noSolExpField.setAccessible(true);
            javax.swing.JLabel noSolExp = (javax.swing.JLabel) noSolExpField.get(frame);

            var sep15Field = LocuraInstantaneaFrame.class.getDeclaredField("jSeparator15");
            sep15Field.setAccessible(true);
            javax.swing.JSeparator sep15 = (javax.swing.JSeparator) sep15Field.get(frame);

            if (!prev.getBackground().equals(expectedBg)) throw new RuntimeException("solucionPrev background mismatch: " + prev.getBackground());
            if (!prev.getForeground().equals(expectedFg)) throw new RuntimeException("solucionPrev foreground mismatch: " + prev.getForeground());
            if (!post.getBackground().equals(expectedBg)) throw new RuntimeException("solucionPost background mismatch: " + post.getBackground());
            if (!post.getForeground().equals(expectedFg)) throw new RuntimeException("solucionPost foreground mismatch: " + post.getForeground());
            if (!prevExp.getBackground().equals(expectedBg)) throw new RuntimeException("solucionPrevExp background mismatch: " + prevExp.getBackground());
            if (!prevExp.getForeground().equals(expectedFg)) throw new RuntimeException("solucionPrevExp foreground mismatch: " + prevExp.getForeground());
            if (!postExp.getBackground().equals(expectedBg)) throw new RuntimeException("solucionPostExp background mismatch: " + postExp.getBackground());
            if (!postExp.getForeground().equals(expectedFg)) throw new RuntimeException("solucionPostExp foreground mismatch: " + postExp.getForeground());

            System.out.println("TEST_BUTTON_COLORS: OK (all 4 buttons crimson #7a2537 with white text)");

            if (prevExp.getX() != 40) throw new RuntimeException("solucionPrevExp X should be 40, was " + prevExp.getX());
            if (sep15.getX() != 40) throw new RuntimeException("jSeparator15 X should be 40, was " + sep15.getX());
            if (noSolExp.getX() != 70) throw new RuntimeException("noSolucionesExp X should be 70, was " + noSolExp.getX());
            if (postExp.getX() != 170) throw new RuntimeException("solucionPostExp X should be 170, was " + postExp.getX());

            System.out.println("TEST_ALIGNMENT_EXPLICACION: OK (flush with jSeparator15 at x=40)");

            var noPartidaField = LocuraInstantaneaFrame.class.getDeclaredField("noPartida");
            noPartidaField.setAccessible(true);
            JComboBox<String> noPartida = (JComboBox<String>) noPartidaField.get(frame);

            frame.partidas.clear();
            Cubo c1 = dummyCubo("R");
            Cubo c2 = dummyCubo("B");
            Cubo c3 = dummyCubo("V");

            Partida p1 = new Partida(c1, c1, c1, c1, false, new ArrayList<>());
            Partida p2 = new Partida(c2, c2, c2, c2, true, new ArrayList<>());
            Partida p3 = new Partida(c3, c3, c3, c3, true, new ArrayList<>());

            frame.partidas.add(p1);
            frame.partidas.add(p2);
            frame.partidas.add(p3);
            frame.iPartida = 3;

            frame.refrescarComboHistorial();

            if (noPartida.getItemCount() != 3) throw new RuntimeException("Combo item count should be 3, was " + noPartida.getItemCount());
            if (!noPartida.getItemAt(0).startsWith("3")) throw new RuntimeException("Top item should be Game 3, was " + noPartida.getItemAt(0));
            if (!noPartida.getItemAt(1).startsWith("2")) throw new RuntimeException("Middle item should be Game 2, was " + noPartida.getItemAt(1));
            if (!noPartida.getItemAt(2).startsWith("1")) throw new RuntimeException("Bottom item should be Game 1, was " + noPartida.getItemAt(2));

            noPartida.setSelectedIndex(0);
            Partida sel0 = frame.getPartidaSeleccionada();
            if (sel0 != p3) throw new RuntimeException("Selected item at index 0 should be p3 (most recent)");

            noPartida.setSelectedIndex(1);
            Partida sel1 = frame.getPartidaSeleccionada();
            if (sel1 != p2) throw new RuntimeException("Selected item at index 1 should be p2");

            noPartida.setSelectedIndex(2);
            Partida sel2 = frame.getPartidaSeleccionada();
            if (sel2 != p1) throw new RuntimeException("Selected item at index 2 should be p1 (oldest)");

            System.out.println("TEST_HISTORIAL_INVERSION: OK (most recent at top index 0, oldest at bottom)");
            System.out.println("ALL INVERSION AND UI TESTS PASSED SUCCESSFULLY.");
        } catch (Throwable t) {
            t.printStackTrace();
            System.exit(1);
        }
        System.exit(0);
    }
}