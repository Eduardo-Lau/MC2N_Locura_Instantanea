package locura_instantanea.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Gestor centralizado de persistencia en disco de partidas y configuraciones de cubos.
 * Maneja rutas compatibles con cualquier sistema operativo y crea carpetas si no existen.
 */
public class GestorPersistencia {

    private static final String CARPETA_BINARIOS = "Binarios";
    private static final String ARCHIVO_CUBOS = CARPETA_BINARIOS + File.separator + "Cubos.bin";
    private static final String ARCHIVO_PARTIDAS = CARPETA_BINARIOS + File.separator + "Partidas.bin";

    static {
        File dir = new File(CARPETA_BINARIOS);
        if (!dir.exists()) {
            dir.mkdirs();
        }
    }

    public static void guardarCubos(EstadoPartidaDTO cubo1, EstadoPartidaDTO cubo2,
                                   EstadoPartidaDTO cubo3, EstadoPartidaDTO cubo4) {
        File file = new File(ARCHIVO_CUBOS);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(cubo1);
            oos.writeObject(cubo2);
            oos.writeObject(cubo3);
            oos.writeObject(cubo4);
            System.out.println("Cubos guardados correctamente en " + ARCHIVO_CUBOS);
        } catch (IOException e) {
            System.err.println("Error al guardar cubos: " + e.getMessage());
        }
    }

    public static EstadoPartidaDTO[] cargarCubos() {
        File file = new File(ARCHIVO_CUBOS);
        if (!file.exists()) {
            return null;
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            EstadoPartidaDTO[] cubos = new EstadoPartidaDTO[4];
            cubos[0] = (EstadoPartidaDTO) ois.readObject();
            cubos[1] = (EstadoPartidaDTO) ois.readObject();
            cubos[2] = (EstadoPartidaDTO) ois.readObject();
            cubos[3] = (EstadoPartidaDTO) ois.readObject();
            System.out.println("Cubos cargados con éxito desde " + ARCHIVO_CUBOS);
            return cubos;
        } catch (Exception e) {
            System.err.println("No se pudieron cargar los cubos previos (esquema nuevo o archivo ausente): " + e.getMessage());
            return null;
        }
    }

    public static void guardarPartidas(ArrayList<EstadoPartidaDTO> partidas, EstadoPartidaDTO solucionAplicada) {
        File file = new File(ARCHIVO_PARTIDAS);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(partidas);
            oos.writeObject(solucionAplicada);
            System.out.println("Partidas guardadas correctamente en " + ARCHIVO_PARTIDAS);
        } catch (IOException e) {
            System.err.println("Error al guardar partidas: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static Object[] cargarPartidas() {
        File file = new File(ARCHIVO_PARTIDAS);
        if (!file.exists()) {
            return null;
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            ArrayList<EstadoPartidaDTO> partidas = (ArrayList<EstadoPartidaDTO>) ois.readObject();
            EstadoPartidaDTO solucionAplicada = (EstadoPartidaDTO) ois.readObject();
            System.out.println("Partidas cargadas con éxito: " + (partidas != null ? partidas.size() : 0));
            return new Object[]{partidas, solucionAplicada};
        } catch (Exception e) {
            System.err.println("No se pudieron cargar las partidas previas: " + e.getMessage());
            return null;
        }
    }
}

