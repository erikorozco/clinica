
package recepcion;

import backend.recepcionDAO;
import java.awt.event.KeyEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class modificar extends javax.swing.JFrame {

   
    public modificar() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagen/Diapositiva1.PNG")).getImage());
         setLocationRelativeTo(null);
         setResizable(false);
         //jButton2.setEnabled(false);
        setTitle("Modificar datos personales");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        telpc = new javax.swing.JTextField();
        apempc = new javax.swing.JTextField();
        apeppc = new javax.swing.JTextField();
        nompc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        agregarb = new javax.swing.JButton();
        extraer = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        personas1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Datos personales");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Nuevo Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("EngraversGothic BT", 1, 24))); // NOI18N

        jLabel4.setFont(new java.awt.Font("EngraversGothic BT", 1, 18)); // NOI18N
        jLabel4.setText("Apellido Materno");

        jLabel3.setFont(new java.awt.Font("EngraversGothic BT", 1, 18)); // NOI18N
        jLabel3.setText("Apellido Paterno");

        jLabel2.setFont(new java.awt.Font("EngraversGothic BT", 1, 18)); // NOI18N
        jLabel2.setText("Nombre");

        telpc.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        telpc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telpcKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telpcKeyTyped(evt);
            }
        });

        apempc.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        apempc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apempcKeyTyped(evt);
            }
        });

        apeppc.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        apeppc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apeppcKeyTyped(evt);
            }
        });

        nompc.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        nompc.setToolTipText("Este campo es obligatorio");
        nompc.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        nompc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nompcActionPerformed(evt);
            }
        });
        nompc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nompcKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("EngraversGothic BT", 1, 18)); // NOI18N
        jLabel6.setText("Telefono");

        agregarb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        agregarb.setText("Modificar");
        agregarb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarbActionPerformed(evt);
            }
        });
        agregarb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                agregarbKeyReleased(evt);
            }
        });

        extraer.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        extraer.setText("Buscar");
        extraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraerActionPerformed(evt);
            }
        });

        nombre.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreKeyReleased(evt);
            }
        });

        personas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDOS"
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
        personas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personas1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(personas1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nompc, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(telpc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                .addComponent(apempc, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(apeppc, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(agregarb, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(extraer, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nompc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(apeppc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(apempc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telpc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(extraer)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(agregarb)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.getAccessibleContext().setAccessibleName("Datos personales");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telpcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telpcKeyReleased
        char cTeclaPresionada=evt.getKeyChar();
        String aux=telpc.getText();
        telpc.setText(aux.toUpperCase());
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            agregarb.doClick();
        }
    }//GEN-LAST:event_telpcKeyReleased

    private void telpcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telpcKeyTyped

    }//GEN-LAST:event_telpcKeyTyped

    private void apempcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apempcKeyTyped
        
    }//GEN-LAST:event_apempcKeyTyped

    private void apeppcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apeppcKeyTyped
        
    }//GEN-LAST:event_apeppcKeyTyped

    private void nompcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nompcActionPerformed

    }//GEN-LAST:event_nompcActionPerformed

    private void nompcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nompcKeyTyped
        
    }//GEN-LAST:event_nompcKeyTyped

    private void agregarbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarbActionPerformed
        //modificar datos de persona           
         if(nompc.getText().isEmpty() || apeppc.getText().isEmpty() || apempc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Revise que todos los campos están correctamente llenados",
                "Error en el llenado de formulario.", JOptionPane.ERROR_MESSAGE);
        }        
         else{            
            try{ 
                        recepcionDAO rdao=new recepcionDAO();
                        SetGetPcontacto persona=new SetGetPcontacto();
                        persona.setNombre(nompc.getText().toUpperCase());
                        persona.setApellidoP(apeppc.getText().toUpperCase());
                        persona.setApellidoM(apempc.getText().toUpperCase());
                        persona.setTelefono(telpc.getText());
                        persona.setId_persona(Integer.parseInt(personas1.getValueAt(personas1.getSelectedRow(),0).toString()));
                        Vector<SetGetPcontacto> vr = new Vector<>();
                        vr.add(persona);
                        rdao.modificarPersonaBoton(vr);
                        JOptionPane.showMessageDialog(null, "Se ha modificado exitosamente");
                        this.hide();
                    }
                    catch(Exception re){
                        JOptionPane.showMessageDialog(null,
                        "No se pudo conectar a la base de datos: " + re.getMessage(),
                        "Error de conexion",
                        JOptionPane.ERROR_MESSAGE);
                    }
         }
    }//GEN-LAST:event_agregarbActionPerformed

    private void agregarbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agregarbKeyReleased
        char cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            agregarb.doClick();
        }
    }//GEN-LAST:event_agregarbKeyReleased

    private void extraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraerActionPerformed
        try{
            recepcionDAO rdao=new recepcionDAO();
            Collection<SetGetPcontacto> consulta=rdao.buscarPersona(nombre.getText().toUpperCase());
            Iterator<SetGetPcontacto> it=consulta.iterator();
            SetGetPcontacto arreglo;
            DefaultTableModel tabla = (DefaultTableModel)personas1.getModel();
            tabla.setRowCount(0);
            while(it.hasNext()){
                arreglo=it.next();
                tabla.addRow(arreglo.toObjectArray5());
            }
        }catch(Exception re){
            JOptionPane.showMessageDialog(null,
                "No se pudo conectar a la base de datos: " + re.getMessage(),
                "Error de conexion",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_extraerActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyReleased
        char cTeclaPresionada=evt.getKeyChar();      
       if(cTeclaPresionada==KeyEvent.VK_ENTER){           
            extraer.doClick();
        }
    }//GEN-LAST:event_nombreKeyReleased

    private void personas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personas1MouseClicked
        try{
            recepcionDAO rdao=new recepcionDAO();
            Collection<SetGetPcontacto> consulta=rdao.buscarPersonaMouseclick(Integer.parseInt
                (personas1.getValueAt(personas1.getSelectedRow(),0).toString()));
            Iterator<SetGetPcontacto> it=consulta.iterator();
            SetGetPcontacto arreglo;
            if(it.hasNext()){
            arreglo=it.next();
            nompc.setText(arreglo.getNombre());
            apeppc.setText(arreglo.getApellidoP());
            apempc.setText(arreglo.getApellidoM());
            telpc.setText(arreglo.getTelefono());

        }
        }catch(Exception re){
            JOptionPane.showMessageDialog(null,
                    "No se pudo conectar a la base de datos: " + re.getMessage(),
                    "Error de conexion",
                    JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_personas1MouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarb;
    private javax.swing.JTextField apempc;
    private javax.swing.JTextField apeppc;
    private javax.swing.JButton extraer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nompc;
    private javax.swing.JTable personas1;
    private javax.swing.JTextField telpc;
    // End of variables declaration//GEN-END:variables
}
