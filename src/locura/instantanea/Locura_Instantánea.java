/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locura.instantanea;

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
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.Timer;

/**
 *
 * @author carlo
 */
public class Locura_Instantánea extends javax.swing.JFrame implements Serializable {

    public static Cubos Cubo1 = new Cubos();
    public static Cubos Cubo2 = new Cubos();
    public static Cubos Cubo3 = new Cubos();
    public static Cubos Cubo4 = new Cubos();
    Color Rojo = new Color(155, 22, 57);
    Color Blanco = new Color(255, 255, 255);
    Color Verde = new Color(16, 175, 107);
    Color Amarillo = new Color(255, 234, 78);

    public ArrayList<Partidas> partidas = new ArrayList<>();
    public ArrayList<Soluciones> soluciones = new ArrayList<>();
    // Binarios
    public static Binarios Cubo1Bin = new Binarios();
    public static Binarios Cubo2Bin = new Binarios();
    public static Binarios Cubo3Bin = new Binarios();
    public static Binarios Cubo4Bin = new Binarios();
    public static ArrayList<Binarios> partidasBin = new ArrayList<>();
    public static Binarios solucionAplicadaBin = new Binarios();

    //BIN Cubos
    // Guardar
    public static FileOutputStream F_binCubosOut;
    public static String binCubosNOut = "Binarios\\Cubos.bin";
    public static ObjectOutputStream O_binCubosOut;
    // Cargar
    public static FileInputStream F_binCubosIn;
    public static String binCubosNIn = "Binarios\\Cubos.bin";
    public static ObjectInputStream O_binCubosIn;

    //BIN Partidas
    // Guardar
    public static FileOutputStream F_binPartidasOut;
    public static String binPartidasNOut = "Binarios\\Partidas.bin";
    public static ObjectOutputStream O_binPartidasOut;
    // Cargar
    public static FileInputStream F_binPartidasIn;
    public static String binPartidasNIn = "Binarios\\Partidas.bin";
    public static ObjectInputStream O_binPartidasIn;

    boolean iniciado = false;
    boolean sigBtnPressed = false;
    boolean resuelto = false;
    boolean resolverBtnClicked = false;
    boolean reset = false;
    boolean aplicado = false;
    ImageIcon icono = new ImageIcon("Binarios\\logo.png");

    Point posCubo1Abs = new Point(260, 540);
    Point posCubo2Abs = new Point(260, 480);
    Point posCubo3Abs = new Point(260, 420);
    Point posCubo4Abs = new Point(260, 360);

    public Timer timer;
    public int iPartida;
    public int solucionAplicada;

    public Locura_Instantánea() {
        System.out.println("Inicio");
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
        iniciado = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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
        jSeparator1 = new javax.swing.JSeparator();
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
        solucionPost = new javax.swing.JButton();
        solucionPrev = new javax.swing.JButton();
        noSoluciones = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        existeSolucion = new javax.swing.JLabel();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        solucionLbl = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        aplicarBtn = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        Cubo1C5G1 = new javax.swing.JLabel();
        Cubo1C3G1 = new javax.swing.JLabel();
        Cubo1C1G1 = new javax.swing.JLabel();
        Cubo1C2G1 = new javax.swing.JLabel();
        Cubo1C6G1 = new javax.swing.JLabel();
        Cubo1C4G1 = new javax.swing.JLabel();
        Cubo2C1G1 = new javax.swing.JLabel();
        Cubo2C3G1 = new javax.swing.JLabel();
        Cubo2C5G1 = new javax.swing.JLabel();
        Cubo2C2G1 = new javax.swing.JLabel();
        Cubo2C6G1 = new javax.swing.JLabel();
        Cubo2C4G1 = new javax.swing.JLabel();
        Cubo3C1G1 = new javax.swing.JLabel();
        Cubo3C3G1 = new javax.swing.JLabel();
        Cubo3C5G1 = new javax.swing.JLabel();
        Cubo3C2G1 = new javax.swing.JLabel();
        Cubo3C6G1 = new javax.swing.JLabel();
        Cubo3C4G1 = new javax.swing.JLabel();
        Cubo4C1G1 = new javax.swing.JLabel();
        Cubo4C3G1 = new javax.swing.JLabel();
        Cubo4C5G1 = new javax.swing.JLabel();
        Cubo4C2G1 = new javax.swing.JLabel();
        Cubo4C6G1 = new javax.swing.JLabel();
        Cubo4C4G1 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        noPartida = new javax.swing.JComboBox<>();
        jLabel78 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        Cubo1C1H = new javax.swing.JLabel();
        Cubo1C2H = new javax.swing.JLabel();
        Cubo1C3H = new javax.swing.JLabel();
        Cubo1C4H = new javax.swing.JLabel();
        Cubo1C5H = new javax.swing.JLabel();
        Cubo1C6H = new javax.swing.JLabel();
        Cubo2C1H = new javax.swing.JLabel();
        Cubo2C2H = new javax.swing.JLabel();
        Cubo2C3H = new javax.swing.JLabel();
        Cubo2C4H = new javax.swing.JLabel();
        Cubo2C5H = new javax.swing.JLabel();
        Cubo2C6H = new javax.swing.JLabel();
        Cubo3C1H = new javax.swing.JLabel();
        Cubo3C2H = new javax.swing.JLabel();
        Cubo3C3H = new javax.swing.JLabel();
        Cubo3C4H = new javax.swing.JLabel();
        Cubo3C5H = new javax.swing.JLabel();
        Cubo3C6H = new javax.swing.JLabel();
        Cubo4C1H = new javax.swing.JLabel();
        Cubo4C2H = new javax.swing.JLabel();
        Cubo4C3H = new javax.swing.JLabel();
        Cubo4C4H = new javax.swing.JLabel();
        Cubo4C5H = new javax.swing.JLabel();
        Cubo4C6H = new javax.swing.JLabel();
        checkLbl = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        borrarHistorial = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locura/fondo.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 930, 770));

        jLabel2.setFont(new java.awt.Font("Snap ITC", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(127, 27, 53));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locura/instantanea/Logo_LocInst.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 14, 698, -1));

        jTabbedPane1.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel5.setText("Cubo 1");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 74, -1));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel6.setText("Cubo 2");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 74, -1));

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel7.setText("Cubo 3");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 74, -1));

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel8.setText("Cubo 4");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 74, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 58, 61), 2, true));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 3, 260));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 58, 61), 2, true));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 3, 260));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 58, 61), 2, true));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 3, 260));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 58, 61), 2, true));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, 3, 260));

        jLabel33.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel33.setText("Cara 1");
        jLabel33.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel33.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, -1));

        Cubo1C1.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo1C1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo1C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo1C1ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo1C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, -1));

        jLabel34.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel34.setText("Cara 2");
        jLabel34.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel34.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, -1));

        Cubo1C2.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo1C2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo1C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo1C2ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo1C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 120, -1));

        jLabel35.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel35.setText("Cara 3");
        jLabel35.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel35.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 60, -1));

        Cubo1C3.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo1C3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo1C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo1C3ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo1C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 120, -1));

        jLabel36.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel36.setText("Cara 4");
        jLabel36.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel36.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 60, -1));

        Cubo1C4.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo1C4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo1C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo1C4ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo1C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 120, -1));

        jLabel37.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel37.setText("Cara 5");
        jLabel37.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel37.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 60, -1));

        Cubo1C5.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo1C5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo1C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo1C5ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo1C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 120, -1));

        jLabel38.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel38.setText("Cara 6");
        jLabel38.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel38.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 60, -1));

        Cubo1C6.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo1C6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo1C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo1C6ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo1C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 120, -1));

        jLabel21.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel21.setText("Cara 1");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel21.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 60, -1));

        Cubo3C1.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo3C1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo3C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo3C1ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo3C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 120, -1));

        jLabel22.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel22.setText("Cara 2");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel22.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 60, -1));

        Cubo3C2.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo3C2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo3C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo3C2ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo3C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 120, -1));

        jLabel23.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel23.setText("Cara 3");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel23.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 60, -1));

        Cubo3C3.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo3C3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo3C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo3C3ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo3C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 120, -1));

        jLabel24.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel24.setText("Cara 4");
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel24.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 60, -1));

        Cubo3C4.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo3C4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo3C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo3C4ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo3C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 120, -1));

        jLabel25.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel25.setText("Cara 5");
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel25.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 60, -1));

        Cubo3C5.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo3C5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo3C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo3C5ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo3C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 120, -1));

        jLabel26.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel26.setText("Cara 6");
        jLabel26.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel26.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 60, -1));

        Cubo3C6.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo3C6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo3C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo3C6ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo3C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 120, -1));

        jLabel39.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel39.setText("Cara 1");
        jLabel39.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel39.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 60, -1));

        Cubo4C1.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo4C1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo4C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo4C1ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo4C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 120, -1));

        jLabel40.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel40.setText("Cara 2");
        jLabel40.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel40.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 60, -1));

        Cubo4C2.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo4C2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo4C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo4C2ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo4C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 120, -1));

        jLabel41.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel41.setText("Cara 3");
        jLabel41.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel41.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 60, -1));

        Cubo4C3.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo4C3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo4C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo4C3ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo4C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 120, -1));

        jLabel42.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel42.setText("Cara 4");
        jLabel42.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel42.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 60, -1));

        Cubo4C4.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo4C4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo4C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo4C4ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo4C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 120, -1));

        jLabel43.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel43.setText("Cara 5");
        jLabel43.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel43.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 60, -1));

        Cubo4C5.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo4C5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo4C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo4C5ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo4C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 120, -1));

        jLabel44.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel44.setText("Cara 6");
        jLabel44.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel44.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 60, -1));

        Cubo4C6.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo4C6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo4C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo4C6ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo4C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, 120, -1));

        jugarBtn.setBackground(new java.awt.Color(135, 146, 255));
        jugarBtn.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jugarBtn.setForeground(new java.awt.Color(0, 0, 0));
        jugarBtn.setText("JUGAR");
        jugarBtn.setAlignmentX(jTabbedPane1.getAlignmentX());
        jugarBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jugarBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jugarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jugarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 547, 180, 36));

        jLabel45.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel45.setText("Cara 1");
        jLabel45.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel45.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 60, -1));

        Cubo2C1.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo2C1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo2C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo2C1ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo2C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 120, -1));

        jLabel46.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel46.setText("Cara 2");
        jLabel46.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel46.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 60, -1));

        Cubo2C2.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo2C2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo2C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo2C2ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo2C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 120, -1));

        jLabel47.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel47.setText("Cara 3");
        jLabel47.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel47.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 60, -1));

        Cubo2C3.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo2C3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo2C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo2C3ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo2C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 120, -1));

        jLabel48.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel48.setText("Cara 4");
        jLabel48.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel48.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 60, -1));

        Cubo2C4.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo2C4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo2C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo2C4ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo2C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 120, -1));

        jLabel49.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel49.setText("Cara 5");
        jLabel49.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel49.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 60, -1));

        Cubo2C5.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo2C5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo2C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo2C5ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo2C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 120, -1));

        jLabel50.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel50.setText("Cara 6");
        jLabel50.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel50.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 60, -1));

        Cubo2C6.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo2C6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Verde", "Amarillo" }));
        Cubo2C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cubo2C6ActionPerformed(evt);
            }
        });
        jPanel1.add(Cubo2C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 120, -1));

        genAleatorio.setBackground(new java.awt.Color(122, 37, 55));
        genAleatorio.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        genAleatorio.setForeground(new java.awt.Color(255, 255, 255));
        genAleatorio.setText("ALEATORIO");
        genAleatorio.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        genAleatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        genAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genAleatorioActionPerformed(evt);
            }
        });
        jPanel1.add(genAleatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 10, 170, 32));

        Cubo1C5G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C5G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C5G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C5G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C5G.setText("5");
        Cubo1C5G.setOpaque(true);
        jPanel1.add(Cubo1C5G, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 431, 31, 31));

        Cubo1C3G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C3G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C3G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C3G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C3G.setText("3");
        Cubo1C3G.setOpaque(true);
        jPanel1.add(Cubo1C3G, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 394, 31, 31));

        Cubo1C1G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C1G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C1G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C1G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C1G.setText("1");
        Cubo1C1G.setOpaque(true);
        jPanel1.add(Cubo1C1G, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 431, 31, 31));

        Cubo1C2G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C2G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C2G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C2G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C2G.setText("2");
        Cubo1C2G.setOpaque(true);
        jPanel1.add(Cubo1C2G, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 431, 31, 31));

        Cubo1C6G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C6G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C6G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C6G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C6G.setText("6");
        Cubo1C6G.setOpaque(true);
        jPanel1.add(Cubo1C6G, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 431, 31, 31));

        Cubo1C4G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C4G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C4G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C4G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C4G.setText("4");
        Cubo1C4G.setOpaque(true);
        jPanel1.add(Cubo1C4G, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 468, 31, 31));

        Cubo2C1G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C1G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C1G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C1G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C1G.setText("1");
        Cubo2C1G.setOpaque(true);
        jPanel1.add(Cubo2C1G, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 431, 31, 31));

        Cubo2C3G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C3G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C3G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C3G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C3G.setText("3");
        Cubo2C3G.setOpaque(true);
        jPanel1.add(Cubo2C3G, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 394, 31, 31));

        Cubo2C5G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C5G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C5G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C5G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C5G.setText("5");
        Cubo2C5G.setOpaque(true);
        jPanel1.add(Cubo2C5G, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 431, 31, 31));

        Cubo2C2G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C2G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C2G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C2G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C2G.setText("2");
        Cubo2C2G.setOpaque(true);
        jPanel1.add(Cubo2C2G, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 431, 31, 31));

        Cubo2C6G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C6G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C6G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C6G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C6G.setText("6");
        Cubo2C6G.setOpaque(true);
        jPanel1.add(Cubo2C6G, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 431, 31, 31));

        Cubo2C4G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C4G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C4G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C4G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C4G.setText("4");
        Cubo2C4G.setOpaque(true);
        jPanel1.add(Cubo2C4G, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 468, 31, 31));

        Cubo3C1G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C1G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C1G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C1G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C1G.setText("1");
        Cubo3C1G.setOpaque(true);
        jPanel1.add(Cubo3C1G, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 431, 31, 31));

        Cubo3C3G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C3G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C3G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C3G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C3G.setText("3");
        Cubo3C3G.setOpaque(true);
        jPanel1.add(Cubo3C3G, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 394, 31, 31));

        Cubo3C5G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C5G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C5G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C5G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C5G.setText("5");
        Cubo3C5G.setOpaque(true);
        jPanel1.add(Cubo3C5G, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 431, 31, 31));

        Cubo3C2G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C2G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C2G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C2G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C2G.setText("2");
        Cubo3C2G.setOpaque(true);
        jPanel1.add(Cubo3C2G, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 431, 31, 31));

        Cubo3C6G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C6G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C6G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C6G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C6G.setText("6");
        Cubo3C6G.setOpaque(true);
        jPanel1.add(Cubo3C6G, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 431, 31, 31));

        Cubo3C4G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C4G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C4G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C4G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C4G.setText("4");
        Cubo3C4G.setOpaque(true);
        jPanel1.add(Cubo3C4G, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 468, 31, 31));

        Cubo4C1G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C1G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C1G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C1G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C1G.setText("1");
        Cubo4C1G.setOpaque(true);
        jPanel1.add(Cubo4C1G, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 431, 31, 31));

        Cubo4C3G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C3G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C3G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C3G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C3G.setText("3");
        Cubo4C3G.setOpaque(true);
        jPanel1.add(Cubo4C3G, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 394, 31, 31));

        Cubo4C5G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C5G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C5G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C5G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C5G.setText("5");
        Cubo4C5G.setOpaque(true);
        jPanel1.add(Cubo4C5G, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 431, 31, 31));

        Cubo4C2G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C2G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C2G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C2G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C2G.setText("2");
        Cubo4C2G.setOpaque(true);
        jPanel1.add(Cubo4C2G, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 431, 31, 31));

        Cubo4C6G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C6G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C6G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C6G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C6G.setText("6");
        Cubo4C6G.setOpaque(true);
        jPanel1.add(Cubo4C6G, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 431, 31, 31));

        Cubo4C4G.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C4G.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C4G.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C4G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C4G.setText("4");
        Cubo4C4G.setOpaque(true);
        jPanel1.add(Cubo4C4G, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 468, 31, 31));

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel9.setText("1)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 368, 30, -1));

        jLabel10.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel10.setText("2)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 368, 30, -1));

        jLabel11.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel11.setText("3)");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 368, 30, -1));

        jLabel12.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel12.setText("4)");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 368, 30, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 58, 61), 2, true));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 3, 260));

        jTabbedPane1.addTab("Combinación", jPanel1);

        jPanel2.setLayout(null);

        resolverBtn.setBackground(new java.awt.Color(122, 37, 55));
        resolverBtn.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        resolverBtn.setForeground(new java.awt.Color(255, 255, 255));
        resolverBtn.setText("RESOLVER");
        resolverBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        resolverBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        resolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolverBtnActionPerformed(evt);
            }
        });
        jPanel2.add(resolverBtn);
        resolverBtn.setBounds(280, 260, 140, 32);

        Cubo4C3T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C3T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C3T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C3T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C3T.setText("4");
        Cubo4C3T.setOpaque(true);
        jPanel2.add(Cubo4C3T);
        Cubo4C3T.setBounds(260, 360, 50, 50);

        arribaCubo1.setBackground(new java.awt.Color(135, 146, 255));
        arribaCubo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        arribaCubo1.setForeground(new java.awt.Color(0, 0, 0));
        arribaCubo1.setText("▲");
        arribaCubo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaCubo1ActionPerformed(evt);
            }
        });
        jPanel2.add(arribaCubo1);
        arribaCubo1.setBounds(86, 40, 25, 25);

        izquierdaCubo1.setBackground(new java.awt.Color(135, 146, 255));
        izquierdaCubo1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        izquierdaCubo1.setForeground(new java.awt.Color(0, 0, 0));
        izquierdaCubo1.setText("◄");
        izquierdaCubo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izquierdaCubo1ActionPerformed(evt);
            }
        });
        jPanel2.add(izquierdaCubo1);
        izquierdaCubo1.setBounds(20, 100, 25, 25);

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

        derechaCubo1.setBackground(new java.awt.Color(135, 146, 255));
        derechaCubo1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        derechaCubo1.setForeground(new java.awt.Color(0, 0, 0));
        derechaCubo1.setText("►");
        derechaCubo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaCubo1ActionPerformed(evt);
            }
        });
        jPanel2.add(derechaCubo1);
        derechaCubo1.setBounds(150, 100, 25, 25);

        abajoCubo1.setBackground(new java.awt.Color(135, 146, 255));
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

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel13.setText("1)");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(23, 44, 20, 19);

        horarioCubo1.setBackground(new java.awt.Color(135, 146, 255));
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

        antihorarioCubo1.setBackground(new java.awt.Color(135, 146, 255));
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

        izquierdaCubo2.setBackground(new java.awt.Color(135, 146, 255));
        izquierdaCubo2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
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

        arribaCubo2.setBackground(new java.awt.Color(135, 146, 255));
        arribaCubo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        arribaCubo2.setForeground(new java.awt.Color(0, 0, 0));
        arribaCubo2.setText("▲");
        arribaCubo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaCubo2ActionPerformed(evt);
            }
        });
        jPanel2.add(arribaCubo2);
        arribaCubo2.setBounds(303, 38, 25, 25);

        jLabel14.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel14.setText("2)");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(240, 44, 20, 19);

        Cubo2C2J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C2J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C2J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C2J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C2J.setText("2");
        Cubo2C2J.setOpaque(true);
        jPanel2.add(Cubo2C2J);
        Cubo2C2J.setBounds(382, 42, 25, 25);

        derechaCubo2.setBackground(new java.awt.Color(135, 146, 255));
        derechaCubo2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        derechaCubo2.setForeground(new java.awt.Color(0, 0, 0));
        derechaCubo2.setText("►");
        derechaCubo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaCubo2ActionPerformed(evt);
            }
        });
        jPanel2.add(derechaCubo2);
        derechaCubo2.setBounds(365, 100, 25, 25);

        abajoCubo2.setBackground(new java.awt.Color(135, 146, 255));
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

        horarioCubo2.setBackground(new java.awt.Color(135, 146, 255));
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

        antihorarioCubo2.setBackground(new java.awt.Color(135, 146, 255));
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

        izquierdaCubo3.setBackground(new java.awt.Color(135, 146, 255));
        izquierdaCubo3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
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

        arribaCubo3.setBackground(new java.awt.Color(135, 146, 255));
        arribaCubo3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        arribaCubo3.setForeground(new java.awt.Color(0, 0, 0));
        arribaCubo3.setText("▲");
        arribaCubo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaCubo3ActionPerformed(evt);
            }
        });
        jPanel2.add(arribaCubo3);
        arribaCubo3.setBounds(532, 38, 25, 25);

        jLabel15.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel15.setText("3)");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(469, 44, 20, 19);

        Cubo3C2J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C2J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C2J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C2J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C2J.setText("2");
        Cubo3C2J.setOpaque(true);
        jPanel2.add(Cubo3C2J);
        Cubo3C2J.setBounds(611, 42, 25, 25);

        derechaCubo3.setBackground(new java.awt.Color(135, 146, 255));
        derechaCubo3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        derechaCubo3.setForeground(new java.awt.Color(0, 0, 0));
        derechaCubo3.setText("►");
        derechaCubo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaCubo3ActionPerformed(evt);
            }
        });
        jPanel2.add(derechaCubo3);
        derechaCubo3.setBounds(594, 100, 25, 25);

        abajoCubo3.setBackground(new java.awt.Color(135, 146, 255));
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

        horarioCubo3.setBackground(new java.awt.Color(135, 146, 255));
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

        antihorarioCubo3.setBackground(new java.awt.Color(135, 146, 255));
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

        izquierdaCubo4.setBackground(new java.awt.Color(135, 146, 255));
        izquierdaCubo4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
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

        arribaCubo4.setBackground(new java.awt.Color(135, 146, 255));
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

        jLabel16.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel16.setText("4)");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(700, 44, 20, 19);

        Cubo4C2J.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C2J.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C2J.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C2J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C2J.setText("2");
        Cubo4C2J.setOpaque(true);
        jPanel2.add(Cubo4C2J);
        Cubo4C2J.setBounds(842, 42, 25, 25);

        derechaCubo4.setBackground(new java.awt.Color(135, 146, 255));
        derechaCubo4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        derechaCubo4.setForeground(new java.awt.Color(0, 0, 0));
        derechaCubo4.setText("►");
        derechaCubo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaCubo4ActionPerformed(evt);
            }
        });
        jPanel2.add(derechaCubo4);
        derechaCubo4.setBounds(825, 100, 25, 25);

        abajoCubo4.setBackground(new java.awt.Color(135, 146, 255));
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

        horarioCubo4.setBackground(new java.awt.Color(135, 146, 255));
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

        antihorarioCubo4.setBackground(new java.awt.Color(135, 146, 255));
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

        resueltoLbl.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        resueltoLbl.setForeground(new java.awt.Color(255, 202, 117));
        resueltoLbl.setText("RESUELTO!");
        resueltoLbl.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(resueltoLbl);
        resueltoLbl.setBounds(392, 330, 90, 19);

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

        Cubo4Lbl.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        Cubo4Lbl.setText("4)");
        jPanel2.add(Cubo4Lbl);
        Cubo4Lbl.setBounds(230, 370, 20, 19);

        Cubo1Lbl.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        Cubo1Lbl.setText("1)");
        jPanel2.add(Cubo1Lbl);
        Cubo1Lbl.setBounds(230, 550, 20, 19);

        Cubo2Lbl.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        Cubo2Lbl.setText("2)");
        jPanel2.add(Cubo2Lbl);
        Cubo2Lbl.setBounds(230, 490, 20, 19);

        Cubo3Lbl.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        Cubo3Lbl.setText("3)");
        jPanel2.add(Cubo3Lbl);
        Cubo3Lbl.setBounds(230, 430, 20, 19);

        jLabel28.setFont(new java.awt.Font("Consolas", 1, 21)); // NOI18N
        jLabel28.setText("Vistas Laterales de la Torre");
        jLabel28.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel28.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel28);
        jLabel28.setBounds(272, 300, 320, 25);

        explicacionBtn.setBackground(new java.awt.Color(135, 146, 255));
        explicacionBtn.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        explicacionBtn.setForeground(new java.awt.Color(0, 0, 0));
        explicacionBtn.setText("EXPLICACIÓN");
        explicacionBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        explicacionBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        explicacionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explicacionBtnActionPerformed(evt);
            }
        });
        jPanel2.add(explicacionBtn);
        explicacionBtn.setBounds(440, 260, 140, 32);

        jSeparator6.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 58, 61), 2, true));
        jSeparator6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(jSeparator6);
        jSeparator6.setBounds(530, 370, 3, 210);

        jSeparator7.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 58, 61), 2, true));
        jSeparator7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(jSeparator7);
        jSeparator7.setBounds(330, 370, 3, 210);

        jSeparator8.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 58, 61), 2, true));
        jSeparator8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(jSeparator8);
        jSeparator8.setBounds(427, 370, 3, 210);

        InterCubo1_Cubo2.setBackground(new java.awt.Color(135, 146, 255));
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

        InterCubo2_Cubo3.setBackground(new java.awt.Color(135, 146, 255));
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

        InterCubo3_Cubo4.setBackground(new java.awt.Color(135, 146, 255));
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

        solucionPost.setBackground(new java.awt.Color(122, 37, 55));
        solucionPost.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        solucionPost.setForeground(new java.awt.Color(255, 255, 255));
        solucionPost.setText("►");
        solucionPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solucionPostActionPerformed(evt);
            }
        });
        jPanel2.add(solucionPost);
        solucionPost.setBounds(470, 230, 25, 25);

        solucionPrev.setBackground(new java.awt.Color(122, 37, 55));
        solucionPrev.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        solucionPrev.setForeground(new java.awt.Color(255, 255, 255));
        solucionPrev.setText("◄");
        solucionPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solucionPrevActionPerformed(evt);
            }
        });
        jPanel2.add(solucionPrev);
        solucionPrev.setBounds(360, 230, 25, 25);

        noSoluciones.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        noSoluciones.setForeground(new java.awt.Color(255, 202, 117));
        noSoluciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noSoluciones.setText("81 / 81");
        jPanel2.add(noSoluciones);
        noSoluciones.setBounds(384, 235, 87, 20);

        jTabbedPane1.addTab("Juego", jPanel2);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setEnabled(false);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Consolas", 0, 17)); // NOI18N
        jTextArea3.setRows(2);
        jTextArea3.setText("Utilizando la teoría de Grafos, se construye un grafo Gl que represente a los 4 cubos \ncon las siguientes reglas:\n - El grafo tiene 4 vértices que representan los 4 colores posibles (R, B, V, A).\n - Las aristas representan caras opuestas de cada cubo, 3 aristas por cubo.\n - Las aristas se etiquetan con el número del cubo (1, 2, 3, 4).    ↓ Deslice hacia abajo ↓\n\nDespués, se construyen 2 subgrafos de Gl (si existen) que representan las soluciones \nhorizontal y vertical, se deben seguir las siguientes reglas:\n - Cada subgrafo debe tener los 4 vértices de Gl\n - Cada subgrafo debe tener únicamente 4 aristas, 1 arista por cubo. (etiquetas 1,2,3,4)\n - El grado de cada vértice debe ser igual a 2\n - Las aristas del 1er subgrafo no se deben repetir en el 2do subgrafo\n\nInterpretación de subgrafos G1 y G2 :\n\nPor último, se interpretan ambos subgrafos de la siguiente forma:\n Solución Horizontal: (Grafo G1- recorrido horario)\n - Se localiza la arista 1 (cubo 1) y se observa que vértices conecta.\n - En el cubo 1 se colocan estos 2 colores, de izquierda a derecha. (por ejemplo, R-B)\n - Se observa en que vértice termina la arista 1, y a partir de ese vértice se observa la\n   siguiente arista y los vértices que conecta, así sucesivamente. Siempre en sentido\n   horario.                                                          Deslice hacia abajo ↓\n\nSolución Vertical: (Grafo G2- recorrido horario)\n - Se localiza la arista 1 (cubo 1) y se observa que vértices conecta.\n - En el cubo 1 se colocan estos 2 colores, de arriba hacia abajo. (por ejemplo, V-A)\n - Se observa en que vértice termina la arista 1, y a partir de ese vértice se observa la\n   siguiente arista y los vértices que conecta, así sucesivamente. Siempre en sentido\n   horario.");
        jTextArea3.setBorder(null);
        jTextArea3.setFocusable(false);
        jScrollPane3.setViewportView(jTextArea3);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 900, 130));

        existeSolucion.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        existeSolucion.setForeground(new java.awt.Color(45, 160, 106));
        existeSolucion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        existeSolucion.setText("Solución del Juego");
        jPanel6.add(existeSolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 290, -1));

        Cubo1C1E.setBackground(new java.awt.Color(42, 44, 48));
        Cubo1C1E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C1E.setForeground(new java.awt.Color(255, 202, 117));
        Cubo1C1E.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C1E.setText("1");
        Cubo1C1E.setOpaque(true);
        jPanel6.add(Cubo1C1E, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 80, 80));

        Cubo1C6E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C6E.setText("R");
        jPanel6.add(Cubo1C6E, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, -1, -1));

        Cubo1C3E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C3E.setText("R");
        jPanel6.add(Cubo1C3E, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, -1, -1));

        Cubo1C5E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C5E.setText("R");
        jPanel6.add(Cubo1C5E, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, -1, -1));

        Cubo1C4E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C4E.setText("R");
        jPanel6.add(Cubo1C4E, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, -1, -1));

        Cubo2C3E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C3E.setText("R");
        jPanel6.add(Cubo2C3E, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, -1));

        Cubo2C6E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C6E.setText("R");
        jPanel6.add(Cubo2C6E, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        Cubo2C5E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C5E.setText("R");
        jPanel6.add(Cubo2C5E, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, -1, -1));

        Cubo2C4E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C4E.setText("R");
        jPanel6.add(Cubo2C4E, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, -1, -1));

        Cubo2C1E.setBackground(new java.awt.Color(42, 44, 48));
        Cubo2C1E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C1E.setForeground(new java.awt.Color(255, 202, 117));
        Cubo2C1E.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C1E.setText("2");
        Cubo2C1E.setOpaque(true);
        jPanel6.add(Cubo2C1E, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 80, 80));

        Cubo3C3E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C3E.setText("R");
        jPanel6.add(Cubo3C3E, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, -1, -1));

        Cubo3C6E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C6E.setText("R");
        jPanel6.add(Cubo3C6E, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, -1, -1));

        Cubo3C5E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C5E.setText("R");
        jPanel6.add(Cubo3C5E, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, -1, -1));

        Cubo3C4E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C4E.setText("R");
        jPanel6.add(Cubo3C4E, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 570, -1, -1));

        Cubo3C1E.setBackground(new java.awt.Color(42, 44, 48));
        Cubo3C1E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C1E.setForeground(new java.awt.Color(255, 202, 117));
        Cubo3C1E.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C1E.setText("3");
        Cubo3C1E.setOpaque(true);
        jPanel6.add(Cubo3C1E, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 80, 80));

        Cubo4C3E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C3E.setText("R");
        jPanel6.add(Cubo4C3E, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, -1, -1));

        Cubo4C6E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C6E.setText("R");
        jPanel6.add(Cubo4C6E, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, -1, -1));

        Cubo4C5E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C5E.setText("R");
        jPanel6.add(Cubo4C5E, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 520, -1, -1));

        Cubo4C4E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C4E.setText("R");
        jPanel6.add(Cubo4C4E, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 570, -1, -1));

        Cubo4C1E.setBackground(new java.awt.Color(42, 44, 48));
        Cubo4C1E.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C1E.setForeground(new java.awt.Color(255, 202, 117));
        Cubo4C1E.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C1E.setText("4");
        Cubo4C1E.setOpaque(true);
        jPanel6.add(Cubo4C1E, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, 80, 80));
        jPanel6.add(grafoGL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 280, 230));
        jPanel6.add(grafoG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 230, 220));
        jPanel6.add(grafoG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 230, 220));

        jLabel17.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 202, 117));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("GL");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 40, -1));

        jLabel30.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 202, 117));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("G1 : Horizontal");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 430, 180, -1));

        jLabel31.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 202, 117));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("G2 : Vertical");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 430, 160, -1));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("4");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 165, 20, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("1");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 165, 20, -1));

        jLabel4.setBackground(new java.awt.Color(204, 0, 0));
        jLabel4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("2");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 165, 20, -1));

        jLabel18.setBackground(new java.awt.Color(153, 255, 0));
        jLabel18.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 255, 51));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("3");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 165, 20, -1));

        jSeparator15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 58, 61), 2, true));
        jPanel6.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 830, 3));

        jTabbedPane1.addTab("Explicación", jPanel6);

        jPanel4.setLayout(null);

        solucionLbl.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        solucionLbl.setText("SI tiene solución");
        jPanel4.add(solucionLbl);
        solucionLbl.setBounds(700, 18, 220, 19);

        jLabel19.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel19.setText("Cubo 2");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(300, 60, 74, 22);

        jLabel20.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel20.setText("Cubo 3");
        jPanel4.add(jLabel20);
        jLabel20.setBounds(520, 60, 74, 22);

        jLabel27.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel27.setText("Cubo 4");
        jPanel4.add(jLabel27);
        jLabel27.setBounds(750, 60, 74, 22);

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 58, 61), 2, true));
        jPanel4.add(jSeparator9);
        jSeparator9.setBounds(220, 70, 3, 260);

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 58, 61), 2, true));
        jPanel4.add(jSeparator10);
        jSeparator10.setBounds(440, 70, 3, 260);

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 58, 61), 2, true));
        jPanel4.add(jSeparator11);
        jSeparator11.setBounds(670, 70, 3, 260);

        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 58, 61), 2, true));
        jPanel4.add(jSeparator12);
        jSeparator12.setBounds(890, 70, 3, 260);

        jLabel51.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel51.setText("Cara 1");
        jLabel51.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel51.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel51);
        jLabel51.setBounds(20, 100, 60, 19);

        jLabel52.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel52.setText("Cara 2");
        jLabel52.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel52.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel52);
        jLabel52.setBounds(20, 140, 60, 19);

        jLabel53.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel53.setText("Cara 3");
        jLabel53.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel53.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel53);
        jLabel53.setBounds(20, 180, 60, 19);

        jLabel54.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel54.setText("Cara 4");
        jLabel54.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel54.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel54);
        jLabel54.setBounds(20, 220, 60, 19);

        jLabel55.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel55.setText("Cara 5");
        jLabel55.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel55.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel55);
        jLabel55.setBounds(20, 260, 60, 19);

        jLabel56.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel56.setText("Cara 6");
        jLabel56.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel56.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel56);
        jLabel56.setBounds(20, 300, 60, 19);

        jLabel32.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel32.setText("Cara 1");
        jLabel32.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel32.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel32);
        jLabel32.setBounds(470, 100, 60, 19);

        jLabel57.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel57.setText("Cara 2");
        jLabel57.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel57.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel57);
        jLabel57.setBounds(470, 140, 60, 19);

        jLabel58.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel58.setText("Cara 3");
        jLabel58.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel58.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel58);
        jLabel58.setBounds(470, 180, 60, 19);

        jLabel59.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel59.setText("Cara 4");
        jLabel59.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel59.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel59);
        jLabel59.setBounds(470, 220, 60, 19);

        jLabel60.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel60.setText("Cara 5");
        jLabel60.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel60.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel60);
        jLabel60.setBounds(470, 260, 60, 19);

        jLabel61.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel61.setText("Cara 6");
        jLabel61.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel61.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel61);
        jLabel61.setBounds(470, 300, 60, 19);

        jLabel62.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel62.setText("Cara 1");
        jLabel62.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel62.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel62);
        jLabel62.setBounds(690, 100, 60, 19);

        jLabel63.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel63.setText("Cara 2");
        jLabel63.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel63.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel63);
        jLabel63.setBounds(690, 140, 60, 19);

        jLabel64.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel64.setText("Cara 3");
        jLabel64.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel64.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel64);
        jLabel64.setBounds(690, 180, 60, 19);

        jLabel65.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel65.setText("Cara 4");
        jLabel65.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel65.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel65);
        jLabel65.setBounds(690, 220, 60, 19);

        jLabel66.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel66.setText("Cara 5");
        jLabel66.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel66.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel66);
        jLabel66.setBounds(690, 260, 60, 19);

        jLabel67.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel67.setText("Cara 6");
        jLabel67.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel67.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel67);
        jLabel67.setBounds(690, 300, 60, 19);

        aplicarBtn.setBackground(new java.awt.Color(135, 146, 255));
        aplicarBtn.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        aplicarBtn.setForeground(new java.awt.Color(0, 0, 0));
        aplicarBtn.setText("APLICAR");
        aplicarBtn.setAlignmentX(jTabbedPane1.getAlignmentX());
        aplicarBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        aplicarBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        aplicarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarBtnActionPerformed(evt);
            }
        });
        jPanel4.add(aplicarBtn);
        aplicarBtn.setBounds(354, 547, 180, 36);

        jLabel68.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel68.setText("Cara 1");
        jLabel68.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel68.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel68);
        jLabel68.setBounds(250, 100, 60, 19);

        jLabel69.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel69.setText("Cara 2");
        jLabel69.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel69.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel69);
        jLabel69.setBounds(250, 140, 60, 19);

        jLabel70.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel70.setText("Cara 3");
        jLabel70.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel70.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel70);
        jLabel70.setBounds(250, 180, 60, 19);

        jLabel71.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel71.setText("Cara 4");
        jLabel71.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel71.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel71);
        jLabel71.setBounds(250, 220, 60, 19);

        jLabel72.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel72.setText("Cara 5");
        jLabel72.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel72.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel72);
        jLabel72.setBounds(250, 260, 60, 19);

        jLabel73.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel73.setText("Cara 6");
        jLabel73.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel73.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel73);
        jLabel73.setBounds(250, 300, 60, 19);

        Cubo1C5G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C5G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C5G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C5G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C5G1.setText("5");
        Cubo1C5G1.setOpaque(true);
        jPanel4.add(Cubo1C5G1);
        Cubo1C5G1.setBounds(65, 431, 31, 31);

        Cubo1C3G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C3G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C3G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C3G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C3G1.setText("3");
        Cubo1C3G1.setOpaque(true);
        jPanel4.add(Cubo1C3G1);
        Cubo1C3G1.setBounds(65, 394, 31, 31);

        Cubo1C1G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C1G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C1G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C1G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C1G1.setText("1");
        Cubo1C1G1.setOpaque(true);
        jPanel4.add(Cubo1C1G1);
        Cubo1C1G1.setBounds(28, 431, 31, 31);

        Cubo1C2G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C2G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C2G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C2G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C2G1.setText("2");
        Cubo1C2G1.setOpaque(true);
        jPanel4.add(Cubo1C2G1);
        Cubo1C2G1.setBounds(102, 431, 31, 31);

        Cubo1C6G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C6G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C6G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C6G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C6G1.setText("6");
        Cubo1C6G1.setOpaque(true);
        jPanel4.add(Cubo1C6G1);
        Cubo1C6G1.setBounds(139, 431, 31, 31);

        Cubo1C4G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C4G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C4G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C4G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C4G1.setText("4");
        Cubo1C4G1.setOpaque(true);
        jPanel4.add(Cubo1C4G1);
        Cubo1C4G1.setBounds(65, 468, 31, 31);

        Cubo2C1G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C1G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C1G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C1G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C1G1.setText("1");
        Cubo2C1G1.setOpaque(true);
        jPanel4.add(Cubo2C1G1);
        Cubo2C1G1.setBounds(256, 431, 31, 31);

        Cubo2C3G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C3G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C3G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C3G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C3G1.setText("3");
        Cubo2C3G1.setOpaque(true);
        jPanel4.add(Cubo2C3G1);
        Cubo2C3G1.setBounds(293, 394, 31, 31);

        Cubo2C5G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C5G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C5G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C5G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C5G1.setText("5");
        Cubo2C5G1.setOpaque(true);
        jPanel4.add(Cubo2C5G1);
        Cubo2C5G1.setBounds(293, 431, 31, 31);

        Cubo2C2G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C2G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C2G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C2G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C2G1.setText("2");
        Cubo2C2G1.setOpaque(true);
        jPanel4.add(Cubo2C2G1);
        Cubo2C2G1.setBounds(330, 431, 31, 31);

        Cubo2C6G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C6G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C6G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C6G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C6G1.setText("6");
        Cubo2C6G1.setOpaque(true);
        jPanel4.add(Cubo2C6G1);
        Cubo2C6G1.setBounds(367, 431, 31, 31);

        Cubo2C4G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C4G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C4G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C4G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C4G1.setText("4");
        Cubo2C4G1.setOpaque(true);
        jPanel4.add(Cubo2C4G1);
        Cubo2C4G1.setBounds(293, 468, 31, 31);

        Cubo3C1G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C1G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C1G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C1G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C1G1.setText("1");
        Cubo3C1G1.setOpaque(true);
        jPanel4.add(Cubo3C1G1);
        Cubo3C1G1.setBounds(474, 431, 31, 31);

        Cubo3C3G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C3G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C3G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C3G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C3G1.setText("3");
        Cubo3C3G1.setOpaque(true);
        jPanel4.add(Cubo3C3G1);
        Cubo3C3G1.setBounds(511, 394, 31, 31);

        Cubo3C5G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C5G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C5G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C5G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C5G1.setText("5");
        Cubo3C5G1.setOpaque(true);
        jPanel4.add(Cubo3C5G1);
        Cubo3C5G1.setBounds(511, 431, 31, 31);

        Cubo3C2G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C2G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C2G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C2G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C2G1.setText("2");
        Cubo3C2G1.setOpaque(true);
        jPanel4.add(Cubo3C2G1);
        Cubo3C2G1.setBounds(548, 431, 31, 31);

        Cubo3C6G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C6G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C6G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C6G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C6G1.setText("6");
        Cubo3C6G1.setOpaque(true);
        jPanel4.add(Cubo3C6G1);
        Cubo3C6G1.setBounds(585, 431, 31, 31);

        Cubo3C4G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C4G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C4G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C4G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C4G1.setText("4");
        Cubo3C4G1.setOpaque(true);
        jPanel4.add(Cubo3C4G1);
        Cubo3C4G1.setBounds(511, 468, 31, 31);

        Cubo4C1G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C1G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C1G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C1G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C1G1.setText("1");
        Cubo4C1G1.setOpaque(true);
        jPanel4.add(Cubo4C1G1);
        Cubo4C1G1.setBounds(692, 431, 31, 31);

        Cubo4C3G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C3G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C3G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C3G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C3G1.setText("3");
        Cubo4C3G1.setOpaque(true);
        jPanel4.add(Cubo4C3G1);
        Cubo4C3G1.setBounds(729, 394, 31, 31);

        Cubo4C5G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C5G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C5G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C5G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C5G1.setText("5");
        Cubo4C5G1.setOpaque(true);
        jPanel4.add(Cubo4C5G1);
        Cubo4C5G1.setBounds(729, 431, 31, 31);

        Cubo4C2G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C2G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C2G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C2G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C2G1.setText("2");
        Cubo4C2G1.setOpaque(true);
        jPanel4.add(Cubo4C2G1);
        Cubo4C2G1.setBounds(766, 431, 31, 31);

        Cubo4C6G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C6G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C6G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C6G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C6G1.setText("6");
        Cubo4C6G1.setOpaque(true);
        jPanel4.add(Cubo4C6G1);
        Cubo4C6G1.setBounds(803, 431, 31, 31);

        Cubo4C4G1.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C4G1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C4G1.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C4G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C4G1.setText("4");
        Cubo4C4G1.setOpaque(true);
        jPanel4.add(Cubo4C4G1);
        Cubo4C4G1.setBounds(729, 468, 31, 31);

        jLabel74.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel74.setText("1)");
        jPanel4.add(jLabel74);
        jLabel74.setBounds(28, 368, 30, 19);

        jLabel75.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel75.setText("2)");
        jPanel4.add(jLabel75);
        jLabel75.setBounds(256, 368, 30, 19);

        jLabel76.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel76.setText("3)");
        jPanel4.add(jLabel76);
        jLabel76.setBounds(474, 368, 30, 19);

        jLabel77.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel77.setText("4)");
        jPanel4.add(jLabel77);
        jLabel77.setBounds(692, 368, 30, 19);

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 58, 61), 2, true));
        jPanel4.add(jSeparator13);
        jSeparator13.setBounds(0, 70, 3, 260);

        noPartida.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        noPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noPartidaActionPerformed(evt);
            }
        });
        jPanel4.add(noPartida);
        noPartida.setBounds(460, 10, 180, 29);

        jLabel78.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel78.setText("Cubo 1");
        jPanel4.add(jLabel78);
        jLabel78.setBounds(80, 60, 74, 22);

        jSeparator14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 58, 61), 2, true));
        jPanel4.add(jSeparator14);
        jSeparator14.setBounds(0, 45, 900, 3);

        Cubo1C1H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo1C1H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo1C1H.setText("Cara 1");
        Cubo1C1H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo1C1H.setOpaque(true);
        Cubo1C1H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo1C1H);
        Cubo1C1H.setBounds(100, 100, 80, 19);

        Cubo1C2H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo1C2H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo1C2H.setText("Cara 2");
        Cubo1C2H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo1C2H.setOpaque(true);
        Cubo1C2H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo1C2H);
        Cubo1C2H.setBounds(100, 140, 80, 19);

        Cubo1C3H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo1C3H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo1C3H.setText("Cara 3");
        Cubo1C3H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo1C3H.setOpaque(true);
        Cubo1C3H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo1C3H);
        Cubo1C3H.setBounds(100, 180, 80, 19);

        Cubo1C4H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo1C4H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo1C4H.setText("Cara 4");
        Cubo1C4H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo1C4H.setOpaque(true);
        Cubo1C4H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo1C4H);
        Cubo1C4H.setBounds(100, 220, 80, 19);

        Cubo1C5H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo1C5H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo1C5H.setText("Cara 5");
        Cubo1C5H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo1C5H.setOpaque(true);
        Cubo1C5H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo1C5H);
        Cubo1C5H.setBounds(100, 260, 80, 19);

        Cubo1C6H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo1C6H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo1C6H.setText("Cara 6");
        Cubo1C6H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo1C6H.setOpaque(true);
        Cubo1C6H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo1C6H);
        Cubo1C6H.setBounds(100, 300, 80, 19);

        Cubo2C1H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo2C1H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo2C1H.setText("Cara 1");
        Cubo2C1H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo2C1H.setOpaque(true);
        Cubo2C1H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo2C1H);
        Cubo2C1H.setBounds(340, 100, 80, 19);

        Cubo2C2H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo2C2H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo2C2H.setText("Cara 2");
        Cubo2C2H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo2C2H.setOpaque(true);
        Cubo2C2H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo2C2H);
        Cubo2C2H.setBounds(340, 140, 80, 19);

        Cubo2C3H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo2C3H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo2C3H.setText("Cara 3");
        Cubo2C3H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo2C3H.setOpaque(true);
        Cubo2C3H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo2C3H);
        Cubo2C3H.setBounds(340, 180, 80, 19);

        Cubo2C4H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo2C4H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo2C4H.setText("Cara 4");
        Cubo2C4H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo2C4H.setOpaque(true);
        Cubo2C4H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo2C4H);
        Cubo2C4H.setBounds(340, 220, 80, 19);

        Cubo2C5H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo2C5H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo2C5H.setText("Cara 5");
        Cubo2C5H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo2C5H.setOpaque(true);
        Cubo2C5H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo2C5H);
        Cubo2C5H.setBounds(340, 260, 80, 19);

        Cubo2C6H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo2C6H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo2C6H.setText("Cara 6");
        Cubo2C6H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo2C6H.setOpaque(true);
        Cubo2C6H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo2C6H);
        Cubo2C6H.setBounds(340, 300, 80, 19);

        Cubo3C1H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo3C1H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo3C1H.setText("Cara 1");
        Cubo3C1H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo3C1H.setOpaque(true);
        Cubo3C1H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo3C1H);
        Cubo3C1H.setBounds(560, 100, 80, 19);

        Cubo3C2H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo3C2H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo3C2H.setText("Cara 2");
        Cubo3C2H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo3C2H.setOpaque(true);
        Cubo3C2H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo3C2H);
        Cubo3C2H.setBounds(560, 140, 80, 19);

        Cubo3C3H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo3C3H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo3C3H.setText("Cara 3");
        Cubo3C3H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo3C3H.setOpaque(true);
        Cubo3C3H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo3C3H);
        Cubo3C3H.setBounds(560, 180, 80, 19);

        Cubo3C4H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo3C4H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo3C4H.setText("Cara 4");
        Cubo3C4H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo3C4H.setOpaque(true);
        Cubo3C4H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo3C4H);
        Cubo3C4H.setBounds(560, 220, 80, 19);

        Cubo3C5H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo3C5H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo3C5H.setText("Cara 5");
        Cubo3C5H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo3C5H.setOpaque(true);
        Cubo3C5H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo3C5H);
        Cubo3C5H.setBounds(560, 260, 80, 19);

        Cubo3C6H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo3C6H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo3C6H.setText("Cara 6");
        Cubo3C6H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo3C6H.setOpaque(true);
        Cubo3C6H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo3C6H);
        Cubo3C6H.setBounds(560, 300, 80, 19);

        Cubo4C1H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo4C1H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo4C1H.setText("Cara 1");
        Cubo4C1H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo4C1H.setOpaque(true);
        Cubo4C1H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo4C1H);
        Cubo4C1H.setBounds(780, 100, 80, 19);

        Cubo4C2H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo4C2H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo4C2H.setText("Cara 2");
        Cubo4C2H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo4C2H.setOpaque(true);
        Cubo4C2H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo4C2H);
        Cubo4C2H.setBounds(780, 140, 80, 19);

        Cubo4C3H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo4C3H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo4C3H.setText("Cara 3");
        Cubo4C3H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo4C3H.setOpaque(true);
        Cubo4C3H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo4C3H);
        Cubo4C3H.setBounds(780, 180, 80, 19);

        Cubo4C4H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo4C4H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo4C4H.setText("Cara 4");
        Cubo4C4H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo4C4H.setOpaque(true);
        Cubo4C4H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo4C4H);
        Cubo4C4H.setBounds(780, 220, 80, 19);

        Cubo4C5H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo4C5H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo4C5H.setText("Cara 5");
        Cubo4C5H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo4C5H.setOpaque(true);
        Cubo4C5H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo4C5H);
        Cubo4C5H.setBounds(780, 260, 80, 19);

        Cubo4C6H.setBackground(new java.awt.Color(45, 46, 51));
        Cubo4C6H.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Cubo4C6H.setText("Cara 6");
        Cubo4C6H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cubo4C6H.setOpaque(true);
        Cubo4C6H.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Cubo4C6H);
        Cubo4C6H.setBounds(780, 300, 80, 19);

        checkLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locura/check.png"))); // NOI18N
        jPanel4.add(checkLbl);
        checkLbl.setBounds(658, 10, 30, 30);

        jLabel79.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel79.setText("Número de Partida:");
        jPanel4.add(jLabel79);
        jLabel79.setBounds(240, 16, 190, 22);

        borrarHistorial.setBackground(new java.awt.Color(122, 37, 55));
        borrarHistorial.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        borrarHistorial.setText("BORRAR HISTORIAL");
        borrarHistorial.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        borrarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarHistorialActionPerformed(evt);
            }
        });
        jPanel4.add(borrarHistorial);
        borrarHistorial.setBounds(23, 8, 175, 32);

        jTabbedPane1.addTab("Historial", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel29.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("By Eduardo Lau");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 98, 122, -1));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 930, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void genCubo1() {
        Color C1 = null;
        if (Cubo1C1.getItemAt(Cubo1C1.getSelectedIndex()).equals("Rojo")) {
            C1 = Rojo;
            Cubo1C1G.setText("R");
            Cubo1.C1I = "R";

            Cubo1C1G.setBackground(C1);

        } else if (Cubo1C1.getItemAt(Cubo1C1.getSelectedIndex()).equals("Blanco")) {
            C1 = Blanco;
            Cubo1C1G.setText("B");
            Cubo1.C1I = "B";
            Cubo1C1G.setBackground(C1);

        } else if (Cubo1C1.getItemAt(Cubo1C1.getSelectedIndex()).equals("Verde")) {
            C1 = Verde;
            Cubo1C1G.setText("V");
            Cubo1.C1I = "V";
            Cubo1C1G.setBackground(C1);

        } else if (Cubo1C1.getItemAt(Cubo1C1.getSelectedIndex()).equals("Amarillo")) {
            C1 = Amarillo;
            Cubo1C1G.setText("A");
            Cubo1.C1I = "A";
            Cubo1C1G.setBackground(C1);
        }

        Color C2 = null;
        if (Cubo1C2.getItemAt(Cubo1C2.getSelectedIndex()).equals("Rojo")) {
            C2 = Rojo;
            Cubo1C2G.setText("R");
            Cubo1.C2I = "R";
            Cubo1C2G.setBackground(C2);

        } else if (Cubo1C2.getItemAt(Cubo1C2.getSelectedIndex()).equals("Blanco")) {
            C2 = Blanco;
            Cubo1C2G.setText("B");
            Cubo1.C2I = "B";
            Cubo1C2G.setBackground(C2);

        } else if (Cubo1C2.getItemAt(Cubo1C2.getSelectedIndex()).equals("Verde")) {
            C2 = Verde;
            Cubo1C2G.setText("V");
            Cubo1.C2I = "V";
            Cubo1C2G.setBackground(C2);

        } else if (Cubo1C2.getItemAt(Cubo1C2.getSelectedIndex()).equals("Amarillo")) {
            C2 = Amarillo;
            Cubo1C2G.setText("A");
            Cubo1.C2I = "A";
            Cubo1C2G.setBackground(C2);
        }

        Color C3 = null;
        if (Cubo1C3.getItemAt(Cubo1C3.getSelectedIndex()).equals("Rojo")) {
            C3 = Rojo;
            Cubo1C3G.setText("R");
            Cubo1.C3I = "R";
            Cubo1C3G.setBackground(C3);

        } else if (Cubo1C3.getItemAt(Cubo1C3.getSelectedIndex()).equals("Blanco")) {
            C3 = Blanco;
            Cubo1C3G.setText("B");
            Cubo1.C3I = "B";
            Cubo1C3G.setBackground(C3);

        } else if (Cubo1C3.getItemAt(Cubo1C3.getSelectedIndex()).equals("Verde")) {
            C3 = Verde;
            Cubo1C3G.setText("V");
            Cubo1.C3I = "V";
            Cubo1C3G.setBackground(C3);

        } else if (Cubo1C3.getItemAt(Cubo1C3.getSelectedIndex()).equals("Amarillo")) {
            C3 = Amarillo;
            Cubo1C3G.setText("A");
            Cubo1.C3I = "A";
            Cubo1C3G.setBackground(C3);
        }

        Color C4 = null;
        if (Cubo1C4.getItemAt(Cubo1C4.getSelectedIndex()).equals("Rojo")) {
            C4 = Rojo;
            Cubo1C4G.setText("R");
            Cubo1.C4I = "R";
            Cubo1C4G.setBackground(C4);

        } else if (Cubo1C4.getItemAt(Cubo1C4.getSelectedIndex()).equals("Blanco")) {
            C4 = Blanco;
            Cubo1C4G.setText("B");
            Cubo1.C4I = "B";
            Cubo1C4G.setBackground(C4);

        } else if (Cubo1C4.getItemAt(Cubo1C4.getSelectedIndex()).equals("Verde")) {
            C4 = Verde;
            Cubo1C4G.setText("V");
            Cubo1.C4I = "V";
            Cubo1C4G.setBackground(C4);

        } else if (Cubo1C4.getItemAt(Cubo1C4.getSelectedIndex()).equals("Amarillo")) {
            C4 = Amarillo;
            Cubo1C4G.setText("A");
            Cubo1.C4I = "A";
            Cubo1C4G.setBackground(C4);
        }

        Color C5 = null;
        if (Cubo1C5.getItemAt(Cubo1C5.getSelectedIndex()).equals("Rojo")) {
            C5 = Rojo;
            Cubo1C5G.setText("R");
            Cubo1.C5I = "R";
            Cubo1C5G.setBackground(C5);

        } else if (Cubo1C5.getItemAt(Cubo1C5.getSelectedIndex()).equals("Blanco")) {
            C5 = Blanco;
            Cubo1C5G.setText("B");
            Cubo1.C5I = "B";
            Cubo1C5G.setBackground(C5);

        } else if (Cubo1C5.getItemAt(Cubo1C5.getSelectedIndex()).equals("Verde")) {
            C5 = Verde;
            Cubo1C5G.setText("V");
            Cubo1.C5I = "V";
            Cubo1C5G.setBackground(C5);

        } else if (Cubo1C5.getItemAt(Cubo1C5.getSelectedIndex()).equals("Amarillo")) {
            C5 = Amarillo;
            Cubo1C5G.setText("A");
            Cubo1.C5I = "A";
            Cubo1C5G.setBackground(C5);
        }

        Color C6 = null;
        if (Cubo1C6.getItemAt(Cubo1C6.getSelectedIndex()).equals("Rojo")) {
            C6 = Rojo;
            Cubo1C6G.setText("R");
            Cubo1.C6I = "R";
            Cubo1C6G.setBackground(C6);

        } else if (Cubo1C6.getItemAt(Cubo1C6.getSelectedIndex()).equals("Blanco")) {
            C6 = Blanco;
            Cubo1C6G.setText("B");
            Cubo1.C6I = "B";
            Cubo1C6G.setBackground(C6);

        } else if (Cubo1C6.getItemAt(Cubo1C6.getSelectedIndex()).equals("Verde")) {
            C6 = Verde;
            Cubo1C6G.setText("V");
            Cubo1.C6I = "V";
            Cubo1C6G.setBackground(C6);

        } else if (Cubo1C6.getItemAt(Cubo1C6.getSelectedIndex()).equals("Amarillo")) {
            C6 = Amarillo;
            Cubo1C6G.setText("A");
            Cubo1.C6I = "A";
            Cubo1C6G.setBackground(C6);
        }

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

        System.out.println("Cubo 1 actualizado");
        actualJuego();
        sigBtnPressed = false;
        resolverBtnClicked = false;
        fondo.repaint();
        ;
    }

    public void genCubo2() {
        sigBtnPressed = false;
        Color C1 = null;
        if (Cubo2C1.getItemAt(Cubo2C1.getSelectedIndex()).equals("Rojo")) {
            C1 = Rojo;
            Cubo2C1G.setText("R");
            Cubo2.C1I = "R";
            Cubo2C1G.setBackground(C1);

        } else if (Cubo2C1.getItemAt(Cubo2C1.getSelectedIndex()).equals("Blanco")) {
            C1 = Blanco;
            Cubo2C1G.setText("B");
            Cubo2.C1I = "B";
            Cubo2C1G.setBackground(C1);

        } else if (Cubo2C1.getItemAt(Cubo2C1.getSelectedIndex()).equals("Verde")) {
            C1 = Verde;
            Cubo2C1G.setText("V");
            Cubo2.C1I = "V";
            Cubo2C1G.setBackground(C1);

        } else if (Cubo2C1.getItemAt(Cubo2C1.getSelectedIndex()).equals("Amarillo")) {
            C1 = Amarillo;
            Cubo2C1G.setText("A");
            Cubo2.C1I = "A";
            Cubo2C1G.setBackground(C1);
        }

        Color C2 = null;
        if (Cubo2C2.getItemAt(Cubo2C2.getSelectedIndex()).equals("Rojo")) {
            C2 = Rojo;
            Cubo2C2G.setText("R");
            Cubo2.C2I = "R";
            Cubo2C2G.setBackground(C2);

        } else if (Cubo2C2.getItemAt(Cubo2C2.getSelectedIndex()).equals("Blanco")) {
            C2 = Blanco;
            Cubo2C2G.setText("B");
            Cubo2.C2I = "B";
            Cubo2C2G.setBackground(C2);

        } else if (Cubo2C2.getItemAt(Cubo2C2.getSelectedIndex()).equals("Verde")) {
            C2 = Verde;
            Cubo2C2G.setText("V");
            Cubo2.C2I = "V";
            Cubo2C2G.setBackground(C2);

        } else if (Cubo2C2.getItemAt(Cubo2C2.getSelectedIndex()).equals("Amarillo")) {
            C2 = Amarillo;
            Cubo2C2G.setText("A");
            Cubo2.C2I = "A";
            Cubo2C2G.setBackground(C2);
        }

        Color C3 = null;
        if (Cubo2C3.getItemAt(Cubo2C3.getSelectedIndex()).equals("Rojo")) {
            C3 = Rojo;
            Cubo2C3G.setText("R");
            Cubo2.C3I = "R";
            Cubo2C3G.setBackground(C3);

        } else if (Cubo2C3.getItemAt(Cubo2C3.getSelectedIndex()).equals("Blanco")) {
            C3 = Blanco;
            Cubo2C3G.setText("B");
            Cubo2.C3I = "B";
            Cubo2C3G.setBackground(C3);

        } else if (Cubo2C3.getItemAt(Cubo2C3.getSelectedIndex()).equals("Verde")) {
            C3 = Verde;
            Cubo2C3G.setText("V");
            Cubo2.C3I = "V";
            Cubo2C3G.setBackground(C3);

        } else if (Cubo2C3.getItemAt(Cubo2C3.getSelectedIndex()).equals("Amarillo")) {
            C3 = Amarillo;
            Cubo2C3G.setText("A");
            Cubo2.C3I = "A";
            Cubo2C3G.setBackground(C3);
        }

        Color C4 = null;
        if (Cubo2C4.getItemAt(Cubo2C4.getSelectedIndex()).equals("Rojo")) {
            C4 = Rojo;
            Cubo2C4G.setText("R");
            Cubo2.C4I = "R";
            Cubo2C4G.setBackground(C4);

        } else if (Cubo2C4.getItemAt(Cubo2C4.getSelectedIndex()).equals("Blanco")) {
            C4 = Blanco;
            Cubo2C4G.setText("B");
            Cubo2.C4I = "B";
            Cubo2C4G.setBackground(C4);

        } else if (Cubo2C4.getItemAt(Cubo2C4.getSelectedIndex()).equals("Verde")) {
            C4 = Verde;
            Cubo2C4G.setText("V");
            Cubo2.C4I = "V";
            Cubo2C4G.setBackground(C4);

        } else if (Cubo2C4.getItemAt(Cubo2C4.getSelectedIndex()).equals("Amarillo")) {
            C4 = Amarillo;
            Cubo2C4G.setText("A");
            Cubo2.C4I = "A";
            Cubo2C4G.setBackground(C4);
        }

        Color C5 = null;
        if (Cubo2C5.getItemAt(Cubo2C5.getSelectedIndex()).equals("Rojo")) {
            C5 = Rojo;
            Cubo2C5G.setText("R");
            Cubo2.C5I = "R";
            Cubo2C5G.setBackground(C5);

        } else if (Cubo2C5.getItemAt(Cubo2C5.getSelectedIndex()).equals("Blanco")) {
            C5 = Blanco;
            Cubo2C5G.setText("B");
            Cubo2.C5I = "B";
            Cubo2C5G.setBackground(C5);

        } else if (Cubo2C5.getItemAt(Cubo2C5.getSelectedIndex()).equals("Verde")) {
            C5 = Verde;
            Cubo2C5G.setText("V");
            Cubo2.C5I = "V";
            Cubo2C5G.setBackground(C5);

        } else if (Cubo2C5.getItemAt(Cubo2C5.getSelectedIndex()).equals("Amarillo")) {
            C5 = Amarillo;
            Cubo2C5G.setText("A");
            Cubo2.C5I = "A";
            Cubo2C5G.setBackground(C5);
        }

        Color C6 = null;
        if (Cubo2C6.getItemAt(Cubo2C6.getSelectedIndex()).equals("Rojo")) {
            C6 = Rojo;
            Cubo2C6G.setText("R");
            Cubo2.C6I = "R";
            Cubo2C6G.setBackground(C6);

        } else if (Cubo2C6.getItemAt(Cubo2C6.getSelectedIndex()).equals("Blanco")) {
            C6 = Blanco;
            Cubo2C6G.setText("B");
            Cubo2.C6I = "B";
            Cubo2C6G.setBackground(C6);

        } else if (Cubo2C6.getItemAt(Cubo2C6.getSelectedIndex()).equals("Verde")) {
            C6 = Verde;
            Cubo2C6G.setText("V");
            Cubo2.C6I = "V";
            Cubo2C6G.setBackground(C6);

        } else if (Cubo2C6.getItemAt(Cubo2C6.getSelectedIndex()).equals("Amarillo")) {
            C6 = Amarillo;
            Cubo2C6G.setText("A");
            Cubo2.C6I = "A";
            Cubo2C6G.setBackground(C6);
        }

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

        System.out.println("Cubo 2 actualizado");
        actualJuego();
        sigBtnPressed = false;
        resolverBtnClicked = false;
        fondo.repaint();
        ;
    }

    public void genCubo3() {
        sigBtnPressed = false;
        Color C1 = null;
        if (Cubo3C1.getItemAt(Cubo3C1.getSelectedIndex()).equals("Rojo")) {
            C1 = Rojo;
            Cubo3C1G.setText("R");
            Cubo3.C1I = "R";
            Cubo3C1G.setBackground(C1);

        } else if (Cubo3C1.getItemAt(Cubo3C1.getSelectedIndex()).equals("Blanco")) {
            C1 = Blanco;
            Cubo3C1G.setText("B");
            Cubo3.C1I = "B";
            Cubo3C1G.setBackground(C1);

        } else if (Cubo3C1.getItemAt(Cubo3C1.getSelectedIndex()).equals("Verde")) {
            C1 = Verde;
            Cubo3C1G.setText("V");
            Cubo3.C1I = "V";
            Cubo3C1G.setBackground(C1);

        } else if (Cubo3C1.getItemAt(Cubo3C1.getSelectedIndex()).equals("Amarillo")) {
            C1 = Amarillo;
            Cubo3C1G.setText("A");
            Cubo3.C1I = "A";
            Cubo3C1G.setBackground(C1);
        }

        Color C2 = null;
        if (Cubo3C2.getItemAt(Cubo3C2.getSelectedIndex()).equals("Rojo")) {
            C2 = Rojo;
            Cubo3C2G.setText("R");
            Cubo3.C2I = "R";
            Cubo3C2G.setBackground(C2);

        } else if (Cubo3C2.getItemAt(Cubo3C2.getSelectedIndex()).equals("Blanco")) {
            C2 = Blanco;
            Cubo3C2G.setText("B");
            Cubo3.C2I = "B";
            Cubo3C2G.setBackground(C2);

        } else if (Cubo3C2.getItemAt(Cubo3C2.getSelectedIndex()).equals("Verde")) {
            C2 = Verde;
            Cubo3C2G.setText("V");
            Cubo3.C2I = "V";
            Cubo3C2G.setBackground(C2);

        } else if (Cubo3C2.getItemAt(Cubo3C2.getSelectedIndex()).equals("Amarillo")) {
            C2 = Amarillo;
            Cubo3C2G.setText("A");
            Cubo3.C2I = "A";
            Cubo3C2G.setBackground(C2);
        }

        Color C3 = null;
        if (Cubo3C3.getItemAt(Cubo3C3.getSelectedIndex()).equals("Rojo")) {
            C3 = Rojo;
            Cubo3C3G.setText("R");
            Cubo3.C3I = "R";
            Cubo3C3G.setBackground(C3);

        } else if (Cubo3C3.getItemAt(Cubo3C3.getSelectedIndex()).equals("Blanco")) {
            C3 = Blanco;
            Cubo3C3G.setText("B");
            Cubo3.C3I = "B";
            Cubo3C3G.setBackground(C3);

        } else if (Cubo3C3.getItemAt(Cubo3C3.getSelectedIndex()).equals("Verde")) {
            C3 = Verde;
            Cubo3C3G.setText("V");
            Cubo3.C3I = "V";
            Cubo3C3G.setBackground(C3);

        } else if (Cubo3C3.getItemAt(Cubo3C3.getSelectedIndex()).equals("Amarillo")) {
            C3 = Amarillo;
            Cubo3C3G.setText("A");
            Cubo3.C3I = "A";
            Cubo3C3G.setBackground(C3);
        }

        Color C4 = null;
        if (Cubo3C4.getItemAt(Cubo3C4.getSelectedIndex()).equals("Rojo")) {
            C4 = Rojo;
            Cubo3C4G.setText("R");
            Cubo3.C4I = "R";
            Cubo3C4G.setBackground(C4);

        } else if (Cubo3C4.getItemAt(Cubo3C4.getSelectedIndex()).equals("Blanco")) {
            C4 = Blanco;
            Cubo3C4G.setText("B");
            Cubo3.C4I = "B";
            Cubo3C4G.setBackground(C4);

        } else if (Cubo3C4.getItemAt(Cubo3C4.getSelectedIndex()).equals("Verde")) {
            C4 = Verde;
            Cubo3C4G.setText("V");
            Cubo3.C4I = "V";
            Cubo3C4G.setBackground(C4);

        } else if (Cubo3C4.getItemAt(Cubo3C4.getSelectedIndex()).equals("Amarillo")) {
            C4 = Amarillo;
            Cubo3C4G.setText("A");
            Cubo3.C4I = "A";
            Cubo3C4G.setBackground(C4);
        }

        Color C5 = null;
        if (Cubo3C5.getItemAt(Cubo3C5.getSelectedIndex()).equals("Rojo")) {
            C5 = Rojo;
            Cubo3C5G.setText("R");
            Cubo3.C5I = "R";
            Cubo3C5G.setBackground(C5);

        } else if (Cubo3C5.getItemAt(Cubo3C5.getSelectedIndex()).equals("Blanco")) {
            C5 = Blanco;
            Cubo3C5G.setText("B");
            Cubo3.C5I = "B";
            Cubo3C5G.setBackground(C5);

        } else if (Cubo3C5.getItemAt(Cubo3C5.getSelectedIndex()).equals("Verde")) {
            C5 = Verde;
            Cubo3C5G.setText("V");
            Cubo3.C5I = "V";
            Cubo3C5G.setBackground(C5);

        } else if (Cubo3C5.getItemAt(Cubo3C5.getSelectedIndex()).equals("Amarillo")) {
            C5 = Amarillo;
            Cubo3C5G.setText("A");
            Cubo3.C5I = "A";
            Cubo3C5G.setBackground(C5);
        }

        Color C6 = null;
        if (Cubo3C6.getItemAt(Cubo3C6.getSelectedIndex()).equals("Rojo")) {
            C6 = Rojo;
            Cubo3C6G.setText("R");
            Cubo3.C6I = "R";
            Cubo3C6G.setBackground(C6);

        } else if (Cubo3C6.getItemAt(Cubo3C6.getSelectedIndex()).equals("Blanco")) {
            C6 = Blanco;
            Cubo3C6G.setText("B");
            Cubo3.C6I = "B";
            Cubo3C6G.setBackground(C6);

        } else if (Cubo3C6.getItemAt(Cubo3C6.getSelectedIndex()).equals("Verde")) {
            C6 = Verde;
            Cubo3C6G.setText("V");
            Cubo3.C6I = "V";
            Cubo3C6G.setBackground(C6);

        } else if (Cubo3C6.getItemAt(Cubo3C6.getSelectedIndex()).equals("Amarillo")) {
            C6 = Amarillo;
            Cubo3C6G.setText("A");
            Cubo3.C6I = "A";
            Cubo3C6G.setBackground(C6);
        }

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

        System.out.println("Cubo 3 actualizado");
        actualJuego();
        sigBtnPressed = false;
        resolverBtnClicked = false;
        fondo.repaint();
        ;
    }

    public void genCubo4() {
        sigBtnPressed = false;
        Color C1 = null;
        if (Cubo4C1.getItemAt(Cubo4C1.getSelectedIndex()).equals("Rojo")) {
            C1 = Rojo;
            Cubo4C1G.setText("R");
            Cubo4.C1I = "R";
            Cubo4C1G.setBackground(C1);

        } else if (Cubo4C1.getItemAt(Cubo4C1.getSelectedIndex()).equals("Blanco")) {
            C1 = Blanco;
            Cubo4C1G.setText("B");
            Cubo4.C1I = "B";
            Cubo4C1G.setBackground(C1);

        } else if (Cubo4C1.getItemAt(Cubo4C1.getSelectedIndex()).equals("Verde")) {
            C1 = Verde;
            Cubo4C1G.setText("V");
            Cubo4.C1I = "V";
            Cubo4C1G.setBackground(C1);

        } else if (Cubo4C1.getItemAt(Cubo4C1.getSelectedIndex()).equals("Amarillo")) {
            C1 = Amarillo;
            Cubo4C1G.setText("A");
            Cubo4.C1I = "A";
            Cubo4C1G.setBackground(C1);
        }

        Color C2 = null;
        if (Cubo4C2.getItemAt(Cubo4C2.getSelectedIndex()).equals("Rojo")) {
            C2 = Rojo;
            Cubo4C2G.setText("R");
            Cubo4.C2I = "R";
            Cubo4C2G.setBackground(C2);

        } else if (Cubo4C2.getItemAt(Cubo4C2.getSelectedIndex()).equals("Blanco")) {
            C2 = Blanco;
            Cubo4C2G.setText("B");
            Cubo4.C2I = "B";
            Cubo4C2G.setBackground(C2);

        } else if (Cubo4C2.getItemAt(Cubo4C2.getSelectedIndex()).equals("Verde")) {
            C2 = Verde;
            Cubo4C2G.setText("V");
            Cubo4.C2I = "V";
            Cubo4C2G.setBackground(C2);

        } else if (Cubo4C2.getItemAt(Cubo4C2.getSelectedIndex()).equals("Amarillo")) {
            C2 = Amarillo;
            Cubo4C2G.setText("A");
            Cubo4.C2I = "A";
            Cubo4C2G.setBackground(C2);
        }

        Color C3 = null;
        if (Cubo4C3.getItemAt(Cubo4C3.getSelectedIndex()).equals("Rojo")) {
            C3 = Rojo;
            Cubo4C3G.setText("R");
            Cubo4.C3I = "R";
            Cubo4C3G.setBackground(C3);

        } else if (Cubo4C3.getItemAt(Cubo4C3.getSelectedIndex()).equals("Blanco")) {
            C3 = Blanco;
            Cubo4C3G.setText("B");
            Cubo4.C3I = "B";
            Cubo4C3G.setBackground(C3);

        } else if (Cubo4C3.getItemAt(Cubo4C3.getSelectedIndex()).equals("Verde")) {
            C3 = Verde;
            Cubo4C3G.setText("V");
            Cubo4.C3I = "V";
            Cubo4C3G.setBackground(C3);

        } else if (Cubo4C3.getItemAt(Cubo4C3.getSelectedIndex()).equals("Amarillo")) {
            C3 = Amarillo;
            Cubo4C3G.setText("A");
            Cubo4.C3I = "A";
            Cubo4C3G.setBackground(C3);
        }

        Color C4 = null;
        if (Cubo4C4.getItemAt(Cubo4C4.getSelectedIndex()).equals("Rojo")) {
            C4 = Rojo;
            Cubo4C4G.setText("R");
            Cubo4.C4I = "R";
            Cubo4C4G.setBackground(C4);

        } else if (Cubo4C4.getItemAt(Cubo4C4.getSelectedIndex()).equals("Blanco")) {
            C4 = Blanco;
            Cubo4C4G.setText("B");
            Cubo4.C4I = "B";
            Cubo4C4G.setBackground(C4);

        } else if (Cubo4C4.getItemAt(Cubo4C4.getSelectedIndex()).equals("Verde")) {
            C4 = Verde;
            Cubo4C4G.setText("V");
            Cubo4.C4I = "V";
            Cubo4C4G.setBackground(C4);

        } else if (Cubo4C4.getItemAt(Cubo4C4.getSelectedIndex()).equals("Amarillo")) {
            C4 = Amarillo;
            Cubo4C4G.setText("A");
            Cubo4.C4I = "A";
            Cubo4C4G.setBackground(C4);
        }

        Color C5 = null;
        if (Cubo4C5.getItemAt(Cubo4C5.getSelectedIndex()).equals("Rojo")) {
            C5 = Rojo;
            Cubo4C5G.setText("R");
            Cubo4.C5I = "R";
            Cubo4C5G.setBackground(C5);

        } else if (Cubo4C5.getItemAt(Cubo4C5.getSelectedIndex()).equals("Blanco")) {
            C5 = Blanco;
            Cubo4C5G.setText("B");
            Cubo4.C5I = "B";
            Cubo4C5G.setBackground(C5);

        } else if (Cubo4C5.getItemAt(Cubo4C5.getSelectedIndex()).equals("Verde")) {
            C5 = Verde;
            Cubo4C5G.setText("V");
            Cubo4.C5I = "V";
            Cubo4C5G.setBackground(C5);

        } else if (Cubo4C5.getItemAt(Cubo4C5.getSelectedIndex()).equals("Amarillo")) {
            C5 = Amarillo;
            Cubo4C5G.setText("A");
            Cubo4.C5I = "A";
            Cubo4C5G.setBackground(C5);
        }

        Color C6 = null;
        if (Cubo4C6.getItemAt(Cubo4C6.getSelectedIndex()).equals("Rojo")) {
            C6 = Rojo;
            Cubo4C6G.setText("R");
            Cubo4.C6I = "R";
            Cubo4C6G.setBackground(C6);

        } else if (Cubo4C6.getItemAt(Cubo4C6.getSelectedIndex()).equals("Blanco")) {
            C6 = Blanco;
            Cubo4C6G.setText("B");
            Cubo4.C6I = "B";
            Cubo4C6G.setBackground(C6);

        } else if (Cubo4C6.getItemAt(Cubo4C6.getSelectedIndex()).equals("Verde")) {
            C6 = Verde;
            Cubo4C6G.setText("V");
            Cubo4.C6I = "V";
            Cubo4C6G.setBackground(C6);

        } else if (Cubo4C6.getItemAt(Cubo4C6.getSelectedIndex()).equals("Amarillo")) {
            C6 = Amarillo;
            Cubo4C6G.setText("A");
            Cubo4.C6I = "A";
            Cubo4C6G.setBackground(C6);
        }

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

        System.out.println("Cubo 4 actualizado");
        actualJuego();
        sigBtnPressed = false;
        resolverBtnClicked = false;
        fondo.repaint();
        ;
    }

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
            Color[] coloresDisp = {Rojo, Blanco,
                Verde, Amarillo};

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

            if (C1.equals(Rojo)) {
                Cubo1C1.setSelectedItem("Rojo");
                Cubo1.C1I = "R";
                Cubo1C1G.setText(Cubo1.C1I);
                Cubo1C1G.setBackground(C1);
            } else if (C1.equals(Blanco)) {
                Cubo1C1.setSelectedItem("Blanco");
                Cubo1.C1I = "B";
                Cubo1C1G.setText(Cubo1.C1I);
                Cubo1C1G.setBackground(C1);
            } else if (C1.equals(Verde)) {
                Cubo1C1.setSelectedItem("Verde");
                Cubo1.C1I = "V";
                Cubo1C1G.setText(Cubo1.C1I);
                Cubo1C1G.setBackground(C1);
            } else if (C1.equals(Amarillo)) {
                Cubo1C1.setSelectedItem("Amarillo");
                Cubo1.C1I = "A";
                Cubo1C1G.setText(Cubo1.C1I);
                Cubo1C1G.setBackground(C1);

            }

            if (C2.equals(Rojo)) {
                Cubo1C2.setSelectedItem("Rojo");
                Cubo1.C2I = "R";
                Cubo1C2G.setText(Cubo1.C2I);
                Cubo1C2G.setBackground(C2);
            } else if (C2.equals(Blanco)) {
                Cubo1C2.setSelectedItem("Blanco");
                Cubo1.C2I = "B";
                Cubo1C2G.setText(Cubo1.C2I);
                Cubo1C2G.setBackground(C2);
            } else if (C2.equals(Verde)) {
                Cubo1C2.setSelectedItem("Verde");
                Cubo1.C2I = "V";
                Cubo1C2G.setText(Cubo1.C2I);
                Cubo1C2G.setBackground(C2);
            } else if (C2.equals(Amarillo)) {
                Cubo1C2.setSelectedItem("Amarillo");
                Cubo1.C2I = "A";
                Cubo1C2G.setText(Cubo1.C2I);
                Cubo1C2G.setBackground(C2);

            }

            if (C3.equals(Rojo)) {
                Cubo1C3.setSelectedItem("Rojo");
                Cubo1.C3I = "R";
                Cubo1C3G.setText(Cubo1.C3I);
                Cubo1C3G.setBackground(C3);
            } else if (C3.equals(Blanco)) {
                Cubo1C3.setSelectedItem("Blanco");
                Cubo1.C3I = "B";
                Cubo1C3G.setText(Cubo1.C3I);
                Cubo1C3G.setBackground(C3);
            } else if (C3.equals(Verde)) {
                Cubo1C3.setSelectedItem("Verde");
                Cubo1.C3I = "V";
                Cubo1C3G.setText(Cubo1.C3I);
                Cubo1C3G.setBackground(C3);
            } else if (C3.equals(Amarillo)) {
                Cubo1C3.setSelectedItem("Amarillo");
                Cubo1.C3I = "A";
                Cubo1C3G.setText(Cubo1.C3I);
                Cubo1C3G.setBackground(C3);

            }

            if (C4.equals(Rojo)) {
                Cubo1C4.setSelectedItem("Rojo");
                Cubo1.C4I = "R";
                Cubo1C4G.setText(Cubo1.C4I);
                Cubo1C4G.setBackground(C4);
            } else if (C4.equals(Blanco)) {
                Cubo1C4.setSelectedItem("Blanco");
                Cubo1.C4I = "B";
                Cubo1C4G.setText(Cubo1.C4I);
                Cubo1C4G.setBackground(C4);
            } else if (C4.equals(Verde)) {
                Cubo1C4.setSelectedItem("Verde");
                Cubo1.C4I = "V";
                Cubo1C4G.setText(Cubo1.C4I);
                Cubo1C4G.setBackground(C4);
            } else if (C4.equals(Amarillo)) {
                Cubo1C4.setSelectedItem("Amarillo");
                Cubo1.C4I = "A";
                Cubo1C4G.setText(Cubo1.C4I);
                Cubo1C4G.setBackground(C4);

            }

            if (C5.equals(Rojo)) {
                Cubo1C5.setSelectedItem("Rojo");
                Cubo1.C5I = "R";
                Cubo1C5G.setText(Cubo1.C5I);
                Cubo1C5G.setBackground(C5);
            } else if (C5.equals(Blanco)) {
                Cubo1C5.setSelectedItem("Blanco");
                Cubo1.C5I = "B";
                Cubo1C5G.setText(Cubo1.C5I);
                Cubo1C5G.setBackground(C5);
            } else if (C5.equals(Verde)) {
                Cubo1C5.setSelectedItem("Verde");
                Cubo1.C5I = "V";
                Cubo1C5G.setText(Cubo1.C5I);
                Cubo1C5G.setBackground(C5);
            } else if (C5.equals(Amarillo)) {
                Cubo1C5.setSelectedItem("Amarillo");
                Cubo1.C5I = "A";
                Cubo1C5G.setText(Cubo1.C5I);
                Cubo1C5G.setBackground(C5);

            }

            if (C6.equals(Rojo)) {
                Cubo1C6.setSelectedItem("Rojo");
                Cubo1.C6I = "R";
                Cubo1C6G.setText(Cubo1.C6I);
                Cubo1C6G.setBackground(C6);
            } else if (C6.equals(Blanco)) {
                Cubo1C6.setSelectedItem("Blanco");
                Cubo1.C6I = "B";
                Cubo1C6G.setText(Cubo1.C6I);
                Cubo1C6G.setBackground(C6);
            } else if (C6.equals(Verde)) {
                Cubo1C6.setSelectedItem("Verde");
                Cubo1.C6I = "V";
                Cubo1C6G.setText(Cubo1.C6I);
                Cubo1C6G.setBackground(C6);
            } else if (C6.equals(Amarillo)) {
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

            if (C1.equals(Rojo)) {
                Cubo2C1.setSelectedItem("Rojo");
                Cubo2.C1I = "R";
                Cubo2C1G.setText(Cubo2.C1I);
                Cubo2C1G.setBackground(C1);
            } else if (C1.equals(Blanco)) {
                Cubo2C1.setSelectedItem("Blanco");
                Cubo2.C1I = "B";
                Cubo2C1G.setText(Cubo2.C1I);
                Cubo2C1G.setBackground(C1);
            } else if (C1.equals(Verde)) {
                Cubo2C1.setSelectedItem("Verde");
                Cubo2.C1I = "V";
                Cubo2C1G.setBackground(C1);
                Cubo2C1G.setText(Cubo2.C1I);
                Cubo2C1G.setBackground(C1);
            } else if (C1.equals(Amarillo)) {
                Cubo2C1.setSelectedItem("Amarillo");
                Cubo2.C1I = "A";
                Cubo2C1G.setText(Cubo2.C1I);
                Cubo2C1G.setBackground(C1);

            }

            if (C2.equals(Rojo)) {
                Cubo2C2.setSelectedItem("Rojo");
                Cubo2.C2I = "R";
                Cubo2C2G.setText(Cubo2.C2I);
                Cubo2C2G.setBackground(C2);
            } else if (C2.equals(Blanco)) {
                Cubo2C2.setSelectedItem("Blanco");
                Cubo2.C2I = "B";
                Cubo2C2G.setText(Cubo2.C2I);
                Cubo2C2G.setBackground(C2);
            } else if (C2.equals(Verde)) {
                Cubo2C2.setSelectedItem("Verde");
                Cubo2.C2I = "V";
                Cubo2C2G.setText(Cubo2.C2I);
                Cubo2C2G.setBackground(C2);
            } else if (C2.equals(Amarillo)) {
                Cubo2C2.setSelectedItem("Amarillo");
                Cubo2.C2I = "A";
                Cubo2C2G.setText(Cubo2.C2I);
                Cubo2C2G.setBackground(C2);

            }

            if (C3.equals(Rojo)) {
                Cubo2C3.setSelectedItem("Rojo");
                Cubo2.C3I = "R";
                Cubo2C3G.setText(Cubo2.C3I);
                Cubo2C3G.setBackground(C3);
            } else if (C3.equals(Blanco)) {
                Cubo2C3.setSelectedItem("Blanco");
                Cubo2.C3I = "B";
                Cubo2C3G.setText(Cubo2.C3I);
                Cubo2C3G.setBackground(C3);
            } else if (C3.equals(Verde)) {
                Cubo2C3.setSelectedItem("Verde");
                Cubo2.C3I = "V";
                Cubo2C3G.setText(Cubo2.C3I);
                Cubo2C3G.setBackground(C3);
            } else if (C3.equals(Amarillo)) {
                Cubo2C3.setSelectedItem("Amarillo");
                Cubo2.C3I = "A";
                Cubo2C3G.setText(Cubo2.C3I);
                Cubo2C3G.setBackground(C3);

            }

            if (C4.equals(Rojo)) {
                Cubo2C4.setSelectedItem("Rojo");
                Cubo2.C4I = "R";
                Cubo2C4G.setText(Cubo2.C4I);
                Cubo2C4G.setBackground(C4);
            } else if (C4.equals(Blanco)) {
                Cubo2C4.setSelectedItem("Blanco");
                Cubo2.C4I = "B";
                Cubo2C4G.setText(Cubo2.C4I);
                Cubo2C4G.setBackground(C4);
            } else if (C4.equals(Verde)) {
                Cubo2C4.setSelectedItem("Verde");
                Cubo2.C4I = "V";
                Cubo2C4G.setText(Cubo2.C4I);
                Cubo2C4G.setBackground(C4);
            } else if (C4.equals(Amarillo)) {
                Cubo2C4.setSelectedItem("Amarillo");
                Cubo2.C4I = "A";
                Cubo2C4G.setText(Cubo2.C4I);
                Cubo2C4G.setBackground(C4);

            }

            if (C5.equals(Rojo)) {
                Cubo2C5.setSelectedItem("Rojo");
                Cubo2.C5I = "R";
                Cubo2C5G.setText(Cubo2.C5I);
                Cubo2C5G.setBackground(C5);
            } else if (C5.equals(Blanco)) {
                Cubo2C5.setSelectedItem("Blanco");
                Cubo2.C5I = "B";
                Cubo2C5G.setText(Cubo2.C5I);
                Cubo2C5G.setBackground(C5);
            } else if (C5.equals(Verde)) {
                Cubo2C5.setSelectedItem("Verde");
                Cubo2.C5I = "V";
                Cubo2C5G.setText(Cubo2.C5I);
                Cubo2C5G.setBackground(C5);
            } else if (C5.equals(Amarillo)) {
                Cubo2C5.setSelectedItem("Amarillo");
                Cubo2.C5I = "A";
                Cubo2C5G.setText(Cubo2.C5I);
                Cubo2C5G.setBackground(C5);

            }

            if (C6.equals(Rojo)) {
                Cubo2C6.setSelectedItem("Rojo");
                Cubo2.C6I = "R";
                Cubo2C6G.setText(Cubo2.C6I);
                Cubo2C6G.setBackground(C6);
            } else if (C6.equals(Blanco)) {
                Cubo2C6.setSelectedItem("Blanco");
                Cubo2.C6I = "B";
                Cubo2C6G.setText(Cubo2.C6I);
                Cubo2C6G.setBackground(C6);
            } else if (C6.equals(Verde)) {
                Cubo2C6.setSelectedItem("Verde");
                Cubo2.C6I = "V";
                Cubo2C6G.setText(Cubo2.C6I);
                Cubo2C6G.setBackground(C6);
            } else if (C6.equals(Amarillo)) {
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

            if (C1.equals(Rojo)) {
                Cubo3C1.setSelectedItem("Rojo");
                Cubo3.C1I = "R";
                Cubo3C1G.setText(Cubo3.C1I);
                Cubo3C1G.setBackground(C1);
            } else if (C1.equals(Blanco)) {
                Cubo3C1.setSelectedItem("Blanco");
                Cubo3.C1I = "B";
                Cubo3C1G.setText(Cubo3.C1I);
                Cubo3C1G.setBackground(C1);
            } else if (C1.equals(Verde)) {
                Cubo3C1.setSelectedItem("Verde");
                Cubo3.C1I = "V";
                Cubo3C1G.setText(Cubo3.C1I);
                Cubo3C1G.setBackground(C1);
            } else if (C1.equals(Amarillo)) {
                Cubo3C1.setSelectedItem("Amarillo");
                Cubo3.C1I = "A";
                Cubo3C1G.setText(Cubo3.C1I);
                Cubo3C1G.setBackground(C1);

            }

            if (C2.equals(Rojo)) {
                Cubo3C2.setSelectedItem("Rojo");
                Cubo3.C2I = "R";
                Cubo3C2G.setText(Cubo3.C2I);
                Cubo3C2G.setBackground(C2);
            } else if (C2.equals(Blanco)) {
                Cubo3C2.setSelectedItem("Blanco");
                Cubo3.C2I = "B";
                Cubo3C2G.setText(Cubo3.C2I);
                Cubo3C2G.setBackground(C2);
            } else if (C2.equals(Verde)) {
                Cubo3C2.setSelectedItem("Verde");
                Cubo3.C2I = "V";
                Cubo3C2G.setText(Cubo3.C2I);
                Cubo3C2G.setBackground(C2);
            } else if (C2.equals(Amarillo)) {
                Cubo3C2.setSelectedItem("Amarillo");
                Cubo3.C2I = "A";
                Cubo3C2G.setText(Cubo3.C2I);
                Cubo3C2G.setBackground(C2);

            }

            if (C3.equals(Rojo)) {
                Cubo3C3.setSelectedItem("Rojo");
                Cubo3.C3I = "R";
                Cubo3C3G.setText(Cubo3.C3I);
                Cubo3C3G.setBackground(C3);
            } else if (C3.equals(Blanco)) {
                Cubo3C3.setSelectedItem("Blanco");
                Cubo3.C3I = "B";
                Cubo3C3G.setText(Cubo3.C3I);
                Cubo3C3G.setBackground(C3);
            } else if (C3.equals(Verde)) {
                Cubo3C3.setSelectedItem("Verde");
                Cubo3.C3I = "V";
                Cubo3C3G.setText(Cubo3.C3I);
                Cubo3C3G.setBackground(C3);
            } else if (C3.equals(Amarillo)) {
                Cubo3C3.setSelectedItem("Amarillo");
                Cubo3.C3I = "A";
                Cubo3C3G.setText(Cubo3.C3I);
                Cubo3C3G.setBackground(C3);

            }

            if (C4.equals(Rojo)) {
                Cubo3C4.setSelectedItem("Rojo");
                Cubo3.C4I = "R";
                Cubo3C4G.setText(Cubo3.C4I);
                Cubo3C4G.setBackground(C4);
            } else if (C4.equals(Blanco)) {
                Cubo3C4.setSelectedItem("Blanco");
                Cubo3.C4I = "B";
                Cubo3C4G.setText(Cubo3.C4I);
                Cubo3C4G.setBackground(C4);
            } else if (C4.equals(Verde)) {
                Cubo3C4.setSelectedItem("Verde");
                Cubo3.C4I = "V";
                Cubo3C4G.setText(Cubo3.C4I);
                Cubo3C4G.setBackground(C4);
            } else if (C4.equals(Amarillo)) {
                Cubo3C4.setSelectedItem("Amarillo");
                Cubo3.C4I = "A";
                Cubo3C4G.setText(Cubo3.C4I);
                Cubo3C4G.setBackground(C4);

            }

            if (C5.equals(Rojo)) {
                Cubo3C5.setSelectedItem("Rojo");
                Cubo3.C5I = "R";
                Cubo3C5G.setText(Cubo3.C5I);
                Cubo3C5G.setBackground(C5);
            } else if (C5.equals(Blanco)) {
                Cubo3C5.setSelectedItem("Blanco");
                Cubo3.C5I = "B";
                Cubo3C5G.setText(Cubo3.C5I);
                Cubo3C5G.setBackground(C5);
            } else if (C5.equals(Verde)) {
                Cubo3C5.setSelectedItem("Verde");
                Cubo3.C5I = "V";
                Cubo3C5G.setText(Cubo3.C5I);
                Cubo3C5G.setBackground(C5);
            } else if (C5.equals(Amarillo)) {
                Cubo3C5.setSelectedItem("Amarillo");
                Cubo3.C5I = "A";
                Cubo3C5G.setText(Cubo3.C5I);
                Cubo3C5G.setBackground(C5);

            }

            if (C6.equals(Rojo)) {
                Cubo3C6.setSelectedItem("Rojo");
                Cubo3.C6I = "R";
                Cubo3C6G.setText(Cubo3.C6I);
                Cubo3C6G.setBackground(C6);
            } else if (C6.equals(Blanco)) {
                Cubo3C6.setSelectedItem("Blanco");
                Cubo3.C6I = "B";
                Cubo3C6G.setText(Cubo3.C6I);
                Cubo3C6G.setBackground(C6);
            } else if (C6.equals(Verde)) {
                Cubo3C6.setSelectedItem("Verde");
                Cubo3.C6I = "V";
                Cubo3C6G.setText(Cubo3.C6I);
                Cubo3C6G.setBackground(C6);
            } else if (C6.equals(Amarillo)) {
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

            if (C1.equals(Rojo)) {
                Cubo4C1.setSelectedItem("Rojo");
                Cubo4.C1I = "R";
                Cubo4C1G.setText(Cubo4.C1I);
                Cubo4C1G.setBackground(C1);
            } else if (C1.equals(Blanco)) {
                Cubo4C1.setSelectedItem("Blanco");
                Cubo4.C1I = "B";
                Cubo4C1G.setText(Cubo4.C1I);
                Cubo4C1G.setBackground(C1);
            } else if (C1.equals(Verde)) {
                Cubo4C1.setSelectedItem("Verde");
                Cubo4.C1I = "V";
                Cubo4C1G.setText(Cubo4.C1I);
                Cubo4C1G.setBackground(C1);
            } else if (C1.equals(Amarillo)) {
                Cubo4C1.setSelectedItem("Amarillo");
                Cubo4.C1I = "A";
                Cubo4C1G.setText(Cubo4.C1I);
                Cubo4C1G.setBackground(C1);

            }

            if (C2.equals(Rojo)) {
                Cubo4C2.setSelectedItem("Rojo");
                Cubo4.C2I = "R";
                Cubo4C2G.setText(Cubo4.C2I);
                Cubo4C2G.setBackground(C2);
            } else if (C2.equals(Blanco)) {
                Cubo4C2.setSelectedItem("Blanco");
                Cubo4.C2I = "B";
                Cubo4C2G.setText(Cubo4.C2I);
                Cubo4C2G.setBackground(C2);
            } else if (C2.equals(Verde)) {
                Cubo4C2.setSelectedItem("Verde");
                Cubo4.C2I = "V";
                Cubo4C2G.setText(Cubo4.C2I);
                Cubo4C2G.setBackground(C2);
            } else if (C2.equals(Amarillo)) {
                Cubo4C2.setSelectedItem("Amarillo");
                Cubo4.C2I = "A";
                Cubo4C2G.setText(Cubo4.C2I);
                Cubo4C2G.setBackground(C2);

            }

            if (C3.equals(Rojo)) {
                Cubo4C3.setSelectedItem("Rojo");
                Cubo4.C3I = "R";
                Cubo4C3G.setText(Cubo4.C3I);
                Cubo4C3G.setBackground(C3);
            } else if (C3.equals(Blanco)) {
                Cubo4C3.setSelectedItem("Blanco");
                Cubo4.C3I = "B";
                Cubo4C3G.setText(Cubo4.C3I);
                Cubo4C3G.setBackground(C3);
            } else if (C3.equals(Verde)) {
                Cubo4C3.setSelectedItem("Verde");
                Cubo4.C3I = "V";
                Cubo4C3G.setText(Cubo4.C3I);
                Cubo4C3G.setBackground(C3);
            } else if (C3.equals(Amarillo)) {
                Cubo4C3.setSelectedItem("Amarillo");
                Cubo4.C3I = "A";
                Cubo4C3G.setText(Cubo4.C3I);
                Cubo4C3G.setBackground(C3);

            }

            if (C4.equals(Rojo)) {
                Cubo4C4.setSelectedItem("Rojo");
                Cubo4.C4I = "R";
                Cubo4C4G.setText(Cubo4.C4I);
                Cubo4C4G.setBackground(C4);
            } else if (C4.equals(Blanco)) {
                Cubo4C4.setSelectedItem("Blanco");
                Cubo4.C4I = "B";
                Cubo4C4G.setText(Cubo4.C4I);
                Cubo4C4G.setBackground(C4);
            } else if (C4.equals(Verde)) {
                Cubo4C4.setSelectedItem("Verde");
                Cubo4.C4I = "V";
                Cubo4C4G.setText(Cubo4.C4I);
                Cubo4C4G.setBackground(C4);
            } else if (C4.equals(Amarillo)) {
                Cubo4C4.setSelectedItem("Amarillo");
                Cubo4.C4I = "A";
                Cubo4C4G.setText(Cubo4.C4I);
                Cubo4C4G.setBackground(C4);

            }

            if (C5.equals(Rojo)) {
                Cubo4C5.setSelectedItem("Rojo");
                Cubo4.C5I = "R";
                Cubo4C5G.setText(Cubo4.C5I);
                Cubo4C5G.setBackground(C5);
            } else if (C5.equals(Blanco)) {
                Cubo4C5.setSelectedItem("Blanco");
                Cubo4.C5I = "B";
                Cubo4C5G.setText(Cubo4.C5I);
                Cubo4C5G.setBackground(C5);
            } else if (C5.equals(Verde)) {
                Cubo4C5.setSelectedItem("Verde");
                Cubo4.C5I = "V";
                Cubo4C5G.setText(Cubo4.C5I);
                Cubo4C5G.setBackground(C5);
            } else if (C5.equals(Amarillo)) {
                Cubo4C5.setSelectedItem("Amarillo");
                Cubo4.C5I = "A";
                Cubo4C5G.setText(Cubo4.C5I);
                Cubo4C5G.setBackground(C5);

            }

            if (C6.equals(Rojo)) {
                Cubo4C6.setSelectedItem("Rojo");
                Cubo4.C6I = "R";
                Cubo4C6G.setText(Cubo4.C6I);
                Cubo4C6G.setBackground(C6);
            } else if (C6.equals(Blanco)) {
                Cubo4C6.setSelectedItem("Blanco");
                Cubo4.C6I = "B";
                Cubo4C6G.setText(Cubo4.C6I);
                Cubo4C6G.setBackground(C6);
            } else if (C6.equals(Verde)) {
                Cubo4C6.setSelectedItem("Verde");
                Cubo4.C6I = "V";
                Cubo4C6G.setText(Cubo4.C6I);
                Cubo4C6G.setBackground(C6);
            } else if (C6.equals(Amarillo)) {
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

        // Partidas
        if (Cubo1Bin.C1 != null) {
            if (sigBtnPressed == false && ((!Cubo1Bin.C1.equals(Cubo1.C1) || !Cubo1Bin.C2.equals(Cubo1.C2)
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
                    || !Cubo4Bin.C5.equals(Cubo4.C5) || !Cubo4Bin.C6.equals(Cubo4.C6)))) {

                Cubos cubo1temp = new Cubos();
                cubo1temp.C1 = Cubo1.C1;
                cubo1temp.C2 = Cubo1.C2;
                cubo1temp.C3 = Cubo1.C3;
                cubo1temp.C4 = Cubo1.C4;
                cubo1temp.C5 = Cubo1.C5;
                cubo1temp.C6 = Cubo1.C6;

                cubo1temp.C1I = Cubo1.C1I;
                cubo1temp.C2I = Cubo1.C2I;
                cubo1temp.C3I = Cubo1.C3I;
                cubo1temp.C4I = Cubo1.C4I;
                cubo1temp.C5I = Cubo1.C5I;
                cubo1temp.C6I = Cubo1.C6I;

                Cubos cubo2temp = new Cubos();
                cubo2temp.C1 = Cubo2.C1;
                cubo2temp.C2 = Cubo2.C2;
                cubo2temp.C3 = Cubo2.C3;
                cubo2temp.C4 = Cubo2.C4;
                cubo2temp.C5 = Cubo2.C5;
                cubo2temp.C6 = Cubo2.C6;

                cubo2temp.C1I = Cubo2.C1I;
                cubo2temp.C2I = Cubo2.C2I;
                cubo2temp.C3I = Cubo2.C3I;
                cubo2temp.C4I = Cubo2.C4I;
                cubo2temp.C5I = Cubo2.C5I;
                cubo2temp.C6I = Cubo2.C6I;

                Cubos cubo3temp = new Cubos();
                cubo3temp.C1 = Cubo3.C1;
                cubo3temp.C2 = Cubo3.C2;
                cubo3temp.C3 = Cubo3.C3;
                cubo3temp.C4 = Cubo3.C4;
                cubo3temp.C5 = Cubo3.C5;
                cubo3temp.C6 = Cubo3.C6;

                cubo3temp.C1I = Cubo3.C1I;
                cubo3temp.C2I = Cubo3.C2I;
                cubo3temp.C3I = Cubo3.C3I;
                cubo3temp.C4I = Cubo3.C4I;
                cubo3temp.C5I = Cubo3.C5I;
                cubo3temp.C6I = Cubo3.C6I;

                Cubos cubo4temp = new Cubos();
                cubo4temp.C1 = Cubo4.C1;
                cubo4temp.C2 = Cubo4.C2;
                cubo4temp.C3 = Cubo4.C3;
                cubo4temp.C4 = Cubo4.C4;
                cubo4temp.C5 = Cubo4.C5;
                cubo4temp.C6 = Cubo4.C6;

                cubo4temp.C1I = Cubo4.C1I;
                cubo4temp.C2I = Cubo4.C2I;
                cubo4temp.C3I = Cubo4.C3I;
                cubo4temp.C4I = Cubo4.C4I;
                cubo4temp.C5I = Cubo4.C5I;
                cubo4temp.C6I = Cubo4.C6I;

                boolean solucion = resolverJuegoSilent();

                partidas.add(new Partidas(cubo1temp, cubo2temp, cubo3temp, cubo4temp, solucion, soluciones));
                iPartida++;
                if (partidas.get(iPartida - 1).soluciones != null && solucion == true) {
                    noPartida.addItem(String.valueOf(iPartida) + " (" + (partidas.get(iPartida - 1).soluciones.size() / 2) + ")");
                } else {
                    noPartida.addItem(String.valueOf(iPartida));
                }
                System.out.println("partida guardada");
            }
        } else if (Cubo1C1G.isVisible() == true && Cubo2C1G.isVisible() == true && Cubo3C1G.isVisible() == true && Cubo4C1G.isVisible() == true && sigBtnPressed == false) {
            Cubos cubo1temp = new Cubos();
            cubo1temp.C1 = Cubo1.C1;
            cubo1temp.C2 = Cubo1.C2;
            cubo1temp.C3 = Cubo1.C3;
            cubo1temp.C4 = Cubo1.C4;
            cubo1temp.C5 = Cubo1.C5;
            cubo1temp.C6 = Cubo1.C6;

            cubo1temp.C1I = Cubo1.C1I;
            cubo1temp.C2I = Cubo1.C2I;
            cubo1temp.C3I = Cubo1.C3I;
            cubo1temp.C4I = Cubo1.C4I;
            cubo1temp.C5I = Cubo1.C5I;
            cubo1temp.C6I = Cubo1.C6I;

            Cubos cubo2temp = new Cubos();
            cubo2temp.C1 = Cubo2.C1;
            cubo2temp.C2 = Cubo2.C2;
            cubo2temp.C3 = Cubo2.C3;
            cubo2temp.C4 = Cubo2.C4;
            cubo2temp.C5 = Cubo2.C5;
            cubo2temp.C6 = Cubo2.C6;

            cubo2temp.C1I = Cubo2.C1I;
            cubo2temp.C2I = Cubo2.C2I;
            cubo2temp.C3I = Cubo2.C3I;
            cubo2temp.C4I = Cubo2.C4I;
            cubo2temp.C5I = Cubo2.C5I;
            cubo2temp.C6I = Cubo2.C6I;

            Cubos cubo3temp = new Cubos();
            cubo3temp.C1 = Cubo3.C1;
            cubo3temp.C2 = Cubo3.C2;
            cubo3temp.C3 = Cubo3.C3;
            cubo3temp.C4 = Cubo3.C4;
            cubo3temp.C5 = Cubo3.C5;
            cubo3temp.C6 = Cubo3.C6;

            cubo3temp.C1I = Cubo3.C1I;
            cubo3temp.C2I = Cubo3.C2I;
            cubo3temp.C3I = Cubo3.C3I;
            cubo3temp.C4I = Cubo3.C4I;
            cubo3temp.C5I = Cubo3.C5I;
            cubo3temp.C6I = Cubo3.C6I;

            Cubos cubo4temp = new Cubos();
            cubo4temp.C1 = Cubo4.C1;
            cubo4temp.C2 = Cubo4.C2;
            cubo4temp.C3 = Cubo4.C3;
            cubo4temp.C4 = Cubo4.C4;
            cubo4temp.C5 = Cubo4.C5;
            cubo4temp.C6 = Cubo4.C6;

            cubo4temp.C1I = Cubo4.C1I;
            cubo4temp.C2I = Cubo4.C2I;
            cubo4temp.C3I = Cubo4.C3I;
            cubo4temp.C4I = Cubo4.C4I;
            cubo4temp.C5I = Cubo4.C5I;
            cubo4temp.C6I = Cubo4.C6I;

            boolean solucion = resolverJuegoSilent();

            partidas.add(new Partidas(cubo1temp, cubo2temp, cubo3temp, cubo4temp, solucion, soluciones));
            iPartida++;
            if (partidas.get(iPartida - 1).soluciones != null && solucion == true) {
                noPartida.addItem(String.valueOf(iPartida) + " (" + (partidas.get(iPartida - 1).soluciones.size() / 2) + ")");
            } else {
                noPartida.addItem(String.valueOf(iPartida));
            }
            System.out.println("partida guardada");
        }

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

        partidasBin = new ArrayList<>();
        for (int i = 0; i < iPartida; i++) {
            Cubos cubo1temp = new Cubos();
            cubo1temp.C1 = partidas.get(i).Cubo1.C1;
            cubo1temp.C2 = partidas.get(i).Cubo1.C2;
            cubo1temp.C3 = partidas.get(i).Cubo1.C3;
            cubo1temp.C4 = partidas.get(i).Cubo1.C4;
            cubo1temp.C5 = partidas.get(i).Cubo1.C5;
            cubo1temp.C6 = partidas.get(i).Cubo1.C6;

            cubo1temp.C1I = partidas.get(i).Cubo1.C1I;
            cubo1temp.C2I = partidas.get(i).Cubo1.C2I;
            cubo1temp.C3I = partidas.get(i).Cubo1.C3I;
            cubo1temp.C4I = partidas.get(i).Cubo1.C4I;
            cubo1temp.C5I = partidas.get(i).Cubo1.C5I;
            cubo1temp.C6I = partidas.get(i).Cubo1.C6I;

            Cubos cubo2temp = new Cubos();
            cubo2temp.C1 = partidas.get(i).Cubo2.C1;
            cubo2temp.C2 = partidas.get(i).Cubo2.C2;
            cubo2temp.C3 = partidas.get(i).Cubo2.C3;
            cubo2temp.C4 = partidas.get(i).Cubo2.C4;
            cubo2temp.C5 = partidas.get(i).Cubo2.C5;
            cubo2temp.C6 = partidas.get(i).Cubo2.C6;

            cubo2temp.C1I = partidas.get(i).Cubo2.C1I;
            cubo2temp.C2I = partidas.get(i).Cubo2.C2I;
            cubo2temp.C3I = partidas.get(i).Cubo2.C3I;
            cubo2temp.C4I = partidas.get(i).Cubo2.C4I;
            cubo2temp.C5I = partidas.get(i).Cubo2.C5I;
            cubo2temp.C6I = partidas.get(i).Cubo2.C6I;

            Cubos cubo3temp = new Cubos();
            cubo3temp.C1 = partidas.get(i).Cubo3.C1;
            cubo3temp.C2 = partidas.get(i).Cubo3.C2;
            cubo3temp.C3 = partidas.get(i).Cubo3.C3;
            cubo3temp.C4 = partidas.get(i).Cubo3.C4;
            cubo3temp.C5 = partidas.get(i).Cubo3.C5;
            cubo3temp.C6 = partidas.get(i).Cubo3.C6;

            cubo3temp.C1I = partidas.get(i).Cubo3.C1I;
            cubo3temp.C2I = partidas.get(i).Cubo3.C2I;
            cubo3temp.C3I = partidas.get(i).Cubo3.C3I;
            cubo3temp.C4I = partidas.get(i).Cubo3.C4I;
            cubo3temp.C5I = partidas.get(i).Cubo3.C5I;
            cubo3temp.C6I = partidas.get(i).Cubo3.C6I;

            Cubos cubo4temp = new Cubos();
            cubo4temp.C1 = partidas.get(i).Cubo4.C1;
            cubo4temp.C2 = partidas.get(i).Cubo4.C2;
            cubo4temp.C3 = partidas.get(i).Cubo4.C3;
            cubo4temp.C4 = partidas.get(i).Cubo4.C4;
            cubo4temp.C5 = partidas.get(i).Cubo4.C5;
            cubo4temp.C6 = partidas.get(i).Cubo4.C6;

            cubo4temp.C1I = partidas.get(i).Cubo4.C1I;
            cubo4temp.C2I = partidas.get(i).Cubo4.C2I;
            cubo4temp.C3I = partidas.get(i).Cubo4.C3I;
            cubo4temp.C4I = partidas.get(i).Cubo4.C4I;
            cubo4temp.C5I = partidas.get(i).Cubo4.C5I;
            cubo4temp.C6I = partidas.get(i).Cubo4.C6I;

            boolean solucion = partidas.get(i).solucion;
            ArrayList<Soluciones> solucionesTemp = partidas.get(i).soluciones;

            partidasBin.add(new Binarios(cubo1temp, cubo2temp, cubo3temp, cubo4temp, solucion, solucionesTemp));

        }
        if (resolverBtnClicked == true) {
            solucionAplicadaBin.solucionAplicada = solucionAplicada;
        }

        System.out.println("Partidas Bin: " + partidasBin.size());
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

        try {
            // Crear un flujo de salida de archivos binarios
            F_binPartidasOut = new FileOutputStream(binPartidasNOut);

            // Crear un ObjectOutputStream para escribir objetos en el archivo binario
            O_binPartidasOut = new ObjectOutputStream(F_binPartidasOut);

            // Escribir la lista en el archivo binario
            O_binPartidasOut.writeObject(partidasBin);

            // Escribir solucion aplicada en archivo Binario
            O_binPartidasOut.writeObject(solucionAplicadaBin);

            // Cerrar los flujos
            O_binPartidasOut.close();
            F_binPartidasOut.close();

            System.out.println("Partidas.bin ha sido guardado con éxito");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public final void BinariosIn() {

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

            System.out.println("Cubos.bin ha sido cargado con éxito");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            // Crear un flujo de entrada de archivos binarios
            F_binPartidasIn = new FileInputStream(binPartidasNIn);

            // Crear un ObjectInputStream para leer objetos desde el archivo binario
            O_binPartidasIn = new ObjectInputStream(F_binPartidasIn);

            // Leer el arreglo desde el archivo
            partidasBin = (ArrayList<Binarios>) O_binPartidasIn.readObject();

            // Leer la solucion aplicada desde el archivo
            solucionAplicadaBin = (Binarios) O_binPartidasIn.readObject();

            // Cerrar los flujos
            O_binPartidasIn.close();
            F_binPartidasIn.close();

            // Utilizar la lista
            System.out.println("partidas Bin: " + partidasBin.size());
            iPartida = 0;
            for (int i = 0; i < partidasBin.size(); i++) {
                Cubos cubo1temp = new Cubos();
                cubo1temp.C1 = partidasBin.get(i).Cubo1.C1;
                cubo1temp.C2 = partidasBin.get(i).Cubo1.C2;
                cubo1temp.C3 = partidasBin.get(i).Cubo1.C3;
                cubo1temp.C4 = partidasBin.get(i).Cubo1.C4;
                cubo1temp.C5 = partidasBin.get(i).Cubo1.C5;
                cubo1temp.C6 = partidasBin.get(i).Cubo1.C6;

                cubo1temp.C1I = partidasBin.get(i).Cubo1.C1I;
                cubo1temp.C2I = partidasBin.get(i).Cubo1.C2I;
                cubo1temp.C3I = partidasBin.get(i).Cubo1.C3I;
                cubo1temp.C4I = partidasBin.get(i).Cubo1.C4I;
                cubo1temp.C5I = partidasBin.get(i).Cubo1.C5I;
                cubo1temp.C6I = partidasBin.get(i).Cubo1.C6I;

                Cubos cubo2temp = new Cubos();
                cubo2temp.C1 = partidasBin.get(i).Cubo2.C1;
                cubo2temp.C2 = partidasBin.get(i).Cubo2.C2;
                cubo2temp.C3 = partidasBin.get(i).Cubo2.C3;
                cubo2temp.C4 = partidasBin.get(i).Cubo2.C4;
                cubo2temp.C5 = partidasBin.get(i).Cubo2.C5;
                cubo2temp.C6 = partidasBin.get(i).Cubo2.C6;

                cubo2temp.C1I = partidasBin.get(i).Cubo2.C1I;
                cubo2temp.C2I = partidasBin.get(i).Cubo2.C2I;
                cubo2temp.C3I = partidasBin.get(i).Cubo2.C3I;
                cubo2temp.C4I = partidasBin.get(i).Cubo2.C4I;
                cubo2temp.C5I = partidasBin.get(i).Cubo2.C5I;
                cubo2temp.C6I = partidasBin.get(i).Cubo2.C6I;

                Cubos cubo3temp = new Cubos();
                cubo3temp.C1 = partidasBin.get(i).Cubo3.C1;
                cubo3temp.C2 = partidasBin.get(i).Cubo3.C2;
                cubo3temp.C3 = partidasBin.get(i).Cubo3.C3;
                cubo3temp.C4 = partidasBin.get(i).Cubo3.C4;
                cubo3temp.C5 = partidasBin.get(i).Cubo3.C5;
                cubo3temp.C6 = partidasBin.get(i).Cubo3.C6;

                cubo3temp.C1I = partidasBin.get(i).Cubo3.C1I;
                cubo3temp.C2I = partidasBin.get(i).Cubo3.C2I;
                cubo3temp.C3I = partidasBin.get(i).Cubo3.C3I;
                cubo3temp.C4I = partidasBin.get(i).Cubo3.C4I;
                cubo3temp.C5I = partidasBin.get(i).Cubo3.C5I;
                cubo3temp.C6I = partidasBin.get(i).Cubo3.C6I;

                Cubos cubo4temp = new Cubos();
                cubo4temp.C1 = partidasBin.get(i).Cubo4.C1;
                cubo4temp.C2 = partidasBin.get(i).Cubo4.C2;
                cubo4temp.C3 = partidasBin.get(i).Cubo4.C3;
                cubo4temp.C4 = partidasBin.get(i).Cubo4.C4;
                cubo4temp.C5 = partidasBin.get(i).Cubo4.C5;
                cubo4temp.C6 = partidasBin.get(i).Cubo4.C6;

                cubo4temp.C1I = partidasBin.get(i).Cubo4.C1I;
                cubo4temp.C2I = partidasBin.get(i).Cubo4.C2I;
                cubo4temp.C3I = partidasBin.get(i).Cubo4.C3I;
                cubo4temp.C4I = partidasBin.get(i).Cubo4.C4I;
                cubo4temp.C5I = partidasBin.get(i).Cubo4.C5I;
                cubo4temp.C6I = partidasBin.get(i).Cubo4.C6I;

                boolean solucion = partidasBin.get(i).solucion;
                ArrayList<Soluciones> solucionesTemp = partidasBin.get(i).soluciones;

                partidas.add(i, new Partidas(cubo1temp, cubo2temp, cubo3temp, cubo4temp, solucion, solucionesTemp));

                iPartida = i + 1;
                if (partidas.get(iPartida - 1).soluciones != null && solucion == true) {
                    noPartida.addItem(String.valueOf(iPartida) + " (" + (partidas.get(iPartida - 1).soluciones.size() / 2) + ")");
                } else {
                    noPartida.addItem(String.valueOf(iPartida));
                }
            }

            solucionAplicada = solucionAplicadaBin.solucionAplicada;

            if (partidas.get(iPartida - 1).soluciones.size() > 0) {
                resolverBtnClicked = true;
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Object[] options = {"Sí",
            "No"};
        int option = JOptionPane.showOptionDialog(null,
                "Estás seguro que deseas salir del Juego?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (JOptionPane.YES_OPTION == option) {
            BinariosOut();
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
            } else {
                grafoGL();
                grafoG1();
                grafoG2();
            }
        }

        if (jTabbedPane1.getSelectedIndex() == 3 && iPartida < 1) {
            jTabbedPane1.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, "Aún no has jugado ninguna partida,\n"
                    + "escoge una combinación y presiona 'JUGAR'");

        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jugarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarBtnActionPerformed
        // TODO add your handling code here:

        if (Cubo1.C1 == null || Cubo2.C1 == null || Cubo3.C1 == null || Cubo4.C1 == null) {
            JOptionPane.showMessageDialog(null, "Aún no ha generado los 4 cubos");
        } else if (Cubo1Bin.C1 == null) {
            sigBtnPressed = true;
            jTabbedPane1.setSelectedIndex(1);

            Cubos cubo1temp = new Cubos();
            cubo1temp.C1 = Cubo1.C1;
            cubo1temp.C2 = Cubo1.C2;
            cubo1temp.C3 = Cubo1.C3;
            cubo1temp.C4 = Cubo1.C4;
            cubo1temp.C5 = Cubo1.C5;
            cubo1temp.C6 = Cubo1.C6;

            cubo1temp.C1I = Cubo1.C1I;
            cubo1temp.C2I = Cubo1.C2I;
            cubo1temp.C3I = Cubo1.C3I;
            cubo1temp.C4I = Cubo1.C4I;
            cubo1temp.C5I = Cubo1.C5I;
            cubo1temp.C6I = Cubo1.C6I;

            Cubos cubo2temp = new Cubos();
            cubo2temp.C1 = Cubo2.C1;
            cubo2temp.C2 = Cubo2.C2;
            cubo2temp.C3 = Cubo2.C3;
            cubo2temp.C4 = Cubo2.C4;
            cubo2temp.C5 = Cubo2.C5;
            cubo2temp.C6 = Cubo2.C6;

            cubo2temp.C1I = Cubo2.C1I;
            cubo2temp.C2I = Cubo2.C2I;
            cubo2temp.C3I = Cubo2.C3I;
            cubo2temp.C4I = Cubo2.C4I;
            cubo2temp.C5I = Cubo2.C5I;
            cubo2temp.C6I = Cubo2.C6I;

            Cubos cubo3temp = new Cubos();
            cubo3temp.C1 = Cubo3.C1;
            cubo3temp.C2 = Cubo3.C2;
            cubo3temp.C3 = Cubo3.C3;
            cubo3temp.C4 = Cubo3.C4;
            cubo3temp.C5 = Cubo3.C5;
            cubo3temp.C6 = Cubo3.C6;

            cubo3temp.C1I = Cubo3.C1I;
            cubo3temp.C2I = Cubo3.C2I;
            cubo3temp.C3I = Cubo3.C3I;
            cubo3temp.C4I = Cubo3.C4I;
            cubo3temp.C5I = Cubo3.C5I;
            cubo3temp.C6I = Cubo3.C6I;

            Cubos cubo4temp = new Cubos();
            cubo4temp.C1 = Cubo4.C1;
            cubo4temp.C2 = Cubo4.C2;
            cubo4temp.C3 = Cubo4.C3;
            cubo4temp.C4 = Cubo4.C4;
            cubo4temp.C5 = Cubo4.C5;
            cubo4temp.C6 = Cubo4.C6;

            cubo4temp.C1I = Cubo4.C1I;
            cubo4temp.C2I = Cubo4.C2I;
            cubo4temp.C3I = Cubo4.C3I;
            cubo4temp.C4I = Cubo4.C4I;
            cubo4temp.C5I = Cubo4.C5I;
            cubo4temp.C6I = Cubo4.C6I;

            boolean solucion = resolverJuegoSilent();

            partidas.add(new Partidas(cubo1temp, cubo2temp, cubo3temp, cubo4temp, solucion, soluciones));

            iPartida++;
            if (partidas.get(iPartida - 1).soluciones != null && solucion == true) {
                noPartida.addItem(String.valueOf(iPartida) + " (" + (partidas.get(iPartida - 1).soluciones.size() / 2) + ")");
            } else {
                noPartida.addItem(String.valueOf(iPartida));
            }
            actualTorre();

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

                resueltoLbl.setVisible(true);
                resuelto = true;
                solucionPrev.setVisible(true);
                solucionPost.setVisible(true);
                noSoluciones.setVisible(true);
                noSoluciones.setText("1 / " + (partidas.get(0).soluciones.size() / 2));
            } else {
                resueltoLbl.setVisible(false);
                resuelto = false;
                solucionPrev.setVisible(false);
                solucionPost.setVisible(false);
                noSoluciones.setVisible(false);
            }
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
            jTabbedPane1.setSelectedIndex(1);

            Cubos cubo1temp = new Cubos();
            cubo1temp.C1 = Cubo1.C1;
            cubo1temp.C2 = Cubo1.C2;
            cubo1temp.C3 = Cubo1.C3;
            cubo1temp.C4 = Cubo1.C4;
            cubo1temp.C5 = Cubo1.C5;
            cubo1temp.C6 = Cubo1.C6;

            cubo1temp.C1I = Cubo1.C1I;
            cubo1temp.C2I = Cubo1.C2I;
            cubo1temp.C3I = Cubo1.C3I;
            cubo1temp.C4I = Cubo1.C4I;
            cubo1temp.C5I = Cubo1.C5I;
            cubo1temp.C6I = Cubo1.C6I;

            Cubos cubo2temp = new Cubos();
            cubo2temp.C1 = Cubo2.C1;
            cubo2temp.C2 = Cubo2.C2;
            cubo2temp.C3 = Cubo2.C3;
            cubo2temp.C4 = Cubo2.C4;
            cubo2temp.C5 = Cubo2.C5;
            cubo2temp.C6 = Cubo2.C6;

            cubo2temp.C1I = Cubo2.C1I;
            cubo2temp.C2I = Cubo2.C2I;
            cubo2temp.C3I = Cubo2.C3I;
            cubo2temp.C4I = Cubo2.C4I;
            cubo2temp.C5I = Cubo2.C5I;
            cubo2temp.C6I = Cubo2.C6I;

            Cubos cubo3temp = new Cubos();
            cubo3temp.C1 = Cubo3.C1;
            cubo3temp.C2 = Cubo3.C2;
            cubo3temp.C3 = Cubo3.C3;
            cubo3temp.C4 = Cubo3.C4;
            cubo3temp.C5 = Cubo3.C5;
            cubo3temp.C6 = Cubo3.C6;

            cubo3temp.C1I = Cubo3.C1I;
            cubo3temp.C2I = Cubo3.C2I;
            cubo3temp.C3I = Cubo3.C3I;
            cubo3temp.C4I = Cubo3.C4I;
            cubo3temp.C5I = Cubo3.C5I;
            cubo3temp.C6I = Cubo3.C6I;

            Cubos cubo4temp = new Cubos();
            cubo4temp.C1 = Cubo4.C1;
            cubo4temp.C2 = Cubo4.C2;
            cubo4temp.C3 = Cubo4.C3;
            cubo4temp.C4 = Cubo4.C4;
            cubo4temp.C5 = Cubo4.C5;
            cubo4temp.C6 = Cubo4.C6;

            cubo4temp.C1I = Cubo4.C1I;
            cubo4temp.C2I = Cubo4.C2I;
            cubo4temp.C3I = Cubo4.C3I;
            cubo4temp.C4I = Cubo4.C4I;
            cubo4temp.C5I = Cubo4.C5I;
            cubo4temp.C6I = Cubo4.C6I;

            boolean solucion = resolverJuegoSilent();

            partidas.add(new Partidas(cubo1temp, cubo2temp, cubo3temp, cubo4temp, solucion, soluciones));;

            iPartida++;
            if (partidas.get(iPartida - 1).soluciones != null && solucion == true) {
                noPartida.addItem(String.valueOf(iPartida) + " (" + (partidas.get(iPartida - 1).soluciones.size() / 2) + ")");
            } else {
                noPartida.addItem(String.valueOf(iPartida));
            }
            actualTorre();

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

                resueltoLbl.setVisible(true);
                resuelto = true;
                solucionPrev.setVisible(true);
                solucionPost.setVisible(true);
                noSoluciones.setVisible(true);
                noSoluciones.setText("1 / " + (partidas.get(iPartida - 1).soluciones.size() / 2));
            } else {
                resueltoLbl.setVisible(false);
                resuelto = false;
                solucionPrev.setVisible(false);
                solucionPost.setVisible(false);
                noSoluciones.setVisible(false);
            }
        } else {
            sigBtnPressed = true;
            jTabbedPane1.setSelectedIndex(1);

            if (reset == true || iPartida == 0 || aplicado == true) {
                Cubos cubo1temp = new Cubos();
                cubo1temp.C1 = Cubo1.C1;
                cubo1temp.C2 = Cubo1.C2;
                cubo1temp.C3 = Cubo1.C3;
                cubo1temp.C4 = Cubo1.C4;
                cubo1temp.C5 = Cubo1.C5;
                cubo1temp.C6 = Cubo1.C6;

                cubo1temp.C1I = Cubo1.C1I;
                cubo1temp.C2I = Cubo1.C2I;
                cubo1temp.C3I = Cubo1.C3I;
                cubo1temp.C4I = Cubo1.C4I;
                cubo1temp.C5I = Cubo1.C5I;
                cubo1temp.C6I = Cubo1.C6I;

                Cubos cubo2temp = new Cubos();
                cubo2temp.C1 = Cubo2.C1;
                cubo2temp.C2 = Cubo2.C2;
                cubo2temp.C3 = Cubo2.C3;
                cubo2temp.C4 = Cubo2.C4;
                cubo2temp.C5 = Cubo2.C5;
                cubo2temp.C6 = Cubo2.C6;

                cubo2temp.C1I = Cubo2.C1I;
                cubo2temp.C2I = Cubo2.C2I;
                cubo2temp.C3I = Cubo2.C3I;
                cubo2temp.C4I = Cubo2.C4I;
                cubo2temp.C5I = Cubo2.C5I;
                cubo2temp.C6I = Cubo2.C6I;

                Cubos cubo3temp = new Cubos();
                cubo3temp.C1 = Cubo3.C1;
                cubo3temp.C2 = Cubo3.C2;
                cubo3temp.C3 = Cubo3.C3;
                cubo3temp.C4 = Cubo3.C4;
                cubo3temp.C5 = Cubo3.C5;
                cubo3temp.C6 = Cubo3.C6;

                cubo3temp.C1I = Cubo3.C1I;
                cubo3temp.C2I = Cubo3.C2I;
                cubo3temp.C3I = Cubo3.C3I;
                cubo3temp.C4I = Cubo3.C4I;
                cubo3temp.C5I = Cubo3.C5I;
                cubo3temp.C6I = Cubo3.C6I;

                Cubos cubo4temp = new Cubos();
                cubo4temp.C1 = Cubo4.C1;
                cubo4temp.C2 = Cubo4.C2;
                cubo4temp.C3 = Cubo4.C3;
                cubo4temp.C4 = Cubo4.C4;
                cubo4temp.C5 = Cubo4.C5;
                cubo4temp.C6 = Cubo4.C6;

                cubo4temp.C1I = Cubo4.C1I;
                cubo4temp.C2I = Cubo4.C2I;
                cubo4temp.C3I = Cubo4.C3I;
                cubo4temp.C4I = Cubo4.C4I;
                cubo4temp.C5I = Cubo4.C5I;
                cubo4temp.C6I = Cubo4.C6I;

                boolean solucion = resolverJuegoSilent();
                partidas.add(iPartida, new Partidas(cubo1temp, cubo2temp, cubo3temp, cubo4temp, solucion, soluciones));

                iPartida++;
                if (partidas.get(iPartida - 1).soluciones != null && solucion == true) {
                    noPartida.addItem(String.valueOf(iPartida) + " (" + (partidas.get(iPartida - 1).soluciones.size() / 2) + ")");
                } else {
                    noPartida.addItem(String.valueOf(iPartida));
                }
            }
            actualTorre();
            aplicado = false;

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

                resueltoLbl.setVisible(true);
                resuelto = true;
                solucionPrev.setVisible(true);
                solucionPost.setVisible(true);
                noSoluciones.setVisible(true);
                noSoluciones.setText(((solucionAplicada / 2) + 1) + " / " + (partidas.get(iPartida - 1).soluciones.size() / 2));
            } else {
                resueltoLbl.setVisible(false);
                resuelto = false;
                solucionPrev.setVisible(false);
                solucionPost.setVisible(false);
                noSoluciones.setVisible(false);
            }

        }

    }//GEN-LAST:event_jugarBtnActionPerformed

    public void actualJuego() {
        if (Cubo1Bin.C1 == null) {

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

        } else {
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

        }
    }

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
        comprobar();

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
        comprobar();

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

            resuelto = true;
            Object[] options = {"Sí, Por Favor",
                "No, gracias"};
            int yes = JOptionPane.showOptionDialog(null,
                    "El Juego YA ESTÁ RESUELTO, deseas\n"
                    + "que el programa encuentre\n"
                    + "otras posibles soluciones?",
                    "Confirmación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (JOptionPane.YES_OPTION == yes) {
                resolverJuego();
                resolverBtnClicked = true;
                actualTorre();
                fondo.repaint();
            }
            fondo.repaint();

        } else {
            Object[] options = {"SI, Por Favor",
                "NO, Gracias"};
            int yes = JOptionPane.showOptionDialog(null,
                    "Deseas que el programa RESUELVA el juego por tí?\n"
                    + "(SOLO si existe solución)",
                    "Confirmación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (JOptionPane.YES_OPTION == yes) {
                resuelto = true;
                resolverBtnClicked = true;
                resolverJuego();
                actualTorre();
                fondo.repaint();
                ;
            } else {
                resuelto = false;
                resolverBtnClicked = false;
            }
        }
    }//GEN-LAST:event_resolverBtnActionPerformed

    public void resolverJuego() {

        boolean G1Encontrado = false;
        boolean G2Encontrado = false;

        int posI = 0;
        int posC = 0;
        int posW = 0;
        int posR = 0;

        int Intento = 0;
        int iPosibilidades = 0;
        solucionAplicada = 0;
        soluciones = new ArrayList<>();

        // Grafo Gl 
        // Cubo 1
        String Cubo1arista1I = Cubo1.C1I;
        String Cubo1arista1F = Cubo1.C2I;

        String Cubo1arista2I = Cubo1.C3I;
        String Cubo1arista2F = Cubo1.C4I;

        String Cubo1arista3I = Cubo1.C5I;
        String Cubo1arista3F = Cubo1.C6I;

        // Cubo 2
        String Cubo2arista1I = Cubo2.C1I;
        String Cubo2arista1F = Cubo2.C2I;

        String Cubo2arista2I = Cubo2.C3I;
        String Cubo2arista2F = Cubo2.C4I;

        String Cubo2arista3I = Cubo2.C5I;
        String Cubo2arista3F = Cubo2.C6I;

        // Cubo 3
        String Cubo3arista1I = Cubo3.C1I;
        String Cubo3arista1F = Cubo3.C2I;

        String Cubo3arista2I = Cubo3.C3I;
        String Cubo3arista2F = Cubo3.C4I;

        String Cubo3arista3I = Cubo3.C5I;
        String Cubo3arista3F = Cubo3.C6I;

        // Cubo 4
        String Cubo4arista1I = Cubo4.C1I;
        String Cubo4arista1F = Cubo4.C2I;

        String Cubo4arista2I = Cubo4.C3I;
        String Cubo4arista2F = Cubo4.C4I;

        String Cubo4arista3I = Cubo4.C5I;
        String Cubo4arista3F = Cubo4.C6I;

        // Grafo G1: Solución Horizontal
        String Cubo1aristaG1I = null;
        String Cubo1aristaG1F = null;

        String Cubo2aristaG1I = null;
        String Cubo2aristaG1F = null;

        String Cubo3aristaG1I = null;
        String Cubo3aristaG1F = null;

        String Cubo4aristaG1I = null;
        String Cubo4aristaG1F = null;

        // Grafo G2: Solución Vertical
        String Cubo1aristaG2I = null;
        String Cubo1aristaG2F = null;

        String Cubo2aristaG2I = null;
        String Cubo2aristaG2F = null;

        String Cubo3aristaG2I = null;
        String Cubo3aristaG2F = null;

        String Cubo4aristaG2I = null;
        String Cubo4aristaG2F = null;

        int gradoVerticeR = 0;
        int gradoVerticeB = 0;
        int gradoVerticeV = 0;
        int gradoVerticeA = 0;

        String[] verticesCubo1 = {Cubo1arista1I, Cubo1arista1F, Cubo1arista2I, Cubo1arista2F, Cubo1arista3I, Cubo1arista3F};
        String[] verticesCubo2 = {Cubo2arista1I, Cubo2arista1F, Cubo2arista2I, Cubo2arista2F, Cubo2arista3I, Cubo2arista3F};
        String[] verticesCubo3 = {Cubo3arista1I, Cubo3arista1F, Cubo3arista2I, Cubo3arista2F, Cubo3arista3I, Cubo3arista3F};
        String[] verticesCubo4 = {Cubo4arista1I, Cubo4arista1F, Cubo4arista2I, Cubo4arista2F, Cubo4arista3I, Cubo4arista3F};

        //
        for (int i = 0; i < 6; i += 2) {
            for (int c = 0; c < 6; c += 2) {
                for (int w = 0; w < 6; w += 2) {
                    for (int r = 0; r < 6; r += 2) {
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

                            if (Intento == 0 || (Intento + 1) % 2 == 1) {
                                System.out.println("Grafo G1: Horizontal - Encontrado");
                                posI = i;
                                posC = c;
                                posW = w;
                                posR = r;

                                G1Encontrado = true;
                                Cubo1aristaG1I = verticesCubo1[i];
                                Cubo1aristaG1F = verticesCubo1[i + 1];

                                Cubo2aristaG1I = verticesCubo2[c];
                                Cubo2aristaG1F = verticesCubo2[c + 1];

                                Cubo3aristaG1I = verticesCubo3[w];
                                Cubo3aristaG1F = verticesCubo3[w + 1];

                                Cubo4aristaG1I = verticesCubo4[r];
                                Cubo4aristaG1F = verticesCubo4[r + 1];

                                soluciones.add(new Soluciones(i, Cubo1aristaG1I, Cubo1aristaG1F,
                                        c, Cubo2aristaG1I, Cubo2aristaG1F,
                                        w, Cubo3aristaG1I, Cubo3aristaG1F,
                                        r, Cubo4aristaG1I, Cubo4aristaG1F));
                                Intento++;

                                System.out.println("Cubo 1: " + Cubo1aristaG1I + "-" + Cubo1aristaG1F);
                                System.out.println("Cubo 2: " + Cubo2aristaG1I + "-" + Cubo2aristaG1F);
                                System.out.println("Cubo 3: " + Cubo3aristaG1I + "-" + Cubo3aristaG1F);
                                System.out.println("Cubo 4: " + Cubo4aristaG1I + "-" + Cubo4aristaG1F);

                            } else if ((i != posI) && (c != posC) && (w != posW) && (r != posR)) {

                                G2Encontrado = true;
                                Cubo1aristaG2I = verticesCubo1[i];
                                Cubo1aristaG2F = verticesCubo1[i + 1];

                                Cubo2aristaG2I = verticesCubo2[c];
                                Cubo2aristaG2F = verticesCubo2[c + 1];

                                Cubo3aristaG2I = verticesCubo3[w];
                                Cubo3aristaG2F = verticesCubo3[w + 1];

                                Cubo4aristaG2I = verticesCubo4[r];
                                Cubo4aristaG2F = verticesCubo4[r + 1];

                                soluciones.add(new Soluciones(i, Cubo1aristaG2I, Cubo1aristaG2F,
                                        c, Cubo2aristaG2I, Cubo2aristaG2F,
                                        w, Cubo3aristaG2I, Cubo3aristaG2F,
                                        r, Cubo4aristaG2I, Cubo4aristaG2F));
                                Intento++;
                                iPosibilidades++;

                                System.out.println("Grafo G2: Vertical - Encontrado");
                                System.out.println("Cubo 1: " + Cubo1aristaG2I + "-" + Cubo1aristaG2F);
                                System.out.println("Cubo 2: " + Cubo2aristaG2I + "-" + Cubo2aristaG2F);
                                System.out.println("Cubo 3: " + Cubo3aristaG2I + "-" + Cubo3aristaG2F);
                                System.out.println("Cubo 4: " + Cubo4aristaG2I + "-" + Cubo4aristaG2F);
                                break;
                            }
                        }

                    }

                    if (G1Encontrado == true && G2Encontrado == true) {
                        break;
                    }
                }

                if (G1Encontrado == true && G2Encontrado == true) {
                    break;
                }
            }

            if (G1Encontrado == true && G2Encontrado == true) {
                break;
            }
        }

        if (G1Encontrado == true && G2Encontrado == true) {
            System.out.println("SolHz");
            System.out.println(soluciones.get(0).posI + "," + soluciones.get(0).posC + "," + soluciones.get(0).posW + "," + soluciones.get(0).posR);

            System.out.println("SolVt");
            System.out.println(soluciones.get(1).posI + "," + soluciones.get(1).posC + "," + soluciones.get(1).posW + "," + soluciones.get(1).posR);

            //Encontrar otras posibles soluciones
            for (int g = 0; g < 81; g++) {
                for (int i = 0; i < 6; i += 2) {
                    for (int c = 0; c < 6; c += 2) {
                        for (int w = 0; w < 6; w += 2) {
                            for (int r = 0; r < 6; r += 2) {
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

                                    if ((Intento + 1) % 2 == 1) {
                                        int contAux2 = 0;
                                        for (int contAux = 0; contAux < soluciones.size(); contAux += 2) {
                                            if ((i != soluciones.get(contAux).posI
                                                    || c != soluciones.get(contAux).posC
                                                    || w != soluciones.get(contAux).posW
                                                    || r != soluciones.get(contAux).posR)
                                                    && (i != soluciones.get(contAux + 1).posI
                                                    || c != soluciones.get(contAux + 1).posC
                                                    || w != soluciones.get(contAux + 1).posW
                                                    || r != soluciones.get(contAux + 1).posR)) {
                                                contAux2++;
                                            }
                                        }

                                        if ((contAux2 == soluciones.size() / 2)) {
                                            System.out.println("Grafo G1: Horizontal - Encontrado (Alt)");
                                            posI = i;
                                            posC = c;
                                            posW = w;
                                            posR = r;

                                            Cubo1aristaG1I = verticesCubo1[i];
                                            Cubo1aristaG1F = verticesCubo1[i + 1];

                                            Cubo2aristaG1I = verticesCubo2[c];
                                            Cubo2aristaG1F = verticesCubo2[c + 1];

                                            Cubo3aristaG1I = verticesCubo3[w];
                                            Cubo3aristaG1F = verticesCubo3[w + 1];

                                            Cubo4aristaG1I = verticesCubo4[r];
                                            Cubo4aristaG1F = verticesCubo4[r + 1];

                                            Intento++;

                                            System.out.println("Cubo 1: " + Cubo1aristaG1I + "-" + Cubo1aristaG1F);
                                            System.out.println("Cubo 2: " + Cubo2aristaG1I + "-" + Cubo2aristaG1F);
                                            System.out.println("Cubo 3: " + Cubo3aristaG1I + "-" + Cubo3aristaG1F);
                                            System.out.println("Cubo 4: " + Cubo4aristaG1I + "-" + Cubo4aristaG1F);
                                        }

                                    } else if (((Intento + 1) % 2 == 0) && ((i != posI) && (c != posC) && (w != posW) && (r != posR))) {

                                        Cubo1aristaG2I = verticesCubo1[i];
                                        Cubo1aristaG2F = verticesCubo1[i + 1];

                                        Cubo2aristaG2I = verticesCubo2[c];
                                        Cubo2aristaG2F = verticesCubo2[c + 1];

                                        Cubo3aristaG2I = verticesCubo3[w];
                                        Cubo3aristaG2F = verticesCubo3[w + 1];

                                        Cubo4aristaG2I = verticesCubo4[r];
                                        Cubo4aristaG2F = verticesCubo4[r + 1];

                                        soluciones.add(new Soluciones(posI, Cubo1aristaG1I, Cubo1aristaG1F,
                                                posC, Cubo2aristaG1I, Cubo2aristaG1F,
                                                posW, Cubo3aristaG1I, Cubo3aristaG1F,
                                                posR, Cubo4aristaG1I, Cubo4aristaG1F));

                                        soluciones.add(new Soluciones(i, Cubo1aristaG2I, Cubo1aristaG2F,
                                                c, Cubo2aristaG2I, Cubo2aristaG2F,
                                                w, Cubo3aristaG2I, Cubo3aristaG2F,
                                                r, Cubo4aristaG2I, Cubo4aristaG2F));
                                        Intento++;
                                        iPosibilidades++;

                                        System.out.println("Grafo G2: Vertical - Encontrado (Alt)");
                                        System.out.println("Cubo 1: " + Cubo1aristaG2I + "-" + Cubo1aristaG2F);
                                        System.out.println("Cubo 2: " + Cubo2aristaG2I + "-" + Cubo2aristaG2F);
                                        System.out.println("Cubo 3: " + Cubo3aristaG2I + "-" + Cubo3aristaG2F);
                                        System.out.println("Cubo 4: " + Cubo4aristaG2I + "-" + Cubo4aristaG2F);

                                        System.out.println("SolHz");
                                        System.out.println(soluciones.get(soluciones.size() - 2).posI + "," + soluciones.get(soluciones.size() - 2).posC + "," + soluciones.get(soluciones.size() - 2).posW + "," + soluciones.get(soluciones.size() - 2).posR);

                                        System.out.println("SolVt");
                                        System.out.println(soluciones.get(1).posI + "," + soluciones.get(soluciones.size() - 1).posC + "," + soluciones.get(soluciones.size() - 1).posW + "," + soluciones.get(soluciones.size() - 1).posR);

                                    }
                                }

                            }

                        }

                    }

                }
            }
        }

        System.out.println("Posibilidades: " + iPosibilidades);
        if (G1Encontrado == true && G2Encontrado == true) {
            // Ordenar posiciones de las caras
            boolean condicion1 = (!soluciones.get(0).Cubo1aristaI.equals(soluciones.get(0).Cubo2aristaI)
                    && !soluciones.get(0).Cubo1aristaI.equals(soluciones.get(0).Cubo3aristaI)
                    && !soluciones.get(0).Cubo1aristaI.equals(soluciones.get(0).Cubo4aristaI))
                    //
                    && (!soluciones.get(0).Cubo2aristaI.equals(soluciones.get(0).Cubo3aristaI)
                    && !soluciones.get(0).Cubo2aristaI.equals(soluciones.get(0).Cubo4aristaI))
                    //
                    && !soluciones.get(0).Cubo3aristaI.equals(soluciones.get(0).Cubo4aristaI);

            boolean condicion2 = (!soluciones.get(0).Cubo1aristaF.equals(soluciones.get(0).Cubo2aristaF)
                    && !soluciones.get(0).Cubo1aristaF.equals(soluciones.get(0).Cubo3aristaF)
                    && !soluciones.get(0).Cubo1aristaF.equals(soluciones.get(0).Cubo4aristaF))
                    //
                    && (!soluciones.get(0).Cubo2aristaF.equals(soluciones.get(0).Cubo3aristaF)
                    && !soluciones.get(0).Cubo2aristaF.equals(soluciones.get(0).Cubo4aristaF))
                    //
                    && !soluciones.get(0).Cubo3aristaF.equals(soluciones.get(0).Cubo4aristaF);

            boolean condicion3 = (!soluciones.get(1).Cubo1aristaI.equals(soluciones.get(1).Cubo2aristaI)
                    && !soluciones.get(1).Cubo1aristaI.equals(soluciones.get(1).Cubo3aristaI)
                    && !soluciones.get(1).Cubo1aristaI.equals(soluciones.get(1).Cubo4aristaI))
                    //
                    && (!soluciones.get(1).Cubo2aristaI.equals(soluciones.get(1).Cubo3aristaI)
                    && !soluciones.get(1).Cubo2aristaI.equals(soluciones.get(1).Cubo4aristaI))
                    //
                    && !soluciones.get(1).Cubo3aristaI.equals(soluciones.get(1).Cubo4aristaI);

            boolean condicion4 = (!soluciones.get(1).Cubo1aristaF.equals(soluciones.get(1).Cubo2aristaF)
                    && !soluciones.get(1).Cubo1aristaF.equals(soluciones.get(1).Cubo3aristaF)
                    && !soluciones.get(1).Cubo1aristaF.equals(soluciones.get(1).Cubo4aristaF))
                    //
                    && (!soluciones.get(1).Cubo2aristaF.equals(soluciones.get(1).Cubo3aristaF)
                    && !soluciones.get(1).Cubo2aristaF.equals(soluciones.get(1).Cubo4aristaF))
                    //
                    && !soluciones.get(1).Cubo3aristaF.equals(soluciones.get(1).Cubo4aristaF);

            if (condicion1 && condicion2 && condicion3 && condicion4) {
                System.out.println("Posición correcta");

                // Asignar los colores a los cubos del juego
                // CUBO 1
                // Cara Frontal y Trasera (NO ES RELEVANTE)
                if (!(soluciones.get(1).Cubo1aristaI + soluciones.get(1).Cubo1aristaF).equals(Cubo1arista1I + Cubo1arista1F)
                        && !(soluciones.get(0).Cubo1aristaI + soluciones.get(0).Cubo1aristaF).equals(Cubo1arista1I + Cubo1arista1F)) {
                    Cubo1C1J.setText(Cubo1arista1I);
                    Cubo1C2J.setText(Cubo1arista1F);
                } else if (!(soluciones.get(1).Cubo1aristaI + soluciones.get(1).Cubo1aristaF).equals(Cubo1arista2I + Cubo1arista2F)
                        && !(soluciones.get(0).Cubo1aristaI + soluciones.get(0).Cubo1aristaF).equals(Cubo1arista2I + Cubo1arista2F)) {
                    Cubo1C1J.setText(Cubo1arista2I);
                    Cubo1C2J.setText(Cubo1arista2F);
                } else if (!(soluciones.get(1).Cubo1aristaI + soluciones.get(1).Cubo1aristaF).equals(Cubo1arista3I + Cubo1arista3F)
                        && !(soluciones.get(0).Cubo1aristaI + soluciones.get(0).Cubo1aristaF).equals(Cubo1arista3I + Cubo1arista3F)) {
                    Cubo1C1J.setText(Cubo1arista3I);
                    Cubo1C2J.setText(Cubo1arista3F);
                }

                // Cara Frontal
                if (Cubo1C1J.getText().equals("R")) {
                    Cubo1C1J.setBackground(Rojo);
                } else if (Cubo1C1J.getText().equals("B")) {
                    Cubo1C1J.setBackground(Blanco);
                } else if (Cubo1C1J.getText().equals("V")) {
                    Cubo1C1J.setBackground(Verde);
                } else if (Cubo1C1J.getText().equals("A")) {
                    Cubo1C1J.setBackground(Amarillo);
                }
                // Cara Trasera
                if (Cubo1C2J.getText().equals("R")) {
                    Cubo1C2J.setBackground(Rojo);
                } else if (Cubo1C2J.getText().equals("B")) {
                    Cubo1C2J.setBackground(Blanco);
                } else if (Cubo1C2J.getText().equals("V")) {
                    Cubo1C2J.setBackground(Verde);
                } else if (Cubo1C2J.getText().equals("A")) {
                    Cubo1C2J.setBackground(Amarillo);
                }

                // Otras Caras
                // Cara izquierda
                Cubo1C6J.setText(soluciones.get(0).Cubo1aristaI);
                Cubo1C6E.setText(soluciones.get(0).Cubo1aristaI);

                if (soluciones.get(0).Cubo1aristaI.equals("R")) {
                    Cubo1C6J.setBackground(Rojo);
                } else if (soluciones.get(0).Cubo1aristaI.equals("B")) {
                    Cubo1C6J.setBackground(Blanco);
                } else if (soluciones.get(0).Cubo1aristaI.equals("V")) {
                    Cubo1C6J.setBackground(Verde);
                } else if (soluciones.get(0).Cubo1aristaI.equals("A")) {
                    Cubo1C6J.setBackground(Amarillo);
                }

                // Cara derecha
                Cubo1C5J.setText(soluciones.get(0).Cubo1aristaF);
                Cubo1C5E.setText(soluciones.get(0).Cubo1aristaF);
                if (soluciones.get(0).Cubo1aristaF.equals("R")) {
                    Cubo1C5J.setBackground(Rojo);
                } else if (soluciones.get(0).Cubo1aristaF.equals("B")) {
                    Cubo1C5J.setBackground(Blanco);
                } else if (soluciones.get(0).Cubo1aristaF.equals("V")) {
                    Cubo1C5J.setBackground(Verde);
                } else if (soluciones.get(0).Cubo1aristaF.equals("A")) {
                    Cubo1C5J.setBackground(Amarillo);
                }

                // Cara superior
                Cubo1C3J.setText(soluciones.get(1).Cubo1aristaI);
                Cubo1C3E.setText(soluciones.get(1).Cubo1aristaI);

                if (soluciones.get(1).Cubo1aristaI.equals("R")) {
                    Cubo1C3J.setBackground(Rojo);
                } else if (soluciones.get(1).Cubo1aristaI.equals("B")) {
                    Cubo1C3J.setBackground(Blanco);
                } else if (soluciones.get(1).Cubo1aristaI.equals("V")) {
                    Cubo1C3J.setBackground(Verde);
                } else if (soluciones.get(1).Cubo1aristaI.equals("A")) {
                    Cubo1C3J.setBackground(Amarillo);
                }

                // Cara inferior
                Cubo1C4J.setText(soluciones.get(1).Cubo1aristaF);
                Cubo1C4E.setText(soluciones.get(1).Cubo1aristaF);

                if (soluciones.get(1).Cubo1aristaF.equals("R")) {
                    Cubo1C4J.setBackground(Rojo);
                } else if (soluciones.get(1).Cubo1aristaF.equals("B")) {
                    Cubo1C4J.setBackground(Blanco);
                } else if (soluciones.get(1).Cubo1aristaF.equals("V")) {
                    Cubo1C4J.setBackground(Verde);
                } else if (soluciones.get(1).Cubo1aristaF.equals("A")) {
                    Cubo1C4J.setBackground(Amarillo);
                }

                // CUBO 2
                // Cara Frontal y Trasera (NO ES RELEVANTE)
                if (!(soluciones.get(1).Cubo2aristaI + soluciones.get(1).Cubo2aristaF).equals(Cubo2arista1I + Cubo2arista1F)
                        && !(soluciones.get(0).Cubo2aristaI + soluciones.get(0).Cubo2aristaF).equals(Cubo2arista1I + Cubo2arista1F)) {
                    Cubo2C1J.setText(Cubo2arista1I);
                    Cubo2C2J.setText(Cubo2arista1F);
                } else if (!(soluciones.get(1).Cubo2aristaI + soluciones.get(1).Cubo2aristaF).equals(Cubo2arista2I + Cubo2arista2F)
                        && !(soluciones.get(0).Cubo2aristaI + soluciones.get(0).Cubo2aristaF).equals(Cubo2arista2I + Cubo2arista2F)) {
                    Cubo2C1J.setText(Cubo2arista2I);
                    Cubo2C2J.setText(Cubo2arista2F);
                } else if (!(soluciones.get(1).Cubo2aristaI + soluciones.get(1).Cubo2aristaF).equals(Cubo2arista3I + Cubo2arista3F)
                        && !(soluciones.get(0).Cubo2aristaI + soluciones.get(0).Cubo2aristaF).equals(Cubo2arista3I + Cubo2arista3F)) {
                    Cubo2C1J.setText(Cubo2arista3I);
                    Cubo2C2J.setText(Cubo2arista3F);
                }

                // Cara Frontal
                if (Cubo2C1J.getText().equals("R")) {
                    Cubo2C1J.setBackground(Rojo);
                } else if (Cubo2C1J.getText().equals("B")) {
                    Cubo2C1J.setBackground(Blanco);
                } else if (Cubo2C1J.getText().equals("V")) {
                    Cubo2C1J.setBackground(Verde);
                } else if (Cubo2C1J.getText().equals("A")) {
                    Cubo2C1J.setBackground(Amarillo);
                }
                // Cara Trasera
                if (Cubo2C2J.getText().equals("R")) {
                    Cubo2C2J.setBackground(Rojo);
                } else if (Cubo2C2J.getText().equals("B")) {
                    Cubo2C2J.setBackground(Blanco);
                } else if (Cubo2C2J.getText().equals("V")) {
                    Cubo2C2J.setBackground(Verde);
                } else if (Cubo2C2J.getText().equals("A")) {
                    Cubo2C2J.setBackground(Amarillo);
                }

                // Cara izquierda
                Cubo2C6J.setText(soluciones.get(0).Cubo2aristaI);
                Cubo2C6E.setText(soluciones.get(0).Cubo2aristaI);

                if (soluciones.get(0).Cubo2aristaI.equals("R")) {
                    Cubo2C6J.setBackground(Rojo);
                } else if (soluciones.get(0).Cubo2aristaI.equals("B")) {
                    Cubo2C6J.setBackground(Blanco);
                } else if (soluciones.get(0).Cubo2aristaI.equals("V")) {
                    Cubo2C6J.setBackground(Verde);
                } else if (soluciones.get(0).Cubo2aristaI.equals("A")) {
                    Cubo2C6J.setBackground(Amarillo);
                }

                // Cara derecha
                Cubo2C5J.setText(soluciones.get(0).Cubo2aristaF);
                Cubo2C5E.setText(soluciones.get(0).Cubo2aristaF);
                if (soluciones.get(0).Cubo2aristaF.equals("R")) {
                    Cubo2C5J.setBackground(Rojo);
                } else if (soluciones.get(0).Cubo2aristaF.equals("B")) {
                    Cubo2C5J.setBackground(Blanco);
                } else if (soluciones.get(0).Cubo2aristaF.equals("V")) {
                    Cubo2C5J.setBackground(Verde);
                } else if (soluciones.get(0).Cubo2aristaF.equals("A")) {
                    Cubo2C5J.setBackground(Amarillo);
                }

                // Cara superior
                Cubo2C3J.setText(soluciones.get(1).Cubo2aristaI);
                Cubo2C3E.setText(soluciones.get(1).Cubo2aristaI);

                if (soluciones.get(1).Cubo2aristaI.equals("R")) {
                    Cubo2C3J.setBackground(Rojo);
                } else if (soluciones.get(1).Cubo2aristaI.equals("B")) {
                    Cubo2C3J.setBackground(Blanco);
                } else if (soluciones.get(1).Cubo2aristaI.equals("V")) {
                    Cubo2C3J.setBackground(Verde);
                } else if (soluciones.get(1).Cubo2aristaI.equals("A")) {
                    Cubo2C3J.setBackground(Amarillo);
                }

                // Cara inferior
                Cubo2C4J.setText(soluciones.get(1).Cubo2aristaF);
                Cubo2C4E.setText(soluciones.get(1).Cubo2aristaF);

                if (soluciones.get(1).Cubo2aristaF.equals("R")) {
                    Cubo2C4J.setBackground(Rojo);
                } else if (soluciones.get(1).Cubo2aristaF.equals("B")) {
                    Cubo2C4J.setBackground(Blanco);
                } else if (soluciones.get(1).Cubo2aristaF.equals("V")) {
                    Cubo2C4J.setBackground(Verde);
                } else if (soluciones.get(1).Cubo2aristaF.equals("A")) {
                    Cubo2C4J.setBackground(Amarillo);
                }

                // CUBO 3
                // Cara Frontal y Trasera (NO ES RELEVANTE)
                if (!(soluciones.get(1).Cubo3aristaI + soluciones.get(1).Cubo3aristaF).equals(Cubo3arista1I + Cubo3arista1F)
                        && !(soluciones.get(0).Cubo3aristaI + soluciones.get(0).Cubo3aristaF).equals(Cubo3arista1I + Cubo3arista1F)) {
                    Cubo3C1J.setText(Cubo3arista1I);
                    Cubo3C2J.setText(Cubo3arista1F);
                } else if (!(soluciones.get(1).Cubo3aristaI + soluciones.get(1).Cubo3aristaF).equals(Cubo3arista2I + Cubo3arista2F)
                        && !(soluciones.get(0).Cubo3aristaI + soluciones.get(0).Cubo3aristaF).equals(Cubo3arista2I + Cubo3arista2F)) {
                    Cubo3C1J.setText(Cubo3arista2I);
                    Cubo3C2J.setText(Cubo3arista2F);
                } else if (!(soluciones.get(1).Cubo3aristaI + soluciones.get(1).Cubo3aristaF).equals(Cubo3arista3I + Cubo3arista3F)
                        && !(soluciones.get(0).Cubo3aristaI + soluciones.get(0).Cubo3aristaF).equals(Cubo3arista3I + Cubo3arista3F)) {
                    Cubo3C1J.setText(Cubo3arista3I);
                    Cubo3C2J.setText(Cubo3arista3F);
                }

                // Cara Frontal
                if (Cubo3C1J.getText().equals("R")) {
                    Cubo3C1J.setBackground(Rojo);
                } else if (Cubo3C1J.getText().equals("B")) {
                    Cubo3C1J.setBackground(Blanco);
                } else if (Cubo3C1J.getText().equals("V")) {
                    Cubo3C1J.setBackground(Verde);
                } else if (Cubo3C1J.getText().equals("A")) {
                    Cubo3C1J.setBackground(Amarillo);
                }
                // Cara Trasera
                if (Cubo3C2J.getText().equals("R")) {
                    Cubo3C2J.setBackground(Rojo);
                } else if (Cubo3C2J.getText().equals("B")) {
                    Cubo3C2J.setBackground(Blanco);
                } else if (Cubo3C2J.getText().equals("V")) {
                    Cubo3C2J.setBackground(Verde);
                } else if (Cubo3C2J.getText().equals("A")) {
                    Cubo3C2J.setBackground(Amarillo);
                }

                // Cara izquierda
                Cubo3C6J.setText(soluciones.get(0).Cubo3aristaI);
                Cubo3C6E.setText(soluciones.get(0).Cubo3aristaI);

                if (soluciones.get(0).Cubo3aristaI.equals("R")) {
                    Cubo3C6J.setBackground(Rojo);
                } else if (soluciones.get(0).Cubo3aristaI.equals("B")) {
                    Cubo3C6J.setBackground(Blanco);
                } else if (soluciones.get(0).Cubo3aristaI.equals("V")) {
                    Cubo3C6J.setBackground(Verde);
                } else if (soluciones.get(0).Cubo3aristaI.equals("A")) {
                    Cubo3C6J.setBackground(Amarillo);
                }

                // Cara derecha
                Cubo3C5J.setText(soluciones.get(0).Cubo3aristaF);
                Cubo3C5E.setText(soluciones.get(0).Cubo3aristaF);
                if (soluciones.get(0).Cubo3aristaF.equals("R")) {
                    Cubo3C5J.setBackground(Rojo);
                } else if (soluciones.get(0).Cubo3aristaF.equals("B")) {
                    Cubo3C5J.setBackground(Blanco);
                } else if (soluciones.get(0).Cubo3aristaF.equals("V")) {
                    Cubo3C5J.setBackground(Verde);
                } else if (soluciones.get(0).Cubo3aristaF.equals("A")) {
                    Cubo3C5J.setBackground(Amarillo);
                }

                // Cara superior
                Cubo3C3J.setText(soluciones.get(1).Cubo3aristaI);
                Cubo3C3E.setText(soluciones.get(1).Cubo3aristaI);

                if (soluciones.get(1).Cubo3aristaI.equals("R")) {
                    Cubo3C3J.setBackground(Rojo);
                } else if (soluciones.get(1).Cubo3aristaI.equals("B")) {
                    Cubo3C3J.setBackground(Blanco);
                } else if (soluciones.get(1).Cubo3aristaI.equals("V")) {
                    Cubo3C3J.setBackground(Verde);
                } else if (soluciones.get(1).Cubo3aristaI.equals("A")) {
                    Cubo3C3J.setBackground(Amarillo);
                }

                // Cara inferior
                Cubo3C4J.setText(soluciones.get(1).Cubo3aristaF);
                Cubo3C4E.setText(soluciones.get(1).Cubo3aristaF);

                if (soluciones.get(1).Cubo3aristaF.equals("R")) {
                    Cubo3C4J.setBackground(Rojo);
                } else if (soluciones.get(1).Cubo3aristaF.equals("B")) {
                    Cubo3C4J.setBackground(Blanco);
                } else if (soluciones.get(1).Cubo3aristaF.equals("V")) {
                    Cubo3C4J.setBackground(Verde);
                } else if (soluciones.get(1).Cubo3aristaF.equals("A")) {
                    Cubo3C4J.setBackground(Amarillo);
                }

                // CUBO 4
                // Cara Frontal y Trasera (NO ES RELEVANTE)
                if (!(soluciones.get(1).Cubo4aristaI + soluciones.get(1).Cubo4aristaF).equals(Cubo4arista1I + Cubo4arista1F)
                        && !(soluciones.get(0).Cubo4aristaI + soluciones.get(0).Cubo4aristaF).equals(Cubo4arista1I + Cubo4arista1F)) {
                    Cubo4C1J.setText(Cubo4arista1I);
                    Cubo4C2J.setText(Cubo4arista1F);
                } else if (!(soluciones.get(1).Cubo4aristaI + soluciones.get(1).Cubo4aristaF).equals(Cubo4arista2I + Cubo4arista2F)
                        && !(soluciones.get(0).Cubo4aristaI + soluciones.get(0).Cubo4aristaF).equals(Cubo4arista2I + Cubo4arista2F)) {
                    Cubo4C1J.setText(Cubo4arista2I);
                    Cubo4C2J.setText(Cubo4arista2F);
                } else if (!(soluciones.get(1).Cubo4aristaI + soluciones.get(1).Cubo4aristaF).equals(Cubo4arista3I + Cubo4arista3F)
                        && !(soluciones.get(0).Cubo4aristaI + soluciones.get(0).Cubo4aristaF).equals(Cubo4arista3I + Cubo4arista3F)) {
                    Cubo4C1J.setText(Cubo4arista3I);
                    Cubo4C2J.setText(Cubo4arista3F);
                }

                // Cara Frontal
                if (Cubo4C1J.getText().equals("R")) {
                    Cubo4C1J.setBackground(Rojo);
                } else if (Cubo4C1J.getText().equals("B")) {
                    Cubo4C1J.setBackground(Blanco);
                } else if (Cubo4C1J.getText().equals("V")) {
                    Cubo4C1J.setBackground(Verde);
                } else if (Cubo4C1J.getText().equals("A")) {
                    Cubo4C1J.setBackground(Amarillo);
                }
                // Cara Trasera
                if (Cubo4C2J.getText().equals("R")) {
                    Cubo4C2J.setBackground(Rojo);
                } else if (Cubo4C2J.getText().equals("B")) {
                    Cubo4C2J.setBackground(Blanco);
                } else if (Cubo4C2J.getText().equals("V")) {
                    Cubo4C2J.setBackground(Verde);
                } else if (Cubo4C2J.getText().equals("A")) {
                    Cubo4C2J.setBackground(Amarillo);
                }

                // Cara izquierda
                Cubo4C6J.setText(soluciones.get(0).Cubo4aristaI);
                Cubo4C6E.setText(soluciones.get(0).Cubo4aristaI);

                if (soluciones.get(0).Cubo4aristaI.equals("R")) {
                    Cubo4C6J.setBackground(Rojo);
                } else if (soluciones.get(0).Cubo4aristaI.equals("B")) {
                    Cubo4C6J.setBackground(Blanco);
                } else if (soluciones.get(0).Cubo4aristaI.equals("V")) {
                    Cubo4C6J.setBackground(Verde);
                } else if (soluciones.get(0).Cubo4aristaI.equals("A")) {
                    Cubo4C6J.setBackground(Amarillo);
                }

                // Cara derecha
                Cubo4C5J.setText(soluciones.get(0).Cubo4aristaF);
                Cubo4C5E.setText(soluciones.get(0).Cubo4aristaF);
                if (soluciones.get(0).Cubo4aristaF.equals("R")) {
                    Cubo4C5J.setBackground(Rojo);
                } else if (soluciones.get(0).Cubo4aristaF.equals("B")) {
                    Cubo4C5J.setBackground(Blanco);
                } else if (soluciones.get(0).Cubo4aristaF.equals("V")) {
                    Cubo4C5J.setBackground(Verde);
                } else if (soluciones.get(0).Cubo4aristaF.equals("A")) {
                    Cubo4C5J.setBackground(Amarillo);
                }

                // Cara superior
                Cubo4C3J.setText(soluciones.get(1).Cubo4aristaI);
                Cubo4C3E.setText(soluciones.get(1).Cubo4aristaI);

                if (soluciones.get(1).Cubo4aristaI.equals("R")) {
                    Cubo4C3J.setBackground(Rojo);
                } else if (soluciones.get(1).Cubo4aristaI.equals("B")) {
                    Cubo4C3J.setBackground(Blanco);
                } else if (soluciones.get(1).Cubo4aristaI.equals("V")) {
                    Cubo4C3J.setBackground(Verde);
                } else if (soluciones.get(1).Cubo4aristaI.equals("A")) {
                    Cubo4C3J.setBackground(Amarillo);
                }

                // Cara inferior
                Cubo4C4J.setText(soluciones.get(1).Cubo4aristaF);
                Cubo4C4E.setText(soluciones.get(1).Cubo4aristaF);

                if (soluciones.get(1).Cubo4aristaF.equals("R")) {
                    Cubo4C4J.setBackground(Rojo);
                } else if (soluciones.get(1).Cubo4aristaF.equals("B")) {
                    Cubo4C4J.setBackground(Blanco);
                } else if (soluciones.get(1).Cubo4aristaF.equals("V")) {
                    Cubo4C4J.setBackground(Verde);
                } else if (soluciones.get(1).Cubo4aristaF.equals("A")) {
                    Cubo4C4J.setBackground(Amarillo);
                }

                System.out.println("Aristas restantes: ");
                System.out.println("Cubo 1: " + Cubo1C1J.getText() + "-" + Cubo1C2J.getText());
                System.out.println("Cubo 2: " + Cubo2C1J.getText() + "-" + Cubo2C2J.getText());
                System.out.println("Cubo 3: " + Cubo3C1J.getText() + "-" + Cubo3C2J.getText());
                System.out.println("Cubo 4: " + Cubo4C1J.getText() + "-" + Cubo4C2J.getText());

            } else {

                // Ordenar Horizontales
                String[] caraIzquierda = {soluciones.get(0).Cubo1aristaI, soluciones.get(0).Cubo2aristaI, soluciones.get(0).Cubo3aristaI, soluciones.get(0).Cubo4aristaI};
                String[] caraDerecha = {soluciones.get(0).Cubo1aristaF, soluciones.get(0).Cubo2aristaF, soluciones.get(0).Cubo3aristaF, soluciones.get(0).Cubo4aristaF};
                String[] caraSuperior = {soluciones.get(1).Cubo1aristaI, soluciones.get(1).Cubo2aristaI, soluciones.get(1).Cubo3aristaI, soluciones.get(1).Cubo4aristaI};
                String[] caraInferior = {soluciones.get(1).Cubo1aristaF, soluciones.get(1).Cubo2aristaF, soluciones.get(1).Cubo3aristaF, soluciones.get(1).Cubo4aristaF};

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

                    caraIzquierda = new String[]{soluciones.get(0).Cubo1aristaI, soluciones.get(0).Cubo2aristaI, soluciones.get(0).Cubo3aristaI, soluciones.get(0).Cubo4aristaI};
                    caraDerecha = new String[]{soluciones.get(0).Cubo1aristaF, soluciones.get(0).Cubo2aristaF, soluciones.get(0).Cubo3aristaF, soluciones.get(0).Cubo4aristaF};

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

                    caraIzquierda = new String[]{soluciones.get(0).Cubo1aristaI, soluciones.get(0).Cubo2aristaI, soluciones.get(0).Cubo3aristaI, soluciones.get(0).Cubo4aristaI};
                    caraDerecha = new String[]{soluciones.get(0).Cubo1aristaF, soluciones.get(0).Cubo2aristaF, soluciones.get(0).Cubo3aristaF, soluciones.get(0).Cubo4aristaF};

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

                    caraIzquierda = new String[]{soluciones.get(0).Cubo1aristaI, soluciones.get(0).Cubo2aristaI, soluciones.get(0).Cubo3aristaI, soluciones.get(0).Cubo4aristaI};
                    caraDerecha = new String[]{soluciones.get(0).Cubo1aristaF, soluciones.get(0).Cubo2aristaF, soluciones.get(0).Cubo3aristaF, soluciones.get(0).Cubo4aristaF};

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

                    caraIzquierda = new String[]{soluciones.get(0).Cubo1aristaI, soluciones.get(0).Cubo2aristaI, soluciones.get(0).Cubo3aristaI, soluciones.get(0).Cubo4aristaI};
                    caraDerecha = new String[]{soluciones.get(0).Cubo1aristaF, soluciones.get(0).Cubo2aristaF, soluciones.get(0).Cubo3aristaF, soluciones.get(0).Cubo4aristaF};

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

                    caraIzquierda = new String[]{soluciones.get(0).Cubo1aristaI, soluciones.get(0).Cubo2aristaI, soluciones.get(0).Cubo3aristaI, soluciones.get(0).Cubo4aristaI};
                    caraDerecha = new String[]{soluciones.get(0).Cubo1aristaF, soluciones.get(0).Cubo2aristaF, soluciones.get(0).Cubo3aristaF, soluciones.get(0).Cubo4aristaF};

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

                    caraIzquierda = new String[]{soluciones.get(0).Cubo1aristaI, soluciones.get(0).Cubo2aristaI, soluciones.get(0).Cubo3aristaI, soluciones.get(0).Cubo4aristaI};
                    caraDerecha = new String[]{soluciones.get(0).Cubo1aristaF, soluciones.get(0).Cubo2aristaF, soluciones.get(0).Cubo3aristaF, soluciones.get(0).Cubo4aristaF};

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

                    caraIzquierda = new String[]{soluciones.get(0).Cubo1aristaI, soluciones.get(0).Cubo2aristaI, soluciones.get(0).Cubo3aristaI, soluciones.get(0).Cubo4aristaI};
                    caraDerecha = new String[]{soluciones.get(0).Cubo1aristaF, soluciones.get(0).Cubo2aristaF, soluciones.get(0).Cubo3aristaF, soluciones.get(0).Cubo4aristaF};

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

                    caraIzquierda = new String[]{soluciones.get(0).Cubo1aristaI, soluciones.get(0).Cubo2aristaI, soluciones.get(0).Cubo3aristaI, soluciones.get(0).Cubo4aristaI};
                    caraDerecha = new String[]{soluciones.get(0).Cubo1aristaF, soluciones.get(0).Cubo2aristaF, soluciones.get(0).Cubo3aristaF, soluciones.get(0).Cubo4aristaF};

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

                    caraIzquierda = new String[]{soluciones.get(0).Cubo1aristaI, soluciones.get(0).Cubo2aristaI, soluciones.get(0).Cubo3aristaI, soluciones.get(0).Cubo4aristaI};
                    caraDerecha = new String[]{soluciones.get(0).Cubo1aristaF, soluciones.get(0).Cubo2aristaF, soluciones.get(0).Cubo3aristaF, soluciones.get(0).Cubo4aristaF};

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

                    caraIzquierda = new String[]{soluciones.get(0).Cubo1aristaI, soluciones.get(0).Cubo2aristaI, soluciones.get(0).Cubo3aristaI, soluciones.get(0).Cubo4aristaI};
                    caraDerecha = new String[]{soluciones.get(0).Cubo1aristaF, soluciones.get(0).Cubo2aristaF, soluciones.get(0).Cubo3aristaF, soluciones.get(0).Cubo4aristaF};

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

                    caraIzquierda = new String[]{soluciones.get(0).Cubo1aristaI, soluciones.get(0).Cubo2aristaI, soluciones.get(0).Cubo3aristaI, soluciones.get(0).Cubo4aristaI};
                    caraDerecha = new String[]{soluciones.get(0).Cubo1aristaF, soluciones.get(0).Cubo2aristaF, soluciones.get(0).Cubo3aristaF, soluciones.get(0).Cubo4aristaF};

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

                    caraIzquierda = new String[]{soluciones.get(0).Cubo1aristaI, soluciones.get(0).Cubo2aristaI, soluciones.get(0).Cubo3aristaI, soluciones.get(0).Cubo4aristaI};
                    caraDerecha = new String[]{soluciones.get(0).Cubo1aristaF, soluciones.get(0).Cubo2aristaF, soluciones.get(0).Cubo3aristaF, soluciones.get(0).Cubo4aristaF};

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

                    caraIzquierda = new String[]{soluciones.get(0).Cubo1aristaI, soluciones.get(0).Cubo2aristaI, soluciones.get(0).Cubo3aristaI, soluciones.get(0).Cubo4aristaI};
                    caraDerecha = new String[]{soluciones.get(0).Cubo1aristaF, soluciones.get(0).Cubo2aristaF, soluciones.get(0).Cubo3aristaF, soluciones.get(0).Cubo4aristaF};

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

                    caraSuperior = new String[]{soluciones.get(1).Cubo1aristaI, soluciones.get(1).Cubo2aristaI, soluciones.get(1).Cubo3aristaI, soluciones.get(1).Cubo4aristaI};
                    caraInferior = new String[]{soluciones.get(1).Cubo1aristaF, soluciones.get(1).Cubo2aristaF, soluciones.get(1).Cubo3aristaF, soluciones.get(1).Cubo4aristaF};

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

                    caraSuperior = new String[]{soluciones.get(1).Cubo1aristaI, soluciones.get(1).Cubo2aristaI, soluciones.get(1).Cubo3aristaI, soluciones.get(1).Cubo4aristaI};
                    caraInferior = new String[]{soluciones.get(1).Cubo1aristaF, soluciones.get(1).Cubo2aristaF, soluciones.get(1).Cubo3aristaF, soluciones.get(1).Cubo4aristaF};

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

                    caraSuperior = new String[]{soluciones.get(1).Cubo1aristaI, soluciones.get(1).Cubo2aristaI, soluciones.get(1).Cubo3aristaI, soluciones.get(1).Cubo4aristaI};
                    caraInferior = new String[]{soluciones.get(1).Cubo1aristaF, soluciones.get(1).Cubo2aristaF, soluciones.get(1).Cubo3aristaF, soluciones.get(1).Cubo4aristaF};

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

                    caraSuperior = new String[]{soluciones.get(1).Cubo1aristaI, soluciones.get(1).Cubo2aristaI, soluciones.get(1).Cubo3aristaI, soluciones.get(1).Cubo4aristaI};
                    caraInferior = new String[]{soluciones.get(1).Cubo1aristaF, soluciones.get(1).Cubo2aristaF, soluciones.get(1).Cubo3aristaF, soluciones.get(1).Cubo4aristaF};

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

                    caraSuperior = new String[]{soluciones.get(1).Cubo1aristaI, soluciones.get(1).Cubo2aristaI, soluciones.get(1).Cubo3aristaI, soluciones.get(1).Cubo4aristaI};
                    caraInferior = new String[]{soluciones.get(1).Cubo1aristaF, soluciones.get(1).Cubo2aristaF, soluciones.get(1).Cubo3aristaF, soluciones.get(1).Cubo4aristaF};

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

                    caraSuperior = new String[]{soluciones.get(1).Cubo1aristaI, soluciones.get(1).Cubo2aristaI, soluciones.get(1).Cubo3aristaI, soluciones.get(1).Cubo4aristaI};
                    caraInferior = new String[]{soluciones.get(1).Cubo1aristaF, soluciones.get(1).Cubo2aristaF, soluciones.get(1).Cubo3aristaF, soluciones.get(1).Cubo4aristaF};

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

                    caraSuperior = new String[]{soluciones.get(1).Cubo1aristaI, soluciones.get(1).Cubo2aristaI, soluciones.get(1).Cubo3aristaI, soluciones.get(1).Cubo4aristaI};
                    caraInferior = new String[]{soluciones.get(1).Cubo1aristaF, soluciones.get(1).Cubo2aristaF, soluciones.get(1).Cubo3aristaF, soluciones.get(1).Cubo4aristaF};

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

                    caraSuperior = new String[]{soluciones.get(1).Cubo1aristaI, soluciones.get(1).Cubo2aristaI, soluciones.get(1).Cubo3aristaI, soluciones.get(1).Cubo4aristaI};
                    caraInferior = new String[]{soluciones.get(1).Cubo1aristaF, soluciones.get(1).Cubo2aristaF, soluciones.get(1).Cubo3aristaF, soluciones.get(1).Cubo4aristaF};

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

                    caraSuperior = new String[]{soluciones.get(1).Cubo1aristaI, soluciones.get(1).Cubo2aristaI, soluciones.get(1).Cubo3aristaI, soluciones.get(1).Cubo4aristaI};
                    caraInferior = new String[]{soluciones.get(1).Cubo1aristaF, soluciones.get(1).Cubo2aristaF, soluciones.get(1).Cubo3aristaF, soluciones.get(1).Cubo4aristaF};

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

                    caraSuperior = new String[]{soluciones.get(1).Cubo1aristaI, soluciones.get(1).Cubo2aristaI, soluciones.get(1).Cubo3aristaI, soluciones.get(1).Cubo4aristaI};
                    caraInferior = new String[]{soluciones.get(1).Cubo1aristaF, soluciones.get(1).Cubo2aristaF, soluciones.get(1).Cubo3aristaF, soluciones.get(1).Cubo4aristaF};

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

                    caraSuperior = new String[]{soluciones.get(1).Cubo1aristaI, soluciones.get(1).Cubo2aristaI, soluciones.get(1).Cubo3aristaI, soluciones.get(1).Cubo4aristaI};
                    caraInferior = new String[]{soluciones.get(1).Cubo1aristaF, soluciones.get(1).Cubo2aristaF, soluciones.get(1).Cubo3aristaF, soluciones.get(1).Cubo4aristaF};

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

                    caraSuperior = new String[]{soluciones.get(1).Cubo1aristaI, soluciones.get(1).Cubo2aristaI, soluciones.get(1).Cubo3aristaI, soluciones.get(1).Cubo4aristaI};
                    caraInferior = new String[]{soluciones.get(1).Cubo1aristaF, soluciones.get(1).Cubo2aristaF, soluciones.get(1).Cubo3aristaF, soluciones.get(1).Cubo4aristaF};

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

                    caraSuperior = new String[]{soluciones.get(1).Cubo1aristaI, soluciones.get(1).Cubo2aristaI, soluciones.get(1).Cubo3aristaI, soluciones.get(1).Cubo4aristaI};
                    caraInferior = new String[]{soluciones.get(1).Cubo1aristaF, soluciones.get(1).Cubo2aristaF, soluciones.get(1).Cubo3aristaF, soluciones.get(1).Cubo4aristaF};

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
                if (!(soluciones.get(0).Cubo1aristaI + soluciones.get(0).Cubo1aristaF).equals(Cubo1arista1I + Cubo1arista1F)
                        && !(soluciones.get(1).Cubo1aristaI + soluciones.get(1).Cubo1aristaF).equals(Cubo1arista1I + Cubo1arista1F)) {
                    Cubo1C1J.setText(Cubo1arista1I);
                    Cubo1C2J.setText(Cubo1arista1F);
                } else if (!(soluciones.get(0).Cubo1aristaI + soluciones.get(0).Cubo1aristaF).equals(Cubo1arista2I + Cubo1arista2F)
                        && !(soluciones.get(1).Cubo1aristaI + soluciones.get(1).Cubo1aristaF).equals(Cubo1arista2I + Cubo1arista2F)) {
                    Cubo1C1J.setText(Cubo1arista2I);
                    Cubo1C2J.setText(Cubo1arista2F);
                } else if (!(soluciones.get(0).Cubo1aristaI + soluciones.get(0).Cubo1aristaF).equals(Cubo1arista3I + Cubo1arista3F)
                        && !(soluciones.get(1).Cubo1aristaI + soluciones.get(1).Cubo1aristaF).equals(Cubo1arista3I + Cubo1arista3F)) {
                    Cubo1C1J.setText(Cubo1arista3I);
                    Cubo1C2J.setText(Cubo1arista3F);
                }

                System.out.println("Aristas restantes: ");
                System.out.println("Cubo 1: " + Cubo1C1J.getText() + "-" + Cubo1C2J.getText());

                // Cara Frontal
                if (Cubo1C1J.getText().equals("R")) {
                    Cubo1C1J.setBackground(Rojo);
                } else if (Cubo1C1J.getText().equals("B")) {
                    Cubo1C1J.setBackground(Blanco);
                } else if (Cubo1C1J.getText().equals("V")) {
                    Cubo1C1J.setBackground(Verde);
                } else if (Cubo1C1J.getText().equals("A")) {
                    Cubo1C1J.setBackground(Amarillo);
                }
                // Cara Trasera
                if (Cubo1C2J.getText().equals("R")) {
                    Cubo1C2J.setBackground(Rojo);
                } else if (Cubo1C2J.getText().equals("B")) {
                    Cubo1C2J.setBackground(Blanco);
                } else if (Cubo1C2J.getText().equals("V")) {
                    Cubo1C2J.setBackground(Verde);
                } else if (Cubo1C2J.getText().equals("A")) {
                    Cubo1C2J.setBackground(Amarillo);
                }

                // Cara izquierda
                Cubo1C6J.setText(Cubo1Cara6);
                Cubo1C6E.setText(Cubo1Cara6);

                if (Cubo1Cara6.equals("R")) {
                    Cubo1C6J.setBackground(Rojo);
                } else if (Cubo1Cara6.equals("B")) {
                    Cubo1C6J.setBackground(Blanco);
                } else if (Cubo1Cara6.equals("V")) {
                    Cubo1C6J.setBackground(Verde);
                } else if (Cubo1Cara6.equals("A")) {
                    Cubo1C6J.setBackground(Amarillo);
                }

                // Cara derecha
                Cubo1C5J.setText(Cubo1Cara5);
                Cubo1C5E.setText(Cubo1Cara5);
                if (Cubo1Cara5.equals("R")) {
                    Cubo1C5J.setBackground(Rojo);
                } else if (Cubo1Cara5.equals("B")) {
                    Cubo1C5J.setBackground(Blanco);
                } else if (Cubo1Cara5.equals("V")) {
                    Cubo1C5J.setBackground(Verde);
                } else if (Cubo1Cara5.equals("A")) {
                    Cubo1C5J.setBackground(Amarillo);
                }

                // Cara superior
                Cubo1C3J.setText(Cubo1Cara3);
                Cubo1C3E.setText(Cubo1Cara3);

                if (Cubo1Cara3.equals("R")) {
                    Cubo1C3J.setBackground(Rojo);
                } else if (Cubo1Cara3.equals("B")) {
                    Cubo1C3J.setBackground(Blanco);
                } else if (Cubo1Cara3.equals("V")) {
                    Cubo1C3J.setBackground(Verde);
                } else if (Cubo1Cara3.equals("A")) {
                    Cubo1C3J.setBackground(Amarillo);
                }

                // Cara inferior
                Cubo1C4J.setText(Cubo1Cara4);
                Cubo1C4E.setText(Cubo1Cara4);

                if (Cubo1Cara4.equals("R")) {
                    Cubo1C4J.setBackground(Rojo);
                } else if (Cubo1Cara4.equals("B")) {
                    Cubo1C4J.setBackground(Blanco);
                } else if (Cubo1Cara4.equals("V")) {
                    Cubo1C4J.setBackground(Verde);
                } else if (Cubo1Cara4.equals("A")) {
                    Cubo1C4J.setBackground(Amarillo);
                }

                // CUBO 2
                // Cara Frontal y Trasera (NO ES RELEVANTE)
                if (!(soluciones.get(0).Cubo2aristaI + soluciones.get(0).Cubo2aristaF).equals(Cubo2arista1I + Cubo2arista1F)
                        && !(soluciones.get(1).Cubo2aristaI + soluciones.get(1).Cubo2aristaF).equals(Cubo2arista1I + Cubo2arista1F)) {
                    Cubo2C1J.setText(Cubo2arista1I);
                    Cubo2C2J.setText(Cubo2arista1F);
                } else if (!(soluciones.get(0).Cubo2aristaI + soluciones.get(0).Cubo2aristaF).equals(Cubo2arista2I + Cubo2arista2F)
                        && !(soluciones.get(1).Cubo2aristaI + soluciones.get(1).Cubo2aristaF).equals(Cubo2arista2I + Cubo2arista2F)) {
                    Cubo2C1J.setText(Cubo2arista2I);
                    Cubo2C2J.setText(Cubo2arista2F);
                } else if (!(soluciones.get(0).Cubo2aristaI + soluciones.get(0).Cubo2aristaF).equals(Cubo2arista3I + Cubo2arista3F)
                        && !(soluciones.get(1).Cubo2aristaI + soluciones.get(1).Cubo2aristaF).equals(Cubo2arista3I + Cubo2arista3F)) {
                    Cubo2C1J.setText(Cubo2arista3I);
                    Cubo2C2J.setText(Cubo2arista3F);
                }

                System.out.println("Cubo 2: " + Cubo2C1J.getText() + "-" + Cubo2C2J.getText());

                // Cara Frontal
                if (Cubo2C1J.getText().equals("R")) {
                    Cubo2C1J.setBackground(Rojo);
                } else if (Cubo2C1J.getText().equals("B")) {
                    Cubo2C1J.setBackground(Blanco);
                } else if (Cubo2C1J.getText().equals("V")) {
                    Cubo2C1J.setBackground(Verde);
                } else if (Cubo2C1J.getText().equals("A")) {
                    Cubo2C1J.setBackground(Amarillo);
                }
                // Cara Trasera
                if (Cubo2C2J.getText().equals("R")) {
                    Cubo2C2J.setBackground(Rojo);
                } else if (Cubo2C2J.getText().equals("B")) {
                    Cubo2C2J.setBackground(Blanco);
                } else if (Cubo2C2J.getText().equals("V")) {
                    Cubo2C2J.setBackground(Verde);
                } else if (Cubo2C2J.getText().equals("A")) {
                    Cubo2C2J.setBackground(Amarillo);
                }

                // Cara izquierda
                Cubo2C6J.setText(Cubo2Cara6);
                Cubo2C6E.setText(Cubo2Cara6);

                if (Cubo2Cara6.equals("R")) {
                    Cubo2C6J.setBackground(Rojo);
                } else if (Cubo2Cara6.equals("B")) {
                    Cubo2C6J.setBackground(Blanco);
                } else if (Cubo2Cara6.equals("V")) {
                    Cubo2C6J.setBackground(Verde);
                } else if (Cubo2Cara6.equals("A")) {
                    Cubo2C6J.setBackground(Amarillo);
                }

                // Cara derecha
                Cubo2C5J.setText(Cubo2Cara5);
                Cubo2C5E.setText(Cubo2Cara5);

                if (Cubo2Cara5.equals("R")) {
                    Cubo2C5J.setBackground(Rojo);
                } else if (Cubo2Cara5.equals("B")) {
                    Cubo2C5J.setBackground(Blanco);
                } else if (Cubo2Cara5.equals("V")) {
                    Cubo2C5J.setBackground(Verde);
                } else if (Cubo2Cara5.equals("A")) {
                    Cubo2C5J.setBackground(Amarillo);
                }

                // Cara superior
                Cubo2C3J.setText(Cubo2Cara3);
                Cubo2C3E.setText(Cubo2Cara3);

                if (Cubo2Cara3.equals("R")) {
                    Cubo2C3J.setBackground(Rojo);
                } else if (Cubo2Cara3.equals("B")) {
                    Cubo2C3J.setBackground(Blanco);
                } else if (Cubo2Cara3.equals("V")) {
                    Cubo2C3J.setBackground(Verde);
                } else if (Cubo2Cara3.equals("A")) {
                    Cubo2C3J.setBackground(Amarillo);
                }

                // Cara inferior
                Cubo2C4J.setText(Cubo2Cara4);
                Cubo2C4E.setText(Cubo2Cara4);

                if (Cubo2Cara4.equals("R")) {
                    Cubo2C4J.setBackground(Rojo);
                } else if (Cubo2Cara4.equals("B")) {
                    Cubo2C4J.setBackground(Blanco);
                } else if (Cubo2Cara4.equals("V")) {
                    Cubo2C4J.setBackground(Verde);
                } else if (Cubo2Cara4.equals("A")) {
                    Cubo2C4J.setBackground(Amarillo);
                }

                // CUBO 3
                // Cara Frontal y Trasera (NO ES RELEVANTE)
                if (!(soluciones.get(0).Cubo3aristaI + soluciones.get(0).Cubo3aristaF).equals(Cubo3arista1I + Cubo3arista1F)
                        && !(soluciones.get(1).Cubo3aristaI + soluciones.get(1).Cubo3aristaF).equals(Cubo3arista1I + Cubo3arista1F)) {
                    Cubo3C1J.setText(Cubo3arista1I);
                    Cubo3C2J.setText(Cubo3arista1F);
                } else if (!(soluciones.get(0).Cubo3aristaI + soluciones.get(0).Cubo3aristaF).equals(Cubo3arista2I + Cubo3arista2F)
                        && !(soluciones.get(1).Cubo3aristaI + soluciones.get(1).Cubo3aristaF).equals(Cubo3arista2I + Cubo3arista2F)) {
                    Cubo3C1J.setText(Cubo3arista2I);
                    Cubo3C2J.setText(Cubo3arista2F);
                } else if (!(soluciones.get(0).Cubo3aristaI + soluciones.get(0).Cubo3aristaF).equals(Cubo3arista3I + Cubo3arista3F)
                        && !(soluciones.get(1).Cubo3aristaI + soluciones.get(1).Cubo3aristaF).equals(Cubo3arista3I + Cubo3arista3F)) {
                    Cubo3C1J.setText(Cubo3arista3I);
                    Cubo3C2J.setText(Cubo3arista3F);
                }

                System.out.println("Cubo 3: " + Cubo3C1J.getText() + "-" + Cubo3C2J.getText());

                // Cara Frontal
                if (Cubo3C1J.getText().equals("R")) {
                    Cubo3C1J.setBackground(Rojo);
                } else if (Cubo3C1J.getText().equals("B")) {
                    Cubo3C1J.setBackground(Blanco);
                } else if (Cubo3C1J.getText().equals("V")) {
                    Cubo3C1J.setBackground(Verde);
                } else if (Cubo3C1J.getText().equals("A")) {
                    Cubo3C1J.setBackground(Amarillo);
                }
                // Cara Trasera
                if (Cubo3C2J.getText().equals("R")) {
                    Cubo3C2J.setBackground(Rojo);
                } else if (Cubo3C2J.getText().equals("B")) {
                    Cubo3C2J.setBackground(Blanco);
                } else if (Cubo3C2J.getText().equals("V")) {
                    Cubo3C2J.setBackground(Verde);
                } else if (Cubo3C2J.getText().equals("A")) {
                    Cubo3C2J.setBackground(Amarillo);
                }

                // Cara izquierda
                Cubo3C6J.setText(Cubo3Cara6);
                Cubo3C6E.setText(Cubo3Cara6);

                if (Cubo3Cara6.equals("R")) {
                    Cubo3C6J.setBackground(Rojo);
                } else if (Cubo3Cara6.equals("B")) {
                    Cubo3C6J.setBackground(Blanco);
                } else if (Cubo3Cara6.equals("V")) {
                    Cubo3C6J.setBackground(Verde);
                } else if (Cubo3Cara6.equals("A")) {
                    Cubo3C6J.setBackground(Amarillo);
                }

                // Cara derecha
                Cubo3C5J.setText(Cubo3Cara5);
                Cubo3C5E.setText(Cubo3Cara5);

                if (Cubo3Cara5.equals("R")) {
                    Cubo3C5J.setBackground(Rojo);
                } else if (Cubo3Cara5.equals("B")) {
                    Cubo3C5J.setBackground(Blanco);
                } else if (Cubo3Cara5.equals("V")) {
                    Cubo3C5J.setBackground(Verde);
                } else if (Cubo3Cara5.equals("A")) {
                    Cubo3C5J.setBackground(Amarillo);
                }

                // Cara superior
                Cubo3C3J.setText(Cubo3Cara3);
                Cubo3C3E.setText(Cubo3Cara3);

                if (Cubo3Cara3.equals("R")) {
                    Cubo3C3J.setBackground(Rojo);
                } else if (Cubo3Cara3.equals("B")) {
                    Cubo3C3J.setBackground(Blanco);
                } else if (Cubo3Cara3.equals("V")) {
                    Cubo3C3J.setBackground(Verde);
                } else if (Cubo3Cara3.equals("A")) {
                    Cubo3C3J.setBackground(Amarillo);
                }

                // Cara inferior
                Cubo3C4J.setText(Cubo3Cara4);
                Cubo3C4E.setText(Cubo3Cara4);

                if (Cubo3Cara4.equals("R")) {
                    Cubo3C4J.setBackground(Rojo);
                } else if (Cubo3Cara4.equals("B")) {
                    Cubo3C4J.setBackground(Blanco);
                } else if (Cubo3Cara4.equals("V")) {
                    Cubo3C4J.setBackground(Verde);
                } else if (Cubo3Cara4.equals("A")) {
                    Cubo3C4J.setBackground(Amarillo);
                }

                // CUBO 4
                // Cara Frontal y Trasera (NO ES RELEVANTE)
                if (!(soluciones.get(0).Cubo4aristaI + soluciones.get(0).Cubo4aristaF).equals(Cubo4arista1I + Cubo4arista1F)
                        && !(soluciones.get(1).Cubo4aristaI + soluciones.get(1).Cubo4aristaF).equals(Cubo4arista1I + Cubo4arista1F)) {
                    Cubo4C1J.setText(Cubo4arista1I);
                    Cubo4C2J.setText(Cubo4arista1F);
                } else if (!(soluciones.get(0).Cubo4aristaI + soluciones.get(0).Cubo4aristaF).equals(Cubo4arista2I + Cubo4arista2F)
                        && !(soluciones.get(1).Cubo4aristaI + soluciones.get(1).Cubo4aristaF).equals(Cubo4arista2I + Cubo4arista2F)) {
                    Cubo4C1J.setText(Cubo4arista2I);
                    Cubo4C2J.setText(Cubo4arista2F);
                } else if (!(soluciones.get(0).Cubo4aristaI + soluciones.get(0).Cubo4aristaF).equals(Cubo4arista3I + Cubo4arista3F)
                        && !(soluciones.get(1).Cubo4aristaI + soluciones.get(1).Cubo4aristaF).equals(Cubo4arista3I + Cubo4arista3F)) {
                    Cubo4C1J.setText(Cubo4arista3I);
                    Cubo4C2J.setText(Cubo4arista3F);
                }

                System.out.println("Cubo 4: " + Cubo4C1J.getText() + "-" + Cubo4C2J.getText());

                // Cara Frontal
                if (Cubo4C1J.getText().equals("R")) {
                    Cubo4C1J.setBackground(Rojo);
                } else if (Cubo4C1J.getText().equals("B")) {
                    Cubo4C1J.setBackground(Blanco);
                } else if (Cubo4C1J.getText().equals("V")) {
                    Cubo4C1J.setBackground(Verde);
                } else if (Cubo4C1J.getText().equals("A")) {
                    Cubo4C1J.setBackground(Amarillo);
                }
                // Cara Trasera
                if (Cubo4C2J.getText().equals("R")) {
                    Cubo4C2J.setBackground(Rojo);
                } else if (Cubo4C2J.getText().equals("B")) {
                    Cubo4C2J.setBackground(Blanco);
                } else if (Cubo4C2J.getText().equals("V")) {
                    Cubo4C2J.setBackground(Verde);
                } else if (Cubo4C2J.getText().equals("A")) {
                    Cubo4C2J.setBackground(Amarillo);
                }

                // Cara izquierda
                Cubo4C6J.setText(Cubo4Cara6);
                Cubo4C6E.setText(Cubo4Cara6);

                if (Cubo4Cara6.equals("R")) {
                    Cubo4C6J.setBackground(Rojo);
                } else if (Cubo4Cara6.equals("B")) {
                    Cubo4C6J.setBackground(Blanco);
                } else if (Cubo4Cara6.equals("V")) {
                    Cubo4C6J.setBackground(Verde);
                } else if (Cubo4Cara6.equals("A")) {
                    Cubo4C6J.setBackground(Amarillo);
                }

                // Cara derecha
                Cubo4C5J.setText(Cubo4Cara5);
                Cubo4C5E.setText(Cubo4Cara5);

                if (Cubo4Cara5.equals("R")) {
                    Cubo4C5J.setBackground(Rojo);
                } else if (Cubo4Cara5.equals("B")) {
                    Cubo4C5J.setBackground(Blanco);
                } else if (Cubo4Cara5.equals("V")) {
                    Cubo4C5J.setBackground(Verde);
                } else if (Cubo4Cara5.equals("A")) {
                    Cubo4C5J.setBackground(Amarillo);
                }

                // Cara superior
                Cubo4C3J.setText(Cubo4Cara3);
                Cubo4C3E.setText(Cubo4Cara3);

                if (Cubo4Cara3.equals("R")) {
                    Cubo4C3J.setBackground(Rojo);
                } else if (Cubo4Cara3.equals("B")) {
                    Cubo4C3J.setBackground(Blanco);
                } else if (Cubo4Cara3.equals("V")) {
                    Cubo4C3J.setBackground(Verde);
                } else if (Cubo4Cara3.equals("A")) {
                    Cubo4C3J.setBackground(Amarillo);
                }

                // Cara inferior
                Cubo4C4J.setText(Cubo4Cara4);
                Cubo4C4E.setText(Cubo4Cara4);

                if (Cubo4Cara4.equals("R")) {
                    Cubo4C4J.setBackground(Rojo);
                } else if (Cubo4Cara4.equals("B")) {
                    Cubo4C4J.setBackground(Blanco);
                } else if (Cubo4Cara4.equals("V")) {
                    Cubo4C4J.setBackground(Verde);
                } else if (Cubo4Cara4.equals("A")) {
                    Cubo4C4J.setBackground(Amarillo);
                }

            }
            resueltoLbl.setVisible(true);
            solucionPrev.setVisible(true);
            solucionPost.setVisible(true);
            noSoluciones.setVisible(true);
            noSoluciones.setText("1 / " + iPosibilidades);
            grafoGL();
            grafoG1();
            grafoG2();
        } else {
            resuelto = false;
            resueltoLbl.setVisible(false);
            JOptionPane.showMessageDialog(null, "NO EXISTE una solución,\n"
                    + "intenta otra combinación");
            jTabbedPane1.setSelectedIndex(0);
            sigBtnPressed = false;
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
            Object R = graphGL.insertVertex(parent, null, "R", 40, 40, 20, 20, "fontColor=#000000");
            Object B = graphGL.insertVertex(parent, null, "B", 150, 40, 20, 20, "fontColor=#000000");
            Object V = graphGL.insertVertex(parent, null, "V", 40, 160, 20, 20, "fontColor=#000000");
            Object A = graphGL.insertVertex(parent, null, "A", 150, 160, 20, 20, "fontColor=#000000");

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
            ;

        }

        mxGraphComponent graphComponentL = new mxGraphComponent(graphGL);
        graphComponentL.setEnabled(false);
        //graphComponentL.setPreferredSize(new Dimension(280, 225));
        graphComponentL.setBorder(null);

        grafoGL.removeAll();
        grafoGL.add(graphComponentL);
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

            Object R = graphG1.insertVertex(parent, null, "R", 30, 20, 20, 20, "fontColor=#000000");
            Object B = graphG1.insertVertex(parent, null, "B", 170, 20, 20, 20, "fontColor=#000000");
            Object V = graphG1.insertVertex(parent, null, "V", 30, 160, 20, 20, "fontColor=#000000");
            Object A = graphG1.insertVertex(parent, null, "A", 170, 160, 20, 20, "fontColor=#000000");

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
        graphComponent.setEnabled(false);
        graphComponent.setPreferredSize(new Dimension(230, 210));
        graphComponent.setBorder(null);

        grafoG1.removeAll();
        grafoG1.add(graphComponent);
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

            Object R = graphG2.insertVertex(parent, null, "R", 30, 20, 20, 20, "fontColor=#000000");
            Object B = graphG2.insertVertex(parent, null, "B", 170, 20, 20, 20, "fontColor=#000000");
            Object V = graphG2.insertVertex(parent, null, "V", 30, 160, 20, 20, "fontColor=#000000");
            Object A = graphG2.insertVertex(parent, null, "A", 170, 160, 20, 20, "fontColor=#000000");

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
        graphComponent.setEnabled(false);
        graphComponent.setPreferredSize(new Dimension(230, 210));
        graphComponent.setBorder(null);

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
        comprobar();

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
        comprobar();

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
        comprobar();
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
        comprobar();
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
        comprobar();
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
        comprobar();
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
        comprobar();
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
        comprobar();
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
        comprobar();
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
        comprobar();
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
        comprobar();
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
        comprobar();
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
        comprobar();
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
        comprobar();
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
        comprobar();
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
        comprobar();
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
        comprobar();
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
        comprobar();
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
        comprobar();
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
        comprobar();
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
        comprobar();

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
        comprobar();
    }//GEN-LAST:event_antihorarioCubo4ActionPerformed

    public void comprobar() {
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

            resueltoLbl.setVisible(true);
            resuelto = true;
            if (resolverBtnClicked == true) {
                solucionPrev.setVisible(true);
                solucionPost.setVisible(true);
                noSoluciones.setVisible(true);
            }

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

            fondo.repaint();
            if (JOptionPane.YES_OPTION == yes) {
                jTabbedPane1.setSelectedIndex(2);
                grafoGL();
                grafoG1();
                grafoG2();
                combinarSoluciones();
                existeSolucion.setText("SI existe una solución");
                fondo.repaint();
            }

        } else {
            resueltoLbl.setVisible(false);
            resuelto = false;
            solucionPrev.setVisible(false);
            solucionPost.setVisible(false);
            noSoluciones.setVisible(false);
            fondo.repaint();
        }
    }

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
        } else {
            JOptionPane.showMessageDialog(null, "Podrás ver la explicación cuando resuelvas\n"
                    + "el juego o presiones 'RESOLVER'\n"
                    + "(SOLO si existe una solución)");
        }
    }//GEN-LAST:event_explicacionBtnActionPerformed

    private void InterCubo1_Cubo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterCubo1_Cubo2ActionPerformed
        // TODO add your handling code here:
        if ((Cubo1C3T.getLocation().equals(posCubo1Abs) && Cubo2C3T.getLocation().equals(posCubo2Abs))) {
            Point posCubo2C3T = Cubo2C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo1C3T.getLocation().equals(posCubo2C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo1Lbl.setLocation(Cubo1Lbl.getLocation().x, Cubo1Lbl.getLocation().y -= 4);
                        Cubo2Lbl.setLocation(Cubo2Lbl.getLocation().x, Cubo2Lbl.getLocation().y += 4);

                        Cubo1C3T.setLocation(Cubo1C3T.getLocation().x, Cubo1C3T.getLocation().y -= 4);
                        Cubo2C3T.setLocation(Cubo2C3T.getLocation().x, Cubo2C3T.getLocation().y += 4);

                        Cubo1C5T.setLocation(Cubo1C5T.getLocation().x, Cubo1C5T.getLocation().y -= 4);
                        Cubo2C5T.setLocation(Cubo2C5T.getLocation().x, Cubo2C5T.getLocation().y += 4);

                        Cubo1C6T.setLocation(Cubo1C6T.getLocation().x, Cubo1C6T.getLocation().y -= 4);
                        Cubo2C6T.setLocation(Cubo2C6T.getLocation().x, Cubo2C6T.getLocation().y += 4);

                        Cubo1C4T.setLocation(Cubo1C4T.getLocation().x, Cubo1C4T.getLocation().y -= 4);
                        Cubo2C4T.setLocation(Cubo2C4T.getLocation().x, Cubo2C4T.getLocation().y += 4);
                    }
                    Cubo1Lbl.repaint();
                    Cubo2Lbl.repaint();

                    Cubo1C3T.repaint();
                    Cubo2C3T.repaint();

                    Cubo1C5T.repaint();
                    Cubo2C5T.repaint();

                    Cubo1C6T.repaint();
                    Cubo2C6T.repaint();

                    Cubo1C4T.repaint();
                    Cubo2C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }
        if ((Cubo2C3T.getLocation().equals(posCubo1Abs) && Cubo1C3T.getLocation().equals(posCubo2Abs))) {
            Point posCubo2C3T = Cubo2C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo1C3T.getLocation().equals(posCubo2C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo1Lbl.setLocation(Cubo1Lbl.getLocation().x, Cubo1Lbl.getLocation().y += 4);
                        Cubo2Lbl.setLocation(Cubo2Lbl.getLocation().x, Cubo2Lbl.getLocation().y -= 4);

                        Cubo1C3T.setLocation(Cubo1C3T.getLocation().x, Cubo1C3T.getLocation().y += 4);
                        Cubo2C3T.setLocation(Cubo2C3T.getLocation().x, Cubo2C3T.getLocation().y -= 4);

                        Cubo1C5T.setLocation(Cubo1C5T.getLocation().x, Cubo1C5T.getLocation().y += 4);
                        Cubo2C5T.setLocation(Cubo2C5T.getLocation().x, Cubo2C5T.getLocation().y -= 4);

                        Cubo1C6T.setLocation(Cubo1C6T.getLocation().x, Cubo1C6T.getLocation().y += 4);
                        Cubo2C6T.setLocation(Cubo2C6T.getLocation().x, Cubo2C6T.getLocation().y -= 4);

                        Cubo1C4T.setLocation(Cubo1C4T.getLocation().x, Cubo1C4T.getLocation().y += 4);
                        Cubo2C4T.setLocation(Cubo2C4T.getLocation().x, Cubo2C4T.getLocation().y -= 4);
                    }
                    Cubo1Lbl.repaint();
                    Cubo2Lbl.repaint();

                    Cubo1C3T.repaint();
                    Cubo2C3T.repaint();

                    Cubo1C5T.repaint();
                    Cubo2C5T.repaint();

                    Cubo1C6T.repaint();
                    Cubo2C6T.repaint();

                    Cubo1C4T.repaint();
                    Cubo2C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }

        if ((Cubo1C3T.getLocation().equals(posCubo1Abs) && Cubo3C3T.getLocation().equals(posCubo2Abs))) {
            Point posCubo3C3T = Cubo3C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo1C3T.getLocation().equals(posCubo3C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo1Lbl.setLocation(Cubo1Lbl.getLocation().x, Cubo1Lbl.getLocation().y -= 4);
                        Cubo3Lbl.setLocation(Cubo3Lbl.getLocation().x, Cubo3Lbl.getLocation().y += 4);

                        Cubo1C3T.setLocation(Cubo1C3T.getLocation().x, Cubo1C3T.getLocation().y -= 4);
                        Cubo3C3T.setLocation(Cubo3C3T.getLocation().x, Cubo3C3T.getLocation().y += 4);

                        Cubo1C5T.setLocation(Cubo1C5T.getLocation().x, Cubo1C5T.getLocation().y -= 4);
                        Cubo3C5T.setLocation(Cubo3C5T.getLocation().x, Cubo3C5T.getLocation().y += 4);

                        Cubo1C6T.setLocation(Cubo1C6T.getLocation().x, Cubo1C6T.getLocation().y -= 4);
                        Cubo3C6T.setLocation(Cubo3C6T.getLocation().x, Cubo3C6T.getLocation().y += 4);

                        Cubo1C4T.setLocation(Cubo1C4T.getLocation().x, Cubo1C4T.getLocation().y -= 4);
                        Cubo3C4T.setLocation(Cubo3C4T.getLocation().x, Cubo3C4T.getLocation().y += 4);
                    }
                    Cubo1Lbl.repaint();
                    Cubo3Lbl.repaint();

                    Cubo1C3T.repaint();
                    Cubo3C3T.repaint();

                    Cubo1C5T.repaint();
                    Cubo3C5T.repaint();

                    Cubo1C6T.repaint();
                    Cubo3C6T.repaint();

                    Cubo1C4T.repaint();
                    Cubo3C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }
        if ((Cubo3C3T.getLocation().equals(posCubo1Abs) && Cubo1C3T.getLocation().equals(posCubo2Abs))) {
            Point posCubo3C3T = Cubo3C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo1C3T.getLocation().equals(posCubo3C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo1Lbl.setLocation(Cubo1Lbl.getLocation().x, Cubo1Lbl.getLocation().y += 4);
                        Cubo3Lbl.setLocation(Cubo3Lbl.getLocation().x, Cubo3Lbl.getLocation().y -= 4);

                        Cubo1C3T.setLocation(Cubo1C3T.getLocation().x, Cubo1C3T.getLocation().y += 4);
                        Cubo3C3T.setLocation(Cubo3C3T.getLocation().x, Cubo3C3T.getLocation().y -= 4);

                        Cubo1C5T.setLocation(Cubo1C5T.getLocation().x, Cubo1C5T.getLocation().y += 4);
                        Cubo3C5T.setLocation(Cubo3C5T.getLocation().x, Cubo3C5T.getLocation().y -= 4);

                        Cubo1C6T.setLocation(Cubo1C6T.getLocation().x, Cubo1C6T.getLocation().y += 4);
                        Cubo3C6T.setLocation(Cubo3C6T.getLocation().x, Cubo3C6T.getLocation().y -= 4);

                        Cubo1C4T.setLocation(Cubo1C4T.getLocation().x, Cubo1C4T.getLocation().y += 4);
                        Cubo3C4T.setLocation(Cubo3C4T.getLocation().x, Cubo3C4T.getLocation().y -= 4);
                    }
                    Cubo1Lbl.repaint();
                    Cubo3Lbl.repaint();

                    Cubo1C3T.repaint();
                    Cubo3C3T.repaint();

                    Cubo1C5T.repaint();
                    Cubo3C5T.repaint();

                    Cubo1C6T.repaint();
                    Cubo3C6T.repaint();

                    Cubo1C4T.repaint();
                    Cubo3C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }

        if ((Cubo1C3T.getLocation().equals(posCubo1Abs) && Cubo4C3T.getLocation().equals(posCubo2Abs))) {
            Point posCubo4C3T = Cubo4C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo1C3T.getLocation().equals(posCubo4C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo1Lbl.setLocation(Cubo1Lbl.getLocation().x, Cubo1Lbl.getLocation().y -= 4);
                        Cubo4Lbl.setLocation(Cubo4Lbl.getLocation().x, Cubo4Lbl.getLocation().y += 4);

                        Cubo1C3T.setLocation(Cubo1C3T.getLocation().x, Cubo1C3T.getLocation().y -= 4);
                        Cubo4C3T.setLocation(Cubo4C3T.getLocation().x, Cubo4C3T.getLocation().y += 4);

                        Cubo1C5T.setLocation(Cubo1C5T.getLocation().x, Cubo1C5T.getLocation().y -= 4);
                        Cubo4C5T.setLocation(Cubo4C5T.getLocation().x, Cubo4C5T.getLocation().y += 4);

                        Cubo1C6T.setLocation(Cubo1C6T.getLocation().x, Cubo1C6T.getLocation().y -= 4);
                        Cubo4C6T.setLocation(Cubo4C6T.getLocation().x, Cubo4C6T.getLocation().y += 4);

                        Cubo1C4T.setLocation(Cubo1C4T.getLocation().x, Cubo1C4T.getLocation().y -= 4);
                        Cubo4C4T.setLocation(Cubo4C4T.getLocation().x, Cubo4C4T.getLocation().y += 4);
                    }
                    Cubo1Lbl.repaint();
                    Cubo4Lbl.repaint();

                    Cubo1C3T.repaint();
                    Cubo4C3T.repaint();

                    Cubo1C5T.repaint();
                    Cubo4C5T.repaint();

                    Cubo1C6T.repaint();
                    Cubo4C6T.repaint();

                    Cubo1C4T.repaint();
                    Cubo4C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }
        if ((Cubo4C3T.getLocation().equals(posCubo1Abs) && Cubo1C3T.getLocation().equals(posCubo2Abs))) {
            Point posCubo4C3T = Cubo4C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo1C3T.getLocation().equals(posCubo4C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo1Lbl.setLocation(Cubo1Lbl.getLocation().x, Cubo1Lbl.getLocation().y += 4);
                        Cubo4Lbl.setLocation(Cubo4Lbl.getLocation().x, Cubo4Lbl.getLocation().y -= 4);

                        Cubo1C3T.setLocation(Cubo1C3T.getLocation().x, Cubo1C3T.getLocation().y += 4);
                        Cubo4C3T.setLocation(Cubo4C3T.getLocation().x, Cubo4C3T.getLocation().y -= 4);

                        Cubo1C5T.setLocation(Cubo1C5T.getLocation().x, Cubo1C5T.getLocation().y += 4);
                        Cubo4C5T.setLocation(Cubo4C5T.getLocation().x, Cubo4C5T.getLocation().y -= 4);

                        Cubo1C6T.setLocation(Cubo1C6T.getLocation().x, Cubo1C6T.getLocation().y += 4);
                        Cubo4C6T.setLocation(Cubo4C6T.getLocation().x, Cubo4C6T.getLocation().y -= 4);

                        Cubo1C4T.setLocation(Cubo1C4T.getLocation().x, Cubo1C4T.getLocation().y += 4);
                        Cubo4C4T.setLocation(Cubo4C4T.getLocation().x, Cubo4C4T.getLocation().y -= 4);
                    }
                    Cubo1Lbl.repaint();
                    Cubo4Lbl.repaint();

                    Cubo1C3T.repaint();
                    Cubo4C3T.repaint();

                    Cubo1C5T.repaint();
                    Cubo4C5T.repaint();

                    Cubo1C6T.repaint();
                    Cubo4C6T.repaint();

                    Cubo1C4T.repaint();
                    Cubo4C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }

        if ((Cubo2C3T.getLocation().equals(posCubo1Abs) && Cubo3C3T.getLocation().equals(posCubo2Abs))) {
            Point posCubo3C3T = Cubo3C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo2C3T.getLocation().equals(posCubo3C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo2Lbl.setLocation(Cubo2Lbl.getLocation().x, Cubo2Lbl.getLocation().y -= 4);
                        Cubo3Lbl.setLocation(Cubo3Lbl.getLocation().x, Cubo3Lbl.getLocation().y += 4);

                        Cubo2C3T.setLocation(Cubo2C3T.getLocation().x, Cubo2C3T.getLocation().y -= 4);
                        Cubo3C3T.setLocation(Cubo3C3T.getLocation().x, Cubo3C3T.getLocation().y += 4);

                        Cubo2C5T.setLocation(Cubo2C5T.getLocation().x, Cubo2C5T.getLocation().y -= 4);
                        Cubo3C5T.setLocation(Cubo3C5T.getLocation().x, Cubo3C5T.getLocation().y += 4);

                        Cubo2C6T.setLocation(Cubo2C6T.getLocation().x, Cubo2C6T.getLocation().y -= 4);
                        Cubo3C6T.setLocation(Cubo3C6T.getLocation().x, Cubo3C6T.getLocation().y += 4);

                        Cubo2C4T.setLocation(Cubo2C4T.getLocation().x, Cubo2C4T.getLocation().y -= 4);
                        Cubo3C4T.setLocation(Cubo3C4T.getLocation().x, Cubo3C4T.getLocation().y += 4);
                    }
                    Cubo2Lbl.repaint();
                    Cubo3Lbl.repaint();

                    Cubo2C3T.repaint();
                    Cubo3C3T.repaint();

                    Cubo2C5T.repaint();
                    Cubo3C5T.repaint();

                    Cubo2C6T.repaint();
                    Cubo3C6T.repaint();

                    Cubo2C4T.repaint();
                    Cubo3C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }
        if ((Cubo3C3T.getLocation().equals(posCubo1Abs) && Cubo2C3T.getLocation().equals(posCubo2Abs))) {
            Point posCubo3C3T = Cubo3C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo2C3T.getLocation().equals(posCubo3C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo2Lbl.setLocation(Cubo2Lbl.getLocation().x, Cubo2Lbl.getLocation().y += 4);
                        Cubo3Lbl.setLocation(Cubo3Lbl.getLocation().x, Cubo3Lbl.getLocation().y -= 4);

                        Cubo2C3T.setLocation(Cubo2C3T.getLocation().x, Cubo2C3T.getLocation().y += 4);
                        Cubo3C3T.setLocation(Cubo3C3T.getLocation().x, Cubo3C3T.getLocation().y -= 4);

                        Cubo2C5T.setLocation(Cubo2C5T.getLocation().x, Cubo2C5T.getLocation().y += 4);
                        Cubo3C5T.setLocation(Cubo3C5T.getLocation().x, Cubo3C5T.getLocation().y -= 4);

                        Cubo2C6T.setLocation(Cubo2C6T.getLocation().x, Cubo2C6T.getLocation().y += 4);
                        Cubo3C6T.setLocation(Cubo3C6T.getLocation().x, Cubo3C6T.getLocation().y -= 4);

                        Cubo2C4T.setLocation(Cubo2C4T.getLocation().x, Cubo2C4T.getLocation().y += 4);
                        Cubo3C4T.setLocation(Cubo3C4T.getLocation().x, Cubo3C4T.getLocation().y -= 4);
                    }
                    Cubo2Lbl.repaint();
                    Cubo3Lbl.repaint();

                    Cubo2C3T.repaint();
                    Cubo3C3T.repaint();

                    Cubo2C5T.repaint();
                    Cubo3C5T.repaint();

                    Cubo2C6T.repaint();
                    Cubo3C6T.repaint();

                    Cubo2C4T.repaint();
                    Cubo3C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }

        if ((Cubo2C3T.getLocation().equals(posCubo1Abs) && Cubo4C3T.getLocation().equals(posCubo2Abs))) {
            Point posCubo4C3T = Cubo4C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo2C3T.getLocation().equals(posCubo4C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo2Lbl.setLocation(Cubo2Lbl.getLocation().x, Cubo2Lbl.getLocation().y -= 4);
                        Cubo4Lbl.setLocation(Cubo4Lbl.getLocation().x, Cubo4Lbl.getLocation().y += 4);

                        Cubo2C3T.setLocation(Cubo2C3T.getLocation().x, Cubo2C3T.getLocation().y -= 4);
                        Cubo4C3T.setLocation(Cubo4C3T.getLocation().x, Cubo4C3T.getLocation().y += 4);

                        Cubo2C5T.setLocation(Cubo2C5T.getLocation().x, Cubo2C5T.getLocation().y -= 4);
                        Cubo4C5T.setLocation(Cubo4C5T.getLocation().x, Cubo4C5T.getLocation().y += 4);

                        Cubo2C6T.setLocation(Cubo2C6T.getLocation().x, Cubo2C6T.getLocation().y -= 4);
                        Cubo4C6T.setLocation(Cubo4C6T.getLocation().x, Cubo4C6T.getLocation().y += 4);

                        Cubo2C4T.setLocation(Cubo2C4T.getLocation().x, Cubo2C4T.getLocation().y -= 4);
                        Cubo4C4T.setLocation(Cubo4C4T.getLocation().x, Cubo4C4T.getLocation().y += 4);
                    }
                    Cubo2Lbl.repaint();
                    Cubo4Lbl.repaint();

                    Cubo2C3T.repaint();
                    Cubo4C3T.repaint();

                    Cubo2C5T.repaint();
                    Cubo4C5T.repaint();

                    Cubo2C6T.repaint();
                    Cubo4C6T.repaint();

                    Cubo2C4T.repaint();
                    Cubo4C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }
        if ((Cubo4C3T.getLocation().equals(posCubo1Abs) && Cubo2C3T.getLocation().equals(posCubo2Abs))) {
            Point posCubo4C3T = Cubo4C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo2C3T.getLocation().equals(posCubo4C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo2Lbl.setLocation(Cubo2Lbl.getLocation().x, Cubo2Lbl.getLocation().y += 4);
                        Cubo4Lbl.setLocation(Cubo4Lbl.getLocation().x, Cubo4Lbl.getLocation().y -= 4);

                        Cubo2C3T.setLocation(Cubo2C3T.getLocation().x, Cubo2C3T.getLocation().y += 4);
                        Cubo4C3T.setLocation(Cubo4C3T.getLocation().x, Cubo4C3T.getLocation().y -= 4);

                        Cubo2C5T.setLocation(Cubo2C5T.getLocation().x, Cubo2C5T.getLocation().y += 4);
                        Cubo4C5T.setLocation(Cubo4C5T.getLocation().x, Cubo4C5T.getLocation().y -= 4);

                        Cubo2C6T.setLocation(Cubo2C6T.getLocation().x, Cubo2C6T.getLocation().y += 4);
                        Cubo4C6T.setLocation(Cubo4C6T.getLocation().x, Cubo4C6T.getLocation().y -= 4);

                        Cubo2C4T.setLocation(Cubo2C4T.getLocation().x, Cubo2C4T.getLocation().y += 4);
                        Cubo4C4T.setLocation(Cubo4C4T.getLocation().x, Cubo4C4T.getLocation().y -= 4);
                    }
                    Cubo2Lbl.repaint();
                    Cubo4Lbl.repaint();

                    Cubo2C3T.repaint();
                    Cubo4C3T.repaint();

                    Cubo2C5T.repaint();
                    Cubo4C5T.repaint();

                    Cubo2C6T.repaint();
                    Cubo4C6T.repaint();

                    Cubo2C4T.repaint();
                    Cubo4C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }

        if ((Cubo3C3T.getLocation().equals(posCubo1Abs) && Cubo4C3T.getLocation().equals(posCubo2Abs))) {
            Point posCubo4C3T = Cubo4C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo3C3T.getLocation().equals(posCubo4C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo3Lbl.setLocation(Cubo3Lbl.getLocation().x, Cubo3Lbl.getLocation().y -= 4);
                        Cubo4Lbl.setLocation(Cubo4Lbl.getLocation().x, Cubo4Lbl.getLocation().y += 4);

                        Cubo3C3T.setLocation(Cubo3C3T.getLocation().x, Cubo3C3T.getLocation().y -= 4);
                        Cubo4C3T.setLocation(Cubo4C3T.getLocation().x, Cubo4C3T.getLocation().y += 4);

                        Cubo3C5T.setLocation(Cubo3C5T.getLocation().x, Cubo3C5T.getLocation().y -= 4);
                        Cubo4C5T.setLocation(Cubo4C5T.getLocation().x, Cubo4C5T.getLocation().y += 4);

                        Cubo3C6T.setLocation(Cubo3C6T.getLocation().x, Cubo3C6T.getLocation().y -= 4);
                        Cubo4C6T.setLocation(Cubo4C6T.getLocation().x, Cubo4C6T.getLocation().y += 4);

                        Cubo3C4T.setLocation(Cubo3C4T.getLocation().x, Cubo3C4T.getLocation().y -= 4);
                        Cubo4C4T.setLocation(Cubo4C4T.getLocation().x, Cubo4C4T.getLocation().y += 4);
                    }
                    Cubo3Lbl.repaint();
                    Cubo4Lbl.repaint();

                    Cubo3C3T.repaint();
                    Cubo4C3T.repaint();

                    Cubo3C5T.repaint();
                    Cubo4C5T.repaint();

                    Cubo3C6T.repaint();
                    Cubo4C6T.repaint();

                    Cubo3C4T.repaint();
                    Cubo4C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }
        if ((Cubo4C3T.getLocation().equals(posCubo1Abs) && Cubo3C3T.getLocation().equals(posCubo2Abs))) {
            Point posCubo4C3T = Cubo4C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo3C3T.getLocation().equals(posCubo4C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo3Lbl.setLocation(Cubo3Lbl.getLocation().x, Cubo3Lbl.getLocation().y += 4);
                        Cubo4Lbl.setLocation(Cubo4Lbl.getLocation().x, Cubo4Lbl.getLocation().y -= 4);

                        Cubo3C3T.setLocation(Cubo3C3T.getLocation().x, Cubo3C3T.getLocation().y += 4);
                        Cubo4C3T.setLocation(Cubo4C3T.getLocation().x, Cubo4C3T.getLocation().y -= 4);

                        Cubo3C5T.setLocation(Cubo3C5T.getLocation().x, Cubo3C5T.getLocation().y += 4);
                        Cubo4C5T.setLocation(Cubo4C5T.getLocation().x, Cubo4C5T.getLocation().y -= 4);

                        Cubo3C6T.setLocation(Cubo3C6T.getLocation().x, Cubo3C6T.getLocation().y += 4);
                        Cubo4C6T.setLocation(Cubo4C6T.getLocation().x, Cubo4C6T.getLocation().y -= 4);

                        Cubo3C4T.setLocation(Cubo3C4T.getLocation().x, Cubo3C4T.getLocation().y += 4);
                        Cubo4C4T.setLocation(Cubo4C4T.getLocation().x, Cubo4C4T.getLocation().y -= 4);
                    }
                    Cubo3Lbl.repaint();
                    Cubo4Lbl.repaint();

                    Cubo3C3T.repaint();
                    Cubo4C3T.repaint();

                    Cubo3C5T.repaint();
                    Cubo4C5T.repaint();

                    Cubo3C6T.repaint();
                    Cubo4C6T.repaint();

                    Cubo3C4T.repaint();
                    Cubo4C4T.repaint();

                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();

        }

    }//GEN-LAST:event_InterCubo1_Cubo2ActionPerformed

    private void InterCubo2_Cubo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterCubo2_Cubo3ActionPerformed
        // TODO add your handling code here:
        if ((Cubo1C3T.getLocation().equals(posCubo2Abs) && Cubo2C3T.getLocation().equals(posCubo3Abs))) {
            Point posCubo2C3T = Cubo2C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo1C3T.getLocation().equals(posCubo2C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo1Lbl.setLocation(Cubo1Lbl.getLocation().x, Cubo1Lbl.getLocation().y -= 4);
                        Cubo2Lbl.setLocation(Cubo2Lbl.getLocation().x, Cubo2Lbl.getLocation().y += 4);

                        Cubo1C3T.setLocation(Cubo1C3T.getLocation().x, Cubo1C3T.getLocation().y -= 4);
                        Cubo2C3T.setLocation(Cubo2C3T.getLocation().x, Cubo2C3T.getLocation().y += 4);

                        Cubo1C5T.setLocation(Cubo1C5T.getLocation().x, Cubo1C5T.getLocation().y -= 4);
                        Cubo2C5T.setLocation(Cubo2C5T.getLocation().x, Cubo2C5T.getLocation().y += 4);

                        Cubo1C6T.setLocation(Cubo1C6T.getLocation().x, Cubo1C6T.getLocation().y -= 4);
                        Cubo2C6T.setLocation(Cubo2C6T.getLocation().x, Cubo2C6T.getLocation().y += 4);

                        Cubo1C4T.setLocation(Cubo1C4T.getLocation().x, Cubo1C4T.getLocation().y -= 4);
                        Cubo2C4T.setLocation(Cubo2C4T.getLocation().x, Cubo2C4T.getLocation().y += 4);
                    }
                    Cubo1Lbl.repaint();
                    Cubo2Lbl.repaint();

                    Cubo1C3T.repaint();
                    Cubo2C3T.repaint();

                    Cubo1C5T.repaint();
                    Cubo2C5T.repaint();

                    Cubo1C6T.repaint();
                    Cubo2C6T.repaint();

                    Cubo1C4T.repaint();
                    Cubo2C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }
        if ((Cubo2C3T.getLocation().equals(posCubo2Abs) && Cubo1C3T.getLocation().equals(posCubo3Abs))) {
            Point posCubo2C3T = Cubo2C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo1C3T.getLocation().equals(posCubo2C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo1Lbl.setLocation(Cubo1Lbl.getLocation().x, Cubo1Lbl.getLocation().y += 4);
                        Cubo2Lbl.setLocation(Cubo2Lbl.getLocation().x, Cubo2Lbl.getLocation().y -= 4);

                        Cubo1C3T.setLocation(Cubo1C3T.getLocation().x, Cubo1C3T.getLocation().y += 4);
                        Cubo2C3T.setLocation(Cubo2C3T.getLocation().x, Cubo2C3T.getLocation().y -= 4);

                        Cubo1C5T.setLocation(Cubo1C5T.getLocation().x, Cubo1C5T.getLocation().y += 4);
                        Cubo2C5T.setLocation(Cubo2C5T.getLocation().x, Cubo2C5T.getLocation().y -= 4);

                        Cubo1C6T.setLocation(Cubo1C6T.getLocation().x, Cubo1C6T.getLocation().y += 4);
                        Cubo2C6T.setLocation(Cubo2C6T.getLocation().x, Cubo2C6T.getLocation().y -= 4);

                        Cubo1C4T.setLocation(Cubo1C4T.getLocation().x, Cubo1C4T.getLocation().y += 4);
                        Cubo2C4T.setLocation(Cubo2C4T.getLocation().x, Cubo2C4T.getLocation().y -= 4);
                    }
                    Cubo1Lbl.repaint();
                    Cubo2Lbl.repaint();

                    Cubo1C3T.repaint();
                    Cubo2C3T.repaint();

                    Cubo1C5T.repaint();
                    Cubo2C5T.repaint();

                    Cubo1C6T.repaint();
                    Cubo2C6T.repaint();

                    Cubo1C4T.repaint();
                    Cubo2C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }

        if ((Cubo1C3T.getLocation().equals(posCubo2Abs) && Cubo3C3T.getLocation().equals(posCubo3Abs))) {
            Point posCubo3C3T = Cubo3C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo1C3T.getLocation().equals(posCubo3C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo1Lbl.setLocation(Cubo1Lbl.getLocation().x, Cubo1Lbl.getLocation().y -= 4);
                        Cubo3Lbl.setLocation(Cubo3Lbl.getLocation().x, Cubo3Lbl.getLocation().y += 4);

                        Cubo1C3T.setLocation(Cubo1C3T.getLocation().x, Cubo1C3T.getLocation().y -= 4);
                        Cubo3C3T.setLocation(Cubo3C3T.getLocation().x, Cubo3C3T.getLocation().y += 4);

                        Cubo1C5T.setLocation(Cubo1C5T.getLocation().x, Cubo1C5T.getLocation().y -= 4);
                        Cubo3C5T.setLocation(Cubo3C5T.getLocation().x, Cubo3C5T.getLocation().y += 4);

                        Cubo1C6T.setLocation(Cubo1C6T.getLocation().x, Cubo1C6T.getLocation().y -= 4);
                        Cubo3C6T.setLocation(Cubo3C6T.getLocation().x, Cubo3C6T.getLocation().y += 4);

                        Cubo1C4T.setLocation(Cubo1C4T.getLocation().x, Cubo1C4T.getLocation().y -= 4);
                        Cubo3C4T.setLocation(Cubo3C4T.getLocation().x, Cubo3C4T.getLocation().y += 4);
                    }
                    Cubo1Lbl.repaint();
                    Cubo3Lbl.repaint();

                    Cubo1C3T.repaint();
                    Cubo3C3T.repaint();

                    Cubo1C5T.repaint();
                    Cubo3C5T.repaint();

                    Cubo1C6T.repaint();
                    Cubo3C6T.repaint();

                    Cubo1C4T.repaint();
                    Cubo3C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }
        if ((Cubo3C3T.getLocation().equals(posCubo2Abs) && Cubo1C3T.getLocation().equals(posCubo3Abs))) {
            Point posCubo3C3T = Cubo3C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo1C3T.getLocation().equals(posCubo3C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo1Lbl.setLocation(Cubo1Lbl.getLocation().x, Cubo1Lbl.getLocation().y += 4);
                        Cubo3Lbl.setLocation(Cubo3Lbl.getLocation().x, Cubo3Lbl.getLocation().y -= 4);

                        Cubo1C3T.setLocation(Cubo1C3T.getLocation().x, Cubo1C3T.getLocation().y += 4);
                        Cubo3C3T.setLocation(Cubo3C3T.getLocation().x, Cubo3C3T.getLocation().y -= 4);

                        Cubo1C5T.setLocation(Cubo1C5T.getLocation().x, Cubo1C5T.getLocation().y += 4);
                        Cubo3C5T.setLocation(Cubo3C5T.getLocation().x, Cubo3C5T.getLocation().y -= 4);

                        Cubo1C6T.setLocation(Cubo1C6T.getLocation().x, Cubo1C6T.getLocation().y += 4);
                        Cubo3C6T.setLocation(Cubo3C6T.getLocation().x, Cubo3C6T.getLocation().y -= 4);

                        Cubo1C4T.setLocation(Cubo1C4T.getLocation().x, Cubo1C4T.getLocation().y += 4);
                        Cubo3C4T.setLocation(Cubo3C4T.getLocation().x, Cubo3C4T.getLocation().y -= 4);
                    }
                    Cubo1Lbl.repaint();
                    Cubo3Lbl.repaint();

                    Cubo1C3T.repaint();
                    Cubo3C3T.repaint();

                    Cubo1C5T.repaint();
                    Cubo3C5T.repaint();

                    Cubo1C6T.repaint();
                    Cubo3C6T.repaint();

                    Cubo1C4T.repaint();
                    Cubo3C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }

        if ((Cubo1C3T.getLocation().equals(posCubo2Abs) && Cubo4C3T.getLocation().equals(posCubo3Abs))) {
            Point posCubo4C3T = Cubo4C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo1C3T.getLocation().equals(posCubo4C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo1Lbl.setLocation(Cubo1Lbl.getLocation().x, Cubo1Lbl.getLocation().y -= 4);
                        Cubo4Lbl.setLocation(Cubo4Lbl.getLocation().x, Cubo4Lbl.getLocation().y += 4);

                        Cubo1C3T.setLocation(Cubo1C3T.getLocation().x, Cubo1C3T.getLocation().y -= 4);
                        Cubo4C3T.setLocation(Cubo4C3T.getLocation().x, Cubo4C3T.getLocation().y += 4);

                        Cubo1C5T.setLocation(Cubo1C5T.getLocation().x, Cubo1C5T.getLocation().y -= 4);
                        Cubo4C5T.setLocation(Cubo4C5T.getLocation().x, Cubo4C5T.getLocation().y += 4);

                        Cubo1C6T.setLocation(Cubo1C6T.getLocation().x, Cubo1C6T.getLocation().y -= 4);
                        Cubo4C6T.setLocation(Cubo4C6T.getLocation().x, Cubo4C6T.getLocation().y += 4);

                        Cubo1C4T.setLocation(Cubo1C4T.getLocation().x, Cubo1C4T.getLocation().y -= 4);
                        Cubo4C4T.setLocation(Cubo4C4T.getLocation().x, Cubo4C4T.getLocation().y += 4);
                    }
                    Cubo1Lbl.repaint();
                    Cubo4Lbl.repaint();

                    Cubo1C3T.repaint();
                    Cubo4C3T.repaint();

                    Cubo1C5T.repaint();
                    Cubo4C5T.repaint();

                    Cubo1C6T.repaint();
                    Cubo4C6T.repaint();

                    Cubo1C4T.repaint();
                    Cubo4C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }
        if ((Cubo4C3T.getLocation().equals(posCubo2Abs) && Cubo1C3T.getLocation().equals(posCubo3Abs))) {
            Point posCubo4C3T = Cubo4C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo1C3T.getLocation().equals(posCubo4C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo1Lbl.setLocation(Cubo1Lbl.getLocation().x, Cubo1Lbl.getLocation().y += 4);
                        Cubo4Lbl.setLocation(Cubo4Lbl.getLocation().x, Cubo4Lbl.getLocation().y -= 4);

                        Cubo1C3T.setLocation(Cubo1C3T.getLocation().x, Cubo1C3T.getLocation().y += 4);
                        Cubo4C3T.setLocation(Cubo4C3T.getLocation().x, Cubo4C3T.getLocation().y -= 4);

                        Cubo1C5T.setLocation(Cubo1C5T.getLocation().x, Cubo1C5T.getLocation().y += 4);
                        Cubo4C5T.setLocation(Cubo4C5T.getLocation().x, Cubo4C5T.getLocation().y -= 4);

                        Cubo1C6T.setLocation(Cubo1C6T.getLocation().x, Cubo1C6T.getLocation().y += 4);
                        Cubo4C6T.setLocation(Cubo4C6T.getLocation().x, Cubo4C6T.getLocation().y -= 4);

                        Cubo1C4T.setLocation(Cubo1C4T.getLocation().x, Cubo1C4T.getLocation().y += 4);
                        Cubo4C4T.setLocation(Cubo4C4T.getLocation().x, Cubo4C4T.getLocation().y -= 4);
                    }
                    Cubo1Lbl.repaint();
                    Cubo4Lbl.repaint();

                    Cubo1C3T.repaint();
                    Cubo4C3T.repaint();

                    Cubo1C5T.repaint();
                    Cubo4C5T.repaint();

                    Cubo1C6T.repaint();
                    Cubo4C6T.repaint();

                    Cubo1C4T.repaint();
                    Cubo4C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }

        if ((Cubo2C3T.getLocation().equals(posCubo2Abs) && Cubo3C3T.getLocation().equals(posCubo3Abs))) {
            Point posCubo3C3T = Cubo3C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo2C3T.getLocation().equals(posCubo3C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo2Lbl.setLocation(Cubo2Lbl.getLocation().x, Cubo2Lbl.getLocation().y -= 4);
                        Cubo3Lbl.setLocation(Cubo3Lbl.getLocation().x, Cubo3Lbl.getLocation().y += 4);

                        Cubo2C3T.setLocation(Cubo2C3T.getLocation().x, Cubo2C3T.getLocation().y -= 4);
                        Cubo3C3T.setLocation(Cubo3C3T.getLocation().x, Cubo3C3T.getLocation().y += 4);

                        Cubo2C5T.setLocation(Cubo2C5T.getLocation().x, Cubo2C5T.getLocation().y -= 4);
                        Cubo3C5T.setLocation(Cubo3C5T.getLocation().x, Cubo3C5T.getLocation().y += 4);

                        Cubo2C6T.setLocation(Cubo2C6T.getLocation().x, Cubo2C6T.getLocation().y -= 4);
                        Cubo3C6T.setLocation(Cubo3C6T.getLocation().x, Cubo3C6T.getLocation().y += 4);

                        Cubo2C4T.setLocation(Cubo2C4T.getLocation().x, Cubo2C4T.getLocation().y -= 4);
                        Cubo3C4T.setLocation(Cubo3C4T.getLocation().x, Cubo3C4T.getLocation().y += 4);
                    }
                    Cubo2Lbl.repaint();
                    Cubo3Lbl.repaint();

                    Cubo2C3T.repaint();
                    Cubo3C3T.repaint();

                    Cubo2C5T.repaint();
                    Cubo3C5T.repaint();

                    Cubo2C6T.repaint();
                    Cubo3C6T.repaint();

                    Cubo2C4T.repaint();
                    Cubo3C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }
        if ((Cubo3C3T.getLocation().equals(posCubo2Abs) && Cubo2C3T.getLocation().equals(posCubo3Abs))) {
            Point posCubo3C3T = Cubo3C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo2C3T.getLocation().equals(posCubo3C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo2Lbl.setLocation(Cubo2Lbl.getLocation().x, Cubo2Lbl.getLocation().y += 4);
                        Cubo3Lbl.setLocation(Cubo3Lbl.getLocation().x, Cubo3Lbl.getLocation().y -= 4);

                        Cubo2C3T.setLocation(Cubo2C3T.getLocation().x, Cubo2C3T.getLocation().y += 4);
                        Cubo3C3T.setLocation(Cubo3C3T.getLocation().x, Cubo3C3T.getLocation().y -= 4);

                        Cubo2C5T.setLocation(Cubo2C5T.getLocation().x, Cubo2C5T.getLocation().y += 4);
                        Cubo3C5T.setLocation(Cubo3C5T.getLocation().x, Cubo3C5T.getLocation().y -= 4);

                        Cubo2C6T.setLocation(Cubo2C6T.getLocation().x, Cubo2C6T.getLocation().y += 4);
                        Cubo3C6T.setLocation(Cubo3C6T.getLocation().x, Cubo3C6T.getLocation().y -= 4);

                        Cubo2C4T.setLocation(Cubo2C4T.getLocation().x, Cubo2C4T.getLocation().y += 4);
                        Cubo3C4T.setLocation(Cubo3C4T.getLocation().x, Cubo3C4T.getLocation().y -= 4);
                    }
                    Cubo2Lbl.repaint();
                    Cubo3Lbl.repaint();

                    Cubo2C3T.repaint();
                    Cubo3C3T.repaint();

                    Cubo2C5T.repaint();
                    Cubo3C5T.repaint();

                    Cubo2C6T.repaint();
                    Cubo3C6T.repaint();

                    Cubo2C4T.repaint();
                    Cubo3C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }

        if ((Cubo2C3T.getLocation().equals(posCubo2Abs) && Cubo4C3T.getLocation().equals(posCubo3Abs))) {
            Point posCubo4C3T = Cubo4C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo2C3T.getLocation().equals(posCubo4C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo2Lbl.setLocation(Cubo2Lbl.getLocation().x, Cubo2Lbl.getLocation().y -= 4);
                        Cubo4Lbl.setLocation(Cubo4Lbl.getLocation().x, Cubo4Lbl.getLocation().y += 4);

                        Cubo2C3T.setLocation(Cubo2C3T.getLocation().x, Cubo2C3T.getLocation().y -= 4);
                        Cubo4C3T.setLocation(Cubo4C3T.getLocation().x, Cubo4C3T.getLocation().y += 4);

                        Cubo2C5T.setLocation(Cubo2C5T.getLocation().x, Cubo2C5T.getLocation().y -= 4);
                        Cubo4C5T.setLocation(Cubo4C5T.getLocation().x, Cubo4C5T.getLocation().y += 4);

                        Cubo2C6T.setLocation(Cubo2C6T.getLocation().x, Cubo2C6T.getLocation().y -= 4);
                        Cubo4C6T.setLocation(Cubo4C6T.getLocation().x, Cubo4C6T.getLocation().y += 4);

                        Cubo2C4T.setLocation(Cubo2C4T.getLocation().x, Cubo2C4T.getLocation().y -= 4);
                        Cubo4C4T.setLocation(Cubo4C4T.getLocation().x, Cubo4C4T.getLocation().y += 4);
                    }
                    Cubo2Lbl.repaint();
                    Cubo4Lbl.repaint();

                    Cubo2C3T.repaint();
                    Cubo4C3T.repaint();

                    Cubo2C5T.repaint();
                    Cubo4C5T.repaint();

                    Cubo2C6T.repaint();
                    Cubo4C6T.repaint();

                    Cubo2C4T.repaint();
                    Cubo4C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }
        if ((Cubo4C3T.getLocation().equals(posCubo2Abs) && Cubo2C3T.getLocation().equals(posCubo3Abs))) {
            Point posCubo4C3T = Cubo4C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo2C3T.getLocation().equals(posCubo4C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo2Lbl.setLocation(Cubo2Lbl.getLocation().x, Cubo2Lbl.getLocation().y += 4);
                        Cubo4Lbl.setLocation(Cubo4Lbl.getLocation().x, Cubo4Lbl.getLocation().y -= 4);

                        Cubo2C3T.setLocation(Cubo2C3T.getLocation().x, Cubo2C3T.getLocation().y += 4);
                        Cubo4C3T.setLocation(Cubo4C3T.getLocation().x, Cubo4C3T.getLocation().y -= 4);

                        Cubo2C5T.setLocation(Cubo2C5T.getLocation().x, Cubo2C5T.getLocation().y += 4);
                        Cubo4C5T.setLocation(Cubo4C5T.getLocation().x, Cubo4C5T.getLocation().y -= 4);

                        Cubo2C6T.setLocation(Cubo2C6T.getLocation().x, Cubo2C6T.getLocation().y += 4);
                        Cubo4C6T.setLocation(Cubo4C6T.getLocation().x, Cubo4C6T.getLocation().y -= 4);

                        Cubo2C4T.setLocation(Cubo2C4T.getLocation().x, Cubo2C4T.getLocation().y += 4);
                        Cubo4C4T.setLocation(Cubo4C4T.getLocation().x, Cubo4C4T.getLocation().y -= 4);
                    }
                    Cubo2Lbl.repaint();
                    Cubo4Lbl.repaint();

                    Cubo2C3T.repaint();
                    Cubo4C3T.repaint();

                    Cubo2C5T.repaint();
                    Cubo4C5T.repaint();

                    Cubo2C6T.repaint();
                    Cubo4C6T.repaint();

                    Cubo2C4T.repaint();
                    Cubo4C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }

        if ((Cubo3C3T.getLocation().equals(posCubo2Abs) && Cubo4C3T.getLocation().equals(posCubo3Abs))) {
            Point posCubo4C3T = Cubo4C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo3C3T.getLocation().equals(posCubo4C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo3Lbl.setLocation(Cubo3Lbl.getLocation().x, Cubo3Lbl.getLocation().y -= 4);
                        Cubo4Lbl.setLocation(Cubo4Lbl.getLocation().x, Cubo4Lbl.getLocation().y += 4);

                        Cubo3C3T.setLocation(Cubo3C3T.getLocation().x, Cubo3C3T.getLocation().y -= 4);
                        Cubo4C3T.setLocation(Cubo4C3T.getLocation().x, Cubo4C3T.getLocation().y += 4);

                        Cubo3C5T.setLocation(Cubo3C5T.getLocation().x, Cubo3C5T.getLocation().y -= 4);
                        Cubo4C5T.setLocation(Cubo4C5T.getLocation().x, Cubo4C5T.getLocation().y += 4);

                        Cubo3C6T.setLocation(Cubo3C6T.getLocation().x, Cubo3C6T.getLocation().y -= 4);
                        Cubo4C6T.setLocation(Cubo4C6T.getLocation().x, Cubo4C6T.getLocation().y += 4);

                        Cubo3C4T.setLocation(Cubo3C4T.getLocation().x, Cubo3C4T.getLocation().y -= 4);
                        Cubo4C4T.setLocation(Cubo4C4T.getLocation().x, Cubo4C4T.getLocation().y += 4);
                    }
                    Cubo3Lbl.repaint();
                    Cubo4Lbl.repaint();

                    Cubo3C3T.repaint();
                    Cubo4C3T.repaint();

                    Cubo3C5T.repaint();
                    Cubo4C5T.repaint();

                    Cubo3C6T.repaint();
                    Cubo4C6T.repaint();

                    Cubo3C4T.repaint();
                    Cubo4C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }
        if ((Cubo4C3T.getLocation().equals(posCubo2Abs) && Cubo3C3T.getLocation().equals(posCubo3Abs))) {
            Point posCubo4C3T = Cubo4C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo3C3T.getLocation().equals(posCubo4C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo3Lbl.setLocation(Cubo3Lbl.getLocation().x, Cubo3Lbl.getLocation().y += 4);
                        Cubo4Lbl.setLocation(Cubo4Lbl.getLocation().x, Cubo4Lbl.getLocation().y -= 4);

                        Cubo3C3T.setLocation(Cubo3C3T.getLocation().x, Cubo3C3T.getLocation().y += 4);
                        Cubo4C3T.setLocation(Cubo4C3T.getLocation().x, Cubo4C3T.getLocation().y -= 4);

                        Cubo3C5T.setLocation(Cubo3C5T.getLocation().x, Cubo3C5T.getLocation().y += 4);
                        Cubo4C5T.setLocation(Cubo4C5T.getLocation().x, Cubo4C5T.getLocation().y -= 4);

                        Cubo3C6T.setLocation(Cubo3C6T.getLocation().x, Cubo3C6T.getLocation().y += 4);
                        Cubo4C6T.setLocation(Cubo4C6T.getLocation().x, Cubo4C6T.getLocation().y -= 4);

                        Cubo3C4T.setLocation(Cubo3C4T.getLocation().x, Cubo3C4T.getLocation().y += 4);
                        Cubo4C4T.setLocation(Cubo4C4T.getLocation().x, Cubo4C4T.getLocation().y -= 4);
                    }
                    Cubo3Lbl.repaint();
                    Cubo4Lbl.repaint();

                    Cubo3C3T.repaint();
                    Cubo4C3T.repaint();

                    Cubo3C5T.repaint();
                    Cubo4C5T.repaint();

                    Cubo3C6T.repaint();
                    Cubo4C6T.repaint();

                    Cubo3C4T.repaint();
                    Cubo4C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();

        }
    }//GEN-LAST:event_InterCubo2_Cubo3ActionPerformed

    private void InterCubo3_Cubo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterCubo3_Cubo4ActionPerformed
        // TODO add your handling code here:
        if ((Cubo1C3T.getLocation().equals(posCubo3Abs) && Cubo2C3T.getLocation().equals(posCubo4Abs))) {
            Point posCubo2C3T = Cubo2C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo1C3T.getLocation().equals(posCubo2C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo1Lbl.setLocation(Cubo1Lbl.getLocation().x, Cubo1Lbl.getLocation().y -= 4);
                        Cubo2Lbl.setLocation(Cubo2Lbl.getLocation().x, Cubo2Lbl.getLocation().y += 4);

                        Cubo1C3T.setLocation(Cubo1C3T.getLocation().x, Cubo1C3T.getLocation().y -= 4);
                        Cubo2C3T.setLocation(Cubo2C3T.getLocation().x, Cubo2C3T.getLocation().y += 4);

                        Cubo1C5T.setLocation(Cubo1C5T.getLocation().x, Cubo1C5T.getLocation().y -= 4);
                        Cubo2C5T.setLocation(Cubo2C5T.getLocation().x, Cubo2C5T.getLocation().y += 4);

                        Cubo1C6T.setLocation(Cubo1C6T.getLocation().x, Cubo1C6T.getLocation().y -= 4);
                        Cubo2C6T.setLocation(Cubo2C6T.getLocation().x, Cubo2C6T.getLocation().y += 4);

                        Cubo1C4T.setLocation(Cubo1C4T.getLocation().x, Cubo1C4T.getLocation().y -= 4);
                        Cubo2C4T.setLocation(Cubo2C4T.getLocation().x, Cubo2C4T.getLocation().y += 4);
                    }
                    Cubo1Lbl.repaint();
                    Cubo2Lbl.repaint();

                    Cubo1C3T.repaint();
                    Cubo2C3T.repaint();

                    Cubo1C5T.repaint();
                    Cubo2C5T.repaint();

                    Cubo1C6T.repaint();
                    Cubo2C6T.repaint();

                    Cubo1C4T.repaint();
                    Cubo2C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }
        if ((Cubo2C3T.getLocation().equals(posCubo3Abs) && Cubo1C3T.getLocation().equals(posCubo4Abs))) {
            Point posCubo2C3T = Cubo2C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo1C3T.getLocation().equals(posCubo2C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo1Lbl.setLocation(Cubo1Lbl.getLocation().x, Cubo1Lbl.getLocation().y += 4);
                        Cubo2Lbl.setLocation(Cubo2Lbl.getLocation().x, Cubo2Lbl.getLocation().y -= 4);

                        Cubo1C3T.setLocation(Cubo1C3T.getLocation().x, Cubo1C3T.getLocation().y += 4);
                        Cubo2C3T.setLocation(Cubo2C3T.getLocation().x, Cubo2C3T.getLocation().y -= 4);

                        Cubo1C5T.setLocation(Cubo1C5T.getLocation().x, Cubo1C5T.getLocation().y += 4);
                        Cubo2C5T.setLocation(Cubo2C5T.getLocation().x, Cubo2C5T.getLocation().y -= 4);

                        Cubo1C6T.setLocation(Cubo1C6T.getLocation().x, Cubo1C6T.getLocation().y += 4);
                        Cubo2C6T.setLocation(Cubo2C6T.getLocation().x, Cubo2C6T.getLocation().y -= 4);

                        Cubo1C4T.setLocation(Cubo1C4T.getLocation().x, Cubo1C4T.getLocation().y += 4);
                        Cubo2C4T.setLocation(Cubo2C4T.getLocation().x, Cubo2C4T.getLocation().y -= 4);
                    }
                    Cubo1Lbl.repaint();
                    Cubo2Lbl.repaint();

                    Cubo1C3T.repaint();
                    Cubo2C3T.repaint();

                    Cubo1C5T.repaint();
                    Cubo2C5T.repaint();

                    Cubo1C6T.repaint();
                    Cubo2C6T.repaint();

                    Cubo1C4T.repaint();
                    Cubo2C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }

        if ((Cubo1C3T.getLocation().equals(posCubo3Abs) && Cubo3C3T.getLocation().equals(posCubo4Abs))) {
            Point posCubo3C3T = Cubo3C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo1C3T.getLocation().equals(posCubo3C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo1Lbl.setLocation(Cubo1Lbl.getLocation().x, Cubo1Lbl.getLocation().y -= 4);
                        Cubo3Lbl.setLocation(Cubo3Lbl.getLocation().x, Cubo3Lbl.getLocation().y += 4);

                        Cubo1C3T.setLocation(Cubo1C3T.getLocation().x, Cubo1C3T.getLocation().y -= 4);
                        Cubo3C3T.setLocation(Cubo3C3T.getLocation().x, Cubo3C3T.getLocation().y += 4);

                        Cubo1C5T.setLocation(Cubo1C5T.getLocation().x, Cubo1C5T.getLocation().y -= 4);
                        Cubo3C5T.setLocation(Cubo3C5T.getLocation().x, Cubo3C5T.getLocation().y += 4);

                        Cubo1C6T.setLocation(Cubo1C6T.getLocation().x, Cubo1C6T.getLocation().y -= 4);
                        Cubo3C6T.setLocation(Cubo3C6T.getLocation().x, Cubo3C6T.getLocation().y += 4);

                        Cubo1C4T.setLocation(Cubo1C4T.getLocation().x, Cubo1C4T.getLocation().y -= 4);
                        Cubo3C4T.setLocation(Cubo3C4T.getLocation().x, Cubo3C4T.getLocation().y += 4);
                    }
                    Cubo1Lbl.repaint();
                    Cubo3Lbl.repaint();

                    Cubo1C3T.repaint();
                    Cubo3C3T.repaint();

                    Cubo1C5T.repaint();
                    Cubo3C5T.repaint();

                    Cubo1C6T.repaint();
                    Cubo3C6T.repaint();

                    Cubo1C4T.repaint();
                    Cubo3C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }
        if ((Cubo3C3T.getLocation().equals(posCubo3Abs) && Cubo1C3T.getLocation().equals(posCubo4Abs))) {
            Point posCubo3C3T = Cubo3C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo1C3T.getLocation().equals(posCubo3C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo1Lbl.setLocation(Cubo1Lbl.getLocation().x, Cubo1Lbl.getLocation().y += 4);
                        Cubo3Lbl.setLocation(Cubo3Lbl.getLocation().x, Cubo3Lbl.getLocation().y -= 4);

                        Cubo1C3T.setLocation(Cubo1C3T.getLocation().x, Cubo1C3T.getLocation().y += 4);
                        Cubo3C3T.setLocation(Cubo3C3T.getLocation().x, Cubo3C3T.getLocation().y -= 4);

                        Cubo1C5T.setLocation(Cubo1C5T.getLocation().x, Cubo1C5T.getLocation().y += 4);
                        Cubo3C5T.setLocation(Cubo3C5T.getLocation().x, Cubo3C5T.getLocation().y -= 4);

                        Cubo1C6T.setLocation(Cubo1C6T.getLocation().x, Cubo1C6T.getLocation().y += 4);
                        Cubo3C6T.setLocation(Cubo3C6T.getLocation().x, Cubo3C6T.getLocation().y -= 4);

                        Cubo1C4T.setLocation(Cubo1C4T.getLocation().x, Cubo1C4T.getLocation().y += 4);
                        Cubo3C4T.setLocation(Cubo3C4T.getLocation().x, Cubo3C4T.getLocation().y -= 4);
                    }
                    Cubo1Lbl.repaint();
                    Cubo3Lbl.repaint();

                    Cubo1C3T.repaint();
                    Cubo3C3T.repaint();

                    Cubo1C5T.repaint();
                    Cubo3C5T.repaint();

                    Cubo1C6T.repaint();
                    Cubo3C6T.repaint();

                    Cubo1C4T.repaint();
                    Cubo3C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }

        if ((Cubo1C3T.getLocation().equals(posCubo3Abs) && Cubo4C3T.getLocation().equals(posCubo4Abs))) {
            Point posCubo4C3T = Cubo4C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo1C3T.getLocation().equals(posCubo4C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo1Lbl.setLocation(Cubo1Lbl.getLocation().x, Cubo1Lbl.getLocation().y -= 4);
                        Cubo4Lbl.setLocation(Cubo4Lbl.getLocation().x, Cubo4Lbl.getLocation().y += 4);

                        Cubo1C3T.setLocation(Cubo1C3T.getLocation().x, Cubo1C3T.getLocation().y -= 4);
                        Cubo4C3T.setLocation(Cubo4C3T.getLocation().x, Cubo4C3T.getLocation().y += 4);

                        Cubo1C5T.setLocation(Cubo1C5T.getLocation().x, Cubo1C5T.getLocation().y -= 4);
                        Cubo4C5T.setLocation(Cubo4C5T.getLocation().x, Cubo4C5T.getLocation().y += 4);

                        Cubo1C6T.setLocation(Cubo1C6T.getLocation().x, Cubo1C6T.getLocation().y -= 4);
                        Cubo4C6T.setLocation(Cubo4C6T.getLocation().x, Cubo4C6T.getLocation().y += 4);

                        Cubo1C4T.setLocation(Cubo1C4T.getLocation().x, Cubo1C4T.getLocation().y -= 4);
                        Cubo4C4T.setLocation(Cubo4C4T.getLocation().x, Cubo4C4T.getLocation().y += 4);
                    }
                    Cubo1Lbl.repaint();
                    Cubo4Lbl.repaint();

                    Cubo1C3T.repaint();
                    Cubo4C3T.repaint();

                    Cubo1C5T.repaint();
                    Cubo4C5T.repaint();

                    Cubo1C6T.repaint();
                    Cubo4C6T.repaint();

                    Cubo1C4T.repaint();
                    Cubo4C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }
        if ((Cubo4C3T.getLocation().equals(posCubo3Abs) && Cubo1C3T.getLocation().equals(posCubo4Abs))) {
            Point posCubo4C3T = Cubo4C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo1C3T.getLocation().equals(posCubo4C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo1Lbl.setLocation(Cubo1Lbl.getLocation().x, Cubo1Lbl.getLocation().y += 4);
                        Cubo4Lbl.setLocation(Cubo4Lbl.getLocation().x, Cubo4Lbl.getLocation().y -= 4);

                        Cubo1C3T.setLocation(Cubo1C3T.getLocation().x, Cubo1C3T.getLocation().y += 4);
                        Cubo4C3T.setLocation(Cubo4C3T.getLocation().x, Cubo4C3T.getLocation().y -= 4);

                        Cubo1C5T.setLocation(Cubo1C5T.getLocation().x, Cubo1C5T.getLocation().y += 4);
                        Cubo4C5T.setLocation(Cubo4C5T.getLocation().x, Cubo4C5T.getLocation().y -= 4);

                        Cubo1C6T.setLocation(Cubo1C6T.getLocation().x, Cubo1C6T.getLocation().y += 4);
                        Cubo4C6T.setLocation(Cubo4C6T.getLocation().x, Cubo4C6T.getLocation().y -= 4);

                        Cubo1C4T.setLocation(Cubo1C4T.getLocation().x, Cubo1C4T.getLocation().y += 4);
                        Cubo4C4T.setLocation(Cubo4C4T.getLocation().x, Cubo4C4T.getLocation().y -= 4);
                    }
                    Cubo1Lbl.repaint();
                    Cubo4Lbl.repaint();

                    Cubo1C3T.repaint();
                    Cubo4C3T.repaint();

                    Cubo1C5T.repaint();
                    Cubo4C5T.repaint();

                    Cubo1C6T.repaint();
                    Cubo4C6T.repaint();

                    Cubo1C4T.repaint();
                    Cubo4C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }

        if ((Cubo2C3T.getLocation().equals(posCubo3Abs) && Cubo3C3T.getLocation().equals(posCubo4Abs))) {
            Point posCubo3C3T = Cubo3C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo2C3T.getLocation().equals(posCubo3C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo2Lbl.setLocation(Cubo2Lbl.getLocation().x, Cubo2Lbl.getLocation().y -= 4);
                        Cubo3Lbl.setLocation(Cubo3Lbl.getLocation().x, Cubo3Lbl.getLocation().y += 4);

                        Cubo2C3T.setLocation(Cubo2C3T.getLocation().x, Cubo2C3T.getLocation().y -= 4);
                        Cubo3C3T.setLocation(Cubo3C3T.getLocation().x, Cubo3C3T.getLocation().y += 4);

                        Cubo2C5T.setLocation(Cubo2C5T.getLocation().x, Cubo2C5T.getLocation().y -= 4);
                        Cubo3C5T.setLocation(Cubo3C5T.getLocation().x, Cubo3C5T.getLocation().y += 4);

                        Cubo2C6T.setLocation(Cubo2C6T.getLocation().x, Cubo2C6T.getLocation().y -= 4);
                        Cubo3C6T.setLocation(Cubo3C6T.getLocation().x, Cubo3C6T.getLocation().y += 4);

                        Cubo2C4T.setLocation(Cubo2C4T.getLocation().x, Cubo2C4T.getLocation().y -= 4);
                        Cubo3C4T.setLocation(Cubo3C4T.getLocation().x, Cubo3C4T.getLocation().y += 4);
                    }
                    Cubo2Lbl.repaint();
                    Cubo3Lbl.repaint();

                    Cubo2C3T.repaint();
                    Cubo3C3T.repaint();

                    Cubo2C5T.repaint();
                    Cubo3C5T.repaint();

                    Cubo2C6T.repaint();
                    Cubo3C6T.repaint();

                    Cubo2C4T.repaint();
                    Cubo3C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }
        if ((Cubo3C3T.getLocation().equals(posCubo3Abs) && Cubo2C3T.getLocation().equals(posCubo4Abs))) {
            Point posCubo3C3T = Cubo3C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo2C3T.getLocation().equals(posCubo3C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo2Lbl.setLocation(Cubo2Lbl.getLocation().x, Cubo2Lbl.getLocation().y += 4);
                        Cubo3Lbl.setLocation(Cubo3Lbl.getLocation().x, Cubo3Lbl.getLocation().y -= 4);

                        Cubo2C3T.setLocation(Cubo2C3T.getLocation().x, Cubo2C3T.getLocation().y += 4);
                        Cubo3C3T.setLocation(Cubo3C3T.getLocation().x, Cubo3C3T.getLocation().y -= 4);

                        Cubo2C5T.setLocation(Cubo2C5T.getLocation().x, Cubo2C5T.getLocation().y += 4);
                        Cubo3C5T.setLocation(Cubo3C5T.getLocation().x, Cubo3C5T.getLocation().y -= 4);

                        Cubo2C6T.setLocation(Cubo2C6T.getLocation().x, Cubo2C6T.getLocation().y += 4);
                        Cubo3C6T.setLocation(Cubo3C6T.getLocation().x, Cubo3C6T.getLocation().y -= 4);

                        Cubo2C4T.setLocation(Cubo2C4T.getLocation().x, Cubo2C4T.getLocation().y += 4);
                        Cubo3C4T.setLocation(Cubo3C4T.getLocation().x, Cubo3C4T.getLocation().y -= 4);
                    }
                    Cubo2Lbl.repaint();
                    Cubo3Lbl.repaint();

                    Cubo2C3T.repaint();
                    Cubo3C3T.repaint();

                    Cubo2C5T.repaint();
                    Cubo3C5T.repaint();

                    Cubo2C6T.repaint();
                    Cubo3C6T.repaint();

                    Cubo2C4T.repaint();
                    Cubo3C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }

        if ((Cubo2C3T.getLocation().equals(posCubo3Abs) && Cubo4C3T.getLocation().equals(posCubo4Abs))) {
            Point posCubo4C3T = Cubo4C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo2C3T.getLocation().equals(posCubo4C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo2Lbl.setLocation(Cubo2Lbl.getLocation().x, Cubo2Lbl.getLocation().y -= 4);
                        Cubo4Lbl.setLocation(Cubo4Lbl.getLocation().x, Cubo4Lbl.getLocation().y += 4);

                        Cubo2C3T.setLocation(Cubo2C3T.getLocation().x, Cubo2C3T.getLocation().y -= 4);
                        Cubo4C3T.setLocation(Cubo4C3T.getLocation().x, Cubo4C3T.getLocation().y += 4);

                        Cubo2C5T.setLocation(Cubo2C5T.getLocation().x, Cubo2C5T.getLocation().y -= 4);
                        Cubo4C5T.setLocation(Cubo4C5T.getLocation().x, Cubo4C5T.getLocation().y += 4);

                        Cubo2C6T.setLocation(Cubo2C6T.getLocation().x, Cubo2C6T.getLocation().y -= 4);
                        Cubo4C6T.setLocation(Cubo4C6T.getLocation().x, Cubo4C6T.getLocation().y += 4);

                        Cubo2C4T.setLocation(Cubo2C4T.getLocation().x, Cubo2C4T.getLocation().y -= 4);
                        Cubo4C4T.setLocation(Cubo4C4T.getLocation().x, Cubo4C4T.getLocation().y += 4);
                    }
                    Cubo2Lbl.repaint();
                    Cubo4Lbl.repaint();

                    Cubo2C3T.repaint();
                    Cubo4C3T.repaint();

                    Cubo2C5T.repaint();
                    Cubo4C5T.repaint();

                    Cubo2C6T.repaint();
                    Cubo4C6T.repaint();

                    Cubo2C4T.repaint();
                    Cubo4C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }
        if ((Cubo4C3T.getLocation().equals(posCubo3Abs) && Cubo2C3T.getLocation().equals(posCubo4Abs))) {
            Point posCubo4C3T = Cubo4C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo2C3T.getLocation().equals(posCubo4C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo2Lbl.setLocation(Cubo2Lbl.getLocation().x, Cubo2Lbl.getLocation().y += 4);
                        Cubo4Lbl.setLocation(Cubo4Lbl.getLocation().x, Cubo4Lbl.getLocation().y -= 4);

                        Cubo2C3T.setLocation(Cubo2C3T.getLocation().x, Cubo2C3T.getLocation().y += 4);
                        Cubo4C3T.setLocation(Cubo4C3T.getLocation().x, Cubo4C3T.getLocation().y -= 4);

                        Cubo2C5T.setLocation(Cubo2C5T.getLocation().x, Cubo2C5T.getLocation().y += 4);
                        Cubo4C5T.setLocation(Cubo4C5T.getLocation().x, Cubo4C5T.getLocation().y -= 4);

                        Cubo2C6T.setLocation(Cubo2C6T.getLocation().x, Cubo2C6T.getLocation().y += 4);
                        Cubo4C6T.setLocation(Cubo4C6T.getLocation().x, Cubo4C6T.getLocation().y -= 4);

                        Cubo2C4T.setLocation(Cubo2C4T.getLocation().x, Cubo2C4T.getLocation().y += 4);
                        Cubo4C4T.setLocation(Cubo4C4T.getLocation().x, Cubo4C4T.getLocation().y -= 4);
                    }
                    Cubo2Lbl.repaint();
                    Cubo4Lbl.repaint();

                    Cubo2C3T.repaint();
                    Cubo4C3T.repaint();

                    Cubo2C5T.repaint();
                    Cubo4C5T.repaint();

                    Cubo2C6T.repaint();
                    Cubo4C6T.repaint();

                    Cubo2C4T.repaint();
                    Cubo4C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }

        if ((Cubo3C3T.getLocation().equals(posCubo3Abs) && Cubo4C3T.getLocation().equals(posCubo4Abs))) {
            Point posCubo4C3T = Cubo4C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo3C3T.getLocation().equals(posCubo4C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo3Lbl.setLocation(Cubo3Lbl.getLocation().x, Cubo3Lbl.getLocation().y -= 4);
                        Cubo4Lbl.setLocation(Cubo4Lbl.getLocation().x, Cubo4Lbl.getLocation().y += 4);

                        Cubo3C3T.setLocation(Cubo3C3T.getLocation().x, Cubo3C3T.getLocation().y -= 4);
                        Cubo4C3T.setLocation(Cubo4C3T.getLocation().x, Cubo4C3T.getLocation().y += 4);

                        Cubo3C5T.setLocation(Cubo3C5T.getLocation().x, Cubo3C5T.getLocation().y -= 4);
                        Cubo4C5T.setLocation(Cubo4C5T.getLocation().x, Cubo4C5T.getLocation().y += 4);

                        Cubo3C6T.setLocation(Cubo3C6T.getLocation().x, Cubo3C6T.getLocation().y -= 4);
                        Cubo4C6T.setLocation(Cubo4C6T.getLocation().x, Cubo4C6T.getLocation().y += 4);

                        Cubo3C4T.setLocation(Cubo3C4T.getLocation().x, Cubo3C4T.getLocation().y -= 4);
                        Cubo4C4T.setLocation(Cubo4C4T.getLocation().x, Cubo4C4T.getLocation().y += 4);
                    }
                    Cubo3Lbl.repaint();
                    Cubo4Lbl.repaint();

                    Cubo3C3T.repaint();
                    Cubo4C3T.repaint();

                    Cubo3C5T.repaint();
                    Cubo4C5T.repaint();

                    Cubo3C6T.repaint();
                    Cubo4C6T.repaint();

                    Cubo3C4T.repaint();
                    Cubo4C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();
        }
        if ((Cubo4C3T.getLocation().equals(posCubo3Abs) && Cubo3C3T.getLocation().equals(posCubo4Abs))) {
            Point posCubo4C3T = Cubo4C3T.getLocation();
            ActionListener interC1_C2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (Cubo3C3T.getLocation().equals(posCubo4C3T)) {
                        // Si el cubo llega a la posicion deseada, se detiene
                        timer.stop();
                    } else {
                        Cubo3Lbl.setLocation(Cubo3Lbl.getLocation().x, Cubo3Lbl.getLocation().y += 4);
                        Cubo4Lbl.setLocation(Cubo4Lbl.getLocation().x, Cubo4Lbl.getLocation().y -= 4);

                        Cubo3C3T.setLocation(Cubo3C3T.getLocation().x, Cubo3C3T.getLocation().y += 4);
                        Cubo4C3T.setLocation(Cubo4C3T.getLocation().x, Cubo4C3T.getLocation().y -= 4);

                        Cubo3C5T.setLocation(Cubo3C5T.getLocation().x, Cubo3C5T.getLocation().y += 4);
                        Cubo4C5T.setLocation(Cubo4C5T.getLocation().x, Cubo4C5T.getLocation().y -= 4);

                        Cubo3C6T.setLocation(Cubo3C6T.getLocation().x, Cubo3C6T.getLocation().y += 4);
                        Cubo4C6T.setLocation(Cubo4C6T.getLocation().x, Cubo4C6T.getLocation().y -= 4);

                        Cubo3C4T.setLocation(Cubo3C4T.getLocation().x, Cubo3C4T.getLocation().y += 4);
                        Cubo4C4T.setLocation(Cubo4C4T.getLocation().x, Cubo4C4T.getLocation().y -= 4);
                    }
                    Cubo3Lbl.repaint();
                    Cubo4Lbl.repaint();

                    Cubo3C3T.repaint();
                    Cubo4C3T.repaint();

                    Cubo3C5T.repaint();
                    Cubo4C5T.repaint();

                    Cubo3C6T.repaint();
                    Cubo4C6T.repaint();

                    Cubo3C4T.repaint();
                    Cubo4C4T.repaint();
                    fondo.repaint();
                }
            };
            timer = new Timer(2, interC1_C2);
            timer.start();

        }
    }//GEN-LAST:event_InterCubo3_Cubo4ActionPerformed

    private void Cubo1C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo1C1ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo1();
        }
    }//GEN-LAST:event_Cubo1C1ActionPerformed

    private void Cubo1C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo1C2ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo1();
        }
    }//GEN-LAST:event_Cubo1C2ActionPerformed

    private void Cubo1C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo1C3ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo1();
        }
    }//GEN-LAST:event_Cubo1C3ActionPerformed

    private void Cubo1C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo1C4ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo1();
        }
    }//GEN-LAST:event_Cubo1C4ActionPerformed

    private void Cubo1C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo1C5ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo1();
        }
    }//GEN-LAST:event_Cubo1C5ActionPerformed

    private void Cubo1C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo1C6ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo1();
        }
    }//GEN-LAST:event_Cubo1C6ActionPerformed

    private void Cubo2C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo2C1ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo2();
        }
    }//GEN-LAST:event_Cubo2C1ActionPerformed

    private void Cubo2C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo2C2ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo2();
        }
    }//GEN-LAST:event_Cubo2C2ActionPerformed

    private void Cubo2C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo2C3ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo2();
        }
    }//GEN-LAST:event_Cubo2C3ActionPerformed

    private void Cubo2C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo2C4ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo2();
        }
    }//GEN-LAST:event_Cubo2C4ActionPerformed

    private void Cubo2C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo2C5ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo2();
        }
    }//GEN-LAST:event_Cubo2C5ActionPerformed

    private void Cubo2C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo2C6ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo2();
        }
    }//GEN-LAST:event_Cubo2C6ActionPerformed

    private void Cubo3C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo3C1ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo3();
        }
    }//GEN-LAST:event_Cubo3C1ActionPerformed

    private void Cubo3C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo3C2ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo3();
        }
    }//GEN-LAST:event_Cubo3C2ActionPerformed

    private void Cubo3C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo3C3ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo3();
        }
    }//GEN-LAST:event_Cubo3C3ActionPerformed

    private void Cubo3C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo3C4ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo3();
        }
    }//GEN-LAST:event_Cubo3C4ActionPerformed

    private void Cubo3C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo3C5ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo3();
        }
    }//GEN-LAST:event_Cubo3C5ActionPerformed

    private void Cubo3C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo3C6ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo3();
        }
    }//GEN-LAST:event_Cubo3C6ActionPerformed

    private void Cubo4C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo4C1ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo4();
        }
    }//GEN-LAST:event_Cubo4C1ActionPerformed

    private void Cubo4C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo4C2ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo4();
        }
    }//GEN-LAST:event_Cubo4C2ActionPerformed

    private void Cubo4C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo4C3ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo4();
        }
    }//GEN-LAST:event_Cubo4C3ActionPerformed

    private void Cubo4C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo4C4ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo4();
        }
    }//GEN-LAST:event_Cubo4C4ActionPerformed

    private void Cubo4C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo4C5ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo4();
        }
    }//GEN-LAST:event_Cubo4C5ActionPerformed

    private void Cubo4C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cubo4C6ActionPerformed
        // TODO add your handling code here:
        if (iniciado == true) {
            genCubo4();
        }
    }//GEN-LAST:event_Cubo4C6ActionPerformed

    private void aplicarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarBtnActionPerformed
        // TODO add your handling code here:
        Object[] options = {"Sí",
            "No"};
        int yes = JOptionPane.showOptionDialog(null,
                "Esto borrará los datos actuales y restablecerá\n"
                + "los datos de la partida seleccionada.\n"
                + "Deseas continuar?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (JOptionPane.YES_OPTION == yes) {
            resuelto = false;
            jTabbedPane1.setSelectedIndex(0);
            aplicado = true;
            // Cubo 1
            if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C1I.equals("R")) {
                Cubo1C1.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C1I.equals("B")) {
                Cubo1C1.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C1I.equals("V")) {
                Cubo1C1.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C1I.equals("A")) {
                Cubo1C1.setSelectedItem("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C2I.equals("R")) {
                Cubo1C2.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C2I.equals("B")) {
                Cubo1C2.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C2I.equals("V")) {
                Cubo1C2.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C2I.equals("A")) {
                Cubo1C2.setSelectedItem("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C3I.equals("R")) {
                Cubo1C3.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C3I.equals("B")) {
                Cubo1C3.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C3I.equals("V")) {
                Cubo1C3.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C3I.equals("A")) {
                Cubo1C3.setSelectedItem("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C4I.equals("R")) {
                Cubo1C4.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C4I.equals("B")) {
                Cubo1C4.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C4I.equals("V")) {
                Cubo1C4.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C4I.equals("A")) {
                Cubo1C4.setSelectedItem("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C5I.equals("R")) {
                Cubo1C5.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C5I.equals("B")) {
                Cubo1C5.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C5I.equals("V")) {
                Cubo1C5.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C5I.equals("A")) {
                Cubo1C5.setSelectedItem("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C6I.equals("R")) {
                Cubo1C6.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C6I.equals("B")) {
                Cubo1C6.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C6I.equals("V")) {
                Cubo1C6.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C6I.equals("A")) {
                Cubo1C6.setSelectedItem("Amarillo");
            }

            // Cubo 2
            if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C1I.equals("R")) {
                Cubo2C1.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C1I.equals("B")) {
                Cubo2C1.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C1I.equals("V")) {
                Cubo2C1.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C1I.equals("A")) {
                Cubo2C1.setSelectedItem("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C2I.equals("R")) {
                Cubo2C2.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C2I.equals("B")) {
                Cubo2C2.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C2I.equals("V")) {
                Cubo2C2.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C2I.equals("A")) {
                Cubo2C2.setSelectedItem("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C3I.equals("R")) {
                Cubo2C3.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C3I.equals("B")) {
                Cubo2C3.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C3I.equals("V")) {
                Cubo2C3.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C3I.equals("A")) {
                Cubo2C3.setSelectedItem("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C4I.equals("R")) {
                Cubo2C4.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C4I.equals("B")) {
                Cubo2C4.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C4I.equals("V")) {
                Cubo2C4.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C4I.equals("A")) {
                Cubo2C4.setSelectedItem("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C5I.equals("R")) {
                Cubo2C5.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C5I.equals("B")) {
                Cubo2C5.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C5I.equals("V")) {
                Cubo2C5.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C5I.equals("A")) {
                Cubo2C5.setSelectedItem("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C6I.equals("R")) {
                Cubo2C6.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C6I.equals("B")) {
                Cubo2C6.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C6I.equals("V")) {
                Cubo2C6.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C6I.equals("A")) {
                Cubo2C6.setSelectedItem("Amarillo");
            }

            // Cubo 3
            if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C1I.equals("R")) {
                Cubo3C1.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C1I.equals("B")) {
                Cubo3C1.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C1I.equals("V")) {
                Cubo3C1.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C1I.equals("A")) {
                Cubo3C1.setSelectedItem("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C2I.equals("R")) {
                Cubo3C2.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C2I.equals("B")) {
                Cubo3C2.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C2I.equals("V")) {
                Cubo3C2.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C2I.equals("A")) {
                Cubo3C2.setSelectedItem("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C3I.equals("R")) {
                Cubo3C3.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C3I.equals("B")) {
                Cubo3C3.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C3I.equals("V")) {
                Cubo3C3.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C3I.equals("A")) {
                Cubo3C3.setSelectedItem("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C4I.equals("R")) {
                Cubo3C4.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C4I.equals("B")) {
                Cubo3C4.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C4I.equals("V")) {
                Cubo3C4.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C4I.equals("A")) {
                Cubo3C4.setSelectedItem("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C5I.equals("R")) {
                Cubo3C5.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C5I.equals("B")) {
                Cubo3C5.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C5I.equals("V")) {
                Cubo3C5.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C5I.equals("A")) {
                Cubo3C5.setSelectedItem("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C6I.equals("R")) {
                Cubo3C6.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C6I.equals("B")) {
                Cubo3C6.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C6I.equals("V")) {
                Cubo3C6.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C6I.equals("A")) {
                Cubo3C6.setSelectedItem("Amarillo");
            }

            // Cubo 4
            if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C1I.equals("R")) {
                Cubo4C1.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C1I.equals("B")) {
                Cubo4C1.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C1I.equals("V")) {
                Cubo4C1.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C1I.equals("A")) {
                Cubo4C1.setSelectedItem("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C2I.equals("R")) {
                Cubo4C2.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C2I.equals("B")) {
                Cubo4C2.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C2I.equals("V")) {
                Cubo4C2.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C2I.equals("A")) {
                Cubo4C2.setSelectedItem("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C3I.equals("R")) {
                Cubo4C3.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C3I.equals("B")) {
                Cubo4C3.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C3I.equals("V")) {
                Cubo4C3.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C3I.equals("A")) {
                Cubo4C3.setSelectedItem("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C4I.equals("R")) {
                Cubo4C4.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C4I.equals("B")) {
                Cubo4C4.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C4I.equals("V")) {
                Cubo4C4.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C4I.equals("A")) {
                Cubo4C4.setSelectedItem("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C5I.equals("R")) {
                Cubo4C5.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C5I.equals("B")) {
                Cubo4C5.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C5I.equals("V")) {
                Cubo4C5.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C5I.equals("A")) {
                Cubo4C5.setSelectedItem("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C6I.equals("R")) {
                Cubo4C6.setSelectedItem("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C6I.equals("B")) {
                Cubo4C6.setSelectedItem("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C6I.equals("V")) {
                Cubo4C6.setSelectedItem("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C6I.equals("A")) {
                Cubo4C6.setSelectedItem("Amarillo");
            }

        } else {

        }
    }//GEN-LAST:event_aplicarBtnActionPerformed

    public boolean resolverJuegoSilent() {
        boolean G1Encontrado = false;
        boolean G2Encontrado = false;

        int posI = 0;
        int posC = 0;
        int posW = 0;
        int posR = 0;

        int Intento = 0;
        int iPosibilidades = 0;
        soluciones = new ArrayList<>();

        // Grafo Gl 
        // Cubo 1
        String Cubo1arista1I = Cubo1.C1I;
        String Cubo1arista1F = Cubo1.C2I;

        String Cubo1arista2I = Cubo1.C3I;
        String Cubo1arista2F = Cubo1.C4I;

        String Cubo1arista3I = Cubo1.C5I;
        String Cubo1arista3F = Cubo1.C6I;

        // Cubo 2
        String Cubo2arista1I = Cubo2.C1I;
        String Cubo2arista1F = Cubo2.C2I;

        String Cubo2arista2I = Cubo2.C3I;
        String Cubo2arista2F = Cubo2.C4I;

        String Cubo2arista3I = Cubo2.C5I;
        String Cubo2arista3F = Cubo2.C6I;

        // Cubo 3
        String Cubo3arista1I = Cubo3.C1I;
        String Cubo3arista1F = Cubo3.C2I;

        String Cubo3arista2I = Cubo3.C3I;
        String Cubo3arista2F = Cubo3.C4I;

        String Cubo3arista3I = Cubo3.C5I;
        String Cubo3arista3F = Cubo3.C6I;

        // Cubo 4
        String Cubo4arista1I = Cubo4.C1I;
        String Cubo4arista1F = Cubo4.C2I;

        String Cubo4arista2I = Cubo4.C3I;
        String Cubo4arista2F = Cubo4.C4I;

        String Cubo4arista3I = Cubo4.C5I;
        String Cubo4arista3F = Cubo4.C6I;

        // Grafo G1: Solución Horizontal
        String Cubo1aristaG1I = null;
        String Cubo1aristaG1F = null;

        String Cubo2aristaG1I = null;
        String Cubo2aristaG1F = null;

        String Cubo3aristaG1I = null;
        String Cubo3aristaG1F = null;

        String Cubo4aristaG1I = null;
        String Cubo4aristaG1F = null;

        // Grafo G2: Solución Vertical
        String Cubo1aristaG2I = null;
        String Cubo1aristaG2F = null;

        String Cubo2aristaG2I = null;
        String Cubo2aristaG2F = null;

        String Cubo3aristaG2I = null;
        String Cubo3aristaG2F = null;

        String Cubo4aristaG2I = null;
        String Cubo4aristaG2F = null;

        int gradoVerticeR = 0;
        int gradoVerticeB = 0;
        int gradoVerticeV = 0;
        int gradoVerticeA = 0;

        String[] verticesCubo1 = {Cubo1arista1I, Cubo1arista1F, Cubo1arista2I, Cubo1arista2F, Cubo1arista3I, Cubo1arista3F};
        String[] verticesCubo2 = {Cubo2arista1I, Cubo2arista1F, Cubo2arista2I, Cubo2arista2F, Cubo2arista3I, Cubo2arista3F};
        String[] verticesCubo3 = {Cubo3arista1I, Cubo3arista1F, Cubo3arista2I, Cubo3arista2F, Cubo3arista3I, Cubo3arista3F};
        String[] verticesCubo4 = {Cubo4arista1I, Cubo4arista1F, Cubo4arista2I, Cubo4arista2F, Cubo4arista3I, Cubo4arista3F};

        //
        for (int i = 0; i < 6; i += 2) {
            for (int c = 0; c < 6; c += 2) {
                for (int w = 0; w < 6; w += 2) {
                    for (int r = 0; r < 6; r += 2) {
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

                            if (Intento == 0 || (Intento + 1) % 2 == 1) {
                                System.out.println("Grafo G1: Horizontal - Encontrado");
                                posI = i;
                                posC = c;
                                posW = w;
                                posR = r;

                                G1Encontrado = true;
                                Cubo1aristaG1I = verticesCubo1[i];
                                Cubo1aristaG1F = verticesCubo1[i + 1];

                                Cubo2aristaG1I = verticesCubo2[c];
                                Cubo2aristaG1F = verticesCubo2[c + 1];

                                Cubo3aristaG1I = verticesCubo3[w];
                                Cubo3aristaG1F = verticesCubo3[w + 1];

                                Cubo4aristaG1I = verticesCubo4[r];
                                Cubo4aristaG1F = verticesCubo4[r + 1];

                                soluciones.add(new Soluciones(i, Cubo1aristaG1I, Cubo1aristaG1F,
                                        c, Cubo2aristaG1I, Cubo2aristaG1F,
                                        w, Cubo3aristaG1I, Cubo3aristaG1F,
                                        r, Cubo4aristaG1I, Cubo4aristaG1F));
                                Intento++;

                                System.out.println("Cubo 1: " + Cubo1aristaG1I + "-" + Cubo1aristaG1F);
                                System.out.println("Cubo 2: " + Cubo2aristaG1I + "-" + Cubo2aristaG1F);
                                System.out.println("Cubo 3: " + Cubo3aristaG1I + "-" + Cubo3aristaG1F);
                                System.out.println("Cubo 4: " + Cubo4aristaG1I + "-" + Cubo4aristaG1F);

                            } else if ((i != posI) && (c != posC) && (w != posW) && (r != posR)) {

                                G2Encontrado = true;
                                Cubo1aristaG2I = verticesCubo1[i];
                                Cubo1aristaG2F = verticesCubo1[i + 1];

                                Cubo2aristaG2I = verticesCubo2[c];
                                Cubo2aristaG2F = verticesCubo2[c + 1];

                                Cubo3aristaG2I = verticesCubo3[w];
                                Cubo3aristaG2F = verticesCubo3[w + 1];

                                Cubo4aristaG2I = verticesCubo4[r];
                                Cubo4aristaG2F = verticesCubo4[r + 1];

                                soluciones.add(new Soluciones(i, Cubo1aristaG2I, Cubo1aristaG2F,
                                        c, Cubo2aristaG2I, Cubo2aristaG2F,
                                        w, Cubo3aristaG2I, Cubo3aristaG2F,
                                        r, Cubo4aristaG2I, Cubo4aristaG2F));
                                Intento++;
                                iPosibilidades++;

                                System.out.println("Grafo G2: Vertical - Encontrado");
                                System.out.println("Cubo 1: " + Cubo1aristaG2I + "-" + Cubo1aristaG2F);
                                System.out.println("Cubo 2: " + Cubo2aristaG2I + "-" + Cubo2aristaG2F);
                                System.out.println("Cubo 3: " + Cubo3aristaG2I + "-" + Cubo3aristaG2F);
                                System.out.println("Cubo 4: " + Cubo4aristaG2I + "-" + Cubo4aristaG2F);
                                break;
                            }
                        }

                    }

                    if (G1Encontrado == true && G2Encontrado == true) {
                        break;
                    }
                }

                if (G1Encontrado == true && G2Encontrado == true) {
                    break;
                }
            }

            if (G1Encontrado == true && G2Encontrado == true) {
                break;
            }
        }

        if (G1Encontrado == true && G2Encontrado == true) {
            System.out.println("SolHz");
            System.out.println(soluciones.get(0).posI + "," + soluciones.get(0).posC + "," + soluciones.get(0).posW + "," + soluciones.get(0).posR);

            System.out.println("SolVt");
            System.out.println(soluciones.get(1).posI + "," + soluciones.get(1).posC + "," + soluciones.get(1).posW + "," + soluciones.get(1).posR);

            //Encontrar otras posibles soluciones
            for (int g = 0; g < 81; g++) {
                boolean G1Alt = false;
                boolean G2Alt = false;
                for (int i = 0; i < 6; i += 2) {
                    for (int c = 0; c < 6; c += 2) {
                        for (int w = 0; w < 6; w += 2) {
                            for (int r = 0; r < 6; r += 2) {
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

                                    if ((Intento + 1) % 2 == 1) {
                                        int contAux2 = 0;
                                        for (int contAux = 0; contAux < soluciones.size(); contAux += 2) {
                                            if ((i != soluciones.get(contAux).posI
                                                    || c != soluciones.get(contAux).posC
                                                    || w != soluciones.get(contAux).posW
                                                    || r != soluciones.get(contAux).posR)
                                                    && (i != soluciones.get(contAux + 1).posI
                                                    || c != soluciones.get(contAux + 1).posC
                                                    || w != soluciones.get(contAux + 1).posW
                                                    || r != soluciones.get(contAux + 1).posR)) {
                                                contAux2++;
                                            }
                                        }

                                        if ((contAux2 == soluciones.size() / 2)) {
                                            System.out.println("Grafo G1: Horizontal - Encontrado (Alt)");
                                            posI = i;
                                            posC = c;
                                            posW = w;
                                            posR = r;

                                            G1Alt = true;
                                            Cubo1aristaG1I = verticesCubo1[i];
                                            Cubo1aristaG1F = verticesCubo1[i + 1];

                                            Cubo2aristaG1I = verticesCubo2[c];
                                            Cubo2aristaG1F = verticesCubo2[c + 1];

                                            Cubo3aristaG1I = verticesCubo3[w];
                                            Cubo3aristaG1F = verticesCubo3[w + 1];

                                            Cubo4aristaG1I = verticesCubo4[r];
                                            Cubo4aristaG1F = verticesCubo4[r + 1];

                                            Intento++;

                                            System.out.println("Cubo 1: " + Cubo1aristaG1I + "-" + Cubo1aristaG1F);
                                            System.out.println("Cubo 2: " + Cubo2aristaG1I + "-" + Cubo2aristaG1F);
                                            System.out.println("Cubo 3: " + Cubo3aristaG1I + "-" + Cubo3aristaG1F);
                                            System.out.println("Cubo 4: " + Cubo4aristaG1I + "-" + Cubo4aristaG1F);
                                        }

                                    } else if (((Intento + 1) % 2 == 0) && ((i != posI) && (c != posC) && (w != posW) && (r != posR))) {

                                        G2Alt = true;

                                        Cubo1aristaG2I = verticesCubo1[i];
                                        Cubo1aristaG2F = verticesCubo1[i + 1];

                                        Cubo2aristaG2I = verticesCubo2[c];
                                        Cubo2aristaG2F = verticesCubo2[c + 1];

                                        Cubo3aristaG2I = verticesCubo3[w];
                                        Cubo3aristaG2F = verticesCubo3[w + 1];

                                        Cubo4aristaG2I = verticesCubo4[r];
                                        Cubo4aristaG2F = verticesCubo4[r + 1];

                                        soluciones.add(new Soluciones(posI, Cubo1aristaG1I, Cubo1aristaG1F,
                                                posC, Cubo2aristaG1I, Cubo2aristaG1F,
                                                posW, Cubo3aristaG1I, Cubo3aristaG1F,
                                                posR, Cubo4aristaG1I, Cubo4aristaG1F));

                                        soluciones.add(new Soluciones(i, Cubo1aristaG2I, Cubo1aristaG2F,
                                                c, Cubo2aristaG2I, Cubo2aristaG2F,
                                                w, Cubo3aristaG2I, Cubo3aristaG2F,
                                                r, Cubo4aristaG2I, Cubo4aristaG2F));
                                        Intento++;
                                        iPosibilidades++;

                                        System.out.println("Grafo G2: Vertical - Encontrado (Alt)");
                                        System.out.println("Cubo 1: " + Cubo1aristaG2I + "-" + Cubo1aristaG2F);
                                        System.out.println("Cubo 2: " + Cubo2aristaG2I + "-" + Cubo2aristaG2F);
                                        System.out.println("Cubo 3: " + Cubo3aristaG2I + "-" + Cubo3aristaG2F);
                                        System.out.println("Cubo 4: " + Cubo4aristaG2I + "-" + Cubo4aristaG2F);

                                        System.out.println("SolHz");
                                        System.out.println(soluciones.get(soluciones.size() - 2).posI + "," + soluciones.get(soluciones.size() - 2).posC + "," + soluciones.get(soluciones.size() - 2).posW + "," + soluciones.get(soluciones.size() - 2).posR);

                                        System.out.println("SolVt");
                                        System.out.println(soluciones.get(1).posI + "," + soluciones.get(soluciones.size() - 1).posC + "," + soluciones.get(soluciones.size() - 1).posW + "," + soluciones.get(soluciones.size() - 1).posR);

                                    }
                                }

                            }

                        }

                    }

                }
            }
        }
        ;
        if (G1Encontrado == true && G2Encontrado == true) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    private void noPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noPartidaActionPerformed
        // TODO add your handling code here:
        if (iPartida > 0) {
            noPartida.setRenderer(new DefaultListCellRenderer() {
                @Override
                public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                    Component component = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                    for (int i = 0; i < iPartida; i++) {
                        if (index == i && partidas.get(i).solucion == false) {
                            component.setForeground(Color.RED);

                        } else if (index == i && partidas.get(i).solucion == true) {
                            component.setForeground(Color.GREEN);

                        }
                    }
                    return component;

                }
            });

            if (partidas.get(noPartida.getSelectedIndex()).solucion == false) {
                ImageIcon uncheck = new ImageIcon("Binarios\\uncheck.png");
                checkLbl.setIcon(uncheck);
                solucionLbl.setText("NO tiene solución");
                solucionLbl.setLocation(720, 18);
                solucionLbl.repaint();
                checkLbl.setLocation(680, 10);

                checkLbl.repaint();

                solucionLbl.setForeground(new Color(255, 58, 84));
            } else {
                ImageIcon check = new ImageIcon("Binarios\\check.png");
                checkLbl.setIcon(check);
                if (partidas.get(noPartida.getSelectedIndex()).soluciones != null) {
                    solucionLbl.setText("SI tiene solución (" + (partidas.get(noPartida.getSelectedIndex()).soluciones.size() / 2) + ")");
                } else {
                    solucionLbl.setText("SI tiene solución");
                }
                solucionLbl.setLocation(700, 18);
                solucionLbl.repaint();
                checkLbl.setLocation(658, 10);

                checkLbl.repaint();

                solucionLbl.setForeground(Color.GREEN);
            }

            // Cubo 1
            if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C1I.equals("R")) {
                Cubo1C1H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C1I.equals("B")) {
                Cubo1C1H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C1I.equals("V")) {
                Cubo1C1H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C1I.equals("A")) {
                Cubo1C1H.setText("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C2I.equals("R")) {
                Cubo1C2H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C2I.equals("B")) {
                Cubo1C2H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C2I.equals("V")) {
                Cubo1C2H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C2I.equals("A")) {
                Cubo1C2H.setText("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C3I.equals("R")) {
                Cubo1C3H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C3I.equals("B")) {
                Cubo1C3H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C3I.equals("V")) {
                Cubo1C3H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C3I.equals("A")) {
                Cubo1C3H.setText("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C4I.equals("R")) {
                Cubo1C4H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C4I.equals("B")) {
                Cubo1C4H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C4I.equals("V")) {
                Cubo1C4H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C4I.equals("A")) {
                Cubo1C4H.setText("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C5I.equals("R")) {
                Cubo1C5H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C5I.equals("B")) {
                Cubo1C5H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C5I.equals("V")) {
                Cubo1C5H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C5I.equals("A")) {
                Cubo1C5H.setText("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C6I.equals("R")) {
                Cubo1C6H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C6I.equals("B")) {
                Cubo1C6H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C6I.equals("V")) {
                Cubo1C6H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo1.C6I.equals("A")) {
                Cubo1C6H.setText("Amarillo");
            }

            // Cubo 2
            if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C1I.equals("R")) {
                Cubo2C1H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C1I.equals("B")) {
                Cubo2C1H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C1I.equals("V")) {
                Cubo2C1H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C1I.equals("A")) {
                Cubo2C1H.setText("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C2I.equals("R")) {
                Cubo2C2H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C2I.equals("B")) {
                Cubo2C2H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C2I.equals("V")) {
                Cubo2C2H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C2I.equals("A")) {
                Cubo2C2H.setText("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C3I.equals("R")) {
                Cubo2C3H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C3I.equals("B")) {
                Cubo2C3H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C3I.equals("V")) {
                Cubo2C3H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C3I.equals("A")) {
                Cubo2C3H.setText("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C4I.equals("R")) {
                Cubo2C4H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C4I.equals("B")) {
                Cubo2C4H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C4I.equals("V")) {
                Cubo2C4H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C4I.equals("A")) {
                Cubo2C4H.setText("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C5I.equals("R")) {
                Cubo2C5H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C5I.equals("B")) {
                Cubo2C5H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C5I.equals("V")) {
                Cubo2C5H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C5I.equals("A")) {
                Cubo2C5H.setText("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C6I.equals("R")) {
                Cubo2C6H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C6I.equals("B")) {
                Cubo2C6H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C6I.equals("V")) {
                Cubo2C6H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo2.C6I.equals("A")) {
                Cubo2C6H.setText("Amarillo");
            }

            // Cubo 3
            if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C1I.equals("R")) {
                Cubo3C1H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C1I.equals("B")) {
                Cubo3C1H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C1I.equals("V")) {
                Cubo3C1H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C1I.equals("A")) {
                Cubo3C1H.setText("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C2I.equals("R")) {
                Cubo3C2H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C2I.equals("B")) {
                Cubo3C2H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C2I.equals("V")) {
                Cubo3C2H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C2I.equals("A")) {
                Cubo3C2H.setText("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C3I.equals("R")) {
                Cubo3C3H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C3I.equals("B")) {
                Cubo3C3H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C3I.equals("V")) {
                Cubo3C3H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C3I.equals("A")) {
                Cubo3C3H.setText("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C4I.equals("R")) {
                Cubo3C4H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C4I.equals("B")) {
                Cubo3C4H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C4I.equals("V")) {
                Cubo3C4H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C4I.equals("A")) {
                Cubo3C4H.setText("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C5I.equals("R")) {
                Cubo3C5H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C5I.equals("B")) {
                Cubo3C5H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C5I.equals("V")) {
                Cubo3C5H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C5I.equals("A")) {
                Cubo3C5H.setText("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C6I.equals("R")) {
                Cubo3C6H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C6I.equals("B")) {
                Cubo3C6H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C6I.equals("V")) {
                Cubo3C6H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo3.C6I.equals("A")) {
                Cubo3C6H.setText("Amarillo");
            }

            // Cubo 4
            if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C1I.equals("R")) {
                Cubo4C1H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C1I.equals("B")) {
                Cubo4C1H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C1I.equals("V")) {
                Cubo4C1H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C1I.equals("A")) {
                Cubo4C1H.setText("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C2I.equals("R")) {
                Cubo4C2H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C2I.equals("B")) {
                Cubo4C2H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C2I.equals("V")) {
                Cubo4C2H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C2I.equals("A")) {
                Cubo4C2H.setText("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C3I.equals("R")) {
                Cubo4C3H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C3I.equals("B")) {
                Cubo4C3H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C3I.equals("V")) {
                Cubo4C3H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C3I.equals("A")) {
                Cubo4C3H.setText("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C4I.equals("R")) {
                Cubo4C4H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C4I.equals("B")) {
                Cubo4C4H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C4I.equals("V")) {
                Cubo4C4H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C4I.equals("A")) {
                Cubo4C4H.setText("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C5I.equals("R")) {
                Cubo4C5H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C5I.equals("B")) {
                Cubo4C5H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C5I.equals("V")) {
                Cubo4C5H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C5I.equals("A")) {
                Cubo4C5H.setText("Amarillo");
            }

            if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C6I.equals("R")) {
                Cubo4C6H.setText("Rojo");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C6I.equals("B")) {
                Cubo4C6H.setText("Blanco");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C6I.equals("V")) {
                Cubo4C6H.setText("Verde");
            } else if (partidas.get(noPartida.getSelectedIndex()).Cubo4.C6I.equals("A")) {
                Cubo4C6H.setText("Amarillo");
            }

            //Aplicar colores en pestaña de Historial
            //Cubo 1
            Color C1 = null;
            if (Cubo1C1H.getText().equals("Rojo")) {
                C1 = Rojo;
                Cubo1C1G1.setText("R");
                Cubo1C1G1.setBackground(C1);

            } else if (Cubo1C1H.getText().equals("Blanco")) {
                C1 = Blanco;
                Cubo1C1G1.setText("B");
                Cubo1C1G1.setBackground(C1);

            } else if (Cubo1C1H.getText().equals("Verde")) {
                C1 = Verde;
                Cubo1C1G1.setText("V");
                Cubo1C1G1.setBackground(C1);

            } else if (Cubo1C1H.getText().equals("Amarillo")) {
                C1 = Amarillo;
                Cubo1C1G1.setText("A");
                Cubo1C1G1.setBackground(C1);

            }

            Color C2 = null;
            if (Cubo1C2H.getText().equals("Rojo")) {
                C2 = Rojo;
                Cubo1C2G1.setText("R");
                Cubo1C2G1.setBackground(C2);

            } else if (Cubo1C2H.getText().equals("Blanco")) {
                C2 = Blanco;
                Cubo1C2G1.setText("B");
                Cubo1C2G1.setBackground(C2);

            } else if (Cubo1C2H.getText().equals("Verde")) {
                C2 = Verde;
                Cubo1C2G1.setText("V");
                Cubo1C2G1.setBackground(C2);

            } else if (Cubo1C2H.getText().equals("Amarillo")) {
                C2 = Amarillo;
                Cubo1C2G1.setText("A");
                Cubo1C2G1.setBackground(C2);

            }

            Color C3 = null;
            if (Cubo1C3H.getText().equals("Rojo")) {
                C3 = Rojo;
                Cubo1C3G1.setText("R");
                Cubo1C3G1.setBackground(C3);

            } else if (Cubo1C3H.getText().equals("Blanco")) {
                C3 = Blanco;
                Cubo1C3G1.setText("B");
                Cubo1C3G1.setBackground(C3);

            } else if (Cubo1C3H.getText().equals("Verde")) {
                C3 = Verde;
                Cubo1C3G1.setText("V");
                Cubo1C3G1.setBackground(C3);

            } else if (Cubo1C3H.getText().equals("Amarillo")) {
                C3 = Amarillo;
                Cubo1C3G1.setText("A");
                Cubo1C3G1.setBackground(C3);

            }

            Color C4 = null;
            if (Cubo1C4H.getText().equals("Rojo")) {
                C4 = Rojo;
                Cubo1C4G1.setText("R");
                Cubo1C4G1.setBackground(C4);

            } else if (Cubo1C4H.getText().equals("Blanco")) {
                C4 = Blanco;
                Cubo1C4G1.setText("B");
                Cubo1C4G1.setBackground(C4);

            } else if (Cubo1C4H.getText().equals("Verde")) {
                C4 = Verde;
                Cubo1C4G1.setText("V");
                Cubo1C4G1.setBackground(C4);

            } else if (Cubo1C4H.getText().equals("Amarillo")) {
                C4 = Amarillo;
                Cubo1C4G1.setText("A");
                Cubo1C4G1.setBackground(C4);

            }

            Color C5 = null;
            if (Cubo1C5H.getText().equals("Rojo")) {
                C5 = Rojo;
                Cubo1C5G1.setText("R");
                Cubo1C5G1.setBackground(C5);

            } else if (Cubo1C5H.getText().equals("Blanco")) {
                C5 = Blanco;
                Cubo1C5G1.setText("B");
                Cubo1C5G1.setBackground(C5);

            } else if (Cubo1C5H.getText().equals("Verde")) {
                C5 = Verde;
                Cubo1C5G1.setText("V");
                Cubo1C5G1.setBackground(C5);

            } else if (Cubo1C5H.getText().equals("Amarillo")) {
                C5 = Amarillo;
                Cubo1C5G1.setText("A");
                Cubo1C5G1.setBackground(C5);

            }

            Color C6 = null;
            if (Cubo1C6H.getText().equals("Rojo")) {
                C6 = Rojo;
                Cubo1C6G1.setText("R");
                Cubo1C6G1.setBackground(C6);

            } else if (Cubo1C6H.getText().equals("Blanco")) {
                C6 = Blanco;
                Cubo1C6G1.setText("B");
                Cubo1C6G1.setBackground(C6);

            } else if (Cubo1C6H.getText().equals("Verde")) {
                C6 = Verde;
                Cubo1C6G1.setText("V");
                Cubo1C6G1.setBackground(C6);

            } else if (Cubo1C6H.getText().equals("Amarillo")) {
                C6 = Amarillo;
                Cubo1C6G1.setText("A");
                Cubo1C6G1.setBackground(C6);

            }

            //Cubo 2
            C1 = null;
            if (Cubo2C1H.getText().equals("Rojo")) {
                C1 = Rojo;
                Cubo2C1G1.setText("R");
                Cubo2C1G1.setBackground(C1);

            } else if (Cubo2C1H.getText().equals("Blanco")) {
                C1 = Blanco;
                Cubo2C1G1.setText("B");
                Cubo2C1G1.setBackground(C1);

            } else if (Cubo2C1H.getText().equals("Verde")) {
                C1 = Verde;
                Cubo2C1G1.setText("V");
                Cubo2C1G1.setBackground(C1);

            } else if (Cubo2C1H.getText().equals("Amarillo")) {
                C1 = Amarillo;
                Cubo2C1G1.setText("A");
                Cubo2C1G1.setBackground(C1);

            }

            C2 = null;
            if (Cubo2C2H.getText().equals("Rojo")) {
                C2 = Rojo;
                Cubo2C2G1.setText("R");
                Cubo2C2G1.setBackground(C2);

            } else if (Cubo2C2H.getText().equals("Blanco")) {
                C2 = Blanco;
                Cubo2C2G1.setText("B");
                Cubo2C2G1.setBackground(C2);

            } else if (Cubo2C2H.getText().equals("Verde")) {
                C2 = Verde;
                Cubo2C2G1.setText("V");
                Cubo2C2G1.setBackground(C2);

            } else if (Cubo2C2H.getText().equals("Amarillo")) {
                C2 = Amarillo;
                Cubo2C2G1.setText("A");
                Cubo2C2G1.setBackground(C2);

            }

            C3 = null;
            if (Cubo2C3H.getText().equals("Rojo")) {
                C3 = Rojo;
                Cubo2C3G1.setText("R");
                Cubo2C3G1.setBackground(C3);

            } else if (Cubo2C3H.getText().equals("Blanco")) {
                C3 = Blanco;
                Cubo2C3G1.setText("B");
                Cubo2C3G1.setBackground(C3);

            } else if (Cubo2C3H.getText().equals("Verde")) {
                C3 = Verde;
                Cubo2C3G1.setText("V");
                Cubo2C3G1.setBackground(C3);

            } else if (Cubo2C3H.getText().equals("Amarillo")) {
                C3 = Amarillo;
                Cubo2C3G1.setText("A");
                Cubo2C3G1.setBackground(C3);

            }

            C4 = null;
            if (Cubo2C4H.getText().equals("Rojo")) {
                C4 = Rojo;
                Cubo2C4G1.setText("R");
                Cubo2C4G1.setBackground(C4);

            } else if (Cubo2C4H.getText().equals("Blanco")) {
                C4 = Blanco;
                Cubo2C4G1.setText("B");
                Cubo2C4G1.setBackground(C4);

            } else if (Cubo2C4H.getText().equals("Verde")) {
                C4 = Verde;
                Cubo2C4G1.setText("V");
                Cubo2C4G1.setBackground(C4);

            } else if (Cubo2C4H.getText().equals("Amarillo")) {
                C4 = Amarillo;
                Cubo2C4G1.setText("A");
                Cubo2C4G1.setBackground(C4);

            }

            C5 = null;
            if (Cubo2C5H.getText().equals("Rojo")) {
                C5 = Rojo;
                Cubo2C5G1.setText("R");
                Cubo2C5G1.setBackground(C5);

            } else if (Cubo2C5H.getText().equals("Blanco")) {
                C5 = Blanco;
                Cubo2C5G1.setText("B");
                Cubo2C5G1.setBackground(C5);

            } else if (Cubo2C5H.getText().equals("Verde")) {
                C5 = Verde;
                Cubo2C5G1.setText("V");
                Cubo2C5G1.setBackground(C5);

            } else if (Cubo2C5H.getText().equals("Amarillo")) {
                C5 = Amarillo;
                Cubo2C5G1.setText("A");
                Cubo2C5G1.setBackground(C5);

            }

            C6 = null;
            if (Cubo2C6H.getText().equals("Rojo")) {
                C6 = Rojo;
                Cubo2C6G1.setText("R");
                Cubo2C6G1.setBackground(C6);

            } else if (Cubo2C6H.getText().equals("Blanco")) {
                C6 = Blanco;
                Cubo2C6G1.setText("B");
                Cubo2C6G1.setBackground(C6);

            } else if (Cubo2C6H.getText().equals("Verde")) {
                C6 = Verde;
                Cubo2C6G1.setText("V");
                Cubo2C6G1.setBackground(C6);

            } else if (Cubo2C6H.getText().equals("Amarillo")) {
                C6 = Amarillo;
                Cubo2C6G1.setText("A");
                Cubo2C6G1.setBackground(C6);

            }

            //Cubo 3
            C1 = null;
            if (Cubo3C1H.getText().equals("Rojo")) {
                C1 = Rojo;
                Cubo3C1G1.setText("R");
                Cubo3C1G1.setBackground(C1);

            } else if (Cubo3C1H.getText().equals("Blanco")) {
                C1 = Blanco;
                Cubo3C1G1.setText("B");
                Cubo3C1G1.setBackground(C1);

            } else if (Cubo3C1H.getText().equals("Verde")) {
                C1 = Verde;
                Cubo3C1G1.setText("V");
                Cubo3C1G1.setBackground(C1);

            } else if (Cubo3C1H.getText().equals("Amarillo")) {
                C1 = Amarillo;
                Cubo3C1G1.setText("A");
                Cubo3C1G1.setBackground(C1);

            }

            C2 = null;
            if (Cubo3C2H.getText().equals("Rojo")) {
                C2 = Rojo;
                Cubo3C2G1.setText("R");
                Cubo3C2G1.setBackground(C2);

            } else if (Cubo3C2H.getText().equals("Blanco")) {
                C2 = Blanco;
                Cubo3C2G1.setText("B");
                Cubo3C2G1.setBackground(C2);

            } else if (Cubo3C2H.getText().equals("Verde")) {
                C2 = Verde;
                Cubo3C2G1.setText("V");
                Cubo3C2G1.setBackground(C2);

            } else if (Cubo3C2H.getText().equals("Amarillo")) {
                C2 = Amarillo;
                Cubo3C2G1.setText("A");
                Cubo3C2G1.setBackground(C2);

            }

            C3 = null;
            if (Cubo3C3H.getText().equals("Rojo")) {
                C3 = Rojo;
                Cubo3C3G1.setText("R");
                Cubo3C3G1.setBackground(C3);

            } else if (Cubo3C3H.getText().equals("Blanco")) {
                C3 = Blanco;
                Cubo3C3G1.setText("B");
                Cubo3C3G1.setBackground(C3);

            } else if (Cubo3C3H.getText().equals("Verde")) {
                C3 = Verde;
                Cubo3C3G1.setText("V");
                Cubo3C3G1.setBackground(C3);

            } else if (Cubo3C3H.getText().equals("Amarillo")) {
                C3 = Amarillo;
                Cubo3C3G1.setText("A");
                Cubo3C3G1.setBackground(C3);

            }

            C4 = null;
            if (Cubo3C4H.getText().equals("Rojo")) {
                C4 = Rojo;
                Cubo3C4G1.setText("R");
                Cubo3C4G1.setBackground(C4);

            } else if (Cubo3C4H.getText().equals("Blanco")) {
                C4 = Blanco;
                Cubo3C4G1.setText("B");
                Cubo3C4G1.setBackground(C4);

            } else if (Cubo3C4H.getText().equals("Verde")) {
                C4 = Verde;
                Cubo3C4G1.setText("V");
                Cubo3C4G1.setBackground(C4);

            } else if (Cubo3C4H.getText().equals("Amarillo")) {
                C4 = Amarillo;
                Cubo3C4G1.setText("A");
                Cubo3C4G1.setBackground(C4);

            }

            C5 = null;
            if (Cubo3C5H.getText().equals("Rojo")) {
                C5 = Rojo;
                Cubo3C5G1.setText("R");
                Cubo3C5G1.setBackground(C5);

            } else if (Cubo3C5H.getText().equals("Blanco")) {
                C5 = Blanco;
                Cubo3C5G1.setText("B");
                Cubo3C5G1.setBackground(C5);

            } else if (Cubo3C5H.getText().equals("Verde")) {
                C5 = Verde;
                Cubo3C5G1.setText("V");
                Cubo3C5G1.setBackground(C5);

            } else if (Cubo3C5H.getText().equals("Amarillo")) {
                C5 = Amarillo;
                Cubo3C5G1.setText("A");
                Cubo3C5G1.setBackground(C5);

            }

            C6 = null;
            if (Cubo3C6H.getText().equals("Rojo")) {
                C6 = Rojo;
                Cubo3C6G1.setText("R");
                Cubo3C6G1.setBackground(C6);

            } else if (Cubo3C6H.getText().equals("Blanco")) {
                C6 = Blanco;
                Cubo3C6G1.setText("B");
                Cubo3C6G1.setBackground(C6);

            } else if (Cubo3C6H.getText().equals("Verde")) {
                C6 = Verde;
                Cubo3C6G1.setText("V");
                Cubo3C6G1.setBackground(C6);

            } else if (Cubo3C6H.getText().equals("Amarillo")) {
                C6 = Amarillo;
                Cubo3C6G1.setText("A");
                Cubo3C6G1.setBackground(C6);

            }

            //Cubo 4
            C1 = null;
            if (Cubo4C1H.getText().equals("Rojo")) {
                C1 = Rojo;
                Cubo4C1G1.setText("R");
                Cubo4C1G1.setBackground(C1);

            } else if (Cubo4C1H.getText().equals("Blanco")) {
                C1 = Blanco;
                Cubo4C1G1.setText("B");
                Cubo4C1G1.setBackground(C1);

            } else if (Cubo4C1H.getText().equals("Verde")) {
                C1 = Verde;
                Cubo4C1G1.setText("V");
                Cubo4C1G1.setBackground(C1);

            } else if (Cubo4C1H.getText().equals("Amarillo")) {
                C1 = Amarillo;
                Cubo4C1G1.setText("A");
                Cubo4C1G1.setBackground(C1);

            }

            C2 = null;
            if (Cubo4C2H.getText().equals("Rojo")) {
                C2 = Rojo;
                Cubo4C2G1.setText("R");
                Cubo4C2G1.setBackground(C2);

            } else if (Cubo4C2H.getText().equals("Blanco")) {
                C2 = Blanco;
                Cubo4C2G1.setText("B");
                Cubo4C2G1.setBackground(C2);

            } else if (Cubo4C2H.getText().equals("Verde")) {
                C2 = Verde;
                Cubo4C2G1.setText("V");
                Cubo4C2G1.setBackground(C2);

            } else if (Cubo4C2H.getText().equals("Amarillo")) {
                C2 = Amarillo;
                Cubo4C2G1.setText("A");
                Cubo4C2G1.setBackground(C2);

            }

            C3 = null;
            if (Cubo4C3H.getText().equals("Rojo")) {
                C3 = Rojo;
                Cubo4C3G1.setText("R");
                Cubo4C3G1.setBackground(C3);

            } else if (Cubo4C3H.getText().equals("Blanco")) {
                C3 = Blanco;
                Cubo4C3G1.setText("B");
                Cubo4C3G1.setBackground(C3);

            } else if (Cubo4C3H.getText().equals("Verde")) {
                C3 = Verde;
                Cubo4C3G1.setText("V");
                Cubo4C3G1.setBackground(C3);

            } else if (Cubo4C3H.getText().equals("Amarillo")) {
                C3 = Amarillo;
                Cubo4C3G1.setText("A");
                Cubo4C3G1.setBackground(C3);

            }

            C4 = null;
            if (Cubo4C4H.getText().equals("Rojo")) {
                C4 = Rojo;
                Cubo4C4G1.setText("R");
                Cubo4C4G1.setBackground(C4);

            } else if (Cubo4C4H.getText().equals("Blanco")) {
                C4 = Blanco;
                Cubo4C4G1.setText("B");
                Cubo4C4G1.setBackground(C4);

            } else if (Cubo4C4H.getText().equals("Verde")) {
                C4 = Verde;
                Cubo4C4G1.setText("V");
                Cubo4C4G1.setBackground(C4);

            } else if (Cubo4C4H.getText().equals("Amarillo")) {
                C4 = Amarillo;
                Cubo4C4G1.setText("A");
                Cubo4C4G1.setBackground(C4);

            }

            C5 = null;
            if (Cubo4C5H.getText().equals("Rojo")) {
                C5 = Rojo;
                Cubo4C5G1.setText("R");
                Cubo4C5G1.setBackground(C5);

            } else if (Cubo4C5H.getText().equals("Blanco")) {
                C5 = Blanco;
                Cubo4C5G1.setText("B");
                Cubo4C5G1.setBackground(C5);

            } else if (Cubo4C5H.getText().equals("Verde")) {
                C5 = Verde;
                Cubo4C5G1.setText("V");
                Cubo4C5G1.setBackground(C5);

            } else if (Cubo4C5H.getText().equals("Amarillo")) {
                C5 = Amarillo;
                Cubo4C5G1.setText("A");
                Cubo4C5G1.setBackground(C5);

            }

            C6 = null;
            if (Cubo4C6H.getText().equals("Rojo")) {
                C6 = Rojo;
                Cubo4C6G1.setText("R");
                Cubo4C6G1.setBackground(C6);

            } else if (Cubo4C6H.getText().equals("Blanco")) {
                C6 = Blanco;
                Cubo4C6G1.setText("B");
                Cubo4C6G1.setBackground(C6);

            } else if (Cubo4C6H.getText().equals("Verde")) {
                C6 = Verde;
                Cubo4C6G1.setText("V");
                Cubo4C6G1.setBackground(C6);

            } else if (Cubo4C6H.getText().equals("Amarillo")) {
                C6 = Amarillo;
                Cubo4C6G1.setText("A");
                Cubo4C6G1.setBackground(C6);

            }

            fondo.repaint();
            ;
        }
    }//GEN-LAST:event_noPartidaActionPerformed

    private void borrarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarHistorialActionPerformed
        // TODO add your handling code here:
        Object[] options = {"Sí",
            "No"};
        int yes = JOptionPane.showOptionDialog(null,
                "Esto borrará el registro de todas las\n"
                + "partidas, esta acción NO ES REVERSIBLE.\n"
                + "Deseas continuar?",
                "Borrar Registros",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (JOptionPane.YES_OPTION == yes) {
            borrarPartidas();

        } else {

        }
    }//GEN-LAST:event_borrarHistorialActionPerformed

    private void solucionPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solucionPostActionPerformed
        // TODO add your handling code here:
        if (solucionAplicada == (partidas.get(iPartida - 1).soluciones.size() - 2)) {
            System.out.println("Esta es la última solución");
        } else {
            solucionAplicada += 2;
            aplicarSolucion();
            actualTorre();
        }

    }//GEN-LAST:event_solucionPostActionPerformed

    private void solucionPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solucionPrevActionPerformed
        // TODO add your handling code here:
        if (solucionAplicada == 0) {
            System.out.println("Esta es la primera solución");
        } else {
            solucionAplicada -= 2;
            aplicarSolucion();
            actualTorre();
        }
    }//GEN-LAST:event_solucionPrevActionPerformed

    public void aplicarSolucion() {

        // Cubo 1
        String Cubo1arista1I = Cubo1.C1I;
        String Cubo1arista1F = Cubo1.C2I;

        String Cubo1arista2I = Cubo1.C3I;
        String Cubo1arista2F = Cubo1.C4I;

        String Cubo1arista3I = Cubo1.C5I;
        String Cubo1arista3F = Cubo1.C6I;

        // Cubo 2
        String Cubo2arista1I = Cubo2.C1I;
        String Cubo2arista1F = Cubo2.C2I;

        String Cubo2arista2I = Cubo2.C3I;
        String Cubo2arista2F = Cubo2.C4I;

        String Cubo2arista3I = Cubo2.C5I;
        String Cubo2arista3F = Cubo2.C6I;

        // Cubo 3
        String Cubo3arista1I = Cubo3.C1I;
        String Cubo3arista1F = Cubo3.C2I;

        String Cubo3arista2I = Cubo3.C3I;
        String Cubo3arista2F = Cubo3.C4I;

        String Cubo3arista3I = Cubo3.C5I;
        String Cubo3arista3F = Cubo3.C6I;

        // Cubo 4
        String Cubo4arista1I = Cubo4.C1I;
        String Cubo4arista1F = Cubo4.C2I;

        String Cubo4arista2I = Cubo4.C3I;
        String Cubo4arista2F = Cubo4.C4I;

        String Cubo4arista3I = Cubo4.C5I;
        String Cubo4arista3F = Cubo4.C6I;

        // Ordenar posiciones de las caras
        boolean condicion1 = (!partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI)
                && !partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI)
                && !partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI))
                //
                && (!partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI)
                && !partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI))
                //
                && !partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI);

        boolean condicion2 = (!partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF)
                && !partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF)
                && !partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF))
                //
                && (!partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF)
                && !partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF))
                //
                && !partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF);

        boolean condicion3 = (!partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI)
                && !partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI)
                && !partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI))
                //
                && (!partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI)
                && !partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI))
                //
                && !partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI);

        boolean condicion4 = (!partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF)
                && !partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF)
                && !partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF))
                //
                && (!partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF)
                && !partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF))
                //
                && !partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF.equals(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF);

        if (condicion1 && condicion2 && condicion3 && condicion4) {
            System.out.println("Posición correcta");

            // Asignar los colores a los cubos del juego
            // CUBO 1
            // Cara Frontal y Trasera (NO ES RELEVANTE)
            if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF).equals(Cubo1arista1I + Cubo1arista1F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF).equals(Cubo1arista1I + Cubo1arista1F)) {
                Cubo1C1J.setText(Cubo1arista1I);
                Cubo1C2J.setText(Cubo1arista1F);
            } else if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF).equals(Cubo1arista2I + Cubo1arista2F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF).equals(Cubo1arista2I + Cubo1arista2F)) {
                Cubo1C1J.setText(Cubo1arista2I);
                Cubo1C2J.setText(Cubo1arista2F);
            } else if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF).equals(Cubo1arista3I + Cubo1arista3F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF).equals(Cubo1arista3I + Cubo1arista3F)) {
                Cubo1C1J.setText(Cubo1arista3I);
                Cubo1C2J.setText(Cubo1arista3F);
            }

            // Cara Frontal
            if (Cubo1C1J.getText().equals("R")) {
                Cubo1C1J.setBackground(Rojo);
            } else if (Cubo1C1J.getText().equals("B")) {
                Cubo1C1J.setBackground(Blanco);
            } else if (Cubo1C1J.getText().equals("V")) {
                Cubo1C1J.setBackground(Verde);
            } else if (Cubo1C1J.getText().equals("A")) {
                Cubo1C1J.setBackground(Amarillo);
            }
            // Cara Trasera
            if (Cubo1C2J.getText().equals("R")) {
                Cubo1C2J.setBackground(Rojo);
            } else if (Cubo1C2J.getText().equals("B")) {
                Cubo1C2J.setBackground(Blanco);
            } else if (Cubo1C2J.getText().equals("V")) {
                Cubo1C2J.setBackground(Verde);
            } else if (Cubo1C2J.getText().equals("A")) {
                Cubo1C2J.setBackground(Amarillo);
            }

            // Otras Caras
            // Cara izquierda
            Cubo1C6J.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI);
            Cubo1C6E.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI);

            if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI.equals("R")) {
                Cubo1C6J.setBackground(Rojo);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI.equals("B")) {
                Cubo1C6J.setBackground(Blanco);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI.equals("V")) {
                Cubo1C6J.setBackground(Verde);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI.equals("A")) {
                Cubo1C6J.setBackground(Amarillo);
            }

            // Cara derecha
            Cubo1C5J.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF);
            Cubo1C5E.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF);
            if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF.equals("R")) {
                Cubo1C5J.setBackground(Rojo);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF.equals("B")) {
                Cubo1C5J.setBackground(Blanco);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF.equals("V")) {
                Cubo1C5J.setBackground(Verde);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF.equals("A")) {
                Cubo1C5J.setBackground(Amarillo);
            }

            // Cara superior
            Cubo1C3J.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI);
            Cubo1C3E.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI);

            if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI.equals("R")) {
                Cubo1C3J.setBackground(Rojo);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI.equals("B")) {
                Cubo1C3J.setBackground(Blanco);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI.equals("V")) {
                Cubo1C3J.setBackground(Verde);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI.equals("A")) {
                Cubo1C3J.setBackground(Amarillo);
            }

            // Cara inferior
            Cubo1C4J.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF);
            Cubo1C4E.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF);

            if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF.equals("R")) {
                Cubo1C4J.setBackground(Rojo);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF.equals("B")) {
                Cubo1C4J.setBackground(Blanco);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF.equals("V")) {
                Cubo1C4J.setBackground(Verde);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF.equals("A")) {
                Cubo1C4J.setBackground(Amarillo);
            }

            // CUBO 2
            // Cara Frontal y Trasera (NO ES RELEVANTE)
            if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF).equals(Cubo2arista1I + Cubo2arista1F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF).equals(Cubo2arista1I + Cubo2arista1F)) {
                Cubo2C1J.setText(Cubo2arista1I);
                Cubo2C2J.setText(Cubo2arista1F);
            } else if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF).equals(Cubo2arista2I + Cubo2arista2F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF).equals(Cubo2arista2I + Cubo2arista2F)) {
                Cubo2C1J.setText(Cubo2arista2I);
                Cubo2C2J.setText(Cubo2arista2F);
            } else if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF).equals(Cubo2arista3I + Cubo2arista3F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF).equals(Cubo2arista3I + Cubo2arista3F)) {
                Cubo2C1J.setText(Cubo2arista3I);
                Cubo2C2J.setText(Cubo2arista3F);
            }

            // Cara Frontal
            if (Cubo2C1J.getText().equals("R")) {
                Cubo2C1J.setBackground(Rojo);
            } else if (Cubo2C1J.getText().equals("B")) {
                Cubo2C1J.setBackground(Blanco);
            } else if (Cubo2C1J.getText().equals("V")) {
                Cubo2C1J.setBackground(Verde);
            } else if (Cubo2C1J.getText().equals("A")) {
                Cubo2C1J.setBackground(Amarillo);
            }
            // Cara Trasera
            if (Cubo2C2J.getText().equals("R")) {
                Cubo2C2J.setBackground(Rojo);
            } else if (Cubo2C2J.getText().equals("B")) {
                Cubo2C2J.setBackground(Blanco);
            } else if (Cubo2C2J.getText().equals("V")) {
                Cubo2C2J.setBackground(Verde);
            } else if (Cubo2C2J.getText().equals("A")) {
                Cubo2C2J.setBackground(Amarillo);
            }

            // Cara izquierda
            Cubo2C6J.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI);
            Cubo2C6E.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI);

            if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI.equals("R")) {
                Cubo2C6J.setBackground(Rojo);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI.equals("B")) {
                Cubo2C6J.setBackground(Blanco);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI.equals("V")) {
                Cubo2C6J.setBackground(Verde);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI.equals("A")) {
                Cubo2C6J.setBackground(Amarillo);
            }

            // Cara derecha
            Cubo2C5J.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF);
            Cubo2C5E.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF);
            if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF.equals("R")) {
                Cubo2C5J.setBackground(Rojo);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF.equals("B")) {
                Cubo2C5J.setBackground(Blanco);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF.equals("V")) {
                Cubo2C5J.setBackground(Verde);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF.equals("A")) {
                Cubo2C5J.setBackground(Amarillo);
            }

            // Cara superior
            Cubo2C3J.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI);
            Cubo2C3E.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI);

            if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI.equals("R")) {
                Cubo2C3J.setBackground(Rojo);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI.equals("B")) {
                Cubo2C3J.setBackground(Blanco);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI.equals("V")) {
                Cubo2C3J.setBackground(Verde);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI.equals("A")) {
                Cubo2C3J.setBackground(Amarillo);
            }

            // Cara inferior
            Cubo2C4J.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF);
            Cubo2C4E.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF);

            if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF.equals("R")) {
                Cubo2C4J.setBackground(Rojo);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF.equals("B")) {
                Cubo2C4J.setBackground(Blanco);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF.equals("V")) {
                Cubo2C4J.setBackground(Verde);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF.equals("A")) {
                Cubo2C4J.setBackground(Amarillo);
            }

            // CUBO 3
            // Cara Frontal y Trasera (NO ES RELEVANTE)
            if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF).equals(Cubo3arista1I + Cubo3arista1F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF).equals(Cubo3arista1I + Cubo3arista1F)) {
                Cubo3C1J.setText(Cubo3arista1I);
                Cubo3C2J.setText(Cubo3arista1F);
            } else if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF).equals(Cubo3arista2I + Cubo3arista2F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF).equals(Cubo3arista2I + Cubo3arista2F)) {
                Cubo3C1J.setText(Cubo3arista2I);
                Cubo3C2J.setText(Cubo3arista2F);
            } else if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF).equals(Cubo3arista3I + Cubo3arista3F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF).equals(Cubo3arista3I + Cubo3arista3F)) {
                Cubo3C1J.setText(Cubo3arista3I);
                Cubo3C2J.setText(Cubo3arista3F);
            }

            // Cara Frontal
            if (Cubo3C1J.getText().equals("R")) {
                Cubo3C1J.setBackground(Rojo);
            } else if (Cubo3C1J.getText().equals("B")) {
                Cubo3C1J.setBackground(Blanco);
            } else if (Cubo3C1J.getText().equals("V")) {
                Cubo3C1J.setBackground(Verde);
            } else if (Cubo3C1J.getText().equals("A")) {
                Cubo3C1J.setBackground(Amarillo);
            }
            // Cara Trasera
            if (Cubo3C2J.getText().equals("R")) {
                Cubo3C2J.setBackground(Rojo);
            } else if (Cubo3C2J.getText().equals("B")) {
                Cubo3C2J.setBackground(Blanco);
            } else if (Cubo3C2J.getText().equals("V")) {
                Cubo3C2J.setBackground(Verde);
            } else if (Cubo3C2J.getText().equals("A")) {
                Cubo3C2J.setBackground(Amarillo);
            }

            // Cara izquierda
            Cubo3C6J.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI);
            Cubo3C6E.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI);

            if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI.equals("R")) {
                Cubo3C6J.setBackground(Rojo);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI.equals("B")) {
                Cubo3C6J.setBackground(Blanco);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI.equals("V")) {
                Cubo3C6J.setBackground(Verde);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI.equals("A")) {
                Cubo3C6J.setBackground(Amarillo);
            }

            // Cara derecha
            Cubo3C5J.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF);
            Cubo3C5E.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF);
            if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF.equals("R")) {
                Cubo3C5J.setBackground(Rojo);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF.equals("B")) {
                Cubo3C5J.setBackground(Blanco);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF.equals("V")) {
                Cubo3C5J.setBackground(Verde);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF.equals("A")) {
                Cubo3C5J.setBackground(Amarillo);
            }

            // Cara superior
            Cubo3C3J.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI);
            Cubo3C3E.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI);

            if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI.equals("R")) {
                Cubo3C3J.setBackground(Rojo);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI.equals("B")) {
                Cubo3C3J.setBackground(Blanco);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI.equals("V")) {
                Cubo3C3J.setBackground(Verde);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI.equals("A")) {
                Cubo3C3J.setBackground(Amarillo);
            }

            // Cara inferior
            Cubo3C4J.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF);
            Cubo3C4E.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF);

            if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF.equals("R")) {
                Cubo3C4J.setBackground(Rojo);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF.equals("B")) {
                Cubo3C4J.setBackground(Blanco);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF.equals("V")) {
                Cubo3C4J.setBackground(Verde);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF.equals("A")) {
                Cubo3C4J.setBackground(Amarillo);
            }

            // CUBO 4
            // Cara Frontal y Trasera (NO ES RELEVANTE)
            if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF).equals(Cubo4arista1I + Cubo4arista1F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF).equals(Cubo4arista1I + Cubo4arista1F)) {
                Cubo4C1J.setText(Cubo4arista1I);
                Cubo4C2J.setText(Cubo4arista1F);
            } else if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF).equals(Cubo4arista2I + Cubo4arista2F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF).equals(Cubo4arista2I + Cubo4arista2F)) {
                Cubo4C1J.setText(Cubo4arista2I);
                Cubo4C2J.setText(Cubo4arista2F);
            } else if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF).equals(Cubo4arista3I + Cubo4arista3F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF).equals(Cubo4arista3I + Cubo4arista3F)) {
                Cubo4C1J.setText(Cubo4arista3I);
                Cubo4C2J.setText(Cubo4arista3F);
            }

            // Cara Frontal
            if (Cubo4C1J.getText().equals("R")) {
                Cubo4C1J.setBackground(Rojo);
            } else if (Cubo4C1J.getText().equals("B")) {
                Cubo4C1J.setBackground(Blanco);
            } else if (Cubo4C1J.getText().equals("V")) {
                Cubo4C1J.setBackground(Verde);
            } else if (Cubo4C1J.getText().equals("A")) {
                Cubo4C1J.setBackground(Amarillo);
            }
            // Cara Trasera
            if (Cubo4C2J.getText().equals("R")) {
                Cubo4C2J.setBackground(Rojo);
            } else if (Cubo4C2J.getText().equals("B")) {
                Cubo4C2J.setBackground(Blanco);
            } else if (Cubo4C2J.getText().equals("V")) {
                Cubo4C2J.setBackground(Verde);
            } else if (Cubo4C2J.getText().equals("A")) {
                Cubo4C2J.setBackground(Amarillo);
            }

            // Cara izquierda
            Cubo4C6J.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI);
            Cubo4C6E.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI);

            if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI.equals("R")) {
                Cubo4C6J.setBackground(Rojo);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI.equals("B")) {
                Cubo4C6J.setBackground(Blanco);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI.equals("V")) {
                Cubo4C6J.setBackground(Verde);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI.equals("A")) {
                Cubo4C6J.setBackground(Amarillo);
            }

            // Cara derecha
            Cubo4C5J.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF);
            Cubo4C5E.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF);
            if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF.equals("R")) {
                Cubo4C5J.setBackground(Rojo);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF.equals("B")) {
                Cubo4C5J.setBackground(Blanco);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF.equals("V")) {
                Cubo4C5J.setBackground(Verde);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF.equals("A")) {
                Cubo4C5J.setBackground(Amarillo);
            }

            // Cara superior
            Cubo4C3J.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI);
            Cubo4C3E.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI);

            if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI.equals("R")) {
                Cubo4C3J.setBackground(Rojo);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI.equals("B")) {
                Cubo4C3J.setBackground(Blanco);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI.equals("V")) {
                Cubo4C3J.setBackground(Verde);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI.equals("A")) {
                Cubo4C3J.setBackground(Amarillo);
            }

            // Cara inferior
            Cubo4C4J.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF);
            Cubo4C4E.setText(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF);

            if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF.equals("R")) {
                Cubo4C4J.setBackground(Rojo);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF.equals("B")) {
                Cubo4C4J.setBackground(Blanco);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF.equals("V")) {
                Cubo4C4J.setBackground(Verde);
            } else if (partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF.equals("A")) {
                Cubo4C4J.setBackground(Amarillo);
            }

            System.out.println("Aristas restantes: ");
            System.out.println("Cubo 1: " + Cubo1C1J.getText() + "-" + Cubo1C2J.getText());
            System.out.println("Cubo 2: " + Cubo2C1J.getText() + "-" + Cubo2C2J.getText());
            System.out.println("Cubo 3: " + Cubo3C1J.getText() + "-" + Cubo3C2J.getText());
            System.out.println("Cubo 4: " + Cubo4C1J.getText() + "-" + Cubo4C2J.getText());

            noSoluciones.setText(((solucionAplicada / 2) + 1) + " / " + (partidas.get(iPartida - 1).soluciones.size() / 2));
            ;

        } else {

            // Ordenar Horizontales
            String[] caraIzquierda = {partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI};
            String[] caraDerecha = {partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF};
            String[] caraSuperior = {partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI};
            String[] caraInferior = {partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF};

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

                caraIzquierda = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI};
                caraDerecha = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF};

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

                caraIzquierda = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI};
                caraDerecha = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF};

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

                caraIzquierda = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI};
                caraDerecha = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF};

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

                caraIzquierda = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI};
                caraDerecha = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF};

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

                caraIzquierda = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI};
                caraDerecha = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF};

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

                caraIzquierda = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI};
                caraDerecha = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF};

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

                caraIzquierda = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI};
                caraDerecha = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF};

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

                caraIzquierda = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI};
                caraDerecha = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF};

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

                caraIzquierda = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI};
                caraDerecha = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF};

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

                caraIzquierda = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI};
                caraDerecha = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF};

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

                caraIzquierda = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI};
                caraDerecha = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF};

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

                caraIzquierda = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI};
                caraDerecha = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF};

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

                caraIzquierda = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI};
                caraDerecha = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF};

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

                caraSuperior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI};
                caraInferior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF};

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

                caraSuperior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI};
                caraInferior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF};

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

                caraSuperior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI};
                caraInferior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF};

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

                caraSuperior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI};
                caraInferior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF};

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

                caraSuperior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI};
                caraInferior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF};

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

                caraSuperior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI};
                caraInferior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF};

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

                caraSuperior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI};
                caraInferior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF};

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

                caraSuperior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI};
                caraInferior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF};

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

                caraSuperior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI};
                caraInferior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF};

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

                caraSuperior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI};
                caraInferior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF};

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

                caraSuperior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI};
                caraInferior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF};

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

                caraSuperior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI};
                caraInferior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF};

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

                caraSuperior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI};
                caraInferior = new String[]{partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF, partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF};

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
            if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF).equals(Cubo1arista1I + Cubo1arista1F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF).equals(Cubo1arista1I + Cubo1arista1F)) {
                Cubo1C1J.setText(Cubo1arista1I);
                Cubo1C2J.setText(Cubo1arista1F);
            } else if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF).equals(Cubo1arista2I + Cubo1arista2F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF).equals(Cubo1arista2I + Cubo1arista2F)) {
                Cubo1C1J.setText(Cubo1arista2I);
                Cubo1C2J.setText(Cubo1arista2F);
            } else if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo1aristaF).equals(Cubo1arista3I + Cubo1arista3F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo1aristaF).equals(Cubo1arista3I + Cubo1arista3F)) {
                Cubo1C1J.setText(Cubo1arista3I);
                Cubo1C2J.setText(Cubo1arista3F);
            }

            System.out.println("Aristas restantes: ");
            System.out.println("Cubo 1: " + Cubo1C1J.getText() + "-" + Cubo1C2J.getText());

            // Cara Frontal
            if (Cubo1C1J.getText().equals("R")) {
                Cubo1C1J.setBackground(Rojo);
            } else if (Cubo1C1J.getText().equals("B")) {
                Cubo1C1J.setBackground(Blanco);
            } else if (Cubo1C1J.getText().equals("V")) {
                Cubo1C1J.setBackground(Verde);
            } else if (Cubo1C1J.getText().equals("A")) {
                Cubo1C1J.setBackground(Amarillo);
            }
            // Cara Trasera
            if (Cubo1C2J.getText().equals("R")) {
                Cubo1C2J.setBackground(Rojo);
            } else if (Cubo1C2J.getText().equals("B")) {
                Cubo1C2J.setBackground(Blanco);
            } else if (Cubo1C2J.getText().equals("V")) {
                Cubo1C2J.setBackground(Verde);
            } else if (Cubo1C2J.getText().equals("A")) {
                Cubo1C2J.setBackground(Amarillo);
            }

            // Cara izquierda
            Cubo1C6J.setText(Cubo1Cara6);
            Cubo1C6E.setText(Cubo1Cara6);

            if (Cubo1Cara6.equals("R")) {
                Cubo1C6J.setBackground(Rojo);
            } else if (Cubo1Cara6.equals("B")) {
                Cubo1C6J.setBackground(Blanco);
            } else if (Cubo1Cara6.equals("V")) {
                Cubo1C6J.setBackground(Verde);
            } else if (Cubo1Cara6.equals("A")) {
                Cubo1C6J.setBackground(Amarillo);
            }

            // Cara derecha
            Cubo1C5J.setText(Cubo1Cara5);
            Cubo1C5E.setText(Cubo1Cara5);
            if (Cubo1Cara5.equals("R")) {
                Cubo1C5J.setBackground(Rojo);
            } else if (Cubo1Cara5.equals("B")) {
                Cubo1C5J.setBackground(Blanco);
            } else if (Cubo1Cara5.equals("V")) {
                Cubo1C5J.setBackground(Verde);
            } else if (Cubo1Cara5.equals("A")) {
                Cubo1C5J.setBackground(Amarillo);
            }

            // Cara superior
            Cubo1C3J.setText(Cubo1Cara3);
            Cubo1C3E.setText(Cubo1Cara3);

            if (Cubo1Cara3.equals("R")) {
                Cubo1C3J.setBackground(Rojo);
            } else if (Cubo1Cara3.equals("B")) {
                Cubo1C3J.setBackground(Blanco);
            } else if (Cubo1Cara3.equals("V")) {
                Cubo1C3J.setBackground(Verde);
            } else if (Cubo1Cara3.equals("A")) {
                Cubo1C3J.setBackground(Amarillo);
            }

            // Cara inferior
            Cubo1C4J.setText(Cubo1Cara4);
            Cubo1C4E.setText(Cubo1Cara4);

            if (Cubo1Cara4.equals("R")) {
                Cubo1C4J.setBackground(Rojo);
            } else if (Cubo1Cara4.equals("B")) {
                Cubo1C4J.setBackground(Blanco);
            } else if (Cubo1Cara4.equals("V")) {
                Cubo1C4J.setBackground(Verde);
            } else if (Cubo1Cara4.equals("A")) {
                Cubo1C4J.setBackground(Amarillo);
            }

            // CUBO 2
            // Cara Frontal y Trasera (NO ES RELEVANTE)
            if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF).equals(Cubo2arista1I + Cubo2arista1F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF).equals(Cubo2arista1I + Cubo2arista1F)) {
                Cubo2C1J.setText(Cubo2arista1I);
                Cubo2C2J.setText(Cubo2arista1F);
            } else if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF).equals(Cubo2arista2I + Cubo2arista2F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF).equals(Cubo2arista2I + Cubo2arista2F)) {
                Cubo2C1J.setText(Cubo2arista2I);
                Cubo2C2J.setText(Cubo2arista2F);
            } else if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo2aristaF).equals(Cubo2arista3I + Cubo2arista3F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo2aristaF).equals(Cubo2arista3I + Cubo2arista3F)) {
                Cubo2C1J.setText(Cubo2arista3I);
                Cubo2C2J.setText(Cubo2arista3F);
            }

            System.out.println("Cubo 2: " + Cubo2C1J.getText() + "-" + Cubo2C2J.getText());

            // Cara Frontal
            if (Cubo2C1J.getText().equals("R")) {
                Cubo2C1J.setBackground(Rojo);
            } else if (Cubo2C1J.getText().equals("B")) {
                Cubo2C1J.setBackground(Blanco);
            } else if (Cubo2C1J.getText().equals("V")) {
                Cubo2C1J.setBackground(Verde);
            } else if (Cubo2C1J.getText().equals("A")) {
                Cubo2C1J.setBackground(Amarillo);
            }
            // Cara Trasera
            if (Cubo2C2J.getText().equals("R")) {
                Cubo2C2J.setBackground(Rojo);
            } else if (Cubo2C2J.getText().equals("B")) {
                Cubo2C2J.setBackground(Blanco);
            } else if (Cubo2C2J.getText().equals("V")) {
                Cubo2C2J.setBackground(Verde);
            } else if (Cubo2C2J.getText().equals("A")) {
                Cubo2C2J.setBackground(Amarillo);
            }

            // Cara izquierda
            Cubo2C6J.setText(Cubo2Cara6);
            Cubo2C6E.setText(Cubo2Cara6);

            if (Cubo2Cara6.equals("R")) {
                Cubo2C6J.setBackground(Rojo);
            } else if (Cubo2Cara6.equals("B")) {
                Cubo2C6J.setBackground(Blanco);
            } else if (Cubo2Cara6.equals("V")) {
                Cubo2C6J.setBackground(Verde);
            } else if (Cubo2Cara6.equals("A")) {
                Cubo2C6J.setBackground(Amarillo);
            }

            // Cara derecha
            Cubo2C5J.setText(Cubo2Cara5);
            Cubo2C5E.setText(Cubo2Cara5);

            if (Cubo2Cara5.equals("R")) {
                Cubo2C5J.setBackground(Rojo);
            } else if (Cubo2Cara5.equals("B")) {
                Cubo2C5J.setBackground(Blanco);
            } else if (Cubo2Cara5.equals("V")) {
                Cubo2C5J.setBackground(Verde);
            } else if (Cubo2Cara5.equals("A")) {
                Cubo2C5J.setBackground(Amarillo);
            }

            // Cara superior
            Cubo2C3J.setText(Cubo2Cara3);
            Cubo2C3E.setText(Cubo2Cara3);

            if (Cubo2Cara3.equals("R")) {
                Cubo2C3J.setBackground(Rojo);
            } else if (Cubo2Cara3.equals("B")) {
                Cubo2C3J.setBackground(Blanco);
            } else if (Cubo2Cara3.equals("V")) {
                Cubo2C3J.setBackground(Verde);
            } else if (Cubo2Cara3.equals("A")) {
                Cubo2C3J.setBackground(Amarillo);
            }

            // Cara inferior
            Cubo2C4J.setText(Cubo2Cara4);
            Cubo2C4E.setText(Cubo2Cara4);

            if (Cubo2Cara4.equals("R")) {
                Cubo2C4J.setBackground(Rojo);
            } else if (Cubo2Cara4.equals("B")) {
                Cubo2C4J.setBackground(Blanco);
            } else if (Cubo2Cara4.equals("V")) {
                Cubo2C4J.setBackground(Verde);
            } else if (Cubo2Cara4.equals("A")) {
                Cubo2C4J.setBackground(Amarillo);
            }

            // CUBO 3
            // Cara Frontal y Trasera (NO ES RELEVANTE)
            if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF).equals(Cubo3arista1I + Cubo3arista1F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF).equals(Cubo3arista1I + Cubo3arista1F)) {
                Cubo3C1J.setText(Cubo3arista1I);
                Cubo3C2J.setText(Cubo3arista1F);
            } else if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF).equals(Cubo3arista2I + Cubo3arista2F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF).equals(Cubo3arista2I + Cubo3arista2F)) {
                Cubo3C1J.setText(Cubo3arista2I);
                Cubo3C2J.setText(Cubo3arista2F);
            } else if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo3aristaF).equals(Cubo3arista3I + Cubo3arista3F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo3aristaF).equals(Cubo3arista3I + Cubo3arista3F)) {
                Cubo3C1J.setText(Cubo3arista3I);
                Cubo3C2J.setText(Cubo3arista3F);
            }

            System.out.println("Cubo 3: " + Cubo3C1J.getText() + "-" + Cubo3C2J.getText());

            // Cara Frontal
            if (Cubo3C1J.getText().equals("R")) {
                Cubo3C1J.setBackground(Rojo);
            } else if (Cubo3C1J.getText().equals("B")) {
                Cubo3C1J.setBackground(Blanco);
            } else if (Cubo3C1J.getText().equals("V")) {
                Cubo3C1J.setBackground(Verde);
            } else if (Cubo3C1J.getText().equals("A")) {
                Cubo3C1J.setBackground(Amarillo);
            }
            // Cara Trasera
            if (Cubo3C2J.getText().equals("R")) {
                Cubo3C2J.setBackground(Rojo);
            } else if (Cubo3C2J.getText().equals("B")) {
                Cubo3C2J.setBackground(Blanco);
            } else if (Cubo3C2J.getText().equals("V")) {
                Cubo3C2J.setBackground(Verde);
            } else if (Cubo3C2J.getText().equals("A")) {
                Cubo3C2J.setBackground(Amarillo);
            }

            // Cara izquierda
            Cubo3C6J.setText(Cubo3Cara6);
            Cubo3C6E.setText(Cubo3Cara6);

            if (Cubo3Cara6.equals("R")) {
                Cubo3C6J.setBackground(Rojo);
            } else if (Cubo3Cara6.equals("B")) {
                Cubo3C6J.setBackground(Blanco);
            } else if (Cubo3Cara6.equals("V")) {
                Cubo3C6J.setBackground(Verde);
            } else if (Cubo3Cara6.equals("A")) {
                Cubo3C6J.setBackground(Amarillo);
            }

            // Cara derecha
            Cubo3C5J.setText(Cubo3Cara5);
            Cubo3C5E.setText(Cubo3Cara5);

            if (Cubo3Cara5.equals("R")) {
                Cubo3C5J.setBackground(Rojo);
            } else if (Cubo3Cara5.equals("B")) {
                Cubo3C5J.setBackground(Blanco);
            } else if (Cubo3Cara5.equals("V")) {
                Cubo3C5J.setBackground(Verde);
            } else if (Cubo3Cara5.equals("A")) {
                Cubo3C5J.setBackground(Amarillo);
            }

            // Cara superior
            Cubo3C3J.setText(Cubo3Cara3);
            Cubo3C3E.setText(Cubo3Cara3);

            if (Cubo3Cara3.equals("R")) {
                Cubo3C3J.setBackground(Rojo);
            } else if (Cubo3Cara3.equals("B")) {
                Cubo3C3J.setBackground(Blanco);
            } else if (Cubo3Cara3.equals("V")) {
                Cubo3C3J.setBackground(Verde);
            } else if (Cubo3Cara3.equals("A")) {
                Cubo3C3J.setBackground(Amarillo);
            }

            // Cara inferior
            Cubo3C4J.setText(Cubo3Cara4);
            Cubo3C4E.setText(Cubo3Cara4);

            if (Cubo3Cara4.equals("R")) {
                Cubo3C4J.setBackground(Rojo);
            } else if (Cubo3Cara4.equals("B")) {
                Cubo3C4J.setBackground(Blanco);
            } else if (Cubo3Cara4.equals("V")) {
                Cubo3C4J.setBackground(Verde);
            } else if (Cubo3Cara4.equals("A")) {
                Cubo3C4J.setBackground(Amarillo);
            }

            // CUBO 4
            // Cara Frontal y Trasera (NO ES RELEVANTE)
            if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF).equals(Cubo4arista1I + Cubo4arista1F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF).equals(Cubo4arista1I + Cubo4arista1F)) {
                Cubo4C1J.setText(Cubo4arista1I);
                Cubo4C2J.setText(Cubo4arista1F);
            } else if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF).equals(Cubo4arista2I + Cubo4arista2F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF).equals(Cubo4arista2I + Cubo4arista2F)) {
                Cubo4C1J.setText(Cubo4arista2I);
                Cubo4C2J.setText(Cubo4arista2F);
            } else if (!(partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada).Cubo4aristaF).equals(Cubo4arista3I + Cubo4arista3F)
                    && !(partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaI + partidas.get(iPartida - 1).soluciones.get(solucionAplicada + 1).Cubo4aristaF).equals(Cubo4arista3I + Cubo4arista3F)) {
                Cubo4C1J.setText(Cubo4arista3I);
                Cubo4C2J.setText(Cubo4arista3F);
            }

            System.out.println("Cubo 4: " + Cubo4C1J.getText() + "-" + Cubo4C2J.getText());

            // Cara Frontal
            if (Cubo4C1J.getText().equals("R")) {
                Cubo4C1J.setBackground(Rojo);
            } else if (Cubo4C1J.getText().equals("B")) {
                Cubo4C1J.setBackground(Blanco);
            } else if (Cubo4C1J.getText().equals("V")) {
                Cubo4C1J.setBackground(Verde);
            } else if (Cubo4C1J.getText().equals("A")) {
                Cubo4C1J.setBackground(Amarillo);
            }
            // Cara Trasera
            if (Cubo4C2J.getText().equals("R")) {
                Cubo4C2J.setBackground(Rojo);
            } else if (Cubo4C2J.getText().equals("B")) {
                Cubo4C2J.setBackground(Blanco);
            } else if (Cubo4C2J.getText().equals("V")) {
                Cubo4C2J.setBackground(Verde);
            } else if (Cubo4C2J.getText().equals("A")) {
                Cubo4C2J.setBackground(Amarillo);
            }

            // Cara izquierda
            Cubo4C6J.setText(Cubo4Cara6);
            Cubo4C6E.setText(Cubo4Cara6);

            if (Cubo4Cara6.equals("R")) {
                Cubo4C6J.setBackground(Rojo);
            } else if (Cubo4Cara6.equals("B")) {
                Cubo4C6J.setBackground(Blanco);
            } else if (Cubo4Cara6.equals("V")) {
                Cubo4C6J.setBackground(Verde);
            } else if (Cubo4Cara6.equals("A")) {
                Cubo4C6J.setBackground(Amarillo);
            }

            // Cara derecha
            Cubo4C5J.setText(Cubo4Cara5);
            Cubo4C5E.setText(Cubo4Cara5);

            if (Cubo4Cara5.equals("R")) {
                Cubo4C5J.setBackground(Rojo);
            } else if (Cubo4Cara5.equals("B")) {
                Cubo4C5J.setBackground(Blanco);
            } else if (Cubo4Cara5.equals("V")) {
                Cubo4C5J.setBackground(Verde);
            } else if (Cubo4Cara5.equals("A")) {
                Cubo4C5J.setBackground(Amarillo);
            }

            // Cara superior
            Cubo4C3J.setText(Cubo4Cara3);
            Cubo4C3E.setText(Cubo4Cara3);

            if (Cubo4Cara3.equals("R")) {
                Cubo4C3J.setBackground(Rojo);
            } else if (Cubo4Cara3.equals("B")) {
                Cubo4C3J.setBackground(Blanco);
            } else if (Cubo4Cara3.equals("V")) {
                Cubo4C3J.setBackground(Verde);
            } else if (Cubo4Cara3.equals("A")) {
                Cubo4C3J.setBackground(Amarillo);
            }

            // Cara inferior
            Cubo4C4J.setText(Cubo4Cara4);
            Cubo4C4E.setText(Cubo4Cara4);

            if (Cubo4Cara4.equals("R")) {
                Cubo4C4J.setBackground(Rojo);
            } else if (Cubo4Cara4.equals("B")) {
                Cubo4C4J.setBackground(Blanco);
            } else if (Cubo4Cara4.equals("V")) {
                Cubo4C4J.setBackground(Verde);
            } else if (Cubo4Cara4.equals("A")) {
                Cubo4C4J.setBackground(Amarillo);
            }

        }
        resueltoLbl.setVisible(true);
        solucionPrev.setVisible(true);
        solucionPost.setVisible(true);
        noSoluciones.setVisible(true);
        noSoluciones.setText(((solucionAplicada / 2) + 1) + " / " + (partidas.get(iPartida - 1).soluciones.size() / 2));
        grafoGL();
        grafoG1();
        grafoG2();
        ;

    }

    public void borrarPartidas() {
        partidas = new ArrayList<>();
        iPartida = 0;
        noPartida.removeAllItems();
        noPartida.repaint();
        reset = true;
        jTabbedPane1.setSelectedIndex(0);
    }

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
    private javax.swing.JLabel Cubo1C1G1;
    private javax.swing.JLabel Cubo1C1H;
    private javax.swing.JLabel Cubo1C1J;
    private javax.swing.JComboBox<String> Cubo1C2;
    private javax.swing.JLabel Cubo1C2G;
    private javax.swing.JLabel Cubo1C2G1;
    private javax.swing.JLabel Cubo1C2H;
    private javax.swing.JLabel Cubo1C2J;
    private javax.swing.JComboBox<String> Cubo1C3;
    private javax.swing.JLabel Cubo1C3E;
    private javax.swing.JLabel Cubo1C3G;
    private javax.swing.JLabel Cubo1C3G1;
    private javax.swing.JLabel Cubo1C3H;
    private javax.swing.JLabel Cubo1C3J;
    private javax.swing.JLabel Cubo1C3T;
    private javax.swing.JComboBox<String> Cubo1C4;
    private javax.swing.JLabel Cubo1C4E;
    private javax.swing.JLabel Cubo1C4G;
    private javax.swing.JLabel Cubo1C4G1;
    private javax.swing.JLabel Cubo1C4H;
    private javax.swing.JLabel Cubo1C4J;
    private javax.swing.JLabel Cubo1C4T;
    private javax.swing.JComboBox<String> Cubo1C5;
    private javax.swing.JLabel Cubo1C5E;
    private javax.swing.JLabel Cubo1C5G;
    private javax.swing.JLabel Cubo1C5G1;
    private javax.swing.JLabel Cubo1C5H;
    private javax.swing.JLabel Cubo1C5J;
    private javax.swing.JLabel Cubo1C5T;
    private javax.swing.JComboBox<String> Cubo1C6;
    private javax.swing.JLabel Cubo1C6E;
    private javax.swing.JLabel Cubo1C6G;
    private javax.swing.JLabel Cubo1C6G1;
    private javax.swing.JLabel Cubo1C6H;
    private javax.swing.JLabel Cubo1C6J;
    private javax.swing.JLabel Cubo1C6T;
    private javax.swing.JLabel Cubo1Lbl;
    private javax.swing.JComboBox<String> Cubo2C1;
    private javax.swing.JLabel Cubo2C1E;
    private javax.swing.JLabel Cubo2C1G;
    private javax.swing.JLabel Cubo2C1G1;
    private javax.swing.JLabel Cubo2C1H;
    private javax.swing.JLabel Cubo2C1J;
    private javax.swing.JComboBox<String> Cubo2C2;
    private javax.swing.JLabel Cubo2C2G;
    private javax.swing.JLabel Cubo2C2G1;
    private javax.swing.JLabel Cubo2C2H;
    private javax.swing.JLabel Cubo2C2J;
    private javax.swing.JComboBox<String> Cubo2C3;
    private javax.swing.JLabel Cubo2C3E;
    private javax.swing.JLabel Cubo2C3G;
    private javax.swing.JLabel Cubo2C3G1;
    private javax.swing.JLabel Cubo2C3H;
    private javax.swing.JLabel Cubo2C3J;
    private javax.swing.JLabel Cubo2C3T;
    private javax.swing.JComboBox<String> Cubo2C4;
    private javax.swing.JLabel Cubo2C4E;
    private javax.swing.JLabel Cubo2C4G;
    private javax.swing.JLabel Cubo2C4G1;
    private javax.swing.JLabel Cubo2C4H;
    private javax.swing.JLabel Cubo2C4J;
    private javax.swing.JLabel Cubo2C4T;
    private javax.swing.JComboBox<String> Cubo2C5;
    private javax.swing.JLabel Cubo2C5E;
    private javax.swing.JLabel Cubo2C5G;
    private javax.swing.JLabel Cubo2C5G1;
    private javax.swing.JLabel Cubo2C5H;
    private javax.swing.JLabel Cubo2C5J;
    private javax.swing.JLabel Cubo2C5T;
    private javax.swing.JComboBox<String> Cubo2C6;
    private javax.swing.JLabel Cubo2C6E;
    private javax.swing.JLabel Cubo2C6G;
    private javax.swing.JLabel Cubo2C6G1;
    private javax.swing.JLabel Cubo2C6H;
    private javax.swing.JLabel Cubo2C6J;
    private javax.swing.JLabel Cubo2C6T;
    private javax.swing.JLabel Cubo2Lbl;
    private javax.swing.JComboBox<String> Cubo3C1;
    private javax.swing.JLabel Cubo3C1E;
    private javax.swing.JLabel Cubo3C1G;
    private javax.swing.JLabel Cubo3C1G1;
    private javax.swing.JLabel Cubo3C1H;
    private javax.swing.JLabel Cubo3C1J;
    private javax.swing.JComboBox<String> Cubo3C2;
    private javax.swing.JLabel Cubo3C2G;
    private javax.swing.JLabel Cubo3C2G1;
    private javax.swing.JLabel Cubo3C2H;
    private javax.swing.JLabel Cubo3C2J;
    private javax.swing.JComboBox<String> Cubo3C3;
    private javax.swing.JLabel Cubo3C3E;
    private javax.swing.JLabel Cubo3C3G;
    private javax.swing.JLabel Cubo3C3G1;
    private javax.swing.JLabel Cubo3C3H;
    private javax.swing.JLabel Cubo3C3J;
    private javax.swing.JLabel Cubo3C3T;
    private javax.swing.JComboBox<String> Cubo3C4;
    private javax.swing.JLabel Cubo3C4E;
    private javax.swing.JLabel Cubo3C4G;
    private javax.swing.JLabel Cubo3C4G1;
    private javax.swing.JLabel Cubo3C4H;
    private javax.swing.JLabel Cubo3C4J;
    private javax.swing.JLabel Cubo3C4T;
    private javax.swing.JComboBox<String> Cubo3C5;
    private javax.swing.JLabel Cubo3C5E;
    private javax.swing.JLabel Cubo3C5G;
    private javax.swing.JLabel Cubo3C5G1;
    private javax.swing.JLabel Cubo3C5H;
    private javax.swing.JLabel Cubo3C5J;
    private javax.swing.JLabel Cubo3C5T;
    private javax.swing.JComboBox<String> Cubo3C6;
    private javax.swing.JLabel Cubo3C6E;
    private javax.swing.JLabel Cubo3C6G;
    private javax.swing.JLabel Cubo3C6G1;
    private javax.swing.JLabel Cubo3C6H;
    private javax.swing.JLabel Cubo3C6J;
    private javax.swing.JLabel Cubo3C6T;
    private javax.swing.JLabel Cubo3Lbl;
    private javax.swing.JComboBox<String> Cubo4C1;
    private javax.swing.JLabel Cubo4C1E;
    private javax.swing.JLabel Cubo4C1G;
    private javax.swing.JLabel Cubo4C1G1;
    private javax.swing.JLabel Cubo4C1H;
    private javax.swing.JLabel Cubo4C1J;
    private javax.swing.JComboBox<String> Cubo4C2;
    private javax.swing.JLabel Cubo4C2G;
    private javax.swing.JLabel Cubo4C2G1;
    private javax.swing.JLabel Cubo4C2H;
    private javax.swing.JLabel Cubo4C2J;
    private javax.swing.JComboBox<String> Cubo4C3;
    private javax.swing.JLabel Cubo4C3E;
    private javax.swing.JLabel Cubo4C3G;
    private javax.swing.JLabel Cubo4C3G1;
    private javax.swing.JLabel Cubo4C3H;
    private javax.swing.JLabel Cubo4C3J;
    private javax.swing.JLabel Cubo4C3T;
    private javax.swing.JComboBox<String> Cubo4C4;
    private javax.swing.JLabel Cubo4C4E;
    private javax.swing.JLabel Cubo4C4G;
    private javax.swing.JLabel Cubo4C4G1;
    private javax.swing.JLabel Cubo4C4H;
    private javax.swing.JLabel Cubo4C4J;
    private javax.swing.JLabel Cubo4C4T;
    private javax.swing.JComboBox<String> Cubo4C5;
    private javax.swing.JLabel Cubo4C5E;
    private javax.swing.JLabel Cubo4C5G;
    private javax.swing.JLabel Cubo4C5G1;
    private javax.swing.JLabel Cubo4C5H;
    private javax.swing.JLabel Cubo4C5J;
    private javax.swing.JLabel Cubo4C5T;
    private javax.swing.JComboBox<String> Cubo4C6;
    private javax.swing.JLabel Cubo4C6E;
    private javax.swing.JLabel Cubo4C6G;
    private javax.swing.JLabel Cubo4C6G1;
    private javax.swing.JLabel Cubo4C6H;
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
    private javax.swing.JButton aplicarBtn;
    private javax.swing.JButton arribaCubo1;
    private javax.swing.JButton arribaCubo2;
    private javax.swing.JButton arribaCubo3;
    private javax.swing.JButton arribaCubo4;
    private javax.swing.JButton borrarHistorial;
    private javax.swing.JLabel checkLbl;
    private javax.swing.JButton derechaCubo1;
    private javax.swing.JButton derechaCubo2;
    private javax.swing.JButton derechaCubo3;
    private javax.swing.JButton derechaCubo4;
    private javax.swing.JLabel existeSolucion;
    private javax.swing.JButton explicacionBtn;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton genAleatorio;
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JButton jugarBtn;
    private javax.swing.JComboBox<String> noPartida;
    private javax.swing.JLabel noSoluciones;
    private javax.swing.JButton resolverBtn;
    private javax.swing.JLabel resueltoLbl;
    private javax.swing.JLabel solucionLbl;
    private javax.swing.JButton solucionPost;
    private javax.swing.JButton solucionPrev;
    // End of variables declaration//GEN-END:variables
}
