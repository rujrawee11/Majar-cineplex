package My_Forms;

import My_Classes.Bill;
import My_Classes.Func_Class;
import My_Forms.GUI;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class movieticket extends javax.swing.JFrame {
SpinnerNumberModel numberModel = new SpinnerNumberModel ( );
    int pay;

    boolean ans, ans2 = false;
    My_Forms.GUI gui = new My_Forms.GUI();
    ArrayList<My_Classes.Bill> list = new ArrayList<>();
    My_Classes.Func_Class func = new Func_Class();


    public movieticket() {
        initComponents();
        func.displayImage(jLabel6.getWidth(), jLabel6.getHeight(), null, "/My_Images/popcorn.png", jLabel6);
        func.displayImage(jLabel8.getWidth(), jLabel8.getHeight(), null, "/My_Images/cola.png", jLabel8);
        func.displayImage(jLabel5.getWidth(), jLabel5.getHeight(), null, "/My_Images/kai.png", jLabel5);
        func.displayImage(jLabel7.getWidth(), jLabel7.getHeight(), null, "/My_Images/kanom.png", jLabel7);

    }

    public DefaultTableModel getModel() {
        return model;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }

    DefaultTableModel model = new DefaultTableModel();

    Connection con;
    PreparedStatement psl;
    PreparedStatement ps2;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        chk1 = new javax.swing.JCheckBox();
        chk2 = new javax.swing.JCheckBox();
        chk3 = new javax.swing.JCheckBox();
        chk4 = new javax.swing.JCheckBox();
        txtodc = new javax.swing.JSpinner();
        txtboxcony = new javax.swing.JSpinner();
        txtsbal = new javax.swing.JSpinner();
        txtsbalcony = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtsub = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpay = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtbal = new javax.swing.JTextField();

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(54, 48, 98));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(54, 48, 98));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MAJAR CINEPLEX FOODS");
        jLabel1.setToolTipText("");

        jLabel_CloseForm_.setBackground(new java.awt.Color(31, 29, 54));
        jLabel_CloseForm_.setFont(new java.awt.Font("Pridi SemiBold", 1, 16)); // NOI18N
        jLabel_CloseForm_.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CloseForm_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CloseForm_.setText("X");
        jLabel_CloseForm_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CloseForm_.setOpaque(true);
        jLabel_CloseForm_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseForm_MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(186, 183, 207));

        jPanel2.setBackground(new java.awt.Color(243, 243, 243));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        chk1.setBackground(new java.awt.Color(243, 243, 243));
        chk1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 13)); // NOI18N
        chk1.setText("POPCORN");
        chk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1ActionPerformed(evt);
            }
        });

        chk2.setBackground(new java.awt.Color(243, 243, 243));
        chk2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 13)); // NOI18N
        chk2.setText("COLA");
        chk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk2ActionPerformed(evt);
            }
        });

        chk3.setBackground(new java.awt.Color(243, 243, 243));
        chk3.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        chk3.setText("CHICKEN");
        chk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk3ActionPerformed(evt);
            }
        });

        chk4.setBackground(new java.awt.Color(243, 243, 243));
        chk4.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 13)); // NOI18N
        chk4.setText("COMBO SET");
        chk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk4ActionPerformed(evt);
            }
        });

        txtodc.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        txtboxcony.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        txtsbal.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        txtsbalcony.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel5.setText("ww");

        jLabel6.setText("22");

        jLabel7.setText("ww");

        jLabel8.setText("ww");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk2)
                    .addComponent(chk1)
                    .addComponent(chk3)
                    .addComponent(chk4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsbalcony, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtodc, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtboxcony, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsbal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk1)
                    .addComponent(txtodc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chk2)
                            .addComponent(txtsbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk3)
                    .addComponent(txtboxcony, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk4)
                    .addComponent(txtsbalcony, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(153, 204, 255));
        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menu", "Price", "Qty", "Total"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(204, 255, 255));
        jTable1.setSelectionForeground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 13)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 13)); // NOI18N
        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 13)); // NOI18N
        jLabel2.setText("Sub total");

        txtsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 13)); // NOI18N
        jLabel3.setText("Cash");

        txtpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpayActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 13)); // NOI18N
        jLabel4.setText("Change");

        txtbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtpay, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txtpay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34))
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk2ActionPerformed

    private void txtbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int sum = 0;
        int price;
        int qty;
        int tot;

        if (chk1.isSelected()) {
            String odc = chk1.getText();
            price = 200;
            qty = Integer.parseInt(txtodc.getValue().toString());
            tot = price * qty;
            model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{
                odc,
                price,
                qty,
                tot
            });

        }

        if (chk2.isSelected()) {
            String Balcony = chk2.getText();
            price = 100;
            qty = Integer.parseInt(txtsbal.getValue().toString());
            tot = price * qty;
            model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{
                Balcony,
                price,
                qty,
                tot
            });

        }

        if (chk3.isSelected()) {
            String Box = chk3.getText();
            price = 300;
            qty = Integer.parseInt(txtboxcony.getValue().toString());
            tot = price * qty;
            model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{
                Box,
                price,
                qty,
                tot
            });

        }

        if (chk4.isSelected()) {
            String Superbal = chk4.getText();
            price = 500;
            qty = Integer.parseInt(txtsbalcony.getValue().toString());
            tot = price * qty;
            model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{
                Superbal,
                price,
                qty,
                tot
            });

        }

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            sum = sum + Integer.parseInt(jTable1.getValueAt(i, 3).toString());
        }
        txtsub.setText(String.valueOf(sum));


    }//GEN-LAST:event_jButton1ActionPerformed

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public void sales() {

        try {
            String subtotal = txtsub.getText();
            String pay = txtpay.getText();
            String tot = txtbal.getText();
            int lastid = 0;

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/java_library_system", "root", "");
            String query;
            query = "INSERT INTO `sales`(`subtotal`, `pay`, `balance`) VALUES (?,?,?)";
            psl = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            psl.setString(1, subtotal);
            psl.setString(2, pay);
            psl.setString(3, tot);
            psl.executeUpdate();

            ResultSet rs = psl.getGeneratedKeys();

            if (rs.next()) {

                lastid = rs.getInt(1);

            }

            int rows = jTable1.getRowCount();
            String query1 = "INSERT INTO `sales_product`(`sales_id`, `tickettype`, `qty`, `price`, `total`) VALUES (?,?,?,?,?)";
            ps2 = con.prepareStatement(query1);

            String tickettype = "";
            int price;
            int qty;
            int total = 0;

            for (int i = 0; i < jTable1.getRowCount(); i++) {
                tickettype = (String) jTable1.getValueAt(i, 0);
                price = (int) jTable1.getValueAt(i, 1);
                qty = (int) jTable1.getValueAt(i, 2);
                total = (int) jTable1.getValueAt(i, 3);

                ps2.setInt(1, lastid);
                ps2.setString(2, tickettype);
                ps2.setInt(3, qty);
                ps2.setInt(4, price);
                ps2.setInt(5, total);
                ps2.executeUpdate();
            }

            JOptionPane.showMessageDialog(this, "Sales Complete","Complete",1);

            HashMap a = new HashMap();
            a.put("invo", lastid);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(movieticket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(movieticket.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          Bill bill = new Bill();

        int sub = Integer.parseInt(txtsub.getText());
        int bal = Integer.parseInt(txtpay.getText()) - sub;
        if (Integer.parseInt(txtpay.getText()) >= sub) {
            pay = Integer.parseInt(txtpay.getText());
            ans = true;

        } else {
            txtpay.setText("");

        }

        if (bal >= 0) {
            txtbal.setText(String.valueOf(bal));
            ans2 = true;
        } else {
             JOptionPane.showMessageDialog(null, "Not enough money", "PAY ERROR", JOptionPane.ERROR_MESSAGE);
        }

        if ((ans == true) && (ans2 == true)) {
            sales();
            System.out.println("a");
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                String tickettype = (String) jTable1.getValueAt(i, 0);
                int price = (int) jTable1.getValueAt(i, 1);
                int qty = (int) jTable1.getValueAt(i, 2);
                int total = (int) jTable1.getValueAt(i, 3);
                System.out.println(tickettype);
                list.add(new Bill(tickettype, price, qty, total));

            }
            this.dispose();
            new GUI(list, sub, pay, bal).setVisible(true);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void chk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk3ActionPerformed

    private void chk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk1ActionPerformed

    private void chk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk4ActionPerformed

    private void txtpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpayActionPerformed

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseForm_MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseForm_MouseClicked

    private void txtsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new movieticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chk1;
    private javax.swing.JCheckBox chk2;
    private javax.swing.JCheckBox chk3;
    private javax.swing.JCheckBox chk4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField txtbal;
    private javax.swing.JSpinner txtboxcony;
    private javax.swing.JSpinner txtodc;
    private javax.swing.JTextField txtpay;
    private javax.swing.JSpinner txtsbal;
    private javax.swing.JSpinner txtsbalcony;
    private javax.swing.JTextField txtsub;
    // End of variables declaration//GEN-END:variables
}
