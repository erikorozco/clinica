
package recepcion;

import javax.swing.JOptionPane;
import backend.recepcionDAO;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class pcontacto extends javax.swing.JFrame {
    private int id_persona;

    public pcontacto() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagen/Diapositiva7.PNG")).getImage());
         setLocationRelativeTo(null);
         setResizable(false);
         //jButton2.setEnabled(false);
        setTitle("Primer Contacto");
        extraer2.setEnabled(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        citacal = new com.toedter.calendar.JCalendar();
        hora = new javax.swing.JComboBox();
        extraer = new javax.swing.JButton();
        terapeutatxt1 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        agentera1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ober = new javax.swing.JTextArea();
        agregarb1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        fechadia = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_citas = new javax.swing.JTable();
        eliminar = new javax.swing.JButton();
        horacmbx1 = new javax.swing.JComboBox();
        jScrollPane7 = new javax.swing.JScrollPane();
        agentera3 = new javax.swing.JTable();
        extraer2 = new javax.swing.JButton();
        terapeutatxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PRIMER CONTACTO");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/pcontacto.png"))); // NOI18N

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
        agregarb.setText("Agregar");
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

        citacal.setBackground(new java.awt.Color(255, 255, 255));
        citacal.setFont(new java.awt.Font("EngraversGothic BT", 0, 14)); // NOI18N

        hora.setFont(new java.awt.Font("Gautami", 1, 12)); // NOI18N
        hora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8:30 AM", "8:45 AM", "9:00 AM", "9:15 AM", "9:30 AM", "9:45 AM", "10:00 AM", "10:15 AM", "10:30 AM", "10:45 AM", "11:00 AM", "11:15 AM", "11:30 AM", "11:45 AM", "12:00 PM", "12:15 PM", "12:30 PM", "12:45 PM", "1:00 PM", "1:15 PM", "1:30 PM", "1:45 PM", "2:00 PM", "2:15 PM", "2:30 PM", "2:45 PM", "3:00 PM", "3:15 PM", "3:30 PM", "3:45 PM", "4:00 PM", "4:15 PM", "4:30 PM", "4:45 PM", "5:00 PM", "5:15 PM", "5:30 PM", "5:45 PM", "6:00 PM", "6:15 PM", "6:30 PM", "6:45 PM", "7:00 PM", "7:15 PM", "7:30 PM" }));

        extraer.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        extraer.setText("Buscar");
        extraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraerActionPerformed(evt);
            }
        });

        terapeutatxt1.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        terapeutatxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terapeutatxt1ActionPerformed(evt);
            }
        });
        terapeutatxt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                terapeutatxt1KeyReleased(evt);
            }
        });

        agentera1.setModel(new javax.swing.table.DefaultTableModel(
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
        agentera1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agentera1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(agentera1);

        ober.setColumns(20);
        ober.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        ober.setRows(5);
        ober.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observaciones", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Unicode MS", 0, 14))); // NOI18N
        jScrollPane2.setViewportView(ober);

        agregarb1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        agregarb1.setText("Modificar datos personales");
        agregarb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarb1ActionPerformed(evt);
            }
        });
        agregarb1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                agregarb1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nompc)
                    .addComponent(apeppc)
                    .addComponent(apempc)
                    .addComponent(telpc, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agregarb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(citacal, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(terapeutatxt1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(extraer))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agregarb1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(citacal, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(extraer)
                                .addComponent(terapeutatxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarb)
                    .addComponent(agregarb1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Citas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bookman Old Style", 1, 24))); // NOI18N
        jPanel4.setLayout(null);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Revisar agenda");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(750, 230, 184, 35);

        fechadia.setBackground(new java.awt.Color(255, 255, 255));
        fechadia.setFont(new java.awt.Font("EngraversGothic BT", 0, 14)); // NOI18N
        jPanel4.add(fechadia);
        fechadia.setBounds(690, 27, 290, 180);

        tabla_citas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FOLIO", "PACIENTE", "TELEFONO", "HORA", "FECHA", "TERAPEUTA", "NOTAS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_citas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_citasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_citas);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 670, 260);

        eliminar.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel4.add(eliminar);
        eliminar.setBounds(1197, 250, 120, 33);

        horacmbx1.setFont(new java.awt.Font("Gautami", 1, 12)); // NOI18N
        horacmbx1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AGENDA GENERAL", "AGENDA POR TERAPEUTA" }));
        horacmbx1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                horacmbx1ItemStateChanged(evt);
            }
        });
        horacmbx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horacmbx1ActionPerformed(evt);
            }
        });
        jPanel4.add(horacmbx1);
        horacmbx1.setBounds(1140, 170, 177, 32);

        agentera3.setModel(new javax.swing.table.DefaultTableModel(
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
        agentera3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agentera3MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(agentera3);

        jPanel4.add(jScrollPane7);
        jScrollPane7.setBounds(1030, 70, 280, 90);

        extraer2.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        extraer2.setText("Buscar");
        extraer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraer2ActionPerformed(evt);
            }
        });
        jPanel4.add(extraer2);
        extraer2.setBounds(1199, 30, 110, 33);

        terapeutatxt.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        terapeutatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terapeutatxtActionPerformed(evt);
            }
        });
        terapeutatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                terapeutatxtKeyReleased(evt);
            }
        });
        jPanel4.add(terapeutatxt);
        terapeutatxt.setBounds(1030, 30, 150, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 15, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       //consultar las citas de primer contacto que hay en un determiando dia
        Revisar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if(tabla_citas.getSelectedRow()>=0){
            int i=JOptionPane.showConfirmDialog(this, "¿Estás seguro que deseas eliminar esta cita?", "Eliminar cita", JOptionPane.YES_NO_OPTION);
            if (i==0){
                recepcionDAO ob=new recepcionDAO();
                ob.eliminarAgenda(Integer.parseInt(tabla_citas.getValueAt(tabla_citas.getSelectedRow(), 0).toString()));
                JOptionPane.showMessageDialog(null, "Se ha eliminado la cita exitosamente");
                Revisar();
            }
        }
        else{
            JOptionPane.showMessageDialog(null,
                "No ha seleccionado niguna cita",
                "Debe seleccionar una cita",
                JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_eliminarActionPerformed

    private void horacmbx1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_horacmbx1ItemStateChanged
        if(horacmbx1.getSelectedIndex()==0)
        terapeutatxt.setText(null);
        extraer2.setEnabled(false);
        ((DefaultTableModel)agentera3.getModel()).setRowCount(0);
        if(horacmbx1.getSelectedIndex()==1)
        extraer2.setEnabled(true);
        ((DefaultTableModel)agentera3.getModel()).setRowCount(0);
    }//GEN-LAST:event_horacmbx1ItemStateChanged

    private void horacmbx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horacmbx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horacmbx1ActionPerformed

    private void agentera3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agentera3MouseClicked
        //        int z=-1;
        //        z=agentera1.getSelectedRow();
        //        if(z>=0){
            //        tablaAgenda=(String)agentera1.getValueAt(z,0);
            //        }
        //        else{
            //        JOptionPane.showMessageDialog(null,
                //                    "Debe seleccionar un registro" ,
                //                    "Error de seleccion",
                //                    JOptionPane.ERROR_MESSAGE);
            //    }

    }//GEN-LAST:event_agentera3MouseClicked

    private void extraer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraer2ActionPerformed
        try{
            recepcionDAO rdao=new recepcionDAO();
            Collection<SetGetPcontacto> consulta=rdao.cargarTerapeutaaEnAgenda(terapeutatxt.getText().toUpperCase());
            Iterator<SetGetPcontacto> it=consulta.iterator();
            SetGetPcontacto arreglo;
            DefaultTableModel tabla = (DefaultTableModel)agentera3.getModel();
            tabla.setRowCount(0);
            while(it.hasNext()){
                arreglo=it.next();
                tabla.addRow(arreglo.toObjectArray4());
            }
        }catch(Exception re){
            JOptionPane.showMessageDialog(null,
                "No se pudo conectar a la base de datos: " + re.getMessage(),
                "Error de conexion",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_extraer2ActionPerformed

    private void terapeutatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terapeutatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_terapeutatxtActionPerformed

    private void terapeutatxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_terapeutatxtKeyReleased
        char cTeclaPresionada=evt.getKeyChar();
        String aux=terapeutatxt.getText();
        terapeutatxt.setText(aux.toUpperCase());
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            extraer2.doClick();
        }

    }//GEN-LAST:event_terapeutatxtKeyReleased

    private void agentera1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agentera1MouseClicked

    }//GEN-LAST:event_agentera1MouseClicked

    private void terapeutatxt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_terapeutatxt1KeyReleased
        char cTeclaPresionada=evt.getKeyChar();
        String aux=terapeutatxt1.getText();
        terapeutatxt1.setText(aux.toUpperCase());
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            extraer.doClick();
        }
    }//GEN-LAST:event_terapeutatxt1KeyReleased

    private void terapeutatxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terapeutatxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_terapeutatxt1ActionPerformed

    private void extraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraerActionPerformed
        try{
            recepcionDAO rdao=new recepcionDAO();
            Collection<SetGetPcontacto> consulta=rdao.cargarTerapeutaaEnAgenda(terapeutatxt1.getText().toUpperCase());
            Iterator<SetGetPcontacto> it=consulta.iterator();
            SetGetPcontacto arreglo;
            DefaultTableModel tabla = (DefaultTableModel)agentera1.getModel();
            tabla.setRowCount(0);
            while(it.hasNext()){
                arreglo=it.next();
                tabla.addRow(arreglo.toObjectArray4());
            }
        }catch(Exception re){
            JOptionPane.showMessageDialog(null,
                "No se pudo conectar a la base de datos: " + re.getMessage(),
                "Error de conexion",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_extraerActionPerformed

    private void agregarbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agregarbKeyReleased
        char cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            agregarb.doClick();
        }
    }//GEN-LAST:event_agregarbKeyReleased

    private void agregarbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarbActionPerformed
        //agregar por pirmera vez a una persona
        recepcionDAO rdao=new recepcionDAO();
        if(nompc.getText().isEmpty() || apeppc.getText().isEmpty() || apempc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Revise que todos los campos están correctamente llenados",
                "Error en el llenado de formulario.", JOptionPane.ERROR_MESSAGE);
        }
        else if(agentera1.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null, "No ha seleccionado un terapeuta",
                "Error en el llenado de formulario.", JOptionPane.ERROR_MESSAGE);
        }
        else if(!rdao.verificarCita(hora.getSelectedItem().toString(), new java.sql.Date(citacal.getDate().getTime())
            ,Integer.parseInt(agentera1.getValueAt(agentera1.getSelectedRow(), 0).toString())
        )){
            try{
                SetGetPcontacto persona=new SetGetPcontacto();
                SetGetAgenda cita = new SetGetAgenda();
                persona.setNombre(nompc.getText());
                persona.setApellidoP(apeppc.getText());
                persona.setApellidoM(apempc.getText());
                persona.setTelefono(telpc.getText());
                Vector<SetGetPcontacto> vr = new Vector<>();
                vr.add(persona);
                id_persona = rdao.guardarPersona(vr);

                cita.setId_terapeuta(Integer.parseInt(agentera1.getValueAt(agentera1.getSelectedRow(), 0).toString()));
                cita.setFecha(new java.sql.Date(citacal.getDate().getTime()));
                cita.setHora((String) hora.getSelectedItem().toString());
                cita.setObservacion(ober.getText().toUpperCase());
                cita.setId_expediente(id_persona);
                Vector<SetGetAgenda> vector=new Vector<>();
                vector.add(cita);
                rdao.guardarAgenda(vector);

                JOptionPane.showMessageDialog(null, "Se ha agregado y agendado correctamente a "+persona.getNombre().toUpperCase()+
                    " "+persona.getApellidoP().toUpperCase()+"");
                nompc.setText(null);
                apeppc.setText(null);
                apempc.setText(null);
                telpc.setText(null);
                ((DefaultTableModel)agentera1.getModel()).setRowCount(0);
                terapeutatxt1.setText(null);
            }
            catch(Exception re){
                JOptionPane.showMessageDialog(null,
                    "No se pudo conectar a la base de datos: " + re.getMessage(),
                    "Error en la alta de persona",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Ya hay una cita registrada a esa hora",
                "Error al agendar", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_agregarbActionPerformed

    private void nompcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nompcKeyTyped
        char nom=evt.getKeyChar();
        if(!Character.isLetter(nom) && nom != KeyEvent.VK_SPACE)evt.consume();
    }//GEN-LAST:event_nompcKeyTyped

    private void nompcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nompcActionPerformed

    }//GEN-LAST:event_nompcActionPerformed

    private void apeppcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apeppcKeyTyped
        char nom=evt.getKeyChar();
        if(!Character.isLetter(nom) && nom != KeyEvent.VK_SPACE)evt.consume();
    }//GEN-LAST:event_apeppcKeyTyped

    private void apempcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apempcKeyTyped
        char nom=evt.getKeyChar();
        if(!Character.isLetter(nom) && nom != KeyEvent.VK_SPACE)evt.consume();
    }//GEN-LAST:event_apempcKeyTyped

    private void telpcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telpcKeyTyped

    }//GEN-LAST:event_telpcKeyTyped

    private void telpcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telpcKeyReleased
        char cTeclaPresionada=evt.getKeyChar();
        String aux=telpc.getText();
        telpc.setText(aux.toUpperCase());
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            agregarb.doClick();
        }
    }//GEN-LAST:event_telpcKeyReleased

    private void agregarb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarb1ActionPerformed
       modificar v1=new modificar();
       v1.setVisible(true);
    }//GEN-LAST:event_agregarb1ActionPerformed

    private void agregarb1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agregarb1KeyReleased
        
    }//GEN-LAST:event_agregarb1KeyReleased

    private void tabla_citasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_citasMouseClicked
        String hora;
        if(tabla_citas.getSelectedColumn()==3){
            String []opciones1={"8:30 AM","8:45 AM","9:00 AM","9:15 AM","9:30 AM","9:45 AM","10:00 AM","10:15 AM",
                "10:30 AM","10:45 AM","11:00 AM",
                "11:15 AM","11:30 AM","11:45 AM","12:00 PM","12:15 PM","12:30 PM","12:45 PM","1:00 PM","1:15 PM",
                "1:30 PM","1:45 PM","2:00 PM","2:15 PM","2:30 PM","2:45 PM","3:00 PM","3:15 PM","3:30 PM","3:45 PM",
                "4:00 PM","4:15 PM","4:30 PM","4:45 PM","5:00 PM", "5:15 PM", "5:30 PM", "5:45 PM", "6:00 PM"
               ,"6:15 PM", "6:30 PM", "6:45 PM", "7:00 PM", "7:15 PM", "7:30 PM"};
           hora=JOptionPane.showInputDialog(this,"Seleccione una hora","Horario",JOptionPane.PLAIN_MESSAGE,null,opciones1,"?").toString();
           tabla_citas.setValueAt(hora, tabla_citas.getSelectedRow(), 3);
           try{ 
                        recepcionDAO rdao=new recepcionDAO();
                        SetGetAgenda cita=new SetGetAgenda();
                                              
                        Vector<SetGetAgenda> vr = new Vector<>();
                        vr.add(cita);
                        cita.setHora(hora);
                        rdao.modificarAgenda(vr,Integer.parseInt(tabla_citas.getValueAt(tabla_citas.getSelectedRow(), 0).toString()));
                    }
                    catch(Exception re){
                        JOptionPane.showMessageDialog(null,
                        "No se pudo conectar a la base de datos: " + re.getMessage(),
                        "Error de conexion",
                        JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_tabla_citasMouseClicked
     public void Revisar(){
        recepcionDAO  rdao=new recepcionDAO();         
        if(horacmbx1.getSelectedIndex()==0){
            Collection<SetGetAgenda> consulta=rdao.buscarAgendaGeneral(new java.sql.Date(fechadia.getDate().getTime()));
            Iterator<SetGetAgenda> it=consulta.iterator();
            SetGetAgenda arreglo;
            DefaultTableModel tabla = (DefaultTableModel)tabla_citas.getModel();
            tabla.setRowCount(0);
            while(it.hasNext()){
                arreglo=it.next();
                tabla.addRow(arreglo.toObjectArray2());
        }
        }
        else{
            Collection<SetGetAgenda> consulta=rdao.buscarAgendaTerapeuta(new java.sql.Date(fechadia.getDate().getTime()),
                    Integer.parseInt(agentera3.getValueAt(agentera3.getSelectedRow(), 0).toString()));
            Iterator<SetGetAgenda> it=consulta.iterator();
            SetGetAgenda arreglo;
            DefaultTableModel tabla = (DefaultTableModel)tabla_citas.getModel();
             tabla.setRowCount(0);
            while(it.hasNext()){
                arreglo=it.next();
                tabla.addRow(arreglo.toObjectArray2());
        }    
        }
    }
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
            java.util.logging.Logger.getLogger(pcontacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pcontacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pcontacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pcontacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pcontacto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable agentera1;
    private javax.swing.JTable agentera3;
    private javax.swing.JButton agregarb;
    private javax.swing.JButton agregarb1;
    private javax.swing.JTextField apempc;
    private javax.swing.JTextField apeppc;
    private com.toedter.calendar.JCalendar citacal;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton extraer;
    private javax.swing.JButton extraer2;
    private com.toedter.calendar.JCalendar fechadia;
    private javax.swing.JComboBox hora;
    private javax.swing.JComboBox horacmbx1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JTextField nompc;
    private javax.swing.JTextArea ober;
    private javax.swing.JTable tabla_citas;
    private javax.swing.JTextField telpc;
    private javax.swing.JTextField terapeutatxt;
    private javax.swing.JTextField terapeutatxt1;
    // End of variables declaration//GEN-END:variables
      
    

}
