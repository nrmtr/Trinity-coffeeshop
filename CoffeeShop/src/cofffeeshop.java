
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author nrmtr
 */
public class cofffeeshop extends javax.swing.JPanel {

    /**
     * Creates new form cofffeeshop
     */
    public cofffeeshop() {
        initComponents();
        
        jTableResult.getColumnModel().getColumn(0);
        jTableResult.getColumnModel().getColumn(1);
    }
      
    public void addtable(int id ,String Name, int Quantity ,Double Price){
  
      DefaultTableModel dt = (DefaultTableModel) jTableResult.getModel();
      
      DecimalFormat df = new DecimalFormat("00.00");
      double totPrice = Price * Double.valueOf(Quantity);
      String TotalPrice = df.format(totPrice);
     
      for (int row = 0; row < jTableResult.getRowCount(); row++) {
            if (Name == jTableResult.getValueAt(row, 1)) {
                dt.removeRow(jTableResult.convertColumnIndexToModel(row));
            }
        }
      
      Vector v = new Vector() ;
      
      v.add(id);
      v.add(Name);
      v.add(Quantity);
      v.add(TotalPrice);
      
      dt.addRow(v); 
    }
    
    public void cal(){
        int numOfRow = jTableResult.getRowCount();
        double tot = 0.0;
        
        for (int i = 0; i < numOfRow; i++) {
            double value = Double.parseDouble(jTableResult.getValueAt(i, 3).toString());
            tot += value;
        }
        DecimalFormat df = new DecimalFormat("00.00");
        lbTotal.setText(df.format(tot));
    }

//    public void addtables(int id, String Name,int Quantity, Double Price) {
//        DefaultTableModel dt = (DefaultTableModel) jTableResult.getModel();
//        
//        DecimalFormat df = new DecimalFormat("00.00") ;       
//        double totPrice = Price * Double.valueOf(Quantity) ;
//       
//       String TotalPrice = df.format(totPrice);
//        //add
//        for (int row = 0; row < jTableResult.getRowCount(); row++) {
//            if (Name == jTableResult.getValueAt(row, 1)) {
//                dt.removeRow(jTableResult.convertRowIndexToModel(row));
//            }
//        }
//        
//        Vector v = new Vector();
//        
//        v.add(id);
//        v.add(Name);
//        v.add(Quantity);
//        v.add(TotalPrice);
//        
//        dt.addRow(v);
//    }
    
    

            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        deleteBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfCash = new javax.swing.JTextField();
        lbTotal = new javax.swing.JLabel();
        lbBalance = new javax.swing.JLabel();
        PayBtn = new javax.swing.JButton();
        PrintBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResult = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        espresBtn = new javax.swing.JButton();
        CappuccinoBtn = new javax.swing.JButton();
        LatteBtn = new javax.swing.JButton();
        AmericanoBtn = new javax.swing.JButton();
        MochaBtn = new javax.swing.JButton();
        MacchiatoBtn = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();

        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane2.setViewportView(ta);

        deleteBtn.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/delete.png"))); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel7.setText("Total :");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel8.setText("Cash :");

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel9.setText("Balance :");

        tfCash.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N

        lbTotal.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lbTotal.setText("00");

