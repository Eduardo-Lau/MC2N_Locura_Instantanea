/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locura.instantánea;

import javax.swing.UIManager;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;
import javax.swing.JOptionPane;

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
    public static String binCubosNOut = "C:\\Users\\carlo\\Documents\\NetBeansProjects\\Locura Instantánea\\Binarios\\Cubos.bin";
    public static ObjectOutputStream O_binCubosOut;
    // Cargar
    public static FileInputStream F_binCubosIn;
    public static String binCubosNIn = "C:\\Users\\carlo\\Documents\\NetBeansProjects\\Locura Instantánea\\Binarios\\Cubos.bin";
    public static ObjectInputStream O_binCubosIn;

    boolean sigBtnPressed = false;

    /**
     * Creates new form
     */
    public Locura_Instantánea() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        siguienteBtn = new javax.swing.JButton();
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
        genAleatorio1 = new javax.swing.JButton();
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
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("tánea");
        jLabel1.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Snap ITC", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(136, 29, 60));
        jLabel2.setText("Locu");

        jLabel3.setFont(new java.awt.Font("Snap ITC", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ra  In");

        jLabel4.setFont(new java.awt.Font("Snap ITC", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(45, 160, 106));
        jLabel4.setText("stan");

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

        siguienteBtn.setBackground(new java.awt.Color(147, 157, 255));
        siguienteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        siguienteBtn.setForeground(new java.awt.Color(0, 0, 0));
        siguienteBtn.setText("Siguiente");
        siguienteBtn.setAlignmentX(jTabbedPane1.getAlignmentX());
        siguienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(siguienteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 180, 36));

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

        genAleatorio.setBackground(new java.awt.Color(109, 23, 48));
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

        jTabbedPane1.addTab("Selección de Colores", jPanel1);

        jPanel2.setLayout(null);

        genAleatorio1.setBackground(new java.awt.Color(109, 23, 48));
        genAleatorio1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genAleatorio1.setForeground(new java.awt.Color(255, 255, 255));
        genAleatorio1.setText("Resolver");
        genAleatorio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genAleatorio1ActionPerformed(evt);
            }
        });
        jPanel2.add(genAleatorio1);
        genAleatorio1.setBounds(473, 258, 130, 30);

        Cubo4C3T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C3T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C3T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C3T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C3T.setText("4");
        Cubo4C3T.setOpaque(true);
        jPanel2.add(Cubo4C3T);
        Cubo4C3T.setBounds(290, 357, 50, 50);

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
        arribaCubo1.setBounds(87, 38, 25, 25);

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
        comprobarBtn.setBounds(256, 258, 130, 30);

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
        Cubo1C3T.setBounds(290, 537, 50, 50);

        Cubo2C3T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C3T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C3T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C3T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C3T.setText("2");
        Cubo2C3T.setOpaque(true);
        jPanel2.add(Cubo2C3T);
        Cubo2C3T.setBounds(290, 477, 50, 50);

        Cubo3C3T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C3T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C3T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C3T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C3T.setText("3");
        Cubo3C3T.setOpaque(true);
        jPanel2.add(Cubo3C3T);
        Cubo3C3T.setBounds(290, 417, 50, 50);

        resueltoLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resueltoLbl.setForeground(new java.awt.Color(255, 202, 117));
        resueltoLbl.setText("Resuelto !");
        jPanel2.add(resueltoLbl);
        resueltoLbl.setBounds(400, 330, 80, 20);

        Cubo4C4T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C4T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C4T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C4T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C4T.setText("4");
        Cubo4C4T.setOpaque(true);
        jPanel2.add(Cubo4C4T);
        Cubo4C4T.setBounds(370, 357, 50, 50);

        Cubo3C4T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C4T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C4T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C4T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C4T.setText("3");
        Cubo3C4T.setOpaque(true);
        jPanel2.add(Cubo3C4T);
        Cubo3C4T.setBounds(370, 417, 50, 50);

        Cubo2C4T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C4T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C4T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C4T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C4T.setText("2");
        Cubo2C4T.setOpaque(true);
        jPanel2.add(Cubo2C4T);
        Cubo2C4T.setBounds(370, 477, 50, 50);

        Cubo1C4T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C4T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C4T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C4T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C4T.setText("1");
        Cubo1C4T.setOpaque(true);
        jPanel2.add(Cubo1C4T);
        Cubo1C4T.setBounds(370, 537, 50, 50);

        Cubo4C5T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C5T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C5T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C5T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C5T.setText("4");
        Cubo4C5T.setOpaque(true);
        jPanel2.add(Cubo4C5T);
        Cubo4C5T.setBounds(450, 357, 50, 50);

        Cubo3C5T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C5T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C5T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C5T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C5T.setText("3");
        Cubo3C5T.setOpaque(true);
        jPanel2.add(Cubo3C5T);
        Cubo3C5T.setBounds(450, 417, 50, 50);

        Cubo2C5T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C5T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C5T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C5T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C5T.setText("2");
        Cubo2C5T.setOpaque(true);
        jPanel2.add(Cubo2C5T);
        Cubo2C5T.setBounds(450, 477, 50, 50);

        Cubo1C5T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C5T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C5T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C5T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C5T.setText("1");
        Cubo1C5T.setOpaque(true);
        jPanel2.add(Cubo1C5T);
        Cubo1C5T.setBounds(450, 537, 50, 50);

        Cubo4C6T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo4C6T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo4C6T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo4C6T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo4C6T.setText("4");
        Cubo4C6T.setOpaque(true);
        jPanel2.add(Cubo4C6T);
        Cubo4C6T.setBounds(530, 357, 50, 50);

        Cubo3C6T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo3C6T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo3C6T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo3C6T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo3C6T.setText("3");
        Cubo3C6T.setOpaque(true);
        jPanel2.add(Cubo3C6T);
        Cubo3C6T.setBounds(530, 417, 50, 50);

        Cubo2C6T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo2C6T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo2C6T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo2C6T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo2C6T.setText("2");
        Cubo2C6T.setOpaque(true);
        jPanel2.add(Cubo2C6T);
        Cubo2C6T.setBounds(530, 477, 50, 50);

        Cubo1C6T.setBackground(new java.awt.Color(51, 51, 51));
        Cubo1C6T.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cubo1C6T.setForeground(new java.awt.Color(0, 0, 0));
        Cubo1C6T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cubo1C6T.setText("1");
        Cubo1C6T.setOpaque(true);
        jPanel2.add(Cubo1C6T);
        Cubo1C6T.setBounds(530, 537, 50, 50);

        jLabel18.setText("4)");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(260, 367, 12, 20);

        jLabel19.setText("1)");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(260, 547, 12, 20);

        jLabel20.setText("2)");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(260, 487, 12, 20);

        jLabel27.setText("3)");
        jPanel2.add(jLabel27);
        jLabel27.setBounds(260, 427, 12, 20);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel28.setText("Vistas Laterales de la Torre");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(300, 300, 260, 29);

        jTabbedPane1.addTab("Juego", jPanel2);

        jLabel29.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("By Eduardo Lau");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jLabel4)))
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel29))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(5, 5, 5)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void genCubo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genCubo1ActionPerformed
        // TODO add your handling code here:

        Color C1 = null;
        if (Cubo1C1.getItemAt(Cubo1C1.getSelectedIndex()).equals("Rojo")) {
            C1 = new Color(136, 29, 60);
            Cubo1C1G.setText("R");
            Cubo1.C1I = "R";
            Cubo1C1G.setBackground(C1);

        } else if (Cubo1C1.getItemAt(Cubo1C1.getSelectedIndex()).equals("Blanco")) {
            C1 = new Color(255, 255, 255);
            Cubo1C1G.setText("B");
            Cubo1.C1I = "B";
            Cubo1C1G.setBackground(C1);

        } else if (Cubo1C1.getItemAt(Cubo1C1.getSelectedIndex()).equals("Verde")) {
            C1 = new Color(45, 160, 106);
            Cubo1C1G.setText("V");
            Cubo1.C1I = "V";
            Cubo1C1G.setBackground(C1);

        } else if (Cubo1C1.getItemAt(Cubo1C1.getSelectedIndex()).equals("Amarillo")) {
            C1 = new Color(255, 204, 0);
            Cubo1C1G.setText("A");
            Cubo1.C1I = "A";
            Cubo1C1G.setBackground(C1);
        }

        Color C2 = null;
        if (Cubo1C2.getItemAt(Cubo1C2.getSelectedIndex()).equals("Rojo")) {
            C2 = new Color(136, 29, 60);
            Cubo1C2G.setText("R");
            Cubo1.C2I = "R";
            Cubo1C2G.setBackground(C2);

        } else if (Cubo1C2.getItemAt(Cubo1C2.getSelectedIndex()).equals("Blanco")) {
            C2 = new Color(255, 255, 255);
            Cubo1C2G.setText("B");
            Cubo1.C2I = "B";
            Cubo1C2G.setBackground(C2);

        } else if (Cubo1C2.getItemAt(Cubo1C2.getSelectedIndex()).equals("Verde")) {
            C2 = new Color(45, 160, 106);
            Cubo1C2G.setText("V");
            Cubo1.C2I = "V";
            Cubo1C2G.setBackground(C2);

        } else if (Cubo1C2.getItemAt(Cubo1C2.getSelectedIndex()).equals("Amarillo")) {
            C2 = new Color(255, 204, 0);
            Cubo1C2G.setText("A");
            Cubo1.C2I = "A";
            Cubo1C2G.setBackground(C2);
        }

        Color C3 = null;
        if (Cubo1C3.getItemAt(Cubo1C3.getSelectedIndex()).equals("Rojo")) {
            C3 = new Color(136, 29, 60);
            Cubo1C3G.setText("R");
            Cubo1.C3I = "R";
            Cubo1C3G.setBackground(C3);

        } else if (Cubo1C3.getItemAt(Cubo1C3.getSelectedIndex()).equals("Blanco")) {
            C3 = new Color(255, 255, 255);
            Cubo1C3G.setText("B");
            Cubo1.C3I = "B";
            Cubo1C3G.setBackground(C3);

        } else if (Cubo1C3.getItemAt(Cubo1C3.getSelectedIndex()).equals("Verde")) {
            C3 = new Color(45, 160, 106);
            Cubo1C3G.setText("V");
            Cubo1.C3I = "V";
            Cubo1C3G.setBackground(C3);

        } else if (Cubo1C3.getItemAt(Cubo1C3.getSelectedIndex()).equals("Amarillo")) {
            C3 = new Color(255, 204, 0);
            Cubo1C3G.setText("A");
            Cubo1.C3I = "A";
            Cubo1C3G.setBackground(C3);
        }

        Color C4 = null;
        if (Cubo1C4.getItemAt(Cubo1C4.getSelectedIndex()).equals("Rojo")) {
            C4 = new Color(136, 29, 60);
            Cubo1C4G.setText("R");
            Cubo1.C4I = "R";
            Cubo1C4G.setBackground(C4);

        } else if (Cubo1C4.getItemAt(Cubo1C4.getSelectedIndex()).equals("Blanco")) {
            C4 = new Color(255, 255, 255);
            Cubo1C4G.setText("B");
            Cubo1.C4I = "B";
            Cubo1C4G.setBackground(C4);

        } else if (Cubo1C4.getItemAt(Cubo1C4.getSelectedIndex()).equals("Verde")) {
            C4 = new Color(45, 160, 106);
            Cubo1C4G.setText("V");
            Cubo1.C4I = "V";
            Cubo1C4G.setBackground(C4);

        } else if (Cubo1C4.getItemAt(Cubo1C4.getSelectedIndex()).equals("Amarillo")) {
            C4 = new Color(255, 204, 0);
            Cubo1C4G.setText("A");
            Cubo1.C4I = "A";
            Cubo1C4G.setBackground(C4);
        }

        Color C5 = null;
        if (Cubo1C5.getItemAt(Cubo1C5.getSelectedIndex()).equals("Rojo")) {
            C5 = new Color(136, 29, 60);
            Cubo1C5G.setText("R");
            Cubo1.C5I = "R";
            Cubo1C5G.setBackground(C5);

        } else if (Cubo1C5.getItemAt(Cubo1C5.getSelectedIndex()).equals("Blanco")) {
            C5 = new Color(255, 255, 255);
            Cubo1C5G.setText("B");
            Cubo1.C5I = "B";
            Cubo1C5G.setBackground(C5);

        } else if (Cubo1C5.getItemAt(Cubo1C5.getSelectedIndex()).equals("Verde")) {
            C5 = new Color(45, 160, 106);
            Cubo1C5G.setText("V");
            Cubo1.C5I = "V";
            Cubo1C5G.setBackground(C5);

        } else if (Cubo1C5.getItemAt(Cubo1C5.getSelectedIndex()).equals("Amarillo")) {
            C5 = new Color(255, 204, 0);
            Cubo1C5G.setText("A");
            Cubo1.C5I = "A";
            Cubo1C5G.setBackground(C5);
        }

        Color C6 = null;
        if (Cubo1C6.getItemAt(Cubo1C6.getSelectedIndex()).equals("Rojo")) {
            C6 = new Color(136, 29, 60);
            Cubo1C6G.setText("R");
            Cubo1.C6I = "R";
            Cubo1C6G.setBackground(C6);

        } else if (Cubo1C6.getItemAt(Cubo1C6.getSelectedIndex()).equals("Blanco")) {
            C6 = new Color(255, 255, 255);
            Cubo1C6G.setText("B");
            Cubo1.C6I = "B";
            Cubo1C6G.setBackground(C6);

        } else if (Cubo1C6.getItemAt(Cubo1C6.getSelectedIndex()).equals("Verde")) {
            C6 = new Color(45, 160, 106);
            Cubo1C6G.setText("V");
            Cubo1.C6I = "V";
            Cubo1C6G.setBackground(C6);

        } else if (Cubo1C6.getItemAt(Cubo1C6.getSelectedIndex()).equals("Amarillo")) {
            C6 = new Color(255, 204, 0);
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
        if (((!C1.equals(C2) && !C1.equals(C3) && !C1.equals(C4))
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

        } else {
            JOptionPane.showMessageDialog(null, "Es obligatorio que cada cubo tenga los 4 colores disponibles");
        }

    }//GEN-LAST:event_genCubo1ActionPerformed

    private void genCubo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genCubo3ActionPerformed
        // TODO add your handling code here:
        Color C1 = null;
        if (Cubo3C1.getItemAt(Cubo3C1.getSelectedIndex()).equals("Rojo")) {
            C1 = new Color(136, 29, 60);
            Cubo3C1G.setText("R");
            Cubo3.C1I = "R";
            Cubo3C1G.setBackground(C1);

        } else if (Cubo3C1.getItemAt(Cubo3C1.getSelectedIndex()).equals("Blanco")) {
            C1 = new Color(255, 255, 255);
            Cubo3C1G.setText("B");
            Cubo3.C1I = "B";
            Cubo3C1G.setBackground(C1);

        } else if (Cubo3C1.getItemAt(Cubo3C1.getSelectedIndex()).equals("Verde")) {
            C1 = new Color(45, 160, 106);
            Cubo3C1G.setText("V");
            Cubo3.C1I = "V";
            Cubo3C1G.setBackground(C1);

        } else if (Cubo3C1.getItemAt(Cubo3C1.getSelectedIndex()).equals("Amarillo")) {
            C1 = new Color(255, 204, 0);
            Cubo3C1G.setText("A");
            Cubo3.C1I = "A";
            Cubo3C1G.setBackground(C1);
        }

        Color C2 = null;
        if (Cubo3C2.getItemAt(Cubo3C2.getSelectedIndex()).equals("Rojo")) {
            C2 = new Color(136, 29, 60);
            Cubo3C2G.setText("R");
            Cubo3.C2I = "R";
            Cubo3C2G.setBackground(C2);

        } else if (Cubo3C2.getItemAt(Cubo3C2.getSelectedIndex()).equals("Blanco")) {
            C2 = new Color(255, 255, 255);
            Cubo3C2G.setText("B");
            Cubo3.C2I = "B";
            Cubo3C2G.setBackground(C2);

        } else if (Cubo3C2.getItemAt(Cubo3C2.getSelectedIndex()).equals("Verde")) {
            C2 = new Color(45, 160, 106);
            Cubo3C2G.setText("V");
            Cubo3.C2I = "V";
            Cubo3C2G.setBackground(C2);

        } else if (Cubo3C2.getItemAt(Cubo3C2.getSelectedIndex()).equals("Amarillo")) {
            C2 = new Color(255, 204, 0);
            Cubo3C2G.setText("A");
            Cubo3.C2I = "A";
            Cubo3C2G.setBackground(C2);
        }

        Color C3 = null;
        if (Cubo3C3.getItemAt(Cubo3C3.getSelectedIndex()).equals("Rojo")) {
            C3 = new Color(136, 29, 60);
            Cubo3C3G.setText("R");
            Cubo3.C3I = "R";
            Cubo3C3G.setBackground(C3);

        } else if (Cubo3C3.getItemAt(Cubo3C3.getSelectedIndex()).equals("Blanco")) {
            C3 = new Color(255, 255, 255);
            Cubo3C3G.setText("B");
            Cubo3.C3I = "B";
            Cubo3C3G.setBackground(C3);

        } else if (Cubo3C3.getItemAt(Cubo3C3.getSelectedIndex()).equals("Verde")) {
            C3 = new Color(45, 160, 106);
            Cubo3C3G.setText("V");
            Cubo3.C3I = "V";
            Cubo3C3G.setBackground(C3);

        } else if (Cubo3C3.getItemAt(Cubo3C3.getSelectedIndex()).equals("Amarillo")) {
            C3 = new Color(255, 204, 0);
            Cubo3C3G.setText("A");
            Cubo3.C3I = "A";
            Cubo3C3G.setBackground(C3);
        }

        Color C4 = null;
        if (Cubo3C4.getItemAt(Cubo3C4.getSelectedIndex()).equals("Rojo")) {
            C4 = new Color(136, 29, 60);
            Cubo3C4G.setText("R");
            Cubo3.C4I = "R";
            Cubo3C4G.setBackground(C4);

        } else if (Cubo3C4.getItemAt(Cubo3C4.getSelectedIndex()).equals("Blanco")) {
            C4 = new Color(255, 255, 255);
            Cubo3C4G.setText("B");
            Cubo3.C4I = "B";
            Cubo3C4G.setBackground(C4);

        } else if (Cubo3C4.getItemAt(Cubo3C4.getSelectedIndex()).equals("Verde")) {
            C4 = new Color(45, 160, 106);
            Cubo3C4G.setText("V");
            Cubo3.C4I = "V";
            Cubo3C4G.setBackground(C4);

        } else if (Cubo3C4.getItemAt(Cubo3C4.getSelectedIndex()).equals("Amarillo")) {
            C4 = new Color(255, 204, 0);
            Cubo3C4G.setText("A");
            Cubo3.C4I = "A";
            Cubo3C4G.setBackground(C4);
        }

        Color C5 = null;
        if (Cubo3C5.getItemAt(Cubo3C5.getSelectedIndex()).equals("Rojo")) {
            C5 = new Color(136, 29, 60);
            Cubo3C5G.setText("R");
            Cubo3.C5I = "R";
            Cubo3C5G.setBackground(C5);

        } else if (Cubo3C5.getItemAt(Cubo3C5.getSelectedIndex()).equals("Blanco")) {
            C5 = new Color(255, 255, 255);
            Cubo3C5G.setText("B");
            Cubo3.C5I = "B";
            Cubo3C5G.setBackground(C5);

        } else if (Cubo3C5.getItemAt(Cubo3C5.getSelectedIndex()).equals("Verde")) {
            C5 = new Color(45, 160, 106);
            Cubo3C5G.setText("V");
            Cubo3.C5I = "V";
            Cubo3C5G.setBackground(C5);

        } else if (Cubo3C5.getItemAt(Cubo3C5.getSelectedIndex()).equals("Amarillo")) {
            C5 = new Color(255, 204, 0);
            Cubo3C5G.setText("A");
            Cubo3.C5I = "A";
            Cubo3C5G.setBackground(C5);
        }

        Color C6 = null;
        if (Cubo3C6.getItemAt(Cubo3C6.getSelectedIndex()).equals("Rojo")) {
            C6 = new Color(136, 29, 60);
            Cubo3C6G.setText("R");
            Cubo3.C6I = "R";
            Cubo3C6G.setBackground(C6);

        } else if (Cubo3C6.getItemAt(Cubo3C6.getSelectedIndex()).equals("Blanco")) {
            C6 = new Color(255, 255, 255);
            Cubo3C6G.setText("B");
            Cubo3.C6I = "B";
            Cubo3C6G.setBackground(C6);

        } else if (Cubo3C6.getItemAt(Cubo3C6.getSelectedIndex()).equals("Verde")) {
            C6 = new Color(45, 160, 106);
            Cubo3C6G.setText("V");
            Cubo3.C6I = "V";
            Cubo3C6G.setBackground(C6);

        } else if (Cubo3C6.getItemAt(Cubo3C6.getSelectedIndex()).equals("Amarillo")) {
            C6 = new Color(255, 204, 0);
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
        if (((!C1.equals(C2) && !C1.equals(C3) && !C1.equals(C4))
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

        } else {
            JOptionPane.showMessageDialog(null, "Es obligatorio que cada cubo tenga los 4 colores disponibles");
        }

    }//GEN-LAST:event_genCubo3ActionPerformed

    private void genCubo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genCubo4ActionPerformed
        // TODO add your handling code here:
        Color C1 = null;
        if (Cubo4C1.getItemAt(Cubo4C1.getSelectedIndex()).equals("Rojo")) {
            C1 = new Color(136, 29, 60);
            Cubo4C1G.setText("R");
            Cubo4.C1I = "R";
            Cubo4C1G.setBackground(C1);

        } else if (Cubo4C1.getItemAt(Cubo4C1.getSelectedIndex()).equals("Blanco")) {
            C1 = new Color(255, 255, 255);
            Cubo4C1G.setText("B");
            Cubo4.C1I = "B";
            Cubo4C1G.setBackground(C1);

        } else if (Cubo4C1.getItemAt(Cubo4C1.getSelectedIndex()).equals("Verde")) {
            C1 = new Color(45, 160, 106);
            Cubo4C1G.setText("V");
            Cubo4.C1I = "V";
            Cubo4C1G.setBackground(C1);

        } else if (Cubo4C1.getItemAt(Cubo4C1.getSelectedIndex()).equals("Amarillo")) {
            C1 = new Color(255, 204, 0);
            Cubo4C1G.setText("A");
            Cubo4.C1I = "A";
            Cubo4C1G.setBackground(C1);
        }

        Color C2 = null;
        if (Cubo4C2.getItemAt(Cubo4C2.getSelectedIndex()).equals("Rojo")) {
            C2 = new Color(136, 29, 60);
            Cubo4C2G.setText("R");
            Cubo4.C2I = "R";
            Cubo4C2G.setBackground(C2);

        } else if (Cubo4C2.getItemAt(Cubo4C2.getSelectedIndex()).equals("Blanco")) {
            C2 = new Color(255, 255, 255);
            Cubo4C2G.setText("B");
            Cubo4.C2I = "B";
            Cubo4C2G.setBackground(C2);

        } else if (Cubo4C2.getItemAt(Cubo4C2.getSelectedIndex()).equals("Verde")) {
            C2 = new Color(45, 160, 106);
            Cubo4C2G.setText("V");
            Cubo4.C2I = "V";
            Cubo4C2G.setBackground(C2);

        } else if (Cubo4C2.getItemAt(Cubo4C2.getSelectedIndex()).equals("Amarillo")) {
            C2 = new Color(255, 204, 0);
            Cubo4C2G.setText("A");
            Cubo4.C2I = "A";
            Cubo4C2G.setBackground(C2);
        }

        Color C3 = null;
        if (Cubo4C3.getItemAt(Cubo4C3.getSelectedIndex()).equals("Rojo")) {
            C3 = new Color(136, 29, 60);
            Cubo4C3G.setText("R");
            Cubo4.C3I = "R";
            Cubo4C3G.setBackground(C3);

        } else if (Cubo4C3.getItemAt(Cubo4C3.getSelectedIndex()).equals("Blanco")) {
            C3 = new Color(255, 255, 255);
            Cubo4C3G.setText("B");
            Cubo4.C3I = "B";
            Cubo4C3G.setBackground(C3);

        } else if (Cubo4C3.getItemAt(Cubo4C3.getSelectedIndex()).equals("Verde")) {
            C3 = new Color(45, 160, 106);
            Cubo4C3G.setText("V");
            Cubo4.C3I = "V";
            Cubo4C3G.setBackground(C3);

        } else if (Cubo4C3.getItemAt(Cubo4C3.getSelectedIndex()).equals("Amarillo")) {
            C3 = new Color(255, 204, 0);
            Cubo4C3G.setText("A");
            Cubo4.C3I = "A";
            Cubo4C3G.setBackground(C3);
        }

        Color C4 = null;
        if (Cubo4C4.getItemAt(Cubo4C4.getSelectedIndex()).equals("Rojo")) {
            C4 = new Color(136, 29, 60);
            Cubo4C4G.setText("R");
            Cubo4.C4I = "R";
            Cubo4C4G.setBackground(C4);

        } else if (Cubo4C4.getItemAt(Cubo4C4.getSelectedIndex()).equals("Blanco")) {
            C4 = new Color(255, 255, 255);
            Cubo4C4G.setText("B");
            Cubo4.C4I = "B";
            Cubo4C4G.setBackground(C4);

        } else if (Cubo4C4.getItemAt(Cubo4C4.getSelectedIndex()).equals("Verde")) {
            C4 = new Color(45, 160, 106);
            Cubo4C4G.setText("V");
            Cubo4.C4I = "V";
            Cubo4C4G.setBackground(C4);

        } else if (Cubo4C4.getItemAt(Cubo4C4.getSelectedIndex()).equals("Amarillo")) {
            C4 = new Color(255, 204, 0);
            Cubo4C4G.setText("A");
            Cubo4.C4I = "A";
            Cubo4C4G.setBackground(C4);
        }

        Color C5 = null;
        if (Cubo4C5.getItemAt(Cubo4C5.getSelectedIndex()).equals("Rojo")) {
            C5 = new Color(136, 29, 60);
            Cubo4C5G.setText("R");
            Cubo4.C5I = "R";
            Cubo4C5G.setBackground(C5);

        } else if (Cubo4C5.getItemAt(Cubo4C5.getSelectedIndex()).equals("Blanco")) {
            C5 = new Color(255, 255, 255);
            Cubo4C5G.setText("B");
            Cubo4.C5I = "B";
            Cubo4C5G.setBackground(C5);

        } else if (Cubo4C5.getItemAt(Cubo4C5.getSelectedIndex()).equals("Verde")) {
            C5 = new Color(45, 160, 106);
            Cubo4C5G.setText("V");
            Cubo4.C5I = "V";
            Cubo4C5G.setBackground(C5);

        } else if (Cubo4C5.getItemAt(Cubo4C5.getSelectedIndex()).equals("Amarillo")) {
            C5 = new Color(255, 204, 0);
            Cubo4C5G.setText("A");
            Cubo4.C5I = "A";
            Cubo4C5G.setBackground(C5);
        }

        Color C6 = null;
        if (Cubo4C6.getItemAt(Cubo4C6.getSelectedIndex()).equals("Rojo")) {
            C6 = new Color(136, 29, 60);
            Cubo4C6G.setText("R");
            Cubo4.C6I = "R";
            Cubo4C6G.setBackground(C6);

        } else if (Cubo4C6.getItemAt(Cubo4C6.getSelectedIndex()).equals("Blanco")) {
            C6 = new Color(255, 255, 255);
            Cubo4C6G.setText("B");
            Cubo4.C6I = "B";
            Cubo4C6G.setBackground(C6);

        } else if (Cubo4C6.getItemAt(Cubo4C6.getSelectedIndex()).equals("Verde")) {
            C6 = new Color(45, 160, 106);
            Cubo4C6G.setText("V");
            Cubo4.C6I = "V";
            Cubo4C6G.setBackground(C6);

        } else if (Cubo4C6.getItemAt(Cubo4C6.getSelectedIndex()).equals("Amarillo")) {
            C6 = new Color(255, 204, 0);
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
        if (((!C1.equals(C2) && !C1.equals(C3) && !C1.equals(C4))
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

        } else {
            JOptionPane.showMessageDialog(null, "Es obligatorio que cada cubo tenga los 4 colores disponibles");
        }
    }//GEN-LAST:event_genCubo4ActionPerformed

    private void genCubo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genCubo2ActionPerformed
        // TODO add your handling code here:

        Color C1 = null;
        if (Cubo2C1.getItemAt(Cubo2C1.getSelectedIndex()).equals("Rojo")) {
            C1 = new Color(136, 29, 60);
            Cubo2C1G.setText("R");
            Cubo2.C1I = "R";
            Cubo2C1G.setBackground(C1);

        } else if (Cubo2C1.getItemAt(Cubo2C1.getSelectedIndex()).equals("Blanco")) {
            C1 = new Color(255, 255, 255);
            Cubo2C1G.setText("B");
            Cubo2.C1I = "B";
            Cubo2C1G.setBackground(C1);

        } else if (Cubo2C1.getItemAt(Cubo2C1.getSelectedIndex()).equals("Verde")) {
            C1 = new Color(45, 160, 106);
            Cubo2C1G.setText("V");
            Cubo2.C1I = "V";
            Cubo2C1G.setBackground(C1);

        } else if (Cubo2C1.getItemAt(Cubo2C1.getSelectedIndex()).equals("Amarillo")) {
            C1 = new Color(255, 204, 0);
            Cubo2C1G.setText("A");
            Cubo2.C1I = "A";
            Cubo2C1G.setBackground(C1);
        }

        Color C2 = null;
        if (Cubo2C2.getItemAt(Cubo2C2.getSelectedIndex()).equals("Rojo")) {
            C2 = new Color(136, 29, 60);
            Cubo2C2G.setText("R");
            Cubo2.C2I = "R";
            Cubo2C2G.setBackground(C2);

        } else if (Cubo2C2.getItemAt(Cubo2C2.getSelectedIndex()).equals("Blanco")) {
            C2 = new Color(255, 255, 255);
            Cubo2C2G.setText("B");
            Cubo2.C2I = "B";
            Cubo2C2G.setBackground(C2);

        } else if (Cubo2C2.getItemAt(Cubo2C2.getSelectedIndex()).equals("Verde")) {
            C2 = new Color(45, 160, 106);
            Cubo2C2G.setText("V");
            Cubo2.C2I = "V";
            Cubo2C2G.setBackground(C2);

        } else if (Cubo2C2.getItemAt(Cubo2C2.getSelectedIndex()).equals("Amarillo")) {
            C2 = new Color(255, 204, 0);
            Cubo2C2G.setText("A");
            Cubo2.C2I = "A";
            Cubo2C2G.setBackground(C2);
        }

        Color C3 = null;
        if (Cubo2C3.getItemAt(Cubo2C3.getSelectedIndex()).equals("Rojo")) {
            C3 = new Color(136, 29, 60);
            Cubo2C3G.setText("R");
            Cubo2.C3I = "R";
            Cubo2C3G.setBackground(C3);

        } else if (Cubo2C3.getItemAt(Cubo2C3.getSelectedIndex()).equals("Blanco")) {
            C3 = new Color(255, 255, 255);
            Cubo2C3G.setText("B");
            Cubo2.C3I = "B";
            Cubo2C3G.setBackground(C3);

        } else if (Cubo2C3.getItemAt(Cubo2C3.getSelectedIndex()).equals("Verde")) {
            C3 = new Color(45, 160, 106);
            Cubo2C3G.setText("V");
            Cubo2.C3I = "V";
            Cubo2C3G.setBackground(C3);

        } else if (Cubo2C3.getItemAt(Cubo2C3.getSelectedIndex()).equals("Amarillo")) {
            C3 = new Color(255, 204, 0);
            Cubo2C3G.setText("A");
            Cubo2.C3I = "A";
            Cubo2C3G.setBackground(C3);
        }

        Color C4 = null;
        if (Cubo2C4.getItemAt(Cubo2C4.getSelectedIndex()).equals("Rojo")) {
            C4 = new Color(136, 29, 60);
            Cubo2C4G.setText("R");
            Cubo2.C4I = "R";
            Cubo2C4G.setBackground(C4);

        } else if (Cubo2C4.getItemAt(Cubo2C4.getSelectedIndex()).equals("Blanco")) {
            C4 = new Color(255, 255, 255);
            Cubo2C4G.setText("B");
            Cubo2.C4I = "B";
            Cubo2C4G.setBackground(C4);

        } else if (Cubo2C4.getItemAt(Cubo2C4.getSelectedIndex()).equals("Verde")) {
            C4 = new Color(45, 160, 106);
            Cubo2C4G.setText("V");
            Cubo2.C4I = "V";
            Cubo2C4G.setBackground(C4);

        } else if (Cubo2C4.getItemAt(Cubo2C4.getSelectedIndex()).equals("Amarillo")) {
            C4 = new Color(255, 204, 0);
            Cubo2C4G.setText("A");
            Cubo2.C4I = "A";
            Cubo2C4G.setBackground(C4);
        }

        Color C5 = null;
        if (Cubo2C5.getItemAt(Cubo2C5.getSelectedIndex()).equals("Rojo")) {
            C5 = new Color(136, 29, 60);
            Cubo2C5G.setText("R");
            Cubo2.C5I = "R";
            Cubo2C5G.setBackground(C5);

        } else if (Cubo2C5.getItemAt(Cubo2C5.getSelectedIndex()).equals("Blanco")) {
            C5 = new Color(255, 255, 255);
            Cubo2C5G.setText("B");
            Cubo2.C5I = "B";
            Cubo2C5G.setBackground(C5);

        } else if (Cubo2C5.getItemAt(Cubo2C5.getSelectedIndex()).equals("Verde")) {
            C5 = new Color(45, 160, 106);
            Cubo2C5G.setText("V");
            Cubo2.C5I = "V";
            Cubo2C5G.setBackground(C5);

        } else if (Cubo2C5.getItemAt(Cubo2C5.getSelectedIndex()).equals("Amarillo")) {
            C5 = new Color(255, 204, 0);
            Cubo2C5G.setText("A");
            Cubo2.C5I = "A";
            Cubo2C5G.setBackground(C5);
        }

        Color C6 = null;
        if (Cubo2C6.getItemAt(Cubo2C6.getSelectedIndex()).equals("Rojo")) {
            C6 = new Color(136, 29, 60);
            Cubo2C6G.setText("R");
            Cubo2.C6I = "R";
            Cubo2C6G.setBackground(C6);

        } else if (Cubo2C6.getItemAt(Cubo2C6.getSelectedIndex()).equals("Blanco")) {
            C6 = new Color(255, 255, 255);
            Cubo2C6G.setText("B");
            Cubo2.C6I = "B";
            Cubo2C6G.setBackground(C6);

        } else if (Cubo2C6.getItemAt(Cubo2C6.getSelectedIndex()).equals("Verde")) {
            C6 = new Color(45, 160, 106);
            Cubo2C6G.setText("V");
            Cubo2.C6I = "V";
            Cubo2C6G.setBackground(C6);

        } else if (Cubo2C6.getItemAt(Cubo2C6.getSelectedIndex()).equals("Amarillo")) {
            C6 = new Color(255, 204, 0);
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
            Color[] coloresDisp = {new Color(136, 29, 60), new Color(255, 255, 255),
                new Color(45, 160, 106), new Color(255, 204, 0)};

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

            if (C1.equals(new Color(136, 29, 60))) {
                Cubo1C1.setSelectedItem("Rojo");
                Cubo1.C1I = "R";
                Cubo1C1G.setText(Cubo1.C1I);
                Cubo1C1G.setBackground(C1);
            } else if (C1.equals(new Color(255, 255, 255))) {
                Cubo1C1.setSelectedItem("Blanco");
                Cubo1.C1I = "B";
                Cubo1C1G.setText(Cubo1.C1I);
                Cubo1C1G.setBackground(C1);
            } else if (C1.equals(new Color(45, 160, 106))) {
                Cubo1C1.setSelectedItem("Verde");
                Cubo1.C1I = "V";
                Cubo1C1G.setText(Cubo1.C1I);
                Cubo1C1G.setBackground(C1);
            } else if (C1.equals(new Color(255, 204, 0))) {
                Cubo1C1.setSelectedItem("Amarillo");
                Cubo1.C1I = "A";
                Cubo1C1G.setText(Cubo1.C1I);
                Cubo1C1G.setBackground(C1);

            }

            if (C2.equals(new Color(136, 29, 60))) {
                Cubo1C2.setSelectedItem("Rojo");
                Cubo1.C2I = "R";
                Cubo1C2G.setText(Cubo1.C2I);
                Cubo1C2G.setBackground(C2);
            } else if (C2.equals(new Color(255, 255, 255))) {
                Cubo1C2.setSelectedItem("Blanco");
                Cubo1.C2I = "B";
                Cubo1C2G.setText(Cubo1.C2I);
                Cubo1C2G.setBackground(C2);
            } else if (C2.equals(new Color(45, 160, 106))) {
                Cubo1C2.setSelectedItem("Verde");
                Cubo1.C2I = "V";
                Cubo1C2G.setText(Cubo1.C2I);
                Cubo1C2G.setBackground(C2);
            } else if (C2.equals(new Color(255, 204, 0))) {
                Cubo1C2.setSelectedItem("Amarillo");
                Cubo1.C2I = "A";
                Cubo1C2G.setText(Cubo1.C2I);
                Cubo1C2G.setBackground(C2);

            }

            if (C3.equals(new Color(136, 29, 60))) {
                Cubo1C3.setSelectedItem("Rojo");
                Cubo1.C3I = "R";
                Cubo1C3G.setText(Cubo1.C3I);
                Cubo1C3G.setBackground(C3);
            } else if (C3.equals(new Color(255, 255, 255))) {
                Cubo1C3.setSelectedItem("Blanco");
                Cubo1.C3I = "B";
                Cubo1C3G.setText(Cubo1.C3I);
                Cubo1C3G.setBackground(C3);
            } else if (C3.equals(new Color(45, 160, 106))) {
                Cubo1C3.setSelectedItem("Verde");
                Cubo1.C3I = "V";
                Cubo1C3G.setText(Cubo1.C3I);
                Cubo1C3G.setBackground(C3);
            } else if (C3.equals(new Color(255, 204, 0))) {
                Cubo1C3.setSelectedItem("Amarillo");
                Cubo1.C3I = "A";
                Cubo1C3G.setText(Cubo1.C3I);
                Cubo1C3G.setBackground(C3);

            }

            if (C4.equals(new Color(136, 29, 60))) {
                Cubo1C4.setSelectedItem("Rojo");
                Cubo1.C4I = "R";
                Cubo1C4G.setText(Cubo1.C4I);
                Cubo1C4G.setBackground(C4);
            } else if (C4.equals(new Color(255, 255, 255))) {
                Cubo1C4.setSelectedItem("Blanco");
                Cubo1.C4I = "B";
                Cubo1C4G.setText(Cubo1.C4I);
                Cubo1C4G.setBackground(C4);
            } else if (C4.equals(new Color(45, 160, 106))) {
                Cubo1C4.setSelectedItem("Verde");
                Cubo1.C4I = "V";
                Cubo1C4G.setText(Cubo1.C4I);
                Cubo1C4G.setBackground(C4);
            } else if (C4.equals(new Color(255, 204, 0))) {
                Cubo1C4.setSelectedItem("Amarillo");
                Cubo1.C4I = "A";
                Cubo1C4G.setText(Cubo1.C4I);
                Cubo1C4G.setBackground(C4);

            }

            if (C5.equals(new Color(136, 29, 60))) {
                Cubo1C5.setSelectedItem("Rojo");
                Cubo1.C5I = "R";
                Cubo1C5G.setText(Cubo1.C5I);
                Cubo1C5G.setBackground(C5);
            } else if (C5.equals(new Color(255, 255, 255))) {
                Cubo1C5.setSelectedItem("Blanco");
                Cubo1.C5I = "B";
                Cubo1C5G.setText(Cubo1.C5I);
                Cubo1C5G.setBackground(C5);
            } else if (C5.equals(new Color(45, 160, 106))) {
                Cubo1C5.setSelectedItem("Verde");
                Cubo1.C5I = "V";
                Cubo1C5G.setText(Cubo1.C5I);
                Cubo1C5G.setBackground(C5);
            } else if (C5.equals(new Color(255, 204, 0))) {
                Cubo1C5.setSelectedItem("Amarillo");
                Cubo1.C5I = "A";
                Cubo1C5G.setText(Cubo1.C5I);
                Cubo1C5G.setBackground(C5);

            }

            if (C6.equals(new Color(136, 29, 60))) {
                Cubo1C6.setSelectedItem("Rojo");
                Cubo1.C6I = "R";
                Cubo1C6G.setText(Cubo1.C6I);
                Cubo1C6G.setBackground(C6);
            } else if (C6.equals(new Color(255, 255, 255))) {
                Cubo1C6.setSelectedItem("Blanco");
                Cubo1.C6I = "B";
                Cubo1C6G.setText(Cubo1.C6I);
                Cubo1C6G.setBackground(C6);
            } else if (C6.equals(new Color(45, 160, 106))) {
                Cubo1C6.setSelectedItem("Verde");
                Cubo1.C6I = "V";
                Cubo1C6G.setText(Cubo1.C6I);
                Cubo1C6G.setBackground(C6);
            } else if (C6.equals(new Color(255, 204, 0))) {
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

            if (C1.equals(new Color(136, 29, 60))) {
                Cubo2C1.setSelectedItem("Rojo");
                Cubo2.C1I = "R";
                Cubo2C1G.setText(Cubo2.C1I);
                Cubo2C1G.setBackground(C1);
            } else if (C1.equals(new Color(255, 255, 255))) {
                Cubo2C1.setSelectedItem("Blanco");
                Cubo2.C1I = "B";
                Cubo2C1G.setText(Cubo2.C1I);
                Cubo2C1G.setBackground(C1);
            } else if (C1.equals(new Color(45, 160, 106))) {
                Cubo2C1.setSelectedItem("Verde");
                Cubo2.C1I = "V";
                Cubo2C1G.setBackground(C1);
                Cubo2C1G.setText(Cubo2.C1I);
                Cubo2C1G.setBackground(C1);
            } else if (C1.equals(new Color(255, 204, 0))) {
                Cubo2C1.setSelectedItem("Amarillo");
                Cubo2.C1I = "A";
                Cubo2C1G.setText(Cubo2.C1I);
                Cubo2C1G.setBackground(C1);

            }

            if (C2.equals(new Color(136, 29, 60))) {
                Cubo2C2.setSelectedItem("Rojo");
                Cubo2.C2I = "R";
                Cubo2C2G.setText(Cubo2.C2I);
                Cubo2C2G.setBackground(C2);
            } else if (C2.equals(new Color(255, 255, 255))) {
                Cubo2C2.setSelectedItem("Blanco");
                Cubo2.C2I = "B";
                Cubo2C2G.setText(Cubo2.C2I);
                Cubo2C2G.setBackground(C2);
            } else if (C2.equals(new Color(45, 160, 106))) {
                Cubo2C2.setSelectedItem("Verde");
                Cubo2.C2I = "V";
                Cubo2C2G.setText(Cubo2.C2I);
                Cubo2C2G.setBackground(C2);
            } else if (C2.equals(new Color(255, 204, 0))) {
                Cubo2C2.setSelectedItem("Amarillo");
                Cubo2.C2I = "A";
                Cubo2C2G.setText(Cubo2.C2I);
                Cubo2C2G.setBackground(C2);

            }

            if (C3.equals(new Color(136, 29, 60))) {
                Cubo2C3.setSelectedItem("Rojo");
                Cubo2.C3I = "R";
                Cubo2C3G.setText(Cubo2.C3I);
                Cubo2C3G.setBackground(C3);
            } else if (C3.equals(new Color(255, 255, 255))) {
                Cubo2C3.setSelectedItem("Blanco");
                Cubo2.C3I = "B";
                Cubo2C3G.setText(Cubo2.C3I);
                Cubo2C3G.setBackground(C3);
            } else if (C3.equals(new Color(45, 160, 106))) {
                Cubo2C3.setSelectedItem("Verde");
                Cubo2.C3I = "V";
                Cubo2C3G.setText(Cubo2.C3I);
                Cubo2C3G.setBackground(C3);
            } else if (C3.equals(new Color(255, 204, 0))) {
                Cubo2C3.setSelectedItem("Amarillo");
                Cubo2.C3I = "A";
                Cubo2C3G.setText(Cubo2.C3I);
                Cubo2C3G.setBackground(C3);

            }

            if (C4.equals(new Color(136, 29, 60))) {
                Cubo2C4.setSelectedItem("Rojo");
                Cubo2.C4I = "R";
                Cubo2C4G.setText(Cubo2.C4I);
                Cubo2C4G.setBackground(C4);
            } else if (C4.equals(new Color(255, 255, 255))) {
                Cubo2C4.setSelectedItem("Blanco");
                Cubo2.C4I = "B";
                Cubo2C4G.setText(Cubo2.C4I);
                Cubo2C4G.setBackground(C4);
            } else if (C4.equals(new Color(45, 160, 106))) {
                Cubo2C4.setSelectedItem("Verde");
                Cubo2.C4I = "V";
                Cubo2C4G.setText(Cubo2.C4I);
                Cubo2C4G.setBackground(C4);
            } else if (C4.equals(new Color(255, 204, 0))) {
                Cubo2C4.setSelectedItem("Amarillo");
                Cubo2.C4I = "A";
                Cubo2C4G.setText(Cubo2.C4I);
                Cubo2C4G.setBackground(C4);

            }

            if (C5.equals(new Color(136, 29, 60))) {
                Cubo2C5.setSelectedItem("Rojo");
                Cubo2.C5I = "R";
                Cubo2C5G.setText(Cubo2.C5I);
                Cubo2C5G.setBackground(C5);
            } else if (C5.equals(new Color(255, 255, 255))) {
                Cubo2C5.setSelectedItem("Blanco");
                Cubo2.C5I = "B";
                Cubo2C5G.setText(Cubo2.C5I);
                Cubo2C5G.setBackground(C5);
            } else if (C5.equals(new Color(45, 160, 106))) {
                Cubo2C5.setSelectedItem("Verde");
                Cubo2.C5I = "V";
                Cubo2C5G.setText(Cubo2.C5I);
                Cubo2C5G.setBackground(C5);
            } else if (C5.equals(new Color(255, 204, 0))) {
                Cubo2C5.setSelectedItem("Amarillo");
                Cubo2.C5I = "A";
                Cubo2C5G.setText(Cubo2.C5I);
                Cubo2C5G.setBackground(C5);

            }

            if (C6.equals(new Color(136, 29, 60))) {
                Cubo2C6.setSelectedItem("Rojo");
                Cubo2.C6I = "R";
                Cubo2C6G.setText(Cubo2.C6I);
                Cubo2C6G.setBackground(C6);
            } else if (C6.equals(new Color(255, 255, 255))) {
                Cubo2C6.setSelectedItem("Blanco");
                Cubo2.C6I = "B";
                Cubo2C6G.setText(Cubo2.C6I);
                Cubo2C6G.setBackground(C6);
            } else if (C6.equals(new Color(45, 160, 106))) {
                Cubo2C6.setSelectedItem("Verde");
                Cubo2.C6I = "V";
                Cubo2C6G.setText(Cubo2.C6I);
                Cubo2C6G.setBackground(C6);
            } else if (C6.equals(new Color(255, 204, 0))) {
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

            if (C1.equals(new Color(136, 29, 60))) {
                Cubo3C1.setSelectedItem("Rojo");
                Cubo3.C1I = "R";
                Cubo3C1G.setText(Cubo3.C1I);
                Cubo3C1G.setBackground(C1);
            } else if (C1.equals(new Color(255, 255, 255))) {
                Cubo3C1.setSelectedItem("Blanco");
                Cubo3.C1I = "B";
                Cubo3C1G.setText(Cubo3.C1I);
                Cubo3C1G.setBackground(C1);
            } else if (C1.equals(new Color(45, 160, 106))) {
                Cubo3C1.setSelectedItem("Verde");
                Cubo3.C1I = "V";
                Cubo3C1G.setText(Cubo3.C1I);
                Cubo3C1G.setBackground(C1);
            } else if (C1.equals(new Color(255, 204, 0))) {
                Cubo3C1.setSelectedItem("Amarillo");
                Cubo3.C1I = "A";
                Cubo3C1G.setText(Cubo3.C1I);
                Cubo3C1G.setBackground(C1);

            }

            if (C2.equals(new Color(136, 29, 60))) {
                Cubo3C2.setSelectedItem("Rojo");
                Cubo3.C2I = "R";
                Cubo3C2G.setText(Cubo3.C2I);
                Cubo3C2G.setBackground(C2);
            } else if (C2.equals(new Color(255, 255, 255))) {
                Cubo3C2.setSelectedItem("Blanco");
                Cubo3.C2I = "B";
                Cubo3C2G.setText(Cubo3.C2I);
                Cubo3C2G.setBackground(C2);
            } else if (C2.equals(new Color(45, 160, 106))) {
                Cubo3C2.setSelectedItem("Verde");
                Cubo3.C2I = "V";
                Cubo3C2G.setText(Cubo3.C2I);
                Cubo3C2G.setBackground(C2);
            } else if (C2.equals(new Color(255, 204, 0))) {
                Cubo3C2.setSelectedItem("Amarillo");
                Cubo3.C2I = "A";
                Cubo3C2G.setText(Cubo3.C2I);
                Cubo3C2G.setBackground(C2);

            }

            if (C3.equals(new Color(136, 29, 60))) {
                Cubo3C3.setSelectedItem("Rojo");
                Cubo3.C3I = "R";
                Cubo3C3G.setText(Cubo3.C3I);
                Cubo3C3G.setBackground(C3);
            } else if (C3.equals(new Color(255, 255, 255))) {
                Cubo3C3.setSelectedItem("Blanco");
                Cubo3.C3I = "B";
                Cubo3C3G.setText(Cubo3.C3I);
                Cubo3C3G.setBackground(C3);
            } else if (C3.equals(new Color(45, 160, 106))) {
                Cubo3C3.setSelectedItem("Verde");
                Cubo3.C3I = "V";
                Cubo3C3G.setText(Cubo3.C3I);
                Cubo3C3G.setBackground(C3);
            } else if (C3.equals(new Color(255, 204, 0))) {
                Cubo3C3.setSelectedItem("Amarillo");
                Cubo3.C3I = "A";
                Cubo3C3G.setText(Cubo3.C3I);
                Cubo3C3G.setBackground(C3);

            }

            if (C4.equals(new Color(136, 29, 60))) {
                Cubo3C4.setSelectedItem("Rojo");
                Cubo3.C4I = "R";
                Cubo3C4G.setText(Cubo3.C4I);
                Cubo3C4G.setBackground(C4);
            } else if (C4.equals(new Color(255, 255, 255))) {
                Cubo3C4.setSelectedItem("Blanco");
                Cubo3.C4I = "B";
                Cubo3C4G.setText(Cubo3.C4I);
                Cubo3C4G.setBackground(C4);
            } else if (C4.equals(new Color(45, 160, 106))) {
                Cubo3C4.setSelectedItem("Verde");
                Cubo3.C4I = "V";
                Cubo3C4G.setText(Cubo3.C4I);
                Cubo3C4G.setBackground(C4);
            } else if (C4.equals(new Color(255, 204, 0))) {
                Cubo3C4.setSelectedItem("Amarillo");
                Cubo3.C4I = "A";
                Cubo3C4G.setText(Cubo3.C4I);
                Cubo3C4G.setBackground(C4);

            }

            if (C5.equals(new Color(136, 29, 60))) {
                Cubo3C5.setSelectedItem("Rojo");
                Cubo3.C5I = "R";
                Cubo3C5G.setText(Cubo3.C5I);
                Cubo3C5G.setBackground(C5);
            } else if (C5.equals(new Color(255, 255, 255))) {
                Cubo3C5.setSelectedItem("Blanco");
                Cubo3.C5I = "B";
                Cubo3C5G.setText(Cubo3.C5I);
                Cubo3C5G.setBackground(C5);
            } else if (C5.equals(new Color(45, 160, 106))) {
                Cubo3C5.setSelectedItem("Verde");
                Cubo3.C5I = "V";
                Cubo3C5G.setText(Cubo3.C5I);
                Cubo3C5G.setBackground(C5);
            } else if (C5.equals(new Color(255, 204, 0))) {
                Cubo3C5.setSelectedItem("Amarillo");
                Cubo3.C5I = "A";
                Cubo3C5G.setText(Cubo3.C5I);
                Cubo3C5G.setBackground(C5);

            }

            if (C6.equals(new Color(136, 29, 60))) {
                Cubo3C6.setSelectedItem("Rojo");
                Cubo3.C6I = "R";
                Cubo3C6G.setText(Cubo3.C6I);
                Cubo3C6G.setBackground(C6);
            } else if (C6.equals(new Color(255, 255, 255))) {
                Cubo3C6.setSelectedItem("Blanco");
                Cubo3.C6I = "B";
                Cubo3C6G.setText(Cubo3.C6I);
                Cubo3C6G.setBackground(C6);
            } else if (C6.equals(new Color(45, 160, 106))) {
                Cubo3C6.setSelectedItem("Verde");
                Cubo3.C6I = "V";
                Cubo3C6G.setText(Cubo3.C6I);
                Cubo3C6G.setBackground(C6);
            } else if (C6.equals(new Color(255, 204, 0))) {
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

            if (C1.equals(new Color(136, 29, 60))) {
                Cubo4C1.setSelectedItem("Rojo");
                Cubo4.C1I = "R";
                Cubo4C1G.setText(Cubo4.C1I);
                Cubo4C1G.setBackground(C1);
            } else if (C1.equals(new Color(255, 255, 255))) {
                Cubo4C1.setSelectedItem("Blanco");
                Cubo4.C1I = "B";
                Cubo4C1G.setText(Cubo4.C1I);
                Cubo4C1G.setBackground(C1);
            } else if (C1.equals(new Color(45, 160, 106))) {
                Cubo4C1.setSelectedItem("Verde");
                Cubo4.C1I = "V";
                Cubo4C1G.setText(Cubo4.C1I);
                Cubo4C1G.setBackground(C1);
            } else if (C1.equals(new Color(255, 204, 0))) {
                Cubo4C1.setSelectedItem("Amarillo");
                Cubo4.C1I = "A";
                Cubo4C1G.setText(Cubo4.C1I);
                Cubo4C1G.setBackground(C1);

            }

            if (C2.equals(new Color(136, 29, 60))) {
                Cubo4C2.setSelectedItem("Rojo");
                Cubo4.C2I = "R";
                Cubo4C2G.setText(Cubo4.C2I);
                Cubo4C2G.setBackground(C2);
            } else if (C2.equals(new Color(255, 255, 255))) {
                Cubo4C2.setSelectedItem("Blanco");
                Cubo4.C2I = "B";
                Cubo4C2G.setText(Cubo4.C2I);
                Cubo4C2G.setBackground(C2);
            } else if (C2.equals(new Color(45, 160, 106))) {
                Cubo4C2.setSelectedItem("Verde");
                Cubo4.C2I = "V";
                Cubo4C2G.setText(Cubo4.C2I);
                Cubo4C2G.setBackground(C2);
            } else if (C2.equals(new Color(255, 204, 0))) {
                Cubo4C2.setSelectedItem("Amarillo");
                Cubo4.C2I = "A";
                Cubo4C2G.setText(Cubo4.C2I);
                Cubo4C2G.setBackground(C2);

            }

            if (C3.equals(new Color(136, 29, 60))) {
                Cubo4C3.setSelectedItem("Rojo");
                Cubo4.C3I = "R";
                Cubo4C3G.setText(Cubo4.C3I);
                Cubo4C3G.setBackground(C3);
            } else if (C3.equals(new Color(255, 255, 255))) {
                Cubo4C3.setSelectedItem("Blanco");
                Cubo4.C3I = "B";
                Cubo4C3G.setText(Cubo4.C3I);
                Cubo4C3G.setBackground(C3);
            } else if (C3.equals(new Color(45, 160, 106))) {
                Cubo4C3.setSelectedItem("Verde");
                Cubo4.C3I = "V";
                Cubo4C3G.setText(Cubo4.C3I);
                Cubo4C3G.setBackground(C3);
            } else if (C3.equals(new Color(255, 204, 0))) {
                Cubo4C3.setSelectedItem("Amarillo");
                Cubo4.C3I = "A";
                Cubo4C3G.setText(Cubo4.C3I);
                Cubo4C3G.setBackground(C3);

            }

            if (C4.equals(new Color(136, 29, 60))) {
                Cubo4C4.setSelectedItem("Rojo");
                Cubo4.C4I = "R";
                Cubo4C4G.setText(Cubo4.C4I);
                Cubo4C4G.setBackground(C4);
            } else if (C4.equals(new Color(255, 255, 255))) {
                Cubo4C4.setSelectedItem("Blanco");
                Cubo4.C4I = "B";
                Cubo4C4G.setText(Cubo4.C4I);
                Cubo4C4G.setBackground(C4);
            } else if (C4.equals(new Color(45, 160, 106))) {
                Cubo4C4.setSelectedItem("Verde");
                Cubo4.C4I = "V";
                Cubo4C4G.setText(Cubo4.C4I);
                Cubo4C4G.setBackground(C4);
            } else if (C4.equals(new Color(255, 204, 0))) {
                Cubo4C4.setSelectedItem("Amarillo");
                Cubo4.C4I = "A";
                Cubo4C4G.setText(Cubo4.C4I);
                Cubo4C4G.setBackground(C4);

            }

            if (C5.equals(new Color(136, 29, 60))) {
                Cubo4C5.setSelectedItem("Rojo");
                Cubo4.C5I = "R";
                Cubo4C5G.setText(Cubo4.C5I);
                Cubo4C5G.setBackground(C5);
            } else if (C5.equals(new Color(255, 255, 255))) {
                Cubo4C5.setSelectedItem("Blanco");
                Cubo4.C5I = "B";
                Cubo4C5G.setText(Cubo4.C5I);
                Cubo4C5G.setBackground(C5);
            } else if (C5.equals(new Color(45, 160, 106))) {
                Cubo4C5.setSelectedItem("Verde");
                Cubo4.C5I = "V";
                Cubo4C5G.setText(Cubo4.C5I);
                Cubo4C5G.setBackground(C5);
            } else if (C5.equals(new Color(255, 204, 0))) {
                Cubo4C5.setSelectedItem("Amarillo");
                Cubo4.C5I = "A";
                Cubo4C5G.setText(Cubo4.C5I);
                Cubo4C5G.setBackground(C5);

            }

            if (C6.equals(new Color(136, 29, 60))) {
                Cubo4C6.setSelectedItem("Rojo");
                Cubo4.C6I = "R";
                Cubo4C6G.setText(Cubo4.C6I);
                Cubo4C6G.setBackground(C6);
            } else if (C6.equals(new Color(255, 255, 255))) {
                Cubo4C6.setSelectedItem("Blanco");
                Cubo4.C6I = "B";
                Cubo4C6G.setText(Cubo4.C6I);
                Cubo4C6G.setBackground(C6);
            } else if (C6.equals(new Color(45, 160, 106))) {
                Cubo4C6.setSelectedItem("Verde");
                Cubo4.C6I = "V";
                Cubo4C6G.setText(Cubo4.C6I);
                Cubo4C6G.setBackground(C6);
            } else if (C6.equals(new Color(255, 204, 0))) {
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
            "No"};
        int yes = JOptionPane.showOptionDialog(null,
                "Está seguro que desea salir del juego?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (JOptionPane.YES_OPTION == yes) {
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
                JOptionPane.showMessageDialog(null, "Debe generar los 4 cubos y presionar\n"
                        + "el botón 'Siguiente' para continuar ");

            } else {

            }
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void siguienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteBtnActionPerformed
        // TODO add your handling code here:

        if (Cubo1.C1 == null || Cubo2.C1 == null || Cubo3.C1 == null || Cubo4.C1 == null) {
            JOptionPane.showMessageDialog(null, "Aún no ha generado los 4 cubos");
        }  else if ((!Cubo1Bin.C1.equals(Cubo1.C1) || !Cubo1Bin.C2.equals(Cubo1.C2)
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
            sigBtnPressed = true;
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
        }


    }//GEN-LAST:event_siguienteBtnActionPerformed

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

    }//GEN-LAST:event_arribaCubo1ActionPerformed

    private void genAleatorio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genAleatorio1ActionPerformed
        // TODO add your handling code here:
        Object[] options = {"Sí, Por Favor",
            "No, seguiré intentando"};
        int yes = JOptionPane.showOptionDialog(null,
                "Deseas que el programa resuelva el juego por tí?\n"
                + " Podrás ver la explicación abajo",
                "Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (JOptionPane.YES_OPTION == yes) {
            System.out.println("jeje");
        } else {

        }
    }//GEN-LAST:event_genAleatorio1ActionPerformed

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

            resueltoLbl.setVisible(true);
            JOptionPane.showMessageDialog(null, "Felicidades, resolviste el juego!");
        } else {
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
            
            resueltoLbl.setVisible(false);
            JOptionPane.showMessageDialog(null, "Esta NO es una solución válida, sigue intentando");
        }


    }//GEN-LAST:event_comprobarBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Locura_Instantánea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cubo1C1;
    private javax.swing.JLabel Cubo1C1G;
    private javax.swing.JLabel Cubo1C1J;
    private javax.swing.JComboBox<String> Cubo1C2;
    private javax.swing.JLabel Cubo1C2G;
    private javax.swing.JLabel Cubo1C2J;
    private javax.swing.JComboBox<String> Cubo1C3;
    private javax.swing.JLabel Cubo1C3G;
    private javax.swing.JLabel Cubo1C3J;
    private javax.swing.JLabel Cubo1C3T;
    private javax.swing.JComboBox<String> Cubo1C4;
    private javax.swing.JLabel Cubo1C4G;
    private javax.swing.JLabel Cubo1C4J;
    private javax.swing.JLabel Cubo1C4T;
    private javax.swing.JComboBox<String> Cubo1C5;
    private javax.swing.JLabel Cubo1C5G;
    private javax.swing.JLabel Cubo1C5J;
    private javax.swing.JLabel Cubo1C5T;
    private javax.swing.JComboBox<String> Cubo1C6;
    private javax.swing.JLabel Cubo1C6G;
    private javax.swing.JLabel Cubo1C6J;
    private javax.swing.JLabel Cubo1C6T;
    private javax.swing.JComboBox<String> Cubo2C1;
    private javax.swing.JLabel Cubo2C1G;
    private javax.swing.JLabel Cubo2C1J;
    private javax.swing.JComboBox<String> Cubo2C2;
    private javax.swing.JLabel Cubo2C2G;
    private javax.swing.JLabel Cubo2C2J;
    private javax.swing.JComboBox<String> Cubo2C3;
    private javax.swing.JLabel Cubo2C3G;
    private javax.swing.JLabel Cubo2C3J;
    private javax.swing.JLabel Cubo2C3T;
    private javax.swing.JComboBox<String> Cubo2C4;
    private javax.swing.JLabel Cubo2C4G;
    private javax.swing.JLabel Cubo2C4J;
    private javax.swing.JLabel Cubo2C4T;
    private javax.swing.JComboBox<String> Cubo2C5;
    private javax.swing.JLabel Cubo2C5G;
    private javax.swing.JLabel Cubo2C5J;
    private javax.swing.JLabel Cubo2C5T;
    private javax.swing.JComboBox<String> Cubo2C6;
    private javax.swing.JLabel Cubo2C6G;
    private javax.swing.JLabel Cubo2C6J;
    private javax.swing.JLabel Cubo2C6T;
    private javax.swing.JComboBox<String> Cubo3C1;
    private javax.swing.JLabel Cubo3C1G;
    private javax.swing.JLabel Cubo3C1J;
    private javax.swing.JComboBox<String> Cubo3C2;
    private javax.swing.JLabel Cubo3C2G;
    private javax.swing.JLabel Cubo3C2J;
    private javax.swing.JComboBox<String> Cubo3C3;
    private javax.swing.JLabel Cubo3C3G;
    private javax.swing.JLabel Cubo3C3J;
    private javax.swing.JLabel Cubo3C3T;
    private javax.swing.JComboBox<String> Cubo3C4;
    private javax.swing.JLabel Cubo3C4G;
    private javax.swing.JLabel Cubo3C4J;
    private javax.swing.JLabel Cubo3C4T;
    private javax.swing.JComboBox<String> Cubo3C5;
    private javax.swing.JLabel Cubo3C5G;
    private javax.swing.JLabel Cubo3C5J;
    private javax.swing.JLabel Cubo3C5T;
    private javax.swing.JComboBox<String> Cubo3C6;
    private javax.swing.JLabel Cubo3C6G;
    private javax.swing.JLabel Cubo3C6J;
    private javax.swing.JLabel Cubo3C6T;
    private javax.swing.JComboBox<String> Cubo4C1;
    private javax.swing.JLabel Cubo4C1G;
    private javax.swing.JLabel Cubo4C1J;
    private javax.swing.JComboBox<String> Cubo4C2;
    private javax.swing.JLabel Cubo4C2G;
    private javax.swing.JLabel Cubo4C2J;
    private javax.swing.JComboBox<String> Cubo4C3;
    private javax.swing.JLabel Cubo4C3G;
    private javax.swing.JLabel Cubo4C3J;
    private javax.swing.JLabel Cubo4C3T;
    private javax.swing.JComboBox<String> Cubo4C4;
    private javax.swing.JLabel Cubo4C4G;
    private javax.swing.JLabel Cubo4C4J;
    private javax.swing.JLabel Cubo4C4T;
    private javax.swing.JComboBox<String> Cubo4C5;
    private javax.swing.JLabel Cubo4C5G;
    private javax.swing.JLabel Cubo4C5J;
    private javax.swing.JLabel Cubo4C5T;
    private javax.swing.JComboBox<String> Cubo4C6;
    private javax.swing.JLabel Cubo4C6G;
    private javax.swing.JLabel Cubo4C6J;
    private javax.swing.JLabel Cubo4C6T;
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
    private javax.swing.JButton genAleatorio;
    private javax.swing.JButton genAleatorio1;
    private javax.swing.JButton genCubo1;
    private javax.swing.JButton genCubo2;
    private javax.swing.JButton genCubo3;
    private javax.swing.JButton genCubo4;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel resueltoLbl;
    private javax.swing.JButton siguienteBtn;
    // End of variables declaration//GEN-END:variables
}
