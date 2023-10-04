/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locura.instantanea;

import javax.swing.UIManager;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.mxgraph.layout.mxParallelEdgeLayout;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;
import javax.swing.JOptionPane;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.ImageIcon;

/**
 *
 * @author carlo
 */
public class Locura_Instantánea extends javax.swing.JFrame implements Serializable {

    public static Cubos Cubo1 = new Cubos();
    public static Cubos Cubo2 = new Cubos();
    public static Cubos Cubo3 = new Cubos();
    public static Cubos Cubo4 = new Cubos();
    // Binarios
    public static Binarios Cubo1Bin = new Binarios();
    public static Binarios Cubo2Bin = new Binarios();
    public static Binarios Cubo3Bin = new Binarios();
    public static Binarios Cubo4Bin = new Binarios();

    //BIN Cubos
    // Guardar
    public static FileOutputStream F_binCubosOut;
    public static String binCubosNOut = "Binarios\\Cubos.bin";
    public static ObjectOutputStream O_binCubosOut;
    // Cargar
    public static FileInputStream F_binCubosIn;
    public static String binCubosNIn = "Binarios\\Cubos.bin";
    public static ObjectInputStream O_binCubosIn;

    boolean sigBtnPressed = false;
    boolean resuelto = false;
    ImageIcon icono = new ImageIcon("Binarios\\logo.png");
    ImageIcon fondo = new ImageIcon("Binarios\\fondo.png");

    Point posCubo1Abs = new Point(260, 540);
    Point posCubo2Abs = new Point(260, 480);
    Point posCubo3Abs = new Point(260, 420);
    Point posCubo4Abs = new Point(260, 360);

    public Locura_Instantánea() {

        initComponents();
        BinariosIn();
        this.setIconImage(icono.getImage());
        this.setTitle("Locura Instantánea");

        this.setLocationRelativeTo(null);
        this.setResizable(false);
        resueltoLbl.setVisible(false);

        if (Cubo1.C1 == null) {
            Cubo1C1G.setVisible(false);
            Cubo1C2G.setVisible(false);
            Cubo1C3G.setVisible(false);
            Cubo1C4G.setVisible(false);
            Cubo1C5G.setVisible(false);
            Cubo1C6G.setVisible(false);

        } else {
            if (Cubo1.C1I.equals("R")) {
                Cubo1C1.setSelectedItem("Rojo");
                Cubo1C1G.setText("R");
                Cubo1C1G.setBackground(Cubo1.C1);
            } else if (Cubo1.C1I.equals("B")) {
                Cubo1C1.setSelectedItem("Blanco");
                Cubo1C1G.setText("B");
                Cubo1C1G.setBackground(Cubo1.C1);
            } else if (Cubo1.C1I.equals("V")) {
                Cubo1C1.setSelectedItem("Verde");
                Cubo1C1G.setText("V");
                Cubo1C1G.setBackground(Cubo1.C1);
            } else if (Cubo1.C1I.equals("A")) {
                Cubo1C1.setSelectedItem("Amarillo");
                Cubo1C1G.setText("A");
                Cubo1C1G.setBackground(Cubo1.C1);
            }

            if (Cubo1.C2I.equals("R")) {
                Cubo1C2.setSelectedItem("Rojo");
                Cubo1C2G.setText("R");
                Cubo1C2G.setBackground(Cubo1.C2);
            } else if (Cubo1.C2I.equals("B")) {
                Cubo1C2.setSelectedItem("Blanco");
                Cubo1C2G.setText("B");
                Cubo1C2G.setBackground(Cubo1.C2);
            } else if (Cubo1.C2I.equals("V")) {
                Cubo1C2.setSelectedItem("Verde");
                Cubo1C2G.setText("V");
                Cubo1C2G.setBackground(Cubo1.C2);
            } else if (Cubo1.C2I.equals("A")) {
                Cubo1C2.setSelectedItem("Amarillo");
                Cubo1C2G.setText("A");
                Cubo1C2G.setBackground(Cubo1.C2);
            }

            if (Cubo1.C3I.equals("R")) {
                Cubo1C3.setSelectedItem("Rojo");
                Cubo1C3G.setText("R");
                Cubo1C3G.setBackground(Cubo1.C3);
            } else if (Cubo1.C3I.equals("B")) {
                Cubo1C3.setSelectedItem("Blanco");
                Cubo1C3G.setText("B");
                Cubo1C3G.setBackground(Cubo1.C3);
            } else if (Cubo1.C3I.equals("V")) {
                Cubo1C3.setSelectedItem("Verde");
                Cubo1C3G.setText("V");
                Cubo1C3G.setBackground(Cubo1.C3);
            } else if (Cubo1.C3I.equals("A")) {
                Cubo1C3.setSelectedItem("Amarillo");
                Cubo1C3G.setText("A");
                Cubo1C3G.setBackground(Cubo1.C3);
            }

            if (Cubo1.C4I.equals("R")) {
                Cubo1C4.setSelectedItem("Rojo");
                Cubo1C4G.setText("R");
                Cubo1C4G.setBackground(Cubo1.C4);
            } else if (Cubo1.C4I.equals("B")) {
                Cubo1C4.setSelectedItem("Blanco");
                Cubo1C4G.setText("B");
                Cubo1C4G.setBackground(Cubo1.C4);
            } else if (Cubo1.C4I.equals("V")) {
                Cubo1C4.setSelectedItem("Verde");
                Cubo1C4G.setText("V");
                Cubo1C4G.setBackground(Cubo1.C4);
            } else if (Cubo1.C4I.equals("A")) {
                Cubo1C4.setSelectedItem("Amarillo");
                Cubo1C4G.setText("A");
                Cubo1C4G.setBackground(Cubo1.C4);
            }

            if (Cubo1.C5I.equals("R")) {
                Cubo1C5.setSelectedItem("Rojo");
                Cubo1C5G.setText("R");
                Cubo1C5G.setBackground(Cubo1.C5);
            } else if (Cubo1.C5I.equals("B")) {
                Cubo1C5.setSelectedItem("Blanco");
                Cubo1C5G.setText("B");
                Cubo1C5G.setBackground(Cubo1.C5);
            } else if (Cubo1.C5I.equals("V")) {
                Cubo1C5.setSelectedItem("Verde");
                Cubo1C5G.setText("V");
                Cubo1C5G.setBackground(Cubo1.C5);
            } else if (Cubo1.C5I.equals("A")) {
                Cubo1C5.setSelectedItem("Amarillo");
                Cubo1C5G.setText("A");
                Cubo1C5G.setBackground(Cubo1.C5);
            }

            if (Cubo1.C6I.equals("R")) {
                Cubo1C6.setSelectedItem("Rojo");
                Cubo1C6G.setText("R");
                Cubo1C6G.setBackground(Cubo1.C6);
            } else if (Cubo1.C6I.equals("B")) {
                Cubo1C6.setSelectedItem("Blanco");
                Cubo1C6G.setText("B");
                Cubo1C6G.setBackground(Cubo1.C6);
            } else if (Cubo1.C6I.equals("V")) {
                Cubo1C6.setSelectedItem("Verde");
                Cubo1C6G.setText("V");
                Cubo1C6G.setBackground(Cubo1.C6);
            } else if (Cubo1.C6I.equals("A")) {
                Cubo1C6.setSelectedItem("Amarillo");
                Cubo1C6G.setText("A");
                Cubo1C6G.setBackground(Cubo1.C6);
            }
        }

        if (Cubo2.C1 == null) {
            Cubo2C1G.setVisible(false);
            Cubo2C2G.setVisible(false);
            Cubo2C3G.setVisible(false);
            Cubo2C4G.setVisible(false);
            Cubo2C5G.setVisible(false);
            Cubo2C6G.setVisible(false);

        } else {
            if (Cubo2.C1I.equals("R")) {
                Cubo2C1.setSelectedItem("Rojo");
                Cubo2C1G.setText("R");
                Cubo2C1G.setBackground(Cubo2.C1);
            } else if (Cubo2.C1I.equals("B")) {
                Cubo2C1.setSelectedItem("Blanco");
                Cubo2C1G.setText("B");
                Cubo2C1G.setBackground(Cubo2.C1);
            } else if (Cubo2.C1I.equals("V")) {
                Cubo2C1.setSelectedItem("Verde");
                Cubo2C1G.setText("V");
                Cubo2C1G.setBackground(Cubo2.C1);
            } else if (Cubo2.C1I.equals("A")) {
                Cubo2C1.setSelectedItem("Amarillo");
                Cubo2C1G.setText("A");
                Cubo2C1G.setBackground(Cubo2.C1);
            }

            if (Cubo2.C2I.equals("R")) {
                Cubo2C2.setSelectedItem("Rojo");
                Cubo2C2G.setText("R");
                Cubo2C2G.setBackground(Cubo2.C2);
            } else if (Cubo2.C2I.equals("B")) {
                Cubo2C2.setSelectedItem("Blanco");
                Cubo2C2G.setText("B");
                Cubo2C2G.setBackground(Cubo2.C2);
            } else if (Cubo2.C2I.equals("V")) {
                Cubo2C2.setSelectedItem("Verde");
                Cubo2C2G.setText("V");
                Cubo2C2G.setBackground(Cubo2.C2);
            } else if (Cubo2.C2I.equals("A")) {
                Cubo2C2.setSelectedItem("Amarillo");
                Cubo2C2G.setText("A");
                Cubo2C2G.setBackground(Cubo2.C2);
            }

            if (Cubo2.C3I.equals("R")) {
                Cubo2C3.setSelectedItem("Rojo");
                Cubo2C3G.setText("R");
                Cubo2C3G.setBackground(Cubo2.C3);
            } else if (Cubo2.C3I.equals("B")) {
                Cubo2C3.setSelectedItem("Blanco");
                Cubo2C3G.setText("B");
                Cubo2C3G.setBackground(Cubo2.C3);
            } else if (Cubo2.C3I.equals("V")) {
                Cubo2C3.setSelectedItem("Verde");
                Cubo2C3G.setText("V");
                Cubo2C3G.setBackground(Cubo2.C3);
            } else if (Cubo2.C3I.equals("A")) {
                Cubo2C3.setSelectedItem("Amarillo");
                Cubo2C3G.setText("A");
                Cubo2C3G.setBackground(Cubo2.C3);
            }

            if (Cubo2.C4I.equals("R")) {
                Cubo2C4.setSelectedItem("Rojo");
                Cubo2C4G.setText("R");
                Cubo2C4G.setBackground(Cubo2.C4);
            } else if (Cubo2.C4I.equals("B")) {
                Cubo2C4.setSelectedItem("Blanco");
                Cubo2C4G.setText("B");
                Cubo2C4G.setBackground(Cubo2.C4);
            } else if (Cubo2.C4I.equals("V")) {
                Cubo2C4.setSelectedItem("Verde");
                Cubo2C4G.setText("V");
                Cubo2C4G.setBackground(Cubo2.C4);
            } else if (Cubo2.C4I.equals("A")) {
                Cubo2C4.setSelectedItem("Amarillo");
                Cubo2C4G.setText("A");
                Cubo2C4G.setBackground(Cubo2.C4);
            }

            if (Cubo2.C5I.equals("R")) {
                Cubo2C5.setSelectedItem("Rojo");
                Cubo2C5G.setText("R");
                Cubo2C5G.setBackground(Cubo2.C5);
            } else if (Cubo2.C5I.equals("B")) {
                Cubo2C5.setSelectedItem("Blanco");
                Cubo2C5G.setText("B");
                Cubo2C5G.setBackground(Cubo2.C5);
            } else if (Cubo2.C5I.equals("V")) {
                Cubo2C5.setSelectedItem("Verde");
                Cubo2C5G.setText("V");
                Cubo2C5G.setBackground(Cubo2.C5);
            } else if (Cubo2.C5I.equals("A")) {
                Cubo2C5.setSelectedItem("Amarillo");
                Cubo2C5G.setText("A");
                Cubo2C5G.setBackground(Cubo2.C5);
            }

            if (Cubo2.C6I.equals("R")) {
                Cubo2C6.setSelectedItem("Rojo");
                Cubo2C6G.setText("R");
                Cubo2C6G.setBackground(Cubo2.C6);
            } else if (Cubo2.C6I.equals("B")) {
                Cubo2C6.setSelectedItem("Blanco");
                Cubo2C6G.setText("B");
                Cubo2C6G.setBackground(Cubo2.C6);
            } else if (Cubo2.C6I.equals("V")) {
                Cubo2C6.setSelectedItem("Verde");
                Cubo2C6G.setText("V");
                Cubo2C6G.setBackground(Cubo2.C6);
            } else if (Cubo2.C6I.equals("A")) {
                Cubo2C6.setSelectedItem("Amarillo");
                Cubo2C6G.setText("A");
                Cubo2C6G.setBackground(Cubo2.C6);
            }
        }

        if (Cubo3.C1 == null) {
            Cubo3C1G.setVisible(false);
            Cubo3C2G.setVisible(false);
            Cubo3C3G.setVisible(false);
            Cubo3C4G.setVisible(false);
            Cubo3C5G.setVisible(false);
            Cubo3C6G.setVisible(false);

        } else {
            if (Cubo3.C1I.equals("R")) {
                Cubo3C1.setSelectedItem("Rojo");
                Cubo3C1G.setText("R");
                Cubo3C1G.setBackground(Cubo3.C1);
            } else if (Cubo3.C1I.equals("B")) {
                Cubo3C1.setSelectedItem("Blanco");
                Cubo3C1G.setText("B");
                Cubo3C1G.setBackground(Cubo3.C1);
            } else if (Cubo3.C1I.equals("V")) {
                Cubo3C1.setSelectedItem("Verde");
                Cubo3C1G.setText("V");
                Cubo3C1G.setBackground(Cubo3.C1);
            } else if (Cubo3.C1I.equals("A")) {
                Cubo3C1.setSelectedItem("Amarillo");
                Cubo3C1G.setText("A");
                Cubo3C1G.setBackground(Cubo3.C1);
            }

            if (Cubo3.C2I.equals("R")) {
                Cubo3C2.setSelectedItem("Rojo");
                Cubo3C2G.setText("R");
                Cubo3C2G.setBackground(Cubo3.C2);
            } else if (Cubo3.C2I.equals("B")) {
                Cubo3C2.setSelectedItem("Blanco");
                Cubo3C2G.setText("B");
                Cubo3C2G.setBackground(Cubo3.C2);
            } else if (Cubo3.C2I.equals("V")) {
                Cubo3C2.setSelectedItem("Verde");
                Cubo3C2G.setText("V");
                Cubo3C2G.setBackground(Cubo3.C2);
            } else if (Cubo3.C2I.equals("A")) {
                Cubo3C2.setSelectedItem("Amarillo");
                Cubo3C2G.setText("A");
                Cubo3C2G.setBackground(Cubo3.C2);
            }

            if (Cubo3.C3I.equals("R")) {
                Cubo3C3.setSelectedItem("Rojo");
                Cubo3C3G.setText("R");
                Cubo3C3G.setBackground(Cubo3.C3);
            } else if (Cubo3.C3I.equals("B")) {
                Cubo3C3.setSelectedItem("Blanco");
                Cubo3C3G.setText("B");
                Cubo3C3G.setBackground(Cubo3.C3);
            } else if (Cubo3.C3I.equals("V")) {
                Cubo3C3.setSelectedItem("Verde");
                Cubo3C3G.setText("V");
                Cubo3C3G.setBackground(Cubo3.C3);
            } else if (Cubo3.C3I.equals("A")) {
                Cubo3C3.setSelectedItem("Amarillo");
                Cubo3C3G.setText("A");
                Cubo3C3G.setBackground(Cubo3.C3);
            }

            if (Cubo3.C4I.equals("R")) {
                Cubo3C4.setSelectedItem("Rojo");
                Cubo3C4G.setText("R");
                Cubo3C4G.setBackground(Cubo3.C4);
            } else if (Cubo3.C4I.equals("B")) {
                Cubo3C4.setSelectedItem("Blanco");
                Cubo3C4G.setText("B");
                Cubo3C4G.setBackground(Cubo3.C4);
            } else if (Cubo3.C4I.equals("V")) {
                Cubo3C4.setSelectedItem("Verde");
                Cubo3C4G.setText("V");
                Cubo3C4G.setBackground(Cubo3.C4);
            } else if (Cubo3.C4I.equals("A")) {
                Cubo3C4.setSelectedItem("Amarillo");
                Cubo3C4G.setText("A");
                Cubo3C4G.setBackground(Cubo3.C4);
            }

            if (Cubo3.C5I.equals("R")) {
                Cubo3C5.setSelectedItem("Rojo");
                Cubo3C5G.setText("R");
                Cubo3C5G.setBackground(Cubo3.C5);
            } else if (Cubo3.C5I.equals("B")) {
                Cubo3C5.setSelectedItem("Blanco");
                Cubo3C5G.setText("B");
                Cubo3C5G.setBackground(Cubo3.C5);
            } else if (Cubo3.C5I.equals("V")) {
                Cubo3C5.setSelectedItem("Verde");
                Cubo3C5G.setText("V");
                Cubo3C5G.setBackground(Cubo3.C5);
            } else if (Cubo3.C5I.equals("A")) {
                Cubo3C5.setSelectedItem("Amarillo");
                Cubo3C5G.setText("A");
                Cubo3C5G.setBackground(Cubo3.C5);
            }

            if (Cubo3.C6I.equals("R")) {
                Cubo3C6.setSelectedItem("Rojo");
                Cubo3C6G.setText("R");
                Cubo3C6G.setBackground(Cubo3.C6);
            } else if (Cubo3.C6I.equals("B")) {
                Cubo3C6.setSelectedItem("Blanco");
                Cubo3C6G.setText("B");
                Cubo3C6G.setBackground(Cubo3.C6);
            } else if (Cubo3.C6I.equals("V")) {
                Cubo3C6.setSelectedItem("Verde");
                Cubo3C6G.setText("V");
                Cubo3C6G.setBackground(Cubo3.C6);
            } else if (Cubo3.C6I.equals("A")) {
                Cubo3C6.setSelectedItem("Amarillo");
                Cubo3C6G.setText("A");
                Cubo3C6G.setBackground(Cubo3.C6);
            }
        }

        if (Cubo4.C1 == null) {
            Cubo4C1G.setVisible(false);
            Cubo4C2G.setVisible(false);
            Cubo4C3G.setVisible(false);
            Cubo4C4G.setVisible(false);
            Cubo4C5G.setVisible(false);
            Cubo4C6G.setVisible(false);

        } else {
            if (Cubo4.C1I.equals("R")) {
                Cubo4C1.setSelectedItem("Rojo");
                Cubo4C1G.setText("R");
                Cubo4C1G.setBackground(Cubo4.C1);
            } else if (Cubo4.C1I.equals("B")) {
                Cubo4C1.setSelectedItem("Blanco");
                Cubo4C1G.setText("B");
                Cubo4C1G.setBackground(Cubo4.C1);
            } else if (Cubo4.C1I.equals("V")) {
                Cubo4C1.setSelectedItem("Verde");
                Cubo4C1G.setText("V");
                Cubo4C1G.setBackground(Cubo4.C1);
            } else if (Cubo4.C1I.equals("A")) {
                Cubo4C1.setSelectedItem("Amarillo");
                Cubo4C1G.setText("A");
                Cubo4C1G.setBackground(Cubo4.C1);
            }

            if (Cubo4.C2I.equals("R")) {
                Cubo4C2.setSelectedItem("Rojo");
                Cubo4C2G.setText("R");
                Cubo4C2G.setBackground(Cubo4.C2);
            } else if (Cubo4.C2I.equals("B")) {
                Cubo4C2.setSelectedItem("Blanco");
                Cubo4C2G.setText("B");
                Cubo4C2G.setBackground(Cubo4.C2);
            } else if (Cubo4.C2I.equals("V")) {
                Cubo4C2.setSelectedItem("Verde");
                Cubo4C2G.setText("V");
                Cubo4C2G.setBackground(Cubo4.C2);
            } else if (Cubo4.C2I.equals("A")) {
                Cubo4C2.setSelectedItem("Amarillo");
                Cubo4C2G.setText("A");
                Cubo4C2G.setBackground(Cubo4.C2);
            }

            if (Cubo4.C3I.equals("R")) {
                Cubo4C3.setSelectedItem("Rojo");
                Cubo4C3G.setText("R");
                Cubo4C3G.setBackground(Cubo4.C3);
            } else if (Cubo4.C3I.equals("B")) {
                Cubo4C3.setSelectedItem("Blanco");
                Cubo4C3G.setText("B");
                Cubo4C3G.setBackground(Cubo4.C3);
            } else if (Cubo4.C3I.equals("V")) {
                Cubo4C3.setSelectedItem("Verde");
                Cubo4C3G.setText("V");
                Cubo4C3G.setBackground(Cubo4.C3);
            } else if (Cubo4.C3I.equals("A")) {
                Cubo4C3.setSelectedItem("Amarillo");
                Cubo4C3G.setText("A");
                Cubo4C3G.setBackground(Cubo4.C3);
            }

            if (Cubo4.C4I.equals("R")) {
                Cubo4C4.setSelectedItem("Rojo");
                Cubo4C4G.setText("R");
                Cubo4C4G.setBackground(Cubo4.C4);
            } else if (Cubo4.C4I.equals("B")) {
                Cubo4C4.setSelectedItem("Blanco");
                Cubo4C4G.setText("B");
                Cubo4C4G.setBackground(Cubo4.C4);
            } else if (Cubo4.C4I.equals("V")) {
                Cubo4C4.setSelectedItem("Verde");
                Cubo4C4G.setText("V");
                Cubo4C4G.setBackground(Cubo4.C4);
            } else if (Cubo4.C4I.equals("A")) {
                Cubo4C4.setSelectedItem("Amarillo");
                Cubo4C4G.setText("A");
                Cubo4C4G.setBackground(Cubo4.C4);
            }

            if (Cubo4.C5I.equals("R")) {
                Cubo4C5.setSelectedItem("Rojo");
                Cubo4C5G.setText("R");
                Cubo4C5G.setBackground(Cubo4.C5);
            } else if (Cubo4.C5I.equals("B")) {
                Cubo4C5.setSelectedItem("Blanco");
                Cubo4C5G.setText("B");
                Cubo4C5G.setBackground(Cubo4.C5);
            } else if (Cubo4.C5I.equals("V")) {
                Cubo4C5.setSelectedItem("Verde");
                Cubo4C5G.setText("V");
                Cubo4C5G.setBackground(Cubo4.C5);
            } else if (Cubo4.C5I.equals("A")) {
                Cubo4C5.setSelectedItem("Amarillo");
                Cubo4C5G.setText("A");
                Cubo4C5G.setBackground(Cubo4.C5);
            }

            if (Cubo4.C6I.equals("R")) {
                Cubo4C6.setSelectedItem("Rojo");
                Cubo4C6G.setText("R");
                Cubo4C6G.setBackground(Cubo4.C6);
            } else if (Cubo4.C6I.equals("B")) {
                Cubo4C6.setSelectedItem("Blanco");
                Cubo4C6G.setText("B");
                Cubo4C6G.setBackground(Cubo4.C6);
            } else if (Cubo4.C6I.equals("V")) {
                Cubo4C6.setSelectedItem("Verde");
                Cubo4C6G.setText("V");
                Cubo4C6G.setBackground(Cubo4.C6);
            } else if (Cubo4.C6I.equals("A")) {
                Cubo4C6.setSelectedItem("Amarillo");
                Cubo4C6G.setText("A");
                Cubo4C6G.setBackground(Cubo4.C6);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        Cubo1C1 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        Cubo1C2 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        Cubo1C3 = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        Cubo1C4 = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        Cubo1C5 = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        Cubo1C6 = new javax.swing.JComboBox<>();
        genCubo1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        Cubo3C1 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        Cubo3C2 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        Cubo3C3 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        Cubo3C4 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        Cubo3C5 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        Cubo3C6 = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        Cubo4C1 = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        Cubo4C2 = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        Cubo4C3 = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        Cubo4C4 = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        Cubo4C5 = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        Cubo4C6 = new javax.swing.JComboBox<>();
        jugarBtn = new javax.swing.JButton();
        genCubo3 = new javax.swing.JButton();
        genCubo4 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        Cubo2C1 = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        Cubo2C2 = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        Cubo2C3 = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        Cubo2C4 = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        Cubo2C5 = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();
        Cubo2C6 = new javax.swing.JComboBox<>();
        genCubo2 = new javax.swing.JButton();
        genAleatorio = new javax.swing.JButton();
        Cubo1C5G = new javax.swing.JLabel();
        Cubo1C3G = new javax.swing.JLabel();
        Cubo1C1G = new javax.swing.JLabel();
        Cubo1C2G = new javax.swing.JLabel();
        Cubo1C6G = new javax.swing.JLabel();
        Cubo1C4G = new javax.swing.JLabel();
        Cubo2C1G = new javax.swing.JLabel();
        Cubo2C3G = new javax.swing.JLabel();
        Cubo2C5G = new javax.swing.JLabel();
        Cubo2C2G = new javax.swing.JLabel();
        Cubo2C6G = new javax.swing.JLabel();
        Cubo2C4G = new javax.swing.JLabel();
        Cubo3C1G = new javax.swing.JLabel();
        Cubo3C3G = new javax.swing.JLabel();
        Cubo3C5G = new javax.swing.JLabel();
        Cubo3C2G = new javax.swing.JLabel();
        Cubo3C6G = new javax.swing.JLabel();
        Cubo3C4G = new javax.swing.JLabel();
        Cubo4C1G = new javax.swing.JLabel();
        Cubo4C3G = new javax.swing.JLabel();
        Cubo4C5G = new javax.swing.JLabel();
        Cubo4C2G = new javax.swing.JLabel();
        Cubo4C6G = new javax.swing.JLabel();
        Cubo4C4G = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        resolverBtn = new javax.swing.JButton();
        Cubo4C3T = new javax.swing.JLabel();
        arribaCubo1 = new javax.swing.JButton();
        izquierdaCubo1 = new javax.swing.JButton();
        Cubo1C5J = new javax.swing.JLabel();
        Cubo1C6J = new javax.swing.JLabel();
        Cubo1C4J = new javax.swing.JLabel();
        Cubo1C3J = new javax.swing.JLabel();
        derechaCubo1 = new javax.swing.JButton();
        abajoCubo1 = new javax.swing.JButton();
        Cubo1C2J = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        horarioCubo1 = new javax.swing.JButton();
        antihorarioCubo1 = new javax.swing.JButton();
        Cubo2C1J = new javax.swing.JLabel();
        izquierdaCubo2 = new javax.swing.JButton();
        Cubo2C6J = new javax.swing.JLabel();
        Cubo2C4J = new javax.swing.JLabel();
        Cubo2C5J = new javax.swing.JLabel();
        Cubo2C3J = new javax.swing.JLabel();
        arribaCubo2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Cubo2C2J = new javax.swing.JLabel();
        derechaCubo2 = new javax.swing.JButton();
        abajoCubo2 = new javax.swing.JButton();
        horarioCubo2 = new javax.swing.JButton();
        antihorarioCubo2 = new javax.swing.JButton();
        Cubo3C1J = new javax.swing.JLabel();
        izquierdaCubo3 = new javax.swing.JButton();
        Cubo3C6J = new javax.swing.JLabel();
        Cubo3C4J = new javax.swing.JLabel();
        Cubo3C5J = new javax.swing.JLabel();
        Cubo3C3J = new javax.swing.JLabel();
        arribaCubo3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        Cubo3C2J = new javax.swing.JLabel();
        derechaCubo3 = new javax.swing.JButton();
        abajoCubo3 = new javax.swing.JButton();
        horarioCubo3 = new javax.swing.JButton();
        antihorarioCubo3 = new javax.swing.JButton();
        Cubo4C1J = new javax.swing.JLabel();
        izquierdaCubo4 = new javax.swing.JButton();
        Cubo4C6J = new javax.swing.JLabel();
        Cubo4C4J = new javax.swing.JLabel();
        Cubo4C5J = new javax.swing.JLabel();
        Cubo4C3J = new javax.swing.JLabel();
        arribaCubo4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        Cubo4C2J = new javax.swing.JLabel();
        derechaCubo4 = new javax.swing.JButton();
        abajoCubo4 = new javax.swing.JButton();
        horarioCubo4 = new javax.swing.JButton();
        antihorarioCubo4 = new javax.swing.JButton();
        comprobarBtn = new javax.swing.JButton();
        Cubo1C1J = new javax.swing.JLabel();
        Cubo1C3T = new javax.swing.JLabel();
        Cubo2C3T = new javax.swing.JLabel();
        Cubo3C3T = new javax.swing.JLabel();
        resueltoLbl = new javax.swing.JLabel();
        Cubo4C4T = new javax.swing.JLabel();
        Cubo3C4T = new javax.swing.JLabel();
        Cubo2C4T = new javax.swing.JLabel();
        Cubo1C4T = new javax.swing.JLabel();
        Cubo4C5T = new javax.swing.JLabel();
        Cubo3C5T = new javax.swing.JLabel();
        Cubo2C5T = new javax.swing.JLabel();
        Cubo1C5T = new javax.swing.JLabel();
        Cubo4C6T = new javax.swing.JLabel();
        Cubo3C6T = new javax.swing.JLabel();
        Cubo2C6T = new javax.swing.JLabel();
        Cubo1C6T = new javax.swing.JLabel();
        Cubo4Lbl = new javax.swing.JLabel();
        Cubo1Lbl = new javax.swing.JLabel();
        Cubo2Lbl = new javax.swing.JLabel();
        Cubo3Lbl = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        explicacionBtn = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        InterCubo1_Cubo2 = new javax.swing.JButton();
        InterCubo2_Cubo3 = new javax.swing.JButton();
        InterCubo3_Cubo4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        existeSolucion = new javax.swing.JLabel();
        porLoTanto1 = new javax.swing.JLabel();
        porLoTanto2 = new javax.swing.JLabel();
        Cubo1C1E = new javax.swing.JLabel();
        Cubo1C6E = new javax.swing.JLabel();
        Cubo1C3E = new javax.swing.JLabel();
        Cubo1C5E = new javax.swing.JLabel();
        Cubo1C4E = new javax.swing.JLabel();
        Cubo2C3E = new javax.swing.JLabel();
        Cubo2C6E = new javax.swing.JLabel();
        Cubo2C5E = new javax.swing.JLabel();
        Cubo2C4E = new javax.swing.JLabel();
        Cubo2C1E = new javax.swing.JLabel();
        Cubo3C3E = new javax.swing.JLabel();
        Cubo3C6E = new javax.swing.JLabel();
        Cubo3C5E = new javax.swing.JLabel();
        Cubo3C4E = new javax.swing.JLabel();
        Cubo3C1E = new javax.swing.JLabel();
        Cubo4C3E = new javax.swing.JLabel();
        Cubo4C6E = new javax.swing.JLabel();
        Cubo4C5E = new javax.swing.JLabel();
        Cubo4C4E = new javax.swing.JLabel();
        Cubo4C1E = new javax.swing.JLabel();
        grafoGL = new javax.swing.JPanel();
        grafoG2 = new javax.swing.JPanel();
        grafoG1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locura/fondo2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 930, 780));

        jLabel2.setFont(new java.awt.Font("Snap ITC", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(127, 27, 53));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locura/instantanea/Logo_LocInst.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 14, 698, -1));

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Cubo 1");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 48, 74, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Cubo 2");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 48, 74, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Cubo 3");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 48, 74, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Cubo 4");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 48, 74, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 61, 10, 260));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 68, 12, 260));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 68, 10, 260));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 68, 10, 260));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(877, 68, 10, 260));

        jLabel33.setText("Cara 1");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 96, 43, -1));

        Cubo1C1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo1C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 91, 97, -1));

        jLabel34.setText("Cara 2");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 136, 43, -1));

        Cubo1C2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo1C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 131, 97, -1));

        jLabel35.setText("Cara 3");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 176, 43, -1));

        Cubo1C3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo1C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 171, 97, -1));

        jLabel36.setText("Cara 4");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 216, 43, -1));

        Cubo1C4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo1C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 211, 97, -1));

        jLabel37.setText("Cara 5");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 256, 43, -1));

        Cubo1C5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo1C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 251, 97, -1));

        jLabel38.setText("Cara 6");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 296, 43, -1));

        Cubo1C6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo1C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 291, 97, -1));

        genCubo1.setBackground(new java.awt.Color(147, 157, 255));
        genCubo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genCubo1.setForeground(new java.awt.Color(0, 0, 0));
        genCubo1.setText("Generar");
        genCubo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genCubo1ActionPerformed(evt);
            }
        });
        jPanel1.add(genCubo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 340, -1, -1));

        jLabel21.setText("Cara 1");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 96, 43, -1));

        Cubo3C1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo3C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 91, 97, -1));

        jLabel22.setText("Cara 2");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 136, 43, -1));

        Cubo3C2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo3C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 131, 97, -1));

        jLabel23.setText("Cara 3");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 176, 43, -1));

        Cubo3C3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo3C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 171, 97, -1));

        jLabel24.setText("Cara 4");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 216, 43, -1));

        Cubo3C4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo3C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 211, 97, -1));

        jLabel25.setText("Cara 5");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 256, 43, -1));

        Cubo3C5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo3C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 251, 97, -1));

        jLabel26.setText("Cara 6");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 296, 43, -1));

        Cubo3C6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo3C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 291, 97, -1));

        jLabel39.setText("Cara 1");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 96, 43, -1));

        Cubo4C1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo4C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 91, 97, -1));

        jLabel40.setText("Cara 2");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 136, 43, -1));

        Cubo4C2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo4C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 131, 97, -1));

        jLabel41.setText("Cara 3");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 176, 43, -1));

        Cubo4C3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo4C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 171, 97, -1));

        jLabel42.setText("Cara 4");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 216, 43, -1));

        Cubo4C4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo4C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 211, 97, -1));

        jLabel43.setText("Cara 5");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 256, 43, -1));

        Cubo4C5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo4C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 251, 97, -1));

        jLabel44.setText("Cara 6");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 296, 43, -1));

        Cubo4C6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo4C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 291, 97, -1));

        jugarBtn.setBackground(new java.awt.Color(147, 157, 255));
        jugarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jugarBtn.setForeground(new java.awt.Color(0, 0, 0));
        jugarBtn.setText("JUGAR");
        jugarBtn.setAlignmentX(jTabbedPane1.getAlignmentX());
        jugarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jugarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 180, 36));

        genCubo3.setBackground(new java.awt.Color(147, 157, 255));
        genCubo3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genCubo3.setForeground(new java.awt.Color(0, 0, 0));
        genCubo3.setText("Generar");
        genCubo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genCubo3ActionPerformed(evt);
            }
        });
        jPanel1.add(genCubo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 340, -1, -1));

        genCubo4.setBackground(new java.awt.Color(147, 157, 255));
        genCubo4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genCubo4.setForeground(new java.awt.Color(0, 0, 0));
        genCubo4.setText("Generar");
        genCubo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genCubo4ActionPerformed(evt);
            }
        });
        jPanel1.add(genCubo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 340, -1, -1));

        jLabel45.setText("Cara 1");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 96, 43, -1));

        Cubo2C1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo2C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 91, 97, -1));

        jLabel46.setText("Cara 2");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 135, 43, -1));

        Cubo2C2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo2C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 130, 97, -1));

        jLabel47.setText("Cara 3");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 176, 43, -1));

        Cubo2C3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo2C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 171, 97, -1));

        jLabel48.setText("Cara 4");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 216, 43, -1));

        Cubo2C4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo2C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 211, 97, -1));

        jLabel49.setText("Cara 5");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 256, 43, -1));

        Cubo2C5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo2C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 251, 97, -1));

        jLabel50.setText("Cara 6");
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 296, 43, -1));

        Cubo2C6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        jPanel1.add(Cubo2C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 291, 97, -1));

        genCubo2.setBackground(new java.awt.Color(147, 157, 255));
        genCubo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genCubo2.setForeground(new java.awt.Color(0, 0, 0));
        genCubo2.setText("Generar");
        genCubo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genCubo2ActionPerformed(evt);
            }
        });
        jPanel1.add(genCubo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 340, -1, -1));

        genAleatorio.setBackground(new java.awt.Color(112, 23, 46));
        genAleatorio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genAleatorio.setForeground(new java.awt.Color(255, 255, 255));
        genAleatorio.setText("Generar Aleatorio");
        genAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genAleatorioActionPerformed(evt);
            }
        });
        jPanel1.add(genAleatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 10, 170, -1));

        Cubo1C5G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C5G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C5G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C5G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C5G.setText("5");
        Cubo1C5G.setOpaque(true);
        jPanel1.add(Cubo1C5G, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 458, 31, 31));

        Cubo1C3G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C3G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C3G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C3G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C3G.setText("3");
        Cubo1C3G.setOpaque(true);
        jPanel1.add(Cubo1C3G, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 421, 31, 31));

        Cubo1C1G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C1G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C1G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C1G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C1G.setText("1");
        Cubo1C1G.setOpaque(true);
        jPanel1.add(Cubo1C1G, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 458, 31, 31));

        Cubo1C2G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C2G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C2G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C2G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C2G.setText("2");
        Cubo1C2G.setOpaque(true);
        jPanel1.add(Cubo1C2G, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 458, 31, 31));

        Cubo1C6G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C6G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C6G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C6G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C6G.setText("6");
        Cubo1C6G.setOpaque(true);
        jPanel1.add(Cubo1C6G, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 458, 31, 31));

        Cubo1C4G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C4G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C4G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C4G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C4G.setText("4");
        Cubo1C4G.setOpaque(true);
        jPanel1.add(Cubo1C4G, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 495, 31, 31));

        Cubo2C1G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C1G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C1G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C1G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C1G.setText("1");
        Cubo2C1G.setOpaque(true);
        jPanel1.add(Cubo2C1G, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 458, 31, 31));

        Cubo2C3G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C3G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C3G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C3G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C3G.setText("3");
        Cubo2C3G.setOpaque(true);
        jPanel1.add(Cubo2C3G, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 421, 31, 31));

        Cubo2C5G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C5G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C5G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C5G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C5G.setText("5");
        Cubo2C5G.setOpaque(true);
        jPanel1.add(Cubo2C5G, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 458, 31, 31));

        Cubo2C2G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C2G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C2G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C2G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C2G.setText("2");
        Cubo2C2G.setOpaque(true);
        jPanel1.add(Cubo2C2G, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 458, 31, 31));

        Cubo2C6G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C6G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C6G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C6G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C6G.setText("6");
        Cubo2C6G.setOpaque(true);
        jPanel1.add(Cubo2C6G, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 458, 31, 31));

        Cubo2C4G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C4G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C4G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C4G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C4G.setText("4");
        Cubo2C4G.setOpaque(true);
        jPanel1.add(Cubo2C4G, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 495, 31, 31));

        Cubo3C1G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C1G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C1G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C1G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C1G.setText("1");
        Cubo3C1G.setOpaque(true);
        jPanel1.add(Cubo3C1G, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 458, 31, 31));

        Cubo3C3G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C3G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C3G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C3G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C3G.setText("3");
        Cubo3C3G.setOpaque(true);
        jPanel1.add(Cubo3C3G, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 421, 31, 31));

        Cubo3C5G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C5G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C5G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C5G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C5G.setText("5");
        Cubo3C5G.setOpaque(true);
        jPanel1.add(Cubo3C5G, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 458, 31, 31));

        Cubo3C2G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C2G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C2G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C2G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C2G.setText("2");
        Cubo3C2G.setOpaque(true);
        jPanel1.add(Cubo3C2G, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 458, 31, 31));

        Cubo3C6G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C6G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C6G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C6G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C6G.setText("6");
        Cubo3C6G.setOpaque(true);
        jPanel1.add(Cubo3C6G, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 458, 31, 31));

        Cubo3C4G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C4G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C4G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C4G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C4G.setText("4");
        Cubo3C4G.setOpaque(true);
        jPanel1.add(Cubo3C4G, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 495, 31, 31));

        Cubo4C1G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C1G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C1G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C1G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C1G.setText("1");
        Cubo4C1G.setOpaque(true);
        jPanel1.add(Cubo4C1G, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 458, 31, 31));

        Cubo4C3G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C3G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C3G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C3G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C3G.setText("3");
        Cubo4C3G.setOpaque(true);
        jPanel1.add(Cubo4C3G, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 421, 31, 31));

        Cubo4C5G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C5G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C5G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C5G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C5G.setText("5");
        Cubo4C5G.setOpaque(true);
        jPanel1.add(Cubo4C5G, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 458, 31, 31));

        Cubo4C2G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C2G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C2G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C2G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C2G.setText("2");
        Cubo4C2G.setOpaque(true);
        jPanel1.add(Cubo4C2G, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 458, 31, 31));

        Cubo4C6G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C6G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C6G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C6G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C6G.setText("6");
        Cubo4C6G.setOpaque(true);
        jPanel1.add(Cubo4C6G, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 458, 31, 31));

        Cubo4C4G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C4G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C4G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C4G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C4G.setText("4");
        Cubo4C4G.setOpaque(true);
        jPanel1.add(Cubo4C4G, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 495, 31, 31));

        jLabel9.setText("1)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 395, 16, -1));

        jLabel10.setText("2)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 395, 16, -1));

        jLabel11.setText("3)");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 395, 16, -1));

        jLabel12.setText("4)");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 395, 16, -1));

        jTabbedPane1.addTab("Combinación", jPanel1);

        jPanel2.setLayout(null);

        resolverBtn.setBackground(new java.awt.Color(112, 23, 46));
        resolverBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resolverBtn.setForeground(new java.awt.Color(255, 255, 255));
        resolverBtn.setText("RESOLVER");
        resolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolverBtnActionPerformed(evt);
            }
        });
        jPanel2.add(resolverBtn);
        resolverBtn.setBounds(370, 260, 130, 30);

        Cubo4C3T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C3T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C3T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C3T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C3T.setText("4");
        Cubo4C3T.setOpaque(true);
        jPanel2.add(Cubo4C3T);
        Cubo4C3T.setBounds(260, 360, 50, 50);

        arribaCubo1.setBackground(new java.awt.Color(147, 157, 255));
        arribaCubo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        arribaCubo1.setForeground(new java.awt.Color(0, 0, 0));
        arribaCubo1.setText("▲");
        arribaCubo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaCubo1ActionPerformed(evt);
            }
        });
        jPanel2.add(arribaCubo1);
        arribaCubo1.setBounds(90, 40, 25, 25);

        izquierdaCubo1.setBackground(new java.awt.Color(147, 157, 255));
        izquierdaCubo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        izquierdaCubo1.setForeground(new java.awt.Color(0, 0, 0));
        izquierdaCubo1.setText("◄");
        izquierdaCubo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izquierdaCubo1ActionPerformed(evt);
            }
        });
        jPanel2.add(izquierdaCubo1);
        izquierdaCubo1.setBounds(23, 100, 25, 25);

        Cubo1C5J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C5J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C5J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C5J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C5J.setText("5");
        Cubo1C5J.setOpaque(true);
        jPanel2.add(Cubo1C5J);
        Cubo1C5J.setBounds(134, 82, 10, 60);

        Cubo1C6J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C6J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C6J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C6J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C6J.setText("6");
        Cubo1C6J.setOpaque(true);
        jPanel2.add(Cubo1C6J);
        Cubo1C6J.setBounds(54, 82, 10, 60);

        Cubo1C4J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C4J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C4J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C4J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C4J.setText("4");
        Cubo1C4J.setOpaque(true);
        jPanel2.add(Cubo1C4J);
        Cubo1C4J.setBounds(68, 147, 60, 9);

        Cubo1C3J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C3J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C3J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C3J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C3J.setText("3");
        Cubo1C3J.setOpaque(true);
        jPanel2.add(Cubo1C3J);
        Cubo1C3J.setBounds(68, 69, 60, 9);

        derechaCubo1.setBackground(new java.awt.Color(147, 157, 255));
        derechaCubo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        derechaCubo1.setForeground(new java.awt.Color(0, 0, 0));
        derechaCubo1.setText("►");
        derechaCubo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaCubo1ActionPerformed(evt);
            }
        });
        jPanel2.add(derechaCubo1);
        derechaCubo1.setBounds(148, 97, 25, 25);

        abajoCubo1.setBackground(new java.awt.Color(147, 157, 255));
        abajoCubo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        abajoCubo1.setForeground(new java.awt.Color(0, 0, 0));
        abajoCubo1.setText("▼");
        abajoCubo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abajoCubo1ActionPerformed(evt);
            }
        });
        jPanel2.add(abajoCubo1);
        abajoCubo1.setBounds(86, 162, 25, 25);

        Cubo1C2J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C2J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C2J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C2J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C2J.setText("2");
        Cubo1C2J.setOpaque(true);
        jPanel2.add(Cubo1C2J);
        Cubo1C2J.setBounds(165, 42, 25, 25);

        jLabel13.setText("1)");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(23, 44, 12, 20);

        horarioCubo1.setBackground(new java.awt.Color(147, 157, 255));
        horarioCubo1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        horarioCubo1.setForeground(new java.awt.Color(0, 0, 0));
        horarioCubo1.setText("↻");
        horarioCubo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioCubo1ActionPerformed(evt);
            }
        });
        jPanel2.add(horarioCubo1);
        horarioCubo1.setBounds(27, 188, 35, 25);

        antihorarioCubo1.setBackground(new java.awt.Color(147, 157, 255));
        antihorarioCubo1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        antihorarioCubo1.setForeground(new java.awt.Color(0, 0, 0));
        antihorarioCubo1.setText("↺");
        antihorarioCubo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antihorarioCubo1ActionPerformed(evt);
            }
        });
        jPanel2.add(antihorarioCubo1);
        antihorarioCubo1.setBounds(134, 188, 35, 25);

        Cubo2C1J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C1J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C1J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C1J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C1J.setText("1");
        Cubo2C1J.setOpaque(true);
        jPanel2.add(Cubo2C1J);
        Cubo2C1J.setBounds(285, 82, 60, 60);

        izquierdaCubo2.setBackground(new java.awt.Color(147, 157, 255));
        izquierdaCubo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        izquierdaCubo2.setForeground(new java.awt.Color(0, 0, 0));
        izquierdaCubo2.setText("◄");
        izquierdaCubo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izquierdaCubo2ActionPerformed(evt);
            }
        });
        jPanel2.add(izquierdaCubo2);
        izquierdaCubo2.setBounds(240, 100, 25, 25);

        Cubo2C6J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C6J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C6J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C6J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C6J.setText("6");
        Cubo2C6J.setOpaque(true);
        jPanel2.add(Cubo2C6J);
        Cubo2C6J.setBounds(271, 82, 10, 60);

        Cubo2C4J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C4J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C4J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C4J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C4J.setText("4");
        Cubo2C4J.setOpaque(true);
        jPanel2.add(Cubo2C4J);
        Cubo2C4J.setBounds(285, 147, 60, 9);

        Cubo2C5J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C5J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C5J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C5J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C5J.setText("5");
        Cubo2C5J.setOpaque(true);
        jPanel2.add(Cubo2C5J);
        Cubo2C5J.setBounds(351, 82, 10, 60);

        Cubo2C3J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C3J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C3J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C3J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C3J.setText("3");
        Cubo2C3J.setOpaque(true);
        jPanel2.add(Cubo2C3J);
        Cubo2C3J.setBounds(285, 69, 60, 9);

        arribaCubo2.setBackground(new java.awt.Color(147, 157, 255));
        arribaCubo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        arribaCubo2.setForeground(new java.awt.Color(0, 0, 0));
        arribaCubo2.setText("▲");
        arribaCubo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaCubo2ActionPerformed(evt);
            }
        });
        jPanel2.add(arribaCubo2);
        arribaCubo2.setBounds(306, 38, 25, 25);

        jLabel14.setText("2)");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(240, 44, 12, 20);

        Cubo2C2J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C2J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C2J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C2J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C2J.setText("2");
        Cubo2C2J.setOpaque(true);
        jPanel2.add(Cubo2C2J);
        Cubo2C2J.setBounds(382, 42, 25, 25);

        derechaCubo2.setBackground(new java.awt.Color(147, 157, 255));
        derechaCubo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        derechaCubo2.setForeground(new java.awt.Color(0, 0, 0));
        derechaCubo2.setText("►");
        derechaCubo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaCubo2ActionPerformed(evt);
            }
        });
        jPanel2.add(derechaCubo2);
        derechaCubo2.setBounds(365, 97, 25, 25);

        abajoCubo2.setBackground(new java.awt.Color(147, 157, 255));
        abajoCubo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        abajoCubo2.setForeground(new java.awt.Color(0, 0, 0));
        abajoCubo2.setText("▼");
        abajoCubo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abajoCubo2ActionPerformed(evt);
            }
        });
        jPanel2.add(abajoCubo2);
        abajoCubo2.setBounds(303, 162, 25, 25);

        horarioCubo2.setBackground(new java.awt.Color(147, 157, 255));
        horarioCubo2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        horarioCubo2.setForeground(new java.awt.Color(0, 0, 0));
        horarioCubo2.setText("↻");
        horarioCubo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioCubo2ActionPerformed(evt);
            }
        });
        jPanel2.add(horarioCubo2);
        horarioCubo2.setBounds(244, 188, 35, 25);

        antihorarioCubo2.setBackground(new java.awt.Color(147, 157, 255));
        antihorarioCubo2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        antihorarioCubo2.setForeground(new java.awt.Color(0, 0, 0));
        antihorarioCubo2.setText("↺");
        antihorarioCubo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antihorarioCubo2ActionPerformed(evt);
            }
        });
        jPanel2.add(antihorarioCubo2);
        antihorarioCubo2.setBounds(351, 188, 35, 25);

        Cubo3C1J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C1J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C1J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C1J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C1J.setText("1");
        Cubo3C1J.setOpaque(true);
        jPanel2.add(Cubo3C1J);
        Cubo3C1J.setBounds(514, 82, 60, 60);

        izquierdaCubo3.setBackground(new java.awt.Color(147, 157, 255));
        izquierdaCubo3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        izquierdaCubo3.setForeground(new java.awt.Color(0, 0, 0));
        izquierdaCubo3.setText("◄");
        izquierdaCubo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izquierdaCubo3ActionPerformed(evt);
            }
        });
        jPanel2.add(izquierdaCubo3);
        izquierdaCubo3.setBounds(469, 100, 25, 25);

        Cubo3C6J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C6J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C6J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C6J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C6J.setText("6");
        Cubo3C6J.setOpaque(true);
        jPanel2.add(Cubo3C6J);
        Cubo3C6J.setBounds(500, 82, 10, 60);

        Cubo3C4J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C4J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C4J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C4J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C4J.setText("4");
        Cubo3C4J.setOpaque(true);
        jPanel2.add(Cubo3C4J);
        Cubo3C4J.setBounds(514, 147, 60, 9);

        Cubo3C5J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C5J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C5J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C5J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C5J.setText("5");
        Cubo3C5J.setOpaque(true);
        jPanel2.add(Cubo3C5J);
        Cubo3C5J.setBounds(580, 82, 10, 60);

        Cubo3C3J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C3J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C3J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C3J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C3J.setText("3");
        Cubo3C3J.setOpaque(true);
        jPanel2.add(Cubo3C3J);
        Cubo3C3J.setBounds(514, 69, 60, 9);

        arribaCubo3.setBackground(new java.awt.Color(147, 157, 255));
        arribaCubo3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        arribaCubo3.setForeground(new java.awt.Color(0, 0, 0));
        arribaCubo3.setText("▲");
        arribaCubo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaCubo3ActionPerformed(evt);
            }
        });
        jPanel2.add(arribaCubo3);
        arribaCubo3.setBounds(533, 38, 25, 25);

        jLabel15.setText("3)");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(469, 44, 12, 20);

        Cubo3C2J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C2J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C2J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C2J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C2J.setText("2");
        Cubo3C2J.setOpaque(true);
        jPanel2.add(Cubo3C2J);
        Cubo3C2J.setBounds(611, 42, 25, 25);

        derechaCubo3.setBackground(new java.awt.Color(147, 157, 255));
        derechaCubo3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        derechaCubo3.setForeground(new java.awt.Color(0, 0, 0));
        derechaCubo3.setText("►");
        derechaCubo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaCubo3ActionPerformed(evt);
            }
        });
        jPanel2.add(derechaCubo3);
        derechaCubo3.setBounds(594, 97, 25, 25);

        abajoCubo3.setBackground(new java.awt.Color(147, 157, 255));
        abajoCubo3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        abajoCubo3.setForeground(new java.awt.Color(0, 0, 0));
        abajoCubo3.setText("▼");
        abajoCubo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abajoCubo3ActionPerformed(evt);
            }
        });
        jPanel2.add(abajoCubo3);
        abajoCubo3.setBounds(532, 162, 25, 25);

        horarioCubo3.setBackground(new java.awt.Color(147, 157, 255));
        horarioCubo3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        horarioCubo3.setForeground(new java.awt.Color(0, 0, 0));
        horarioCubo3.setText("↻");
        horarioCubo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioCubo3ActionPerformed(evt);
            }
        });
        jPanel2.add(horarioCubo3);
        horarioCubo3.setBounds(473, 188, 35, 25);

        antihorarioCubo3.setBackground(new java.awt.Color(147, 157, 255));
        antihorarioCubo3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        antihorarioCubo3.setForeground(new java.awt.Color(0, 0, 0));
        antihorarioCubo3.setText("↺");
        antihorarioCubo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antihorarioCubo3ActionPerformed(evt);
            }
        });
        jPanel2.add(antihorarioCubo3);
        antihorarioCubo3.setBounds(580, 188, 35, 25);

        Cubo4C1J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C1J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C1J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C1J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C1J.setText("1");
        Cubo4C1J.setOpaque(true);
        jPanel2.add(Cubo4C1J);
        Cubo4C1J.setBounds(745, 82, 60, 60);

        izquierdaCubo4.setBackground(new java.awt.Color(147, 157, 255));
        izquierdaCubo4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        izquierdaCubo4.setForeground(new java.awt.Color(0, 0, 0));
        izquierdaCubo4.setText("◄");
        izquierdaCubo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izquierdaCubo4ActionPerformed(evt);
            }
        });
        jPanel2.add(izquierdaCubo4);
        izquierdaCubo4.setBounds(700, 100, 25, 25);

        Cubo4C6J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C6J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C6J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C6J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C6J.setText("6");
        Cubo4C6J.setOpaque(true);
        jPanel2.add(Cubo4C6J);
        Cubo4C6J.setBounds(731, 82, 10, 60);

        Cubo4C4J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C4J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C4J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C4J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C4J.setText("4");
        Cubo4C4J.setOpaque(true);
        jPanel2.add(Cubo4C4J);
        Cubo4C4J.setBounds(745, 147, 60, 9);

        Cubo4C5J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C5J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C5J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C5J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C5J.setText("5");
        Cubo4C5J.setOpaque(true);
        jPanel2.add(Cubo4C5J);
        Cubo4C5J.setBounds(811, 82, 10, 60);

        Cubo4C3J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C3J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C3J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C3J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C3J.setText("3");
        Cubo4C3J.setOpaque(true);
        jPanel2.add(Cubo4C3J);
        Cubo4C3J.setBounds(745, 69, 60, 9);

        arribaCubo4.setBackground(new java.awt.Color(147, 157, 255));
        arribaCubo4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        arribaCubo4.setForeground(new java.awt.Color(0, 0, 0));
        arribaCubo4.setText("▲");
        arribaCubo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaCubo4ActionPerformed(evt);
            }
        });
        jPanel2.add(arribaCubo4);
        arribaCubo4.setBounds(763, 38, 25, 25);

        jLabel16.setText("4)");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(700, 44, 12, 20);

        Cubo4C2J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C2J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C2J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C2J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C2J.setText("2");
        Cubo4C2J.setOpaque(true);
        jPanel2.add(Cubo4C2J);
        Cubo4C2J.setBounds(842, 42, 25, 25);

        derechaCubo4.setBackground(new java.awt.Color(147, 157, 255));
        derechaCubo4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        derechaCubo4.setForeground(new java.awt.Color(0, 0, 0));
        derechaCubo4.setText("►");
        derechaCubo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaCubo4ActionPerformed(evt);
            }
        });
        jPanel2.add(derechaCubo4);
        derechaCubo4.setBounds(825, 97, 25, 25);

        abajoCubo4.setBackground(new java.awt.Color(147, 157, 255));
        abajoCubo4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        abajoCubo4.setForeground(new java.awt.Color(0, 0, 0));
        abajoCubo4.setText("▼");
        abajoCubo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abajoCubo4ActionPerformed(evt);
            }
        });
        jPanel2.add(abajoCubo4);
        abajoCubo4.setBounds(763, 162, 25, 25);

        horarioCubo4.setBackground(new java.awt.Color(147, 157, 255));
        horarioCubo4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        horarioCubo4.setForeground(new java.awt.Color(0, 0, 0));
        horarioCubo4.setText("↻");
        horarioCubo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioCubo4ActionPerformed(evt);
            }
        });
        jPanel2.add(horarioCubo4);
        horarioCubo4.setBounds(704, 188, 35, 25);

        antihorarioCubo4.setBackground(new java.awt.Color(147, 157, 255));
        antihorarioCubo4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        antihorarioCubo4.setForeground(new java.awt.Color(0, 0, 0));
        antihorarioCubo4.setText("↺");
        antihorarioCubo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antihorarioCubo4ActionPerformed(evt);
            }
        });
        jPanel2.add(antihorarioCubo4);
        antihorarioCubo4.setBounds(811, 188, 35, 25);

        comprobarBtn.setBackground(new java.awt.Color(147, 157, 255));
        comprobarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comprobarBtn.setForeground(new java.awt.Color(0, 0, 0));
        comprobarBtn.setText("Comprobar");
        comprobarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprobarBtnActionPerformed(evt);
            }
        });
        jPanel2.add(comprobarBtn);
        comprobarBtn.setBounds(220, 260, 130, 30);

        Cubo1C1J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C1J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C1J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C1J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C1J.setText("1");
        Cubo1C1J.setOpaque(true);
        jPanel2.add(Cubo1C1J);
        Cubo1C1J.setBounds(68, 82, 60, 60);

        Cubo1C3T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C3T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C3T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C3T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C3T.setText("1");
        Cubo1C3T.setOpaque(true);
        jPanel2.add(Cubo1C3T);
        Cubo1C3T.setBounds(260, 540, 50, 50);

        Cubo2C3T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C3T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C3T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C3T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C3T.setText("2");
        Cubo2C3T.setOpaque(true);
        jPanel2.add(Cubo2C3T);
        Cubo2C3T.setBounds(260, 480, 50, 50);

        Cubo3C3T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C3T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C3T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C3T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C3T.setText("3");
        Cubo3C3T.setOpaque(true);
        jPanel2.add(Cubo3C3T);
        Cubo3C3T.setBounds(260, 420, 50, 50);

        resueltoLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resueltoLbl.setForeground(new java.awt.Color(255, 202, 117));
        resueltoLbl.setText("RESUELTO !");
        jPanel2.add(resueltoLbl);
        resueltoLbl.setBounds(400, 330, 80, 20);

        Cubo4C4T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C4T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C4T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C4T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C4T.setText("4");
        Cubo4C4T.setOpaque(true);
        jPanel2.add(Cubo4C4T);
        Cubo4C4T.setBounds(460, 360, 50, 50);

        Cubo3C4T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C4T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C4T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C4T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C4T.setText("3");
        Cubo3C4T.setOpaque(true);
        jPanel2.add(Cubo3C4T);
        Cubo3C4T.setBounds(460, 420, 50, 50);

        Cubo2C4T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C4T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C4T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C4T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C4T.setText("2");
        Cubo2C4T.setOpaque(true);
        jPanel2.add(Cubo2C4T);
        Cubo2C4T.setBounds(460, 480, 50, 50);

        Cubo1C4T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C4T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C4T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C4T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C4T.setText("1");
        Cubo1C4T.setOpaque(true);
        jPanel2.add(Cubo1C4T);
        Cubo1C4T.setBounds(460, 540, 50, 50);

        Cubo4C5T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C5T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C5T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C5T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C5T.setText("4");
        Cubo4C5T.setOpaque(true);
        jPanel2.add(Cubo4C5T);
        Cubo4C5T.setBounds(360, 360, 50, 50);

        Cubo3C5T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C5T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C5T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C5T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C5T.setText("3");
        Cubo3C5T.setOpaque(true);
        jPanel2.add(Cubo3C5T);
        Cubo3C5T.setBounds(360, 420, 50, 50);

        Cubo2C5T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C5T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C5T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C5T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C5T.setText("2");
        Cubo2C5T.setOpaque(true);
        jPanel2.add(Cubo2C5T);
        Cubo2C5T.setBounds(360, 480, 50, 50);

        Cubo1C5T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C5T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C5T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C5T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C5T.setText("1");
        Cubo1C5T.setOpaque(true);
        jPanel2.add(Cubo1C5T);
        Cubo1C5T.setBounds(360, 540, 50, 50);

        Cubo4C6T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C6T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C6T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C6T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C6T.setText("4");
        Cubo4C6T.setOpaque(true);
        jPanel2.add(Cubo4C6T);
        Cubo4C6T.setBounds(560, 360, 50, 50);

        Cubo3C6T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C6T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C6T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C6T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C6T.setText("3");
        Cubo3C6T.setOpaque(true);
        jPanel2.add(Cubo3C6T);
        Cubo3C6T.setBounds(560, 420, 50, 50);

        Cubo2C6T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C6T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C6T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C6T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C6T.setText("2");
        Cubo2C6T.setOpaque(true);
        jPanel2.add(Cubo2C6T);
        Cubo2C6T.setBounds(560, 480, 50, 50);

        Cubo1C6T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C6T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C6T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C6T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C6T.setText("1");
        Cubo1C6T.setOpaque(true);
        jPanel2.add(Cubo1C6T);
        Cubo1C6T.setBounds(560, 540, 50, 50);

        Cubo4Lbl.setText("4)");
        jPanel2.add(Cubo4Lbl);
        Cubo4Lbl.setBounds(230, 370, 12, 20);

        Cubo1Lbl.setText("1)");
        jPanel2.add(Cubo1Lbl);
        Cubo1Lbl.setBounds(230, 550, 12, 20);

        Cubo2Lbl.setText("2)");
        jPanel2.add(Cubo2Lbl);
        Cubo2Lbl.setBounds(230, 490, 12, 20);

        Cubo3Lbl.setText("3)");
        jPanel2.add(Cubo3Lbl);
        Cubo3Lbl.setBounds(230, 430, 12, 20);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel28.setText("Vistas Laterales de la Torre");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(300, 300, 260, 29);

        explicacionBtn.setBackground(new java.awt.Color(147, 157, 255));
        explicacionBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        explicacionBtn.setForeground(new java.awt.Color(0, 0, 0));
        explicacionBtn.setText("Explicación");
        explicacionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explicacionBtnActionPerformed(evt);
            }
        });
        jPanel2.add(explicacionBtn);
        explicacionBtn.setBounds(520, 260, 130, 30);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator6);
        jSeparator6.setBounds(530, 370, 10, 210);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator7);
        jSeparator7.setBounds(330, 370, 10, 210);

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator8);
        jSeparator8.setBounds(430, 370, 10, 210);

        InterCubo1_Cubo2.setBackground(new java.awt.Color(147, 157, 255));
        InterCubo1_Cubo2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        InterCubo1_Cubo2.setForeground(new java.awt.Color(0, 0, 0));
        InterCubo1_Cubo2.setText("⇅");
        InterCubo1_Cubo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterCubo1_Cubo2ActionPerformed(evt);
            }
        });
        jPanel2.add(InterCubo1_Cubo2);
        InterCubo1_Cubo2.setBounds(190, 520, 30, 30);

        InterCubo2_Cubo3.setBackground(new java.awt.Color(147, 157, 255));
        InterCubo2_Cubo3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        InterCubo2_Cubo3.setForeground(new java.awt.Color(0, 0, 0));
        InterCubo2_Cubo3.setText("⇅");
        InterCubo2_Cubo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterCubo2_Cubo3ActionPerformed(evt);
            }
        });
        jPanel2.add(InterCubo2_Cubo3);
        InterCubo2_Cubo3.setBounds(190, 460, 30, 30);

        InterCubo3_Cubo4.setBackground(new java.awt.Color(147, 157, 255));
        InterCubo3_Cubo4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        InterCubo3_Cubo4.setForeground(new java.awt.Color(0, 0, 0));
        InterCubo3_Cubo4.setText("⇅");
        InterCubo3_Cubo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterCubo3_Cubo4ActionPerformed(evt);
            }
        });
        jPanel2.add(InterCubo3_Cubo4);
        InterCubo3_Cubo4.setBounds(190, 400, 30, 30);

        jTabbedPane1.addTab("Juego", jPanel2);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setEnabled(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jTextArea1.setRows(2);
        jTextArea1.setText("Por último, se interpretan ambos subgrafos de la siguiente forma:\n Solución Horizontal: (Grafo G1- recorrido horario)\n - Se localiza la arista 1 (cubo 1) y se observa que vértices conecta.\n - En el cubo 1 se colocan estos 2 colores, de izquierda a derecha. (por ejemplo, R-B)\n - Se observa en que vértice termina la arista 1, y a partir de ese vértice se observa la\n   siguiente arista y los vértices que conecta, así sucesivamente. Siempre en sentido\n   horario.                                                                                             ↓ Deslice hacia abajo ↓\n\nSolución Vertical: (Grafo G2- recorrido horario)\n - Se localiza la arista 1 (cubo 1) y se observa que vértices conecta.\n - En el cubo 1 se colocan estos 2 colores, de arriba hacia abajo. (por ejemplo, V-A)\n - Se observa en que vértice termina la arista 1, y a partir de ese vértice se observa la\n   siguiente arista y los vértices que conecta, así sucesivamente. Siempre en sentido\n   horario.");
        jTextArea1.setBorder(null);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 235, 689, 190));

        jScrollPane3.setEnabled(false);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jTextArea3.setRows(2);
        jTextArea3.setText("Utilizando la teoría de Grafos, se construye un grafo Gl que represente a los 4 cubos \ncon las siguientes reglas:\n - El grafo tiene 4 vértices que representan los 4 colores posibles (R, B, V, A).\n - Las aristas representan caras opuestas de cada cubo, 3 aristas por cubo.\n - Las aristas se etiquetan con el número del cubo (1, 2, 3, 4).          ↓ Deslice hacia abajo ↓\n\nDespués, se construyen 2 subgrafos de Gl (si existen) que representan las soluciones \nhorizontal y vertical, se deben seguir las siguientes reglas:\n - Cada subgrafo debe tener los 4 vértices de Gl\n - Cada subgrafo debe tener únicamente 4 aristas, 1 arista por cubo. (etiquetas 1,2,3,4)\n - El grado de cada vértice debe ser igual a 2\n - Las aristas del 1er subgrafo no se deben repetir en el 2do subgrafo");
        jTextArea3.setBorder(null);
        jTextArea3.setFocusable(false);
        jScrollPane3.setViewportView(jTextArea3);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 689, 150));

        existeSolucion.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        existeSolucion.setForeground(new java.awt.Color(45, 160, 106));
        existeSolucion.setText("Existe o NO Existe una solución");
        jPanel6.add(existeSolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 574, -1));

        porLoTanto1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        porLoTanto1.setForeground(new java.awt.Color(255, 255, 255));
        porLoTanto1.setText("Interpretación de subgrafos G1 y G2 :");
        jPanel6.add(porLoTanto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 205, 574, -1));

        porLoTanto2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        porLoTanto2.setForeground(new java.awt.Color(45, 160, 106));
        porLoTanto2.setText("Las soluciones fueron aplicadas en la pestaña de \"Juego\"");
        jPanel6.add(porLoTanto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 575, 500, -1));

        Cubo1C1E.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C1E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C1E.setForeground(new java.awt.Color(255, 255, 255));
        Cubo1C1E.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C1E.setText("1");
        Cubo1C1E.setOpaque(true);
        jPanel6.add(Cubo1C1E, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 463, 80, 80));

        Cubo1C6E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C6E.setText("R");
        jPanel6.add(Cubo1C6E, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 493, -1, -1));

        Cubo1C3E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C3E.setText("R");
        jPanel6.add(Cubo1C3E, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 443, -1, -1));

        Cubo1C5E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C5E.setText("R");
        jPanel6.add(Cubo1C5E, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 493, -1, -1));

        Cubo1C4E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C4E.setText("R");
        jPanel6.add(Cubo1C4E, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 543, -1, -1));

        Cubo2C3E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C3E.setText("R");
        jPanel6.add(Cubo2C3E, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 443, -1, -1));

        Cubo2C6E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C6E.setText("R");
        jPanel6.add(Cubo2C6E, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 493, -1, -1));

        Cubo2C5E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C5E.setText("R");
        jPanel6.add(Cubo2C5E, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 493, -1, -1));

        Cubo2C4E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C4E.setText("R");
        jPanel6.add(Cubo2C4E, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 543, -1, -1));

        Cubo2C1E.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C1E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C1E.setForeground(new java.awt.Color(255, 255, 255));
        Cubo2C1E.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C1E.setText("2");
        Cubo2C1E.setOpaque(true);
        jPanel6.add(Cubo2C1E, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 463, 80, 80));

        Cubo3C3E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C3E.setText("R");
        jPanel6.add(Cubo3C3E, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 443, -1, -1));

        Cubo3C6E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C6E.setText("R");
        jPanel6.add(Cubo3C6E, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 493, -1, -1));

        Cubo3C5E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C5E.setText("R");
        jPanel6.add(Cubo3C5E, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 493, -1, -1));

        Cubo3C4E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C4E.setText("R");
        jPanel6.add(Cubo3C4E, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 543, -1, -1));

        Cubo3C1E.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C1E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C1E.setForeground(new java.awt.Color(255, 255, 255));
        Cubo3C1E.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C1E.setText("3");
        Cubo3C1E.setOpaque(true);
        jPanel6.add(Cubo3C1E, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 463, 80, 80));

        Cubo4C3E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C3E.setText("R");
        jPanel6.add(Cubo4C3E, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 443, -1, -1));

        Cubo4C6E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C6E.setText("R");
        jPanel6.add(Cubo4C6E, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 493, -1, -1));

        Cubo4C5E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C5E.setText("R");
        jPanel6.add(Cubo4C5E, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 493, -1, -1));

        Cubo4C4E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C4E.setText("R");
        jPanel6.add(Cubo4C4E, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 543, -1, -1));

        Cubo4C1E.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C1E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C1E.setForeground(new java.awt.Color(255, 255, 255));
        Cubo4C1E.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C1E.setText("4");
        Cubo4C1E.setOpaque(true);
        jPanel6.add(Cubo4C1E, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 463, 80, 80));
        jPanel6.add(grafoGL, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 14, 190, 160));
        jPanel6.add(grafoG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 410, 190, 170));
        jPanel6.add(grafoG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 210, 190, 170));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel17.setText("GL");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel30.setText("G1 : Horizontal");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel31.setText("G2 : Vertical");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 580, -1, -1));

        jTabbedPane1.addTab("Explicación", jPanel6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("By Eduardo Lau");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 110, -1));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 930, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void genCubo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genCubo1ActionPerformed
        // TODO add your handling code here:

        Color C1 = null;
        if (Cubo1C1.getItemAt(Cubo1C1.getSelectedIndex()).equals("Rojo")) {
            C1 = new Color(155,22,57);
            Cubo1C1G.setText("R");
            Cubo1.C1I = "R";
            Cubo1C1G.setBackground(C1);

        } else if (Cubo1C1.getItemAt(Cubo1C1.getSelectedIndex()).equals("Blanco")) {
            C1 = new Color(255, 255, 255);
            Cubo1C1G.setText("B");
            Cubo1.C1I = "B";
            Cubo1C1G.setBackground(C1);

        } else if (Cubo1C1.getItemAt(Cubo1C1.getSelectedIndex()).equals("Verde")) {
            C1 = new Color(16,175,107);
            Cubo1C1G.setText("V");
            Cubo1.C1I = "V";
            Cubo1C1G.setBackground(C1);

        } else if (Cubo1C1.getItemAt(Cubo1C1.getSelectedIndex()).equals("Amarillo")) {
            C1 = new Color(255,234,78);
            Cubo1C1G.setText("A");
            Cubo1.C1I = "A";
            Cubo1C1G.setBackground(C1);
        }

        Color C2 = null;
        if (Cubo1C2.getItemAt(Cubo1C2.getSelectedIndex()).equals("Rojo")) {
            C2 = new Color(155,22,57);
            Cubo1C2G.setText("R");
            Cubo1.C2I = "R";
            Cubo1C2G.setBackground(C2);

        } else if (Cubo1C2.getItemAt(Cubo1C2.getSelectedIndex()).equals("Blanco")) {
            C2 = new Color(255, 255, 255);
            Cubo1C2G.setText("B");
            Cubo1.C2I = "B";
            Cubo1C2G.setBackground(C2);

        } else if (Cubo1C2.getItemAt(Cubo1C2.getSelectedIndex()).equals("Verde")) {
            C2 = new Color(16,175,107);
            Cubo1C2G.setText("V");
            Cubo1.C2I = "V";
            Cubo1C2G.setBackground(C2);

        } else if (Cubo1C2.getItemAt(Cubo1C2.getSelectedIndex()).equals("Amarillo")) {
            C2 = new Color(255,234,78);
            Cubo1C2G.setText("A");
            Cubo1.C2I = "A";
            Cubo1C2G.setBackground(C2);
        }

        Color C3 = null;
        if (Cubo1C3.getItemAt(Cubo1C3.getSelectedIndex()).equals("Rojo")) {
            C3 = new Color(155,22,57);
            Cubo1C3G.setText("R");
            Cubo1.C3I = "R";
            Cubo1C3G.setBackground(C3);

        } else if (Cubo1C3.getItemAt(Cubo1C3.getSelectedIndex()).equals("Blanco")) {
            C3 = new Color(255, 255, 255);
            Cubo1C3G.setText("B");
            Cubo1.C3I = "B";
            Cubo1C3G.setBackground(C3);

        } else if (Cubo1C3.getItemAt(Cubo1C3.getSelectedIndex()).equals("Verde")) {
            C3 = new Color(16,175,107);
            Cubo1C3G.setText("V");
            Cubo1.C3I = "V";
            Cubo1C3G.setBackground(C3);

        } else if (Cubo1C3.getItemAt(Cubo1C3.getSelectedIndex()).equals("Amarillo")) {
            C3 = new Color(255,234,78);
            Cubo1C3G.setText("A");
            Cubo1.C3I = "A";
            Cubo1C3G.setBackground(C3);
        }

        Color C4 = null;
        if (Cubo1C4.getItemAt(Cubo1C4.getSelectedIndex()).equals("Rojo")) {
            C4 = new Color(155,22,57);
            Cubo1C4G.setText("R");
            Cubo1.C4I = "R";
            Cubo1C4G.setBackground(C4);

        } else if (Cubo1C4.getItemAt(Cubo1C4.getSelectedIndex()).equals("Blanco")) {
            C4 = new Color(255, 255, 255);
            Cubo1C4G.setText("B");
            Cubo1.C4I = "B";
            Cubo1C4G.setBackground(C4);

        } else if (Cubo1C4.getItemAt(Cubo1C4.getSelectedIndex()).equals("Verde")) {
            C4 = new Color(16,175,107);
            Cubo1C4G.setText("V");
            Cubo1.C4I = "V";
            Cubo1C4G.setBackground(C4);

        } else if (Cubo1C4.getItemAt(Cubo1C4.getSelectedIndex()).equals("Amarillo")) {
            C4 = new Color(255,234,78);
            Cubo1C4G.setText("A");
            Cubo1.C4I = "A";
            Cubo1C4G.setBackground(C4);
        }

        Color C5 = null;
        if (Cubo1C5.getItemAt(Cubo1C5.getSelectedIndex()).equals("Rojo")) {
            C5 = new Color(155,22,57);
            Cubo1C5G.setText("R");
            Cubo1.C5I = "R";
            Cubo1C5G.setBackground(C5);

        } else if (Cubo1C5.getItemAt(Cubo1C5.getSelectedIndex()).equals("Blanco")) {
            C5 = new Color(255, 255, 255);
            Cubo1C5G.setText("B");
            Cubo1.C5I = "B";
            Cubo1C5G.setBackground(C5);

        } else if (Cubo1C5.getItemAt(Cubo1C5.getSelectedIndex()).equals("Verde")) {
            C5 = new Color(16,175,107);
            Cubo1C5G.setText("V");
            Cubo1.C5I = "V";
            Cubo1C5G.setBackground(C5);

        } else if (Cubo1C5.getItemAt(Cubo1C5.getSelectedIndex()).equals("Amarillo")) {
            C5 = new Color(255,234,78);
            Cubo1C5G.setText("A");
            Cubo1.C5I = "A";
            Cubo1C5G.setBackground(C5);
        }

        Color C6 = null;
        if (Cubo1C6.getItemAt(Cubo1C6.getSelectedIndex()).equals("Rojo")) {
            C6 = new Color(155,22,57);
            Cubo1C6G.setText("R");
            Cubo1.C6I = "R";
            Cubo1C6G.setBackground(C6);

        } else if (Cubo1C6.getItemAt(Cubo1C6.getSelectedIndex()).equals("Blanco")) {
            C6 = new Color(255, 255, 255);
            Cubo1C6G.setText("B");
            Cubo1.C6I = "B";
            Cubo1C6G.setBackground(C6);

        } else if (Cubo1C6.getItemAt(Cubo1C6.getSelectedIndex()).equals("Verde")) {
            C6 = new Color(16,175,107);
            Cubo1C6G.setText("V");
            Cubo1.C6I = "V";
            Cubo1C6G.setBackground(C6);

        } else if (Cubo1C6.getItemAt(Cubo1C6.getSelectedIndex()).equals("Amarillo")) {
            C6 = new Color(255,234,78);
            Cubo1C6G.setText("A");
            Cubo1.C6I = "A";
            Cubo1C6G.setBackground(C6);
        }

        /*
        1, 2, 3, 4 x
        1, 2, 3, 5 x
        1, 2, 3, 6 x
        1, 2, 4, 5 x
        1, 2, 4, 6 x
        1, 2, 5, 6 x
        1, 3, 4, 5 x
        1, 3, 4, 6 x
        1, 3, 5, 6 x
        1, 4, 5, 6 x
        2, 3, 4, 5 x
        2, 3, 4, 6 x
        2, 3, 5, 6 x
        2, 4, 5, 6 x
        3, 4, 5, 6
         */
 /*if (((!C1.equals(C2) && !C1.equals(C3) && !C1.equals(C4))
                && (!C2.equals(C3) && !C2.equals(C4)) && (!C3.equals(C4))) //
                || ((!C1.equals(C2) && !C1.equals(C3) && !C1.equals(C5))
                && (!C2.equals(C3) && !C2.equals(C5)) && (!C3.equals(C5))) //
                || ((!C1.equals(C2) && !C1.equals(C3) && !C1.equals(C6))
                && (!C2.equals(C3) && !C2.equals(C6)) && (!C3.equals(C6))) //
                || ((!C1.equals(C2) && !C1.equals(C4) && !C1.equals(C5))
                && (!C2.equals(C4) && !C2.equals(C5)) && (!C4.equals(C5))) //
                || ((!C1.equals(C2) && !C1.equals(C4) && !C1.equals(C6))
                && (!C2.equals(C4) && !C2.equals(C6)) && (!C4.equals(C6))) //
                || ((!C1.equals(C2) && !C1.equals(C5) && !C1.equals(C6))
                && (!C2.equals(C5) && !C2.equals(C6)) && (!C5.equals(C6))) //
                || ((!C1.equals(C3) && !C1.equals(C4) && !C1.equals(C5))
                && (!C3.equals(C4) && !C3.equals(C5)) && (!C4.equals(C5))) //
                || ((!C1.equals(C3) && !C1.equals(C4) && !C1.equals(C6))
                && (!C3.equals(C4) && !C3.equals(C6)) && (!C4.equals(C6))) //
                || ((!C1.equals(C3) && !C1.equals(C5) && !C1.equals(C6))
                && (!C3.equals(C5) && !C3.equals(C6)) && (!C5.equals(C6))) // 
                || ((!C1.equals(C4) && !C1.equals(C5) && !C1.equals(C6))
                && (!C4.equals(C5) && !C4.equals(C6)) && (!C5.equals(C6))) //
                || ((!C2.equals(C3) && !C2.equals(C4) && !C2.equals(C5))
                && (!C3.equals(C4) && !C3.equals(C5)) && (!C4.equals(C5))) //
                || ((!C2.equals(C3) && !C2.equals(C4) && !C2.equals(C6))
                && (!C3.equals(C4) && !C3.equals(C6)) && (!C4.equals(C6))) //
                || ((!C2.equals(C3) && !C2.equals(C5) && !C2.equals(C6))
                && (!C3.equals(C5) && !C3.equals(C6)) && (!C5.equals(C6))) //
                || ((!C2.equals(C4) && !C2.equals(C5) && !C2.equals(C6))
                && (!C4.equals(C5) && !C4.equals(C6)) && (!C5.equals(C6))) // 
                || ((!C3.equals(C4) && !C3.equals(C5) && !C3.equals(C6))
                && (!C4.equals(C5) && !C4.equals(C6)) && (!C5.equals(C6)))) {
         */
        Cubo1C1G.setVisible(true);
        Cubo1C2G.setVisible(true);
        Cubo1C3G.setVisible(true);
        Cubo1C4G.setVisible(true);
        Cubo1C5G.setVisible(true);
        Cubo1C6G.setVisible(true);

        Cubo1.C1 = C1;

        Cubo1.C2 = C2;

        Cubo1.C3 = C3;

        Cubo1.C4 = C4;

        Cubo1.C5 = C5;

        Cubo1.C6 = C6;

        System.out.println("Colores generados");

        /*} else {
            JOptionPane.showMessageDialog(null, "Es obligatorio que cada cubo tenga los 4 colores disponibles");
        }
         */

    }//GEN-LAST:event_genCubo1ActionPerformed

    private void genCubo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genCubo3ActionPerformed
        // TODO add your handling code here:
        Color C1 = null;
        if (Cubo3C1.getItemAt(Cubo3C1.getSelectedIndex()).equals("Rojo")) {
            C1 = new Color(155,22,57);
            Cubo3C1G.setText("R");
            Cubo3.C1I = "R";
            Cubo3C1G.setBackground(C1);

        } else if (Cubo3C1.getItemAt(Cubo3C1.getSelectedIndex()).equals("Blanco")) {
            C1 = new Color(255, 255, 255);
            Cubo3C1G.setText("B");
            Cubo3.C1I = "B";
            Cubo3C1G.setBackground(C1);

        } else if (Cubo3C1.getItemAt(Cubo3C1.getSelectedIndex()).equals("Verde")) {
            C1 = new Color(16,175,107);
            Cubo3C1G.setText("V");
            Cubo3.C1I = "V";
            Cubo3C1G.setBackground(C1);

        } else if (Cubo3C1.getItemAt(Cubo3C1.getSelectedIndex()).equals("Amarillo")) {
            C1 = new Color(255,234,78);
            Cubo3C1G.setText("A");
            Cubo3.C1I = "A";
            Cubo3C1G.setBackground(C1);
        }

        Color C2 = null;
        if (Cubo3C2.getItemAt(Cubo3C2.getSelectedIndex()).equals("Rojo")) {
            C2 = new Color(155,22,57);
            Cubo3C2G.setText("R");
            Cubo3.C2I = "R";
            Cubo3C2G.setBackground(C2);

        } else if (Cubo3C2.getItemAt(Cubo3C2.getSelectedIndex()).equals("Blanco")) {
            C2 = new Color(255, 255, 255);
            Cubo3C2G.setText("B");
            Cubo3.C2I = "B";
            Cubo3C2G.setBackground(C2);

        } else if (Cubo3C2.getItemAt(Cubo3C2.getSelectedIndex()).equals("Verde")) {
            C2 = new Color(16,175,107);
            Cubo3C2G.setText("V");
            Cubo3.C2I = "V";
            Cubo3C2G.setBackground(C2);

        } else if (Cubo3C2.getItemAt(Cubo3C2.getSelectedIndex()).equals("Amarillo")) {
            C2 = new Color(255,234,78);
            Cubo3C2G.setText("A");
            Cubo3.C2I = "A";
            Cubo3C2G.setBackground(C2);
        }

        Color C3 = null;
        if (Cubo3C3.getItemAt(Cubo3C3.getSelectedIndex()).equals("Rojo")) {
            C3 = new Color(155,22,57);
            Cubo3C3G.setText("R");
            Cubo3.C3I = "R";
            Cubo3C3G.setBackground(C3);

        } else if (Cubo3C3.getItemAt(Cubo3C3.getSelectedIndex()).equals("Blanco")) {
            C3 = new Color(255, 255, 255);
            Cubo3C3G.setText("B");
            Cubo3.C3I = "B";
            Cubo3C3G.setBackground(C3);

        } else if (Cubo3C3.getItemAt(Cubo3C3.getSelectedIndex()).equals("Verde")) {
            C3 = new Color(16,175,107);
            Cubo3C3G.setText("V");
            Cubo3.C3I = "V";
            Cubo3C3G.setBackground(C3);

        } else if (Cubo3C3.getItemAt(Cubo3C3.getSelectedIndex()).equals("Amarillo")) {
            C3 = new Color(255,234,78);
            Cubo3C3G.setText("A");
            Cubo3.C3I = "A";
            Cubo3C3G.setBackground(C3);
        }

        Color C4 = null;
        if (Cubo3C4.getItemAt(Cubo3C4.getSelectedIndex()).equals("Rojo")) {
            C4 = new Color(155,22,57);
            Cubo3C4G.setText("R");
            Cubo3.C4I = "R";
            Cubo3C4G.setBackground(C4);

        } else if (Cubo3C4.getItemAt(Cubo3C4.getSelectedIndex()).equals("Blanco")) {
            C4 = new Color(255, 255, 255);
            Cubo3C4G.setText("B");
            Cubo3.C4I = "B";
            Cubo3C4G.setBackground(C4);

        } else if (Cubo3C4.getItemAt(Cubo3C4.getSelectedIndex()).equals("Verde")) {
            C4 = new Color(16,175,107);
            Cubo3C4G.setText("V");
            Cubo3.C4I = "V";
            Cubo3C4G.setBackground(C4);

        } else if (Cubo3C4.getItemAt(Cubo3C4.getSelectedIndex()).equals("Amarillo")) {
            C4 = new Color(255,234,78);
            Cubo3C4G.setText("A");
            Cubo3.C4I = "A";
            Cubo3C4G.setBackground(C4);
        }

        Color C5 = null;
        if (Cubo3C5.getItemAt(Cubo3C5.getSelectedIndex()).equals("Rojo")) {
            C5 = new Color(155,22,57);
            Cubo3C5G.setText("R");
            Cubo3.C5I = "R";
            Cubo3C5G.setBackground(C5);

        } else if (Cubo3C5.getItemAt(Cubo3C5.getSelectedIndex()).equals("Blanco")) {
            C5 = new Color(255, 255, 255);
            Cubo3C5G.setText("B");
            Cubo3.C5I = "B";
            Cubo3C5G.setBackground(C5);

        } else if (Cubo3C5.getItemAt(Cubo3C5.getSelectedIndex()).equals("Verde")) {
            C5 = new Color(16,175,107);
            Cubo3C5G.setText("V");
            Cubo3.C5I = "V";
            Cubo3C5G.setBackground(C5);

        } else if (Cubo3C5.getItemAt(Cubo3C5.getSelectedIndex()).equals("Amarillo")) {
            C5 = new Color(255,234,78);
            Cubo3C5G.setText("A");
            Cubo3.C5I = "A";
            Cubo3C5G.setBackground(C5);
        }

        Color C6 = null;
        if (Cubo3C6.getItemAt(Cubo3C6.getSelectedIndex()).equals("Rojo")) {
            C6 = new Color(155,22,57);
            Cubo3C6G.setText("R");
            Cubo3.C6I = "R";
            Cubo3C6G.setBackground(C6);

        } else if (Cubo3C6.getItemAt(Cubo3C6.getSelectedIndex()).equals("Blanco")) {
            C6 = new Color(255, 255, 255);
            Cubo3C6G.setText("B");
            Cubo3.C6I = "B";
            Cubo3C6G.setBackground(C6);

        } else if (Cubo3C6.getItemAt(Cubo3C6.getSelectedIndex()).equals("Verde")) {
            C6 = new Color(16,175,107);
            Cubo3C6G.setText("V");
            Cubo3.C6I = "V";
            Cubo3C6G.setBackground(C6);

        } else if (Cubo3C6.getItemAt(Cubo3C6.getSelectedIndex()).equals("Amarillo")) {
            C6 = new Color(255,234,78);
            Cubo3C6G.setText("A");
            Cubo3.C6I = "A";
            Cubo3C6G.setBackground(C6);
        }

        /*
        1, 2, 3, 4 x
        1, 2, 3, 5 x
        1, 2, 3, 6 x
        1, 2, 4, 5 x
        1, 2, 4, 6 x
        1, 2, 5, 6 x
        1, 3, 4, 5 x
        1, 3, 4, 6 x
        1, 3, 5, 6 x
        1, 4, 5, 6 x
        2, 3, 4, 5 x
        2, 3, 4, 6 x
        2, 3, 5, 6 x
        2, 4, 5, 6 x
        3, 4, 5, 6
         */
 /* if (((!C1.equals(C2) && !C1.equals(C3) && !C1.equals(C4))
                && (!C2.equals(C3) && !C2.equals(C4)) && (!C3.equals(C4))) //
                || ((!C1.equals(C2) && !C1.equals(C3) && !C1.equals(C5))
                && (!C2.equals(C3) && !C2.equals(C5)) && (!C3.equals(C5))) //
                || ((!C1.equals(C2) && !C1.equals(C3) && !C1.equals(C6))
                && (!C2.equals(C3) && !C2.equals(C6)) && (!C3.equals(C6))) //
                || ((!C1.equals(C2) && !C1.equals(C4) && !C1.equals(C5))
                && (!C2.equals(C4) && !C2.equals(C5)) && (!C4.equals(C5))) //
                || ((!C1.equals(C2) && !C1.equals(C4) && !C1.equals(C6))
                && (!C2.equals(C4) && !C2.equals(C6)) && (!C4.equals(C6))) //
                || ((!C1.equals(C2) && !C1.equals(C5) && !C1.equals(C6))
                && (!C2.equals(C5) && !C2.equals(C6)) && (!C5.equals(C6))) //
                || ((!C1.equals(C3) && !C1.equals(C4) && !C1.equals(C5))
                && (!C3.equals(C4) && !C3.equals(C5)) && (!C4.equals(C5))) //
                || ((!C1.equals(C3) && !C1.equals(C4) && !C1.equals(C6))
                && (!C3.equals(C4) && !C3.equals(C6)) && (!C4.equals(C6))) //
                || ((!C1.equals(C3) && !C1.equals(C5) && !C1.equals(C6))
                && (!C3.equals(C5) && !C3.equals(C6)) && (!C5.equals(C6))) // 
                || ((!C1.equals(C4) && !C1.equals(C5) && !C1.equals(C6))
                && (!C4.equals(C5) && !C4.equals(C6)) && (!C5.equals(C6))) //
                || ((!C2.equals(C3) && !C2.equals(C4) && !C2.equals(C5))
                && (!C3.equals(C4) && !C3.equals(C5)) && (!C4.equals(C5))) //
                || ((!C2.equals(C3) && !C2.equals(C4) && !C2.equals(C6))
                && (!C3.equals(C4) && !C3.equals(C6)) && (!C4.equals(C6))) //
                || ((!C2.equals(C3) && !C2.equals(C5) && !C2.equals(C6))
                && (!C3.equals(C5) && !C3.equals(C6)) && (!C5.equals(C6))) //
                || ((!C2.equals(C4) && !C2.equals(C5) && !C2.equals(C6))
                && (!C4.equals(C5) && !C4.equals(C6)) && (!C5.equals(C6))) // 
                || ((!C3.equals(C4) && !C3.equals(C5) && !C3.equals(C6))
                && (!C4.equals(C5) && !C4.equals(C6)) && (!C5.equals(C6)))) {
         */
        Cubo3C1G.setVisible(true);
        Cubo3C2G.setVisible(true);
        Cubo3C3G.setVisible(true);
        Cubo3C4G.setVisible(true);
        Cubo3C5G.setVisible(true);
        Cubo3C6G.setVisible(true);

        Cubo3.C1 = C1;

        Cubo3.C2 = C2;

        Cubo3.C3 = C3;

        Cubo3.C4 = C4;

        Cubo3.C5 = C5;

        Cubo3.C6 = C6;

        System.out.println("Colores generados");

        /*} else {
            JOptionPane.showMessageDialog(null, "Es obligatorio que cada cubo tenga los 4 colores disponibles");
        }
         */
    }//GEN-LAST:event_genCubo3ActionPerformed

    private void genCubo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genCubo4ActionPerformed
        // TODO add your handling code here:
        Color C1 = null;
        if (Cubo4C1.getItemAt(Cubo4C1.getSelectedIndex()).equals("Rojo")) {
            C1 = new Color(155,22,57);
            Cubo4C1G.setText("R");
            Cubo4.C1I = "R";
            Cubo4C1G.setBackground(C1);

        } else if (Cubo4C1.getItemAt(Cubo4C1.getSelectedIndex()).equals("Blanco")) {
            C1 = new Color(255, 255, 255);
            Cubo4C1G.setText("B");
            Cubo4.C1I = "B";
            Cubo4C1G.setBackground(C1);

        } else if (Cubo4C1.getItemAt(Cubo4C1.getSelectedIndex()).equals("Verde")) {
            C1 = new Color(16,175,107);
            Cubo4C1G.setText("V");
            Cubo4.C1I = "V";
            Cubo4C1G.setBackground(C1);

        } else if (Cubo4C1.getItemAt(Cubo4C1.getSelectedIndex()).equals("Amarillo")) {
            C1 = new Color(255,234,78);
            Cubo4C1G.setText("A");
            Cubo4.C1I = "A";
            Cubo4C1G.setBackground(C1);
        }

        Color C2 = null;
        if (Cubo4C2.getItemAt(Cubo4C2.getSelectedIndex()).equals("Rojo")) {
            C2 = new Color(155,22,57);
            Cubo4C2G.setText("R");
            Cubo4.C2I = "R";
            Cubo4C2G.setBackground(C2);

        } else if (Cubo4C2.getItemAt(Cubo4C2.getSelectedIndex()).equals("Blanco")) {
            C2 = new Color(255, 255, 255);
            Cubo4C2G.setText("B");
            Cubo4.C2I = "B";
            Cubo4C2G.setBackground(C2);

        } else if (Cubo4C2.getItemAt(Cubo4C2.getSelectedIndex()).equals("Verde")) {
            C2 = new Color(16,175,107);
            Cubo4C2G.setText("V");
            Cubo4.C2I = "V";
            Cubo4C2G.setBackground(C2);

        } else if (Cubo4C2.getItemAt(Cubo4C2.getSelectedIndex()).equals("Amarillo")) {
            C2 = new Color(255,234,78);
            Cubo4C2G.setText("A");
            Cubo4.C2I = "A";
            Cubo4C2G.setBackground(C2);
        }

        Color C3 = null;
        if (Cubo4C3.getItemAt(Cubo4C3.getSelectedIndex()).equals("Rojo")) {
            C3 = new Color(155,22,57);
            Cubo4C3G.setText("R");
            Cubo4.C3I = "R";
            Cubo4C3G.setBackground(C3);

        } else if (Cubo4C3.getItemAt(Cubo4C3.getSelectedIndex()).equals("Blanco")) {
            C3 = new Color(255, 255, 255);
            Cubo4C3G.setText("B");
            Cubo4.C3I = "B";
            Cubo4C3G.setBackground(C3);

        } else if (Cubo4C3.getItemAt(Cubo4C3.getSelectedIndex()).equals("Verde")) {
            C3 = new Color(16,175,107);
            Cubo4C3G.setText("V");
            Cubo4.C3I = "V";
            Cubo4C3G.setBackground(C3);

        } else if (Cubo4C3.getItemAt(Cubo4C3.getSelectedIndex()).equals("Amarillo")) {
            C3 = new Color(255,234,78);
            Cubo4C3G.setText("A");
            Cubo4.C3I = "A";
            Cubo4C3G.setBackground(C3);
        }

        Color C4 = null;
        if (Cubo4C4.getItemAt(Cubo4C4.getSelectedIndex()).equals("Rojo")) {
            C4 = new Color(155,22,57);
            Cubo4C4G.setText("R");
            Cubo4.C4I = "R";
            Cubo4C4G.setBackground(C4);

        } else if (Cubo4C4.getItemAt(Cubo4C4.getSelectedIndex()).equals("Blanco")) {
            C4 = new Color(255, 255, 255);
            Cubo4C4G.setText("B");
            Cubo4.C4I = "B";
            Cubo4C4G.setBackground(C4);

        } else if (Cubo4C4.getItemAt(Cubo4C4.getSelectedIndex()).equals("Verde")) {
            C4 = new Color(16,175,107);
            Cubo4C4G.setText("V");
            Cubo4.C4I = "V";
            Cubo4C4G.setBackground(C4);

        } else if (Cubo4C4.getItemAt(Cubo4C4.getSelectedIndex()).equals("Amarillo")) {
            C4 = new Color(255,234,78);
            Cubo4C4G.setText("A");
            Cubo4.C4I = "A";
            Cubo4C4G.setBackground(C4);
        }

        Color C5 = null;
        if (Cubo4C5.getItemAt(Cubo4C5.getSelectedIndex()).equals("Rojo")) {
            C5 = new Color(155,22,57);
            Cubo4C5G.setText("R");
            Cubo4.C5I = "R";
            Cubo4C5G.setBackground(C5);

        } else if (Cubo4C5.getItemAt(Cubo4C5.getSelectedIndex()).equals("Blanco")) {
            C5 = new Color(255, 255, 255);
            Cubo4C5G.setText("B");
            Cubo4.C5I = "B";
            Cubo4C5G.setBackground(C5);

        } else if (Cubo4C5.getItemAt(Cubo4C5.getSelectedIndex()).equals("Verde")) {
            C5 = new Color(16,175,107);
            Cubo4C5G.setText("V");
            Cubo4.C5I = "V";
            Cubo4C5G.setBackground(C5);

        } else if (Cubo4C5.getItemAt(Cubo4C5.getSelectedIndex()).equals("Amarillo")) {
            C5 = new Color(255,234,78);
            Cubo4C5G.setText("A");
            Cubo4.C5I = "A";
            Cubo4C5G.setBackground(C5);
        }

        Color C6 = null;
        if (Cubo4C6.getItemAt(Cubo4C6.getSelectedIndex()).equals("Rojo")) {
            C6 = new Color(155,22,57);
            Cubo4C6G.setText("R");
            Cubo4.C6I = "R";
            Cubo4C6G.setBackground(C6);

        } else if (Cubo4C6.getItemAt(Cubo4C6.getSelectedIndex()).equals("Blanco")) {
            C6 = new Color(255, 255, 255);
            Cubo4C6G.setText("B");
            Cubo4.C6I = "B";
            Cubo4C6G.setBackground(C6);

        } else if (Cubo4C6.getItemAt(Cubo4C6.getSelectedIndex()).equals("Verde")) {
            C6 = new Color(16,175,107);
            Cubo4C6G.setText("V");
            Cubo4.C6I = "V";
            Cubo4C6G.setBackground(C6);

        } else if (Cubo4C6.getItemAt(Cubo4C6.getSelectedIndex()).equals("Amarillo")) {
            C6 = new Color(255,234,78);
            Cubo4C6G.setText("A");
            Cubo4.C6I = "A";
            Cubo4C6G.setBackground(C6);
        }

        /*
        1, 2, 3, 4 x
        1, 2, 3, 5 x
        1, 2, 3, 6 x
        1, 2, 4, 5 x
        1, 2, 4, 6 x
        1, 2, 5, 6 x
        1, 3, 4, 5 x
        1, 3, 4, 6 x
        1, 3, 5, 6 x
        1, 4, 5, 6 x
        2, 3, 4, 5 x
        2, 3, 4, 6 x
        2, 3, 5, 6 x
        2, 4, 5, 6 x
        3, 4, 5, 6
         */
 /*if (((!C1.equals(C2) && !C1.equals(C3) && !C1.equals(C4))
                && (!C2.equals(C3) && !C2.equals(C4)) && (!C3.equals(C4))) //
                || ((!C1.equals(C2) && !C1.equals(C3) && !C1.equals(C5))
                && (!C2.equals(C3) && !C2.equals(C5)) && (!C3.equals(C5))) //
                || ((!C1.equals(C2) && !C1.equals(C3) && !C1.equals(C6))
                && (!C2.equals(C3) && !C2.equals(C6)) && (!C3.equals(C6))) //
                || ((!C1.equals(C2) && !C1.equals(C4) && !C1.equals(C5))
                && (!C2.equals(C4) && !C2.equals(C5)) && (!C4.equals(C5))) //
                || ((!C1.equals(C2) && !C1.equals(C4) && !C1.equals(C6))
                && (!C2.equals(C4) && !C2.equals(C6)) && (!C4.equals(C6))) //
                || ((!C1.equals(C2) && !C1.equals(C5) && !C1.equals(C6))
                && (!C2.equals(C5) && !C2.equals(C6)) && (!C5.equals(C6))) //
                || ((!C1.equals(C3) && !C1.equals(C4) && !C1.equals(C5))
                && (!C3.equals(C4) && !C3.equals(C5)) && (!C4.equals(C5))) //
                || ((!C1.equals(C3) && !C1.equals(C4) && !C1.equals(C6))
                && (!C3.equals(C4) && !C3.equals(C6)) && (!C4.equals(C6))) //
                || ((!C1.equals(C3) && !C1.equals(C5) && !C1.equals(C6))
                && (!C3.equals(C5) && !C3.equals(C6)) && (!C5.equals(C6))) // 
                || ((!C1.equals(C4) && !C1.equals(C5) && !C1.equals(C6))
                && (!C4.equals(C5) && !C4.equals(C6)) && (!C5.equals(C6))) //
                || ((!C2.equals(C3) && !C2.equals(C4) && !C2.equals(C5))
                && (!C3.equals(C4) && !C3.equals(C5)) && (!C4.equals(C5))) //
                || ((!C2.equals(C3) && !C2.equals(C4) && !C2.equals(C6))
                && (!C3.equals(C4) && !C3.equals(C6)) && (!C4.equals(C6))) //
                || ((!C2.equals(C3) && !C2.equals(C5) && !C2.equals(C6))
                && (!C3.equals(C5) && !C3.equals(C6)) && (!C5.equals(C6))) //
                || ((!C2.equals(C4) && !C2.equals(C5) && !C2.equals(C6))
                && (!C4.equals(C5) && !C4.equals(C6)) && (!C5.equals(C6))) // 
                || ((!C3.equals(C4) && !C3.equals(C5) && !C3.equals(C6))
                && (!C4.equals(C5) && !C4.equals(C6)) && (!C5.equals(C6)))) {
         */
        Cubo4C1G.setVisible(true);
        Cubo4C2G.setVisible(true);
        Cubo4C3G.setVisible(true);
        Cubo4C4G.setVisible(true);
        Cubo4C5G.setVisible(true);
        Cubo4C6G.setVisible(true);

        Cubo4.C1 = C1;

        Cubo4.C2 = C2;

        Cubo4.C3 = C3;

        Cubo4.C4 = C4;

        Cubo4.C5 = C5;

        Cubo4.C6 = C6;

        System.out.println("Colores generados");

        /*} else {
            JOptionPane.showMessageDialog(null, "Es obligatorio que cada cubo tenga los 4 colores disponibles");
        }
         */
    }//GEN-LAST:event_genCubo4ActionPerformed

    private void genCubo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genCubo2ActionPerformed
        // TODO add your handling code here:

        Color C1 = null;
        if (Cubo2C1.getItemAt(Cubo2C1.getSelectedIndex()).equals("Rojo")) {
            C1 = new Color(155,22,57);
            Cubo2C1G.setText("R");
            Cubo2.C1I = "R";
            Cubo2C1G.setBackground(C1);

        } else if (Cubo2C1.getItemAt(Cubo2C1.getSelectedIndex()).equals("Blanco")) {
            C1 = new Color(255, 255, 255);
            Cubo2C1G.setText("B");
            Cubo2.C1I = "B";
            Cubo2C1G.setBackground(C1);

        } else if (Cubo2C1.getItemAt(Cubo2C1.getSelectedIndex()).equals("Verde")) {
            C1 = new Color(16,175,107);
            Cubo2C1G.setText("V");
            Cubo2.C1I = "V";
            Cubo2C1G.setBackground(C1);

        } else if (Cubo2C1.getItemAt(Cubo2C1.getSelectedIndex()).equals("Amarillo")) {
            C1 = new Color(255,234,78);
            Cubo2C1G.setText("A");
            Cubo2.C1I = "A";
            Cubo2C1G.setBackground(C1);
        }

        Color C2 = null;
        if (Cubo2C2.getItemAt(Cubo2C2.getSelectedIndex()).equals("Rojo")) {
            C2 = new Color(155,22,57);
            Cubo2C2G.setText("R");
            Cubo2.C2I = "R";
            Cubo2C2G.setBackground(C2);

        } else if (Cubo2C2.getItemAt(Cubo2C2.getSelectedIndex()).equals("Blanco")) {
            C2 = new Color(255, 255, 255);
            Cubo2C2G.setText("B");
            Cubo2.C2I = "B";
            Cubo2C2G.setBackground(C2);

        } else if (Cubo2C2.getItemAt(Cubo2C2.getSelectedIndex()).equals("Verde")) {
            C2 = new Color(16,175,107);
            Cubo2C2G.setText("V");
            Cubo2.C2I = "V";
            Cubo2C2G.setBackground(C2);

        } else if (Cubo2C2.getItemAt(Cubo2C2.getSelectedIndex()).equals("Amarillo")) {
            C2 = new Color(255,234,78);
            Cubo2C2G.setText("A");
            Cubo2.C2I = "A";
            Cubo2C2G.setBackground(C2);
        }

        Color C3 = null;
        if (Cubo2C3.getItemAt(Cubo2C3.getSelectedIndex()).equals("Rojo")) {
            C3 = new Color(155,22,57);
            Cubo2C3G.setText("R");
            Cubo2.C3I = "R";
            Cubo2C3G.setBackground(C3);

        } else if (Cubo2C3.getItemAt(Cubo2C3.getSelectedIndex()).equals("Blanco")) {
            C3 = new Color(255, 255, 255);
            Cubo2C3G.setText("B");
            Cubo2.C3I = "B";
            Cubo2C3G.setBackground(C3);

        } else if (Cubo2C3.getItemAt(Cubo2C3.getSelectedIndex()).equals("Verde")) {
            C3 = new Color(16,175,107);
            Cubo2C3G.setText("V");
            Cubo2.C3I = "V";
            Cubo2C3G.setBackground(C3);

        } else if (Cubo2C3.getItemAt(Cubo2C3.getSelectedIndex()).equals("Amarillo")) {
            C3 = new Color(255,234,78);
            Cubo2C3G.setText("A");
            Cubo2.C3I = "A";
            Cubo2C3G.setBackground(C3);
        }

        Color C4 = null;
        if (Cubo2C4.getItemAt(Cubo2C4.getSelectedIndex()).equals("Rojo")) {
            C4 = new Color(155,22,57);
            Cubo2C4G.setText("R");
            Cubo2.C4I = "R";
            Cubo2C4G.setBackground(C4);

        } else if (Cubo2C4.getItemAt(Cubo2C4.getSelectedIndex()).equals("Blanco")) {
            C4 = new Color(255, 255, 255);
            Cubo2C4G.setText("B");
            Cubo2.C4I = "B";
            Cubo2C4G.setBackground(C4);

        } else if (Cubo2C4.getItemAt(Cubo2C4.getSelectedIndex()).equals("Verde")) {
            C4 = new Color(16,175,107);
            Cubo2C4G.setText("V");
            Cubo2.C4I = "V";
            Cubo2C4G.setBackground(C4);

        } else if (Cubo2C4.getItemAt(Cubo2C4.getSelectedIndex()).equals("Amarillo")) {
            C4 = new Color(255,234,78);
            Cubo2C4G.setText("A");
            Cubo2.C4I = "A";
            Cubo2C4G.setBackground(C4);
        }

        Color C5 = null;
        if (Cubo2C5.getItemAt(Cubo2C5.getSelectedIndex()).equals("Rojo")) {
            C5 = new Color(155,22,57);
            Cubo2C5G.setText("R");
            Cubo2.C5I = "R";
            Cubo2C5G.setBackground(C5);

        } else if (Cubo2C5.getItemAt(Cubo2C5.getSelectedIndex()).equals("Blanco")) {
            C5 = new Color(255, 255, 255);
            Cubo2C5G.setText("B");
            Cubo2.C5I = "B";
            Cubo2C5G.setBackground(C5);

        } else if (Cubo2C5.getItemAt(Cubo2C5.getSelectedIndex()).equals("Verde")) {
            C5 = new Color(16,175,107);
            Cubo2C5G.setText("V");
            Cubo2.C5I = "V";
            Cubo2C5G.setBackground(C5);

        } else if (Cubo2C5.getItemAt(Cubo2C5.getSelectedIndex()).equals("Amarillo")) {
            C5 = new Color(255,234,78);
            Cubo2C5G.setText("A");
            Cubo2.C5I = "A";
            Cubo2C5G.setBackground(C5);
        }

        Color C6 = null;
        if (Cubo2C6.getItemAt(Cubo2C6.getSelectedIndex()).equals("Rojo")) {
            C6 = new Color(155,22,57);
            Cubo2C6G.setText("R");
            Cubo2.C6I = "R";
            Cubo2C6G.setBackground(C6);

        } else if (Cubo2C6.getItemAt(Cubo2C6.getSelectedIndex()).equals("Blanco")) {
            C6 = new Color(255, 255, 255);
            Cubo2C6G.setText("B");
            Cubo2.C6I = "B";
            Cubo2C6G.setBackground(C6);

        } else if (Cubo2C6.getItemAt(Cubo2C6.getSelectedIndex()).equals("Verde")) {
            C6 = new Color(16,175,107);
            Cubo2C6G.setText("V");
            Cubo2.C6I = "V";
            Cubo2C6G.setBackground(C6);

        } else if (Cubo2C6.getItemAt(Cubo2C6.getSelectedIndex()).equals("Amarillo")) {
            C6 = new Color(255,234,78);
            Cubo2C6G.setText("A");
            Cubo2.C6I = "A";
            Cubo2C6G.setBackground(C6);
        }

        /*
        1, 2, 3, 4 x
        1, 2, 3, 5 x
        1, 2, 3, 6 x
        1, 2, 4, 5 x
        1, 2, 4, 6 x
        1, 2, 5, 6 x
        1, 3, 4, 5 x
        1, 3, 4, 6 x
        1, 3, 5, 6 x
        1, 4, 5, 6 x
        2, 3, 4, 5 x
        2, 3, 4, 6 x
        2, 3, 5, 6 x
        2, 4, 5, 6 x
        3, 4, 5, 6
         */
 /*if (((!C1.equals(C2) && !C1.equals(C3) && !C1.equals(C4))
                && (!C2.equals(C3) && !C2.equals(C4)) && (!C3.equals(C4))) //
                || ((!C1.equals(C2) && !C1.equals(C3) && !C1.equals(C5))
                && (!C2.equals(C3) && !C2.equals(C5)) && (!C3.equals(C5))) //
                || ((!C1.equals(C2) && !C1.equals(C3) && !C1.equals(C6))
                && (!C2.equals(C3) && !C2.equals(C6)) && (!C3.equals(C6))) //
                || ((!C1.equals(C2) && !C1.equals(C4) && !C1.equals(C5))
                && (!C2.equals(C4) && !C2.equals(C5)) && (!C4.equals(C5))) //
                || ((!C1.equals(C2) && !C1.equals(C4) && !C1.equals(C6))
                && (!C2.equals(C4) && !C2.equals(C6)) && (!C4.equals(C6))) //
                || ((!C1.equals(C2) && !C1.equals(C5) && !C1.equals(C6))
                && (!C2.equals(C5) && !C2.equals(C6)) && (!C5.equals(C6))) //
                || ((!C1.equals(C3) && !C1.equals(C4) && !C1.equals(C5))
                && (!C3.equals(C4) && !C3.equals(C5)) && (!C4.equals(C5))) //
                || ((!C1.equals(C3) && !C1.equals(C4) && !C1.equals(C6))
                && (!C3.equals(C4) && !C3.equals(C6)) && (!C4.equals(C6))) //
                || ((!C1.equals(C3) && !C1.equals(C5) && !C1.equals(C6))
                && (!C3.equals(C5) && !C3.equals(C6)) && (!C5.equals(C6))) // 
                || ((!C1.equals(C4) && !C1.equals(C5) && !C1.equals(C6))
                && (!C4.equals(C5) && !C4.equals(C6)) && (!C5.equals(C6))) //
                || ((!C2.equals(C3) && !C2.equals(C4) && !C2.equals(C5))
                && (!C3.equals(C4) && !C3.equals(C5)) && (!C4.equals(C5))) //
                || ((!C2.equals(C3) && !C2.equals(C4) && !C2.equals(C6))
                && (!C3.equals(C4) && !C3.equals(C6)) && (!C4.equals(C6))) //
                || ((!C2.equals(C3) && !C2.equals(C5) && !C2.equals(C6))
                && (!C3.equals(C5) && !C3.equals(C6)) && (!C5.equals(C6))) //
                || ((!C2.equals(C4) && !C2.equals(C5) && !C2.equals(C6))
                && (!C4.equals(C5) && !C4.equals(C6)) && (!C5.equals(C6))) // 
                || ((!C3.equals(C4) && !C3.equals(C5) && !C3.equals(C6))
                && (!C4.equals(C5) && !C4.equals(C6)) && (!C5.equals(C6)))) {
         */
        Cubo2C1G.setVisible(true);
        Cubo2C2G.setVisible(true);
        Cubo2C3G.setVisible(true);
        Cubo2C4G.setVisible(true);
        Cubo2C5G.setVisible(true);
        Cubo2C6G.setVisible(true);

        Cubo2.C1 = C1;

        Cubo2.C2 = C2;

        Cubo2.C3 = C3;

        Cubo2.C4 = C4;

        Cubo2.C5 = C5;

        Cubo2.C6 = C6;

        System.out.println("Colores generados");

        /*} else {
            JOptionPane.showMessageDialog(null, "Es obligatorio que cada cubo tenga los 4 colores disponibles");
        }
         */
    }//GEN-LAST:event_genCubo2ActionPerformed

    private void genAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genAleatorioActionPerformed
        // TODO add your handling code here:
        Object[] options = {"Sí",
            "No"};
        int yes = JOptionPane.showOptionDialog(null,
                "Está acción distribuye los colores de forma\n"
                + " aleatoria en los 4 cubos, desea continuar?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (JOptionPane.YES_OPTION == yes) {
            Color[] coloresDisp = {new Color(155,22,57), new Color(255, 255, 255),
                new Color(16,175,107), new Color(255,234,78)};

            Random random = new Random();

            Color C1 = coloresDisp[random.nextInt(coloresDisp.length)];
            Color C2 = coloresDisp[random.nextInt(coloresDisp.length)];
            Color C3 = coloresDisp[random.nextInt(coloresDisp.length)];
            Color C4 = coloresDisp[random.nextInt(coloresDisp.length)];
            Color C5 = coloresDisp[random.nextInt(coloresDisp.length)];
            Color C6 = coloresDisp[random.nextInt(coloresDisp.length)];

            Cubo1C1G.setVisible(true);
            Cubo1C2G.setVisible(true);
            Cubo1C3G.setVisible(true);
            Cubo1C4G.setVisible(true);
            Cubo1C5G.setVisible(true);
            Cubo1C6G.setVisible(true);

            Cubo2C1G.setVisible(true);
            Cubo2C2G.setVisible(true);
            Cubo2C3G.setVisible(true);
            Cubo2C4G.setVisible(true);
            Cubo2C5G.setVisible(true);
            Cubo2C6G.setVisible(true);

            Cubo3C1G.setVisible(true);
            Cubo3C2G.setVisible(true);
            Cubo3C3G.setVisible(true);
            Cubo3C4G.setVisible(true);
            Cubo3C5G.setVisible(true);
            Cubo3C6G.setVisible(true);

            Cubo4C1G.setVisible(true);
            Cubo4C2G.setVisible(true);
            Cubo4C3G.setVisible(true);
            Cubo4C4G.setVisible(true);
            Cubo4C5G.setVisible(true);
            Cubo4C6G.setVisible(true);
            //
            while (!((C1 != C2 && C1 != C3 && C1 != C4) && (C2 != C3 && C2 != C4) && (C3 != C4))) {
                C1 = coloresDisp[random.nextInt(coloresDisp.length)];
                C2 = coloresDisp[random.nextInt(coloresDisp.length)];
                C3 = coloresDisp[random.nextInt(coloresDisp.length)];
                C4 = coloresDisp[random.nextInt(coloresDisp.length)];

            }

            if (C1.equals(new Color(155,22,57))) {
                Cubo1C1.setSelectedItem("Rojo");
                Cubo1.C1I = "R";
                Cubo1C1G.setText(Cubo1.C1I);
                Cubo1C1G.setBackground(C1);
            } else if (C1.equals(new Color(255, 255, 255))) {
                Cubo1C1.setSelectedItem("Blanco");
                Cubo1.C1I = "B";
                Cubo1C1G.setText(Cubo1.C1I);
                Cubo1C1G.setBackground(C1);
            } else if (C1.equals(new Color(16,175,107))) {
                Cubo1C1.setSelectedItem("Verde");
                Cubo1.C1I = "V";
                Cubo1C1G.setText(Cubo1.C1I);
                Cubo1C1G.setBackground(C1);
            } else if (C1.equals(new Color(255,234,78))) {
                Cubo1C1.setSelectedItem("Amarillo");
                Cubo1.C1I = "A";
                Cubo1C1G.setText(Cubo1.C1I);
                Cubo1C1G.setBackground(C1);

            }

            if (C2.equals(new Color(155,22,57))) {
                Cubo1C2.setSelectedItem("Rojo");
                Cubo1.C2I = "R";
                Cubo1C2G.setText(Cubo1.C2I);
                Cubo1C2G.setBackground(C2);
            } else if (C2.equals(new Color(255, 255, 255))) {
                Cubo1C2.setSelectedItem("Blanco");
                Cubo1.C2I = "B";
                Cubo1C2G.setText(Cubo1.C2I);
                Cubo1C2G.setBackground(C2);
            } else if (C2.equals(new Color(16,175,107))) {
                Cubo1C2.setSelectedItem("Verde");
                Cubo1.C2I = "V";
                Cubo1C2G.setText(Cubo1.C2I);
                Cubo1C2G.setBackground(C2);
            } else if (C2.equals(new Color(255,234,78))) {
                Cubo1C2.setSelectedItem("Amarillo");
                Cubo1.C2I = "A";
                Cubo1C2G.setText(Cubo1.C2I);
                Cubo1C2G.setBackground(C2);

            }

            if (C3.equals(new Color(155,22,57))) {
                Cubo1C3.setSelectedItem("Rojo");
                Cubo1.C3I = "R";
                Cubo1C3G.setText(Cubo1.C3I);
                Cubo1C3G.setBackground(C3);
            } else if (C3.equals(new Color(255, 255, 255))) {
                Cubo1C3.setSelectedItem("Blanco");
                Cubo1.C3I = "B";
                Cubo1C3G.setText(Cubo1.C3I);
                Cubo1C3G.setBackground(C3);
            } else if (C3.equals(new Color(16,175,107))) {
                Cubo1C3.setSelectedItem("Verde");
                Cubo1.C3I = "V";
                Cubo1C3G.setText(Cubo1.C3I);
                Cubo1C3G.setBackground(C3);
            } else if (C3.equals(new Color(255,234,78))) {
                Cubo1C3.setSelectedItem("Amarillo");
                Cubo1.C3I = "A";
                Cubo1C3G.setText(Cubo1.C3I);
                Cubo1C3G.setBackground(C3);

            }

            if (C4.equals(new Color(155,22,57))) {
                Cubo1C4.setSelectedItem("Rojo");
                Cubo1.C4I = "R";
                Cubo1C4G.setText(Cubo1.C4I);
                Cubo1C4G.setBackground(C4);
            } else if (C4.equals(new Color(255, 255, 255))) {
                Cubo1C4.setSelectedItem("Blanco");
                Cubo1.C4I = "B";
                Cubo1C4G.setText(Cubo1.C4I);
                Cubo1C4G.setBackground(C4);
            } else if (C4.equals(new Color(16,175,107))) {
                Cubo1C4.setSelectedItem("Verde");
                Cubo1.C4I = "V";
                Cubo1C4G.setText(Cubo1.C4I);
                Cubo1C4G.setBackground(C4);
            } else if (C4.equals(new Color(255,234,78))) {
                Cubo1C4.setSelectedItem("Amarillo");
                Cubo1.C4I = "A";
                Cubo1C4G.setText(Cubo1.C4I);
                Cubo1C4G.setBackground(C4);

            }

            if (C5.equals(new Color(155,22,57))) {
                Cubo1C5.setSelectedItem("Rojo");
                Cubo1.C5I = "R";
                Cubo1C5G.setText(Cubo1.C5I);
                Cubo1C5G.setBackground(C5);
            } else if (C5.equals(new Color(255, 255, 255))) {
                Cubo1C5.setSelectedItem("Blanco");
                Cubo1.C5I = "B";
                Cubo1C5G.setText(Cubo1.C5I);
                Cubo1C5G.setBackground(C5);
            } else if (C5.equals(new Color(16,175,107))) {
                Cubo1C5.setSelectedItem("Verde");
                Cubo1.C5I = "V";
                Cubo1C5G.setText(Cubo1.C5I);
                Cubo1C5G.setBackground(C5);
            } else if (C5.equals(new Color(255,234,78))) {
                Cubo1C5.setSelectedItem("Amarillo");
                Cubo1.C5I = "A";
                Cubo1C5G.setText(Cubo1.C5I);
                Cubo1C5G.setBackground(C5);

            }

            if (C6.equals(new Color(155,22,57))) {
                Cubo1C6.setSelectedItem("Rojo");
                Cubo1.C6I = "R";
                Cubo1C6G.setText(Cubo1.C6I);
                Cubo1C6G.setBackground(C6);
            } else if (C6.equals(new Color(255, 255, 255))) {
                Cubo1C6.setSelectedItem("Blanco");
                Cubo1.C6I = "B";
                Cubo1C6G.setText(Cubo1.C6I);
                Cubo1C6G.setBackground(C6);
            } else if (C6.equals(new Color(16,175,107))) {
                Cubo1C6.setSelectedItem("Verde");
                Cubo1.C6I = "V";
                Cubo1C6G.setText(Cubo1.C6I);
                Cubo1C6G.setBackground(C6);
            } else if (C6.equals(new Color(255,234,78))) {
                Cubo1C6.setSelectedItem("Amarillo");
                Cubo1.C6I = "A";
                Cubo1C6G.setText(Cubo1.C6I);
                Cubo1C6G.setBackground(C6);

            }

            Cubo1.C1 = C1;
            Cubo1.C2 = C2;
            Cubo1.C3 = C3;
            Cubo1.C4 = C4;
            Cubo1.C5 = C5;
            Cubo1.C6 = C6;

            C1 = coloresDisp[random.nextInt(coloresDisp.length)];
            C2 = coloresDisp[random.nextInt(coloresDisp.length)];
            C3 = coloresDisp[random.nextInt(coloresDisp.length)];
            C4 = coloresDisp[random.nextInt(coloresDisp.length)];
            C5 = coloresDisp[random.nextInt(coloresDisp.length)];
            C6 = coloresDisp[random.nextInt(coloresDisp.length)];

            while (!((C1 != C2 && C1 != C3 && C1 != C4) && (C2 != C3 && C2 != C4) && (C3 != C4))) {
                C1 = coloresDisp[random.nextInt(coloresDisp.length)];
                C2 = coloresDisp[random.nextInt(coloresDisp.length)];
                C3 = coloresDisp[random.nextInt(coloresDisp.length)];
                C4 = coloresDisp[random.nextInt(coloresDisp.length)];

            }

            if (C1.equals(new Color(155,22,57))) {
                Cubo2C1.setSelectedItem("Rojo");
                Cubo2.C1I = "R";
                Cubo2C1G.setText(Cubo2.C1I);
                Cubo2C1G.setBackground(C1);
            } else if (C1.equals(new Color(255, 255, 255))) {
                Cubo2C1.setSelectedItem("Blanco");
                Cubo2.C1I = "B";
                Cubo2C1G.setText(Cubo2.C1I);
                Cubo2C1G.setBackground(C1);
            } else if (C1.equals(new Color(16,175,107))) {
                Cubo2C1.setSelectedItem("Verde");
                Cubo2.C1I = "V";
                Cubo2C1G.setBackground(C1);
                Cubo2C1G.setText(Cubo2.C1I);
                Cubo2C1G.setBackground(C1);
            } else if (C1.equals(new Color(255,234,78))) {
                Cubo2C1.setSelectedItem("Amarillo");
                Cubo2.C1I = "A";
                Cubo2C1G.setText(Cubo2.C1I);
                Cubo2C1G.setBackground(C1);

            }

            if (C2.equals(new Color(155,22,57))) {
                Cubo2C2.setSelectedItem("Rojo");
                Cubo2.C2I = "R";
                Cubo2C2G.setText(Cubo2.C2I);
                Cubo2C2G.setBackground(C2);
            } else if (C2.equals(new Color(255, 255, 255))) {
                Cubo2C2.setSelectedItem("Blanco");
                Cubo2.C2I = "B";
                Cubo2C2G.setText(Cubo2.C2I);
                Cubo2C2G.setBackground(C2);
            } else if (C2.equals(new Color(16,175,107))) {
                Cubo2C2.setSelectedItem("Verde");
                Cubo2.C2I = "V";
                Cubo2C2G.setText(Cubo2.C2I);
                Cubo2C2G.setBackground(C2);
            } else if (C2.equals(new Color(255,234,78))) {
                Cubo2C2.setSelectedItem("Amarillo");
                Cubo2.C2I = "A";
                Cubo2C2G.setText(Cubo2.C2I);
                Cubo2C2G.setBackground(C2);

            }

            if (C3.equals(new Color(155,22,57))) {
                Cubo2C3.setSelectedItem("Rojo");
                Cubo2.C3I = "R";
                Cubo2C3G.setText(Cubo2.C3I);
                Cubo2C3G.setBackground(C3);
            } else if (C3.equals(new Color(255, 255, 255))) {
                Cubo2C3.setSelectedItem("Blanco");
                Cubo2.C3I = "B";
                Cubo2C3G.setText(Cubo2.C3I);
                Cubo2C3G.setBackground(C3);
            } else if (C3.equals(new Color(16,175,107))) {
                Cubo2C3.setSelectedItem("Verde");
                Cubo2.C3I = "V";
                Cubo2C3G.setText(Cubo2.C3I);
                Cubo2C3G.setBackground(C3);
            } else if (C3.equals(new Color(255,234,78))) {
                Cubo2C3.setSelectedItem("Amarillo");
                Cubo2.C3I = "A";
                Cubo2C3G.setText(Cubo2.C3I);
                Cubo2C3G.setBackground(C3);

            }

            if (C4.equals(new Color(155,22,57))) {
                Cubo2C4.setSelectedItem("Rojo");
                Cubo2.C4I = "R";
                Cubo2C4G.setText(Cubo2.C4I);
                Cubo2C4G.setBackground(C4);
            } else if (C4.equals(new Color(255, 255, 255))) {
                Cubo2C4.setSelectedItem("Blanco");
                Cubo2.C4I = "B";
                Cubo2C4G.setText(Cubo2.C4I);
                Cubo2C4G.setBackground(C4);
            } else if (C4.equals(new Color(16,175,107))) {
                Cubo2C4.setSelectedItem("Verde");
                Cubo2.C4I = "V";
                Cubo2C4G.setText(Cubo2.C4I);
                Cubo2C4G.setBackground(C4);
            } else if (C4.equals(new Color(255,234,78))) {
                Cubo2C4.setSelectedItem("Amarillo");
                Cubo2.C4I = "A";
                Cubo2C4G.setText(Cubo2.C4I);
                Cubo2C4G.setBackground(C4);

            }

            if (C5.equals(new Color(155,22,57))) {
                Cubo2C5.setSelectedItem("Rojo");
                Cubo2.C5I = "R";
                Cubo2C5G.setText(Cubo2.C5I);
                Cubo2C5G.setBackground(C5);
            } else if (C5.equals(new Color(255, 255, 255))) {
                Cubo2C5.setSelectedItem("Blanco");
                Cubo2.C5I = "B";
                Cubo2C5G.setText(Cubo2.C5I);
                Cubo2C5G.setBackground(C5);
            } else if (C5.equals(new Color(16,175,107))) {
                Cubo2C5.setSelectedItem("Verde");
                Cubo2.C5I = "V";
                Cubo2C5G.setText(Cubo2.C5I);
                Cubo2C5G.setBackground(C5);
            } else if (C5.equals(new Color(255,234,78))) {
                Cubo2C5.setSelectedItem("Amarillo");
                Cubo2.C5I = "A";
                Cubo2C5G.setText(Cubo2.C5I);
                Cubo2C5G.setBackground(C5);

            }

            if (C6.equals(new Color(155,22,57))) {
                Cubo2C6.setSelectedItem("Rojo");
                Cubo2.C6I = "R";
                Cubo2C6G.setText(Cubo2.C6I);
                Cubo2C6G.setBackground(C6);
            } else if (C6.equals(new Color(255, 255, 255))) {
                Cubo2C6.setSelectedItem("Blanco");
                Cubo2.C6I = "B";
                Cubo2C6G.setText(Cubo2.C6I);
                Cubo2C6G.setBackground(C6);
            } else if (C6.equals(new Color(16,175,107))) {
                Cubo2C6.setSelectedItem("Verde");
                Cubo2.C6I = "V";
                Cubo2C6G.setText(Cubo2.C6I);
                Cubo2C6G.setBackground(C6);
            } else if (C6.equals(new Color(255,234,78))) {
                Cubo2C6.setSelectedItem("Amarillo");
                Cubo2.C6I = "A";
                Cubo2C6G.setText(Cubo2.C6I);
                Cubo2C6G.setBackground(C6);

            }

            Cubo2.C1 = C1;
            Cubo2.C2 = C2;
            Cubo2.C3 = C3;
            Cubo2.C4 = C4;
            Cubo2.C5 = C5;
            Cubo2.C6 = C6;

            C1 = coloresDisp[random.nextInt(coloresDisp.length)];
            C2 = coloresDisp[random.nextInt(coloresDisp.length)];
            C3 = coloresDisp[random.nextInt(coloresDisp.length)];
            C4 = coloresDisp[random.nextInt(coloresDisp.length)];
            C5 = coloresDisp[random.nextInt(coloresDisp.length)];
            C6 = coloresDisp[random.nextInt(coloresDisp.length)];

            while (!((C1 != C2 && C1 != C3 && C1 != C4) && (C2 != C3 && C2 != C4) && (C3 != C4))) {
                C1 = coloresDisp[random.nextInt(coloresDisp.length)];
                C2 = coloresDisp[random.nextInt(coloresDisp.length)];
                C3 = coloresDisp[random.nextInt(coloresDisp.length)];
                C4 = coloresDisp[random.nextInt(coloresDisp.length)];

            }

            if (C1.equals(new Color(155,22,57))) {
                Cubo3C1.setSelectedItem("Rojo");
                Cubo3.C1I = "R";
                Cubo3C1G.setText(Cubo3.C1I);
                Cubo3C1G.setBackground(C1);
            } else if (C1.equals(new Color(255, 255, 255))) {
                Cubo3C1.setSelectedItem("Blanco");
                Cubo3.C1I = "B";
                Cubo3C1G.setText(Cubo3.C1I);
                Cubo3C1G.setBackground(C1);
            } else if (C1.equals(new Color(16,175,107))) {
                Cubo3C1.setSelectedItem("Verde");
                Cubo3.C1I = "V";
                Cubo3C1G.setText(Cubo3.C1I);
                Cubo3C1G.setBackground(C1);
            } else if (C1.equals(new Color(255,234,78))) {
                Cubo3C1.setSelectedItem("Amarillo");
                Cubo3.C1I = "A";
                Cubo3C1G.setText(Cubo3.C1I);
                Cubo3C1G.setBackground(C1);

            }

            if (C2.equals(new Color(155,22,57))) {
                Cubo3C2.setSelectedItem("Rojo");
                Cubo3.C2I = "R";
                Cubo3C2G.setText(Cubo3.C2I);
                Cubo3C2G.setBackground(C2);
            } else if (C2.equals(new Color(255, 255, 255))) {
                Cubo3C2.setSelectedItem("Blanco");
                Cubo3.C2I = "B";
                Cubo3C2G.setText(Cubo3.C2I);
                Cubo3C2G.setBackground(C2);
            } else if (C2.equals(new Color(16,175,107))) {
                Cubo3C2.setSelectedItem("Verde");
                Cubo3.C2I = "V";
                Cubo3C2G.setText(Cubo3.C2I);
                Cubo3C2G.setBackground(C2);
            } else if (C2.equals(new Color(255,234,78))) {
                Cubo3C2.setSelectedItem("Amarillo");
                Cubo3.C2I = "A";
                Cubo3C2G.setText(Cubo3.C2I);
                Cubo3C2G.setBackground(C2);

            }

            if (C3.equals(new Color(155,22,57))) {
                Cubo3C3.setSelectedItem("Rojo");
                Cubo3.C3I = "R";
                Cubo3C3G.setText(Cubo3.C3I);
                Cubo3C3G.setBackground(C3);
            } else if (C3.equals(new Color(255, 255, 255))) {
                Cubo3C3.setSelectedItem("Blanco");
                Cubo3.C3I = "B";
                Cubo3C3G.setText(Cubo3.C3I);
                Cubo3C3G.setBackground(C3);
            } else if (C3.equals(new Color(16,175,107))) {
                Cubo3C3.setSelectedItem("Verde");
                Cubo3.C3I = "V";
                Cubo3C3G.setText(Cubo3.C3I);
                Cubo3C3G.setBackground(C3);
            } else if (C3.equals(new Color(255,234,78))) {
                Cubo3C3.setSelectedItem("Amarillo");
                Cubo3.C3I = "A";
                Cubo3C3G.setText(Cubo3.C3I);
                Cubo3C3G.setBackground(C3);

            }

            if (C4.equals(new Color(155,22,57))) {
                Cubo3C4.setSelectedItem("Rojo");
                Cubo3.C4I = "R";
                Cubo3C4G.setText(Cubo3.C4I);
                Cubo3C4G.setBackground(C4);
            } else if (C4.equals(new Color(255, 255, 255))) {
                Cubo3C4.setSelectedItem("Blanco");
                Cubo3.C4I = "B";
                Cubo3C4G.setText(Cubo3.C4I);
                Cubo3C4G.setBackground(C4);
            } else if (C4.equals(new Color(16,175,107))) {
                Cubo3C4.setSelectedItem("Verde");
                Cubo3.C4I = "V";
                Cubo3C4G.setText(Cubo3.C4I);
                Cubo3C4G.setBackground(C4);
            } else if (C4.equals(new Color(255,234,78))) {
                Cubo3C4.setSelectedItem("Amarillo");
                Cubo3.C4I = "A";
                Cubo3C4G.setText(Cubo3.C4I);
                Cubo3C4G.setBackground(C4);

            }

            if (C5.equals(new Color(155,22,57))) {
                Cubo3C5.setSelectedItem("Rojo");
                Cubo3.C5I = "R";
                Cubo3C5G.setText(Cubo3.C5I);
                Cubo3C5G.setBackground(C5);
            } else if (C5.equals(new Color(255, 255, 255))) {
                Cubo3C5.setSelectedItem("Blanco");
                Cubo3.C5I = "B";
                Cubo3C5G.setText(Cubo3.C5I);
                Cubo3C5G.setBackground(C5);
            } else if (C5.equals(new Color(16,175,107))) {
                Cubo3C5.setSelectedItem("Verde");
                Cubo3.C5I = "V";
                Cubo3C5G.setText(Cubo3.C5I);
                Cubo3C5G.setBackground(C5);
            } else if (C5.equals(new Color(255,234,78))) {
                Cubo3C5.setSelectedItem("Amarillo");
                Cubo3.C5I = "A";
                Cubo3C5G.setText(Cubo3.C5I);
                Cubo3C5G.setBackground(C5);

            }

            if (C6.equals(new Color(155,22,57))) {
                Cubo3C6.setSelectedItem("Rojo");
                Cubo3.C6I = "R";
                Cubo3C6G.setText(Cubo3.C6I);
                Cubo3C6G.setBackground(C6);
            } else if (C6.equals(new Color(255, 255, 255))) {
                Cubo3C6.setSelectedItem("Blanco");
                Cubo3.C6I = "B";
                Cubo3C6G.setText(Cubo3.C6I);
                Cubo3C6G.setBackground(C6);
            } else if (C6.equals(new Color(16,175,107))) {
                Cubo3C6.setSelectedItem("Verde");
                Cubo3.C6I = "V";
                Cubo3C6G.setText(Cubo3.C6I);
                Cubo3C6G.setBackground(C6);
            } else if (C6.equals(new Color(255,234,78))) {
                Cubo3C6.setSelectedItem("Amarillo");
                Cubo3.C6I = "A";
                Cubo3C6G.setText(Cubo3.C6I);
                Cubo3C6G.setBackground(C6);

            }
            Cubo3.C1 = C1;
            Cubo3.C2 = C2;
            Cubo3.C3 = C3;
            Cubo3.C4 = C4;
            Cubo3.C5 = C5;
            Cubo3.C6 = C6;

            C1 = coloresDisp[random.nextInt(coloresDisp.length)];
            C2 = coloresDisp[random.nextInt(coloresDisp.length)];
            C3 = coloresDisp[random.nextInt(coloresDisp.length)];
            C4 = coloresDisp[random.nextInt(coloresDisp.length)];
            C5 = coloresDisp[random.nextInt(coloresDisp.length)];
            C6 = coloresDisp[random.nextInt(coloresDisp.length)];

            while (!((C1 != C2 && C1 != C3 && C1 != C4) && (C2 != C3 && C2 != C4) && (C3 != C4))) {
                C1 = coloresDisp[random.nextInt(coloresDisp.length)];
                C2 = coloresDisp[random.nextInt(coloresDisp.length)];
                C3 = coloresDisp[random.nextInt(coloresDisp.length)];
                C4 = coloresDisp[random.nextInt(coloresDisp.length)];

            }

            if (C1.equals(new Color(155,22,57))) {
                Cubo4C1.setSelectedItem("Rojo");
                Cubo4.C1I = "R";
                Cubo4C1G.setText(Cubo4.C1I);
                Cubo4C1G.setBackground(C1);
            } else if (C1.equals(new Color(255, 255, 255))) {
                Cubo4C1.setSelectedItem("Blanco");
                Cubo4.C1I = "B";
                Cubo4C1G.setText(Cubo4.C1I);
                Cubo4C1G.setBackground(C1);
            } else if (C1.equals(new Color(16,175,107))) {
                Cubo4C1.setSelectedItem("Verde");
                Cubo4.C1I = "V";
                Cubo4C1G.setText(Cubo4.C1I);
                Cubo4C1G.setBackground(C1);
            } else if (C1.equals(new Color(255,234,78))) {
                Cubo4C1.setSelectedItem("Amarillo");
                Cubo4.C1I = "A";
                Cubo4C1G.setText(Cubo4.C1I);
                Cubo4C1G.setBackground(C1);

            }

            if (C2.equals(new Color(155,22,57))) {
                Cubo4C2.setSelectedItem("Rojo");
                Cubo4.C2I = "R";
                Cubo4C2G.setText(Cubo4.C2I);
                Cubo4C2G.setBackground(C2);
            } else if (C2.equals(new Color(255, 255, 255))) {
                Cubo4C2.setSelectedItem("Blanco");
                Cubo4.C2I = "B";
                Cubo4C2G.setText(Cubo4.C2I);
                Cubo4C2G.setBackground(C2);
            } else if (C2.equals(new Color(16,175,107))) {
                Cubo4C2.setSelectedItem("Verde");
                Cubo4.C2I = "V";
                Cubo4C2G.setText(Cubo4.C2I);
                Cubo4C2G.setBackground(C2);
            } else if (C2.equals(new Color(255,234,78))) {
                Cubo4C2.setSelectedItem("Amarillo");
                Cubo4.C2I = "A";
                Cubo4C2G.setText(Cubo4.C2I);
                Cubo4C2G.setBackground(C2);

            }

            if (C3.equals(new Color(155,22,57))) {
                Cubo4C3.setSelectedItem("Rojo");
                Cubo4.C3I = "R";
                Cubo4C3G.setText(Cubo4.C3I);
                Cubo4C3G.setBackground(C3);
            } else if (C3.equals(new Color(255, 255, 255))) {
                Cubo4C3.setSelectedItem("Blanco");
                Cubo4.C3I = "B";
                Cubo4C3G.setText(Cubo4.C3I);
                Cubo4C3G.setBackground(C3);
            } else if (C3.equals(new Color(16,175,107))) {
                Cubo4C3.setSelectedItem("Verde");
                Cubo4.C3I = "V";
                Cubo4C3G.setText(Cubo4.C3I);
                Cubo4C3G.setBackground(C3);
            } else if (C3.equals(new Color(255,234,78))) {
                Cubo4C3.setSelectedItem("Amarillo");
                Cubo4.C3I = "A";
                Cubo4C3G.setText(Cubo4.C3I);
                Cubo4C3G.setBackground(C3);

            }

            if (C4.equals(new Color(155,22,57))) {
                Cubo4C4.setSelectedItem("Rojo");
                Cubo4.C4I = "R";
                Cubo4C4G.setText(Cubo4.C4I);
                Cubo4C4G.setBackground(C4);
            } else if (C4.equals(new Color(255, 255, 255))) {
                Cubo4C4.setSelectedItem("Blanco");
                Cubo4.C4I = "B";
                Cubo4C4G.setText(Cubo4.C4I);
                Cubo4C4G.setBackground(C4);
            } else if (C4.equals(new Color(16,175,107))) {
                Cubo4C4.setSelectedItem("Verde");
                Cubo4.C4I = "V";
                Cubo4C4G.setText(Cubo4.C4I);
                Cubo4C4G.setBackground(C4);
            } else if (C4.equals(new Color(255,234,78))) {
                Cubo4C4.setSelectedItem("Amarillo");
                Cubo4.C4I = "A";
                Cubo4C4G.setText(Cubo4.C4I);
                Cubo4C4G.setBackground(C4);

            }

            if (C5.equals(new Color(155,22,57))) {
                Cubo4C5.setSelectedItem("Rojo");
                Cubo4.C5I = "R";
                Cubo4C5G.setText(Cubo4.C5I);
                Cubo4C5G.setBackground(C5);
            } else if (C5.equals(new Color(255, 255, 255))) {
                Cubo4C5.setSelectedItem("Blanco");
                Cubo4.C5I = "B";
                Cubo4C5G.setText(Cubo4.C5I);
                Cubo4C5G.setBackground(C5);
            } else if (C5.equals(new Color(16,175,107))) {
                Cubo4C5.setSelectedItem("Verde");
                Cubo4.C5I = "V";
                Cubo4C5G.setText(Cubo4.C5I);
                Cubo4C5G.setBackground(C5);
            } else if (C5.equals(new Color(255,234,78))) {
                Cubo4C5.setSelectedItem("Amarillo");
                Cubo4.C5I = "A";
                Cubo4C5G.setText(Cubo4.C5I);
                Cubo4C5G.setBackground(C5);

            }

            if (C6.equals(new Color(155,22,57))) {
                Cubo4C6.setSelectedItem("Rojo");
                Cubo4.C6I = "R";
                Cubo4C6G.setText(Cubo4.C6I);
                Cubo4C6G.setBackground(C6);
            } else if (C6.equals(new Color(255, 255, 255))) {
                Cubo4C6.setSelectedItem("Blanco");
                Cubo4.C6I = "B";
                Cubo4C6G.setText(Cubo4.C6I);
                Cubo4C6G.setBackground(C6);
            } else if (C6.equals(new Color(16,175,107))) {
                Cubo4C6.setSelectedItem("Verde");
                Cubo4.C6I = "V";
                Cubo4C6G.setText(Cubo4.C6I);
                Cubo4C6G.setBackground(C6);
            } else if (C6.equals(new Color(255,234,78))) {
                Cubo4C6.setSelectedItem("Amarillo");
                Cubo4.C6I = "A";
                Cubo4C6G.setText(Cubo4.C6I);
                Cubo4C6G.setBackground(C6);

            }

            Cubo4.C1 = C1;
            Cubo4.C2 = C2;
            Cubo4.C3 = C3;
            Cubo4.C4 = C4;
            Cubo4.C5 = C5;
            Cubo4.C6 = C6;

        }
    }//GEN-LAST:event_genAleatorioActionPerformed

    public void BinariosOut() {

        // Cubo 1
        Cubo1Bin.C1 = Cubo1.C1;
        Cubo1Bin.C1I = Cubo1.C1I;
        Cubo1Bin.Cubo1C1JN = Cubo1C1J.getText();
        Cubo1Bin.Cubo1C1JB = Cubo1C1J.getBackground();

        Cubo1Bin.C2 = Cubo1.C2;
        Cubo1Bin.C2I = Cubo1.C2I;
        Cubo1Bin.Cubo1C2JN = Cubo1C2J.getText();
        Cubo1Bin.Cubo1C2JB = Cubo1C2J.getBackground();

        Cubo1Bin.C3 = Cubo1.C3;
        Cubo1Bin.C3I = Cubo1.C3I;
        Cubo1Bin.Cubo1C3JN = Cubo1C3J.getText();
        Cubo1Bin.Cubo1C3JB = Cubo1C3J.getBackground();

        Cubo1Bin.C4 = Cubo1.C4;
        Cubo1Bin.C4I = Cubo1.C4I;
        Cubo1Bin.Cubo1C4JN = Cubo1C4J.getText();
        Cubo1Bin.Cubo1C4JB = Cubo1C4J.getBackground();

        Cubo1Bin.C5 = Cubo1.C5;
        Cubo1Bin.C5I = Cubo1.C5I;
        Cubo1Bin.Cubo1C5JN = Cubo1C5J.getText();
        Cubo1Bin.Cubo1C5JB = Cubo1C5J.getBackground();

        Cubo1Bin.C6 = Cubo1.C6;
        Cubo1Bin.C6I = Cubo1.C6I;
        Cubo1Bin.Cubo1C6JN = Cubo1C6J.getText();
        Cubo1Bin.Cubo1C6JB = Cubo1C6J.getBackground();

        // Cubo 2
        Cubo2Bin.C1 = Cubo2.C1;
        Cubo2Bin.C1I = Cubo2.C1I;
        Cubo2Bin.Cubo2C1JN = Cubo2C1J.getText();
        Cubo2Bin.Cubo2C1JB = Cubo2C1J.getBackground();

        Cubo2Bin.C2 = Cubo2.C2;
        Cubo2Bin.C2I = Cubo2.C2I;
        Cubo2Bin.Cubo2C2JN = Cubo2C2J.getText();
        Cubo2Bin.Cubo2C2JB = Cubo2C2J.getBackground();

        Cubo2Bin.C3 = Cubo2.C3;
        Cubo2Bin.C3I = Cubo2.C3I;
        Cubo2Bin.Cubo2C3JN = Cubo2C3J.getText();
        Cubo2Bin.Cubo2C3JB = Cubo2C3J.getBackground();

        Cubo2Bin.C4 = Cubo2.C4;
        Cubo2Bin.C4I = Cubo2.C4I;
        Cubo2Bin.Cubo2C4JN = Cubo2C4J.getText();
        Cubo2Bin.Cubo2C4JB = Cubo2C4J.getBackground();

        Cubo2Bin.C5 = Cubo2.C5;
        Cubo2Bin.C5I = Cubo2.C5I;
        Cubo2Bin.Cubo2C5JN = Cubo2C5J.getText();
        Cubo2Bin.Cubo2C5JB = Cubo2C5J.getBackground();

        Cubo2Bin.C6 = Cubo2.C6;
        Cubo2Bin.C6I = Cubo2.C6I;
        Cubo2Bin.Cubo2C6JN = Cubo2C6J.getText();
        Cubo2Bin.Cubo2C6JB = Cubo2C6J.getBackground();

        // Cubo 3
        Cubo3Bin.C1 = Cubo3.C1;
        Cubo3Bin.C1I = Cubo3.C1I;
        Cubo3Bin.Cubo3C1JN = Cubo3C1J.getText();
        Cubo3Bin.Cubo3C1JB = Cubo3C1J.getBackground();

        Cubo3Bin.C2 = Cubo3.C2;
        Cubo3Bin.C2I = Cubo3.C2I;
        Cubo3Bin.Cubo3C2JN = Cubo3C2J.getText();
        Cubo3Bin.Cubo3C2JB = Cubo3C2J.getBackground();

        Cubo3Bin.C3 = Cubo3.C3;
        Cubo3Bin.C3I = Cubo3.C3I;
        Cubo3Bin.Cubo3C3JN = Cubo3C3J.getText();
        Cubo3Bin.Cubo3C3JB = Cubo3C3J.getBackground();

        Cubo3Bin.C4 = Cubo3.C4;
        Cubo3Bin.C4I = Cubo3.C4I;
        Cubo3Bin.Cubo3C4JN = Cubo3C4J.getText();
        Cubo3Bin.Cubo3C4JB = Cubo3C4J.getBackground();

        Cubo3Bin.C5 = Cubo3.C5;
        Cubo3Bin.C5I = Cubo3.C5I;
        Cubo3Bin.Cubo3C5JN = Cubo3C5J.getText();
        Cubo3Bin.Cubo3C5JB = Cubo3C5J.getBackground();

        Cubo3Bin.C6 = Cubo3.C6;
        Cubo3Bin.C6I = Cubo3.C6I;
        Cubo3Bin.Cubo3C6JN = Cubo3C6J.getText();
        Cubo3Bin.Cubo3C6JB = Cubo3C6J.getBackground();

        // Cubo 4
        Cubo4Bin.C1 = Cubo4.C1;
        Cubo4Bin.C1I = Cubo4.C1I;
        Cubo4Bin.Cubo4C1JN = Cubo4C1J.getText();
        Cubo4Bin.Cubo4C1JB = Cubo4C1J.getBackground();

        Cubo4Bin.C2 = Cubo4.C2;
        Cubo4Bin.C2I = Cubo4.C2I;
        Cubo4Bin.Cubo4C2JN = Cubo4C2J.getText();
        Cubo4Bin.Cubo4C2JB = Cubo4C2J.getBackground();

        Cubo4Bin.C3 = Cubo4.C3;
        Cubo4Bin.C3I = Cubo4.C3I;
        Cubo4Bin.Cubo4C3JN = Cubo4C3J.getText();
        Cubo4Bin.Cubo4C3JB = Cubo4C3J.getBackground();

        Cubo4Bin.C4 = Cubo4.C4;
        Cubo4Bin.C4I = Cubo4.C4I;
        Cubo4Bin.Cubo4C4JN = Cubo4C4J.getText();
        Cubo4Bin.Cubo4C4JB = Cubo4C4J.getBackground();

        Cubo4Bin.C5 = Cubo4.C5;
        Cubo4Bin.C5I = Cubo4.C5I;
        Cubo4Bin.Cubo4C5JN = Cubo4C5J.getText();
        Cubo4Bin.Cubo4C5JB = Cubo4C5J.getBackground();

        Cubo4Bin.C6 = Cubo4.C6;
        Cubo4Bin.C6I = Cubo4.C6I;
        Cubo4Bin.Cubo4C6JN = Cubo4C6J.getText();
        Cubo4Bin.Cubo4C6JB = Cubo4C6J.getBackground();

        try {
            // Crear un flujo de salida de archivos binarios
            F_binCubosOut = new FileOutputStream(binCubosNOut);

            // Crear un ObjectOutputStream para escribir objetos en el archivo binario
            O_binCubosOut = new ObjectOutputStream(F_binCubosOut);

            // Escribir el arreglo en el archivo binario
            O_binCubosOut.writeObject(Cubo1Bin);
            O_binCubosOut.writeObject(Cubo2Bin);
            O_binCubosOut.writeObject(Cubo3Bin);
            O_binCubosOut.writeObject(Cubo4Bin);

            // Cerrar los flujos
            O_binCubosOut.close();
            F_binCubosOut.close();

            System.out.println("Cubos.bin ha sido guardado con éxito");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void BinariosIn() {

        try {
            // Crear un flujo de entrada de archivos binarios
            F_binCubosIn = new FileInputStream(binCubosNIn);

            // Crear un ObjectInputStream para leer objetos desde el archivo binario
            O_binCubosIn = new ObjectInputStream(F_binCubosIn);

            // Leer el arreglo desde el archivo
            Cubo1Bin = (Binarios) O_binCubosIn.readObject();
            Cubo2Bin = (Binarios) O_binCubosIn.readObject();
            Cubo3Bin = (Binarios) O_binCubosIn.readObject();
            Cubo4Bin = (Binarios) O_binCubosIn.readObject();

            // Cerrar los flujos
            O_binCubosIn.close();
            F_binCubosIn.close();

            // Utilizar los objetos cargados
            // Cubo 1
            Cubo1.C1 = Cubo1Bin.C1;
            Cubo1.C1I = Cubo1Bin.C1I;
            Cubo1C1J.setText(Cubo1Bin.Cubo1C1JN);
            Cubo1C1J.setBackground(Cubo1Bin.Cubo1C1JB);

            Cubo1.C2 = Cubo1Bin.C2;
            Cubo1.C2I = Cubo1Bin.C2I;
            Cubo1C2J.setText(Cubo1Bin.Cubo1C2JN);
            Cubo1C2J.setBackground(Cubo1Bin.Cubo1C2JB);

            Cubo1.C3 = Cubo1Bin.C3;
            Cubo1.C3I = Cubo1Bin.C3I;
            Cubo1C3J.setText(Cubo1Bin.Cubo1C3JN);
            Cubo1C3J.setBackground(Cubo1Bin.Cubo1C3JB);

            Cubo1.C4 = Cubo1Bin.C4;
            Cubo1.C4I = Cubo1Bin.C4I;
            Cubo1C4J.setText(Cubo1Bin.Cubo1C4JN);
            Cubo1C4J.setBackground(Cubo1Bin.Cubo1C4JB);

            Cubo1.C5 = Cubo1Bin.C5;
            Cubo1.C5I = Cubo1Bin.C5I;
            Cubo1C5J.setText(Cubo1Bin.Cubo1C5JN);
            Cubo1C5J.setBackground(Cubo1Bin.Cubo1C5JB);

            Cubo1.C6 = Cubo1Bin.C6;
            Cubo1.C6I = Cubo1Bin.C6I;
            Cubo1C6J.setText(Cubo1Bin.Cubo1C6JN);
            Cubo1C6J.setBackground(Cubo1Bin.Cubo1C6JB);

            if (Cubo1.C1I.equals("R")) {
                Cubo1C1.setSelectedItem("Rojo");
                Cubo1C1G.setText("R");
                Cubo1C1G.setBackground(Cubo1.C1);
            } else if (Cubo1.C1I.equals("B")) {
                Cubo1C1.setSelectedItem("Blanco");
                Cubo1C1G.setText("B");
                Cubo1C1G.setBackground(Cubo1.C1);
            } else if (Cubo1.C1I.equals("V")) {
                Cubo1C1.setSelectedItem("Verde");
                Cubo1C1G.setText("V");
                Cubo1C1G.setBackground(Cubo1.C1);
            } else if (Cubo1.C1I.equals("A")) {
                Cubo1C1.setSelectedItem("Amarillo");
                Cubo1C1G.setText("A");
                Cubo1C1G.setBackground(Cubo1.C1);
            }

            if (Cubo1.C2I.equals("R")) {
                Cubo1C2.setSelectedItem("Rojo");
                Cubo1C2G.setText("R");
                Cubo1C2G.setBackground(Cubo1.C2);
            } else if (Cubo1.C2I.equals("B")) {
                Cubo1C2.setSelectedItem("Blanco");
                Cubo1C2G.setText("B");
                Cubo1C2G.setBackground(Cubo1.C2);
            } else if (Cubo1.C2I.equals("V")) {
                Cubo1C2.setSelectedItem("Verde");
                Cubo1C2G.setText("V");
                Cubo1C2G.setBackground(Cubo1.C2);
            } else if (Cubo1.C2I.equals("A")) {
                Cubo1C2.setSelectedItem("Amarillo");
                Cubo1C2G.setText("A");
                Cubo1C2G.setBackground(Cubo1.C2);
            }

            if (Cubo1.C3I.equals("R")) {
                Cubo1C3.setSelectedItem("Rojo");
                Cubo1C3G.setText("R");
                Cubo1C3G.setBackground(Cubo1.C3);
            } else if (Cubo1.C3I.equals("B")) {
                Cubo1C3.setSelectedItem("Blanco");
                Cubo1C3G.setText("B");
                Cubo1C3G.setBackground(Cubo1.C3);
            } else if (Cubo1.C3I.equals("V")) {
                Cubo1C3.setSelectedItem("Verde");
                Cubo1C3G.setText("V");
                Cubo1C3G.setBackground(Cubo1.C3);
            } else if (Cubo1.C3I.equals("A")) {
                Cubo1C3.setSelectedItem("Amarillo");
                Cubo1C3G.setText("A");
                Cubo1C3G.setBackground(Cubo1.C3);
            }

            if (Cubo1.C4I.equals("R")) {
                Cubo1C4.setSelectedItem("Rojo");
                Cubo1C4G.setText("R");
                Cubo1C4G.setBackground(Cubo1.C4);
            } else if (Cubo1.C4I.equals("B")) {
                Cubo1C4.setSelectedItem("Blanco");
                Cubo1C4G.setText("B");
                Cubo1C4G.setBackground(Cubo1.C4);
            } else if (Cubo1.C4I.equals("V")) {
                Cubo1C4.setSelectedItem("Verde");
                Cubo1C4G.setText("V");
                Cubo1C4G.setBackground(Cubo1.C4);
            } else if (Cubo1.C4I.equals("A")) {
                Cubo1C4.setSelectedItem("Amarillo");
                Cubo1C4G.setText("A");
                Cubo1C4G.setBackground(Cubo1.C4);
            }

            if (Cubo1.C5I.equals("R")) {
                Cubo1C5.setSelectedItem("Rojo");
                Cubo1C5G.setText("R");
                Cubo1C5G.setBackground(Cubo1.C5);
            } else if (Cubo1.C5I.equals("B")) {
                Cubo1C5.setSelectedItem("Blanco");
                Cubo1C5G.setText("B");
                Cubo1C5G.setBackground(Cubo1.C5);
            } else if (Cubo1.C5I.equals("V")) {
                Cubo1C5.setSelectedItem("Verde");
                Cubo1C5G.setText("V");
                Cubo1C5G.setBackground(Cubo1.C5);
            } else if (Cubo1.C5I.equals("A")) {
                Cubo1C5.setSelectedItem("Amarillo");
                Cubo1C5G.setText("A");
                Cubo1C5G.setBackground(Cubo1.C5);
            }

            if (Cubo1.C6I.equals("R")) {
                Cubo1C6.setSelectedItem("Rojo");
                Cubo1C6G.setText("R");
                Cubo1C6G.setBackground(Cubo1.C6);
            } else if (Cubo1.C6I.equals("B")) {
                Cubo1C6.setSelectedItem("Blanco");
                Cubo1C6G.setText("B");
                Cubo1C6G.setBackground(Cubo1.C6);
            } else if (Cubo1.C6I.equals("V")) {
                Cubo1C6.setSelectedItem("Verde");
                Cubo1C6G.setText("V");
                Cubo1C6G.setBackground(Cubo1.C6);
            } else if (Cubo1.C6I.equals("A")) {
                Cubo1C6.setSelectedItem("Amarillo");
                Cubo1C6G.setText("A");
                Cubo1C6G.setBackground(Cubo1.C6);
            }

            // Cubo 2
            Cubo2.C1 = Cubo2Bin.C1;
            Cubo2.C1I = Cubo2Bin.C1I;
            Cubo2C1J.setText(Cubo2Bin.Cubo2C1JN);
            Cubo2C1J.setBackground(Cubo2Bin.Cubo2C1JB);

            Cubo2.C2 = Cubo2Bin.C2;
            Cubo2.C2I = Cubo2Bin.C2I;
            Cubo2C2J.setText(Cubo2Bin.Cubo2C2JN);
            Cubo2C2J.setBackground(Cubo2Bin.Cubo2C2JB);

            Cubo2.C3 = Cubo2Bin.C3;
            Cubo2.C3I = Cubo2Bin.C3I;
            Cubo2C3J.setText(Cubo2Bin.Cubo2C3JN);
            Cubo2C3J.setBackground(Cubo2Bin.Cubo2C3JB);

            Cubo2.C4 = Cubo2Bin.C4;
            Cubo2.C4I = Cubo2Bin.C4I;
            Cubo2C4J.setText(Cubo2Bin.Cubo2C4JN);
            Cubo2C4J.setBackground(Cubo2Bin.Cubo2C4JB);

            Cubo2.C5 = Cubo2Bin.C5;
            Cubo2.C5I = Cubo2Bin.C5I;
            Cubo2C5J.setText(Cubo2Bin.Cubo2C5JN);
            Cubo2C5J.setBackground(Cubo2Bin.Cubo2C5JB);

            Cubo2.C6 = Cubo2Bin.C6;
            Cubo2.C6I = Cubo2Bin.C6I;
            Cubo2C6J.setText(Cubo2Bin.Cubo2C6JN);
            Cubo2C6J.setBackground(Cubo2Bin.Cubo2C6JB);

            if (Cubo2.C1I.equals("R")) {
                Cubo2C1.setSelectedItem("Rojo");
                Cubo2C1G.setText("R");
                Cubo2C1G.setBackground(Cubo2.C1);
            } else if (Cubo2.C1I.equals("B")) {
                Cubo2C1.setSelectedItem("Blanco");
                Cubo2C1G.setText("B");
                Cubo2C1G.setBackground(Cubo2.C1);
            } else if (Cubo2.C1I.equals("V")) {
                Cubo2C1.setSelectedItem("Verde");
                Cubo2C1G.setText("V");
                Cubo2C1G.setBackground(Cubo2.C1);
            } else if (Cubo2.C1I.equals("A")) {
                Cubo2C1.setSelectedItem("Amarillo");
                Cubo2C1G.setText("A");
                Cubo2C1G.setBackground(Cubo2.C1);
            }

            if (Cubo2.C2I.equals("R")) {
                Cubo2C2.setSelectedItem("Rojo");
                Cubo2C2G.setText("R");
                Cubo2C2G.setBackground(Cubo2.C2);
            } else if (Cubo2.C2I.equals("B")) {
                Cubo2C2.setSelectedItem("Blanco");
                Cubo2C2G.setText("B");
                Cubo2C2G.setBackground(Cubo2.C2);
            } else if (Cubo2.C2I.equals("V")) {
                Cubo2C2.setSelectedItem("Verde");
                Cubo2C2G.setText("V");
                Cubo2C2G.setBackground(Cubo2.C2);
            } else if (Cubo2.C2I.equals("A")) {
                Cubo2C2.setSelectedItem("Amarillo");
                Cubo2C2G.setText("A");
                Cubo2C2G.setBackground(Cubo2.C2);
            }

            if (Cubo2.C3I.equals("R")) {
                Cubo2C3.setSelectedItem("Rojo");
                Cubo2C3G.setText("R");
                Cubo2C3G.setBackground(Cubo2.C3);
            } else if (Cubo2.C3I.equals("B")) {
                Cubo2C3.setSelectedItem("Blanco");
                Cubo2C3G.setText("B");
                Cubo2C3G.setBackground(Cubo2.C3);
            } else if (Cubo2.C3I.equals("V")) {
                Cubo2C3.setSelectedItem("Verde");
                Cubo2C3G.setText("V");
                Cubo2C3G.setBackground(Cubo2.C3);
            } else if (Cubo2.C3I.equals("A")) {
                Cubo2C3.setSelectedItem("Amarillo");
                Cubo2C3G.setText("A");
                Cubo2C3G.setBackground(Cubo2.C3);
            }

            if (Cubo2.C4I.equals("R")) {
                Cubo2C4.setSelectedItem("Rojo");
                Cubo2C4G.setText("R");
                Cubo2C4G.setBackground(Cubo2.C4);
            } else if (Cubo2.C4I.equals("B")) {
                Cubo2C4.setSelectedItem("Blanco");
                Cubo2C4G.setText("B");
                Cubo2C4G.setBackground(Cubo2.C4);
            } else if (Cubo2.C4I.equals("V")) {
                Cubo2C4.setSelectedItem("Verde");
                Cubo2C4G.setText("V");
                Cubo2C4G.setBackground(Cubo2.C4);
            } else if (Cubo2.C4I.equals("A")) {
                Cubo2C4.setSelectedItem("Amarillo");
                Cubo2C4G.setText("A");
                Cubo2C4G.setBackground(Cubo2.C4);
            }

            if (Cubo2.C5I.equals("R")) {
                Cubo2C5.setSelectedItem("Rojo");
                Cubo2C5G.setText("R");
                Cubo2C5G.setBackground(Cubo2.C5);
            } else if (Cubo2.C5I.equals("B")) {
                Cubo2C5.setSelectedItem("Blanco");
                Cubo2C5G.setText("B");
                Cubo2C5G.setBackground(Cubo2.C5);
            } else if (Cubo2.C5I.equals("V")) {
                Cubo2C5.setSelectedItem("Verde");
                Cubo2C5G.setText("V");
                Cubo2C5G.setBackground(Cubo2.C5);
            } else if (Cubo2.C5I.equals("A")) {
                Cubo2C5.setSelectedItem("Amarillo");
                Cubo2C5G.setText("A");
                Cubo2C5G.setBackground(Cubo2.C5);
            }

            if (Cubo2.C6I.equals("R")) {
                Cubo2C6.setSelectedItem("Rojo");
                Cubo2C6G.setText("R");
                Cubo2C6G.setBackground(Cubo2.C6);
            } else if (Cubo2.C6I.equals("B")) {
                Cubo2C6.setSelectedItem("Blanco");
                Cubo2C6G.setText("B");
                Cubo2C6G.setBackground(Cubo2.C6);
            } else if (Cubo2.C6I.equals("V")) {
                Cubo2C6.setSelectedItem("Verde");
                Cubo2C6G.setText("V");
                Cubo2C6G.setBackground(Cubo2.C6);
            } else if (Cubo2.C6I.equals("A")) {
                Cubo2C6.setSelectedItem("Amarillo");
                Cubo2C6G.setText("A");
                Cubo2C6G.setBackground(Cubo2.C6);
            }

            // Cubo 3
            Cubo3.C1 = Cubo3Bin.C1;
            Cubo3.C1I = Cubo3Bin.C1I;
            Cubo3C1J.setText(Cubo3Bin.Cubo3C1JN);
            Cubo3C1J.setBackground(Cubo3Bin.Cubo3C1JB);

            Cubo3.C2 = Cubo3Bin.C2;
            Cubo3.C2I = Cubo3Bin.C2I;
            Cubo3C2J.setText(Cubo3Bin.Cubo3C2JN);
            Cubo3C2J.setBackground(Cubo3Bin.Cubo3C2JB);

            Cubo3.C3 = Cubo3Bin.C3;
            Cubo3.C3I = Cubo3Bin.C3I;
            Cubo3C3J.setText(Cubo3Bin.Cubo3C3JN);
            Cubo3C3J.setBackground(Cubo3Bin.Cubo3C3JB);

            Cubo3.C4 = Cubo3Bin.C4;
            Cubo3.C4I = Cubo3Bin.C4I;
            Cubo3C4J.setText(Cubo3Bin.Cubo3C4JN);
            Cubo3C4J.setBackground(Cubo3Bin.Cubo3C4JB);

            Cubo3.C5 = Cubo3Bin.C5;
            Cubo3.C5I = Cubo3Bin.C5I;
            Cubo3C5J.setText(Cubo3Bin.Cubo3C5JN);
            Cubo3C5J.setBackground(Cubo3Bin.Cubo3C5JB);

            Cubo3.C6 = Cubo3Bin.C6;
            Cubo3.C6I = Cubo3Bin.C6I;
            Cubo3C6J.setText(Cubo3Bin.Cubo3C6JN);
            Cubo3C6J.setBackground(Cubo3Bin.Cubo3C6JB);

            if (Cubo3.C1I.equals("R")) {
                Cubo3C1.setSelectedItem("Rojo");
                Cubo3C1G.setText("R");
                Cubo3C1G.setBackground(Cubo3.C1);
            } else if (Cubo3.C1I.equals("B")) {
                Cubo3C1.setSelectedItem("Blanco");
                Cubo3C1G.setText("B");
                Cubo3C1G.setBackground(Cubo3.C1);
            } else if (Cubo3.C1I.equals("V")) {
                Cubo3C1.setSelectedItem("Verde");
                Cubo3C1G.setText("V");
                Cubo3C1G.setBackground(Cubo3.C1);
            } else if (Cubo3.C1I.equals("A")) {
                Cubo3C1.setSelectedItem("Amarillo");
                Cubo3C1G.setText("A");
                Cubo3C1G.setBackground(Cubo3.C1);
            }

            if (Cubo3.C2I.equals("R")) {
                Cubo3C2.setSelectedItem("Rojo");
                Cubo3C2G.setText("R");
                Cubo3C2G.setBackground(Cubo3.C2);
            } else if (Cubo3.C2I.equals("B")) {
                Cubo3C2.setSelectedItem("Blanco");
                Cubo3C2G.setText("B");
                Cubo3C2G.setBackground(Cubo3.C2);
            } else if (Cubo3.C2I.equals("V")) {
                Cubo3C2.setSelectedItem("Verde");
                Cubo3C2G.setText("V");
                Cubo3C2G.setBackground(Cubo3.C2);
            } else if (Cubo3.C2I.equals("A")) {
                Cubo3C2.setSelectedItem("Amarillo");
                Cubo3C2G.setText("A");
                Cubo3C2G.setBackground(Cubo3.C2);
            }

            if (Cubo3.C3I.equals("R")) {
                Cubo3C3.setSelectedItem("Rojo");
                Cubo3C3G.setText("R");
                Cubo3C3G.setBackground(Cubo3.C3);
            } else if (Cubo3.C3I.equals("B")) {
                Cubo3C3.setSelectedItem("Blanco");
                Cubo3C3G.setText("B");
                Cubo3C3G.setBackground(Cubo3.C3);
            } else if (Cubo3.C3I.equals("V")) {
                Cubo3C3.setSelectedItem("Verde");
                Cubo3C3G.setText("V");
                Cubo3C3G.setBackground(Cubo3.C3);
            } else if (Cubo3.C3I.equals("A")) {
                Cubo3C3.setSelectedItem("Amarillo");
                Cubo3C3G.setText("A");
                Cubo3C3G.setBackground(Cubo3.C3);
            }

            if (Cubo3.C4I.equals("R")) {
                Cubo3C4.setSelectedItem("Rojo");
                Cubo3C4G.setText("R");
                Cubo3C4G.setBackground(Cubo3.C4);
            } else if (Cubo3.C4I.equals("B")) {
                Cubo3C4.setSelectedItem("Blanco");
                Cubo3C4G.setText("B");
                Cubo3C4G.setBackground(Cubo3.C4);
            } else if (Cubo3.C4I.equals("V")) {
                Cubo3C4.setSelectedItem("Verde");
                Cubo3C4G.setText("V");
                Cubo3C4G.setBackground(Cubo3.C4);
            } else if (Cubo3.C4I.equals("A")) {
                Cubo3C4.setSelectedItem("Amarillo");
                Cubo3C4G.setText("A");
                Cubo3C4G.setBackground(Cubo3.C4);
            }

            if (Cubo3.C5I.equals("R")) {
                Cubo3C5.setSelectedItem("Rojo");
                Cubo3C5G.setText("R");
                Cubo3C5G.setBackground(Cubo3.C5);
            } else if (Cubo3.C5I.equals("B")) {
                Cubo3C5.setSelectedItem("Blanco");
                Cubo3C5G.setText("B");
                Cubo3C5G.setBackground(Cubo3.C5);
            } else if (Cubo3.C5I.equals("V")) {
                Cubo3C5.setSelectedItem("Verde");
                Cubo3C5G.setText("V");
                Cubo3C5G.setBackground(Cubo3.C5);
            } else if (Cubo3.C5I.equals("A")) {
                Cubo3C5.setSelectedItem("Amarillo");
                Cubo3C5G.setText("A");
                Cubo3C5G.setBackground(Cubo3.C5);
            }

            if (Cubo3.C6I.equals("R")) {
                Cubo3C6.setSelectedItem("Rojo");
                Cubo3C6G.setText("R");
                Cubo3C6G.setBackground(Cubo3.C6);
            } else if (Cubo3.C6I.equals("B")) {
                Cubo3C6.setSelectedItem("Blanco");
                Cubo3C6G.setText("B");
                Cubo3C6G.setBackground(Cubo3.C6);
            } else if (Cubo3.C6I.equals("V")) {
                Cubo3C6.setSelectedItem("Verde");
                Cubo3C6G.setText("V");
                Cubo3C6G.setBackground(Cubo3.C6);
            } else if (Cubo3.C6I.equals("A")) {
                Cubo3C6.setSelectedItem("Amarillo");
                Cubo3C6G.setText("A");
                Cubo3C6G.setBackground(Cubo3.C6);
            }

            // Cubo 4
            Cubo4.C1 = Cubo4Bin.C1;
            Cubo4.C1I = Cubo4Bin.C1I;
            Cubo4C1J.setText(Cubo4Bin.Cubo4C1JN);
            Cubo4C1J.setBackground(Cubo4Bin.Cubo4C1JB);

            Cubo4.C2 = Cubo4Bin.C2;
            Cubo4.C2I = Cubo4Bin.C2I;
            Cubo4C2J.setText(Cubo4Bin.Cubo4C2JN);
            Cubo4C2J.setBackground(Cubo4Bin.Cubo4C2JB);

            Cubo4.C3 = Cubo4Bin.C3;
            Cubo4.C3I = Cubo4Bin.C3I;
            Cubo4C3J.setText(Cubo4Bin.Cubo4C3JN);
            Cubo4C3J.setBackground(Cubo4Bin.Cubo4C3JB);

            Cubo4.C4 = Cubo4Bin.C4;
            Cubo4.C4I = Cubo4Bin.C4I;
            Cubo4C4J.setText(Cubo4Bin.Cubo4C4JN);
            Cubo4C4J.setBackground(Cubo4Bin.Cubo4C4JB);

            Cubo4.C5 = Cubo4Bin.C5;
            Cubo4.C5I = Cubo4Bin.C5I;
            Cubo4C5J.setText(Cubo4Bin.Cubo4C5JN);
            Cubo4C5J.setBackground(Cubo4Bin.Cubo4C5JB);

            Cubo4.C6 = Cubo4Bin.C6;
            Cubo4.C6I = Cubo4Bin.C6I;
            Cubo4C6J.setText(Cubo4Bin.Cubo4C6JN);
            Cubo4C6J.setBackground(Cubo4Bin.Cubo4C6JB);

            if (Cubo4.C1I.equals("R")) {
                Cubo4C1.setSelectedItem("Rojo");
                Cubo4C1G.setText("R");
                Cubo4C1G.setBackground(Cubo4.C1);
            } else if (Cubo4.C1I.equals("B")) {
                Cubo4C1.setSelectedItem("Blanco");
                Cubo4C1G.setText("B");
                Cubo4C1G.setBackground(Cubo4.C1);
            } else if (Cubo4.C1I.equals("V")) {
                Cubo4C1.setSelectedItem("Verde");
                Cubo4C1G.setText("V");
                Cubo4C1G.setBackground(Cubo4.C1);
            } else if (Cubo4.C1I.equals("A")) {
                Cubo4C1.setSelectedItem("Amarillo");
                Cubo4C1G.setText("A");
                Cubo4C1G.setBackground(Cubo4.C1);
            }

            if (Cubo4.C2I.equals("R")) {
                Cubo4C2.setSelectedItem("Rojo");
                Cubo4C2G.setText("R");
                Cubo4C2G.setBackground(Cubo4.C2);
            } else if (Cubo4.C2I.equals("B")) {
                Cubo4C2.setSelectedItem("Blanco");
                Cubo4C2G.setText("B");
                Cubo4C2G.setBackground(Cubo4.C2);
            } else if (Cubo4.C2I.equals("V")) {
                Cubo4C2.setSelectedItem("Verde");
                Cubo4C2G.setText("V");
                Cubo4C2G.setBackground(Cubo4.C2);
            } else if (Cubo4.C2I.equals("A")) {
                Cubo4C2.setSelectedItem("Amarillo");
                Cubo4C2G.setText("A");
                Cubo4C2G.setBackground(Cubo4.C2);
            }

            if (Cubo4.C3I.equals("R")) {
                Cubo4C3.setSelectedItem("Rojo");
                Cubo4C3G.setText("R");
                Cubo4C3G.setBackground(Cubo4.C3);
            } else if (Cubo4.C3I.equals("B")) {
                Cubo4C3.setSelectedItem("Blanco");
                Cubo4C3G.setText("B");
                Cubo4C3G.setBackground(Cubo4.C3);
            } else if (Cubo4.C3I.equals("V")) {
                Cubo4C3.setSelectedItem("Verde");
                Cubo4C3G.setText("V");
                Cubo4C3G.setBackground(Cubo4.C3);
            } else if (Cubo4.C3I.equals("A")) {
                Cubo4C3.setSelectedItem("Amarillo");
                Cubo4C3G.setText("A");
                Cubo4C3G.setBackground(Cubo4.C3);
            }

            if (Cubo4.C4I.equals("R")) {
                Cubo4C4.setSelectedItem("Rojo");
                Cubo4C4G.setText("R");
                Cubo4C4G.setBackground(Cubo4.C4);
            } else if (Cubo4.C4I.equals("B")) {
                Cubo4C4.setSelectedItem("Blanco");
                Cubo4C4G.setText("B");
                Cubo4C4G.setBackground(Cubo4.C4);
            } else if (Cubo4.C4I.equals("V")) {
                Cubo4C4.setSelectedItem("Verde");
                Cubo4C4G.setText("V");
                Cubo4C4G.setBackground(Cubo4.C4);
            } else if (Cubo4.C4I.equals("A")) {
                Cubo4C4.setSelectedItem("Amarillo");
                Cubo4C4G.setText("A");
                Cubo4C4G.setBackground(Cubo4.C4);
            }

            if (Cubo4.C5I.equals("R")) {
                Cubo4C5.setSelectedItem("Rojo");
                Cubo4C5G.setText("R");
                Cubo4C5G.setBackground(Cubo4.C5);
            } else if (Cubo4.C5I.equals("B")) {
                Cubo4C5.setSelectedItem("Blanco");
                Cubo4C5G.setText("B");
                Cubo4C5G.setBackground(Cubo4.C5);
            } else if (Cubo4.C5I.equals("V")) {
                Cubo4C5.setSelectedItem("Verde");
                Cubo4C5G.setText("V");
                Cubo4C5G.setBackground(Cubo4.C5);
            } else if (Cubo4.C5I.equals("A")) {
                Cubo4C5.setSelectedItem("Amarillo");
                Cubo4C5G.setText("A");
                Cubo4C5G.setBackground(Cubo4.C5);
            }

            if (Cubo4.C6I.equals("R")) {
                Cubo4C6.setSelectedItem("Rojo");
                Cubo4C6G.setText("R");
                Cubo4C6G.setBackground(Cubo4.C6);
            } else if (Cubo4.C6I.equals("B")) {
                Cubo4C6.setSelectedItem("Blanco");
                Cubo4C6G.setText("B");
                Cubo4C6G.setBackground(Cubo4.C6);
            } else if (Cubo4.C6I.equals("V")) {
                Cubo4C6.setSelectedItem("Verde");
                Cubo4C6G.setText("V");
                Cubo4C6G.setBackground(Cubo4.C6);
            } else if (Cubo4.C6I.equals("A")) {
                Cubo4C6.setSelectedItem("Amarillo");
                Cubo4C6G.setText("A");
                Cubo4C6G.setBackground(Cubo4.C6);
            }

            System.out.println("Cubos.bin ha sido cargado con éxito");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Object[] options = {"Sí",
            "No", "Cancelar"};
        int option = JOptionPane.showOptionDialog(null,
                "Deseas guardar los cambios antes de salir?",
                "Guardar cambios",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (JOptionPane.YES_OPTION == option) {
            BinariosOut();
            System.exit(0);
        } else if (JOptionPane.NO_OPTION == option) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_formWindowClosing


    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        if (jTabbedPane1.getSelectedIndex() == 1) {
            if (Cubo1.C1 == null || Cubo2.C1 == null || Cubo3.C1 == null || Cubo4.C1 == null || sigBtnPressed == false) {
                jTabbedPane1.setSelectedIndex(0);
                JOptionPane.showMessageDialog(null, "Debes generar los 4 cubos y presionar\n"
                        + "'JUGAR' para continuar ");

            }
        }

        if (jTabbedPane1.getSelectedIndex() == 2) {
            if (Cubo1.C1 == null || Cubo2.C1 == null || Cubo3.C1 == null || Cubo4.C1 == null || sigBtnPressed == false) {
                jTabbedPane1.setSelectedIndex(1);

            } else if (resuelto == false) {
                jTabbedPane1.setSelectedIndex(1);
                JOptionPane.showMessageDialog(null, "Podrás ver la explicación cuando resuelvas\n"
                        + "el juego o presiones 'RESOLVER'\n"
                        + "(SOLO si existe una solución)");
            }
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jugarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarBtnActionPerformed
        // TODO add your handling code here:

        if (Cubo1.C1 == null || Cubo2.C1 == null || Cubo3.C1 == null || Cubo4.C1 == null) {
            JOptionPane.showMessageDialog(null, "Aún no ha generado los 4 cubos");
        } else if ((!Cubo1Bin.C1.equals(Cubo1.C1) || !Cubo1Bin.C2.equals(Cubo1.C2)
                || !Cubo1Bin.C3.equals(Cubo1.C3) || !Cubo1Bin.C4.equals(Cubo1.C4)
                || !Cubo1Bin.C5.equals(Cubo1.C5) || !Cubo1Bin.C6.equals(Cubo1.C6))
                || (!Cubo2Bin.C1.equals(Cubo2.C1) || !Cubo2Bin.C2.equals(Cubo2.C2)
                || !Cubo2Bin.C3.equals(Cubo2.C3) || !Cubo2Bin.C4.equals(Cubo2.C4)
                || !Cubo2Bin.C5.equals(Cubo2.C5) || !Cubo2Bin.C6.equals(Cubo2.C6))
                || (!Cubo3Bin.C1.equals(Cubo3.C1) || !Cubo3Bin.C2.equals(Cubo3.C2)
                || !Cubo3Bin.C3.equals(Cubo3.C3) || !Cubo3Bin.C4.equals(Cubo3.C4)
                || !Cubo3Bin.C5.equals(Cubo3.C5) || !Cubo3Bin.C6.equals(Cubo3.C6))
                || (!Cubo4Bin.C1.equals(Cubo4.C1) || !Cubo4Bin.C2.equals(Cubo4.C2)
                || !Cubo4Bin.C3.equals(Cubo4.C3) || !Cubo4Bin.C4.equals(Cubo4.C4)
                || !Cubo4Bin.C5.equals(Cubo4.C5) || !Cubo4Bin.C6.equals(Cubo4.C6))) {

            sigBtnPressed = true;
            resuelto = false;
            jTabbedPane1.setSelectedIndex(1);

            // Cubo 1
            Cubo1C1J.setText(Cubo1.C1I);
            Cubo1C1J.setBackground(Cubo1.C1);

            Cubo1C2J.setText(Cubo1.C2I);
            Cubo1C2J.setBackground(Cubo1.C2);

            Cubo1C3J.setText(Cubo1.C3I);
            Cubo1C3J.setBackground(Cubo1.C3);

            Cubo1C4J.setText(Cubo1.C4I);
            Cubo1C4J.setBackground(Cubo1.C4);

            Cubo1C5J.setText(Cubo1.C5I);
            Cubo1C5J.setBackground(Cubo1.C5);

            Cubo1C6J.setText(Cubo1.C6I);
            Cubo1C6J.setBackground(Cubo1.C6);
            //

            // Cubo 2
            Cubo2C1J.setText(Cubo2.C1I);
            Cubo2C1J.setBackground(Cubo2.C1);

            Cubo2C2J.setText(Cubo2.C2I);
            Cubo2C2J.setBackground(Cubo2.C2);

            Cubo2C3J.setText(Cubo2.C3I);
            Cubo2C3J.setBackground(Cubo2.C3);

            Cubo2C4J.setText(Cubo2.C4I);
            Cubo2C4J.setBackground(Cubo2.C4);

            Cubo2C5J.setText(Cubo2.C5I);
            Cubo2C5J.setBackground(Cubo2.C5);

            Cubo2C6J.setText(Cubo2.C6I);
            Cubo2C6J.setBackground(Cubo2.C6);
            //

            // Cubo 3
            Cubo3C1J.setText(Cubo3.C1I);
            Cubo3C1J.setBackground(Cubo3.C1);

            Cubo3C2J.setText(Cubo3.C2I);
            Cubo3C2J.setBackground(Cubo3.C2);

            Cubo3C3J.setText(Cubo3.C3I);
            Cubo3C3J.setBackground(Cubo3.C3);

            Cubo3C4J.setText(Cubo3.C4I);
            Cubo3C4J.setBackground(Cubo3.C4);

            Cubo3C5J.setText(Cubo3.C5I);
            Cubo3C5J.setBackground(Cubo3.C5);

            Cubo3C6J.setText(Cubo3.C6I);
            Cubo3C6J.setBackground(Cubo3.C6);
            //

            // Cubo 4
            Cubo4C1J.setText(Cubo4.C1I);
            Cubo4C1J.setBackground(Cubo4.C1);

            Cubo4C2J.setText(Cubo4.C2I);
            Cubo4C2J.setBackground(Cubo4.C2);

            Cubo4C3J.setText(Cubo4.C3I);
            Cubo4C3J.setBackground(Cubo4.C3);

            Cubo4C4J.setText(Cubo4.C4I);
            Cubo4C4J.setBackground(Cubo4.C4);

            Cubo4C5J.setText(Cubo4.C5I);
            Cubo4C5J.setBackground(Cubo4.C5);

            Cubo4C6J.setText(Cubo4.C6I);
            Cubo4C6J.setBackground(Cubo4.C6);
            //

            actualTorre();

        } else {
            sigBtnPressed = true;
            resuelto = false;
            jTabbedPane1.setSelectedIndex(1);

            // Cubo 1
            Cubo1C1J.setText(Cubo1Bin.Cubo1C1JN);
            Cubo1C1J.setBackground(Cubo1Bin.Cubo1C1JB);
            Cubo1C2J.setText(Cubo1Bin.Cubo1C2JN);
            Cubo1C2J.setBackground(Cubo1Bin.Cubo1C2JB);
            Cubo1C3J.setText(Cubo1Bin.Cubo1C3JN);
            Cubo1C3J.setBackground(Cubo1Bin.Cubo1C3JB);
            Cubo1C4J.setText(Cubo1Bin.Cubo1C4JN);
            Cubo1C4J.setBackground(Cubo1Bin.Cubo1C4JB);
            Cubo1C5J.setText(Cubo1Bin.Cubo1C5JN);
            Cubo1C5J.setBackground(Cubo1Bin.Cubo1C5JB);
            Cubo1C6J.setText(Cubo1Bin.Cubo1C6JN);
            Cubo1C6J.setBackground(Cubo1Bin.Cubo1C6JB);

            // Cubo 2
            Cubo2C1J.setText(Cubo2Bin.Cubo2C1JN);
            Cubo2C1J.setBackground(Cubo2Bin.Cubo2C1JB);
            Cubo2C2J.setText(Cubo2Bin.Cubo2C2JN);
            Cubo2C2J.setBackground(Cubo2Bin.Cubo2C2JB);
            Cubo2C3J.setText(Cubo2Bin.Cubo2C3JN);
            Cubo2C3J.setBackground(Cubo2Bin.Cubo2C3JB);
            Cubo2C4J.setText(Cubo2Bin.Cubo2C4JN);
            Cubo2C4J.setBackground(Cubo2Bin.Cubo2C4JB);
            Cubo2C5J.setText(Cubo2Bin.Cubo2C5JN);
            Cubo2C5J.setBackground(Cubo2Bin.Cubo2C5JB);
            Cubo2C6J.setText(Cubo2Bin.Cubo2C6JN);
            Cubo2C6J.setBackground(Cubo2Bin.Cubo2C6JB);

            // Cubo 3
            Cubo3C1J.setText(Cubo3Bin.Cubo3C1JN);
            Cubo3C1J.setBackground(Cubo3Bin.Cubo3C1JB);
            Cubo3C2J.setText(Cubo3Bin.Cubo3C2JN);
            Cubo3C2J.setBackground(Cubo3Bin.Cubo3C2JB);
            Cubo3C3J.setText(Cubo3Bin.Cubo3C3JN);
            Cubo3C3J.setBackground(Cubo3Bin.Cubo3C3JB);
            Cubo3C4J.setText(Cubo3Bin.Cubo3C4JN);
            Cubo3C4J.setBackground(Cubo3Bin.Cubo3C4JB);
            Cubo3C5J.setText(Cubo3Bin.Cubo3C5JN);
            Cubo3C5J.setBackground(Cubo3Bin.Cubo3C5JB);
            Cubo3C6J.setText(Cubo3Bin.Cubo3C6JN);
            Cubo3C6J.setBackground(Cubo3Bin.Cubo3C6JB);

            // Cubo 4
            Cubo4C1J.setText(Cubo4Bin.Cubo4C1JN);
            Cubo4C1J.setBackground(Cubo4Bin.Cubo4C1JB);
            Cubo4C2J.setText(Cubo4Bin.Cubo4C2JN);
            Cubo4C2J.setBackground(Cubo4Bin.Cubo4C2JB);
            Cubo4C3J.setText(Cubo4Bin.Cubo4C3JN);
            Cubo4C3J.setBackground(Cubo4Bin.Cubo4C3JB);
            Cubo4C4J.setText(Cubo4Bin.Cubo4C4JN);
            Cubo4C4J.setBackground(Cubo4Bin.Cubo4C4JB);
            Cubo4C5J.setText(Cubo4Bin.Cubo4C5JN);
            Cubo4C5J.setBackground(Cubo4Bin.Cubo4C5JB);
            Cubo4C6J.setText(Cubo4Bin.Cubo4C6JN);
            Cubo4C6J.setBackground(Cubo4Bin.Cubo4C6JB);

            actualTorre();
        }


    }//GEN-LAST:event_jugarBtnActionPerformed

    private void izquierdaCubo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izquierdaCubo1ActionPerformed
        // TODO add your handling code here:
        String Cubo1C5N = Cubo1C5J.getText();
        Color Cubo1C5B = Cubo1C5J.getBackground();
        Cubo1C5J.setText(Cubo1C2J.getText());
        Cubo1C5J.setBackground(Cubo1C2J.getBackground());

        String Cubo1C1N = Cubo1C1J.getText();
        Color Cubo1C1B = Cubo1C1J.getBackground();
        Cubo1C1J.setText(Cubo1C5N);
        Cubo1C1J.setBackground(Cubo1C5B);

        String Cubo1C6N = Cubo1C6J.getText();
        Color Cubo1C6B = Cubo1C6J.getBackground();
        Cubo1C6J.setText(Cubo1C1N);
        Cubo1C6J.setBackground(Cubo1C1B);

        Cubo1C2J.setText(Cubo1C6N);
        Cubo1C2J.setBackground(Cubo1C6B);

        actualTorre();

    }//GEN-LAST:event_izquierdaCubo1ActionPerformed

    private void arribaCubo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaCubo1ActionPerformed
        // TODO add your handling code here:
        String Cubo1C3N = Cubo1C3J.getText();
        Color Cubo1C3B = Cubo1C3J.getBackground();
        Cubo1C3J.setText(Cubo1C1J.getText());
        Cubo1C3J.setBackground(Cubo1C1J.getBackground());

        String Cubo1C2N = Cubo1C2J.getText();
        Color Cubo1C2B = Cubo1C2J.getBackground();
        Cubo1C2J.setText(Cubo1C3N);
        Cubo1C2J.setBackground(Cubo1C3B);

        String Cubo1C4N = Cubo1C4J.getText();
        Color Cubo1C4B = Cubo1C4J.getBackground();
        Cubo1C4J.setText(Cubo1C2N);
        Cubo1C4J.setBackground(Cubo1C2B);

        Cubo1C1J.setText(Cubo1C4N);
        Cubo1C1J.setBackground(Cubo1C4B);

        actualTorre();

    }//GEN-LAST:event_arribaCubo1ActionPerformed

    private void resolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolverBtnActionPerformed
        // TODO add your handling code here:
        boolean condicion1 = ((!Cubo1C3J.getBackground().equals(Cubo2C3J.getBackground())
                && !Cubo1C3J.getBackground().equals(Cubo3C3J.getBackground())
                && !Cubo1C3J.getBackground().equals(Cubo4C3J.getBackground()))
                && (!Cubo2C3J.getBackground().equals(Cubo3C3J.getBackground())
                && !Cubo2C3J.getBackground().equals(Cubo4C3J.getBackground()))
                && !Cubo3C3J.getBackground().equals(Cubo4C3J.getBackground()));

        boolean condicion2 = ((!Cubo1C5J.getBackground().equals(Cubo2C5J.getBackground())
                && !Cubo1C5J.getBackground().equals(Cubo3C5J.getBackground())
                && !Cubo1C5J.getBackground().equals(Cubo4C5J.getBackground()))
                && (!Cubo2C5J.getBackground().equals(Cubo3C5J.getBackground())
                && !Cubo2C5J.getBackground().equals(Cubo4C5J.getBackground()))
                && !Cubo3C5J.getBackground().equals(Cubo4C5J.getBackground()));

        boolean condicion3 = ((!Cubo1C4J.getBackground().equals(Cubo2C4J.getBackground())
                && !Cubo1C4J.getBackground().equals(Cubo3C4J.getBackground())
                && !Cubo1C4J.getBackground().equals(Cubo4C4J.getBackground()))
                && (!Cubo2C4J.getBackground().equals(Cubo3C4J.getBackground())
                && !Cubo2C4J.getBackground().equals(Cubo4C4J.getBackground()))
                && !Cubo3C4J.getBackground().equals(Cubo4C4J.getBackground()));

        boolean condicion4 = ((!Cubo1C6J.getBackground().equals(Cubo2C6J.getBackground())
                && !Cubo1C6J.getBackground().equals(Cubo3C6J.getBackground())
                && !Cubo1C6J.getBackground().equals(Cubo4C6J.getBackground()))
                && (!Cubo2C6J.getBackground().equals(Cubo3C6J.getBackground())
                && !Cubo2C6J.getBackground().equals(Cubo4C6J.getBackground()))
                && !Cubo3C6J.getBackground().equals(Cubo4C6J.getBackground()));

        if (condicion1 && condicion2 && condicion3 && condicion4) {
            actualTorre();
            resuelto = true;
            JOptionPane.showMessageDialog(null, "FELICIDADES, EL JUEGO YA ESTÁ RESUELTO!");
            resueltoLbl.setVisible(true);

        } else {
            Object[] options = {"Sí, Por Favor",
                "No, seguiré intentando"};
            int yes = JOptionPane.showOptionDialog(null,
                    "Deseas que el programa resuelva el juego por tí?\n"
                    + " Podrás ver la explicación en la siguiente pestaña\n"
                    + "(SOLO si existe)",
                    "Confirmación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (JOptionPane.YES_OPTION == yes) {
                resuelto = true;
                resolverJuego();
                actualTorre();
            } else {
                resuelto = false;
            }
        }
    }//GEN-LAST:event_resolverBtnActionPerformed

    public void resolverJuego() {

        boolean G1Encontrado = false;
        boolean G2Encontrado = false;
        // Grafo Gl 
        // Cubo 1
        String Cubo1arista1I;
        String Cubo1arista1F;

        String Cubo1arista2I;
        String Cubo1arista2F;

        String Cubo1arista3I;
        String Cubo1arista3F;

        Cubo1arista1I = Cubo1.C1I;
        Cubo1arista1F = Cubo1.C2I;

        Cubo1arista2I = Cubo1.C3I;
        Cubo1arista2F = Cubo1.C4I;

        Cubo1arista3I = Cubo1.C5I;
        Cubo1arista3F = Cubo1.C6I;

        System.out.println("Cubo 1");
        System.out.println(Cubo1arista1I + "-" + Cubo1arista1F);
        System.out.println(Cubo1arista2I + "-" + Cubo1arista2F);
        System.out.println(Cubo1arista3I + "-" + Cubo1arista3F);

        // Cubo 2
        String Cubo2arista1I;
        String Cubo2arista1F;
        String Cubo2arista2I;
        String Cubo2arista2F;
        String Cubo2arista3I;
        String Cubo2arista3F;

        Cubo2arista1I = Cubo2.C1I;
        Cubo2arista1F = Cubo2.C2I;

        Cubo2arista2I = Cubo2.C3I;
        Cubo2arista2F = Cubo2.C4I;

        Cubo2arista3I = Cubo2.C5I;
        Cubo2arista3F = Cubo2.C6I;

        System.out.println("Cubo 2");
        System.out.println(Cubo2arista1I + "-" + Cubo2arista1F);
        System.out.println(Cubo2arista2I + "-" + Cubo2arista2F);
        System.out.println(Cubo2arista3I + "-" + Cubo2arista3F);

        // Cubo 3
        String Cubo3arista1I;
        String Cubo3arista1F;
        String Cubo3arista2I;
        String Cubo3arista2F;
        String Cubo3arista3I;
        String Cubo3arista3F;

        Cubo3arista1I = Cubo3.C1I;
        Cubo3arista1F = Cubo3.C2I;

        Cubo3arista2I = Cubo3.C3I;
        Cubo3arista2F = Cubo3.C4I;

        Cubo3arista3I = Cubo3.C5I;
        Cubo3arista3F = Cubo3.C6I;

        System.out.println("Cubo 3");
        System.out.println(Cubo3arista1I + "-" + Cubo3arista1F);
        System.out.println(Cubo3arista2I + "-" + Cubo3arista2F);
        System.out.println(Cubo3arista3I + "-" + Cubo3arista3F);

        // Cubo 4
        String Cubo4arista1I;
        String Cubo4arista1F;
        String Cubo4arista2I;
        String Cubo4arista2F;
        String Cubo4arista3I;
        String Cubo4arista3F;

        Cubo4arista1I = Cubo4.C1I;
        Cubo4arista1F = Cubo4.C2I;

        Cubo4arista2I = Cubo4.C3I;
        Cubo4arista2F = Cubo4.C4I;

        Cubo4arista3I = Cubo4.C5I;
        Cubo4arista3F = Cubo4.C6I;

        System.out.println("Cubo 4");
        System.out.println(Cubo4arista1I + "-" + Cubo4arista1F);
        System.out.println(Cubo4arista2I + "-" + Cubo4arista2F);
        System.out.println(Cubo4arista3I + "-" + Cubo4arista3F);

        // Grafo G1: Solución Horizontal
        String Cubo1aristaG1I = null;
        String Cubo1aristaG1F = null;

        String Cubo2aristaG1I = null;
        String Cubo2aristaG1F = null;

        String Cubo3aristaG1I = null;
        String Cubo3aristaG1F = null;

        String Cubo4aristaG1I = null;
        String Cubo4aristaG1F = null;

        int gradoVerticeR = 0;
        int gradoVerticeB = 0;
        int gradoVerticeV = 0;
        int gradoVerticeA = 0;

        String[] verticesCubo1 = {Cubo1arista1I, Cubo1arista1F, Cubo1arista2I, Cubo1arista2F, Cubo1arista3I, Cubo1arista3F};
        String[] verticesCubo2 = {Cubo2arista1I, Cubo2arista1F, Cubo2arista2I, Cubo2arista2F, Cubo2arista3I, Cubo2arista3F};
        String[] verticesCubo3 = {Cubo3arista1I, Cubo3arista1F, Cubo3arista2I, Cubo3arista2F, Cubo3arista3I, Cubo3arista3F};
        String[] verticesCubo4 = {Cubo4arista1I, Cubo4arista1F, Cubo4arista2I, Cubo4arista2F, Cubo4arista3I, Cubo4arista3F};

        for (int i = 0; i < 5; i += 2) {
            for (int c = 0; c < 5; c += 2) {
                for (int w = 0; w < 5; w += 2) {
                    for (int r = 0; r < 5; r += 2) {
                        gradoVerticeR = 0;
                        gradoVerticeB = 0;
                        gradoVerticeV = 0;
                        gradoVerticeA = 0;
                        // Cubo1
                        if (verticesCubo1[i].equals("R")) {
                            gradoVerticeR++;
                        } else if (verticesCubo1[i].equals("B")) {
                            gradoVerticeB++;
                        } else if (verticesCubo1[i].equals("V")) {
                            gradoVerticeV++;
                        } else if (verticesCubo1[i].equals("A")) {
                            gradoVerticeA++;
                        }

                        if (verticesCubo1[i + 1].equals("R")) {
                            gradoVerticeR++;
                        } else if (verticesCubo1[i + 1].equals("B")) {
                            gradoVerticeB++;
                        } else if (verticesCubo1[i + 1].equals("V")) {
                            gradoVerticeV++;
                        } else if (verticesCubo1[i + 1].equals("A")) {
                            gradoVerticeA++;
                        }

                        // Cubo2
                        if (verticesCubo2[c].equals("R")) {
                            gradoVerticeR++;
                        } else if (verticesCubo2[c].equals("B")) {
                            gradoVerticeB++;
                        } else if (verticesCubo2[c].equals("V")) {
                            gradoVerticeV++;
                        } else if (verticesCubo2[c].equals("A")) {
                            gradoVerticeA++;
                        }

                        if (verticesCubo2[c + 1].equals("R")) {
                            gradoVerticeR++;
                        } else if (verticesCubo2[c + 1].equals("B")) {
                            gradoVerticeB++;
                        } else if (verticesCubo2[c + 1].equals("V")) {
                            gradoVerticeV++;
                        } else if (verticesCubo2[c + 1].equals("A")) {
                            gradoVerticeA++;
                        }

                        // Cubo3
                        if (verticesCubo3[w].equals("R")) {
                            gradoVerticeR++;
                        } else if (verticesCubo3[w].equals("B")) {
                            gradoVerticeB++;
                        } else if (verticesCubo3[w].equals("V")) {
                            gradoVerticeV++;
                        } else if (verticesCubo3[w].equals("A")) {
                            gradoVerticeA++;
                        }

                        if (verticesCubo3[w + 1].equals("R")) {
                            gradoVerticeR++;
                        } else if (verticesCubo3[w + 1].equals("B")) {
                            gradoVerticeB++;
                        } else if (verticesCubo3[w + 1].equals("V")) {
                            gradoVerticeV++;
                        } else if (verticesCubo3[w + 1].equals("A")) {
                            gradoVerticeA++;
                        }

                        // Cubo4
                        if (verticesCubo4[r].equals("R")) {
                            gradoVerticeR++;
                        } else if (verticesCubo4[r].equals("B")) {
                            gradoVerticeB++;
                        } else if (verticesCubo4[r].equals("V")) {
                            gradoVerticeV++;
                        } else if (verticesCubo4[r].equals("A")) {
                            gradoVerticeA++;
                        }

                        if (verticesCubo4[r + 1].equals("R")) {
                            gradoVerticeR++;
                        } else if (verticesCubo4[r + 1].equals("B")) {
                            gradoVerticeB++;
                        } else if (verticesCubo4[r + 1].equals("V")) {
                            gradoVerticeV++;
                        } else if (verticesCubo4[r + 1].equals("A")) {
                            gradoVerticeA++;
                        }

                        if (gradoVerticeR == 2 && gradoVerticeB == 2 && gradoVerticeV == 2 && gradoVerticeA == 2) {

                            System.out.println("Grafo G1: Horizontal - Encontrado");
                            G1Encontrado = true;
                            Cubo1aristaG1I = verticesCubo1[i];
                            Cubo1aristaG1F = verticesCubo1[i + 1];

                            Cubo2aristaG1I = verticesCubo2[c];
                            Cubo2aristaG1F = verticesCubo2[c + 1];

                            Cubo3aristaG1I = verticesCubo3[w];
                            Cubo3aristaG1F = verticesCubo3[w + 1];

                            Cubo4aristaG1I = verticesCubo4[r];
                            Cubo4aristaG1F = verticesCubo4[r + 1];

                            System.out.println("Cubo 1 arista: " + Cubo1aristaG1I + "-" + Cubo1aristaG1F);
                            System.out.println("Cubo 2 arista: " + Cubo2aristaG1I + "-" + Cubo2aristaG1F);
                            System.out.println("Cubo 3 arista: " + Cubo3aristaG1I + "-" + Cubo3aristaG1F);
                            System.out.println("Cubo 4 arista: " + Cubo4aristaG1I + "-" + Cubo4aristaG1F);
                            System.out.println("grado R: " + gradoVerticeR);
                            System.out.println("grado B: " + gradoVerticeB);
                            System.out.println("grado V: " + gradoVerticeV);
                            System.out.println("grado A: " + gradoVerticeA);
                            break;
                        }

                    }
                    if (G1Encontrado == true) {
                        break;
                    }
                }
                if (G1Encontrado == true) {
                    break;
                }
            }
            if (G1Encontrado == true) {
                break;
            }
        }

        if (G1Encontrado == true) {

            // Grafo G2: Solución Vertical
            String Cubo1aristaG2I = null;
            String Cubo1aristaG2F = null;

            String Cubo2aristaG2I = null;
            String Cubo2aristaG2F = null;

            String Cubo3aristaG2I = null;
            String Cubo3aristaG2F = null;

            String Cubo4aristaG2I = null;
            String Cubo4aristaG2F = null;

            gradoVerticeR = 0;
            gradoVerticeB = 0;
            gradoVerticeV = 0;
            gradoVerticeA = 0;

            for (int i = 0; i < 5; i += 2) {
                for (int c = 0; c < 5; c += 2) {
                    for (int w = 0; w < 5; w += 2) {
                        for (int r = 0; r < 5; r += 2) {
                            gradoVerticeR = 0;
                            gradoVerticeB = 0;
                            gradoVerticeV = 0;
                            gradoVerticeA = 0;
                            // Cubo1
                            if (verticesCubo1[i].equals("R")) {
                                gradoVerticeR++;
                            } else if (verticesCubo1[i].equals("B")) {
                                gradoVerticeB++;
                            } else if (verticesCubo1[i].equals("V")) {
                                gradoVerticeV++;
                            } else if (verticesCubo1[i].equals("A")) {
                                gradoVerticeA++;
                            }

                            if (verticesCubo1[i + 1].equals("R")) {
                                gradoVerticeR++;
                            } else if (verticesCubo1[i + 1].equals("B")) {
                                gradoVerticeB++;
                            } else if (verticesCubo1[i + 1].equals("V")) {
                                gradoVerticeV++;
                            } else if (verticesCubo1[i + 1].equals("A")) {
                                gradoVerticeA++;
                            }

                            // Cubo2
                            if (verticesCubo2[c].equals("R")) {
                                gradoVerticeR++;
                            } else if (verticesCubo2[c].equals("B")) {
                                gradoVerticeB++;
                            } else if (verticesCubo2[c].equals("V")) {
                                gradoVerticeV++;
                            } else if (verticesCubo2[c].equals("A")) {
                                gradoVerticeA++;
                            }

                            if (verticesCubo2[c + 1].equals("R")) {
                                gradoVerticeR++;
                            } else if (verticesCubo2[c + 1].equals("B")) {
                                gradoVerticeB++;
                            } else if (verticesCubo2[c + 1].equals("V")) {
                                gradoVerticeV++;
                            } else if (verticesCubo2[c + 1].equals("A")) {
                                gradoVerticeA++;
                            }

                            // Cubo3
                            if (verticesCubo3[w].equals("R")) {
                                gradoVerticeR++;
                            } else if (verticesCubo3[w].equals("B")) {
                                gradoVerticeB++;
                            } else if (verticesCubo3[w].equals("V")) {
                                gradoVerticeV++;
                            } else if (verticesCubo3[w].equals("A")) {
                                gradoVerticeA++;
                            }

                            if (verticesCubo3[w + 1].equals("R")) {
                                gradoVerticeR++;
                            } else if (verticesCubo3[w + 1].equals("B")) {
                                gradoVerticeB++;
                            } else if (verticesCubo3[w + 1].equals("V")) {
                                gradoVerticeV++;
                            } else if (verticesCubo3[w + 1].equals("A")) {
                                gradoVerticeA++;
                            }

                            // Cubo4
                            if (verticesCubo4[r].equals("R")) {
                                gradoVerticeR++;
                            } else if (verticesCubo4[r].equals("B")) {
                                gradoVerticeB++;
                            } else if (verticesCubo4[r].equals("V")) {
                                gradoVerticeV++;
                            } else if (verticesCubo4[r].equals("A")) {
                                gradoVerticeA++;
                            }

                            if (verticesCubo4[r + 1].equals("R")) {
                                gradoVerticeR++;
                            } else if (verticesCubo4[r + 1].equals("B")) {
                                gradoVerticeB++;
                            } else if (verticesCubo4[r + 1].equals("V")) {
                                gradoVerticeV++;
                            } else if (verticesCubo4[r + 1].equals("A")) {
                                gradoVerticeA++;
                            }

                            if (gradoVerticeR == 2 && gradoVerticeB == 2 && gradoVerticeV == 2 && gradoVerticeA == 2) {

                                Cubo1aristaG2I = verticesCubo1[i];
                                Cubo1aristaG2F = verticesCubo1[i + 1];

                                Cubo2aristaG2I = verticesCubo2[c];
                                Cubo2aristaG2F = verticesCubo2[c + 1];

                                Cubo3aristaG2I = verticesCubo3[w];
                                Cubo3aristaG2F = verticesCubo3[w + 1];

                                Cubo4aristaG2I = verticesCubo4[r];
                                Cubo4aristaG2F = verticesCubo4[r + 1];

                                if (!(Cubo1aristaG2I + Cubo1aristaG2F).equals(Cubo1aristaG1I + Cubo1aristaG1F)
                                        && !(Cubo2aristaG2I + Cubo2aristaG2F).equals(Cubo2aristaG1I + Cubo2aristaG1F)
                                        && !(Cubo3aristaG2I + Cubo3aristaG2F).equals(Cubo3aristaG1I + Cubo3aristaG1F)
                                        && !(Cubo4aristaG2I + Cubo4aristaG2F).equals(Cubo4aristaG1I + Cubo4aristaG1F)) {

                                    System.out.println("Grafo G2: Vertical - Encontrado");
                                    G2Encontrado = true;
                                    System.out.println("Cubo 1 arista: " + Cubo1aristaG2I + "-" + Cubo1aristaG2F);
                                    System.out.println("Cubo 2 arista: " + Cubo2aristaG2I + "-" + Cubo2aristaG2F);
                                    System.out.println("Cubo 3 arista: " + Cubo3aristaG2I + "-" + Cubo3aristaG2F);
                                    System.out.println("Cubo 4 arista: " + Cubo4aristaG2I + "-" + Cubo4aristaG2F);
                                    System.out.println("grado R: " + gradoVerticeR);
                                    System.out.println("grado B: " + gradoVerticeB);
                                    System.out.println("grado V: " + gradoVerticeV);
                                    System.out.println("grado A: " + gradoVerticeA);
                                    break;
                                }
                            }

                        }
                        if (G2Encontrado == true) {
                            break;
                        }

                    }
                    if (G2Encontrado == true) {
                        break;
                    }

                }
                if (G2Encontrado == true) {
                    break;
                }

            }

            if (G1Encontrado == true && G2Encontrado == true) {
                // Ordenar posiciones de las caras
                boolean condicion1 = (!Cubo1aristaG1I.equals(Cubo2aristaG1I)
                        && !Cubo1aristaG1I.equals(Cubo3aristaG1I)
                        && !Cubo1aristaG1I.equals(Cubo4aristaG1I))
                        //
                        && (!Cubo2aristaG1I.equals(Cubo3aristaG1I)
                        && !Cubo2aristaG1I.equals(Cubo4aristaG1I))
                        //
                        && !Cubo3aristaG1I.equals(Cubo4aristaG1I);

                boolean condicion2 = (!Cubo1aristaG1F.equals(Cubo2aristaG1F)
                        && !Cubo1aristaG1F.equals(Cubo3aristaG1F)
                        && !Cubo1aristaG1F.equals(Cubo4aristaG1F))
                        //
                        && (!Cubo2aristaG1F.equals(Cubo3aristaG1F)
                        && !Cubo2aristaG1F.equals(Cubo4aristaG1F))
                        //
                        && !Cubo3aristaG1F.equals(Cubo4aristaG1F);

                boolean condicion3 = (!Cubo1aristaG2I.equals(Cubo2aristaG2I)
                        && !Cubo1aristaG2I.equals(Cubo3aristaG2I)
                        && !Cubo1aristaG2I.equals(Cubo4aristaG2I))
                        //
                        && (!Cubo2aristaG2I.equals(Cubo3aristaG2I)
                        && !Cubo2aristaG2I.equals(Cubo4aristaG2I))
                        //
                        && !Cubo3aristaG2I.equals(Cubo4aristaG2I);

                boolean condicion4 = (!Cubo1aristaG2F.equals(Cubo2aristaG2F)
                        && !Cubo1aristaG2F.equals(Cubo3aristaG2F)
                        && !Cubo1aristaG2F.equals(Cubo4aristaG2F))
                        //
                        && (!Cubo2aristaG2F.equals(Cubo3aristaG2F)
                        && !Cubo2aristaG2F.equals(Cubo4aristaG2F))
                        //
                        && !Cubo3aristaG2F.equals(Cubo4aristaG2F);

                if (condicion1 && condicion2 && condicion3 && condicion4) {
                    System.out.println("Posición correcta");
                    
                    // Asignar los colores a los cubos del juego
                    // CUBO 1
                    // Cara Frontal y Trasera (NO ES RELEVANTE)
                    if (!(Cubo1aristaG1I + Cubo1aristaG1F).equals(Cubo1arista1I + Cubo1arista1F)
                            && !(Cubo1aristaG2I + Cubo1aristaG2F).equals(Cubo1arista1I + Cubo1arista1F)) {
                        Cubo1C1J.setText(Cubo1arista1I);
                        Cubo1C2J.setText(Cubo1arista1F);
                    } else if (!(Cubo1aristaG1I + Cubo1aristaG1F).equals(Cubo1arista2I + Cubo1arista2F)
                            && !(Cubo1aristaG2I + Cubo1aristaG2F).equals(Cubo1arista2I + Cubo1arista2F)) {
                        Cubo1C1J.setText(Cubo1arista2I);
                        Cubo1C2J.setText(Cubo1arista2F);
                    } else if (!(Cubo1aristaG1I + Cubo1aristaG1F).equals(Cubo1arista3I + Cubo1arista3F)
                            && !(Cubo1aristaG2I + Cubo1aristaG2F).equals(Cubo1arista3I + Cubo1arista3F)) {
                        Cubo1C1J.setText(Cubo1arista3I);
                        Cubo1C2J.setText(Cubo1arista3F);
                    }


                    // Cara Frontal
                    if (Cubo1C1J.getText().equals("R")) {
                        Cubo1C1J.setBackground(new Color(155,22,57));
                    } else if (Cubo1C1J.getText().equals("B")) {
                        Cubo1C1J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo1C1J.getText().equals("V")) {
                        Cubo1C1J.setBackground(new Color(16,175,107));
                    } else if (Cubo1C1J.getText().equals("A")) {
                        Cubo1C1J.setBackground(new Color(255,234,78));
                    }
                    // Cara Trasera
                    if (Cubo1C2J.getText().equals("R")) {
                        Cubo1C2J.setBackground(new Color(155,22,57));
                    } else if (Cubo1C2J.getText().equals("B")) {
                        Cubo1C2J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo1C2J.getText().equals("V")) {
                        Cubo1C2J.setBackground(new Color(16,175,107));
                    } else if (Cubo1C2J.getText().equals("A")) {
                        Cubo1C2J.setBackground(new Color(255,234,78));
                    }

                    // Cara izquierda
                    Cubo1C6J.setText(Cubo1aristaG1I);
                    Cubo1C6E.setText(Cubo1aristaG1I);

                    if (Cubo1aristaG1I.equals("R")) {
                        Cubo1C6J.setBackground(new Color(155,22,57));
                    } else if (Cubo1aristaG1I.equals("B")) {
                        Cubo1C6J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo1aristaG1I.equals("V")) {
                        Cubo1C6J.setBackground(new Color(16,175,107));
                    } else if (Cubo1aristaG1I.equals("A")) {
                        Cubo1C6J.setBackground(new Color(255,234,78));
                    }

                    // Cara derecha
                    Cubo1C5J.setText(Cubo1aristaG1F);
                    Cubo1C5E.setText(Cubo1aristaG1F);
                    if (Cubo1aristaG1F.equals("R")) {
                        Cubo1C5J.setBackground(new Color(155,22,57));
                    } else if (Cubo1aristaG1F.equals("B")) {
                        Cubo1C5J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo1aristaG1F.equals("V")) {
                        Cubo1C5J.setBackground(new Color(16,175,107));
                    } else if (Cubo1aristaG1F.equals("A")) {
                        Cubo1C5J.setBackground(new Color(255,234,78));
                    }

                    // Cara superior
                    Cubo1C3J.setText(Cubo1aristaG2I);
                    Cubo1C3E.setText(Cubo1aristaG2I);

                    if (Cubo1aristaG2I.equals("R")) {
                        Cubo1C3J.setBackground(new Color(155,22,57));
                    } else if (Cubo1aristaG2I.equals("B")) {
                        Cubo1C3J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo1aristaG2I.equals("V")) {
                        Cubo1C3J.setBackground(new Color(16,175,107));
                    } else if (Cubo1aristaG2I.equals("A")) {
                        Cubo1C3J.setBackground(new Color(255,234,78));
                    }

                    // Cara inferior
                    Cubo1C4J.setText(Cubo1aristaG2F);
                    Cubo1C4E.setText(Cubo1aristaG2F);

                    if (Cubo1aristaG2F.equals("R")) {
                        Cubo1C4J.setBackground(new Color(155,22,57));
                    } else if (Cubo1aristaG2F.equals("B")) {
                        Cubo1C4J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo1aristaG2F.equals("V")) {
                        Cubo1C4J.setBackground(new Color(16,175,107));
                    } else if (Cubo1aristaG2F.equals("A")) {
                        Cubo1C4J.setBackground(new Color(255,234,78));
                    }

                    // CUBO 2
                    // Cara Frontal y Trasera (NO ES RELEVANTE)
                    if (!(Cubo2aristaG1I + Cubo2aristaG1F).equals(Cubo2arista1I + Cubo2arista1F)
                            && !(Cubo2aristaG2I + Cubo2aristaG2F).equals(Cubo2arista1I + Cubo2arista1F)) {
                        Cubo2C1J.setText(Cubo2arista1I);
                        Cubo2C2J.setText(Cubo2arista1F);
                    } else if (!(Cubo2aristaG1I + Cubo2aristaG1F).equals(Cubo2arista2I + Cubo2arista2F)
                            && !(Cubo2aristaG2I + Cubo2aristaG2F).equals(Cubo2arista2I + Cubo2arista2F)) {
                        Cubo2C1J.setText(Cubo2arista2I);
                        Cubo2C2J.setText(Cubo2arista2F);
                    } else if (!(Cubo2aristaG1I + Cubo2aristaG1F).equals(Cubo2arista3I + Cubo2arista3F)
                            && !(Cubo2aristaG2I + Cubo2aristaG2F).equals(Cubo2arista3I + Cubo2arista3F)) {
                        Cubo2C1J.setText(Cubo2arista3I);
                        Cubo2C2J.setText(Cubo2arista3F);
                    }

                    // Cara Frontal
                    if (Cubo2C1J.getText().equals("R")) {
                        Cubo2C1J.setBackground(new Color(155,22,57));
                    } else if (Cubo2C1J.getText().equals("B")) {
                        Cubo2C1J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo2C1J.getText().equals("V")) {
                        Cubo2C1J.setBackground(new Color(16,175,107));
                    } else if (Cubo2C1J.getText().equals("A")) {
                        Cubo2C1J.setBackground(new Color(255,234,78));
                    }
                    // Cara Trasera
                    if (Cubo2C2J.getText().equals("R")) {
                        Cubo2C2J.setBackground(new Color(155,22,57));
                    } else if (Cubo2C2J.getText().equals("B")) {
                        Cubo2C2J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo2C2J.getText().equals("V")) {
                        Cubo2C2J.setBackground(new Color(16,175,107));
                    } else if (Cubo2C2J.getText().equals("A")) {
                        Cubo2C2J.setBackground(new Color(255,234,78));
                    }

                    // Cara izquierda
                    Cubo2C6J.setText(Cubo2aristaG1I);
                    Cubo2C6E.setText(Cubo2aristaG1I);

                    if (Cubo2aristaG1I.equals("R")) {
                        Cubo2C6J.setBackground(new Color(155,22,57));
                    } else if (Cubo2aristaG1I.equals("B")) {
                        Cubo2C6J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo2aristaG1I.equals("V")) {
                        Cubo2C6J.setBackground(new Color(16,175,107));
                    } else if (Cubo2aristaG1I.equals("A")) {
                        Cubo2C6J.setBackground(new Color(255,234,78));
                    }

                    // Cara derecha
                    Cubo2C5J.setText(Cubo2aristaG1F);
                    Cubo2C5E.setText(Cubo2aristaG1F);
                    if (Cubo2aristaG1F.equals("R")) {
                        Cubo2C5J.setBackground(new Color(155,22,57));
                    } else if (Cubo2aristaG1F.equals("B")) {
                        Cubo2C5J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo2aristaG1F.equals("V")) {
                        Cubo2C5J.setBackground(new Color(16,175,107));
                    } else if (Cubo2aristaG1F.equals("A")) {
                        Cubo2C5J.setBackground(new Color(255,234,78));
                    }

                    // Cara superior
                    Cubo2C3J.setText(Cubo2aristaG2I);
                    Cubo2C3E.setText(Cubo2aristaG2I);

                    if (Cubo2aristaG2I.equals("R")) {
                        Cubo2C3J.setBackground(new Color(155,22,57));
                    } else if (Cubo2aristaG2I.equals("B")) {
                        Cubo2C3J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo2aristaG2I.equals("V")) {
                        Cubo2C3J.setBackground(new Color(16,175,107));
                    } else if (Cubo2aristaG2I.equals("A")) {
                        Cubo2C3J.setBackground(new Color(255,234,78));
                    }

                    // Cara inferior
                    Cubo2C4J.setText(Cubo2aristaG2F);
                    Cubo2C4E.setText(Cubo2aristaG2F);

                    if (Cubo2aristaG2F.equals("R")) {
                        Cubo2C4J.setBackground(new Color(155,22,57));
                    } else if (Cubo2aristaG2F.equals("B")) {
                        Cubo2C4J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo2aristaG2F.equals("V")) {
                        Cubo2C4J.setBackground(new Color(16,175,107));
                    } else if (Cubo2aristaG2F.equals("A")) {
                        Cubo2C4J.setBackground(new Color(255,234,78));
                    }

                    // CUBO 3
                    // Cara Frontal y Trasera (NO ES RELEVANTE)
                    if (!(Cubo3aristaG1I + Cubo3aristaG1F).equals(Cubo3arista1I + Cubo3arista1F)
                            && !(Cubo3aristaG2I + Cubo3aristaG2F).equals(Cubo3arista1I + Cubo3arista1F)) {
                        Cubo3C1J.setText(Cubo3arista1I);
                        Cubo3C2J.setText(Cubo3arista1F);
                    } else if (!(Cubo3aristaG1I + Cubo3aristaG1F).equals(Cubo3arista2I + Cubo3arista2F)
                            && !(Cubo3aristaG2I + Cubo3aristaG2F).equals(Cubo3arista2I + Cubo3arista2F)) {
                        Cubo3C1J.setText(Cubo3arista2I);
                        Cubo3C2J.setText(Cubo3arista2F);
                    } else if (!(Cubo3aristaG1I + Cubo3aristaG1F).equals(Cubo3arista3I + Cubo3arista3F)
                            && !(Cubo3aristaG2I + Cubo3aristaG2F).equals(Cubo3arista3I + Cubo3arista3F)) {
                        Cubo3C1J.setText(Cubo3arista3I);
                        Cubo3C2J.setText(Cubo3arista3F);
                    }


                    // Cara Frontal
                    if (Cubo3C1J.getText().equals("R")) {
                        Cubo3C1J.setBackground(new Color(155,22,57));
                    } else if (Cubo3C1J.getText().equals("B")) {
                        Cubo3C1J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo3C1J.getText().equals("V")) {
                        Cubo3C1J.setBackground(new Color(16,175,107));
                    } else if (Cubo3C1J.getText().equals("A")) {
                        Cubo3C1J.setBackground(new Color(255,234,78));
                    }
                    // Cara Trasera
                    if (Cubo3C2J.getText().equals("R")) {
                        Cubo3C2J.setBackground(new Color(155,22,57));
                    } else if (Cubo3C2J.getText().equals("B")) {
                        Cubo3C2J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo3C2J.getText().equals("V")) {
                        Cubo3C2J.setBackground(new Color(16,175,107));
                    } else if (Cubo3C2J.getText().equals("A")) {
                        Cubo3C2J.setBackground(new Color(255,234,78));
                    }

                    // Cara izquierda
                    Cubo3C6J.setText(Cubo3aristaG1I);
                    Cubo3C6E.setText(Cubo3aristaG1I);

                    if (Cubo3aristaG1I.equals("R")) {
                        Cubo3C6J.setBackground(new Color(155,22,57));
                    } else if (Cubo3aristaG1I.equals("B")) {
                        Cubo3C6J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo3aristaG1I.equals("V")) {
                        Cubo3C6J.setBackground(new Color(16,175,107));
                    } else if (Cubo3aristaG1I.equals("A")) {
                        Cubo3C6J.setBackground(new Color(255,234,78));
                    }

                    // Cara derecha
                    Cubo3C5J.setText(Cubo3aristaG1F);
                    Cubo3C5E.setText(Cubo3aristaG1F);
                    if (Cubo3aristaG1F.equals("R")) {
                        Cubo3C5J.setBackground(new Color(155,22,57));
                    } else if (Cubo3aristaG1F.equals("B")) {
                        Cubo3C5J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo3aristaG1F.equals("V")) {
                        Cubo3C5J.setBackground(new Color(16,175,107));
                    } else if (Cubo3aristaG1F.equals("A")) {
                        Cubo3C5J.setBackground(new Color(255,234,78));
                    }

                    // Cara superior
                    Cubo3C3J.setText(Cubo3aristaG2I);
                    Cubo3C3E.setText(Cubo3aristaG2I);

                    if (Cubo3aristaG2I.equals("R")) {
                        Cubo3C3J.setBackground(new Color(155,22,57));
                    } else if (Cubo3aristaG2I.equals("B")) {
                        Cubo3C3J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo3aristaG2I.equals("V")) {
                        Cubo3C3J.setBackground(new Color(16,175,107));
                    } else if (Cubo3aristaG2I.equals("A")) {
                        Cubo3C3J.setBackground(new Color(255,234,78));
                    }

                    // Cara inferior
                    Cubo3C4J.setText(Cubo3aristaG2F);
                    Cubo3C4E.setText(Cubo3aristaG2F);

                    if (Cubo3aristaG2F.equals("R")) {
                        Cubo3C4J.setBackground(new Color(155,22,57));
                    } else if (Cubo3aristaG2F.equals("B")) {
                        Cubo3C4J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo3aristaG2F.equals("V")) {
                        Cubo3C4J.setBackground(new Color(16,175,107));
                    } else if (Cubo3aristaG2F.equals("A")) {
                        Cubo3C4J.setBackground(new Color(255,234,78));
                    }

                    // CUBO 4
                    // Cara Frontal y Trasera (NO ES RELEVANTE)
                    if (!(Cubo4aristaG1I + Cubo4aristaG1F).equals(Cubo4arista1I + Cubo4arista1F)
                            && !(Cubo4aristaG2I + Cubo4aristaG2F).equals(Cubo4arista1I + Cubo4arista1F)) {
                        Cubo4C1J.setText(Cubo4arista1I);
                        Cubo4C2J.setText(Cubo4arista1F);
                    } else if (!(Cubo4aristaG1I + Cubo4aristaG1F).equals(Cubo4arista2I + Cubo4arista2F)
                            && !(Cubo4aristaG2I + Cubo4aristaG2F).equals(Cubo4arista2I + Cubo4arista2F)) {
                        Cubo4C1J.setText(Cubo4arista2I);
                        Cubo4C2J.setText(Cubo4arista2F);
                    } else if (!(Cubo4aristaG1I + Cubo4aristaG1F).equals(Cubo4arista3I + Cubo4arista3F)
                            && !(Cubo4aristaG2I + Cubo4aristaG2F).equals(Cubo4arista3I + Cubo4arista3F)) {
                        Cubo4C1J.setText(Cubo4arista3I);
                        Cubo4C2J.setText(Cubo4arista3F);
                    }

                    // Cara Frontal
                    if (Cubo4C1J.getText().equals("R")) {
                        Cubo4C1J.setBackground(new Color(155,22,57));
                    } else if (Cubo4C1J.getText().equals("B")) {
                        Cubo4C1J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo4C1J.getText().equals("V")) {
                        Cubo4C1J.setBackground(new Color(16,175,107));
                    } else if (Cubo4C1J.getText().equals("A")) {
                        Cubo4C1J.setBackground(new Color(255,234,78));
                    }
                    // Cara Trasera
                    if (Cubo4C2J.getText().equals("R")) {
                        Cubo4C2J.setBackground(new Color(155,22,57));
                    } else if (Cubo4C2J.getText().equals("B")) {
                        Cubo4C2J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo4C2J.getText().equals("V")) {
                        Cubo4C2J.setBackground(new Color(16,175,107));
                    } else if (Cubo4C2J.getText().equals("A")) {
                        Cubo4C2J.setBackground(new Color(255,234,78));
                    }

                    // Cara izquierda
                    Cubo4C6J.setText(Cubo4aristaG1I);
                    Cubo4C6E.setText(Cubo4aristaG1I);

                    if (Cubo4aristaG1I.equals("R")) {
                        Cubo4C6J.setBackground(new Color(155,22,57));
                    } else if (Cubo4aristaG1I.equals("B")) {
                        Cubo4C6J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo4aristaG1I.equals("V")) {
                        Cubo4C6J.setBackground(new Color(16,175,107));
                    } else if (Cubo4aristaG1I.equals("A")) {
                        Cubo4C6J.setBackground(new Color(255,234,78));
                    }

                    // Cara derecha
                    Cubo4C5J.setText(Cubo4aristaG1F);
                    Cubo4C5E.setText(Cubo4aristaG1F);
                    if (Cubo4aristaG1F.equals("R")) {
                        Cubo4C5J.setBackground(new Color(155,22,57));
                    } else if (Cubo4aristaG1F.equals("B")) {
                        Cubo4C5J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo4aristaG1F.equals("V")) {
                        Cubo4C5J.setBackground(new Color(16,175,107));
                    } else if (Cubo4aristaG1F.equals("A")) {
                        Cubo4C5J.setBackground(new Color(255,234,78));
                    }

                    // Cara superior
                    Cubo4C3J.setText(Cubo4aristaG2I);
                    Cubo4C3E.setText(Cubo4aristaG2I);

                    if (Cubo4aristaG2I.equals("R")) {
                        Cubo4C3J.setBackground(new Color(155,22,57));
                    } else if (Cubo4aristaG2I.equals("B")) {
                        Cubo4C3J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo4aristaG2I.equals("V")) {
                        Cubo4C3J.setBackground(new Color(16,175,107));
                    } else if (Cubo4aristaG2I.equals("A")) {
                        Cubo4C3J.setBackground(new Color(255,234,78));
                    }

                    // Cara inferior
                    Cubo4C4J.setText(Cubo4aristaG2F);
                    Cubo4C4E.setText(Cubo4aristaG2F);

                    if (Cubo4aristaG2F.equals("R")) {
                        Cubo4C4J.setBackground(new Color(155,22,57));
                    } else if (Cubo4aristaG2F.equals("B")) {
                        Cubo4C4J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo4aristaG2F.equals("V")) {
                        Cubo4C4J.setBackground(new Color(16,175,107));
                    } else if (Cubo4aristaG2F.equals("A")) {
                        Cubo4C4J.setBackground(new Color(255,234,78));
                    }

                    System.out.println("Aristas restantes: ");
                    System.out.println("Cubo 1: " + Cubo1C1J.getText() + "-" + Cubo1C2J.getText());
                    System.out.println("Cubo 2: " + Cubo2C1J.getText() + "-" + Cubo2C2J.getText());
                    System.out.println("Cubo 3: " + Cubo3C1J.getText() + "-" + Cubo3C2J.getText());
                    System.out.println("Cubo 4: " + Cubo4C1J.getText() + "-" + Cubo4C2J.getText());
                    
                } else {

                    // Ordenar Horizontales
                    String[] caraIzquierda = {Cubo1aristaG1I, Cubo2aristaG1I, Cubo3aristaG1I, Cubo4aristaG1I};
                    String[] caraDerecha = {Cubo1aristaG1F, Cubo2aristaG1F, Cubo3aristaG1F, Cubo4aristaG1F};
                    String[] caraSuperior = {Cubo1aristaG2I, Cubo2aristaG2I, Cubo3aristaG2I, Cubo4aristaG2I};
                    String[] caraInferior = {Cubo1aristaG2F, Cubo2aristaG2F, Cubo3aristaG2F, Cubo4aristaG2F};

                    String Cubo1Cara6 = null;
                    String Cubo1Cara5 = null;
                    String Cubo1Cara3 = null;
                    String Cubo1Cara4 = null;

                    String Cubo2Cara6 = null;
                    String Cubo2Cara5 = null;
                    String Cubo2Cara3 = null;
                    String Cubo2Cara4 = null;

                    String Cubo3Cara6 = null;
                    String Cubo3Cara5 = null;
                    String Cubo3Cara3 = null;
                    String Cubo3Cara4 = null;

                    String Cubo4Cara6 = null;
                    String Cubo4Cara5 = null;
                    String Cubo4Cara3 = null;
                    String Cubo4Cara4 = null;

                    boolean ordenadas = false;

                    /* Combinaciones de un solo número:
                1, 2, 3, 4

                Combinaciones de dos números:
                1 2, 1 3, 1 4, 2 3, 2 4, 3 4

                Combinaciones de tres números:
                1 2 3, 1 2 4, 1 3 4, 2 3 4

                Combinación de cuatro números:
                1 2 3 4
                     */
                    // Verificar si ya están ordenadas
                    String caraI = caraIzquierda[0];

                    Cubo1Cara6 = caraIzquierda[0];
                    Cubo2Cara6 = caraIzquierda[1];
                    Cubo3Cara6 = caraIzquierda[2];
                    Cubo4Cara6 = caraIzquierda[3];

                    Cubo1Cara5 = caraDerecha[0];
                    Cubo2Cara5 = caraDerecha[1];
                    Cubo3Cara5 = caraDerecha[2];
                    Cubo4Cara5 = caraDerecha[3];

                    boolean condicionHz = (!Cubo1Cara6.equals(Cubo2Cara6)
                            && !Cubo1Cara6.equals(Cubo3Cara6)
                            && !Cubo1Cara6.equals(Cubo4Cara6))
                            //
                            && (!Cubo2Cara6.equals(Cubo3Cara6)
                            && !Cubo2Cara6.equals(Cubo4Cara6))
                            //
                            && !Cubo3Cara6.equals(Cubo4Cara6);
                    if (condicionHz) {
                        ordenadas = true;
                        System.out.println("Posiciones Correctas");
                    }
                    if (ordenadas == false) {
                        // Combinación 1

                        caraIzquierda[0] = caraDerecha[0];
                        caraDerecha[0] = caraI;

                        Cubo1Cara6 = caraIzquierda[0];
                        Cubo2Cara6 = caraIzquierda[1];
                        Cubo3Cara6 = caraIzquierda[2];
                        Cubo4Cara6 = caraIzquierda[3];

                        Cubo1Cara5 = caraDerecha[0];
                        Cubo2Cara5 = caraDerecha[1];
                        Cubo3Cara5 = caraDerecha[2];
                        Cubo4Cara5 = caraDerecha[3];

                        condicionHz = (!Cubo1Cara6.equals(Cubo2Cara6)
                                && !Cubo1Cara6.equals(Cubo3Cara6)
                                && !Cubo1Cara6.equals(Cubo4Cara6))
                                //
                                && (!Cubo2Cara6.equals(Cubo3Cara6)
                                && !Cubo2Cara6.equals(Cubo4Cara6))
                                //
                                && !Cubo3Cara6.equals(Cubo4Cara6);
                        if (condicionHz) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 2

                        caraIzquierda = new String[]{Cubo1aristaG1I, Cubo2aristaG1I, Cubo3aristaG1I, Cubo4aristaG1I};
                        caraDerecha = new String[]{Cubo1aristaG1F, Cubo2aristaG1F, Cubo3aristaG1F, Cubo4aristaG1F};

                        caraI = caraIzquierda[1];
                        caraIzquierda[1] = caraDerecha[1];
                        caraDerecha[1] = caraI;

                        Cubo1Cara6 = caraIzquierda[0];
                        Cubo2Cara6 = caraIzquierda[1];
                        Cubo3Cara6 = caraIzquierda[2];
                        Cubo4Cara6 = caraIzquierda[3];

                        Cubo1Cara5 = caraDerecha[0];
                        Cubo2Cara5 = caraDerecha[1];
                        Cubo3Cara5 = caraDerecha[2];
                        Cubo4Cara5 = caraDerecha[3];

                        condicionHz = (!Cubo1Cara6.equals(Cubo2Cara6)
                                && !Cubo1Cara6.equals(Cubo3Cara6)
                                && !Cubo1Cara6.equals(Cubo4Cara6))
                                //
                                && (!Cubo2Cara6.equals(Cubo3Cara6)
                                && !Cubo2Cara6.equals(Cubo4Cara6))
                                //
                                && !Cubo3Cara6.equals(Cubo4Cara6);
                        if (condicionHz) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 3

                        caraIzquierda = new String[]{Cubo1aristaG1I, Cubo2aristaG1I, Cubo3aristaG1I, Cubo4aristaG1I};
                        caraDerecha = new String[]{Cubo1aristaG1F, Cubo2aristaG1F, Cubo3aristaG1F, Cubo4aristaG1F};

                        caraI = caraIzquierda[2];
                        caraIzquierda[2] = caraDerecha[2];
                        caraDerecha[2] = caraI;

                        Cubo1Cara6 = caraIzquierda[0];
                        Cubo2Cara6 = caraIzquierda[1];
                        Cubo3Cara6 = caraIzquierda[2];
                        Cubo4Cara6 = caraIzquierda[3];

                        Cubo1Cara5 = caraDerecha[0];
                        Cubo2Cara5 = caraDerecha[1];
                        Cubo3Cara5 = caraDerecha[2];
                        Cubo4Cara5 = caraDerecha[3];

                        condicionHz = (!Cubo1Cara6.equals(Cubo2Cara6)
                                && !Cubo1Cara6.equals(Cubo3Cara6)
                                && !Cubo1Cara6.equals(Cubo4Cara6))
                                //
                                && (!Cubo2Cara6.equals(Cubo3Cara6)
                                && !Cubo2Cara6.equals(Cubo4Cara6))
                                //
                                && !Cubo3Cara6.equals(Cubo4Cara6);
                        if (condicionHz) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 4

                        caraIzquierda = new String[]{Cubo1aristaG1I, Cubo2aristaG1I, Cubo3aristaG1I, Cubo4aristaG1I};
                        caraDerecha = new String[]{Cubo1aristaG1F, Cubo2aristaG1F, Cubo3aristaG1F, Cubo4aristaG1F};

                        caraI = caraIzquierda[3];
                        caraIzquierda[3] = caraDerecha[3];
                        caraDerecha[3] = caraI;

                        Cubo1Cara6 = caraIzquierda[0];
                        Cubo2Cara6 = caraIzquierda[1];
                        Cubo3Cara6 = caraIzquierda[2];
                        Cubo4Cara6 = caraIzquierda[3];

                        Cubo1Cara5 = caraDerecha[0];
                        Cubo2Cara5 = caraDerecha[1];
                        Cubo3Cara5 = caraDerecha[2];
                        Cubo4Cara5 = caraDerecha[3];

                        condicionHz = (!Cubo1Cara6.equals(Cubo2Cara6)
                                && !Cubo1Cara6.equals(Cubo3Cara6)
                                && !Cubo1Cara6.equals(Cubo4Cara6))
                                //
                                && (!Cubo2Cara6.equals(Cubo3Cara6)
                                && !Cubo2Cara6.equals(Cubo4Cara6))
                                //
                                && !Cubo3Cara6.equals(Cubo4Cara6);
                        if (condicionHz) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 5

                        caraIzquierda = new String[]{Cubo1aristaG1I, Cubo2aristaG1I, Cubo3aristaG1I, Cubo4aristaG1I};
                        caraDerecha = new String[]{Cubo1aristaG1F, Cubo2aristaG1F, Cubo3aristaG1F, Cubo4aristaG1F};

                        caraI = caraIzquierda[0];
                        caraIzquierda[0] = caraDerecha[0];
                        caraDerecha[0] = caraI;

                        caraI = caraIzquierda[1];
                        caraIzquierda[1] = caraDerecha[1];
                        caraDerecha[1] = caraI;

                        Cubo1Cara6 = caraIzquierda[0];
                        Cubo2Cara6 = caraIzquierda[1];
                        Cubo3Cara6 = caraIzquierda[2];
                        Cubo4Cara6 = caraIzquierda[3];

                        Cubo1Cara5 = caraDerecha[0];
                        Cubo2Cara5 = caraDerecha[1];
                        Cubo3Cara5 = caraDerecha[2];
                        Cubo4Cara5 = caraDerecha[3];

                        condicionHz = (!Cubo1Cara6.equals(Cubo2Cara6)
                                && !Cubo1Cara6.equals(Cubo3Cara6)
                                && !Cubo1Cara6.equals(Cubo4Cara6))
                                //
                                && (!Cubo2Cara6.equals(Cubo3Cara6)
                                && !Cubo2Cara6.equals(Cubo4Cara6))
                                //
                                && !Cubo3Cara6.equals(Cubo4Cara6);
                        if (condicionHz) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 6

                        caraIzquierda = new String[]{Cubo1aristaG1I, Cubo2aristaG1I, Cubo3aristaG1I, Cubo4aristaG1I};
                        caraDerecha = new String[]{Cubo1aristaG1F, Cubo2aristaG1F, Cubo3aristaG1F, Cubo4aristaG1F};

                        caraI = caraIzquierda[0];
                        caraIzquierda[0] = caraDerecha[0];
                        caraDerecha[0] = caraI;

                        caraI = caraIzquierda[2];
                        caraIzquierda[2] = caraDerecha[2];
                        caraDerecha[2] = caraI;

                        Cubo1Cara6 = caraIzquierda[0];
                        Cubo2Cara6 = caraIzquierda[1];
                        Cubo3Cara6 = caraIzquierda[2];
                        Cubo4Cara6 = caraIzquierda[3];

                        Cubo1Cara5 = caraDerecha[0];
                        Cubo2Cara5 = caraDerecha[1];
                        Cubo3Cara5 = caraDerecha[2];
                        Cubo4Cara5 = caraDerecha[3];

                        condicionHz = (!Cubo1Cara6.equals(Cubo2Cara6)
                                && !Cubo1Cara6.equals(Cubo3Cara6)
                                && !Cubo1Cara6.equals(Cubo4Cara6))
                                //
                                && (!Cubo2Cara6.equals(Cubo3Cara6)
                                && !Cubo2Cara6.equals(Cubo4Cara6))
                                //
                                && !Cubo3Cara6.equals(Cubo4Cara6);
                        if (condicionHz) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 7

                        caraIzquierda = new String[]{Cubo1aristaG1I, Cubo2aristaG1I, Cubo3aristaG1I, Cubo4aristaG1I};
                        caraDerecha = new String[]{Cubo1aristaG1F, Cubo2aristaG1F, Cubo3aristaG1F, Cubo4aristaG1F};

                        caraI = caraIzquierda[0];
                        caraIzquierda[0] = caraDerecha[0];
                        caraDerecha[0] = caraI;

                        caraI = caraIzquierda[3];
                        caraIzquierda[3] = caraDerecha[3];
                        caraDerecha[3] = caraI;

                        Cubo1Cara6 = caraIzquierda[0];
                        Cubo2Cara6 = caraIzquierda[1];
                        Cubo3Cara6 = caraIzquierda[2];
                        Cubo4Cara6 = caraIzquierda[3];

                        Cubo1Cara5 = caraDerecha[0];
                        Cubo2Cara5 = caraDerecha[1];
                        Cubo3Cara5 = caraDerecha[2];
                        Cubo4Cara5 = caraDerecha[3];

                        condicionHz = (!Cubo1Cara6.equals(Cubo2Cara6)
                                && !Cubo1Cara6.equals(Cubo3Cara6)
                                && !Cubo1Cara6.equals(Cubo4Cara6))
                                //
                                && (!Cubo2Cara6.equals(Cubo3Cara6)
                                && !Cubo2Cara6.equals(Cubo4Cara6))
                                //
                                && !Cubo3Cara6.equals(Cubo4Cara6);
                        if (condicionHz) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 8

                        caraIzquierda = new String[]{Cubo1aristaG1I, Cubo2aristaG1I, Cubo3aristaG1I, Cubo4aristaG1I};
                        caraDerecha = new String[]{Cubo1aristaG1F, Cubo2aristaG1F, Cubo3aristaG1F, Cubo4aristaG1F};

                        caraI = caraIzquierda[1];
                        caraIzquierda[1] = caraDerecha[1];
                        caraDerecha[1] = caraI;

                        caraI = caraIzquierda[2];
                        caraIzquierda[2] = caraDerecha[2];
                        caraDerecha[2] = caraI;

                        Cubo1Cara6 = caraIzquierda[0];
                        Cubo2Cara6 = caraIzquierda[1];
                        Cubo3Cara6 = caraIzquierda[2];
                        Cubo4Cara6 = caraIzquierda[3];

                        Cubo1Cara5 = caraDerecha[0];
                        Cubo2Cara5 = caraDerecha[1];
                        Cubo3Cara5 = caraDerecha[2];
                        Cubo4Cara5 = caraDerecha[3];

                        condicionHz = (!Cubo1Cara6.equals(Cubo2Cara6)
                                && !Cubo1Cara6.equals(Cubo3Cara6)
                                && !Cubo1Cara6.equals(Cubo4Cara6))
                                //
                                && (!Cubo2Cara6.equals(Cubo3Cara6)
                                && !Cubo2Cara6.equals(Cubo4Cara6))
                                //
                                && !Cubo3Cara6.equals(Cubo4Cara6);
                        if (condicionHz) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 9

                        caraIzquierda = new String[]{Cubo1aristaG1I, Cubo2aristaG1I, Cubo3aristaG1I, Cubo4aristaG1I};
                        caraDerecha = new String[]{Cubo1aristaG1F, Cubo2aristaG1F, Cubo3aristaG1F, Cubo4aristaG1F};

                        caraI = caraIzquierda[1];
                        caraIzquierda[1] = caraDerecha[1];
                        caraDerecha[1] = caraI;

                        caraI = caraIzquierda[3];
                        caraIzquierda[3] = caraDerecha[3];
                        caraDerecha[3] = caraI;

                        Cubo1Cara6 = caraIzquierda[0];
                        Cubo2Cara6 = caraIzquierda[1];
                        Cubo3Cara6 = caraIzquierda[2];
                        Cubo4Cara6 = caraIzquierda[3];

                        Cubo1Cara5 = caraDerecha[0];
                        Cubo2Cara5 = caraDerecha[1];
                        Cubo3Cara5 = caraDerecha[2];
                        Cubo4Cara5 = caraDerecha[3];

                        condicionHz = (!Cubo1Cara6.equals(Cubo2Cara6)
                                && !Cubo1Cara6.equals(Cubo3Cara6)
                                && !Cubo1Cara6.equals(Cubo4Cara6))
                                //
                                && (!Cubo2Cara6.equals(Cubo3Cara6)
                                && !Cubo2Cara6.equals(Cubo4Cara6))
                                //
                                && !Cubo3Cara6.equals(Cubo4Cara6);
                        if (condicionHz) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 10

                        caraIzquierda = new String[]{Cubo1aristaG1I, Cubo2aristaG1I, Cubo3aristaG1I, Cubo4aristaG1I};
                        caraDerecha = new String[]{Cubo1aristaG1F, Cubo2aristaG1F, Cubo3aristaG1F, Cubo4aristaG1F};

                        caraI = caraIzquierda[2];
                        caraIzquierda[2] = caraDerecha[2];
                        caraDerecha[2] = caraI;

                        caraI = caraIzquierda[3];
                        caraIzquierda[3] = caraDerecha[3];
                        caraDerecha[3] = caraI;

                        Cubo1Cara6 = caraIzquierda[0];
                        Cubo2Cara6 = caraIzquierda[1];
                        Cubo3Cara6 = caraIzquierda[2];
                        Cubo4Cara6 = caraIzquierda[3];

                        Cubo1Cara5 = caraDerecha[0];
                        Cubo2Cara5 = caraDerecha[1];
                        Cubo3Cara5 = caraDerecha[2];
                        Cubo4Cara5 = caraDerecha[3];

                        condicionHz = (!Cubo1Cara6.equals(Cubo2Cara6)
                                && !Cubo1Cara6.equals(Cubo3Cara6)
                                && !Cubo1Cara6.equals(Cubo4Cara6))
                                //
                                && (!Cubo2Cara6.equals(Cubo3Cara6)
                                && !Cubo2Cara6.equals(Cubo4Cara6))
                                //
                                && !Cubo3Cara6.equals(Cubo4Cara6);
                        if (condicionHz) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 11

                        caraIzquierda = new String[]{Cubo1aristaG1I, Cubo2aristaG1I, Cubo3aristaG1I, Cubo4aristaG1I};
                        caraDerecha = new String[]{Cubo1aristaG1F, Cubo2aristaG1F, Cubo3aristaG1F, Cubo4aristaG1F};

                        caraI = caraIzquierda[0];
                        caraIzquierda[0] = caraDerecha[0];
                        caraDerecha[0] = caraI;

                        caraI = caraIzquierda[1];
                        caraIzquierda[1] = caraDerecha[1];
                        caraDerecha[1] = caraI;

                        caraI = caraIzquierda[2];
                        caraIzquierda[2] = caraDerecha[2];
                        caraDerecha[2] = caraI;

                        Cubo1Cara6 = caraIzquierda[0];
                        Cubo2Cara6 = caraIzquierda[1];
                        Cubo3Cara6 = caraIzquierda[2];
                        Cubo4Cara6 = caraIzquierda[3];

                        Cubo1Cara5 = caraDerecha[0];
                        Cubo2Cara5 = caraDerecha[1];
                        Cubo3Cara5 = caraDerecha[2];
                        Cubo4Cara5 = caraDerecha[3];

                        condicionHz = (!Cubo1Cara6.equals(Cubo2Cara6)
                                && !Cubo1Cara6.equals(Cubo3Cara6)
                                && !Cubo1Cara6.equals(Cubo4Cara6))
                                //
                                && (!Cubo2Cara6.equals(Cubo3Cara6)
                                && !Cubo2Cara6.equals(Cubo4Cara6))
                                //
                                && !Cubo3Cara6.equals(Cubo4Cara6);
                        if (condicionHz) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 12

                        caraIzquierda = new String[]{Cubo1aristaG1I, Cubo2aristaG1I, Cubo3aristaG1I, Cubo4aristaG1I};
                        caraDerecha = new String[]{Cubo1aristaG1F, Cubo2aristaG1F, Cubo3aristaG1F, Cubo4aristaG1F};

                        caraI = caraIzquierda[0];
                        caraIzquierda[0] = caraDerecha[0];
                        caraDerecha[0] = caraI;

                        caraI = caraIzquierda[1];
                        caraIzquierda[1] = caraDerecha[1];
                        caraDerecha[1] = caraI;

                        caraI = caraIzquierda[3];
                        caraIzquierda[3] = caraDerecha[3];
                        caraDerecha[3] = caraI;

                        Cubo1Cara6 = caraIzquierda[0];
                        Cubo2Cara6 = caraIzquierda[1];
                        Cubo3Cara6 = caraIzquierda[2];
                        Cubo4Cara6 = caraIzquierda[3];

                        Cubo1Cara5 = caraDerecha[0];
                        Cubo2Cara5 = caraDerecha[1];
                        Cubo3Cara5 = caraDerecha[2];
                        Cubo4Cara5 = caraDerecha[3];

                        condicionHz = (!Cubo1Cara6.equals(Cubo2Cara6)
                                && !Cubo1Cara6.equals(Cubo3Cara6)
                                && !Cubo1Cara6.equals(Cubo4Cara6))
                                //
                                && (!Cubo2Cara6.equals(Cubo3Cara6)
                                && !Cubo2Cara6.equals(Cubo4Cara6))
                                //
                                && !Cubo3Cara6.equals(Cubo4Cara6);
                        if (condicionHz) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 13

                        caraIzquierda = new String[]{Cubo1aristaG1I, Cubo2aristaG1I, Cubo3aristaG1I, Cubo4aristaG1I};
                        caraDerecha = new String[]{Cubo1aristaG1F, Cubo2aristaG1F, Cubo3aristaG1F, Cubo4aristaG1F};

                        caraI = caraIzquierda[0];
                        caraIzquierda[0] = caraDerecha[0];
                        caraDerecha[0] = caraI;

                        caraI = caraIzquierda[2];
                        caraIzquierda[2] = caraDerecha[2];
                        caraDerecha[2] = caraI;

                        caraI = caraIzquierda[3];
                        caraIzquierda[3] = caraDerecha[3];
                        caraDerecha[3] = caraI;

                        Cubo1Cara6 = caraIzquierda[0];
                        Cubo2Cara6 = caraIzquierda[1];
                        Cubo3Cara6 = caraIzquierda[2];
                        Cubo4Cara6 = caraIzquierda[3];

                        Cubo1Cara5 = caraDerecha[0];
                        Cubo2Cara5 = caraDerecha[1];
                        Cubo3Cara5 = caraDerecha[2];
                        Cubo4Cara5 = caraDerecha[3];

                        condicionHz = (!Cubo1Cara6.equals(Cubo2Cara6)
                                && !Cubo1Cara6.equals(Cubo3Cara6)
                                && !Cubo1Cara6.equals(Cubo4Cara6))
                                //
                                && (!Cubo2Cara6.equals(Cubo3Cara6)
                                && !Cubo2Cara6.equals(Cubo4Cara6))
                                //
                                && !Cubo3Cara6.equals(Cubo4Cara6);
                        if (condicionHz) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 14

                        caraIzquierda = new String[]{Cubo1aristaG1I, Cubo2aristaG1I, Cubo3aristaG1I, Cubo4aristaG1I};
                        caraDerecha = new String[]{Cubo1aristaG1F, Cubo2aristaG1F, Cubo3aristaG1F, Cubo4aristaG1F};

                        caraI = caraIzquierda[1];
                        caraIzquierda[1] = caraDerecha[1];
                        caraDerecha[1] = caraI;

                        caraI = caraIzquierda[2];
                        caraIzquierda[2] = caraDerecha[2];
                        caraDerecha[2] = caraI;

                        caraI = caraIzquierda[3];
                        caraIzquierda[3] = caraDerecha[3];
                        caraDerecha[3] = caraI;

                        Cubo1Cara6 = caraIzquierda[0];
                        Cubo2Cara6 = caraIzquierda[1];
                        Cubo3Cara6 = caraIzquierda[2];
                        Cubo4Cara6 = caraIzquierda[3];

                        Cubo1Cara5 = caraDerecha[0];
                        Cubo2Cara5 = caraDerecha[1];
                        Cubo3Cara5 = caraDerecha[2];
                        Cubo4Cara5 = caraDerecha[3];

                        condicionHz = (!Cubo1Cara6.equals(Cubo2Cara6)
                                && !Cubo1Cara6.equals(Cubo3Cara6)
                                && !Cubo1Cara6.equals(Cubo4Cara6))
                                //
                                && (!Cubo2Cara6.equals(Cubo3Cara6)
                                && !Cubo2Cara6.equals(Cubo4Cara6))
                                //
                                && !Cubo3Cara6.equals(Cubo4Cara6);
                        if (condicionHz) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    System.out.println("Horizontales");
                    System.out.println(Cubo1Cara6 + "-" + Cubo1Cara5);
                    System.out.println(Cubo2Cara6 + "-" + Cubo2Cara5);
                    System.out.println(Cubo3Cara6 + "-" + Cubo3Cara5);
                    System.out.println(Cubo4Cara6 + "-" + Cubo4Cara5);

                    // Ordenar Verticales
                    ordenadas = false;

                    /* Combinaciones de un solo número:
                1, 2, 3, 4

                Combinaciones de dos números:
                1 2, 1 3, 1 4, 2 3, 2 4, 3 4

                Combinaciones de tres números:
                1 2 3, 1 2 4, 1 3 4, 2 3 4

                Combinación de cuatro números:
                1 2 3 4
                     */
                    // Verificar si ya está ordenadas
                    String caraS = caraSuperior[0];

                    Cubo1Cara3 = caraSuperior[0];
                    Cubo2Cara3 = caraSuperior[1];
                    Cubo3Cara3 = caraSuperior[2];
                    Cubo4Cara3 = caraSuperior[3];

                    Cubo1Cara4 = caraInferior[0];
                    Cubo2Cara4 = caraInferior[1];
                    Cubo3Cara4 = caraInferior[2];
                    Cubo4Cara4 = caraInferior[3];

                    boolean condicionVt = (!Cubo1Cara3.equals(Cubo2Cara3)
                            && !Cubo1Cara3.equals(Cubo3Cara3)
                            && !Cubo1Cara3.equals(Cubo4Cara3))
                            //
                            && (!Cubo2Cara3.equals(Cubo3Cara3)
                            && !Cubo2Cara3.equals(Cubo4Cara3))
                            //
                            && !Cubo3Cara3.equals(Cubo4Cara3);
                    if (condicionVt) {
                        ordenadas = true;
                        System.out.println("Posiciones Correctas");
                    }

                    if (ordenadas == false) {
                        // Combinación 1
                        caraS = caraSuperior[0];
                        caraSuperior[0] = caraInferior[0];
                        caraInferior[0] = caraS;

                        Cubo1Cara3 = caraSuperior[0];
                        Cubo2Cara3 = caraSuperior[1];
                        Cubo3Cara3 = caraSuperior[2];
                        Cubo4Cara3 = caraSuperior[3];

                        Cubo1Cara4 = caraInferior[0];
                        Cubo2Cara4 = caraInferior[1];
                        Cubo3Cara4 = caraInferior[2];
                        Cubo4Cara4 = caraInferior[3];

                        condicionVt = (!Cubo1Cara3.equals(Cubo2Cara3)
                                && !Cubo1Cara3.equals(Cubo3Cara3)
                                && !Cubo1Cara3.equals(Cubo4Cara3))
                                //
                                && (!Cubo2Cara3.equals(Cubo3Cara3)
                                && !Cubo2Cara3.equals(Cubo4Cara3))
                                //
                                && !Cubo3Cara3.equals(Cubo4Cara3);
                        if (condicionVt) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 2

                        caraSuperior = new String[]{Cubo1aristaG2I, Cubo2aristaG2I, Cubo3aristaG2I, Cubo4aristaG2I};
                        caraInferior = new String[]{Cubo1aristaG2F, Cubo2aristaG2F, Cubo3aristaG2F, Cubo4aristaG2F};

                        caraS = caraSuperior[1];
                        caraSuperior[1] = caraInferior[1];
                        caraInferior[1] = caraS;

                        Cubo1Cara3 = caraSuperior[0];
                        Cubo2Cara3 = caraSuperior[1];
                        Cubo3Cara3 = caraSuperior[2];
                        Cubo4Cara3 = caraSuperior[3];

                        Cubo1Cara4 = caraInferior[0];
                        Cubo2Cara4 = caraInferior[1];
                        Cubo3Cara4 = caraInferior[2];
                        Cubo4Cara4 = caraInferior[3];

                        condicionVt = (!Cubo1Cara3.equals(Cubo2Cara3)
                                && !Cubo1Cara3.equals(Cubo3Cara3)
                                && !Cubo1Cara3.equals(Cubo4Cara3))
                                //
                                && (!Cubo2Cara3.equals(Cubo3Cara3)
                                && !Cubo2Cara3.equals(Cubo4Cara3))
                                //
                                && !Cubo3Cara3.equals(Cubo4Cara3);
                        if (condicionVt) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 3

                        caraSuperior = new String[]{Cubo1aristaG2I, Cubo2aristaG2I, Cubo3aristaG2I, Cubo4aristaG2I};
                        caraInferior = new String[]{Cubo1aristaG2F, Cubo2aristaG2F, Cubo3aristaG2F, Cubo4aristaG2F};

                        caraS = caraSuperior[2];
                        caraSuperior[2] = caraInferior[2];
                        caraInferior[2] = caraS;

                        Cubo1Cara3 = caraSuperior[0];
                        Cubo2Cara3 = caraSuperior[1];
                        Cubo3Cara3 = caraSuperior[2];
                        Cubo4Cara3 = caraSuperior[3];

                        Cubo1Cara4 = caraInferior[0];
                        Cubo2Cara4 = caraInferior[1];
                        Cubo3Cara4 = caraInferior[2];
                        Cubo4Cara4 = caraInferior[3];

                        condicionVt = (!Cubo1Cara3.equals(Cubo2Cara3)
                                && !Cubo1Cara3.equals(Cubo3Cara3)
                                && !Cubo1Cara3.equals(Cubo4Cara3))
                                //
                                && (!Cubo2Cara3.equals(Cubo3Cara3)
                                && !Cubo2Cara3.equals(Cubo4Cara3))
                                //
                                && !Cubo3Cara3.equals(Cubo4Cara3);
                        if (condicionVt) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 4

                        caraSuperior = new String[]{Cubo1aristaG2I, Cubo2aristaG2I, Cubo3aristaG2I, Cubo4aristaG2I};
                        caraInferior = new String[]{Cubo1aristaG2F, Cubo2aristaG2F, Cubo3aristaG2F, Cubo4aristaG2F};

                        caraS = caraSuperior[3];
                        caraSuperior[3] = caraInferior[3];
                        caraInferior[3] = caraS;

                        Cubo1Cara3 = caraSuperior[0];
                        Cubo2Cara3 = caraSuperior[1];
                        Cubo3Cara3 = caraSuperior[2];
                        Cubo4Cara3 = caraSuperior[3];

                        Cubo1Cara4 = caraInferior[0];
                        Cubo2Cara4 = caraInferior[1];
                        Cubo3Cara4 = caraInferior[2];
                        Cubo4Cara4 = caraInferior[3];

                        condicionVt = (!Cubo1Cara3.equals(Cubo2Cara3)
                                && !Cubo1Cara3.equals(Cubo3Cara3)
                                && !Cubo1Cara3.equals(Cubo4Cara3))
                                //
                                && (!Cubo2Cara3.equals(Cubo3Cara3)
                                && !Cubo2Cara3.equals(Cubo4Cara3))
                                //
                                && !Cubo3Cara3.equals(Cubo4Cara3);
                        if (condicionVt) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 5

                        caraSuperior = new String[]{Cubo1aristaG2I, Cubo2aristaG2I, Cubo3aristaG2I, Cubo4aristaG2I};
                        caraInferior = new String[]{Cubo1aristaG2F, Cubo2aristaG2F, Cubo3aristaG2F, Cubo4aristaG2F};

                        caraS = caraSuperior[0];
                        caraSuperior[0] = caraInferior[0];
                        caraInferior[0] = caraS;

                        caraS = caraSuperior[1];
                        caraSuperior[1] = caraInferior[1];
                        caraInferior[1] = caraS;

                        Cubo1Cara3 = caraSuperior[0];
                        Cubo2Cara3 = caraSuperior[1];
                        Cubo3Cara3 = caraSuperior[2];
                        Cubo4Cara3 = caraSuperior[3];

                        Cubo1Cara4 = caraInferior[0];
                        Cubo2Cara4 = caraInferior[1];
                        Cubo3Cara4 = caraInferior[2];
                        Cubo4Cara4 = caraInferior[3];

                        condicionVt = (!Cubo1Cara3.equals(Cubo2Cara3)
                                && !Cubo1Cara3.equals(Cubo3Cara3)
                                && !Cubo1Cara3.equals(Cubo4Cara3))
                                //
                                && (!Cubo2Cara3.equals(Cubo3Cara3)
                                && !Cubo2Cara3.equals(Cubo4Cara3))
                                //
                                && !Cubo3Cara3.equals(Cubo4Cara3);
                        if (condicionVt) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 6

                        caraSuperior = new String[]{Cubo1aristaG2I, Cubo2aristaG2I, Cubo3aristaG2I, Cubo4aristaG2I};
                        caraInferior = new String[]{Cubo1aristaG2F, Cubo2aristaG2F, Cubo3aristaG2F, Cubo4aristaG2F};

                        caraS = caraSuperior[0];
                        caraSuperior[0] = caraInferior[0];
                        caraInferior[0] = caraS;

                        caraS = caraSuperior[2];
                        caraSuperior[2] = caraInferior[2];
                        caraInferior[2] = caraS;

                        Cubo1Cara3 = caraSuperior[0];
                        Cubo2Cara3 = caraSuperior[1];
                        Cubo3Cara3 = caraSuperior[2];
                        Cubo4Cara3 = caraSuperior[3];

                        Cubo1Cara4 = caraInferior[0];
                        Cubo2Cara4 = caraInferior[1];
                        Cubo3Cara4 = caraInferior[2];
                        Cubo4Cara4 = caraInferior[3];

                        condicionVt = (!Cubo1Cara3.equals(Cubo2Cara3)
                                && !Cubo1Cara3.equals(Cubo3Cara3)
                                && !Cubo1Cara3.equals(Cubo4Cara3))
                                //
                                && (!Cubo2Cara3.equals(Cubo3Cara3)
                                && !Cubo2Cara3.equals(Cubo4Cara3))
                                //
                                && !Cubo3Cara3.equals(Cubo4Cara3);
                        if (condicionVt) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 7

                        caraSuperior = new String[]{Cubo1aristaG2I, Cubo2aristaG2I, Cubo3aristaG2I, Cubo4aristaG2I};
                        caraInferior = new String[]{Cubo1aristaG2F, Cubo2aristaG2F, Cubo3aristaG2F, Cubo4aristaG2F};

                        caraS = caraSuperior[0];
                        caraSuperior[0] = caraInferior[0];
                        caraInferior[0] = caraS;

                        caraS = caraSuperior[3];
                        caraSuperior[3] = caraInferior[3];
                        caraInferior[3] = caraS;

                        Cubo1Cara3 = caraSuperior[0];
                        Cubo2Cara3 = caraSuperior[1];
                        Cubo3Cara3 = caraSuperior[2];
                        Cubo4Cara3 = caraSuperior[3];

                        Cubo1Cara4 = caraInferior[0];
                        Cubo2Cara4 = caraInferior[1];
                        Cubo3Cara4 = caraInferior[2];
                        Cubo4Cara4 = caraInferior[3];

                        condicionVt = (!Cubo1Cara3.equals(Cubo2Cara3)
                                && !Cubo1Cara3.equals(Cubo3Cara3)
                                && !Cubo1Cara3.equals(Cubo4Cara3))
                                //
                                && (!Cubo2Cara3.equals(Cubo3Cara3)
                                && !Cubo2Cara3.equals(Cubo4Cara3))
                                //
                                && !Cubo3Cara3.equals(Cubo4Cara3);
                        if (condicionVt) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 8

                        caraSuperior = new String[]{Cubo1aristaG2I, Cubo2aristaG2I, Cubo3aristaG2I, Cubo4aristaG2I};
                        caraInferior = new String[]{Cubo1aristaG2F, Cubo2aristaG2F, Cubo3aristaG2F, Cubo4aristaG2F};

                        caraS = caraSuperior[1];
                        caraSuperior[1] = caraInferior[1];
                        caraInferior[1] = caraS;

                        caraS = caraSuperior[2];
                        caraSuperior[2] = caraInferior[2];
                        caraInferior[2] = caraS;

                        Cubo1Cara3 = caraSuperior[0];
                        Cubo2Cara3 = caraSuperior[1];
                        Cubo3Cara3 = caraSuperior[2];
                        Cubo4Cara3 = caraSuperior[3];

                        Cubo1Cara4 = caraInferior[0];
                        Cubo2Cara4 = caraInferior[1];
                        Cubo3Cara4 = caraInferior[2];
                        Cubo4Cara4 = caraInferior[3];

                        condicionVt = (!Cubo1Cara3.equals(Cubo2Cara3)
                                && !Cubo1Cara3.equals(Cubo3Cara3)
                                && !Cubo1Cara3.equals(Cubo4Cara3))
                                //
                                && (!Cubo2Cara3.equals(Cubo3Cara3)
                                && !Cubo2Cara3.equals(Cubo4Cara3))
                                //
                                && !Cubo3Cara3.equals(Cubo4Cara3);
                        if (condicionVt) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 9

                        caraSuperior = new String[]{Cubo1aristaG2I, Cubo2aristaG2I, Cubo3aristaG2I, Cubo4aristaG2I};
                        caraInferior = new String[]{Cubo1aristaG2F, Cubo2aristaG2F, Cubo3aristaG2F, Cubo4aristaG2F};

                        caraS = caraSuperior[1];
                        caraSuperior[1] = caraInferior[1];
                        caraInferior[1] = caraS;

                        caraS = caraSuperior[3];
                        caraSuperior[3] = caraInferior[3];
                        caraInferior[3] = caraS;

                        Cubo1Cara3 = caraSuperior[0];
                        Cubo2Cara3 = caraSuperior[1];
                        Cubo3Cara3 = caraSuperior[2];
                        Cubo4Cara3 = caraSuperior[3];

                        Cubo1Cara4 = caraInferior[0];
                        Cubo2Cara4 = caraInferior[1];
                        Cubo3Cara4 = caraInferior[2];
                        Cubo4Cara4 = caraInferior[3];

                        condicionVt = (!Cubo1Cara3.equals(Cubo2Cara3)
                                && !Cubo1Cara3.equals(Cubo3Cara3)
                                && !Cubo1Cara3.equals(Cubo4Cara3))
                                //
                                && (!Cubo2Cara3.equals(Cubo3Cara3)
                                && !Cubo2Cara3.equals(Cubo4Cara3))
                                //
                                && !Cubo3Cara3.equals(Cubo4Cara3);
                        if (condicionVt) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 10

                        caraSuperior = new String[]{Cubo1aristaG2I, Cubo2aristaG2I, Cubo3aristaG2I, Cubo4aristaG2I};
                        caraInferior = new String[]{Cubo1aristaG2F, Cubo2aristaG2F, Cubo3aristaG2F, Cubo4aristaG2F};

                        caraS = caraSuperior[2];
                        caraSuperior[2] = caraInferior[2];
                        caraInferior[2] = caraS;

                        caraS = caraSuperior[3];
                        caraSuperior[3] = caraInferior[3];
                        caraInferior[3] = caraS;

                        Cubo1Cara3 = caraSuperior[0];
                        Cubo2Cara3 = caraSuperior[1];
                        Cubo3Cara3 = caraSuperior[2];
                        Cubo4Cara3 = caraSuperior[3];

                        Cubo1Cara4 = caraInferior[0];
                        Cubo2Cara4 = caraInferior[1];
                        Cubo3Cara4 = caraInferior[2];
                        Cubo4Cara4 = caraInferior[3];

                        condicionVt = (!Cubo1Cara3.equals(Cubo2Cara3)
                                && !Cubo1Cara3.equals(Cubo3Cara3)
                                && !Cubo1Cara3.equals(Cubo4Cara3))
                                //
                                && (!Cubo2Cara3.equals(Cubo3Cara3)
                                && !Cubo2Cara3.equals(Cubo4Cara3))
                                //
                                && !Cubo3Cara3.equals(Cubo4Cara3);
                        if (condicionVt) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 11

                        caraSuperior = new String[]{Cubo1aristaG2I, Cubo2aristaG2I, Cubo3aristaG2I, Cubo4aristaG2I};
                        caraInferior = new String[]{Cubo1aristaG2F, Cubo2aristaG2F, Cubo3aristaG2F, Cubo4aristaG2F};

                        caraS = caraSuperior[0];
                        caraSuperior[0] = caraInferior[0];
                        caraInferior[0] = caraS;

                        caraS = caraSuperior[1];
                        caraSuperior[1] = caraInferior[1];
                        caraInferior[1] = caraS;

                        caraS = caraSuperior[2];
                        caraSuperior[2] = caraInferior[2];
                        caraInferior[2] = caraS;

                        Cubo1Cara3 = caraSuperior[0];
                        Cubo2Cara3 = caraSuperior[1];
                        Cubo3Cara3 = caraSuperior[2];
                        Cubo4Cara3 = caraSuperior[3];

                        Cubo1Cara4 = caraInferior[0];
                        Cubo2Cara4 = caraInferior[1];
                        Cubo3Cara4 = caraInferior[2];
                        Cubo4Cara4 = caraInferior[3];

                        condicionVt = (!Cubo1Cara3.equals(Cubo2Cara3)
                                && !Cubo1Cara3.equals(Cubo3Cara3)
                                && !Cubo1Cara3.equals(Cubo4Cara3))
                                //
                                && (!Cubo2Cara3.equals(Cubo3Cara3)
                                && !Cubo2Cara3.equals(Cubo4Cara3))
                                //
                                && !Cubo3Cara3.equals(Cubo4Cara3);
                        if (condicionVt) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 12

                        caraSuperior = new String[]{Cubo1aristaG2I, Cubo2aristaG2I, Cubo3aristaG2I, Cubo4aristaG2I};
                        caraInferior = new String[]{Cubo1aristaG2F, Cubo2aristaG2F, Cubo3aristaG2F, Cubo4aristaG2F};

                        caraS = caraSuperior[0];
                        caraSuperior[0] = caraInferior[0];
                        caraInferior[0] = caraS;

                        caraS = caraSuperior[1];
                        caraSuperior[1] = caraInferior[1];
                        caraInferior[1] = caraS;

                        caraS = caraSuperior[3];
                        caraSuperior[3] = caraInferior[3];
                        caraInferior[3] = caraS;

                        Cubo1Cara3 = caraSuperior[0];
                        Cubo2Cara3 = caraSuperior[1];
                        Cubo3Cara3 = caraSuperior[2];
                        Cubo4Cara3 = caraSuperior[3];

                        Cubo1Cara4 = caraInferior[0];
                        Cubo2Cara4 = caraInferior[1];
                        Cubo3Cara4 = caraInferior[2];
                        Cubo4Cara4 = caraInferior[3];

                        condicionVt = (!Cubo1Cara3.equals(Cubo2Cara3)
                                && !Cubo1Cara3.equals(Cubo3Cara3)
                                && !Cubo1Cara3.equals(Cubo4Cara3))
                                //
                                && (!Cubo2Cara3.equals(Cubo3Cara3)
                                && !Cubo2Cara3.equals(Cubo4Cara3))
                                //
                                && !Cubo3Cara3.equals(Cubo4Cara3);
                        if (condicionVt) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 13

                        caraSuperior = new String[]{Cubo1aristaG2I, Cubo2aristaG2I, Cubo3aristaG2I, Cubo4aristaG2I};
                        caraInferior = new String[]{Cubo1aristaG2F, Cubo2aristaG2F, Cubo3aristaG2F, Cubo4aristaG2F};

                        caraS = caraSuperior[0];
                        caraSuperior[0] = caraInferior[0];
                        caraInferior[0] = caraS;

                        caraS = caraSuperior[2];
                        caraSuperior[2] = caraInferior[2];
                        caraInferior[2] = caraS;

                        caraS = caraSuperior[3];
                        caraSuperior[3] = caraInferior[3];
                        caraInferior[3] = caraS;

                        Cubo1Cara3 = caraSuperior[0];
                        Cubo2Cara3 = caraSuperior[1];
                        Cubo3Cara3 = caraSuperior[2];
                        Cubo4Cara3 = caraSuperior[3];

                        Cubo1Cara4 = caraInferior[0];
                        Cubo2Cara4 = caraInferior[1];
                        Cubo3Cara4 = caraInferior[2];
                        Cubo4Cara4 = caraInferior[3];

                        condicionVt = (!Cubo1Cara3.equals(Cubo2Cara3)
                                && !Cubo1Cara3.equals(Cubo3Cara3)
                                && !Cubo1Cara3.equals(Cubo4Cara3))
                                //
                                && (!Cubo2Cara3.equals(Cubo3Cara3)
                                && !Cubo2Cara3.equals(Cubo4Cara3))
                                //
                                && !Cubo3Cara3.equals(Cubo4Cara3);
                        if (condicionVt) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    if (ordenadas == false) {
                        // Combinación 14

                        caraSuperior = new String[]{Cubo1aristaG2I, Cubo2aristaG2I, Cubo3aristaG2I, Cubo4aristaG2I};
                        caraInferior = new String[]{Cubo1aristaG2F, Cubo2aristaG2F, Cubo3aristaG2F, Cubo4aristaG2F};

                        caraS = caraSuperior[1];
                        caraSuperior[1] = caraInferior[1];
                        caraInferior[1] = caraS;

                        caraS = caraSuperior[2];
                        caraSuperior[2] = caraInferior[2];
                        caraInferior[2] = caraS;

                        caraS = caraSuperior[3];
                        caraSuperior[3] = caraInferior[3];
                        caraInferior[3] = caraS;

                        Cubo1Cara3 = caraSuperior[0];
                        Cubo2Cara3 = caraSuperior[1];
                        Cubo3Cara3 = caraSuperior[2];
                        Cubo4Cara3 = caraSuperior[3];

                        Cubo1Cara4 = caraInferior[0];
                        Cubo2Cara4 = caraInferior[1];
                        Cubo3Cara4 = caraInferior[2];
                        Cubo4Cara4 = caraInferior[3];

                        condicionVt = (!Cubo1Cara3.equals(Cubo2Cara3)
                                && !Cubo1Cara3.equals(Cubo3Cara3)
                                && !Cubo1Cara3.equals(Cubo4Cara3))
                                //
                                && (!Cubo2Cara3.equals(Cubo3Cara3)
                                && !Cubo2Cara3.equals(Cubo4Cara3))
                                //
                                && !Cubo3Cara3.equals(Cubo4Cara3);
                        if (condicionVt) {
                            ordenadas = true;
                            System.out.println("Posiciones Corregidas");
                        }
                    }

                    System.out.println("Verticales");
                    System.out.println(Cubo1Cara3 + "-" + Cubo1Cara4);
                    System.out.println(Cubo2Cara3 + "-" + Cubo2Cara4);
                    System.out.println(Cubo3Cara3 + "-" + Cubo3Cara4);
                    System.out.println(Cubo4Cara3 + "-" + Cubo4Cara4);

                    // Asignar los colores a los cubos del juego
                    // CUBO 1
                    // Cara Frontal y Trasera (NO ES RELEVANTE)
                    if (!(Cubo1aristaG1I + Cubo1aristaG1F).equals(Cubo1arista1I + Cubo1arista1F)
                            && !(Cubo1aristaG2I + Cubo1aristaG2F).equals(Cubo1arista1I + Cubo1arista1F)) {
                        Cubo1C1J.setText(Cubo1arista1I);
                        Cubo1C2J.setText(Cubo1arista1F);
                    } else if (!(Cubo1aristaG1I + Cubo1aristaG1F).equals(Cubo1arista2I + Cubo1arista2F)
                            && !(Cubo1aristaG2I + Cubo1aristaG2F).equals(Cubo1arista2I + Cubo1arista2F)) {
                        Cubo1C1J.setText(Cubo1arista2I);
                        Cubo1C2J.setText(Cubo1arista2F);
                    } else if (!(Cubo1aristaG1I + Cubo1aristaG1F).equals(Cubo1arista3I + Cubo1arista3F)
                            && !(Cubo1aristaG2I + Cubo1aristaG2F).equals(Cubo1arista3I + Cubo1arista3F)) {
                        Cubo1C1J.setText(Cubo1arista3I);
                        Cubo1C2J.setText(Cubo1arista3F);
                    }

                    System.out.println("Aristas restantes: ");
                    System.out.println("Cubo 1: " + Cubo1C1J.getText() + "-" + Cubo1C2J.getText());

                    // Cara Frontal
                    if (Cubo1C1J.getText().equals("R")) {
                        Cubo1C1J.setBackground(new Color(155,22,57));
                    } else if (Cubo1C1J.getText().equals("B")) {
                        Cubo1C1J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo1C1J.getText().equals("V")) {
                        Cubo1C1J.setBackground(new Color(16,175,107));
                    } else if (Cubo1C1J.getText().equals("A")) {
                        Cubo1C1J.setBackground(new Color(255,234,78));
                    }
                    // Cara Trasera
                    if (Cubo1C2J.getText().equals("R")) {
                        Cubo1C2J.setBackground(new Color(155,22,57));
                    } else if (Cubo1C2J.getText().equals("B")) {
                        Cubo1C2J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo1C2J.getText().equals("V")) {
                        Cubo1C2J.setBackground(new Color(16,175,107));
                    } else if (Cubo1C2J.getText().equals("A")) {
                        Cubo1C2J.setBackground(new Color(255,234,78));
                    }

                    // Cara izquierda
                    Cubo1C6J.setText(Cubo1Cara6);
                    Cubo1C6E.setText(Cubo1Cara6);

                    if (Cubo1Cara6.equals("R")) {
                        Cubo1C6J.setBackground(new Color(155,22,57));
                    } else if (Cubo1Cara6.equals("B")) {
                        Cubo1C6J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo1Cara6.equals("V")) {
                        Cubo1C6J.setBackground(new Color(16,175,107));
                    } else if (Cubo1Cara6.equals("A")) {
                        Cubo1C6J.setBackground(new Color(255,234,78));
                    }

                    // Cara derecha
                    Cubo1C5J.setText(Cubo1Cara5);
                    Cubo1C5E.setText(Cubo1Cara5);
                    if (Cubo1Cara5.equals("R")) {
                        Cubo1C5J.setBackground(new Color(155,22,57));
                    } else if (Cubo1Cara5.equals("B")) {
                        Cubo1C5J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo1Cara5.equals("V")) {
                        Cubo1C5J.setBackground(new Color(16,175,107));
                    } else if (Cubo1Cara5.equals("A")) {
                        Cubo1C5J.setBackground(new Color(255,234,78));
                    }

                    // Cara superior
                    Cubo1C3J.setText(Cubo1Cara3);
                    Cubo1C3E.setText(Cubo1Cara3);

                    if (Cubo1Cara3.equals("R")) {
                        Cubo1C3J.setBackground(new Color(155,22,57));
                    } else if (Cubo1Cara3.equals("B")) {
                        Cubo1C3J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo1Cara3.equals("V")) {
                        Cubo1C3J.setBackground(new Color(16,175,107));
                    } else if (Cubo1Cara3.equals("A")) {
                        Cubo1C3J.setBackground(new Color(255,234,78));
                    }

                    // Cara inferior
                    Cubo1C4J.setText(Cubo1Cara4);
                    Cubo1C4E.setText(Cubo1Cara4);

                    if (Cubo1Cara4.equals("R")) {
                        Cubo1C4J.setBackground(new Color(155,22,57));
                    } else if (Cubo1Cara4.equals("B")) {
                        Cubo1C4J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo1Cara4.equals("V")) {
                        Cubo1C4J.setBackground(new Color(16,175,107));
                    } else if (Cubo1Cara4.equals("A")) {
                        Cubo1C4J.setBackground(new Color(255,234,78));
                    }

                    // CUBO 2
                    // Cara Frontal y Trasera (NO ES RELEVANTE)
                    if (!(Cubo2aristaG1I + Cubo2aristaG1F).equals(Cubo2arista1I + Cubo2arista1F)
                            && !(Cubo2aristaG2I + Cubo2aristaG2F).equals(Cubo2arista1I + Cubo2arista1F)) {
                        Cubo2C1J.setText(Cubo2arista1I);
                        Cubo2C2J.setText(Cubo2arista1F);
                    } else if (!(Cubo2aristaG1I + Cubo2aristaG1F).equals(Cubo2arista2I + Cubo2arista2F)
                            && !(Cubo2aristaG2I + Cubo2aristaG2F).equals(Cubo2arista2I + Cubo2arista2F)) {
                        Cubo2C1J.setText(Cubo2arista2I);
                        Cubo2C2J.setText(Cubo2arista2F);
                    } else if (!(Cubo2aristaG1I + Cubo2aristaG1F).equals(Cubo2arista3I + Cubo2arista3F)
                            && !(Cubo2aristaG2I + Cubo2aristaG2F).equals(Cubo2arista3I + Cubo2arista3F)) {
                        Cubo2C1J.setText(Cubo2arista3I);
                        Cubo2C2J.setText(Cubo2arista3F);
                    }

                    System.out.println("Cubo 2: " + Cubo2C1J.getText() + "-" + Cubo2C2J.getText());

                    // Cara Frontal
                    if (Cubo2C1J.getText().equals("R")) {
                        Cubo2C1J.setBackground(new Color(155,22,57));
                    } else if (Cubo2C1J.getText().equals("B")) {
                        Cubo2C1J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo2C1J.getText().equals("V")) {
                        Cubo2C1J.setBackground(new Color(16,175,107));
                    } else if (Cubo2C1J.getText().equals("A")) {
                        Cubo2C1J.setBackground(new Color(255,234,78));
                    }
                    // Cara Trasera
                    if (Cubo2C2J.getText().equals("R")) {
                        Cubo2C2J.setBackground(new Color(155,22,57));
                    } else if (Cubo2C2J.getText().equals("B")) {
                        Cubo2C2J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo2C2J.getText().equals("V")) {
                        Cubo2C2J.setBackground(new Color(16,175,107));
                    } else if (Cubo2C2J.getText().equals("A")) {
                        Cubo2C2J.setBackground(new Color(255,234,78));
                    }

                    // Cara izquierda
                    Cubo2C6J.setText(Cubo2Cara6);
                    Cubo2C6E.setText(Cubo2Cara6);

                    if (Cubo2Cara6.equals("R")) {
                        Cubo2C6J.setBackground(new Color(155,22,57));
                    } else if (Cubo2Cara6.equals("B")) {
                        Cubo2C6J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo2Cara6.equals("V")) {
                        Cubo2C6J.setBackground(new Color(16,175,107));
                    } else if (Cubo2Cara6.equals("A")) {
                        Cubo2C6J.setBackground(new Color(255,234,78));
                    }

                    // Cara derecha
                    Cubo2C5J.setText(Cubo2Cara5);
                    Cubo2C5E.setText(Cubo2Cara5);

                    if (Cubo2Cara5.equals("R")) {
                        Cubo2C5J.setBackground(new Color(155,22,57));
                    } else if (Cubo2Cara5.equals("B")) {
                        Cubo2C5J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo2Cara5.equals("V")) {
                        Cubo2C5J.setBackground(new Color(16,175,107));
                    } else if (Cubo2Cara5.equals("A")) {
                        Cubo2C5J.setBackground(new Color(255,234,78));
                    }

                    // Cara superior
                    Cubo2C3J.setText(Cubo2Cara3);
                    Cubo2C3E.setText(Cubo2Cara3);

                    if (Cubo2Cara3.equals("R")) {
                        Cubo2C3J.setBackground(new Color(155,22,57));
                    } else if (Cubo2Cara3.equals("B")) {
                        Cubo2C3J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo2Cara3.equals("V")) {
                        Cubo2C3J.setBackground(new Color(16,175,107));
                    } else if (Cubo2Cara3.equals("A")) {
                        Cubo2C3J.setBackground(new Color(255,234,78));
                    }

                    // Cara inferior
                    Cubo2C4J.setText(Cubo2Cara4);
                    Cubo2C4E.setText(Cubo2Cara4);

                    if (Cubo2Cara4.equals("R")) {
                        Cubo2C4J.setBackground(new Color(155,22,57));
                    } else if (Cubo2Cara4.equals("B")) {
                        Cubo2C4J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo2Cara4.equals("V")) {
                        Cubo2C4J.setBackground(new Color(16,175,107));
                    } else if (Cubo2Cara4.equals("A")) {
                        Cubo2C4J.setBackground(new Color(255,234,78));
                    }

                    // CUBO 3
                    // Cara Frontal y Trasera (NO ES RELEVANTE)
                    if (!(Cubo3aristaG1I + Cubo3aristaG1F).equals(Cubo3arista1I + Cubo3arista1F)
                            && !(Cubo3aristaG2I + Cubo3aristaG2F).equals(Cubo3arista1I + Cubo3arista1F)) {
                        Cubo3C1J.setText(Cubo3arista1I);
                        Cubo3C2J.setText(Cubo3arista1F);
                    } else if (!(Cubo3aristaG1I + Cubo3aristaG1F).equals(Cubo3arista2I + Cubo3arista2F)
                            && !(Cubo3aristaG2I + Cubo3aristaG2F).equals(Cubo3arista2I + Cubo3arista2F)) {
                        Cubo3C1J.setText(Cubo3arista2I);
                        Cubo3C2J.setText(Cubo3arista2F);
                    } else if (!(Cubo3aristaG1I + Cubo3aristaG1F).equals(Cubo3arista3I + Cubo3arista3F)
                            && !(Cubo3aristaG2I + Cubo3aristaG2F).equals(Cubo3arista3I + Cubo3arista3F)) {
                        Cubo3C1J.setText(Cubo3arista3I);
                        Cubo3C2J.setText(Cubo3arista3F);
                    }

                    System.out.println("Cubo 3: " + Cubo3C1J.getText() + "-" + Cubo3C2J.getText());

                    // Cara Frontal
                    if (Cubo3C1J.getText().equals("R")) {
                        Cubo3C1J.setBackground(new Color(155,22,57));
                    } else if (Cubo3C1J.getText().equals("B")) {
                        Cubo3C1J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo3C1J.getText().equals("V")) {
                        Cubo3C1J.setBackground(new Color(16,175,107));
                    } else if (Cubo3C1J.getText().equals("A")) {
                        Cubo3C1J.setBackground(new Color(255,234,78));
                    }
                    // Cara Trasera
                    if (Cubo3C2J.getText().equals("R")) {
                        Cubo3C2J.setBackground(new Color(155,22,57));
                    } else if (Cubo3C2J.getText().equals("B")) {
                        Cubo3C2J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo3C2J.getText().equals("V")) {
                        Cubo3C2J.setBackground(new Color(16,175,107));
                    } else if (Cubo3C2J.getText().equals("A")) {
                        Cubo3C2J.setBackground(new Color(255,234,78));
                    }

                    // Cara izquierda
                    Cubo3C6J.setText(Cubo3Cara6);
                    Cubo3C6E.setText(Cubo3Cara6);

                    if (Cubo3Cara6.equals("R")) {
                        Cubo3C6J.setBackground(new Color(155,22,57));
                    } else if (Cubo3Cara6.equals("B")) {
                        Cubo3C6J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo3Cara6.equals("V")) {
                        Cubo3C6J.setBackground(new Color(16,175,107));
                    } else if (Cubo3Cara6.equals("A")) {
                        Cubo3C6J.setBackground(new Color(255,234,78));
                    }

                    // Cara derecha
                    Cubo3C5J.setText(Cubo3Cara5);
                    Cubo3C5E.setText(Cubo3Cara5);

                    if (Cubo3Cara5.equals("R")) {
                        Cubo3C5J.setBackground(new Color(155,22,57));
                    } else if (Cubo3Cara5.equals("B")) {
                        Cubo3C5J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo3Cara5.equals("V")) {
                        Cubo3C5J.setBackground(new Color(16,175,107));
                    } else if (Cubo3Cara5.equals("A")) {
                        Cubo3C5J.setBackground(new Color(255,234,78));
                    }

                    // Cara superior
                    Cubo3C3J.setText(Cubo3Cara3);
                    Cubo3C3E.setText(Cubo3Cara3);

                    if (Cubo3Cara3.equals("R")) {
                        Cubo3C3J.setBackground(new Color(155,22,57));
                    } else if (Cubo3Cara3.equals("B")) {
                        Cubo3C3J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo3Cara3.equals("V")) {
                        Cubo3C3J.setBackground(new Color(16,175,107));
                    } else if (Cubo3Cara3.equals("A")) {
                        Cubo3C3J.setBackground(new Color(255,234,78));
                    }

                    // Cara inferior
                    Cubo3C4J.setText(Cubo3Cara4);
                    Cubo3C4E.setText(Cubo3Cara4);

                    if (Cubo3Cara4.equals("R")) {
                        Cubo3C4J.setBackground(new Color(155,22,57));
                    } else if (Cubo3Cara4.equals("B")) {
                        Cubo3C4J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo3Cara4.equals("V")) {
                        Cubo3C4J.setBackground(new Color(16,175,107));
                    } else if (Cubo3Cara4.equals("A")) {
                        Cubo3C4J.setBackground(new Color(255,234,78));
                    }

                    // CUBO 4
                    // Cara Frontal y Trasera (NO ES RELEVANTE)
                    if (!(Cubo4aristaG1I + Cubo4aristaG1F).equals(Cubo4arista1I + Cubo4arista1F)
                            && !(Cubo4aristaG2I + Cubo4aristaG2F).equals(Cubo4arista1I + Cubo4arista1F)) {
                        Cubo4C1J.setText(Cubo4arista1I);
                        Cubo4C2J.setText(Cubo4arista1F);
                    } else if (!(Cubo4aristaG1I + Cubo4aristaG1F).equals(Cubo4arista2I + Cubo4arista2F)
                            && !(Cubo4aristaG2I + Cubo4aristaG2F).equals(Cubo4arista2I + Cubo4arista2F)) {
                        Cubo4C1J.setText(Cubo4arista2I);
                        Cubo4C2J.setText(Cubo4arista2F);
                    } else if (!(Cubo4aristaG1I + Cubo4aristaG1F).equals(Cubo4arista3I + Cubo4arista3F)
                            && !(Cubo4aristaG2I + Cubo4aristaG2F).equals(Cubo4arista3I + Cubo4arista3F)) {
                        Cubo4C1J.setText(Cubo4arista3I);
                        Cubo4C2J.setText(Cubo4arista3F);
                    }

                    System.out.println("Cubo 4: " + Cubo4C1J.getText() + "-" + Cubo4C2J.getText());

                    // Cara Frontal
                    if (Cubo4C1J.getText().equals("R")) {
                        Cubo4C1J.setBackground(new Color(155,22,57));
                    } else if (Cubo4C1J.getText().equals("B")) {
                        Cubo4C1J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo4C1J.getText().equals("V")) {
                        Cubo4C1J.setBackground(new Color(16,175,107));
                    } else if (Cubo4C1J.getText().equals("A")) {
                        Cubo4C1J.setBackground(new Color(255,234,78));
                    }
                    // Cara Trasera
                    if (Cubo4C2J.getText().equals("R")) {
                        Cubo4C2J.setBackground(new Color(155,22,57));
                    } else if (Cubo4C2J.getText().equals("B")) {
                        Cubo4C2J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo4C2J.getText().equals("V")) {
                        Cubo4C2J.setBackground(new Color(16,175,107));
                    } else if (Cubo4C2J.getText().equals("A")) {
                        Cubo4C2J.setBackground(new Color(255,234,78));
                    }

                    // Cara izquierda
                    Cubo4C6J.setText(Cubo4Cara6);
                    Cubo4C6E.setText(Cubo4Cara6);

                    if (Cubo4Cara6.equals("R")) {
                        Cubo4C6J.setBackground(new Color(155,22,57));
                    } else if (Cubo4Cara6.equals("B")) {
                        Cubo4C6J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo4Cara6.equals("V")) {
                        Cubo4C6J.setBackground(new Color(16,175,107));
                    } else if (Cubo4Cara6.equals("A")) {
                        Cubo4C6J.setBackground(new Color(255,234,78));
                    }

                    // Cara derecha
                    Cubo4C5J.setText(Cubo4Cara5);
                    Cubo4C5E.setText(Cubo4Cara5);

                    if (Cubo4Cara5.equals("R")) {
                        Cubo4C5J.setBackground(new Color(155,22,57));
                    } else if (Cubo4Cara5.equals("B")) {
                        Cubo4C5J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo4Cara5.equals("V")) {
                        Cubo4C5J.setBackground(new Color(16,175,107));
                    } else if (Cubo4Cara5.equals("A")) {
                        Cubo4C5J.setBackground(new Color(255,234,78));
                    }

                    // Cara superior
                    Cubo4C3J.setText(Cubo4Cara3);
                    Cubo4C3E.setText(Cubo4Cara3);

                    if (Cubo4Cara3.equals("R")) {
                        Cubo4C3J.setBackground(new Color(155,22,57));
                    } else if (Cubo4Cara3.equals("B")) {
                        Cubo4C3J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo4Cara3.equals("V")) {
                        Cubo4C3J.setBackground(new Color(16,175,107));
                    } else if (Cubo4Cara3.equals("A")) {
                        Cubo4C3J.setBackground(new Color(255,234,78));
                    }

                    // Cara inferior
                    Cubo4C4J.setText(Cubo4Cara4);
                    Cubo4C4E.setText(Cubo4Cara4);

                    if (Cubo4Cara4.equals("R")) {
                        Cubo4C4J.setBackground(new Color(155,22,57));
                    } else if (Cubo4Cara4.equals("B")) {
                        Cubo4C4J.setBackground(new Color(255, 255, 255));
                    } else if (Cubo4Cara4.equals("V")) {
                        Cubo4C4J.setBackground(new Color(16,175,107));
                    } else if (Cubo4Cara4.equals("A")) {
                        Cubo4C4J.setBackground(new Color(255,234,78));
                    }

                }
                resueltoLbl.setVisible(true);
                grafoGL();
                grafoG1();
                grafoG2();
            } else {
                resuelto = false;
                resueltoLbl.setVisible(false);
                JOptionPane.showMessageDialog(null, "NO EXISTE una solución,\n"
                        + "intenta otra combinación");
                jTabbedPane1.setSelectedIndex(0);
            }
        } else {
            resuelto = false;
            resueltoLbl.setVisible(false);
            JOptionPane.showMessageDialog(null, "NO EXISTE una solución,\n"
                    + "intenta otra combinación");
            jTabbedPane1.setSelectedIndex(0);
        }
    }

    public void combinarSoluciones() {
        Cubo1C6E.setText(Cubo1C6J.getText());
        Cubo1C5E.setText(Cubo1C5J.getText());
        Cubo1C3E.setText(Cubo1C3J.getText());
        Cubo1C4E.setText(Cubo1C4J.getText());

        Cubo2C6E.setText(Cubo2C6J.getText());
        Cubo2C5E.setText(Cubo2C5J.getText());
        Cubo2C3E.setText(Cubo2C3J.getText());
        Cubo2C4E.setText(Cubo2C4J.getText());

        Cubo3C6E.setText(Cubo3C6J.getText());
        Cubo3C5E.setText(Cubo3C5J.getText());
        Cubo3C3E.setText(Cubo3C3J.getText());
        Cubo3C4E.setText(Cubo3C4J.getText());

        Cubo4C6E.setText(Cubo4C6J.getText());
        Cubo4C5E.setText(Cubo4C5J.getText());
        Cubo4C3E.setText(Cubo4C3J.getText());
        Cubo4C4E.setText(Cubo4C4J.getText());

    }

    public void grafoGL() {
        // Grafo GL
        mxGraph graphGL = new mxGraph();
        Object parent = graphGL.getDefaultParent();

        graphGL.getModel().beginUpdate();
        try {
            Object R = graphGL.insertVertex(parent, "a", "R", 20, 20, 20, 20, "fontColor=#000000");
            Object B = graphGL.insertVertex(parent, null, "B", 110, 20, 20, 20, "fontColor=#000000");
            Object V = graphGL.insertVertex(parent, null, "V", 20, 115, 20, 20, "fontColor=#000000");
            Object A = graphGL.insertVertex(parent, null, "A", 110, 115, 20, 20, "fontColor=#000000");

            Object aristaCubo1 = null;
            Object aristaCubo2 = null;
            Object aristaCubo3 = null;
            Object aristaCubo4 = null;

            mxParallelEdgeLayout layout = new mxParallelEdgeLayout(graphGL);

            // Cubo 1
            // Arista 1
            if (Cubo1C1J.getText().equals("R") && Cubo1C2J.getText().equals("R")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", R, R, "endArrow=none;");
            } else if (Cubo1C1J.getText().equals("R") && Cubo1C2J.getText().equals("B")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", R, B, "endArrow=none;");
            } else if (Cubo1C1J.getText().equals("R") && Cubo1C2J.getText().equals("V")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", R, V, "endArrow=none;");
            } else if (Cubo1C1J.getText().equals("R") && Cubo1C2J.getText().equals("A")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", R, A, "endArrow=none;");
            }

            if (Cubo1C1J.getText().equals("B") && Cubo1C2J.getText().equals("R")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", B, R, "endArrow=none;");
            } else if (Cubo1C1J.getText().equals("B") && Cubo1C2J.getText().equals("B")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", B, B, "endArrow=none;");
            } else if (Cubo1C1J.getText().equals("B") && Cubo1C2J.getText().equals("V")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", B, V, "endArrow=none;");
            } else if (Cubo1C1J.getText().equals("B") && Cubo1C2J.getText().equals("A")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", B, A, "endArrow=none;");
            }

            if (Cubo1C1J.getText().equals("V") && Cubo1C2J.getText().equals("R")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", V, R, "endArrow=none;");
            } else if (Cubo1C1J.getText().equals("V") && Cubo1C2J.getText().equals("B")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", V, B, "endArrow=none;");
            } else if (Cubo1C1J.getText().equals("V") && Cubo1C2J.getText().equals("V")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", V, V, "endArrow=none;");
            } else if (Cubo1C1J.getText().equals("V") && Cubo1C2J.getText().equals("A")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", V, A, "endArrow=none;");
            }

            if (Cubo1C1J.getText().equals("A") && Cubo1C2J.getText().equals("R")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", A, R, "endArrow=none;");
            } else if (Cubo1C1J.getText().equals("A") && Cubo1C2J.getText().equals("B")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", A, B, "endArrow=none;");
            } else if (Cubo1C1J.getText().equals("A") && Cubo1C2J.getText().equals("V")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", A, V, "endArrow=none;");
            } else if (Cubo1C1J.getText().equals("A") && Cubo1C2J.getText().equals("A")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", A, A, "endArrow=none;");
            }

            graphGL.getModel().setStyle(aristaCubo1, "strokeColor=#FFFFFF;endArrow=none;fontColor=#FFFFFF");

            // Arista 2
            if (Cubo1C6J.getText().equals("R") && Cubo1C5J.getText().equals("R")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", R, R, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("R") && Cubo1C5J.getText().equals("B")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", R, B, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("R") && Cubo1C5J.getText().equals("V")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", R, V, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("R") && Cubo1C5J.getText().equals("A")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", R, A, "endArrow=none;");
            }

            if (Cubo1C6J.getText().equals("B") && Cubo1C5J.getText().equals("R")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", B, R, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("B") && Cubo1C5J.getText().equals("B")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", B, B, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("B") && Cubo1C5J.getText().equals("V")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", B, V, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("B") && Cubo1C5J.getText().equals("A")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", B, A, "endArrow=none;");
            }

            if (Cubo1C6J.getText().equals("V") && Cubo1C5J.getText().equals("R")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", V, R, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("V") && Cubo1C5J.getText().equals("B")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", V, B, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("V") && Cubo1C5J.getText().equals("V")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", V, V, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("V") && Cubo1C5J.getText().equals("A")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", V, A, "endArrow=none;");
            }

            if (Cubo1C6J.getText().equals("A") && Cubo1C5J.getText().equals("R")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", A, R, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("A") && Cubo1C5J.getText().equals("B")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", A, B, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("A") && Cubo1C5J.getText().equals("V")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", A, V, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("A") && Cubo1C5J.getText().equals("A")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", A, A, "endArrow=none;");
            }

            graphGL.getModel().setStyle(aristaCubo1, "strokeColor=#FFFFFF;endArrow=none;fontColor=#FFFFFF");

            // Arista 3
            if (Cubo1C3J.getText().equals("R") && Cubo1C4J.getText().equals("R")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", R, R, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("R") && Cubo1C4J.getText().equals("B")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", R, B, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("R") && Cubo1C4J.getText().equals("V")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", R, V, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("R") && Cubo1C4J.getText().equals("A")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", R, A, "endArrow=none;");
            }

            if (Cubo1C3J.getText().equals("B") && Cubo1C4J.getText().equals("R")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", B, R, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("B") && Cubo1C4J.getText().equals("B")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", B, B, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("B") && Cubo1C4J.getText().equals("V")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", B, V, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("B") && Cubo1C4J.getText().equals("A")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", B, A, "endArrow=none;");
            }

            if (Cubo1C3J.getText().equals("V") && Cubo1C4J.getText().equals("R")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", V, R, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("V") && Cubo1C4J.getText().equals("B")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", V, B, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("V") && Cubo1C4J.getText().equals("V")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", V, V, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("V") && Cubo1C4J.getText().equals("A")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", V, A, "endArrow=none;");
            }

            if (Cubo1C3J.getText().equals("A") && Cubo1C4J.getText().equals("R")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", A, R, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("A") && Cubo1C4J.getText().equals("B")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", A, B, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("A") && Cubo1C4J.getText().equals("V")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", A, V, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("A") && Cubo1C4J.getText().equals("A")) {
                aristaCubo1 = graphGL.insertEdge(parent, null, "1", A, A, "endArrow=none;");
            }

            graphGL.getModel().setStyle(aristaCubo1, "strokeColor=#FFFFFF;endArrow=none;fontColor=#FFFFFF");

            // Cubo 2
            // Arista 1
            if (Cubo2C1J.getText().equals("R") && Cubo2C2J.getText().equals("R")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", R, R, "endArrow=none;");
            } else if (Cubo2C1J.getText().equals("R") && Cubo2C2J.getText().equals("B")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", R, B, "endArrow=none;");
            } else if (Cubo2C1J.getText().equals("R") && Cubo2C2J.getText().equals("V")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", R, V, "endArrow=none;");
            } else if (Cubo2C1J.getText().equals("R") && Cubo2C2J.getText().equals("A")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", R, A, "endArrow=none;");
            }

            if (Cubo2C1J.getText().equals("B") && Cubo2C2J.getText().equals("R")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", B, R, "endArrow=none;");
            } else if (Cubo2C1J.getText().equals("B") && Cubo2C2J.getText().equals("B")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", B, B, "endArrow=none;");
            } else if (Cubo2C1J.getText().equals("B") && Cubo2C2J.getText().equals("V")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", B, V, "endArrow=none;");
            } else if (Cubo2C1J.getText().equals("B") && Cubo2C2J.getText().equals("A")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", B, A, "endArrow=none;");
            }

            if (Cubo2C1J.getText().equals("V") && Cubo2C2J.getText().equals("R")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", V, R, "endArrow=none;");
            } else if (Cubo2C1J.getText().equals("V") && Cubo2C2J.getText().equals("B")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", V, B, "endArrow=none;");
            } else if (Cubo2C1J.getText().equals("V") && Cubo2C2J.getText().equals("V")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", V, V, "endArrow=none;");
            } else if (Cubo2C1J.getText().equals("V") && Cubo2C2J.getText().equals("A")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", V, A, "endArrow=none;");
            }

            if (Cubo2C1J.getText().equals("A") && Cubo2C2J.getText().equals("R")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", A, R, "endArrow=none;");
            } else if (Cubo2C1J.getText().equals("A") && Cubo2C2J.getText().equals("B")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", A, B, "endArrow=none;");
            } else if (Cubo2C1J.getText().equals("A") && Cubo2C2J.getText().equals("V")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", A, V, "endArrow=none;");
            } else if (Cubo2C1J.getText().equals("A") && Cubo2C2J.getText().equals("A")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", A, A, "endArrow=none;");
            }

            graphGL.getModel().setStyle(aristaCubo2, "strokeColor=#FF0000;endArrow=none;fontColor=#FF0000");

            // Arista 2
            if (Cubo2C6J.getText().equals("R") && Cubo2C5J.getText().equals("R")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", R, R, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("R") && Cubo2C5J.getText().equals("B")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", R, B, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("R") && Cubo2C5J.getText().equals("V")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", R, V, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("R") && Cubo2C5J.getText().equals("A")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", R, A, "endArrow=none;");
            }

            if (Cubo2C6J.getText().equals("B") && Cubo2C5J.getText().equals("R")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", B, R, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("B") && Cubo2C5J.getText().equals("B")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", B, B, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("B") && Cubo2C5J.getText().equals("V")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", B, V, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("B") && Cubo2C5J.getText().equals("A")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", B, A, "endArrow=none;");
            }

            if (Cubo2C6J.getText().equals("V") && Cubo2C5J.getText().equals("R")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", V, R, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("V") && Cubo2C5J.getText().equals("B")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", V, B, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("V") && Cubo2C5J.getText().equals("V")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", V, V, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("V") && Cubo2C5J.getText().equals("A")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", V, A, "endArrow=none;");
            }

            if (Cubo2C6J.getText().equals("A") && Cubo2C5J.getText().equals("R")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", A, R, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("A") && Cubo2C5J.getText().equals("B")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", A, B, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("A") && Cubo2C5J.getText().equals("V")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", A, V, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("A") && Cubo2C5J.getText().equals("A")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", A, A, "endArrow=none;");
            }

            graphGL.getModel().setStyle(aristaCubo2, "strokeColor=#FF0000;endArrow=none;fontColor=#FF0000");

            // Arista 3
            if (Cubo2C3J.getText().equals("R") && Cubo2C4J.getText().equals("R")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", R, R, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("R") && Cubo2C4J.getText().equals("B")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", R, B, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("R") && Cubo2C4J.getText().equals("V")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", R, V, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("R") && Cubo2C4J.getText().equals("A")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", R, A, "endArrow=none;");
            }

            if (Cubo2C3J.getText().equals("B") && Cubo2C4J.getText().equals("R")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", B, R, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("B") && Cubo2C4J.getText().equals("B")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", B, B, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("B") && Cubo2C4J.getText().equals("V")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", B, V, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("B") && Cubo2C4J.getText().equals("A")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", B, A, "endArrow=none;");
            }

            if (Cubo2C3J.getText().equals("V") && Cubo2C4J.getText().equals("R")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", V, R, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("V") && Cubo2C4J.getText().equals("B")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", V, B, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("V") && Cubo2C4J.getText().equals("V")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", V, V, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("V") && Cubo2C4J.getText().equals("A")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", V, A, "endArrow=none;");
            }

            if (Cubo2C3J.getText().equals("A") && Cubo2C4J.getText().equals("R")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", A, R, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("A") && Cubo2C4J.getText().equals("B")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", A, B, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("A") && Cubo2C4J.getText().equals("V")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", A, V, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("A") && Cubo2C4J.getText().equals("A")) {
                aristaCubo2 = graphGL.insertEdge(parent, null, "2", A, A, "endArrow=none;");
            }

            graphGL.getModel().setStyle(aristaCubo2, "strokeColor=#FF0000;endArrow=none;fontColor=#FF0000");

            // Cubo 3
            // Arista 1
            if (Cubo3C1J.getText().equals("R") && Cubo3C2J.getText().equals("R")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", R, R, "endArrow=none;");
            } else if (Cubo3C1J.getText().equals("R") && Cubo3C2J.getText().equals("B")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", R, B, "endArrow=none;");
            } else if (Cubo3C1J.getText().equals("R") && Cubo3C2J.getText().equals("V")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", R, V, "endArrow=none;");
            } else if (Cubo3C1J.getText().equals("R") && Cubo3C2J.getText().equals("A")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", R, A, "endArrow=none;");
            }

            if (Cubo3C1J.getText().equals("B") && Cubo3C2J.getText().equals("R")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", B, R, "endArrow=none;");
            } else if (Cubo3C1J.getText().equals("B") && Cubo3C2J.getText().equals("B")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", B, B, "endArrow=none;");
            } else if (Cubo3C1J.getText().equals("B") && Cubo3C2J.getText().equals("V")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", B, V, "endArrow=none;");
            } else if (Cubo3C1J.getText().equals("B") && Cubo3C2J.getText().equals("A")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", B, A, "endArrow=none;");
            }

            if (Cubo3C1J.getText().equals("V") && Cubo3C2J.getText().equals("R")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", V, R, "endArrow=none;");
            } else if (Cubo3C1J.getText().equals("V") && Cubo3C2J.getText().equals("B")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", V, B, "endArrow=none;");
            } else if (Cubo3C1J.getText().equals("V") && Cubo3C2J.getText().equals("V")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", V, V, "endArrow=none;");
            } else if (Cubo3C1J.getText().equals("V") && Cubo3C2J.getText().equals("A")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", V, A, "endArrow=none;");
            }

            if (Cubo3C1J.getText().equals("A") && Cubo3C2J.getText().equals("R")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", A, R, "endArrow=none;");
            } else if (Cubo3C1J.getText().equals("A") && Cubo3C2J.getText().equals("B")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", A, B, "endArrow=none;");
            } else if (Cubo3C1J.getText().equals("A") && Cubo3C2J.getText().equals("V")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", A, V, "endArrow=none;");
            } else if (Cubo3C1J.getText().equals("A") && Cubo3C2J.getText().equals("A")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", A, A, "endArrow=none;");
            }

            graphGL.getModel().setStyle(aristaCubo3, "strokeColor=#00FF00;endArrow=none;fontColor=#00FF00");

            // Arista 2
            if (Cubo3C6J.getText().equals("R") && Cubo3C5J.getText().equals("R")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", R, R, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("R") && Cubo3C5J.getText().equals("B")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", R, B, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("R") && Cubo3C5J.getText().equals("V")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", R, V, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("R") && Cubo3C5J.getText().equals("A")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", R, A, "endArrow=none;");
            }

            if (Cubo3C6J.getText().equals("B") && Cubo3C5J.getText().equals("R")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", B, R, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("B") && Cubo3C5J.getText().equals("B")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", B, B, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("B") && Cubo3C5J.getText().equals("V")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", B, V, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("B") && Cubo3C5J.getText().equals("A")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", B, A, "endArrow=none;");
            }

            if (Cubo3C6J.getText().equals("V") && Cubo3C5J.getText().equals("R")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", V, R, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("V") && Cubo3C5J.getText().equals("B")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", V, B, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("V") && Cubo3C5J.getText().equals("V")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", V, V, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("V") && Cubo3C5J.getText().equals("A")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", V, A, "endArrow=none;");
            }

            if (Cubo3C6J.getText().equals("A") && Cubo3C5J.getText().equals("R")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", A, R, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("A") && Cubo3C5J.getText().equals("B")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", A, B, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("A") && Cubo3C5J.getText().equals("V")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", A, V, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("A") && Cubo3C5J.getText().equals("A")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", A, A, "endArrow=none;");
            }

            graphGL.getModel().setStyle(aristaCubo3, "strokeColor=#00FF00;endArrow=none;fontColor=#00FF00");

            // Arista 3
            if (Cubo3C3J.getText().equals("R") && Cubo3C4J.getText().equals("R")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", R, R, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("R") && Cubo3C4J.getText().equals("B")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", R, B, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("R") && Cubo3C4J.getText().equals("V")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", R, V, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("R") && Cubo3C4J.getText().equals("A")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", R, A, "endArrow=none;");
            }

            if (Cubo3C3J.getText().equals("B") && Cubo3C4J.getText().equals("R")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", B, R, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("B") && Cubo3C4J.getText().equals("B")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", B, B, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("B") && Cubo3C4J.getText().equals("V")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", B, V, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("B") && Cubo3C4J.getText().equals("A")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", B, A, "endArrow=none;");
            }

            if (Cubo3C3J.getText().equals("V") && Cubo3C4J.getText().equals("R")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", V, R, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("V") && Cubo3C4J.getText().equals("B")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", V, B, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("V") && Cubo3C4J.getText().equals("V")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", V, V, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("V") && Cubo3C4J.getText().equals("A")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", V, A, "endArrow=none;");
            }

            if (Cubo3C3J.getText().equals("A") && Cubo3C4J.getText().equals("R")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", A, R, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("A") && Cubo3C4J.getText().equals("B")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", A, B, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("A") && Cubo3C4J.getText().equals("V")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", A, V, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("A") && Cubo3C4J.getText().equals("A")) {
                aristaCubo3 = graphGL.insertEdge(parent, null, "3", A, A, "endArrow=none;");
            }

            graphGL.getModel().setStyle(aristaCubo3, "strokeColor=#00FF00;endArrow=none;fontColor=#00FF00");

            // Cubo 4
            // Arista 1
            if (Cubo4C1J.getText().equals("R") && Cubo4C2J.getText().equals("R")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", R, R, "endArrow=none;");
            } else if (Cubo4C1J.getText().equals("R") && Cubo4C2J.getText().equals("B")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", R, B, "endArrow=none;");
            } else if (Cubo4C1J.getText().equals("R") && Cubo4C2J.getText().equals("V")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", R, V, "endArrow=none;");
            } else if (Cubo4C1J.getText().equals("R") && Cubo4C2J.getText().equals("A")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", R, A, "endArrow=none;");
            }

            if (Cubo4C1J.getText().equals("B") && Cubo4C2J.getText().equals("R")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", B, R, "endArrow=none;");
            } else if (Cubo4C1J.getText().equals("B") && Cubo4C2J.getText().equals("B")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", B, B, "endArrow=none;");
            } else if (Cubo4C1J.getText().equals("B") && Cubo4C2J.getText().equals("V")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", B, V, "endArrow=none;");
            } else if (Cubo4C1J.getText().equals("B") && Cubo4C2J.getText().equals("A")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", B, A, "endArrow=none;");
            }

            if (Cubo4C1J.getText().equals("V") && Cubo4C2J.getText().equals("R")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", V, R, "endArrow=none;");
            } else if (Cubo4C1J.getText().equals("V") && Cubo4C2J.getText().equals("B")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", V, B, "endArrow=none;");
            } else if (Cubo4C1J.getText().equals("V") && Cubo4C2J.getText().equals("V")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", V, V, "endArrow=none;");
            } else if (Cubo4C1J.getText().equals("V") && Cubo4C2J.getText().equals("A")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", V, A, "endArrow=none;");
            }

            if (Cubo4C1J.getText().equals("A") && Cubo4C2J.getText().equals("R")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", A, R, "endArrow=none;");
            } else if (Cubo4C1J.getText().equals("A") && Cubo4C2J.getText().equals("B")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", A, B, "endArrow=none;");
            } else if (Cubo4C1J.getText().equals("A") && Cubo4C2J.getText().equals("V")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", A, V, "endArrow=none;");
            } else if (Cubo4C1J.getText().equals("A") && Cubo4C2J.getText().equals("A")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", A, A, "endArrow=none;");
            }

            graphGL.getModel().setStyle(aristaCubo4, "strokeColor=#0000FF;endArrow=none;fontColor=#0000FF");

            // Arista 2
            if (Cubo4C6J.getText().equals("R") && Cubo4C5J.getText().equals("R")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", R, R, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("R") && Cubo4C5J.getText().equals("B")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", R, B, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("R") && Cubo4C5J.getText().equals("V")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", R, V, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("R") && Cubo4C5J.getText().equals("A")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", R, A, "endArrow=none;");
            }

            if (Cubo4C6J.getText().equals("B") && Cubo4C5J.getText().equals("R")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", B, R, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("B") && Cubo4C5J.getText().equals("B")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", B, B, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("B") && Cubo4C5J.getText().equals("V")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", B, V, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("B") && Cubo4C5J.getText().equals("A")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", B, A, "endArrow=none;");
            }

            if (Cubo4C6J.getText().equals("V") && Cubo4C5J.getText().equals("R")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", V, R, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("V") && Cubo4C5J.getText().equals("B")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", V, B, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("V") && Cubo4C5J.getText().equals("V")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", V, V, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("V") && Cubo4C5J.getText().equals("A")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", V, A, "endArrow=none;");
            }

            if (Cubo4C6J.getText().equals("A") && Cubo4C5J.getText().equals("R")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", A, R, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("A") && Cubo4C5J.getText().equals("B")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", A, B, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("A") && Cubo4C5J.getText().equals("V")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", A, V, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("A") && Cubo4C5J.getText().equals("A")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", A, A, "endArrow=none;");
            }

            graphGL.getModel().setStyle(aristaCubo4, "strokeColor=#0000FF;endArrow=none;fontColor=#0000FF");

            // Arista 3
            if (Cubo4C3J.getText().equals("R") && Cubo4C4J.getText().equals("R")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", R, R, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("R") && Cubo4C4J.getText().equals("B")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", R, B, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("R") && Cubo4C4J.getText().equals("V")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", R, V, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("R") && Cubo4C4J.getText().equals("A")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", R, A, "endArrow=none;");
            }

            if (Cubo4C3J.getText().equals("B") && Cubo4C4J.getText().equals("R")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", B, R, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("B") && Cubo4C4J.getText().equals("B")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", B, B, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("B") && Cubo4C4J.getText().equals("V")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", B, V, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("B") && Cubo4C4J.getText().equals("A")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", B, A, "endArrow=none;");
            }

            if (Cubo4C3J.getText().equals("V") && Cubo4C4J.getText().equals("R")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", V, R, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("V") && Cubo4C4J.getText().equals("B")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", V, B, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("V") && Cubo4C4J.getText().equals("V")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", V, V, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("V") && Cubo4C4J.getText().equals("A")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", V, A, "endArrow=none;");
            }

            if (Cubo4C3J.getText().equals("A") && Cubo4C4J.getText().equals("R")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", A, R, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("A") && Cubo4C4J.getText().equals("B")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", A, B, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("A") && Cubo4C4J.getText().equals("V")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", A, V, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("A") && Cubo4C4J.getText().equals("A")) {
                aristaCubo4 = graphGL.insertEdge(parent, null, "4", A, A, "endArrow=none;");
            }

            graphGL.getModel().setStyle(aristaCubo4, "strokeColor=#0000FF;endArrow=none;fontColor=#0000FF");

            layout.execute(graphGL.getDefaultParent());

        } finally {
            graphGL.getModel().endUpdate();

        }

        mxGraphComponent graphComponentL = new mxGraphComponent(graphGL);

        grafoGL.removeAll();
        grafoGL.add(graphComponentL);
        graphComponentL.refresh();
        grafoGL.repaint();

        System.out.println("grafo GL actualizado");
    }

    public void grafoG1() {
        // Grafo G1 - Horizontal
        mxGraph graphG1 = new mxGraph();
        Object parent = graphG1.getDefaultParent();

        graphG1.getModel().beginUpdate();

        mxParallelEdgeLayout layout = new mxParallelEdgeLayout(graphG1);
        try {

            Object R = graphG1.insertVertex(parent, null, "R", 20, 20, 20, 20, "fontColor=#000000");
            Object B = graphG1.insertVertex(parent, null, "B", 115, 20, 20, 20, "fontColor=#000000");
            Object V = graphG1.insertVertex(parent, null, "V", 20, 120, 20, 20, "fontColor=#000000");
            Object A = graphG1.insertVertex(parent, null, "A", 115, 120, 20, 20, "fontColor=#000000");

            Object aristaCubo1 = null;
            Object aristaCubo2 = null;
            Object aristaCubo3 = null;
            Object aristaCubo4 = null;

            layout = new mxParallelEdgeLayout(graphG1);

            // Cubo 1
            if (Cubo1C6J.getText().equals("R") && Cubo1C5J.getText().equals("R")) {
                aristaCubo1 = graphG1.insertEdge(parent, null, "1", R, R, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("R") && Cubo1C5J.getText().equals("B")) {
                aristaCubo1 = graphG1.insertEdge(parent, null, "1", R, B, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("R") && Cubo1C5J.getText().equals("V")) {
                aristaCubo1 = graphG1.insertEdge(parent, null, "1", R, V, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("R") && Cubo1C5J.getText().equals("A")) {
                aristaCubo1 = graphG1.insertEdge(parent, null, "1", R, A, "endArrow=none;");
            }

            if (Cubo1C6J.getText().equals("B") && Cubo1C5J.getText().equals("R")) {
                aristaCubo1 = graphG1.insertEdge(parent, null, "1", B, R, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("B") && Cubo1C5J.getText().equals("B")) {
                aristaCubo1 = graphG1.insertEdge(parent, null, "1", B, B, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("B") && Cubo1C5J.getText().equals("V")) {
                aristaCubo1 = graphG1.insertEdge(parent, null, "1", B, V, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("B") && Cubo1C5J.getText().equals("A")) {
                aristaCubo1 = graphG1.insertEdge(parent, null, "1", B, A, "endArrow=none;");
            }

            if (Cubo1C6J.getText().equals("V") && Cubo1C5J.getText().equals("R")) {
                aristaCubo1 = graphG1.insertEdge(parent, null, "1", V, R, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("V") && Cubo1C5J.getText().equals("B")) {
                aristaCubo1 = graphG1.insertEdge(parent, null, "1", V, B, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("V") && Cubo1C5J.getText().equals("V")) {
                aristaCubo1 = graphG1.insertEdge(parent, null, "1", V, V, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("V") && Cubo1C5J.getText().equals("A")) {
                aristaCubo1 = graphG1.insertEdge(parent, null, "1", V, A, "endArrow=none;");
            }

            if (Cubo1C6J.getText().equals("A") && Cubo1C5J.getText().equals("R")) {
                aristaCubo1 = graphG1.insertEdge(parent, null, "1", A, R, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("A") && Cubo1C5J.getText().equals("B")) {
                aristaCubo1 = graphG1.insertEdge(parent, null, "1", A, B, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("A") && Cubo1C5J.getText().equals("V")) {
                aristaCubo1 = graphG1.insertEdge(parent, null, "1", A, V, "endArrow=none;");
            } else if (Cubo1C6J.getText().equals("A") && Cubo1C5J.getText().equals("A")) {
                aristaCubo1 = graphG1.insertEdge(parent, null, "1", A, A, "endArrow=none;");
            }

            graphG1.getModel().setStyle(aristaCubo1, "strokeColor=#FFFFFF;endArrow=none;fontColor=#FFFFFF");

            // Cubo 2
            if (Cubo2C6J.getText().equals("R") && Cubo2C5J.getText().equals("R")) {
                aristaCubo2 = graphG1.insertEdge(parent, null, "2", R, R, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("R") && Cubo2C5J.getText().equals("B")) {
                aristaCubo2 = graphG1.insertEdge(parent, null, "2", R, B, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("R") && Cubo2C5J.getText().equals("V")) {
                aristaCubo2 = graphG1.insertEdge(parent, null, "2", R, V, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("R") && Cubo2C5J.getText().equals("A")) {
                aristaCubo2 = graphG1.insertEdge(parent, null, "2", R, A, "endArrow=none;");
            }

            if (Cubo2C6J.getText().equals("B") && Cubo2C5J.getText().equals("R")) {
                aristaCubo2 = graphG1.insertEdge(parent, null, "2", B, R, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("B") && Cubo2C5J.getText().equals("B")) {
                aristaCubo2 = graphG1.insertEdge(parent, null, "2", B, B, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("B") && Cubo2C5J.getText().equals("V")) {
                aristaCubo2 = graphG1.insertEdge(parent, null, "2", B, V, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("B") && Cubo2C5J.getText().equals("A")) {
                aristaCubo2 = graphG1.insertEdge(parent, null, "2", B, A, "endArrow=none;");
            }

            if (Cubo2C6J.getText().equals("V") && Cubo2C5J.getText().equals("R")) {
                aristaCubo2 = graphG1.insertEdge(parent, null, "2", V, R, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("V") && Cubo2C5J.getText().equals("B")) {
                aristaCubo2 = graphG1.insertEdge(parent, null, "2", V, B, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("V") && Cubo2C5J.getText().equals("V")) {
                aristaCubo2 = graphG1.insertEdge(parent, null, "2", V, V, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("V") && Cubo2C5J.getText().equals("A")) {
                aristaCubo2 = graphG1.insertEdge(parent, null, "2", V, A, "endArrow=none;");
            }

            if (Cubo2C6J.getText().equals("A") && Cubo2C5J.getText().equals("R")) {
                aristaCubo2 = graphG1.insertEdge(parent, null, "2", A, R, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("A") && Cubo2C5J.getText().equals("B")) {
                aristaCubo2 = graphG1.insertEdge(parent, null, "2", A, B, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("A") && Cubo2C5J.getText().equals("V")) {
                aristaCubo2 = graphG1.insertEdge(parent, null, "2", A, V, "endArrow=none;");
            } else if (Cubo2C6J.getText().equals("A") && Cubo2C5J.getText().equals("A")) {
                aristaCubo2 = graphG1.insertEdge(parent, null, "2", A, A, "endArrow=none;");
            }

            graphG1.getModel().setStyle(aristaCubo2, "strokeColor=#FF0000;endArrow=none;fontColor=#FF0000");

            // Cubo 3
            if (Cubo3C6J.getText().equals("R") && Cubo3C5J.getText().equals("R")) {
                aristaCubo3 = graphG1.insertEdge(parent, null, "3", R, R, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("R") && Cubo3C5J.getText().equals("B")) {
                aristaCubo3 = graphG1.insertEdge(parent, null, "3", R, B, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("R") && Cubo3C5J.getText().equals("V")) {
                aristaCubo3 = graphG1.insertEdge(parent, null, "3", R, V, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("R") && Cubo3C5J.getText().equals("A")) {
                aristaCubo3 = graphG1.insertEdge(parent, null, "3", R, A, "endArrow=none;");
            }

            if (Cubo3C6J.getText().equals("B") && Cubo3C5J.getText().equals("R")) {
                aristaCubo3 = graphG1.insertEdge(parent, null, "3", B, R, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("B") && Cubo3C5J.getText().equals("B")) {
                aristaCubo3 = graphG1.insertEdge(parent, null, "3", B, B, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("B") && Cubo3C5J.getText().equals("V")) {
                aristaCubo3 = graphG1.insertEdge(parent, null, "3", B, V, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("B") && Cubo3C5J.getText().equals("A")) {
                aristaCubo3 = graphG1.insertEdge(parent, null, "3", B, A, "endArrow=none;");
            }

            if (Cubo3C6J.getText().equals("V") && Cubo3C5J.getText().equals("R")) {
                aristaCubo3 = graphG1.insertEdge(parent, null, "3", V, R, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("V") && Cubo3C5J.getText().equals("B")) {
                aristaCubo3 = graphG1.insertEdge(parent, null, "3", V, B, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("V") && Cubo3C5J.getText().equals("V")) {
                aristaCubo3 = graphG1.insertEdge(parent, null, "3", V, V, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("V") && Cubo3C5J.getText().equals("A")) {
                aristaCubo3 = graphG1.insertEdge(parent, null, "3", V, A, "endArrow=none;");
            }

            if (Cubo3C6J.getText().equals("A") && Cubo3C5J.getText().equals("R")) {
                aristaCubo3 = graphG1.insertEdge(parent, null, "3", A, R, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("A") && Cubo3C5J.getText().equals("B")) {
                aristaCubo3 = graphG1.insertEdge(parent, null, "3", A, B, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("A") && Cubo3C5J.getText().equals("V")) {
                aristaCubo3 = graphG1.insertEdge(parent, null, "3", A, V, "endArrow=none;");
            } else if (Cubo3C6J.getText().equals("A") && Cubo3C5J.getText().equals("A")) {
                aristaCubo3 = graphG1.insertEdge(parent, null, "3", A, A, "endArrow=none;");
            }

            graphG1.getModel().setStyle(aristaCubo3, "strokeColor=#00FF00;endArrow=none;fontColor=#00FF00");

            // Cubo 4
            if (Cubo4C6J.getText().equals("R") && Cubo4C5J.getText().equals("R")) {
                aristaCubo4 = graphG1.insertEdge(parent, null, "4", R, R, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("R") && Cubo4C5J.getText().equals("B")) {
                aristaCubo4 = graphG1.insertEdge(parent, null, "4", R, B, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("R") && Cubo4C5J.getText().equals("V")) {
                aristaCubo4 = graphG1.insertEdge(parent, null, "4", R, V, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("R") && Cubo4C5J.getText().equals("A")) {
                aristaCubo4 = graphG1.insertEdge(parent, null, "4", R, A, "endArrow=none;");
            }

            if (Cubo4C6J.getText().equals("B") && Cubo4C5J.getText().equals("R")) {
                aristaCubo4 = graphG1.insertEdge(parent, null, "4", B, R, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("B") && Cubo4C5J.getText().equals("B")) {
                aristaCubo4 = graphG1.insertEdge(parent, null, "4", B, B, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("B") && Cubo4C5J.getText().equals("V")) {
                aristaCubo4 = graphG1.insertEdge(parent, null, "4", B, V, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("B") && Cubo4C5J.getText().equals("A")) {
                aristaCubo4 = graphG1.insertEdge(parent, null, "4", B, A, "endArrow=none;");
            }

            if (Cubo4C6J.getText().equals("V") && Cubo4C5J.getText().equals("R")) {
                aristaCubo4 = graphG1.insertEdge(parent, null, "4", V, R, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("V") && Cubo4C5J.getText().equals("B")) {
                aristaCubo4 = graphG1.insertEdge(parent, null, "4", V, B, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("V") && Cubo4C5J.getText().equals("V")) {
                aristaCubo4 = graphG1.insertEdge(parent, null, "4", V, V, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("V") && Cubo4C5J.getText().equals("A")) {
                aristaCubo4 = graphG1.insertEdge(parent, null, "4", V, A, "endArrow=none;");
            }

            if (Cubo4C6J.getText().equals("A") && Cubo4C5J.getText().equals("R")) {
                aristaCubo4 = graphG1.insertEdge(parent, null, "4", A, R, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("A") && Cubo4C5J.getText().equals("B")) {
                aristaCubo4 = graphG1.insertEdge(parent, null, "4", A, B, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("A") && Cubo4C5J.getText().equals("V")) {
                aristaCubo4 = graphG1.insertEdge(parent, null, "4", A, V, "endArrow=none;");
            } else if (Cubo4C6J.getText().equals("A") && Cubo4C5J.getText().equals("A")) {
                aristaCubo4 = graphG1.insertEdge(parent, null, "4", A, A, "endArrow=none;");
            }

            graphG1.getModel().setStyle(aristaCubo4, "strokeColor=#0000FF;endArrow=none;fontColor=#0000FF");

            layout.execute(graphG1.getDefaultParent());
        } finally {
            graphG1.getModel().endUpdate();
        }

        mxGraphComponent graphComponent = new mxGraphComponent(graphG1);

        grafoG1.removeAll();
        grafoG1.add(graphComponent);
        graphComponent.refresh();
        grafoG1.repaint();

        System.out.println("grafo G1 actualizado");
    }

    public void grafoG2() {
        // Grafo G1 - Horizontal
        mxGraph graphG2 = new mxGraph();
        Object parent = graphG2.getDefaultParent();

        graphG2.getModel().beginUpdate();

        mxParallelEdgeLayout layout = new mxParallelEdgeLayout(graphG2);

        try {

            Object R = graphG2.insertVertex(parent, null, "R", 20, 20, 20, 20, "fontColor=#000000");
            Object B = graphG2.insertVertex(parent, null, "B", 115, 20, 20, 20, "fontColor=#000000");
            Object V = graphG2.insertVertex(parent, null, "V", 20, 120, 20, 20, "fontColor=#000000");
            Object A = graphG2.insertVertex(parent, null, "A", 115, 120, 20, 20, "fontColor=#000000");

            Object aristaCubo1 = null;
            Object aristaCubo2 = null;
            Object aristaCubo3 = null;
            Object aristaCubo4 = null;

            // Cubo 1
            if (Cubo1C3J.getText().equals("R") && Cubo1C4J.getText().equals("R")) {
                aristaCubo1 = graphG2.insertEdge(parent, null, "1", R, R, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("R") && Cubo1C4J.getText().equals("B")) {
                aristaCubo1 = graphG2.insertEdge(parent, null, "1", R, B, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("R") && Cubo1C4J.getText().equals("V")) {
                aristaCubo1 = graphG2.insertEdge(parent, null, "1", R, V, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("R") && Cubo1C4J.getText().equals("A")) {
                aristaCubo1 = graphG2.insertEdge(parent, null, "1", R, A, "endArrow=none;");
            }

            if (Cubo1C3J.getText().equals("B") && Cubo1C4J.getText().equals("R")) {
                aristaCubo1 = graphG2.insertEdge(parent, null, "1", B, R, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("B") && Cubo1C4J.getText().equals("B")) {
                aristaCubo1 = graphG2.insertEdge(parent, null, "1", B, B, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("B") && Cubo1C4J.getText().equals("V")) {
                aristaCubo1 = graphG2.insertEdge(parent, null, "1", B, V, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("B") && Cubo1C4J.getText().equals("A")) {
                aristaCubo1 = graphG2.insertEdge(parent, null, "1", B, A, "endArrow=none;");
            }

            if (Cubo1C3J.getText().equals("V") && Cubo1C4J.getText().equals("R")) {
                aristaCubo1 = graphG2.insertEdge(parent, null, "1", V, R, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("V") && Cubo1C4J.getText().equals("B")) {
                aristaCubo1 = graphG2.insertEdge(parent, null, "1", V, B, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("V") && Cubo1C4J.getText().equals("V")) {
                aristaCubo1 = graphG2.insertEdge(parent, null, "1", V, V, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("V") && Cubo1C4J.getText().equals("A")) {
                aristaCubo1 = graphG2.insertEdge(parent, null, "1", V, A, "endArrow=none;");
            }

            if (Cubo1C3J.getText().equals("A") && Cubo1C4J.getText().equals("R")) {
                aristaCubo1 = graphG2.insertEdge(parent, null, "1", A, R, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("A") && Cubo1C4J.getText().equals("B")) {
                aristaCubo1 = graphG2.insertEdge(parent, null, "1", A, B, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("A") && Cubo1C4J.getText().equals("V")) {
                aristaCubo1 = graphG2.insertEdge(parent, null, "1", A, V, "endArrow=none;");
            } else if (Cubo1C3J.getText().equals("A") && Cubo1C4J.getText().equals("A")) {
                aristaCubo1 = graphG2.insertEdge(parent, null, "1", A, A, "endArrow=none;");
            }

            graphG2.getModel().setStyle(aristaCubo1, "strokeColor=#FFFFFF;endArrow=none;fontColor=#FFFFFF");

            // Cubo 2
            if (Cubo2C3J.getText().equals("R") && Cubo2C4J.getText().equals("R")) {
                aristaCubo2 = graphG2.insertEdge(parent, null, "2", R, R, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("R") && Cubo2C4J.getText().equals("B")) {
                aristaCubo2 = graphG2.insertEdge(parent, null, "2", R, B, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("R") && Cubo2C4J.getText().equals("V")) {
                aristaCubo2 = graphG2.insertEdge(parent, null, "2", R, V, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("R") && Cubo2C4J.getText().equals("A")) {
                aristaCubo2 = graphG2.insertEdge(parent, null, "2", R, A, "endArrow=none;");
            }

            if (Cubo2C3J.getText().equals("B") && Cubo2C4J.getText().equals("R")) {
                aristaCubo2 = graphG2.insertEdge(parent, null, "2", B, R, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("B") && Cubo2C4J.getText().equals("B")) {
                aristaCubo2 = graphG2.insertEdge(parent, null, "2", B, B, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("B") && Cubo2C4J.getText().equals("V")) {
                aristaCubo2 = graphG2.insertEdge(parent, null, "2", B, V, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("B") && Cubo2C4J.getText().equals("A")) {
                aristaCubo2 = graphG2.insertEdge(parent, null, "2", B, A, "endArrow=none;");
            }

            if (Cubo2C3J.getText().equals("V") && Cubo2C4J.getText().equals("R")) {
                aristaCubo2 = graphG2.insertEdge(parent, null, "2", V, R, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("V") && Cubo2C4J.getText().equals("B")) {
                aristaCubo2 = graphG2.insertEdge(parent, null, "2", V, B, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("V") && Cubo2C4J.getText().equals("V")) {
                aristaCubo2 = graphG2.insertEdge(parent, null, "2", V, V, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("V") && Cubo2C4J.getText().equals("A")) {
                aristaCubo2 = graphG2.insertEdge(parent, null, "2", V, A, "endArrow=none;");
            }

            if (Cubo2C3J.getText().equals("A") && Cubo2C4J.getText().equals("R")) {
                aristaCubo2 = graphG2.insertEdge(parent, null, "2", A, R, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("A") && Cubo2C4J.getText().equals("B")) {
                aristaCubo2 = graphG2.insertEdge(parent, null, "2", A, B, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("A") && Cubo2C4J.getText().equals("V")) {
                aristaCubo2 = graphG2.insertEdge(parent, null, "2", A, V, "endArrow=none;");
            } else if (Cubo2C3J.getText().equals("A") && Cubo2C4J.getText().equals("A")) {
                aristaCubo2 = graphG2.insertEdge(parent, null, "2", A, A, "endArrow=none;");
            }

            graphG2.getModel().setStyle(aristaCubo2, "strokeColor=#FF0000;endArrow=none;fontColor=#FF0000");

            // Cubo 3
            if (Cubo3C3J.getText().equals("R") && Cubo3C4J.getText().equals("R")) {
                aristaCubo3 = graphG2.insertEdge(parent, null, "3", R, R, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("R") && Cubo3C4J.getText().equals("B")) {
                aristaCubo3 = graphG2.insertEdge(parent, null, "3", R, B, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("R") && Cubo3C4J.getText().equals("V")) {
                aristaCubo3 = graphG2.insertEdge(parent, null, "3", R, V, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("R") && Cubo3C4J.getText().equals("A")) {
                aristaCubo3 = graphG2.insertEdge(parent, null, "3", R, A, "endArrow=none;");
            }

            if (Cubo3C3J.getText().equals("B") && Cubo3C4J.getText().equals("R")) {
                aristaCubo3 = graphG2.insertEdge(parent, null, "3", B, R, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("B") && Cubo3C4J.getText().equals("B")) {
                aristaCubo3 = graphG2.insertEdge(parent, null, "3", B, B, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("B") && Cubo3C4J.getText().equals("V")) {
                aristaCubo3 = graphG2.insertEdge(parent, null, "3", B, V, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("B") && Cubo3C4J.getText().equals("A")) {
                aristaCubo3 = graphG2.insertEdge(parent, null, "3", B, A, "endArrow=none;");
            }

            if (Cubo3C3J.getText().equals("V") && Cubo3C4J.getText().equals("R")) {
                aristaCubo3 = graphG2.insertEdge(parent, null, "3", V, R, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("V") && Cubo3C4J.getText().equals("B")) {
                aristaCubo3 = graphG2.insertEdge(parent, null, "3", V, B, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("V") && Cubo3C4J.getText().equals("V")) {
                aristaCubo3 = graphG2.insertEdge(parent, null, "3", V, V, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("V") && Cubo3C4J.getText().equals("A")) {
                aristaCubo3 = graphG2.insertEdge(parent, null, "3", V, A, "endArrow=none;");
            }

            if (Cubo3C3J.getText().equals("A") && Cubo3C4J.getText().equals("R")) {
                aristaCubo3 = graphG2.insertEdge(parent, null, "3", A, R, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("A") && Cubo3C4J.getText().equals("B")) {
                aristaCubo3 = graphG2.insertEdge(parent, null, "3", A, B, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("A") && Cubo3C4J.getText().equals("V")) {
                aristaCubo3 = graphG2.insertEdge(parent, null, "3", A, V, "endArrow=none;");
            } else if (Cubo3C3J.getText().equals("A") && Cubo3C4J.getText().equals("A")) {
                aristaCubo3 = graphG2.insertEdge(parent, null, "3", A, A, "endArrow=none;");
            }

            graphG2.getModel().setStyle(aristaCubo3, "strokeColor=#00FF00;endArrow=none;fontColor=#00FF00");

            // Cubo 4
            if (Cubo4C3J.getText().equals("R") && Cubo4C4J.getText().equals("R")) {
                aristaCubo4 = graphG2.insertEdge(parent, null, "4", R, R, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("R") && Cubo4C4J.getText().equals("B")) {
                aristaCubo4 = graphG2.insertEdge(parent, null, "4", R, B, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("R") && Cubo4C4J.getText().equals("V")) {
                aristaCubo4 = graphG2.insertEdge(parent, null, "4", R, V, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("R") && Cubo4C4J.getText().equals("A")) {
                aristaCubo4 = graphG2.insertEdge(parent, null, "4", R, A, "endArrow=none;");
            }

            if (Cubo4C3J.getText().equals("B") && Cubo4C4J.getText().equals("R")) {
                aristaCubo4 = graphG2.insertEdge(parent, null, "4", B, R, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("B") && Cubo4C4J.getText().equals("B")) {
                aristaCubo4 = graphG2.insertEdge(parent, null, "4", B, B, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("B") && Cubo4C4J.getText().equals("V")) {
                aristaCubo4 = graphG2.insertEdge(parent, null, "4", B, V, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("B") && Cubo4C4J.getText().equals("A")) {
                aristaCubo4 = graphG2.insertEdge(parent, null, "4", B, A, "endArrow=none;");
            }

            if (Cubo4C3J.getText().equals("V") && Cubo4C4J.getText().equals("R")) {
                aristaCubo4 = graphG2.insertEdge(parent, null, "4", V, R, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("V") && Cubo4C4J.getText().equals("B")) {
                aristaCubo4 = graphG2.insertEdge(parent, null, "4", V, B, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("V") && Cubo4C4J.getText().equals("V")) {
                aristaCubo4 = graphG2.insertEdge(parent, null, "4", V, V, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("V") && Cubo4C4J.getText().equals("A")) {
                aristaCubo4 = graphG2.insertEdge(parent, null, "4", V, A, "endArrow=none;");
            }

            if (Cubo4C3J.getText().equals("A") && Cubo4C4J.getText().equals("R")) {
                aristaCubo4 = graphG2.insertEdge(parent, null, "4", A, R, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("A") && Cubo4C4J.getText().equals("B")) {
                aristaCubo4 = graphG2.insertEdge(parent, null, "4", A, B, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("A") && Cubo4C4J.getText().equals("V")) {
                aristaCubo4 = graphG2.insertEdge(parent, null, "4", A, V, "endArrow=none;");
            } else if (Cubo4C3J.getText().equals("A") && Cubo4C4J.getText().equals("A")) {
                aristaCubo4 = graphG2.insertEdge(parent, null, "4", A, A, "endArrow=none;");
            }

            graphG2.getModel().setStyle(aristaCubo4, "strokeColor=#0000FF;endArrow=none;fontColor=#0000FF");

        } finally {
            graphG2.getModel().endUpdate();
        }

        mxGraphComponent graphComponent = new mxGraphComponent(graphG2);
        grafoG2.removeAll();
        grafoG2.add(graphComponent);

        layout.execute(graphG2.getDefaultParent());
        System.out.println("grafo G2 actualizado");
    }

    private void derechaCubo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derechaCubo1ActionPerformed
        // TODO add your handling code here:
        String Cubo1C5N = Cubo1C5J.getText();
        Color Cubo1C5B = Cubo1C5J.getBackground();
        Cubo1C5J.setText(Cubo1C1J.getText());
        Cubo1C5J.setBackground(Cubo1C1J.getBackground());

        String Cubo1C2N = Cubo1C2J.getText();
        Color Cubo1C2B = Cubo1C2J.getBackground();
        Cubo1C2J.setText(Cubo1C5N);
        Cubo1C2J.setBackground(Cubo1C5B);

        String Cubo1C6N = Cubo1C6J.getText();
        Color Cubo1C6B = Cubo1C6J.getBackground();
        Cubo1C6J.setText(Cubo1C2N);
        Cubo1C6J.setBackground(Cubo1C2B);

        Cubo1C1J.setText(Cubo1C6N);
        Cubo1C1J.setBackground(Cubo1C6B);

        actualTorre();

    }//GEN-LAST:event_derechaCubo1ActionPerformed

    private void abajoCubo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abajoCubo1ActionPerformed
        // TODO add your handling code here:
        String Cubo1C3N = Cubo1C3J.getText();
        Color Cubo1C3B = Cubo1C3J.getBackground();
        Cubo1C3J.setText(Cubo1C2J.getText());
        Cubo1C3J.setBackground(Cubo1C2J.getBackground());

        String Cubo1C1N = Cubo1C1J.getText();
        Color Cubo1C1B = Cubo1C1J.getBackground();
        Cubo1C1J.setText(Cubo1C3N);
        Cubo1C1J.setBackground(Cubo1C3B);

        String Cubo1C4N = Cubo1C4J.getText();
        Color Cubo1C4B = Cubo1C4J.getBackground();
        Cubo1C4J.setText(Cubo1C1N);
        Cubo1C4J.setBackground(Cubo1C1B);

        Cubo1C2J.setText(Cubo1C4N);
        Cubo1C2J.setBackground(Cubo1C4B);

        actualTorre();


    }//GEN-LAST:event_abajoCubo1ActionPerformed

    private void horarioCubo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioCubo1ActionPerformed
        // TODO add your handling code here:
        String Cubo1C3N = Cubo1C3J.getText();
        Color Cubo1C3B = Cubo1C3J.getBackground();
        Cubo1C3J.setText(Cubo1C6J.getText());
        Cubo1C3J.setBackground(Cubo1C6J.getBackground());

        String Cubo1C5N = Cubo1C5J.getText();
        Color Cubo1C5B = Cubo1C5J.getBackground();
        Cubo1C5J.setText(Cubo1C3N);
        Cubo1C5J.setBackground(Cubo1C3B);

        String Cubo1C4N = Cubo1C4J.getText();
        Color Cubo1C4B = Cubo1C4J.getBackground();
        Cubo1C4J.setText(Cubo1C5N);
        Cubo1C4J.setBackground(Cubo1C5B);

        Cubo1C6J.setText(Cubo1C4N);
        Cubo1C6J.setBackground(Cubo1C4B);

        actualTorre();
    }//GEN-LAST:event_horarioCubo1ActionPerformed

    private void antihorarioCubo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antihorarioCubo1ActionPerformed
        // TODO add your handling code here:
        String Cubo1C3N = Cubo1C3J.getText();
        Color Cubo1C3B = Cubo1C3J.getBackground();
        Cubo1C3J.setText(Cubo1C5J.getText());
        Cubo1C3J.setBackground(Cubo1C5J.getBackground());

        String Cubo1C6N = Cubo1C6J.getText();
        Color Cubo1C6B = Cubo1C6J.getBackground();
        Cubo1C6J.setText(Cubo1C3N);
        Cubo1C6J.setBackground(Cubo1C3B);

        String Cubo1C4N = Cubo1C4J.getText();
        Color Cubo1C4B = Cubo1C4J.getBackground();
        Cubo1C4J.setText(Cubo1C6N);
        Cubo1C4J.setBackground(Cubo1C6B);

        Cubo1C5J.setText(Cubo1C4N);
        Cubo1C5J.setBackground(Cubo1C4B);

        actualTorre();

    }//GEN-LAST:event_antihorarioCubo1ActionPerformed

    private void izquierdaCubo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izquierdaCubo2ActionPerformed
        // TODO add your handling code here:
        String Cubo2C5N = Cubo2C5J.getText();
        Color Cubo2C5B = Cubo2C5J.getBackground();
        Cubo2C5J.setText(Cubo2C2J.getText());
        Cubo2C5J.setBackground(Cubo2C2J.getBackground());

        String Cubo2C1N = Cubo2C1J.getText();
        Color Cubo2C1B = Cubo2C1J.getBackground();
        Cubo2C1J.setText(Cubo2C5N);
        Cubo2C1J.setBackground(Cubo2C5B);

        String Cubo2C6N = Cubo2C6J.getText();
        Color Cubo2C6B = Cubo2C6J.getBackground();
        Cubo2C6J.setText(Cubo2C1N);
        Cubo2C6J.setBackground(Cubo2C1B);

        Cubo2C2J.setText(Cubo2C6N);
        Cubo2C2J.setBackground(Cubo2C6B);

        actualTorre();
    }//GEN-LAST:event_izquierdaCubo2ActionPerformed

    private void arribaCubo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaCubo2ActionPerformed
        // TODO add your handling code here:
        String Cubo2C3N = Cubo2C3J.getText();
        Color Cubo2C3B = Cubo2C3J.getBackground();
        Cubo2C3J.setText(Cubo2C1J.getText());
        Cubo2C3J.setBackground(Cubo2C1J.getBackground());

        String Cubo2C2N = Cubo2C2J.getText();
        Color Cubo2C2B = Cubo2C2J.getBackground();
        Cubo2C2J.setText(Cubo2C3N);
        Cubo2C2J.setBackground(Cubo2C3B);

        String Cubo2C4N = Cubo2C4J.getText();
        Color Cubo2C4B = Cubo2C4J.getBackground();
        Cubo2C4J.setText(Cubo2C2N);
        Cubo2C4J.setBackground(Cubo2C2B);

        Cubo2C1J.setText(Cubo2C4N);
        Cubo2C1J.setBackground(Cubo2C4B);

        actualTorre();
    }//GEN-LAST:event_arribaCubo2ActionPerformed

    private void derechaCubo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derechaCubo2ActionPerformed
        // TODO add your handling code here:
        String Cubo2C5N = Cubo2C5J.getText();
        Color Cubo2C5B = Cubo2C5J.getBackground();
        Cubo2C5J.setText(Cubo2C1J.getText());
        Cubo2C5J.setBackground(Cubo2C1J.getBackground());

        String Cubo2C2N = Cubo2C2J.getText();
        Color Cubo2C2B = Cubo2C2J.getBackground();
        Cubo2C2J.setText(Cubo2C5N);
        Cubo2C2J.setBackground(Cubo2C5B);

        String Cubo2C6N = Cubo2C6J.getText();
        Color Cubo2C6B = Cubo2C6J.getBackground();
        Cubo2C6J.setText(Cubo2C2N);
        Cubo2C6J.setBackground(Cubo2C2B);

        Cubo2C1J.setText(Cubo2C6N);
        Cubo2C1J.setBackground(Cubo2C6B);

        actualTorre();
    }//GEN-LAST:event_derechaCubo2ActionPerformed

    private void abajoCubo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abajoCubo2ActionPerformed
        // TODO add your handling code here:
        String Cubo2C3N = Cubo2C3J.getText();
        Color Cubo2C3B = Cubo2C3J.getBackground();
        Cubo2C3J.setText(Cubo2C2J.getText());
        Cubo2C3J.setBackground(Cubo2C2J.getBackground());

        String Cubo2C1N = Cubo2C1J.getText();
        Color Cubo2C1B = Cubo2C1J.getBackground();
        Cubo2C1J.setText(Cubo2C3N);
        Cubo2C1J.setBackground(Cubo2C3B);

        String Cubo2C4N = Cubo2C4J.getText();
        Color Cubo2C4B = Cubo2C4J.getBackground();
        Cubo2C4J.setText(Cubo2C1N);
        Cubo2C4J.setBackground(Cubo2C1B);

        Cubo2C2J.setText(Cubo2C4N);
        Cubo2C2J.setBackground(Cubo2C4B);

        actualTorre();
    }//GEN-LAST:event_abajoCubo2ActionPerformed

    private void horarioCubo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioCubo2ActionPerformed
        // TODO add your handling code here:
        String Cubo2C3N = Cubo2C3J.getText();
        Color Cubo2C3B = Cubo2C3J.getBackground();
        Cubo2C3J.setText(Cubo2C6J.getText());
        Cubo2C3J.setBackground(Cubo2C6J.getBackground());

        String Cubo2C5N = Cubo2C5J.getText();
        Color Cubo2C5B = Cubo2C5J.getBackground();
        Cubo2C5J.setText(Cubo2C3N);
        Cubo2C5J.setBackground(Cubo2C3B);

        String Cubo2C4N = Cubo2C4J.getText();
        Color Cubo2C4B = Cubo2C4J.getBackground();
        Cubo2C4J.setText(Cubo2C5N);
        Cubo2C4J.setBackground(Cubo2C5B);

        Cubo2C6J.setText(Cubo2C4N);
        Cubo2C6J.setBackground(Cubo2C4B);

        actualTorre();
    }//GEN-LAST:event_horarioCubo2ActionPerformed

    private void antihorarioCubo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antihorarioCubo2ActionPerformed
        // TODO add your handling code here:
        String Cubo2C3N = Cubo2C3J.getText();
        Color Cubo2C3B = Cubo2C3J.getBackground();
        Cubo2C3J.setText(Cubo2C5J.getText());
        Cubo2C3J.setBackground(Cubo2C5J.getBackground());

        String Cubo2C6N = Cubo2C6J.getText();
        Color Cubo2C6B = Cubo2C6J.getBackground();
        Cubo2C6J.setText(Cubo2C3N);
        Cubo2C6J.setBackground(Cubo2C3B);

        String Cubo2C4N = Cubo2C4J.getText();
        Color Cubo2C4B = Cubo2C4J.getBackground();
        Cubo2C4J.setText(Cubo2C6N);
        Cubo2C4J.setBackground(Cubo2C6B);

        Cubo2C5J.setText(Cubo2C4N);
        Cubo2C5J.setBackground(Cubo2C4B);

        actualTorre();
    }//GEN-LAST:event_antihorarioCubo2ActionPerformed

    private void izquierdaCubo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izquierdaCubo3ActionPerformed
        // TODO add your handling code here:
        String Cubo3C5N = Cubo3C5J.getText();
        Color Cubo3C5B = Cubo3C5J.getBackground();
        Cubo3C5J.setText(Cubo3C2J.getText());
        Cubo3C5J.setBackground(Cubo3C2J.getBackground());

        String Cubo3C1N = Cubo3C1J.getText();
        Color Cubo3C1B = Cubo3C1J.getBackground();
        Cubo3C1J.setText(Cubo3C5N);
        Cubo3C1J.setBackground(Cubo3C5B);

        String Cubo3C6N = Cubo3C6J.getText();
        Color Cubo3C6B = Cubo3C6J.getBackground();
        Cubo3C6J.setText(Cubo3C1N);
        Cubo3C6J.setBackground(Cubo3C1B);

        Cubo3C2J.setText(Cubo3C6N);
        Cubo3C2J.setBackground(Cubo3C6B);

        actualTorre();
    }//GEN-LAST:event_izquierdaCubo3ActionPerformed

    private void arribaCubo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaCubo3ActionPerformed
        // TODO add your handling code here:
        String Cubo3C3N = Cubo3C3J.getText();
        Color Cubo3C3B = Cubo3C3J.getBackground();
        Cubo3C3J.setText(Cubo3C1J.getText());
        Cubo3C3J.setBackground(Cubo3C1J.getBackground());

        String Cubo3C2N = Cubo3C2J.getText();
        Color Cubo3C2B = Cubo3C2J.getBackground();
        Cubo3C2J.setText(Cubo3C3N);
        Cubo3C2J.setBackground(Cubo3C3B);

        String Cubo3C4N = Cubo3C4J.getText();
        Color Cubo3C4B = Cubo3C4J.getBackground();
        Cubo3C4J.setText(Cubo3C2N);
        Cubo3C4J.setBackground(Cubo3C2B);

        Cubo3C1J.setText(Cubo3C4N);
        Cubo3C1J.setBackground(Cubo3C4B);

        actualTorre();
    }//GEN-LAST:event_arribaCubo3ActionPerformed

    private void derechaCubo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derechaCubo3ActionPerformed
        // TODO add your handling code here:
        String Cubo3C5N = Cubo3C5J.getText();
        Color Cubo3C5B = Cubo3C5J.getBackground();
        Cubo3C5J.setText(Cubo3C1J.getText());
        Cubo3C5J.setBackground(Cubo3C1J.getBackground());

        String Cubo3C2N = Cubo3C2J.getText();
        Color Cubo3C2B = Cubo3C2J.getBackground();
        Cubo3C2J.setText(Cubo3C5N);
        Cubo3C2J.setBackground(Cubo3C5B);

        String Cubo3C6N = Cubo3C6J.getText();
        Color Cubo3C6B = Cubo3C6J.getBackground();
        Cubo3C6J.setText(Cubo3C2N);
        Cubo3C6J.setBackground(Cubo3C2B);

        Cubo3C1J.setText(Cubo3C6N);
        Cubo3C1J.setBackground(Cubo3C6B);

        actualTorre();
    }//GEN-LAST:event_derechaCubo3ActionPerformed

    private void abajoCubo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abajoCubo3ActionPerformed
        // TODO add your handling code here:
        String Cubo3C3N = Cubo3C3J.getText();
        Color Cubo3C3B = Cubo3C3J.getBackground();
        Cubo3C3J.setText(Cubo3C2J.getText());
        Cubo3C3J.setBackground(Cubo3C2J.getBackground());

        String Cubo3C1N = Cubo3C1J.getText();
        Color Cubo3C1B = Cubo3C1J.getBackground();
        Cubo3C1J.setText(Cubo3C3N);
        Cubo3C1J.setBackground(Cubo3C3B);

        String Cubo3C4N = Cubo3C4J.getText();
        Color Cubo3C4B = Cubo3C4J.getBackground();
        Cubo3C4J.setText(Cubo3C1N);
        Cubo3C4J.setBackground(Cubo3C1B);

        Cubo3C2J.setText(Cubo3C4N);
        Cubo3C2J.setBackground(Cubo3C4B);

        actualTorre();
    }//GEN-LAST:event_abajoCubo3ActionPerformed

    private void horarioCubo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioCubo3ActionPerformed
        // TODO add your handling code here:
        String Cubo3C3N = Cubo3C3J.getText();
        Color Cubo3C3B = Cubo3C3J.getBackground();
        Cubo3C3J.setText(Cubo3C6J.getText());
        Cubo3C3J.setBackground(Cubo3C6J.getBackground());

        String Cubo3C5N = Cubo3C5J.getText();
        Color Cubo3C5B = Cubo3C5J.getBackground();
        Cubo3C5J.setText(Cubo3C3N);
        Cubo3C5J.setBackground(Cubo3C3B);

        String Cubo3C4N = Cubo3C4J.getText();
        Color Cubo3C4B = Cubo3C4J.getBackground();
        Cubo3C4J.setText(Cubo3C5N);
        Cubo3C4J.setBackground(Cubo3C5B);

        Cubo3C6J.setText(Cubo3C4N);
        Cubo3C6J.setBackground(Cubo3C4B);

        actualTorre();
    }//GEN-LAST:event_horarioCubo3ActionPerformed

    private void antihorarioCubo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antihorarioCubo3ActionPerformed
        // TODO add your handling code here:
        String Cubo3C3N = Cubo3C3J.getText();
        Color Cubo3C3B = Cubo3C3J.getBackground();
        Cubo3C3J.setText(Cubo3C5J.getText());
        Cubo3C3J.setBackground(Cubo3C5J.getBackground());

        String Cubo3C6N = Cubo3C6J.getText();
        Color Cubo3C6B = Cubo3C6J.getBackground();
        Cubo3C6J.setText(Cubo3C3N);
        Cubo3C6J.setBackground(Cubo3C3B);

        String Cubo3C4N = Cubo3C4J.getText();
        Color Cubo3C4B = Cubo3C4J.getBackground();
        Cubo3C4J.setText(Cubo3C6N);
        Cubo3C4J.setBackground(Cubo3C6B);

        Cubo3C5J.setText(Cubo3C4N);
        Cubo3C5J.setBackground(Cubo3C4B);

        actualTorre();
    }//GEN-LAST:event_antihorarioCubo3ActionPerformed

    private void izquierdaCubo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izquierdaCubo4ActionPerformed
        // TODO add your handling code here:
        String Cubo4C5N = Cubo4C5J.getText();
        Color Cubo4C5B = Cubo4C5J.getBackground();
        Cubo4C5J.setText(Cubo4C2J.getText());
        Cubo4C5J.setBackground(Cubo4C2J.getBackground());

        String Cubo4C1N = Cubo4C1J.getText();
        Color Cubo4C1B = Cubo4C1J.getBackground();
        Cubo4C1J.setText(Cubo4C5N);
        Cubo4C1J.setBackground(Cubo4C5B);

        String Cubo4C6N = Cubo4C6J.getText();
        Color Cubo4C6B = Cubo4C6J.getBackground();
        Cubo4C6J.setText(Cubo4C1N);
        Cubo4C6J.setBackground(Cubo4C1B);

        Cubo4C2J.setText(Cubo4C6N);
        Cubo4C2J.setBackground(Cubo4C6B);

        actualTorre();
    }//GEN-LAST:event_izquierdaCubo4ActionPerformed

    private void arribaCubo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaCubo4ActionPerformed
        // TODO add your handling code here:
        String Cubo4C3N = Cubo4C3J.getText();
        Color Cubo4C3B = Cubo4C3J.getBackground();
        Cubo4C3J.setText(Cubo4C1J.getText());
        Cubo4C3J.setBackground(Cubo4C1J.getBackground());

        String Cubo4C2N = Cubo4C2J.getText();
        Color Cubo4C2B = Cubo4C2J.getBackground();
        Cubo4C2J.setText(Cubo4C3N);
        Cubo4C2J.setBackground(Cubo4C3B);

        String Cubo4C4N = Cubo4C4J.getText();
        Color Cubo4C4B = Cubo4C4J.getBackground();
        Cubo4C4J.setText(Cubo4C2N);
        Cubo4C4J.setBackground(Cubo4C2B);

        Cubo4C1J.setText(Cubo4C4N);
        Cubo4C1J.setBackground(Cubo4C4B);

        actualTorre();
    }//GEN-LAST:event_arribaCubo4ActionPerformed

    private void derechaCubo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derechaCubo4ActionPerformed
        // TODO add your handling code here:
        String Cubo4C5N = Cubo4C5J.getText();
        Color Cubo4C5B = Cubo4C5J.getBackground();
        Cubo4C5J.setText(Cubo4C1J.getText());
        Cubo4C5J.setBackground(Cubo4C1J.getBackground());

        String Cubo4C2N = Cubo4C2J.getText();
        Color Cubo4C2B = Cubo4C2J.getBackground();
        Cubo4C2J.setText(Cubo4C5N);
        Cubo4C2J.setBackground(Cubo4C5B);

        String Cubo4C6N = Cubo4C6J.getText();
        Color Cubo4C6B = Cubo4C6J.getBackground();
        Cubo4C6J.setText(Cubo4C2N);
        Cubo4C6J.setBackground(Cubo4C2B);

        Cubo4C1J.setText(Cubo4C6N);
        Cubo4C1J.setBackground(Cubo4C6B);

        actualTorre();
    }//GEN-LAST:event_derechaCubo4ActionPerformed

    private void abajoCubo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abajoCubo4ActionPerformed
        // TODO add your handling code here:
        String Cubo4C3N = Cubo4C3J.getText();
        Color Cubo4C3B = Cubo4C3J.getBackground();
        Cubo4C3J.setText(Cubo4C2J.getText());
        Cubo4C3J.setBackground(Cubo4C2J.getBackground());

        String Cubo4C1N = Cubo4C1J.getText();
        Color Cubo4C1B = Cubo4C1J.getBackground();
        Cubo4C1J.setText(Cubo4C3N);
        Cubo4C1J.setBackground(Cubo4C3B);

        String Cubo4C4N = Cubo4C4J.getText();
        Color Cubo4C4B = Cubo4C4J.getBackground();
        Cubo4C4J.setText(Cubo4C1N);
        Cubo4C4J.setBackground(Cubo4C1B);

        Cubo4C2J.setText(Cubo4C4N);
        Cubo4C2J.setBackground(Cubo4C4B);

        actualTorre();
    }//GEN-LAST:event_abajoCubo4ActionPerformed

    private void horarioCubo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioCubo4ActionPerformed
        // TODO add your handling code here:
        String Cubo4C3N = Cubo4C3J.getText();
        Color Cubo4C3B = Cubo4C3J.getBackground();
        Cubo4C3J.setText(Cubo4C6J.getText());
        Cubo4C3J.setBackground(Cubo4C6J.getBackground());

        String Cubo4C5N = Cubo4C5J.getText();
        Color Cubo4C5B = Cubo4C5J.getBackground();
        Cubo4C5J.setText(Cubo4C3N);
        Cubo4C5J.setBackground(Cubo4C3B);

        String Cubo4C4N = Cubo4C4J.getText();
        Color Cubo4C4B = Cubo4C4J.getBackground();
        Cubo4C4J.setText(Cubo4C5N);
        Cubo4C4J.setBackground(Cubo4C5B);

        Cubo4C6J.setText(Cubo4C4N);
        Cubo4C6J.setBackground(Cubo4C4B);

        actualTorre();

    }//GEN-LAST:event_horarioCubo4ActionPerformed

    private void antihorarioCubo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antihorarioCubo4ActionPerformed
        // TODO add your handling code here:
        String Cubo4C3N = Cubo4C3J.getText();
        Color Cubo4C3B = Cubo4C3J.getBackground();
        Cubo4C3J.setText(Cubo4C5J.getText());
        Cubo4C3J.setBackground(Cubo4C5J.getBackground());

        String Cubo4C6N = Cubo4C6J.getText();
        Color Cubo4C6B = Cubo4C6J.getBackground();
        Cubo4C6J.setText(Cubo4C3N);
        Cubo4C6J.setBackground(Cubo4C3B);

        String Cubo4C4N = Cubo4C4J.getText();
        Color Cubo4C4B = Cubo4C4J.getBackground();
        Cubo4C4J.setText(Cubo4C6N);
        Cubo4C4J.setBackground(Cubo4C6B);

        Cubo4C5J.setText(Cubo4C4N);
        Cubo4C5J.setBackground(Cubo4C4B);

        actualTorre();
    }//GEN-LAST:event_antihorarioCubo4ActionPerformed

    private void comprobarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprobarBtnActionPerformed
        // TODO add your handling code here:
        boolean condicion1 = ((!Cubo1C3J.getBackground().equals(Cubo2C3J.getBackground())
                && !Cubo1C3J.getBackground().equals(Cubo3C3J.getBackground())
                && !Cubo1C3J.getBackground().equals(Cubo4C3J.getBackground()))
                && (!Cubo2C3J.getBackground().equals(Cubo3C3J.getBackground())
                && !Cubo2C3J.getBackground().equals(Cubo4C3J.getBackground()))
                && !Cubo3C3J.getBackground().equals(Cubo4C3J.getBackground()));

        boolean condicion2 = ((!Cubo1C5J.getBackground().equals(Cubo2C5J.getBackground())
                && !Cubo1C5J.getBackground().equals(Cubo3C5J.getBackground())
                && !Cubo1C5J.getBackground().equals(Cubo4C5J.getBackground()))
                && (!Cubo2C5J.getBackground().equals(Cubo3C5J.getBackground())
                && !Cubo2C5J.getBackground().equals(Cubo4C5J.getBackground()))
                && !Cubo3C5J.getBackground().equals(Cubo4C5J.getBackground()));

        boolean condicion3 = ((!Cubo1C4J.getBackground().equals(Cubo2C4J.getBackground())
                && !Cubo1C4J.getBackground().equals(Cubo3C4J.getBackground())
                && !Cubo1C4J.getBackground().equals(Cubo4C4J.getBackground()))
                && (!Cubo2C4J.getBackground().equals(Cubo3C4J.getBackground())
                && !Cubo2C4J.getBackground().equals(Cubo4C4J.getBackground()))
                && !Cubo3C4J.getBackground().equals(Cubo4C4J.getBackground()));

        boolean condicion4 = ((!Cubo1C6J.getBackground().equals(Cubo2C6J.getBackground())
                && !Cubo1C6J.getBackground().equals(Cubo3C6J.getBackground())
                && !Cubo1C6J.getBackground().equals(Cubo4C6J.getBackground()))
                && (!Cubo2C6J.getBackground().equals(Cubo3C6J.getBackground())
                && !Cubo2C6J.getBackground().equals(Cubo4C6J.getBackground()))
                && !Cubo3C6J.getBackground().equals(Cubo4C6J.getBackground()));

        if (condicion1 && condicion2 && condicion3 && condicion4) {
            actualTorre();
            resueltoLbl.setVisible(true);
            resuelto = true;
            Object[] options = {"Sí, Por Favor",
                "No, gracias"};
            int yes = JOptionPane.showOptionDialog(null,
                    "FELICIDADES, RESOLVISTE EL JUEGO!\n"
                    + " Deseas ver la explicación?",
                    "Explicación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (JOptionPane.YES_OPTION == yes) {
                jTabbedPane1.setSelectedIndex(2);
                grafoGL();
                grafoG1();
                grafoG2();
                combinarSoluciones();
                existeSolucion.setText("SI existe una solución");
                existeSolucion.setForeground(new Color(0, 153, 0));
            } else {

            }

        } else {
            actualTorre();
            resueltoLbl.setVisible(false);
            resuelto = false;
            JOptionPane.showMessageDialog(null, "La combinación NO es válida, puedes seguir\n"
                    + "intentando o presionar el botón 'Resolver'");

        }


    }//GEN-LAST:event_comprobarBtnActionPerformed

    public void actualTorre() {
        // Actualizar grafica de vistas laterales de la torre
        // Cubo 1
        Cubo1C3T.setText(Cubo1C3J.getText());
        Cubo1C3T.setBackground(Cubo1C3J.getBackground());

        Cubo1C4T.setText(Cubo1C4J.getText());
        Cubo1C4T.setBackground(Cubo1C4J.getBackground());

        Cubo1C5T.setText(Cubo1C5J.getText());
        Cubo1C5T.setBackground(Cubo1C5J.getBackground());

        Cubo1C6T.setText(Cubo1C6J.getText());
        Cubo1C6T.setBackground(Cubo1C6J.getBackground());

        // Cubo 2
        Cubo2C3T.setText(Cubo2C3J.getText());
        Cubo2C3T.setBackground(Cubo2C3J.getBackground());

        Cubo2C4T.setText(Cubo2C4J.getText());
        Cubo2C4T.setBackground(Cubo2C4J.getBackground());

        Cubo2C5T.setText(Cubo2C5J.getText());
        Cubo2C5T.setBackground(Cubo2C5J.getBackground());

        Cubo2C6T.setText(Cubo2C6J.getText());
        Cubo2C6T.setBackground(Cubo2C6J.getBackground());

        // Cubo 3
        Cubo3C3T.setText(Cubo3C3J.getText());
        Cubo3C3T.setBackground(Cubo3C3J.getBackground());

        Cubo3C4T.setText(Cubo3C4J.getText());
        Cubo3C4T.setBackground(Cubo3C4J.getBackground());

        Cubo3C5T.setText(Cubo3C5J.getText());
        Cubo3C5T.setBackground(Cubo3C5J.getBackground());

        Cubo3C6T.setText(Cubo3C6J.getText());
        Cubo3C6T.setBackground(Cubo3C6J.getBackground());

        // Cubo 4
        Cubo4C3T.setText(Cubo4C3J.getText());
        Cubo4C3T.setBackground(Cubo4C3J.getBackground());

        Cubo4C4T.setText(Cubo4C4J.getText());
        Cubo4C4T.setBackground(Cubo4C4J.getBackground());

        Cubo4C5T.setText(Cubo4C5J.getText());
        Cubo4C5T.setBackground(Cubo4C5J.getBackground());

        Cubo4C6T.setText(Cubo4C6J.getText());
        Cubo4C6T.setBackground(Cubo4C6J.getBackground());

    }

    private void explicacionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explicacionBtnActionPerformed
        // TODO add your handling code here:
        boolean condicion1 = ((!Cubo1C3J.getBackground().equals(Cubo2C3J.getBackground())
                && !Cubo1C3J.getBackground().equals(Cubo3C3J.getBackground())
                && !Cubo1C3J.getBackground().equals(Cubo4C3J.getBackground()))
                && (!Cubo2C3J.getBackground().equals(Cubo3C3J.getBackground())
                && !Cubo2C3J.getBackground().equals(Cubo4C3J.getBackground()))
                && !Cubo3C3J.getBackground().equals(Cubo4C3J.getBackground()));

        boolean condicion2 = ((!Cubo1C5J.getBackground().equals(Cubo2C5J.getBackground())
                && !Cubo1C5J.getBackground().equals(Cubo3C5J.getBackground())
                && !Cubo1C5J.getBackground().equals(Cubo4C5J.getBackground()))
                && (!Cubo2C5J.getBackground().equals(Cubo3C5J.getBackground())
                && !Cubo2C5J.getBackground().equals(Cubo4C5J.getBackground()))
                && !Cubo3C5J.getBackground().equals(Cubo4C5J.getBackground()));

        boolean condicion3 = ((!Cubo1C4J.getBackground().equals(Cubo2C4J.getBackground())
                && !Cubo1C4J.getBackground().equals(Cubo3C4J.getBackground())
                && !Cubo1C4J.getBackground().equals(Cubo4C4J.getBackground()))
                && (!Cubo2C4J.getBackground().equals(Cubo3C4J.getBackground())
                && !Cubo2C4J.getBackground().equals(Cubo4C4J.getBackground()))
                && !Cubo3C4J.getBackground().equals(Cubo4C4J.getBackground()));

        boolean condicion4 = ((!Cubo1C6J.getBackground().equals(Cubo2C6J.getBackground())
                && !Cubo1C6J.getBackground().equals(Cubo3C6J.getBackground())
                && !Cubo1C6J.getBackground().equals(Cubo4C6J.getBackground()))
                && (!Cubo2C6J.getBackground().equals(Cubo3C6J.getBackground())
                && !Cubo2C6J.getBackground().equals(Cubo4C6J.getBackground()))
                && !Cubo3C6J.getBackground().equals(Cubo4C6J.getBackground()));

        if (condicion1 && condicion2 && condicion3 && condicion4) {
            resuelto = true;
        }
        if (resuelto == true) {
            jTabbedPane1.setSelectedIndex(2);
            grafoGL();
            grafoG1();
            grafoG2();
            combinarSoluciones();
            existeSolucion.setText("SI existe una solución");
        } else {
            JOptionPane.showMessageDialog(null, "Podrás ver la explicación cuando resuelvas\n"
                        + "el juego o presiones 'RESOLVER'\n"
                        + "(SOLO si existe una solución)");
        }
    }//GEN-LAST:event_explicacionBtnActionPerformed

    private void InterCubo1_Cubo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterCubo1_Cubo2ActionPerformed
        // TODO add your handling code here:
        if ((Cubo1C3T.getLocation().equals(posCubo1Abs) && Cubo2C3T.getLocation().equals(posCubo2Abs))
                || (Cubo2C3T.getLocation().equals(posCubo1Abs) && Cubo1C3T.getLocation().equals(posCubo2Abs))) {
            Point posCubo1Lbl = Cubo1Lbl.getLocation();
            Cubo1Lbl.setLocation(Cubo2Lbl.getLocation());
            Cubo2Lbl.setLocation(posCubo1Lbl);

            Point posCubo1C3T = Cubo1C3T.getLocation();
            Cubo1C3T.setLocation(Cubo2C3T.getLocation());
            Cubo2C3T.setLocation(posCubo1C3T);

            Point posCubo1C5T = Cubo1C5T.getLocation();
            Cubo1C5T.setLocation(Cubo2C5T.getLocation());
            Cubo2C5T.setLocation(posCubo1C5T);

            Point posCubo1C6T = Cubo1C6T.getLocation();
            Cubo1C6T.setLocation(Cubo2C6T.getLocation());
            Cubo2C6T.setLocation(posCubo1C6T);

            Point posCubo1C4T = Cubo1C4T.getLocation();
            Cubo1C4T.setLocation(Cubo2C4T.getLocation());
            Cubo2C4T.setLocation(posCubo1C4T);

        } else if ((Cubo1C3T.getLocation().equals(posCubo1Abs) && Cubo3C3T.getLocation().equals(posCubo2Abs))
                || (Cubo3C3T.getLocation().equals(posCubo1Abs) && Cubo1C3T.getLocation().equals(posCubo2Abs))) {
            Point posCubo1Lbl = Cubo1Lbl.getLocation();
            Cubo1Lbl.setLocation(Cubo3Lbl.getLocation());
            Cubo3Lbl.setLocation(posCubo1Lbl);

            Point posCubo1C3T = Cubo1C3T.getLocation();
            Cubo1C3T.setLocation(Cubo3C3T.getLocation());
            Cubo3C3T.setLocation(posCubo1C3T);

            Point posCubo1C5T = Cubo1C5T.getLocation();
            Cubo1C5T.setLocation(Cubo3C5T.getLocation());
            Cubo3C5T.setLocation(posCubo1C5T);

            Point posCubo1C6T = Cubo1C6T.getLocation();
            Cubo1C6T.setLocation(Cubo3C6T.getLocation());
            Cubo3C6T.setLocation(posCubo1C6T);

            Point posCubo1C4T = Cubo1C4T.getLocation();
            Cubo1C4T.setLocation(Cubo3C4T.getLocation());
            Cubo3C4T.setLocation(posCubo1C4T);

        } else if ((Cubo1C3T.getLocation().equals(posCubo1Abs) && Cubo4C3T.getLocation().equals(posCubo2Abs))
                || (Cubo4C3T.getLocation().equals(posCubo1Abs) && Cubo1C3T.getLocation().equals(posCubo2Abs))) {
            Point posCubo1Lbl = Cubo1Lbl.getLocation();
            Cubo1Lbl.setLocation(Cubo4Lbl.getLocation());
            Cubo4Lbl.setLocation(posCubo1Lbl);

            Point posCubo1C3T = Cubo1C3T.getLocation();
            Cubo1C3T.setLocation(Cubo4C3T.getLocation());
            Cubo4C3T.setLocation(posCubo1C3T);

            Point posCubo1C5T = Cubo1C5T.getLocation();
            Cubo1C5T.setLocation(Cubo4C5T.getLocation());
            Cubo4C5T.setLocation(posCubo1C5T);

            Point posCubo1C6T = Cubo1C6T.getLocation();
            Cubo1C6T.setLocation(Cubo4C6T.getLocation());
            Cubo4C6T.setLocation(posCubo1C6T);

            Point posCubo1C4T = Cubo1C4T.getLocation();
            Cubo1C4T.setLocation(Cubo4C4T.getLocation());
            Cubo4C4T.setLocation(posCubo1C4T);

        } else if ((Cubo2C3T.getLocation().equals(posCubo1Abs) && Cubo3C3T.getLocation().equals(posCubo2Abs))
                || (Cubo3C3T.getLocation().equals(posCubo1Abs) && Cubo2C3T.getLocation().equals(posCubo2Abs))) {
            Point posCubo2Lbl = Cubo2Lbl.getLocation();
            Cubo2Lbl.setLocation(Cubo3Lbl.getLocation());
            Cubo3Lbl.setLocation(posCubo2Lbl);

            Point posCubo2C3T = Cubo2C3T.getLocation();
            Cubo2C3T.setLocation(Cubo3C3T.getLocation());
            Cubo3C3T.setLocation(posCubo2C3T);

            Point posCubo2C5T = Cubo2C5T.getLocation();
            Cubo2C5T.setLocation(Cubo3C5T.getLocation());
            Cubo3C5T.setLocation(posCubo2C5T);

            Point posCubo2C6T = Cubo2C6T.getLocation();
            Cubo2C6T.setLocation(Cubo3C6T.getLocation());
            Cubo3C6T.setLocation(posCubo2C6T);

            Point posCubo2C4T = Cubo2C4T.getLocation();
            Cubo2C4T.setLocation(Cubo3C4T.getLocation());
            Cubo3C4T.setLocation(posCubo2C4T);

        } else if ((Cubo2C3T.getLocation().equals(posCubo1Abs) && Cubo4C3T.getLocation().equals(posCubo2Abs))
                || (Cubo4C3T.getLocation().equals(posCubo1Abs) && Cubo2C3T.getLocation().equals(posCubo2Abs))) {
            Point posCubo2Lbl = Cubo2Lbl.getLocation();
            Cubo2Lbl.setLocation(Cubo4Lbl.getLocation());
            Cubo4Lbl.setLocation(posCubo2Lbl);

            Point posCubo2C3T = Cubo2C3T.getLocation();
            Cubo2C3T.setLocation(Cubo4C3T.getLocation());
            Cubo4C3T.setLocation(posCubo2C3T);

            Point posCubo2C5T = Cubo2C5T.getLocation();
            Cubo2C5T.setLocation(Cubo4C5T.getLocation());
            Cubo4C5T.setLocation(posCubo2C5T);

            Point posCubo2C6T = Cubo2C6T.getLocation();
            Cubo2C6T.setLocation(Cubo4C6T.getLocation());
            Cubo4C6T.setLocation(posCubo2C6T);

            Point posCubo2C4T = Cubo2C4T.getLocation();
            Cubo2C4T.setLocation(Cubo4C4T.getLocation());
            Cubo4C4T.setLocation(posCubo2C4T);

        } else if ((Cubo3C3T.getLocation().equals(posCubo1Abs) && Cubo4C3T.getLocation().equals(posCubo2Abs))
                || (Cubo4C3T.getLocation().equals(posCubo1Abs) && Cubo3C3T.getLocation().equals(posCubo2Abs))) {
            Point posCubo3Lbl = Cubo3Lbl.getLocation();
            Cubo3Lbl.setLocation(Cubo4Lbl.getLocation());
            Cubo4Lbl.setLocation(posCubo3Lbl);

            Point posCubo3C3T = Cubo3C3T.getLocation();
            Cubo3C3T.setLocation(Cubo4C3T.getLocation());
            Cubo4C3T.setLocation(posCubo3C3T);

            Point posCubo3C5T = Cubo3C5T.getLocation();
            Cubo3C5T.setLocation(Cubo4C5T.getLocation());
            Cubo4C5T.setLocation(posCubo3C5T);

            Point posCubo3C6T = Cubo3C6T.getLocation();
            Cubo3C6T.setLocation(Cubo4C6T.getLocation());
            Cubo4C6T.setLocation(posCubo3C6T);

            Point posCubo3C4T = Cubo3C4T.getLocation();
            Cubo3C4T.setLocation(Cubo4C4T.getLocation());
            Cubo4C4T.setLocation(posCubo3C4T);
        }
    }//GEN-LAST:event_InterCubo1_Cubo2ActionPerformed

    private void InterCubo2_Cubo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterCubo2_Cubo3ActionPerformed
        // TODO add your handling code here:
       if ((Cubo1C3T.getLocation().equals(posCubo2Abs) && Cubo2C3T.getLocation().equals(posCubo3Abs))
                || (Cubo2C3T.getLocation().equals(posCubo2Abs) && Cubo1C3T.getLocation().equals(posCubo3Abs))) {
            Point posCubo1Lbl = Cubo1Lbl.getLocation();
            Cubo1Lbl.setLocation(Cubo2Lbl.getLocation());
            Cubo2Lbl.setLocation(posCubo1Lbl);

            Point posCubo1C3T = Cubo1C3T.getLocation();
            Cubo1C3T.setLocation(Cubo2C3T.getLocation());
            Cubo2C3T.setLocation(posCubo1C3T);

            Point posCubo1C5T = Cubo1C5T.getLocation();
            Cubo1C5T.setLocation(Cubo2C5T.getLocation());
            Cubo2C5T.setLocation(posCubo1C5T);

            Point posCubo1C6T = Cubo1C6T.getLocation();
            Cubo1C6T.setLocation(Cubo2C6T.getLocation());
            Cubo2C6T.setLocation(posCubo1C6T);

            Point posCubo1C4T = Cubo1C4T.getLocation();
            Cubo1C4T.setLocation(Cubo2C4T.getLocation());
            Cubo2C4T.setLocation(posCubo1C4T);

        } else if ((Cubo1C3T.getLocation().equals(posCubo2Abs) && Cubo3C3T.getLocation().equals(posCubo3Abs))
                || (Cubo3C3T.getLocation().equals(posCubo2Abs) && Cubo1C3T.getLocation().equals(posCubo3Abs))) {
            Point posCubo1Lbl = Cubo1Lbl.getLocation();
            Cubo1Lbl.setLocation(Cubo3Lbl.getLocation());
            Cubo3Lbl.setLocation(posCubo1Lbl);

            Point posCubo1C3T = Cubo1C3T.getLocation();
            Cubo1C3T.setLocation(Cubo3C3T.getLocation());
            Cubo3C3T.setLocation(posCubo1C3T);

            Point posCubo1C5T = Cubo1C5T.getLocation();
            Cubo1C5T.setLocation(Cubo3C5T.getLocation());
            Cubo3C5T.setLocation(posCubo1C5T);

            Point posCubo1C6T = Cubo1C6T.getLocation();
            Cubo1C6T.setLocation(Cubo3C6T.getLocation());
            Cubo3C6T.setLocation(posCubo1C6T);

            Point posCubo1C4T = Cubo1C4T.getLocation();
            Cubo1C4T.setLocation(Cubo3C4T.getLocation());
            Cubo3C4T.setLocation(posCubo1C4T);

        } else if ((Cubo1C3T.getLocation().equals(posCubo2Abs) && Cubo4C3T.getLocation().equals(posCubo3Abs))
                || (Cubo4C3T.getLocation().equals(posCubo2Abs) && Cubo1C3T.getLocation().equals(posCubo3Abs))) {
            Point posCubo1Lbl = Cubo1Lbl.getLocation();
            Cubo1Lbl.setLocation(Cubo4Lbl.getLocation());
            Cubo4Lbl.setLocation(posCubo1Lbl);

            Point posCubo1C3T = Cubo1C3T.getLocation();
            Cubo1C3T.setLocation(Cubo4C3T.getLocation());
            Cubo4C3T.setLocation(posCubo1C3T);

            Point posCubo1C5T = Cubo1C5T.getLocation();
            Cubo1C5T.setLocation(Cubo4C5T.getLocation());
            Cubo4C5T.setLocation(posCubo1C5T);

            Point posCubo1C6T = Cubo1C6T.getLocation();
            Cubo1C6T.setLocation(Cubo4C6T.getLocation());
            Cubo4C6T.setLocation(posCubo1C6T);

            Point posCubo1C4T = Cubo1C4T.getLocation();
            Cubo1C4T.setLocation(Cubo4C4T.getLocation());
            Cubo4C4T.setLocation(posCubo1C4T);

        } else if ((Cubo2C3T.getLocation().equals(posCubo2Abs) && Cubo3C3T.getLocation().equals(posCubo3Abs))
                || (Cubo3C3T.getLocation().equals(posCubo2Abs) && Cubo2C3T.getLocation().equals(posCubo3Abs))) {
            Point posCubo2Lbl = Cubo2Lbl.getLocation();
            Cubo2Lbl.setLocation(Cubo3Lbl.getLocation());
            Cubo3Lbl.setLocation(posCubo2Lbl);

            Point posCubo2C3T = Cubo2C3T.getLocation();
            Cubo2C3T.setLocation(Cubo3C3T.getLocation());
            Cubo3C3T.setLocation(posCubo2C3T);

            Point posCubo2C5T = Cubo2C5T.getLocation();
            Cubo2C5T.setLocation(Cubo3C5T.getLocation());
            Cubo3C5T.setLocation(posCubo2C5T);

            Point posCubo2C6T = Cubo2C6T.getLocation();
            Cubo2C6T.setLocation(Cubo3C6T.getLocation());
            Cubo3C6T.setLocation(posCubo2C6T);

            Point posCubo2C4T = Cubo2C4T.getLocation();
            Cubo2C4T.setLocation(Cubo3C4T.getLocation());
            Cubo3C4T.setLocation(posCubo2C4T);

        } else if ((Cubo2C3T.getLocation().equals(posCubo2Abs) && Cubo4C3T.getLocation().equals(posCubo3Abs))
                || (Cubo4C3T.getLocation().equals(posCubo2Abs) && Cubo2C3T.getLocation().equals(posCubo3Abs))) {
            Point posCubo2Lbl = Cubo2Lbl.getLocation();
            Cubo2Lbl.setLocation(Cubo4Lbl.getLocation());
            Cubo4Lbl.setLocation(posCubo2Lbl);

            Point posCubo2C3T = Cubo2C3T.getLocation();
            Cubo2C3T.setLocation(Cubo4C3T.getLocation());
            Cubo4C3T.setLocation(posCubo2C3T);

            Point posCubo2C5T = Cubo2C5T.getLocation();
            Cubo2C5T.setLocation(Cubo4C5T.getLocation());
            Cubo4C5T.setLocation(posCubo2C5T);

            Point posCubo2C6T = Cubo2C6T.getLocation();
            Cubo2C6T.setLocation(Cubo4C6T.getLocation());
            Cubo4C6T.setLocation(posCubo2C6T);

            Point posCubo2C4T = Cubo2C4T.getLocation();
            Cubo2C4T.setLocation(Cubo4C4T.getLocation());
            Cubo4C4T.setLocation(posCubo2C4T);

        } else if ((Cubo3C3T.getLocation().equals(posCubo2Abs) && Cubo4C3T.getLocation().equals(posCubo3Abs))
                || (Cubo4C3T.getLocation().equals(posCubo2Abs) && Cubo3C3T.getLocation().equals(posCubo3Abs))) {
            Point posCubo3Lbl = Cubo3Lbl.getLocation();
            Cubo3Lbl.setLocation(Cubo4Lbl.getLocation());
            Cubo4Lbl.setLocation(posCubo3Lbl);

            Point posCubo3C3T = Cubo3C3T.getLocation();
            Cubo3C3T.setLocation(Cubo4C3T.getLocation());
            Cubo4C3T.setLocation(posCubo3C3T);

            Point posCubo3C5T = Cubo3C5T.getLocation();
            Cubo3C5T.setLocation(Cubo4C5T.getLocation());
            Cubo4C5T.setLocation(posCubo3C5T);

            Point posCubo3C6T = Cubo3C6T.getLocation();
            Cubo3C6T.setLocation(Cubo4C6T.getLocation());
            Cubo4C6T.setLocation(posCubo3C6T);

            Point posCubo3C4T = Cubo3C4T.getLocation();
            Cubo3C4T.setLocation(Cubo4C4T.getLocation());
            Cubo4C4T.setLocation(posCubo3C4T);
        }
    }//GEN-LAST:event_InterCubo2_Cubo3ActionPerformed

    private void InterCubo3_Cubo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterCubo3_Cubo4ActionPerformed
        // TODO add your handling code here:
        if ((Cubo1C3T.getLocation().equals(posCubo3Abs) && Cubo2C3T.getLocation().equals(posCubo4Abs))
                || (Cubo2C3T.getLocation().equals(posCubo3Abs) && Cubo1C3T.getLocation().equals(posCubo4Abs))) {
            Point posCubo1Lbl = Cubo1Lbl.getLocation();
            Cubo1Lbl.setLocation(Cubo2Lbl.getLocation());
            Cubo2Lbl.setLocation(posCubo1Lbl);

            Point posCubo1C3T = Cubo1C3T.getLocation();
            Cubo1C3T.setLocation(Cubo2C3T.getLocation());
            Cubo2C3T.setLocation(posCubo1C3T);

            Point posCubo1C5T = Cubo1C5T.getLocation();
            Cubo1C5T.setLocation(Cubo2C5T.getLocation());
            Cubo2C5T.setLocation(posCubo1C5T);

            Point posCubo1C6T = Cubo1C6T.getLocation();
            Cubo1C6T.setLocation(Cubo2C6T.getLocation());
            Cubo2C6T.setLocation(posCubo1C6T);

            Point posCubo1C4T = Cubo1C4T.getLocation();
            Cubo1C4T.setLocation(Cubo2C4T.getLocation());
            Cubo2C4T.setLocation(posCubo1C4T);

        } else if ((Cubo1C3T.getLocation().equals(posCubo3Abs) && Cubo3C3T.getLocation().equals(posCubo4Abs))
                || (Cubo3C3T.getLocation().equals(posCubo3Abs) && Cubo1C3T.getLocation().equals(posCubo4Abs))) {
            Point posCubo1Lbl = Cubo1Lbl.getLocation();
            Cubo1Lbl.setLocation(Cubo3Lbl.getLocation());
            Cubo3Lbl.setLocation(posCubo1Lbl);

            Point posCubo1C3T = Cubo1C3T.getLocation();
            Cubo1C3T.setLocation(Cubo3C3T.getLocation());
            Cubo3C3T.setLocation(posCubo1C3T);

            Point posCubo1C5T = Cubo1C5T.getLocation();
            Cubo1C5T.setLocation(Cubo3C5T.getLocation());
            Cubo3C5T.setLocation(posCubo1C5T);

            Point posCubo1C6T = Cubo1C6T.getLocation();
            Cubo1C6T.setLocation(Cubo3C6T.getLocation());
            Cubo3C6T.setLocation(posCubo1C6T);

            Point posCubo1C4T = Cubo1C4T.getLocation();
            Cubo1C4T.setLocation(Cubo3C4T.getLocation());
            Cubo3C4T.setLocation(posCubo1C4T);

        } else if ((Cubo1C3T.getLocation().equals(posCubo3Abs) && Cubo4C3T.getLocation().equals(posCubo4Abs))
                || (Cubo4C3T.getLocation().equals(posCubo3Abs) && Cubo1C3T.getLocation().equals(posCubo4Abs))) {
            Point posCubo1Lbl = Cubo1Lbl.getLocation();
            Cubo1Lbl.setLocation(Cubo4Lbl.getLocation());
            Cubo4Lbl.setLocation(posCubo1Lbl);

            Point posCubo1C3T = Cubo1C3T.getLocation();
            Cubo1C3T.setLocation(Cubo4C3T.getLocation());
            Cubo4C3T.setLocation(posCubo1C3T);

            Point posCubo1C5T = Cubo1C5T.getLocation();
            Cubo1C5T.setLocation(Cubo4C5T.getLocation());
            Cubo4C5T.setLocation(posCubo1C5T);

            Point posCubo1C6T = Cubo1C6T.getLocation();
            Cubo1C6T.setLocation(Cubo4C6T.getLocation());
            Cubo4C6T.setLocation(posCubo1C6T);

            Point posCubo1C4T = Cubo1C4T.getLocation();
            Cubo1C4T.setLocation(Cubo4C4T.getLocation());
            Cubo4C4T.setLocation(posCubo1C4T);

        } else if ((Cubo2C3T.getLocation().equals(posCubo3Abs) && Cubo3C3T.getLocation().equals(posCubo4Abs))
                || (Cubo3C3T.getLocation().equals(posCubo3Abs) && Cubo2C3T.getLocation().equals(posCubo4Abs))) {
            Point posCubo2Lbl = Cubo2Lbl.getLocation();
            Cubo2Lbl.setLocation(Cubo3Lbl.getLocation());
            Cubo3Lbl.setLocation(posCubo2Lbl);

            Point posCubo2C3T = Cubo2C3T.getLocation();
            Cubo2C3T.setLocation(Cubo3C3T.getLocation());
            Cubo3C3T.setLocation(posCubo2C3T);

            Point posCubo2C5T = Cubo2C5T.getLocation();
            Cubo2C5T.setLocation(Cubo3C5T.getLocation());
            Cubo3C5T.setLocation(posCubo2C5T);

            Point posCubo2C6T = Cubo2C6T.getLocation();
            Cubo2C6T.setLocation(Cubo3C6T.getLocation());
            Cubo3C6T.setLocation(posCubo2C6T);

            Point posCubo2C4T = Cubo2C4T.getLocation();
            Cubo2C4T.setLocation(Cubo3C4T.getLocation());
            Cubo3C4T.setLocation(posCubo2C4T);

        } else if ((Cubo2C3T.getLocation().equals(posCubo3Abs) && Cubo4C3T.getLocation().equals(posCubo4Abs))
                || (Cubo4C3T.getLocation().equals(posCubo3Abs) && Cubo2C3T.getLocation().equals(posCubo4Abs))) {
            Point posCubo2Lbl = Cubo2Lbl.getLocation();
            Cubo2Lbl.setLocation(Cubo4Lbl.getLocation());
            Cubo4Lbl.setLocation(posCubo2Lbl);

            Point posCubo2C3T = Cubo2C3T.getLocation();
            Cubo2C3T.setLocation(Cubo4C3T.getLocation());
            Cubo4C3T.setLocation(posCubo2C3T);

            Point posCubo2C5T = Cubo2C5T.getLocation();
            Cubo2C5T.setLocation(Cubo4C5T.getLocation());
            Cubo4C5T.setLocation(posCubo2C5T);

            Point posCubo2C6T = Cubo2C6T.getLocation();
            Cubo2C6T.setLocation(Cubo4C6T.getLocation());
            Cubo4C6T.setLocation(posCubo2C6T);

            Point posCubo2C4T = Cubo2C4T.getLocation();
            Cubo2C4T.setLocation(Cubo4C4T.getLocation());
            Cubo4C4T.setLocation(posCubo2C4T);

        } else if ((Cubo3C3T.getLocation().equals(posCubo3Abs) && Cubo4C3T.getLocation().equals(posCubo4Abs))
                || (Cubo4C3T.getLocation().equals(posCubo3Abs) && Cubo3C3T.getLocation().equals(posCubo4Abs))) {
            Point posCubo3Lbl = Cubo3Lbl.getLocation();
            Cubo3Lbl.setLocation(Cubo4Lbl.getLocation());
            Cubo4Lbl.setLocation(posCubo3Lbl);

            Point posCubo3C3T = Cubo3C3T.getLocation();
            Cubo3C3T.setLocation(Cubo4C3T.getLocation());
            Cubo4C3T.setLocation(posCubo3C3T);

            Point posCubo3C5T = Cubo3C5T.getLocation();
            Cubo3C5T.setLocation(Cubo4C5T.getLocation());
            Cubo4C5T.setLocation(posCubo3C5T);

            Point posCubo3C6T = Cubo3C6T.getLocation();
            Cubo3C6T.setLocation(Cubo4C6T.getLocation());
            Cubo4C6T.setLocation(posCubo3C6T);

            Point posCubo3C4T = Cubo3C4T.getLocation();
            Cubo3C4T.setLocation(Cubo4C4T.getLocation());
            Cubo4C4T.setLocation(posCubo3C4T);
        }
    }//GEN-LAST:event_InterCubo3_Cubo4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
         */

 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Locura_Instantánea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cubo1C1;
    private javax.swing.JLabel Cubo1C1E;
    private javax.swing.JLabel Cubo1C1G;
    private javax.swing.JLabel Cubo1C1J;
    private javax.swing.JComboBox<String> Cubo1C2;
    private javax.swing.JLabel Cubo1C2G;
    private javax.swing.JLabel Cubo1C2J;
    private javax.swing.JComboBox<String> Cubo1C3;
    private javax.swing.JLabel Cubo1C3E;
    private javax.swing.JLabel Cubo1C3G;
    private javax.swing.JLabel Cubo1C3J;
    private javax.swing.JLabel Cubo1C3T;
    private javax.swing.JComboBox<String> Cubo1C4;
    private javax.swing.JLabel Cubo1C4E;
    private javax.swing.JLabel Cubo1C4G;
    private javax.swing.JLabel Cubo1C4J;
    private javax.swing.JLabel Cubo1C4T;
    private javax.swing.JComboBox<String> Cubo1C5;
    private javax.swing.JLabel Cubo1C5E;
    private javax.swing.JLabel Cubo1C5G;
    private javax.swing.JLabel Cubo1C5J;
    private javax.swing.JLabel Cubo1C5T;
    private javax.swing.JComboBox<String> Cubo1C6;
    private javax.swing.JLabel Cubo1C6E;
    private javax.swing.JLabel Cubo1C6G;
    private javax.swing.JLabel Cubo1C6J;
    private javax.swing.JLabel Cubo1C6T;
    private javax.swing.JLabel Cubo1Lbl;
    private javax.swing.JComboBox<String> Cubo2C1;
    private javax.swing.JLabel Cubo2C1E;
    private javax.swing.JLabel Cubo2C1G;
    private javax.swing.JLabel Cubo2C1J;
    private javax.swing.JComboBox<String> Cubo2C2;
    private javax.swing.JLabel Cubo2C2G;
    private javax.swing.JLabel Cubo2C2J;
    private javax.swing.JComboBox<String> Cubo2C3;
    private javax.swing.JLabel Cubo2C3E;
    private javax.swing.JLabel Cubo2C3G;
    private javax.swing.JLabel Cubo2C3J;
    private javax.swing.JLabel Cubo2C3T;
    private javax.swing.JComboBox<String> Cubo2C4;
    private javax.swing.JLabel Cubo2C4E;
    private javax.swing.JLabel Cubo2C4G;
    private javax.swing.JLabel Cubo2C4J;
    private javax.swing.JLabel Cubo2C4T;
    private javax.swing.JComboBox<String> Cubo2C5;
    private javax.swing.JLabel Cubo2C5E;
    private javax.swing.JLabel Cubo2C5G;
    private javax.swing.JLabel Cubo2C5J;
    private javax.swing.JLabel Cubo2C5T;
    private javax.swing.JComboBox<String> Cubo2C6;
    private javax.swing.JLabel Cubo2C6E;
    private javax.swing.JLabel Cubo2C6G;
    private javax.swing.JLabel Cubo2C6J;
    private javax.swing.JLabel Cubo2C6T;
    private javax.swing.JLabel Cubo2Lbl;
    private javax.swing.JComboBox<String> Cubo3C1;
    private javax.swing.JLabel Cubo3C1E;
    private javax.swing.JLabel Cubo3C1G;
    private javax.swing.JLabel Cubo3C1J;
    private javax.swing.JComboBox<String> Cubo3C2;
    private javax.swing.JLabel Cubo3C2G;
    private javax.swing.JLabel Cubo3C2J;
    private javax.swing.JComboBox<String> Cubo3C3;
    private javax.swing.JLabel Cubo3C3E;
    private javax.swing.JLabel Cubo3C3G;
    private javax.swing.JLabel Cubo3C3J;
    private javax.swing.JLabel Cubo3C3T;
    private javax.swing.JComboBox<String> Cubo3C4;
    private javax.swing.JLabel Cubo3C4E;
    private javax.swing.JLabel Cubo3C4G;
    private javax.swing.JLabel Cubo3C4J;
    private javax.swing.JLabel Cubo3C4T;
    private javax.swing.JComboBox<String> Cubo3C5;
    private javax.swing.JLabel Cubo3C5E;
    private javax.swing.JLabel Cubo3C5G;
    private javax.swing.JLabel Cubo3C5J;
    private javax.swing.JLabel Cubo3C5T;
    private javax.swing.JComboBox<String> Cubo3C6;
    private javax.swing.JLabel Cubo3C6E;
    private javax.swing.JLabel Cubo3C6G;
    private javax.swing.JLabel Cubo3C6J;
    private javax.swing.JLabel Cubo3C6T;
    private javax.swing.JLabel Cubo3Lbl;
    private javax.swing.JComboBox<String> Cubo4C1;
    private javax.swing.JLabel Cubo4C1E;
    private javax.swing.JLabel Cubo4C1G;
    private javax.swing.JLabel Cubo4C1J;
    private javax.swing.JComboBox<String> Cubo4C2;
    private javax.swing.JLabel Cubo4C2G;
    private javax.swing.JLabel Cubo4C2J;
    private javax.swing.JComboBox<String> Cubo4C3;
    private javax.swing.JLabel Cubo4C3E;
    private javax.swing.JLabel Cubo4C3G;
    private javax.swing.JLabel Cubo4C3J;
    private javax.swing.JLabel Cubo4C3T;
    private javax.swing.JComboBox<String> Cubo4C4;
    private javax.swing.JLabel Cubo4C4E;
    private javax.swing.JLabel Cubo4C4G;
    private javax.swing.JLabel Cubo4C4J;
    private javax.swing.JLabel Cubo4C4T;
    private javax.swing.JComboBox<String> Cubo4C5;
    private javax.swing.JLabel Cubo4C5E;
    private javax.swing.JLabel Cubo4C5G;
    private javax.swing.JLabel Cubo4C5J;
    private javax.swing.JLabel Cubo4C5T;
    private javax.swing.JComboBox<String> Cubo4C6;
    private javax.swing.JLabel Cubo4C6E;
    private javax.swing.JLabel Cubo4C6G;
    private javax.swing.JLabel Cubo4C6J;
    private javax.swing.JLabel Cubo4C6T;
    private javax.swing.JLabel Cubo4Lbl;
    private javax.swing.JButton InterCubo1_Cubo2;
    private javax.swing.JButton InterCubo2_Cubo3;
    private javax.swing.JButton InterCubo3_Cubo4;
    private javax.swing.JButton abajoCubo1;
    private javax.swing.JButton abajoCubo2;
    private javax.swing.JButton abajoCubo3;
    private javax.swing.JButton abajoCubo4;
    private javax.swing.JButton antihorarioCubo1;
    private javax.swing.JButton antihorarioCubo2;
    private javax.swing.JButton antihorarioCubo3;
    private javax.swing.JButton antihorarioCubo4;
    private javax.swing.JButton arribaCubo1;
    private javax.swing.JButton arribaCubo2;
    private javax.swing.JButton arribaCubo3;
    private javax.swing.JButton arribaCubo4;
    private javax.swing.JButton comprobarBtn;
    private javax.swing.JButton derechaCubo1;
    private javax.swing.JButton derechaCubo2;
    private javax.swing.JButton derechaCubo3;
    private javax.swing.JButton derechaCubo4;
    private javax.swing.JLabel existeSolucion;
    private javax.swing.JButton explicacionBtn;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton genAleatorio;
    private javax.swing.JButton genCubo1;
    private javax.swing.JButton genCubo2;
    private javax.swing.JButton genCubo3;
    private javax.swing.JButton genCubo4;
    public static javax.swing.JPanel grafoG1;
    public static javax.swing.JPanel grafoG2;
    public static javax.swing.JPanel grafoGL;
    private javax.swing.JButton horarioCubo1;
    private javax.swing.JButton horarioCubo2;
    private javax.swing.JButton horarioCubo3;
    private javax.swing.JButton horarioCubo4;
    private javax.swing.JButton izquierdaCubo1;
    private javax.swing.JButton izquierdaCubo2;
    private javax.swing.JButton izquierdaCubo3;
    private javax.swing.JButton izquierdaCubo4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JButton jugarBtn;
    private javax.swing.JLabel porLoTanto1;
    private javax.swing.JLabel porLoTanto2;
    private javax.swing.JButton resolverBtn;
    private javax.swing.JLabel resueltoLbl;
    // End of variables declaration//GEN-END:variables
}