        lbBalance.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lbBalance.setText("00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(27, 27, 27))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(24, 24, 24)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCash, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(lbTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbTotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lbBalance))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        PayBtn.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        PayBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/coins.png"))); // NOI18N
        PayBtn.setText("Pay");
        PayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayBtnActionPerformed(evt);
            }
        });

        PrintBtn.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        PrintBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/printer.png"))); // NOI18N
        PrintBtn.setText("Print");
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        jTableResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableResult.setToolTipText("");
        jScrollPane1.setViewportView(jTableResult);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(339, 339, 339)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PrintBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        espresBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Espresso/espresso.jpeg"))); // NOI18N
        espresBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espresBtnActionPerformed(evt);
            }
        });

        CappuccinoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cappuccino/Cappuccino.jpg"))); // NOI18N
        CappuccinoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CappuccinoBtnActionPerformed(evt);
            }
        });

        LatteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Latte/mBPxUtTx-735x414.jpeg"))); // NOI18N
        LatteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LatteBtnActionPerformed(evt);
            }
        });

        AmericanoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Americano/americano12.jpg"))); // NOI18N
        AmericanoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmericanoBtnActionPerformed(evt);
            }
        });

        MochaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cafe Mocha/Coffee-Mocha-Recipe.jpg"))); // NOI18N
        MochaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MochaBtnActionPerformed(evt);
            }
        });

        MacchiatoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Macchiato/Macchiato-4cea4fd.png"))); // NOI18N
        MacchiatoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MacchiatoBtnActionPerformed(evt);
            }
        });

        lb1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1.setText("0");

        lb2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb2.setText("0");

        lb4.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lb4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb4.setText("0");

        lb3.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb3.setText("0");

        lb5.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lb5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb5.setText("0");

        lb6.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lb6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb6.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(espresBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AmericanoBtn)
                            .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lb3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(39, 39, 39)
                            .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CappuccinoBtn)
                                .addComponent(LatteBtn))
                            .addGap(42, 42, 42)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(MochaBtn)
                                .addComponent(MacchiatoBtn)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lb5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(39, 39, 39)
                            .addComponent(lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(espresBtn)
                    .addComponent(AmericanoBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb1)
                    .addComponent(lb2))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CappuccinoBtn)
                    .addComponent(MochaBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb3)
                    .addComponent(lb4))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LatteBtn)
                    .addComponent(MacchiatoBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb5)
                    .addComponent(lb6))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void espresBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espresBtnActionPerformed
        int i = Integer.valueOf(lb1.getText());
        ++i; 
        lb1.setText(String.valueOf(i));
        addtable(1, "Espresso",i, 55.0);
        
        cal();
    }//GEN-LAST:event_espresBtnActionPerformed

    private void AmericanoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmericanoBtnActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(lb2.getText());
        ++i; 
        lb2.setText(String.valueOf(i));
        addtable(2, "Americano",i, 55.0);
        
        cal();
    }//GEN-LAST:event_AmericanoBtnActionPerformed

    private void CappuccinoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CappuccinoBtnActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(lb3.getText());
        ++i; 
        lb3.setText(String.valueOf(i));
        addtable(3, "Cappuccino",i, 65.0);
        
        cal();
    }//GEN-LAST:event_CappuccinoBtnActionPerformed

    private void MochaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MochaBtnActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(lb4.getText());
        ++i; 
        lb4.setText(String.valueOf(i));
        addtable(4, "Mocha",i, 65.0);
        
        cal();
    }//GEN-LAST:event_MochaBtnActionPerformed

    private void LatteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LatteBtnActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(lb5.getText());
        ++i; 
        lb5.setText(String.valueOf(i));
        addtable(5, "Latte",i, 65.0);
        
        cal();
    }//GEN-LAST:event_LatteBtnActionPerformed

    private void MacchiatoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MacchiatoBtnActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(lb6.getText());
        ++i; 
        lb6.setText(String.valueOf(i));
        addtable(6, "Macchiato",i, 75.0);
        
        cal();
    }//GEN-LAST:event_MacchiatoBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dt = (DefaultTableModel) jTableResult.getModel();
        String r = dt.getValueAt(jTableResult.getSelectedRow(),0).toString();
        
        //rm product
        int rw = jTableResult.getSelectedRow();
        dt.removeRow(rw);
        
        //quantity lable
        System.out.println(r);
        switch(r) {
            case "1":
                lb1.setText("0"); break;
                
            case "2":
                lb2.setText("0"); break;
                
            case "3":
                lb3.setText("0"); break;
             
            case "4":
                lb4.setText("0"); break;
                
            case "5":
                lb5.setText("0"); break;
                
            case "6":
                lb6.setText("0"); break;
                
                
            default:
                System.out.println("over");
        }
        cal();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void PayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayBtnActionPerformed
        // TODO add your handling code here:
        if(tfCash.getText().isEmpty()){
            JOptionPane.showMessageDialog(tfCash,"Cash is blank");
        }        
        double tot = Double.parseDouble(lbTotal.getText());
        double paid = Double.parseDouble(tfCash.getText());
        double balance = paid - tot ;
                
        DecimalFormat df = new DecimalFormat("00.00") ;   

       
        lbBalance.setText(String.valueOf(df.format(balance)));

        
        
           
        
    }//GEN-LAST:event_PayBtnActionPerformed

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        // TODO add your handling code here:
        
        try {
            Statement s = db.mycon().createStatement();
            
            Date d = new Date();           
            ta.setText("\t       Trinity Coffee Shop  \n");
            String date = d.toString();
            ta.setText(ta.getText() + "\n\t"+date+"\n\n");
            DefaultTableModel df = (DefaultTableModel) jTableResult.getModel();            
            ta.setText(ta.getText() + "---------------------------------------------------------------------------------------\n");
            ta.setText(ta.getText() + "  Item \t\tQty \tPrice" +"\n");
            ta.setText(ta.getText() + "---------------------------------------------------------------------------------------\n");
            
            // get table Product details
            
            for (int i = 0; i < jTableResult.getRowCount(); i++) {
                
                String Name = df.getValueAt(i, 1).toString();
                String Qty = df.getValueAt(i, 2).toString();
                String Price = df.getValueAt(i, 3).toString();
                String balance = lbBalance.getText();
                String cash = tfCash.getText();
                String total = lbTotal.getText();
                
                s.executeUpdate("INSERT INTO Bill (Name, Amount, Cash, Total, Balance,Date) VALUES ('"+Name+"','"+Qty+"','"+cash+"','"+total+"','"+balance+"','"+date+"')"); 
                
                                    
                

                ta.setText(ta.getText() +"  "+ Name+"\t\t"+Qty +"\t"+Price + "\n");
            }
            
            ta.setText(ta.getText() + "---------------------------------------------------------------------------------------\n");
            ta.setText(ta.getText() + "Sub Total : " + lbTotal.getText() +"\n");
            ta.setText(ta.getText() + "Cash      : " + tfCash.getText() +"\n");
            ta.setText(ta.getText() + "Balance   : " + lbBalance.getText() +"\n");
            ta.setText(ta.getText() + "---------------------------------------------------------------------------------------\n");
            ta.setText(ta.getText() + "\t            Trinity be Better...!"+"\n");
            ta.setText(ta.getText() + "                            Thank you for using our service. "+"\n");
            
           
            
           
        ta.print(); //print
            
            
            
        } catch (Exception e) {
            
            System.out.println(e);
            
            
        }
    }//GEN-LAST:event_PrintBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AmericanoBtn;
    private javax.swing.JButton CappuccinoBtn;
    private javax.swing.JButton LatteBtn;
    private javax.swing.JButton MacchiatoBtn;
    private javax.swing.JButton MochaBtn;
    private javax.swing.JButton PayBtn;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton espresBtn;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTableResult;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lbBalance;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTextArea ta;
    private javax.swing.JTextField tfCash;
    // End of variables declaration//GEN-END:variables
}
