
package administracion;

import backend.administracionDAO;
import java.awt.event.KeyEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;


public class altaTerapeuta extends javax.swing.JFrame {
    int id_terapeuta=0;
  
    public altaTerapeuta() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagen1/Diapositiva6.PNG")).getImage());
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contraseña1 = new javax.swing.JPasswordField();
        jTextField8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        contraseña = new javax.swing.JPasswordField();
        contraseñaconf = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        users = new javax.swing.JTable();
        usuariostx = new javax.swing.JTextField();
        user1 = new javax.swing.JTextField();
        contraseña2 = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        contraseñaconf1 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        actualizarUsuario = new javax.swing.JButton();
        actualizarDatos = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        nuevoNombre = new javax.swing.JTextField();
        nuevoApellidoM = new javax.swing.JTextField();
        nuevaEspecialidad = new javax.swing.JTextField();
        nuevoApellidoP = new javax.swing.JTextField();
        nuevoTelefono = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombretx = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        apeptx = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        apemtx = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        especitx = new javax.swing.JTextField();

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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diapositiva1_1.PNG"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear Usuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("EngraversGothic BT", 0, 18))); // NOI18N

        jLabel7.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        jLabel7.setText("Confirmar contraseña");

        jLabel6.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        jLabel6.setText("Contraseña");

        jLabel5.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        jLabel5.setText("Usuario");

