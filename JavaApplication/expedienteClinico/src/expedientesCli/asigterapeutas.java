
package expedientesCli;

import backend.expedienteDAO;
import java.awt.event.KeyEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class asigterapeutas extends javax.swing.JFrame {

    
    public asigterapeutas() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagen/Diapositiva1.PNG")).getImage());
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Asignación de terapeutas"); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        busag = new javax.swing.JButton();
        numexp = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        expetable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        busag1 = new javax.swing.JButton();
        numexp1 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        expetable1 = new javax.swing.JTable();
        busag2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        expetable2 = new javax.swing.JTable();
        busag3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Diapositiva3_2.PNG"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar expediente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Unicode MS", 0, 24))); // NOI18N

        busag.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        busag.setText("Buscar");
        busag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busagActionPerformed(evt);
            }
        });
        busag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busagKeyReleased(evt);
            }
        });

        numexp.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        numexp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numexpActionPerformed(evt);
            }
        });
        numexp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numexpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numexpKeyTyped(evt);
            }
        });

        expetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FOLIO", "NOMBRE", "APELLIDOS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        expetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expetableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(expetable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numexp, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busag))
            .addComponent(jScrollPane4)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(busag)
                    .addComponent(numexp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar terapeutas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Unicode MS", 0, 24))); // NOI18N

        busag1.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        busag1.setText("Buscar");
        busag1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busag1ActionPerformed(evt);
            }
        });
        busag1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busag1KeyReleased(evt);
            }
        });

        numexp1.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        numexp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numexp1ActionPerformed(evt);
            }
        });
        numexp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numexp1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numexp1KeyTyped(evt);
            }
        });

        expetable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDOS", "ESPECIALIDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        expetable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expetable1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(expetable1);

        busag2.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        busag2.setText("Asignar Terapeuta");
        busag2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busag2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(numexp1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busag1))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(busag2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(busag1)
                    .addComponent(numexp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(busag2)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Terapeutas asignados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Unicode MS", 0, 24))); // NOI18N

        expetable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDOS", "ESPECIALIDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        expetable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expetable2MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(expetable2);

        busag3.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        busag3.setText("Desasignar");
        busag3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busag3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(busag3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(busag3)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1309, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busagActionPerformed
        
        if(!numexp.getText().isEmpty())
        {
            ((DefaultTableModel)expetable2.getModel()).setRowCount(0);
            expedienteDAO  edao=new expedienteDAO();                 
            Collection<SetGetExp> consulta=edao.buscarExpaAsignar(Integer.parseInt(numexp.getText()));
            Iterator<SetGetExp> it=consulta.iterator();
            SetGetExp arreglo;
            DefaultTableModel tabla = (DefaultTableModel)expetable.getModel();
            tabla.setRowCount(0);
            while(it.hasNext()){
                arreglo=it.next();
                tabla.addRow(arreglo.toObjectArray2());
            }
            
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe de poner un numero de expediente",
                "Error de busqueda", JOptionPane.ERROR_MESSAGE);
        }
        
    
    }//GEN-LAST:event_busagActionPerformed

    private void numexpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numexpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numexpActionPerformed

    private void numexpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numexpKeyReleased
//        char cTeclaPresionada=evt.getKeyChar();
//        String aux=paciente1.getText();
//        paciente1.setText(aux.toUpperCase());
//        if(cTeclaPresionada==KeyEvent.VK_ENTER){
//            busag.doClick();
//        }
    }//GEN-LAST:event_numexpKeyReleased

    private void expetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expetableMouseClicked
        revisarTer();
            
        
    }//GEN-LAST:event_expetableMouseClicked

    private void numexpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numexpKeyTyped
        char tel=evt.getKeyChar();
        if((tel<'0' || tel>'9')) evt.consume();
    }//GEN-LAST:event_numexpKeyTyped

    private void busag1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busag1ActionPerformed
        expedienteDAO  edao=new expedienteDAO();                 
            Collection<SetGetPcontacto> consulta=edao.buscarTerapeutasAsig(numexp1.getText().toUpperCase());
            Iterator<SetGetPcontacto> it=consulta.iterator();
            SetGetPcontacto arreglo;
            DefaultTableModel tabla = (DefaultTableModel)expetable1.getModel();
            tabla.setRowCount(0);
            while(it.hasNext()){
                arreglo=it.next();
                tabla.addRow(arreglo.toObjectArray4());
            }           
    }//GEN-LAST:event_busag1ActionPerformed

    private void numexp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numexp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numexp1ActionPerformed

    private void numexp1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numexp1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_numexp1KeyReleased

    private void numexp1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numexp1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_numexp1KeyTyped

    private void expetable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expetable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_expetable1MouseClicked

    private void busag2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busag2ActionPerformed
        expedienteDAO edao=new expedienteDAO();
        if(expetable1.getSelectedRow()>=0 && expetable.getSelectedRowCount()>=0){            
        
            if(!edao.verificarTerapeutaAsignado(Integer.parseInt(expetable1.getValueAt(expetable1.getSelectedRow(), 0).toString())
                    , Integer.parseInt(expetable.getValueAt(expetable.getSelectedRow(), 0).toString()))){
        try{
                
                SetGetPcontacto persona=new SetGetPcontacto();
                persona.setId_persona(Integer.parseInt(expetable.getValueAt(expetable.getSelectedRow(), 0).toString()));
                persona.setId_terapeuta(Integer.parseInt(expetable1.getValueAt(expetable1.getSelectedRow(), 0).toString()));               
                Vector<SetGetPcontacto> vr = new Vector<>();
                vr.add(persona);
                edao.asignarTerapeuta(vr);               
                JOptionPane.showMessageDialog(null, "Se ha asignado correcamtente este terapeuta");
                revisarTer();
            }
            catch(Exception re){
                JOptionPane.showMessageDialog(null,
                    "No se pudo conectar a la base de datos: " + re.getMessage(),
                    "Error en la alta de persona",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
           else{
            JOptionPane.showMessageDialog(null,
                    "Ese terapeuta ya esta asignado a este expediente",
                    "Error en la asignación de un terapeuta",
                    JOptionPane.ERROR_MESSAGE);
      
            } 
        }
        else{
            JOptionPane.showMessageDialog(null,
                    "Debe de seleccioanar un terapeuta y un expediente",
                    "Error en la asignación de un terapeuta",
                    JOptionPane.ERROR_MESSAGE);
      
            }
    }//GEN-LAST:event_busag2ActionPerformed

    private void expetable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expetable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_expetable2MouseClicked

    private void busagKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busagKeyReleased
       char cTeclaPresionada=evt.getKeyChar();
                if(cTeclaPresionada==KeyEvent.VK_ENTER){           
            busag.doClick();
        }
    }//GEN-LAST:event_busagKeyReleased

    private void busag1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busag1KeyReleased
        char cTeclaPresionada=evt.getKeyChar();
                if(cTeclaPresionada==KeyEvent.VK_ENTER){           
            busag1.doClick();
                }
    }//GEN-LAST:event_busag1KeyReleased

    private void busag3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busag3ActionPerformed
        if(expetable2.getSelectedRow()>=0){
            int i=JOptionPane.showConfirmDialog(this, "¿Estás seguro que deseas desasignar este terapeuta", "Desasignar terapeuta", JOptionPane.YES_NO_OPTION);
        if (i==0){
        expedienteDAO ob=new expedienteDAO();
        ob.eliminarAsignacion(Integer.parseInt(expetable2.getValueAt(expetable2.getSelectedRow(), 0).toString()));
        JOptionPane.showMessageDialog(null, "Se desasignado exitosamente");
        revisarTer();
        }
        }
        else{
            JOptionPane.showMessageDialog(null,
                "No ha seleccionado nungun terapeuta",
                "Debe seleccionar un terapeuta",
                JOptionPane.ERROR_MESSAGE);  
        }
    }//GEN-LAST:event_busag3ActionPerformed

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
            java.util.logging.Logger.getLogger(asigterapeutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(asigterapeutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(asigterapeutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(asigterapeutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new asigterapeutas().setVisible(true);
            }
        });
    }
    public void revisarTer(){
        expedienteDAO  edao=new expedienteDAO();         
        
            Collection<SetGetPcontacto> consulta=edao.buscarTerapeutasAsignados(Integer.parseInt(expetable.getValueAt(expetable.getSelectedRow(), 0).toString()));
            Iterator<SetGetPcontacto> it=consulta.iterator();
            SetGetPcontacto arreglo;
            DefaultTableModel tabla = (DefaultTableModel)expetable2.getModel();
            tabla.setRowCount(0);
            while(it.hasNext()){
                arreglo=it.next();
                tabla.addRow(arreglo.toObjectArray5());
            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton busag;
    private javax.swing.JButton busag1;
    private javax.swing.JButton busag2;
    private javax.swing.JButton busag3;
    private javax.swing.JTable expetable;
    private javax.swing.JTable expetable1;
    private javax.swing.JTable expetable2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField numexp;
    private javax.swing.JTextField numexp1;
    // End of variables declaration//GEN-END:variables
}
