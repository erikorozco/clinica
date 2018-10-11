
package recepcion;

import aportacion.Aportacion;
import backend.recepcionDAO;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


 
public class aportaciones extends javax.swing.JFrame {

    /**
     * Creates new form aportaciones
     */
    public aportaciones() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagen/Diapositiva11.PNG")).getImage());
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Aportaciones");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imp1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        expapor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        imp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        aportacionEntrada1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        concepto = new javax.swing.JTextArea();
        salir = new javax.swing.JButton();

        imp1.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        imp1.setText("Imprimir Ticket ");
        imp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imp1ActionPerformed(evt);
            }
        });
        imp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                imp1KeyReleased(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/aportaciones.png"))); // NOI18N

        expapor.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        expapor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                expaporKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("EngraversGothic BT", 1, 18)); // NOI18N
        jLabel2.setText("No. de Expediente ");

        imp.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        imp.setText("Imprimir Ticket ");
        imp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impActionPerformed(evt);
            }
        });
        imp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                impKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("EngraversGothic BT", 1, 18)); // NOI18N
        jLabel3.setText("Aportación ");

        aportacionEntrada1.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        aportacionEntrada1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aportacionEntrada1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aportacionEntrada1KeyTyped(evt);
            }
        });

        concepto.setColumns(20);
        concepto.setRows(5);
        concepto.setBorder(javax.swing.BorderFactory.createTitledBorder("Concepto"));
        jScrollPane2.setViewportView(concepto);

        salir.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        salir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                salirKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imp)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(495, 495, 495)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aportacionEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(expapor, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(salir)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expapor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(aportacionEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(imp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(salir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aportacionEntrada1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aportacionEntrada1KeyTyped
        char tel=evt.getKeyChar();
        if((tel<'0' || tel>'9')) evt.consume();
      
    }//GEN-LAST:event_aportacionEntrada1KeyTyped

    private void expaporKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_expaporKeyTyped
        char tel=evt.getKeyChar();
        if((tel<'0' || tel>'9')) evt.consume();
    
    }//GEN-LAST:event_expaporKeyTyped

    private void impActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impActionPerformed
        recepcionDAO ob=new recepcionDAO();//validar que el expdiente  exista
         if(expapor.getText().isEmpty() || !ob.verificarExp(Integer.parseInt(expapor.getText()))){
            JOptionPane.showMessageDialog(null,
                    "No existe ese numero de expediente o campos vacios",
                    "Error de expediente",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(aportacionEntrada1.getText().isEmpty() || concepto.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,
                    "Falta llenar campo de aportacion o concepto",
                    "Error de ticket",
                    JOptionPane.ERROR_MESSAGE);   
            return;
        }        
         {
        aportacion.Aportacion ticket = new Aportacion("192.168.1.100", "Aplicacion", "postgres", "$@Lud1n73gral");
        Date now = new Date(System.currentTimeMillis());
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(now.toString());
        ticket.generarAportación(Integer.parseInt(expapor.getText()), date.format(now), Double.parseDouble(aportacionEntrada1.getText().toUpperCase()), concepto.getText());
        ticket.imprimir();
        }
    }//GEN-LAST:event_impActionPerformed

    private void aportacionEntrada1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aportacionEntrada1KeyReleased
        char cTeclaPresionada=evt.getKeyChar();
       String aux=aportacionEntrada1.getText();
        aportacionEntrada1.setText(aux.toUpperCase());
       if(cTeclaPresionada==KeyEvent.VK_ENTER){           
            imp.doClick();
        }
    
    }//GEN-LAST:event_aportacionEntrada1KeyReleased

    private void impKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_impKeyReleased
        char cTeclaPresionada=evt.getKeyChar();
                if(cTeclaPresionada==KeyEvent.VK_ENTER){           
            imp.doClick();
                }
    }//GEN-LAST:event_impKeyReleased

    private void imp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imp1ActionPerformed

    private void imp1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imp1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_imp1KeyReleased

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.hide();
    }//GEN-LAST:event_salirActionPerformed

    private void salirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salirKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_salirKeyReleased

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
            java.util.logging.Logger.getLogger(aportaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aportaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aportaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aportaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aportaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aportacionEntrada1;
    private javax.swing.JTextArea concepto;
    private javax.swing.JTextField expapor;
    private javax.swing.JButton imp;
    private javax.swing.JButton imp1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