        user.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(user)
                    .addComponent(contraseña)
                    .addComponent(contraseñaconf, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contraseñaconf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar cuentas de usuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 18))); // NOI18N

        users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO P.", "APELLIDO M.", "ESPECIALIDAD", "TELÉFONO", "USUARIO", "CONTRASEÑA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(users);
        if (users.getColumnModel().getColumnCount() > 0) {
            users.getColumnModel().getColumn(0).setPreferredWidth(15);
        }

        usuariostx.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        usuariostx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariostxActionPerformed(evt);
            }
        });

        user1.setEditable(false);
        user1.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("EngraversGothic BT", 0, 14)); // NOI18N
        jLabel13.setText("Nueva contraseña");

        jLabel14.setFont(new java.awt.Font("EngraversGothic BT", 0, 14)); // NOI18N
        jLabel14.setText("Confirmar contraseña");

        jLabel15.setFont(new java.awt.Font("EngraversGothic BT", 0, 14)); // NOI18N
        jLabel15.setText("Usuario");

        jButton3.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("EngraversGothic BT", 0, 14)); // NOI18N
        jLabel16.setText("Nombre");

        jLabel17.setFont(new java.awt.Font("EngraversGothic BT", 0, 14)); // NOI18N
        jLabel17.setText("Apellido paterno");

        jLabel18.setFont(new java.awt.Font("EngraversGothic BT", 0, 14)); // NOI18N
        jLabel18.setText("Apellido materno");

        jLabel19.setFont(new java.awt.Font("EngraversGothic BT", 0, 14)); // NOI18N
        jLabel19.setText("Especialidad");

        actualizarUsuario.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        actualizarUsuario.setText("Modificar");
        actualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarUsuarioActionPerformed(evt);
            }
        });

        actualizarDatos.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        actualizarDatos.setText("Modificar");
        actualizarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarDatosActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("EngraversGothic BT", 0, 14)); // NOI18N
        jLabel20.setText("Teléfono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(481, 481, 481)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usuariostx))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(actualizarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nuevoNombre)
                                            .addComponent(nuevoApellidoM)
                                            .addComponent(nuevaEspecialidad))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nuevoTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                            .addComponent(nuevoApellidoP))))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(user1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(contraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(contraseñaconf1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(actualizarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(50, 50, 50)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuariostx, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(user1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contraseñaconf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(nuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nuevoApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20)
                            .addComponent(nuevoApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nuevoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actualizarUsuario)
                            .addComponent(actualizarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(nuevaEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos personales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Unicode MS", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        jLabel1.setText("Nombre (s)");

        nombretx.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        nombretx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxActionPerformed(evt);
            }
        });
        nombretx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombretxKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        jLabel9.setText("Apellido Paterno");

        apeptx.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        apeptx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apeptxActionPerformed(evt);
            }
        });
        apeptx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apeptxKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        jLabel10.setText("Apellido Materno");

        apemtx.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        apemtx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apemtxActionPerformed(evt);
            }
        });
        apemtx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apemtxKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        jLabel3.setText("Telefono");

        tel.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });
        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        jLabel2.setText("Especialidad");

        especitx.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        especitx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especitxActionPerformed(evt);
            }
        });
        especitx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                especitxKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apeptx, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(nombretx, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(apemtx, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(especitx)
                    .addComponent(tel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombretx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apeptx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apemtx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(especitx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(62, 62, 62)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telActionPerformed

    private void especitxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especitxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especitxActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void nombretxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxActionPerformed

    private void apeptxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apeptxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apeptxActionPerformed

    private void apemtxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apemtxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apemtxActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyTyped
       char tel=evt.getKeyChar();
        if((tel<'0' || tel>'9')) evt.consume();
    }//GEN-LAST:event_telKeyTyped

    private void nombretxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombretxKeyTyped
        char nom=evt.getKeyChar();
        if(!Character.isLetter(nom) && nom != KeyEvent.VK_SPACE)evt.consume();
    }//GEN-LAST:event_nombretxKeyTyped

    private void apeptxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apeptxKeyTyped
       char nom=evt.getKeyChar();
        if(!Character.isLetter(nom) && nom != KeyEvent.VK_SPACE)evt.consume();
    }//GEN-LAST:event_apeptxKeyTyped

    private void apemtxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apemtxKeyTyped
        char nom=evt.getKeyChar();
        if(!Character.isLetter(nom) && nom != KeyEvent.VK_SPACE)evt.consume();
    }//GEN-LAST:event_apemtxKeyTyped

    private void especitxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_especitxKeyTyped
       char nom=evt.getKeyChar();
        if(!Character.isLetter(nom) && nom != KeyEvent.VK_SPACE)evt.consume();
    }//GEN-LAST:event_especitxKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(nombretx.getText().isEmpty() || apeptx.getText().isEmpty() || apemtx.getText().isEmpty() 
                || tel.getText().isEmpty() || especitx.getText().isEmpty() || user.getText().isEmpty() || contraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Revise que todos los campos están correctamente llenados",
                "Error en el llenado de formulario", JOptionPane.ERROR_MESSAGE);
        }        
        else{
            if(contraseña.getText().equals(contraseñaconf.getText()))
        {                    
            Integer nuevoID;
            try{
                administracionDAO adao=new administracionDAO();
                SetGetTer persona=new SetGetTer();
                persona.setNombre(nombretx.getText().toUpperCase());
                persona.setApellidop(apeptx.getText().toUpperCase());
                persona.setApellidom(apemtx.getText().toUpperCase());
                persona.setTelefono(tel.getText().toUpperCase());
                persona.setEspecialidad(especitx.getText().toUpperCase());
                persona.setUsuario(user.getText());
                persona.setContraseña(contraseña.getText());
                Vector<SetGetTer> vr = new Vector<>();
                vr.add(persona);
                nuevoID = adao.guardarTerapeuta(vr);
                System.out.println(nuevoID);
                //id_terapeuta=nuevoID;
                adao.guardarUsuario(vr, nuevoID);
                
                
                JOptionPane.showMessageDialog(null, "Se ha agregado correctamente a "+persona.getNombre().toUpperCase()+
                    " "+persona.getApellidop().toUpperCase()+"");              
                nombretx.setText(null);
                apeptx.setText(null);
                apemtx.setText(null);
                tel.setText(null);
                especitx.setText(null);
                user.setText(null);
                contraseña.setText(null);
                contraseñaconf.setText(null);

            }
            catch(Exception re){
                JOptionPane.showMessageDialog(null,
                    "No se pudo conectar a la base de datos: " + re.getMessage(),
                    "Error en la alta de persona",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
            else{
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden",
                "Contraseñas no coinciden", JOptionPane.ERROR_MESSAGE);
            contraseña.setText(null);
                contraseñaconf.setText(null);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void actualizarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarDatosActionPerformed
        this.actualizarTerapeuta();
    }//GEN-LAST:event_actualizarDatosActionPerformed

    private void actualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarUsuarioActionPerformed
        if(users.getSelectedRow()>=0){
            cambiarContraseña();
            Buscar();
        }
    }//GEN-LAST:event_actualizarUsuarioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Buscar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user1ActionPerformed

    private void usuariostxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariostxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuariostxActionPerformed

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
        this.user1.setText(users.getValueAt(users.getSelectedRow(), 6).toString());
        this.nuevoNombre.setText(users.getValueAt(users.getSelectedRow(), 1).toString());
        this.nuevoApellidoP.setText(users.getValueAt(users.getSelectedRow(), 2).toString());
        this.nuevoApellidoM.setText(users.getValueAt(users.getSelectedRow(), 3).toString());
        this.nuevaEspecialidad.setText(users.getValueAt(users.getSelectedRow(), 4).toString());
        this.nuevoTelefono.setText(users.getValueAt(users.getSelectedRow(), 5).toString());
        this.user1.setText(users.getValueAt(users.getSelectedRow(), 6).toString());
        
    }//GEN-LAST:event_usersMouseClicked
    public void Buscar(){
        contraseñaconf1.setText(null);
            contraseña2.setText(null);
            user1.setText(null);
            nuevoNombre.setText(null);
            nuevoApellidoP.setText(null);
            nuevoApellidoM.setText(null);
            nuevaEspecialidad.setText(null);
            nuevoTelefono.setText(null);
            
        administracionDAO  rdao=new administracionDAO();            
            
                Collection<SetGetTer> consulta=rdao.buscarUsuarios(usuariostx.getText().toUpperCase());
            Iterator<SetGetTer> it=consulta.iterator();
                SetGetTer arreglo;
                DefaultTableModel tabla = (DefaultTableModel)users.getModel();
                tabla.setRowCount(0);
                while(it.hasNext()){
                    arreglo=it.next();
                    tabla.addRow(arreglo.toObjectArray());
                }           
    }
    public void cambiarContraseña(){
        if(contraseñaconf1.getText().isEmpty() || contraseña2.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Revise que todos los campos están correctamente llenados",
                "Error en el llenado de formulario", JOptionPane.ERROR_MESSAGE);           
        }
        else{
        if(contraseñaconf1.getText().equals(contraseña2.getText())){
        try{             
            administracionDAO rdao=new administracionDAO();
             SetGetTer usuario1 = new SetGetTer();
             usuario1.setContraseña(contraseñaconf1.getText());
            Vector<SetGetTer> vector=new Vector<>();
             vector.add(usuario1);
             rdao. modificarContraseña(vector,Integer.parseInt(users.getValueAt(users.getSelectedRow(), 0).toString()));
             JOptionPane.showMessageDialog(null, "Se ha modificado la contraseña exitosamente");  
             contraseñaconf1.setText(null);
             contraseña2.setText(null);
             user1.setText(null);
             nuevoNombre.setText(null);
            nuevoApellidoP.setText(null);
            nuevoApellidoM.setText(null);
            nuevaEspecialidad.setText(null);
            nuevoTelefono.setText(null);
         }
         catch(Exception re){
             re.printStackTrace();
                JOptionPane.showMessageDialog(null,
                    "No se pudo conectar a la base de datos: " + re.getMessage(),
                    "Error al modificar cita",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden",
                "Contraseñas no coinciden", JOptionPane.ERROR_MESSAGE);
            contraseñaconf1.setText(null);
            contraseña2.setText(null);
            user1.setText(null);
            nuevoNombre.setText(null);
            nuevoApellidoP.setText(null);
            nuevoApellidoM.setText(null);
            nuevaEspecialidad.setText(null);
            nuevoTelefono.setText(null);
        }
        
        }
    }
    
    private void actualizarTerapeuta(){
        if(nuevoNombre.getText().isEmpty() || nuevoApellidoP.getText().isEmpty() || nuevoApellidoM.getText().isEmpty() || nuevaEspecialidad.getText().isEmpty() || nuevoTelefono.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Verifique si se llenaron todos los campos.");
            return;
        }
        administracionDAO adm = new administracionDAO();
        Integer id_terapeuta = (Integer)users.getValueAt(users.getSelectedRow(), 0);
        adm.actualizarTerapeuta(nuevoNombre.getText().toUpperCase(), nuevoApellidoP.getText().toUpperCase(), nuevoApellidoM.getText().toUpperCase(), nuevaEspecialidad.getText().toUpperCase(), nuevoTelefono.getText().toUpperCase(), id_terapeuta);
        JOptionPane.showMessageDialog(null, "Se han actualizado correctamente los valores del terapeuta.");
        nuevoNombre.setText(null);
        nuevoApellidoP.setText(null);
        nuevoApellidoM.setText(null);
        nuevaEspecialidad.setText(null);
        nuevoTelefono.setText(null);
        Buscar();
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new altaTerapeuta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarDatos;
    private javax.swing.JButton actualizarUsuario;
    private javax.swing.JTextField apemtx;
    private javax.swing.JTextField apeptx;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JPasswordField contraseña1;
    private javax.swing.JPasswordField contraseña2;
    private javax.swing.JPasswordField contraseñaconf;
    private javax.swing.JPasswordField contraseñaconf1;
    private javax.swing.JTextField especitx;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField nombretx;
    private javax.swing.JTextField nuevaEspecialidad;
    private javax.swing.JTextField nuevoApellidoM;
    private javax.swing.JTextField nuevoApellidoP;
    private javax.swing.JTextField nuevoNombre;
    private javax.swing.JTextField nuevoTelefono;
    private javax.swing.JTextField tel;
    private javax.swing.JTextField user;
    private javax.swing.JTextField user1;
    private javax.swing.JTable users;
    private javax.swing.JTextField usuariostx;
    // End of variables declaration//GEN-END:variables
}
