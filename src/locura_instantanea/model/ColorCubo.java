package locura_instantanea.model;

import java.awt.Color;
import java.io.Serializable;

/**
 * Representa los colores permitidos en el juego Locura Instantánea.
 */
public enum ColorCubo implements Serializable {
    ROJO((byte) 0, "R", "Rojo", new Color(155, 22, 57)),
    BLANCO((byte) 1, "B", "Blanco", new Color(255, 255, 255)),
    VERDE((byte) 2, "V", "Verde", new Color(16, 175, 107)),
    AMARILLO((byte) 3, "A", "Amarillo", new Color(255, 234, 78));

    private final byte id;
    private final String codigo;
    private final String nombre;
    private final Color colorAwt;

    ColorCubo(byte id, String codigo, String nombre, Color colorAwt) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.colorAwt = colorAwt;
    }

    public byte getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Color getColorAwt() {
        return colorAwt;
    }

    public static ColorCubo desdeCodigo(String codigo) {
        if (codigo == null) return null;
        for (ColorCubo c : values()) {
            if (c.codigo.equalsIgnoreCase(codigo) || c.nombre.equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }

    public static ColorCubo desdeId(byte id) {
        for (ColorCubo c : values()) {
            if (c.id == id) {
                return c;
            }
        }
        return null;
    }

    public static ColorCubo desdeColorAwt(Color color) {
        if (color == null) return null;
        for (ColorCubo c : values()) {
            if (c.colorAwt.equals(color)) {
                return c;
            }
        }
        return null;
    }
}

