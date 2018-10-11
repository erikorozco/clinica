
package administracion;

import backend.administracionDAO;
import java.awt.event.KeyEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class RelacionTerapeuta extends javax.swing.JFrame {
    int id_terapeuta=0;
  
    public RelacionTerapeuta() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagen1/Diapositiva6.PNG")).getImage());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contraseña1 = new javax.swing.JPasswordField();
        jTextField8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        buscarTerapeuta = new javax.swing.JTextField();
        accionBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultadosTerapeuta = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultadosExpediente = new javax.swing.JTable();
        estado = new javax.swing.JComboBox<>();

        jTextField8.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Terapeutas");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/relacion.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        buscarTerapeuta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buscarTerapeuta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarTerapeutaKeyPressed(evt);
            }
        });

        accionBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        accionBuscar.setText("Buscar");
        accionBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accionBuscarActionPerformed(evt);
            }
        });

        resultadosTerapeuta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N. Terapeuta", "Nombre", "Apellidos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        resultadosTerapeuta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        resultadosTerapeuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultadosTerapeutaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(resultadosTerapeuta);
        resultadosTerapeuta.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        resultadosExpediente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N. Exp", "Nombre", "Apellidos", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        resultadosExpediente.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(resultadosExpediente);
        resultadosExpediente.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (resultadosExpediente.getColumnModel().getColumnCount() > 0) {
            resultadosExpediente.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        estado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EN CURSO", "ALTA ABIERTA", "ALTA DEFINITIVA", "DERIVADO", "BAJA" }));
        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buscarTerapeuta, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(accionBuscar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buscarTerapeuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accionBuscar))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel12))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void accionBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accionBuscarActionPerformed
        buscarTerapeutas();
    }//GEN-LAST:event_accionBuscarActionPerformed

    private void resultadosTerapeutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultadosTerapeutaMouseClicked
        this.obtenerExpedientes();
    }//GEN-LAST:event_resultadosTerapeutaMouseClicked

    private void buscarTerapeutaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarTerapeutaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            buscarTerapeutas();
        }
    }//GEN-LAST:event_buscarTerapeutaKeyPressed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        this.obtenerExpedientes();
    }//GEN-LAST:event_estadoActionPerformed
    public void Buscar(){
        administracionDAO  rdao=new administracionDAO();
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelacionTerapeuta().setVisible(true);
            }
        });
    }
    
    private void obtenerExpedientes(){
        Integer seleccionado = terapeutaSeleccionado();
        if(seleccionado == -1){
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún terapeuta.");
            return;
        }
        try{
            administracionDAO dao = new administracionDAO();
            Vector<Object[]> expedientes = dao.expedientesDeTerapeuta(seleccionado, (String)estado.getSelectedItem());
            System.out.println(expedientes.capacity());
            Iterator<Object[]> it = expedientes.iterator();
            DefaultTableModel dtm = (DefaultTableModel)resultadosExpediente.getModel();
            dtm.setRowCount(0);
            
            while(it.hasNext()){
                dtm.addRow(it.next());
            }
        }catch(org.postgresql.util.PSQLException pex){
            JOptionPane.showMessageDialog(null, "Error. ¿Está el servidor central activo?\n" + pex.getMessage());
        }
    }
    
    private Integer terapeutaSeleccionado(){
        Integer fila = resultadosTerapeuta.getSelectedRow();
        if(fila < 0){
            return fila;
        }
        Integer id = (Integer)resultadosTerapeuta.getValueAt(fila, 0);
        return id;
    }
    
    private void limpiarTablas(){
        ((DefaultTableModel)resultadosTerapeuta.getModel()).setRowCount(0);
        ((DefaultTableModel)resultadosExpediente.getModel()).setRowCount(0);
    }
    
    private void buscarTerapeutas(){
        String busqueda = buscarTerapeuta.getText().toUpperCase().trim();
        Integer i;
        if(busqueda.isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo de búsqueda está vacío.");
            return;
        }
        try{
        administracionDAO dao = new administracionDAO();
        Vector<SetGetTer> resultados  = dao.buscarUsuarios(busqueda);
        System.out.print(resultados.firstElement());
        
        if(resultados.isEmpty()){
            JOptionPane.showMessageDialog(null, "Su búsqueda no produjo resultados.");
        }
        DefaultTableModel dftm = (DefaultTableModel)resultadosTerapeuta.getModel();
        dftm.setRowCount(0);
        for(i=0; i < resultados.toArray().length; ++i){
            dftm.addRow(resultados.elementAt(i).toReducedObjectArray());
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error. ¿Está el servidor central activo?.\n" + ex.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accionBuscar;
    private javax.swing.JTextField buscarTerapeuta;
    private javax.swing.JPasswordField contraseña1;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTable resultadosExpediente;
    private javax.swing.JTable resultadosTerapeuta;
    // End of variables declaration//GEN-END:variables
}
