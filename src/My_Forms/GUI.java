
package My_Forms;

import My_Classes.Bill;
import My_Classes.Func_Class;
import My_Forms.MoviesForm;
import java.awt.Color;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import rojeru_san.complementos.RSTableMetro;


public class GUI extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    My_Classes.Bill bill = new My_Classes.Bill();
    
    My_Classes.Func_Class func = new Func_Class();
    

    public GUI(){}
    
    public GUI(ArrayList<My_Classes.Bill> list, int sub, int pay, int bal) {
        initComponents();
        populateJtableWithMembers("");
       
        String[] colNames = {"Menu", "price", "Qty", "Total"};
        Object[][] rows = new Object[list.size()][colNames.length];
        jTable1.setGridColor(Color.GRAY);
        for (int i = 0; i < list.size(); i++) {
            rows[i][0] = list.get(i).getTickettyp();
            rows[i][1] = list.get(i).getPrice();
            rows[i][2] = list.get(i).getQty();
            rows[i][3] = list.get(i).getTotal();

        }
        System.out.println(list.size());
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable1.setBackground(new Color(80, 100, 122));
        jTable1.setSelectionBackground(new Color(31, 29, 54));
        jTable1.setModel(model);
        
        jb1.setText(sub + "");
        jb2.setText(pay + "");
        jb3.setText(bal + "");

        model = (DefaultTableModel) jTable1.getModel();
        
     
        func.displayImage(281,124, null, "/My_Images/Rectangle_239.png", jLabel8);
        func.displayImage(441,50, null, "/My_Images/RmessageImage_1639150577054.jpg", jLabel9);
        
        setLocationRelativeTo(null);
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }

    public RSTableMetro getjTable1() {
        return jTable1;
    }

    public void setjTable1(RSTableMetro jTable1) {
        this.jTable1 = jTable1;
    }



    public void populateJtableWithMembers(String query) {


    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jLabel_CloseForm_1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jb2 = new javax.swing.JLabel();
        jb3 = new javax.swing.JLabel();
        jb1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new rojeru_san.complementos.RSTableMetro();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_CloseForm_2 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

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

        jLabel_CloseForm_1.setBackground(new java.awt.Color(31, 29, 54));
        jLabel_CloseForm_1.setFont(new java.awt.Font("Pridi SemiBold", 1, 16)); // NOI18N
        jLabel_CloseForm_1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CloseForm_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CloseForm_1.setText("X");
        jLabel_CloseForm_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CloseForm_1.setOpaque(true);
        jLabel_CloseForm_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseForm_1MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(202, 197, 240));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N

        jb2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jb2.setText("jLabel4");

        jb3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jb3.setText("jLabel5");

        jb1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jb1.setText("jLabel3");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("SUBTOTAL");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("CASH");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("CHANGE");

        jTable1.setBackground(new java.awt.Color(255, 222, 125));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Menu", "Price", "Qty.", "Total"
            }
        ));
        jTable1.setAltoHead(32);
        jTable1.setColorBackgoundHead(new java.awt.Color(241, 172, 172));
        jTable1.setColorFilasBackgound1(new java.awt.Color(255, 222, 125));
        jTable1.setColorFilasBackgound2(new java.awt.Color(255, 222, 125));
        jTable1.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        jTable1.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        jTable1.setColorForegroundHead(new java.awt.Color(0, 0, 0));
        jTable1.setColorSelBackgound(new java.awt.Color(0, 0, 0));
        jTable1.setColorSelForeground(new java.awt.Color(204, 204, 204));
        jTable1.setDragEnabled(true);
        jTable1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jTable1.setFuenteFilas(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jTable1.setFuenteFilasSelect(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jTable1.setFuenteHead(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setRowHeight(32);
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("THANK YOU!");

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("MAJAR CINEPLEX THAILAND");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("TEL. 02-1234-1234");

        jLabel_CloseForm_2.setBackground(new java.awt.Color(31, 29, 54));
        jLabel_CloseForm_2.setFont(new java.awt.Font("Pridi SemiBold", 1, 16)); // NOI18N
        jLabel_CloseForm_2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CloseForm_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CloseForm_2.setText("X");
        jLabel_CloseForm_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CloseForm_2.setOpaque(true);
        jLabel_CloseForm_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseForm_2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(102, 102, 102)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel_CloseForm_2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb3))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(55, 55, 55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(33, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(212, 212, 212))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_CloseForm_2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jb1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jb2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb3)
                            .addComponent(jLabel4)))
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(40, 40, 40)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
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

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseForm_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_CloseForm_MouseClicked

    private void jLabel_CloseForm_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseForm_1MouseClicked
        this.dispose();
        /*DashboardForm ds = null;
        try {
            ds = new DashboardForm();
        } catch (SQLException ex) {
            Logger.getLogger(TimeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        ds.setVisible(true);*/
    }//GEN-LAST:event_jLabel_CloseForm_1MouseClicked

    private void jLabel_CloseForm_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseForm_2MouseClicked
        this.dispose();
        /*DashboardForm ds = null;
        try {
            ds = new DashboardForm();
        } catch (SQLException ex) {
            Logger.getLogger(TimeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        ds.setVisible(true);*/
    }//GEN-LAST:event_jLabel_CloseForm_2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_CloseForm_1;
    private javax.swing.JLabel jLabel_CloseForm_2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private rojeru_san.complementos.RSTableMetro jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jb1;
    public javax.swing.JLabel jb2;
    public javax.swing.JLabel jb3;
    // End of variables declaration//GEN-END:variables
}
