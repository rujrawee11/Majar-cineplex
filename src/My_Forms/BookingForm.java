/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Forms;

import My_Classes.Func_Class;
import My_Classes.ticket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class BookingForm extends javax.swing.JFrame {

    My_Classes.Func_Class func = new Func_Class();
    My_Classes.ticket buy = new My_Classes.ticket();

    private double num = 0;
    private int count = 0;
    private String name = "";
    private ArrayList seat;
    private String sr;
    private boolean status = false;
    private String mvn, cnm, tm, dt;

    /**
     * Creates new form BookingForm
     */
    public BookingForm() {
        initComponents();

        seat = new ArrayList();

        func.displayImage2(A1.getWidth(), A1.getHeight(), null, "/My_Images/chair.png", A1);
        func.displayImage2(A2.getWidth(), A2.getHeight(), null, "/My_Images/chair.png", A2);
        func.displayImage2(A3.getWidth(), A3.getHeight(), null, "/My_Images/chair.png", A3);
        func.displayImage2(A4.getWidth(), A4.getHeight(), null, "/My_Images/chair.png", A4);
        func.displayImage2(A5.getWidth(), A5.getHeight(), null, "/My_Images/chair.png", A5);
        func.displayImage2(A6.getWidth(), A6.getHeight(), null, "/My_Images/chair.png", A6);
        func.displayImage2(A7.getWidth(), A7.getHeight(), null, "/My_Images/chair.png", A7);
        func.displayImage2(A8.getWidth(), A8.getHeight(), null, "/My_Images/chair.png", A8);
        func.displayImage2(B1.getWidth(), B1.getHeight(), null, "/My_Images/chair.png", B1);
        func.displayImage2(B2.getWidth(), B2.getHeight(), null, "/My_Images/chair.png", B2);
        func.displayImage2(B3.getWidth(), B3.getHeight(), null, "/My_Images/chair.png", B3);
        func.displayImage2(B4.getWidth(), B4.getHeight(), null, "/My_Images/chair.png", B4);
        func.displayImage2(B5.getWidth(), B5.getHeight(), null, "/My_Images/chair.png", B5);
        func.displayImage2(B6.getWidth(), B6.getHeight(), null, "/My_Images/chair.png", B6);
        func.displayImage2(B7.getWidth(), B7.getHeight(), null, "/My_Images/chair.png", B7);
        func.displayImage2(B8.getWidth(), B8.getHeight(), null, "/My_Images/chair.png", B8);
        func.displayImage2(C1.getWidth(), C1.getHeight(), null, "/My_Images/chair.png", C1);
        func.displayImage2(C2.getWidth(), C2.getHeight(), null, "/My_Images/chair.png", C2);
        func.displayImage2(C3.getWidth(), C3.getHeight(), null, "/My_Images/chair.png", C3);
        func.displayImage2(C4.getWidth(), C4.getHeight(), null, "/My_Images/chair.png", C4);
        func.displayImage2(C5.getWidth(), C5.getHeight(), null, "/My_Images/chair.png", C5);
        func.displayImage2(C6.getWidth(), C6.getHeight(), null, "/My_Images/chair.png", C6);
        func.displayImage2(C7.getWidth(), C7.getHeight(), null, "/My_Images/chair.png", C7);
        func.displayImage2(C8.getWidth(), C8.getHeight(), null, "/My_Images/chair.png", C8);
        func.displayImage2(D1.getWidth(), D1.getHeight(), null, "/My_Images/chair.png", D1);
        func.displayImage2(D2.getWidth(), D2.getHeight(), null, "/My_Images/chair.png", D2);
        func.displayImage2(D3.getWidth(), D3.getHeight(), null, "/My_Images/chair.png", D3);
        func.displayImage2(D4.getWidth(), D4.getHeight(), null, "/My_Images/chair.png", D4);
        func.displayImage2(D5.getWidth(), D5.getHeight(), null, "/My_Images/chair.png", D5);
        func.displayImage2(D6.getWidth(), D6.getHeight(), null, "/My_Images/chair.png", D6);
        func.displayImage2(D7.getWidth(), D7.getHeight(), null, "/My_Images/chair.png", D7);
        func.displayImage2(D8.getWidth(), D8.getHeight(), null, "/My_Images/chair.png", D8);
        func.displayImage2(E1.getWidth(), E1.getHeight(), null, "/My_Images/chair.png", E1);
        func.displayImage2(E2.getWidth(), E2.getHeight(), null, "/My_Images/chair.png", E2);
        func.displayImage2(E3.getWidth(), E3.getHeight(), null, "/My_Images/chair.png", E3);
        func.displayImage2(E4.getWidth(), E4.getHeight(), null, "/My_Images/chair.png", E4);
        func.displayImage2(E5.getWidth(), E5.getHeight(), null, "/My_Images/chair.png", E5);
        func.displayImage2(E6.getWidth(), E6.getHeight(), null, "/My_Images/chair.png", E6);
        func.displayImage2(E7.getWidth(), E7.getHeight(), null, "/My_Images/chair.png", E7);
        func.displayImage2(E8.getWidth(), E8.getHeight(), null, "/My_Images/chair.png", E8);
        func.displayImage2(F1.getWidth(), F1.getHeight(), null, "/My_Images/chair.png", F1);
        func.displayImage2(F2.getWidth(), F2.getHeight(), null, "/My_Images/chair.png", F2);
        func.displayImage2(F3.getWidth(), F3.getHeight(), null, "/My_Images/chair.png", F3);
        func.displayImage2(F4.getWidth(), F4.getHeight(), null, "/My_Images/chair.png", F4);
        func.displayImage2(F5.getWidth(), F5.getHeight(), null, "/My_Images/chair.png", F5);
        func.displayImage2(F6.getWidth(), F6.getHeight(), null, "/My_Images/chair.png", F6);
        func.displayImage2(F7.getWidth(), F7.getHeight(), null, "/My_Images/chair.png", F7);
        func.displayImage2(F8.getWidth(), F8.getHeight(), null, "/My_Images/chair.png", F8);

        txt1.setEditable(false);
        txt2.setEditable(false);
        txt3.setEditable(false);
        setLocationRelativeTo(null);

        A1.setEnabled(status);
        A2.setEnabled(status);
        A3.setEnabled(status);
        A4.setEnabled(status);
        A5.setEnabled(status);
        A6.setEnabled(status);
        A7.setEnabled(status);
        A8.setEnabled(status);
        B1.setEnabled(status);
        B2.setEnabled(status);
        B3.setEnabled(status);
        B4.setEnabled(status);
        B5.setEnabled(status);
        B6.setEnabled(status);
        B7.setEnabled(status);
        B8.setEnabled(status);
        C1.setEnabled(status);
        C2.setEnabled(status);
        C3.setEnabled(status);
        C4.setEnabled(status);
        C5.setEnabled(status);
        C6.setEnabled(status);
        C7.setEnabled(status);
        C8.setEnabled(status);
        D1.setEnabled(status);
        D2.setEnabled(status);
        D3.setEnabled(status);
        D4.setEnabled(status);
        D5.setEnabled(status);
        D6.setEnabled(status);
        D7.setEnabled(status);
        D8.setEnabled(status);
        E1.setEnabled(status);
        E2.setEnabled(status);
        E3.setEnabled(status);
        E4.setEnabled(status);
        E5.setEnabled(status);
        E6.setEnabled(status);
        E7.setEnabled(status);
        E8.setEnabled(status);
        F1.setEnabled(status);
        F2.setEnabled(status);
        F3.setEnabled(status);
        F4.setEnabled(status);
        F5.setEnabled(status);
        F6.setEnabled(status);
        F7.setEnabled(status);
        F8.setEnabled(status);
        buyBtn.setEnabled(status);
        name1.setEnabled(status);
        cinima.setEnabled(status);
        jLabel4.setEnabled(status);
        txt1.setEnabled(status);
        jLabel17.setEnabled(status);
        date.setEnabled(status);
        time.setEnabled(status);
        jLabel1.setEnabled(status);
        jLabel16.setEnabled(status);
        jLabel15.setEnabled(status);
        txt2.setEnabled(status);
        txt3.setEnabled(status);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        A1 = new javax.swing.JToggleButton();
        A2 = new javax.swing.JToggleButton();
        A4 = new javax.swing.JToggleButton();
        A3 = new javax.swing.JToggleButton();
        A5 = new javax.swing.JToggleButton();
        A6 = new javax.swing.JToggleButton();
        A8 = new javax.swing.JToggleButton();
        A7 = new javax.swing.JToggleButton();
        B5 = new javax.swing.JToggleButton();
        B6 = new javax.swing.JToggleButton();
        B8 = new javax.swing.JToggleButton();
        B7 = new javax.swing.JToggleButton();
        B1 = new javax.swing.JToggleButton();
        B2 = new javax.swing.JToggleButton();
        B4 = new javax.swing.JToggleButton();
        B3 = new javax.swing.JToggleButton();
        C5 = new javax.swing.JToggleButton();
        C6 = new javax.swing.JToggleButton();
        C8 = new javax.swing.JToggleButton();
        C7 = new javax.swing.JToggleButton();
        C1 = new javax.swing.JToggleButton();
        C2 = new javax.swing.JToggleButton();
        C4 = new javax.swing.JToggleButton();
        C3 = new javax.swing.JToggleButton();
        D5 = new javax.swing.JToggleButton();
        D6 = new javax.swing.JToggleButton();
        D8 = new javax.swing.JToggleButton();
        D7 = new javax.swing.JToggleButton();
        D1 = new javax.swing.JToggleButton();
        D2 = new javax.swing.JToggleButton();
        D4 = new javax.swing.JToggleButton();
        D3 = new javax.swing.JToggleButton();
        E1 = new javax.swing.JToggleButton();
        E2 = new javax.swing.JToggleButton();
        E3 = new javax.swing.JToggleButton();
        E4 = new javax.swing.JToggleButton();
        E5 = new javax.swing.JToggleButton();
        E6 = new javax.swing.JToggleButton();
        E7 = new javax.swing.JToggleButton();
        E8 = new javax.swing.JToggleButton();
        F1 = new javax.swing.JToggleButton();
        F2 = new javax.swing.JToggleButton();
        F3 = new javax.swing.JToggleButton();
        F4 = new javax.swing.JToggleButton();
        F5 = new javax.swing.JToggleButton();
        F6 = new javax.swing.JToggleButton();
        F7 = new javax.swing.JToggleButton();
        F8 = new javax.swing.JToggleButton();
        buyBtn = new javax.swing.JButton();
        txt3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        name1 = new javax.swing.JTextField();
        cinima = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        showBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Number of seats :");

        txt1.setBackground(new java.awt.Color(235, 235, 235));
        txt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        date.setBackground(new java.awt.Color(235, 235, 235));
        date.setToolTipText("");
        date.setDateFormatString("yyyy-MM-dd");
        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date.setMaxSelectableDate(null);
        date.setMinSelectableDate(new java.util.Date(1639591278000L));
        date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datePropertyChange(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(196, 196, 196));
        jLabel1.setFont(new java.awt.Font("Prompt", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Screen");
        jLabel1.setOpaque(true);

        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });

        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });

        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });

        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });

        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });

        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });

        D6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D6ActionPerformed(evt);
            }
        });

        D8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D8ActionPerformed(evt);
            }
        });

        D7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D7ActionPerformed(evt);
            }
        });

        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });

        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });

        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });

        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });

        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E2ActionPerformed(evt);
            }
        });

        E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E3ActionPerformed(evt);
            }
        });

        E4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4ActionPerformed(evt);
            }
        });

        E5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E5ActionPerformed(evt);
            }
        });

        E6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E6ActionPerformed(evt);
            }
        });

        E7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E7ActionPerformed(evt);
            }
        });

        E8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E8ActionPerformed(evt);
            }
        });

        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });

        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2ActionPerformed(evt);
            }
        });

        F3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3ActionPerformed(evt);
            }
        });

        F4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F4ActionPerformed(evt);
            }
        });

        F5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F5ActionPerformed(evt);
            }
        });

        F6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F6ActionPerformed(evt);
            }
        });

        F7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F7ActionPerformed(evt);
            }
        });

        F8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F8ActionPerformed(evt);
            }
        });

        buyBtn.setBackground(new java.awt.Color(255, 222, 125));
        buyBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buyBtn.setText("Buy");
        buyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyBtnActionPerformed(evt);
            }
        });

        txt3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Total price");

        txt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Seats");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Date :");

        time.setEditable(false);
        time.setFont(new java.awt.Font("Pridi SemiBold", 1, 16)); // NOI18N
        time.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        name1.setEditable(false);
        name1.setBackground(new java.awt.Color(31, 29, 54));
        name1.setFont(new java.awt.Font("Pridi SemiBold", 1, 14)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });

        cinima.setEditable(false);
        cinima.setBackground(new java.awt.Color(31, 29, 54));
        cinima.setFont(new java.awt.Font("Pridi SemiBold", 1, 14)); // NOI18N
        cinima.setForeground(new java.awt.Color(255, 255, 255));
        cinima.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cinima.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("jLabel2");

        showBtn.setBackground(new java.awt.Color(255, 51, 51));
        showBtn.setFont(new java.awt.Font("Prompt", 1, 14)); // NOI18N
        showBtn.setForeground(new java.awt.Color(255, 255, 255));
        showBtn.setText("OK");
        showBtn.setAlignmentY(0.0F);
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Prompt", 1, 24)); // NOI18N
        jLabel3.setText("Please select your seats.");

        jLabel7.setFont(new java.awt.Font("Prompt", 1, 14)); // NOI18N
        jLabel7.setText("A");

        jLabel6.setFont(new java.awt.Font("Prompt", 1, 14)); // NOI18N
        jLabel6.setText("B");

        jLabel8.setFont(new java.awt.Font("Prompt", 1, 14)); // NOI18N
        jLabel8.setText("C");

        jLabel9.setFont(new java.awt.Font("Prompt", 1, 14)); // NOI18N
        jLabel9.setText("D");

        jLabel25.setFont(new java.awt.Font("Prompt", 1, 14)); // NOI18N
        jLabel25.setText("E");

        jLabel26.setFont(new java.awt.Font("Prompt", 1, 14)); // NOI18N
        jLabel26.setText("F");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(266, 266, 266)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cinima, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(buyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(241, 241, 241))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(18, 30, Short.MAX_VALUE)
                                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel25)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(101, 101, 101)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(F5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(F6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(F7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(F8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(E6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(E7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(E8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))
                        .addComponent(showBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinima, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(E5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(E6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(E8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(E7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(F5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(F6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(F8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(F7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(A2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(A4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel7)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel6)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel8)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel9)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25)
                                .addGap(21, 21, 21)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(F1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel26)))))
                .addGap(18, 18, 18)
                .addComponent(buyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt2ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    private void F8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F8ActionPerformed
        // TODO add your handling code here:
        if (F8.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("F8");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            jLabel2.setText("F8");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("F8");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            jLabel2.setText("F8");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }


    }//GEN-LAST:event_F8ActionPerformed

    private void F7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F7ActionPerformed
        // TODO add your handling code here:
        if (F7.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("F7");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            jLabel2.setText("F7");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("F7");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
            jLabel2.setText("F7");
        }
    }//GEN-LAST:event_F7ActionPerformed

    private void F6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F6ActionPerformed
        // TODO add your handling code here:
        if (F6.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("F6");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            jLabel2.setText("F6");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("F6");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
            jLabel2.setText("F6");
        }
    }//GEN-LAST:event_F6ActionPerformed

    private void F5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F5ActionPerformed
        // TODO add your handling code here:
        if (F5.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("F5");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("F5");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_F5ActionPerformed

    private void F4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F4ActionPerformed
        // TODO add your handling code here:
        if (F4.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("F4");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("F4");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_F4ActionPerformed

    private void F3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F3ActionPerformed
        // TODO add your handling code here:
        if (F3.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("F3");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("F3");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_F3ActionPerformed

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2ActionPerformed
        // TODO add your handling code here:
        if (F2.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("F2");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("F2");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_F2ActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        // TODO add your handling code here:
        if (F1.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("F1");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("F1");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_F1ActionPerformed

    private void E8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E8ActionPerformed
        // TODO add your handling code here:
        if (E8.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("E8");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("E8");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_E8ActionPerformed

    private void E7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E7ActionPerformed
        // TODO add your handling code here:
        if (E7.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("E7");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("E7");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_E7ActionPerformed

    private void E6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E6ActionPerformed
        // TODO add your handling code here:
        if (E6.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("E6");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("E6");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_E6ActionPerformed

    private void E5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E5ActionPerformed
        // TODO add your handling code here:
        if (E5.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("E5");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("E5");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_E5ActionPerformed

    private void E4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4ActionPerformed
        // TODO add your handling code here:
        if (E4.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("E4");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("E4");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_E4ActionPerformed

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E3ActionPerformed
        // TODO add your handling code here:
        if (E3.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("E3");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("E3");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_E3ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed
        // TODO add your handling code here:
        if (E2.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("E2");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("E2");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_E2ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        // TODO add your handling code here:
        if (E1.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("E1");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("E1");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_E1ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        // TODO add your handling code here:
        if (D3.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("D3");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("D3");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_D3ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        // TODO add your handling code here:
        if (D4.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("D4");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("D4");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_D4ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        // TODO add your handling code here:
        if (D2.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("D2");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("D2");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_D2ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        // TODO add your handling code here:
        if (D1.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("D1");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("D1");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_D1ActionPerformed

    private void D7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D7ActionPerformed
        // TODO add your handling code here:
        if (D7.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("D7");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("D7");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_D7ActionPerformed

    private void D8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D8ActionPerformed
        // TODO add your handling code here:
        if (D8.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("D8");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("D8");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_D8ActionPerformed

    private void D6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D6ActionPerformed
        // TODO add your handling code here:
        if (D6.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("D6");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("D6");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_D6ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
        // TODO add your handling code here:
        if (D5.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("D5");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("D5");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_D5ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
        if (C3.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("C3");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("C3");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        // TODO add your handling code here:
        if (C4.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("C4");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("C4");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_C4ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
        if (C2.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("C2");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("C2");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_C2ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
        if (C1.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("C1");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("C1");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_C1ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        // TODO add your handling code here:
        if (C7.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("C7");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("C7");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_C7ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        // TODO add your handling code here:
        if (C8.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("C8");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("C8");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_C8ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        // TODO add your handling code here:
        if (C6.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("C6");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("C6");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_C6ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        // TODO add your handling code here:
        if (C5.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("C5");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("C5");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_C5ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
        if (B3.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("B3");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("B3");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // TODO add your handling code here:
        if (B4.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("B4");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("B4");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        if (B2.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("B2");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("B2");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        if (B1.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("B1");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("B1");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        // TODO add your handling code here:
        if (B7.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("B7");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("B7");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        // TODO add your handling code here:
        if (B8.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("B8");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("B8");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_B8ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        // TODO add your handling code here:
        if (B6.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("B6");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("B6");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_B6ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // TODO add your handling code here:
        if (B5.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("B5");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("B5");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_B5ActionPerformed

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A7ActionPerformed
        // TODO add your handling code here:
        if (A7.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("A7");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("A7");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_A7ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed
        // TODO add your handling code here:
        if (A8.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("A8");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("A8");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_A8ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        // TODO add your handling code here:
        if (A6.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("A6");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("A6");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_A6ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        // TODO add your handling code here:
        if (A5.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("A5");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("A5");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_A5ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
        if (A3.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("A3");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("A3");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_A3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        // TODO add your handling code here:
        if (A4.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("A4");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("A4");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_A4ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
        if (A2.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("A2");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("A2");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_A2ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
        if (A1.isSelected()) {
            num += Double.parseDouble("120");
            count += Integer.parseInt("1");
            seat.add("A1");
            Collections.sort(seat);
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
        } else {
            num -= Double.parseDouble("120");
            count -= Integer.parseInt("1");
            seat.remove("A1");
            txt1.setText(String.valueOf(count));
            txt2.setText("" + seat);
            txt3.setText(String.valueOf(num) + " THB");
            if (count == 0) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        }
    }//GEN-LAST:event_A1ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void buyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        String movie_name = name1.getText();
        String cinema_name = cinima.getText();
        String number_of_seat = txt1.getText();
        String seat = jLabel2.getText();
        String timer = time.getText();
        String price = txt3.getText();
//        String dat = "2021-12-15";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dat = dateFormat.format(date.getDate());
        if (A1.isSelected()) {
            jLabel2.setText("A1");
            A1.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);

        }
        if (A2.isSelected()) {
            jLabel2.setText("A2");
            A2.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);

        }
        if (A3.isSelected()) {
            jLabel2.setText("A3");
            A3.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);

        }
        if (A4.isSelected()) {
            jLabel2.setText("A4");
            A4.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (A5.isSelected()) {
            jLabel2.setText("A5");
            A5.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (A6.isSelected()) {
            jLabel2.setText("A6");
            A6.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (A7.isSelected()) {
            jLabel2.setText("A7");
            A7.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (A8.isSelected()) {
            jLabel2.setText("A8");
            A8.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (B1.isSelected()) {
            jLabel2.setText("B1");
            B1.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (B2.isSelected()) {
            jLabel2.setText("B2");
            B2.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (B3.isSelected()) {
            jLabel2.setText("B3");
            B3.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (B4.isSelected()) {
            jLabel2.setText("B4");
            B4.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (B5.isSelected()) {
            jLabel2.setText("B5");
            B5.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (B6.isSelected()) {
            jLabel2.setText("B6");
            B6.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (B7.isSelected()) {
            jLabel2.setText("B7");
            B7.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (B8.isSelected()) {
            jLabel2.setText("B8");
            B8.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (C1.isSelected()) {
            jLabel2.setText("C1");
            C1.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (C2.isSelected()) {
            jLabel2.setText("C2");
            C2.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (C3.isSelected()) {
            jLabel2.setText("C3");
            C3.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (C4.isSelected()) {
            jLabel2.setText("C4");
            C4.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (C5.isSelected()) {
            jLabel2.setText("C5");
            C5.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (C6.isSelected()) {
            jLabel2.setText("C6");
            C6.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (C7.isSelected()) {
            jLabel2.setText("C7");
            C7.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (C8.isSelected()) {
            jLabel2.setText("C8");
            C8.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (D1.isSelected()) {
            jLabel2.setText("D1");
            D1.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (D2.isSelected()) {
            jLabel2.setText("D2");
            D2.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (D3.isSelected()) {
            jLabel2.setText("D3");
            D3.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (D4.isSelected()) {
            jLabel2.setText("D4");
            D4.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (D5.isSelected()) {
            jLabel2.setText("D5");
            D5.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (D6.isSelected()) {
            jLabel2.setText("D6");
            D6.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (D7.isSelected()) {
            jLabel2.setText("D7");
            D7.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (D8.isSelected()) {
            jLabel2.setText("D8");
            D8.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (E1.isSelected()) {
            jLabel2.setText("E1");
            E1.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (E2.isSelected()) {
            jLabel2.setText("E2");
            E2.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (E3.isSelected()) {
            jLabel2.setText("E3");
            E3.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (E4.isSelected()) {
            jLabel2.setText("E4");
            E4.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (E5.isSelected()) {
            jLabel2.setText("E5");
            E5.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (E6.isSelected()) {
            jLabel2.setText("E6");
            E6.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (E7.isSelected()) {
            jLabel2.setText("E7");
            E7.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (E8.isSelected()) {
            jLabel2.setText("E8");
            E8.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (F1.isSelected()) {
            jLabel2.setText("F1");
            F1.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (F2.isSelected()) {
            jLabel2.setText("F2");
            F2.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (F3.isSelected()) {
            jLabel2.setText("F3");
            F3.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (F4.isSelected()) {
            jLabel2.setText("F4");

            F4.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (F5.isSelected()) {
            jLabel2.setText("F5");
            F5.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (F6.isSelected()) {
            jLabel2.setText("F6");
            F6.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (F7.isSelected()) {
            jLabel2.setText("F7");
            F7.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        if (F8.isSelected()) {
            jLabel2.setText("F8");
            F8.setEnabled(false);
            seat = jLabel2.getText();
            buy.addTicket(movie_name, cinema_name, Integer.valueOf(number_of_seat), seat, timer, price, dat);
        }
        movieticket mov = new movieticket();
//        My_Forms.GUI bill = new My_Forms.GUI();
        mov.model = (DefaultTableModel) mov.jTable1.getModel();
        mov.getModel().addRow(new Object[]{
            movie_name,
            120,
            Integer.valueOf(number_of_seat),
            120 * Integer.valueOf(number_of_seat)
        });
//        bill.model = (DefaultTableModel) bill.jTable1.getModel();
//        bill.getModel().addRow(new Object[]{
//            movie_name,
//            120,
//            Integer.valueOf(number_of_seat),
//            120 * Integer.valueOf(number_of_seat)
//        });
        mov.setVisible(true);

    }//GEN-LAST:event_buyBtnActionPerformed

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        // TODO add your handling code here:
        jLabel3.setVisible(false);
        jSeparator1.setVisible(false);
        showBtn.setVisible(false);
        
        status = true;

        A1.setEnabled(status);
        A2.setEnabled(status);
        A3.setEnabled(status);
        A4.setEnabled(status);
        A5.setEnabled(status);
        A6.setEnabled(status);
        A7.setEnabled(status);
        A8.setEnabled(status);
        B1.setEnabled(status);
        B2.setEnabled(status);
        B3.setEnabled(status);
        B4.setEnabled(status);
        B5.setEnabled(status);
        B6.setEnabled(status);
        B7.setEnabled(status);
        B8.setEnabled(status);
        C1.setEnabled(status);
        C2.setEnabled(status);
        C3.setEnabled(status);
        C4.setEnabled(status);
        C5.setEnabled(status);
        C6.setEnabled(status);
        C7.setEnabled(status);
        C8.setEnabled(status);
        D1.setEnabled(status);
        D2.setEnabled(status);
        D3.setEnabled(status);
        D4.setEnabled(status);
        D5.setEnabled(status);
        D6.setEnabled(status);
        D7.setEnabled(status);
        D8.setEnabled(status);
        E1.setEnabled(status);
        E2.setEnabled(status);
        E3.setEnabled(status);
        E4.setEnabled(status);
        E5.setEnabled(status);
        E6.setEnabled(status);
        E7.setEnabled(status);
        E8.setEnabled(status);
        F1.setEnabled(status);
        F2.setEnabled(status);
        F3.setEnabled(status);
        F4.setEnabled(status);
        F5.setEnabled(status);
        F6.setEnabled(status);
        F7.setEnabled(status);
        F8.setEnabled(status);
        buyBtn.setEnabled(status);
        name1.setEnabled(status);
        cinima.setEnabled(status);
        jLabel4.setEnabled(status);
        txt1.setEnabled(status);
        jLabel17.setEnabled(status);
        date.setEnabled(status);
        time.setEnabled(status);
        jLabel1.setEnabled(status);
        jLabel16.setEnabled(status);
        jLabel15.setEnabled(status);
        txt2.setEnabled(status);
        txt3.setEnabled(status);

        mvn = name1.getText();
        cnm = cinima.getText();
        tm = time.getText();

        if (date.getDate() == null) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDateTime now = LocalDateTime.now();
            dt = dtf.format(now);
        } else {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dt = dateFormat.format(date.getDate());
        }
        ArrayList<ticket> tList = new ArrayList<>();

        My_Classes.Func_Class func = new Func_Class();

        try {
            String query = "SELECT * FROM `ticket` WHERE `movie_name`= '" + mvn + "' AND `cinema_name`= '" + cnm + "' AND `time`= '" + tm + "' AND `date`= '" + dt + "'";

            ResultSet rs = func.getData(query);

            ticket ticket;

            while (rs.next()) {
                ticket = new ticket(rs.getInt("id"), rs.getString("movie_name"), rs.getString("cinema_name"), rs.getInt("number_of_seat"), rs.getString("seat"), rs.getString("time"), rs.getString("price"), rs.getString("time"));
                tList.add(ticket);
            }
        } catch (SQLException ex) {
            //Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < tList.size(); i++) {
            if (tList.get(i).getSeat().equals("A1")) {
                A1.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("A2")) {
                A2.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("A3")) {
                A3.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("A4")) {
                A4.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("A5")) {
                A5.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("A6")) {
                A6.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("A7")) {
                A7.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("A8")) {
                A8.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("B1")) {
                B1.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("B2")) {
                B2.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("B3")) {
                B3.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("B4")) {
                B4.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("B5")) {
                B5.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("B6")) {
                B6.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("B7")) {
                B7.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("B8")) {
                B8.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("C1")) {
                C1.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("C2")) {
                C2.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("C3")) {
                C3.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("C4")) {
                C4.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("C5")) {
                C5.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("C6")) {
                C6.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("C7")) {
                C7.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("C8")) {
                C8.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("D1")) {
                D1.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("D2")) {
                D2.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("D3")) {
                D3.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("D4")) {
                D4.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("D5")) {
                D5.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("D6")) {
                D6.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("D7")) {
                D7.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("D8")) {
                D8.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("E1")) {
                E1.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("E2")) {
                E2.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("E3")) {
                E3.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("E4")) {
                E4.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("E5")) {
                E5.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("E6")) {
                E6.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("E7")) {
                E7.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("E8")) {
                E8.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("F1")) {
                F1.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("F2")) {
                F2.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("F3")) {
                F3.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("F4")) {
                F4.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("F5")) {
                F5.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("F6")) {
                F6.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("F7")) {
                F7.setEnabled(false);
            }
            if (tList.get(i).getSeat().equals("F8")) {
                F8.setEnabled(false);
            }
        }
    }//GEN-LAST:event_showBtnActionPerformed

    private void datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datePropertyChange
        // TODO add your handling code here:
        if (date.getDate() != null) {
            status = true;
            A1.setEnabled(status);
            A2.setEnabled(status);
            A3.setEnabled(status);
            A4.setEnabled(status);
            A5.setEnabled(status);
            A6.setEnabled(status);
            A7.setEnabled(status);
            A8.setEnabled(status);
            B1.setEnabled(status);
            B2.setEnabled(status);
            B3.setEnabled(status);
            B4.setEnabled(status);
            B5.setEnabled(status);
            B6.setEnabled(status);
            B7.setEnabled(status);
            B8.setEnabled(status);
            C1.setEnabled(status);
            C2.setEnabled(status);
            C3.setEnabled(status);
            C4.setEnabled(status);
            C5.setEnabled(status);
            C6.setEnabled(status);
            C7.setEnabled(status);
            C8.setEnabled(status);
            D1.setEnabled(status);
            D2.setEnabled(status);
            D3.setEnabled(status);
            D4.setEnabled(status);
            D5.setEnabled(status);
            D6.setEnabled(status);
            D7.setEnabled(status);
            D8.setEnabled(status);
            E1.setEnabled(status);
            E2.setEnabled(status);
            E3.setEnabled(status);
            E4.setEnabled(status);
            E5.setEnabled(status);
            E6.setEnabled(status);
            E7.setEnabled(status);
            E8.setEnabled(status);
            F1.setEnabled(status);
            F2.setEnabled(status);
            F3.setEnabled(status);
            F4.setEnabled(status);
            F5.setEnabled(status);
            F6.setEnabled(status);
            F7.setEnabled(status);
            F8.setEnabled(status);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dt = dateFormat.format(date.getDate());

            ArrayList<ticket> tList = new ArrayList<>();

            My_Classes.Func_Class func = new Func_Class();

            try {
                String query = "SELECT * FROM `ticket` WHERE `movie_name`= '" + mvn + "' AND `cinema_name`= '" + cnm + "' AND `time`= '" + tm + "' AND `date`= '" + dt + "'";

                ResultSet rs = func.getData(query);

                ticket ticket;

                while (rs.next()) {
                    ticket = new ticket(rs.getInt("id"), rs.getString("movie_name"), rs.getString("cinema_name"), rs.getInt("number_of_seat"), rs.getString("seat"), rs.getString("time"), rs.getString("price"), rs.getString("time"));
                    tList.add(ticket);
                }
            } catch (SQLException ex) {
                //Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
            }

            for (int i = 0; i < tList.size(); i++) {
                if (tList.get(i).getSeat().equals("A1")) {
                    A1.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("A2")) {
                    A2.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("A3")) {
                    A3.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("A4")) {
                    A4.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("A5")) {
                    A5.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("A6")) {
                    A6.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("A7")) {
                    A7.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("A8")) {
                    A8.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("B1")) {
                    B1.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("B2")) {
                    B2.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("B3")) {
                    B3.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("B4")) {
                    B4.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("B5")) {
                    B5.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("B6")) {
                    B6.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("B7")) {
                    B7.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("B8")) {
                    B8.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("C1")) {
                    C1.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("C2")) {
                    C2.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("C3")) {
                    C3.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("C4")) {
                    C4.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("C5")) {
                    C5.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("C6")) {
                    C6.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("C7")) {
                    C7.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("C8")) {
                    C8.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("D1")) {
                    D1.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("D2")) {
                    D2.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("D3")) {
                    D3.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("D4")) {
                    D4.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("D5")) {
                    D5.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("D6")) {
                    D6.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("D7")) {
                    D7.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("D8")) {
                    D8.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("E1")) {
                    E1.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("E2")) {
                    E2.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("E3")) {
                    E3.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("E4")) {
                    E4.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("E5")) {
                    E5.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("E6")) {
                    E6.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("E7")) {
                    E7.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("E8")) {
                    E8.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("F1")) {
                    F1.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("F2")) {
                    F2.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("F3")) {
                    F3.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("F4")) {
                    F4.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("F5")) {
                    F5.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("F6")) {
                    F6.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("F7")) {
                    F7.setEnabled(false);
                }
                if (tList.get(i).getSeat().equals("F8")) {
                    F8.setEnabled(false);
                }
            }
        }


    }//GEN-LAST:event_datePropertyChange

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton A1;
    private javax.swing.JToggleButton A2;
    private javax.swing.JToggleButton A3;
    private javax.swing.JToggleButton A4;
    private javax.swing.JToggleButton A5;
    private javax.swing.JToggleButton A6;
    private javax.swing.JToggleButton A7;
    private javax.swing.JToggleButton A8;
    private javax.swing.JToggleButton B1;
    private javax.swing.JToggleButton B2;
    private javax.swing.JToggleButton B3;
    private javax.swing.JToggleButton B4;
    private javax.swing.JToggleButton B5;
    private javax.swing.JToggleButton B6;
    private javax.swing.JToggleButton B7;
    private javax.swing.JToggleButton B8;
    private javax.swing.JToggleButton C1;
    private javax.swing.JToggleButton C2;
    private javax.swing.JToggleButton C3;
    private javax.swing.JToggleButton C4;
    private javax.swing.JToggleButton C5;
    private javax.swing.JToggleButton C6;
    private javax.swing.JToggleButton C7;
    private javax.swing.JToggleButton C8;
    private javax.swing.JToggleButton D1;
    private javax.swing.JToggleButton D2;
    private javax.swing.JToggleButton D3;
    private javax.swing.JToggleButton D4;
    private javax.swing.JToggleButton D5;
    private javax.swing.JToggleButton D6;
    private javax.swing.JToggleButton D7;
    private javax.swing.JToggleButton D8;
    private javax.swing.JToggleButton E1;
    private javax.swing.JToggleButton E2;
    private javax.swing.JToggleButton E3;
    private javax.swing.JToggleButton E4;
    private javax.swing.JToggleButton E5;
    private javax.swing.JToggleButton E6;
    private javax.swing.JToggleButton E7;
    private javax.swing.JToggleButton E8;
    private javax.swing.JToggleButton F1;
    private javax.swing.JToggleButton F2;
    private javax.swing.JToggleButton F3;
    private javax.swing.JToggleButton F4;
    private javax.swing.JToggleButton F5;
    private javax.swing.JToggleButton F6;
    private javax.swing.JToggleButton F7;
    private javax.swing.JToggleButton F8;
    private javax.swing.JButton buyBtn;
    public javax.swing.JTextField cinima;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField name1;
    private javax.swing.JButton showBtn;
    public javax.swing.JTextField time;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables

}
