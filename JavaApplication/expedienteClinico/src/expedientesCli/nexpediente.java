/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expedientesCli;

import backend.expedienteDAO;
import java.awt.Color;
import java.awt.Image;
import static java.awt.PageAttributes.MediaType.D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Vector;
import javax.imageio.ImageIO;
import static javax.print.attribute.Size2DSyntax.MM;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class nexpediente extends javax.swing.JFrame {
boolean ban1=false, ban2=false, ban3=false, ban4=false, ban5=false, ban6=false, ban7=false;//variables para validar cada una de las pestañas del ecpediente
boolean banRA=false, ban2RA=false;
boolean banderaImagenModificar=false;
int banModificar=1;//bandera para sabe que vamos a modificar
SetGetExp ex= new SetGetExp();//vector general para guardar el expediente
Vector<SetGetExp> vr = new Vector<>();
    /**
     * Creates new form nexpediente
     */
    public nexpediente() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagen/Diapositiva1.PNG")).getImage());
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Nuevo Expediente");      
        idpersona.setVisible(false);
        generar.setEnabled(false);
        termtratamiento.setEnabled(false);
            ocaciones.setEnabled(false);
            endonde.setEnabled(false);
            motsus.setEnabled(false);
            nommed.setEnabled(false);
            frectab.setEnabled(false);
            frecalco.setEnabled(false);
            cualdroga.setEnabled(false);
            frecotra3.setEnabled(false);
            cualaltersueño.setEnabled(false);
            desalteralimen2.setEnabled(false);
            cualalteralimen.setEnabled(false);
            desalteralimen1.setEnabled(false);
            desalteralimen.setEnabled(false);
            desalteralimen3.setEnabled(false);
            quienlab.setEnabled(false);
            guardar.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estatus = new javax.swing.ButtonGroup();
        estadocasa = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Expediente = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apepat = new javax.swing.JTextField();
        apemat = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        fnacimiento = new com.toedter.calendar.JDateChooser();
        edad = new javax.swing.JComboBox();
        sexo = new javax.swing.JComboBox();
        estcivil = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        tel = new javax.swing.JTextField();
        dom = new javax.swing.JTextField();
        col = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        parroquia = new javax.swing.JTextField();
        muni1 = new javax.swing.JTextField();
        escola = new javax.swing.JComboBox();
        cuando = new javax.swing.JTextField();
        religion = new javax.swing.JTextField();
        primvez = new javax.swing.JComboBox();
        disposicion = new javax.swing.JComboBox();
        quienderivo = new javax.swing.JComboBox();
        idpersona = new javax.swing.JLabel();
        guardarp1 = new javax.swing.JButton();
        ocup = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jubilado = new javax.swing.JCheckBox();
        indigente = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        propia = new javax.swing.JRadioButton();
        rentada = new javax.swing.JRadioButton();
        prestada = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        depecon = new javax.swing.JComboBox();
        quienlab = new javax.swing.JTextField();
        tiemlab = new javax.swing.JTextField();
        donlabora = new javax.swing.JTextField();
        ingrmes = new javax.swing.JTextField();
        funtrab = new javax.swing.JTextField();
        descuando = new javax.swing.JTextField();
        taprox = new javax.swing.JTextField();
        dependientes = new javax.swing.JComboBox();
        persingr = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        guardarp2 = new javax.swing.JButton();
        desempleado2 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        recatencion = new javax.swing.JComboBox();
        ocaciones = new javax.swing.JComboBox();
        bajomed = new javax.swing.JComboBox();
        endonde = new javax.swing.JTextField();
        motsus = new javax.swing.JTextField();
        termtratamiento = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        nommed = new javax.swing.JTextArea();
        jLabel59 = new javax.swing.JLabel();
        imss = new javax.swing.JRadioButton();
        isste = new javax.swing.JRadioButton();
        segurop = new javax.swing.JRadioButton();
        segurop1 = new javax.swing.JRadioButton();
        jLabel65 = new javax.swing.JLabel();
        enfcronica = new javax.swing.JTextField();
        guardarp3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        anotacion = new javax.swing.JTextArea();
        jLabel47 = new javax.swing.JLabel();
        altermarcha = new javax.swing.JComboBox();
        higiene = new javax.swing.JComboBox();
        alterhabla = new javax.swing.JComboBox();
        jLabel61 = new javax.swing.JLabel();
        imc1 = new javax.swing.JTextField();
        talla11 = new javax.swing.JTextField();
        peso11 = new javax.swing.JTextField();
        calcularb = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        guardarp4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        tabaco = new javax.swing.JCheckBox();
        alcohol = new javax.swing.JCheckBox();
        altersueño = new javax.swing.JCheckBox();
        otra = new javax.swing.JCheckBox();
        alteralimen = new javax.swing.JCheckBox();
        camb = new javax.swing.JCheckBox();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        frectab = new javax.swing.JTextField();
        desalteralimen = new javax.swing.JTextField();
        cualalteralimen = new javax.swing.JTextField();
        cualaltersueño = new javax.swing.JTextField();
        cualdroga = new javax.swing.JTextField();
        frecalco = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel68 = new javax.swing.JLabel();
        desalteralimen1 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        desalteralimen2 = new javax.swing.JTextField();
        guardarp5 = new javax.swing.JButton();
        camb1 = new javax.swing.JCheckBox();
        jLabel70 = new javax.swing.JLabel();
        desalteralimen3 = new javax.swing.JTextField();
        frecotra3 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        buscargeno = new javax.swing.JButton();
        imagenlbl = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        diagnostico = new javax.swing.JTextArea();
        psiquiatria = new javax.swing.JCheckBox();
        psicologia = new javax.swing.JCheckBox();
        nutricion = new javax.swing.JCheckBox();
        asesoria = new javax.swing.JCheckBox();
        atenesp = new javax.swing.JCheckBox();
        neurologia = new javax.swing.JCheckBox();
        cuota = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        estadocmbx = new javax.swing.JComboBox();
        jLabel72 = new javax.swing.JLabel();
        atendiocmbx = new javax.swing.JComboBox();
        guardarp7 = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        estadocmbx1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        otro = new javax.swing.JCheckBox();
        jLabel62 = new javax.swing.JLabel();
        impexp = new javax.swing.JButton();
        generar = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        guardar1 = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        buscarpertxt = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        personaexp = new javax.swing.JTable();
        expedientestxt = new javax.swing.JTextField();
        buscar1 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        expedientes = new javax.swing.JTable();
        jLabel46 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        mod = new javax.swing.JButton();
        guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Expediente.setBackground(new java.awt.Color(255, 255, 255));
        Expediente.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(93, 183, 121));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre (s)");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha de nacimiento");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Escolaridad");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teléfono");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ocupación");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Domicilio");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Parroquia");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("¿Primera vez?");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("¿Quién lo derivó?");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Edad");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Sexo");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Estado Civil");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Religión");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Colonia");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Municipio");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("¿Cuándo?");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Disposición para la consulta");

        nombre.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N

        apepat.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N

        apemat.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        apemat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apematActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Apellido Paterno");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Apellido Materno");

        fnacimiento.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N

        edad.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        edad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));

        sexo.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----------", "FEMENINO", "MASCULINO", "PREFIERE NO ESPESIFICAR" }));

        estcivil.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        estcivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----------------", "SOLTERO", "CASADO", "VIUDO", "DIVORCIADO" }));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        tel.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });

        dom.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        dom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domActionPerformed(evt);
            }
        });

        col.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        col.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        parroquia.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        parroquia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parroquiaActionPerformed(evt);
            }
        });

        muni1.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        muni1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muni1ActionPerformed(evt);
            }
        });

        escola.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        escola.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---------------------", "NINGUNA", "PRIMARIA", "SECUNDARIA ", "BACHILLERATO", "LICENCIATURA", "OTRO", " " }));

        cuando.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N

        religion.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N

        primvez.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        primvez.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---------------------", "SI", "NO" }));

        disposicion.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        disposicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----------", "SI", "NO" }));

        quienderivo.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        quienderivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---------------------", "FAMILIAR", "DOCTOR", "USUARIO", "SACERDOTE", "INICIATIVA PROPIA", "OTRO" }));

        idpersona.setBackground(new java.awt.Color(255, 255, 255));

        guardarp1.setText("Guardar");
        guardarp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarp1ActionPerformed(evt);
            }
        });

        ocup.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(apemat, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(apepat, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel2))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel10)
                                                .addGap(18, 18, 18)
                                                .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel11)))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fnacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sexo, 0, 1, Short.MAX_VALUE)
                                    .addComponent(estcivil, 0, 180, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(dom, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(66, 66, 66)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel14)
                                                .addComponent(jLabel15))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(col, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(muni1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(parroquia, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(85, 85, 85))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(87, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(religion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(escola, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ocup, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(135, 135, 135)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(56, 56, 56))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(guardarp1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quienderivo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(primvez, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disposicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuando, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(idpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(435, 435, 435))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(idpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(apemat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(fnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(apepat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(estcivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(muni1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(col, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(dom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(parroquia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(escola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(primvez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(religion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9)
                    .addComponent(quienderivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cuando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(ocup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(disposicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarp1)
                .addContainerGap())
        );

        Expediente.addTab("1.Datos Personales ", jPanel2);

        jPanel3.setBackground(new java.awt.Color(93, 183, 121));

        jLabel20.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("¿Dependiente económico?");

        jLabel21.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("¿Dónde labora?");

        jLabel22.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Función en el trabajo ");

        jLabel24.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Tiempo laboralmente activo");

        jLabel25.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Ingreso al mes $");

        jubilado.setBackground(new java.awt.Color(93, 183, 121));
        jubilado.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jubilado.setForeground(new java.awt.Color(255, 255, 255));
        jubilado.setText("Jubilado ");

        indigente.setBackground(new java.awt.Color(93, 183, 121));
        indigente.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        indigente.setForeground(new java.awt.Color(255, 255, 255));
        indigente.setText("Indigente");
        indigente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indigenteActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Tiempo laborando en ese lugar");

        jLabel27.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Tiempo aproximado que lleva en esta situación ");

        jLabel28.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("¿Cúantos dependientes tiene?");

        jLabel29.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("¿Cuántas personas ingresan?");

        jLabel30.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("La casa que habita es:");

        propia.setBackground(new java.awt.Color(93, 183, 121));
        estadocasa.add(propia);
        propia.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        propia.setForeground(new java.awt.Color(255, 255, 255));
        propia.setText("Propia ");

        rentada.setBackground(new java.awt.Color(93, 183, 121));
        estadocasa.add(rentada);
        rentada.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        rentada.setForeground(new java.awt.Color(255, 255, 255));
        rentada.setText("Rentada ");

        prestada.setBackground(new java.awt.Color(93, 183, 121));
        estadocasa.add(prestada);
        prestada.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        prestada.setForeground(new java.awt.Color(255, 255, 255));
        prestada.setText("Prestada");

        jLabel33.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("¿Quién labora?");

        depecon.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        depecon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------", "SI", "NO" }));
        depecon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                depeconItemStateChanged(evt);
            }
        });

        quienlab.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N

        tiemlab.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N

        donlabora.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N

        ingrmes.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        ingrmes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingrmesKeyTyped(evt);
            }
        });

        funtrab.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N

        descuando.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        descuando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descuandoActionPerformed(evt);
            }
        });

        taprox.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N

        dependientes.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        dependientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", " " }));

        persingr.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        persingr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", " " }));
        persingr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persingrActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Estatus:");

        guardarp2.setText("Guardar");
        guardarp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarp2ActionPerformed(evt);
            }
        });

        desempleado2.setBackground(new java.awt.Color(93, 183, 121));
        desempleado2.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        desempleado2.setForeground(new java.awt.Color(255, 255, 255));
        desempleado2.setText("Desempleado ");
        desempleado2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                desempleado2ItemStateChanged(evt);
            }
        });
        desempleado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desempleado2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(propia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rentada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prestada)
                        .addGap(445, 445, 445)
                        .addComponent(guardarp2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(depecon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(funtrab, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel25))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel21)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(donlabora))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel33)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(quienlab, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel26))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(descuando)
                                    .addComponent(tiemlab)
                                    .addComponent(ingrmes, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jubilado)
                                    .addComponent(indigente)
                                    .addComponent(desempleado2)))
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)
                                .addComponent(taprox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel30)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(29, 29, 29)
                                .addComponent(dependientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel29)
                                .addGap(31, 31, 31)
                                .addComponent(persingr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(depecon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quienlab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24)
                        .addComponent(descuando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(tiemlab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(donlabora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(funtrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(jLabel25)
                        .addComponent(ingrmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desempleado2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jubilado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indigente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taprox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(dependientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(persingr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(propia)
                    .addComponent(rentada)
                    .addComponent(prestada)
                    .addComponent(guardarp2))
                .addGap(18, 18, 18)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        Expediente.addTab("2. Exploración Socioeconómica", jPanel3);

        jPanel4.setBackground(new java.awt.Color(93, 183, 121));

        jTextArea1.setColumns(10);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel23.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Exponga brevemente la problemática:");

        jLabel35.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("¿Ha recibido atención?");

        jLabel36.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("¿En cuántas ocasiones?");

        jLabel37.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("¿Termino tratamiento?");

        jLabel38.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("¿Motivo por el cuál suspendió la atención?");

        jLabel39.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("¿Actualmente está bajo tratamiento o toma algún medicamento?");

        jLabel40.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("¿En dónde?");

        jLabel41.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Nombre de los medicamentos:");

        recatencion.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        recatencion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "SI", "NO" }));
        recatencion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recatencionMouseClicked(evt);
            }
        });
        recatencion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                recatencionItemStateChanged(evt);
            }
        });

        ocaciones.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        ocaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------", "1", "2", "3", "4", "5", "+5" }));

        bajomed.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        bajomed.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "SI", "NO" }));
        bajomed.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bajomedItemStateChanged(evt);
            }
        });

        endonde.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        endonde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endondeActionPerformed(evt);
            }
        });

        motsus.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N

        termtratamiento.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        termtratamiento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "SI", "NO" }));

        nommed.setColumns(20);
        nommed.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        nommed.setLineWrap(true);
        nommed.setRows(5);
        jScrollPane2.setViewportView(nommed);

        jLabel59.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Servicios médicos que recibe:");

        imss.setBackground(new java.awt.Color(93, 183, 121));
        imss.setFont(new java.awt.Font("EngraversGothic BT", 1, 14)); // NOI18N
        imss.setForeground(new java.awt.Color(255, 255, 255));
        imss.setText("IMSS");

        isste.setBackground(new java.awt.Color(93, 183, 121));
        isste.setFont(new java.awt.Font("EngraversGothic BT", 1, 14)); // NOI18N
        isste.setForeground(new java.awt.Color(255, 255, 255));
        isste.setText("ISSTE");

        segurop.setBackground(new java.awt.Color(93, 183, 121));
        segurop.setFont(new java.awt.Font("EngraversGothic BT", 1, 14)); // NOI18N
        segurop.setForeground(new java.awt.Color(255, 255, 255));
        segurop.setText("SEGURO P.");

        segurop1.setBackground(new java.awt.Color(93, 183, 121));
        segurop1.setFont(new java.awt.Font("EngraversGothic BT", 1, 14)); // NOI18N
        segurop1.setForeground(new java.awt.Color(255, 255, 255));
        segurop1.setText("PRIVADO");

        jLabel65.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Enfermedad crónica");

        guardarp3.setText("Guardar");
        guardarp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarp3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(motsus, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel39)
                            .addGap(18, 18, 18)
                            .addComponent(bajomed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(imss)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(isste)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(segurop)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(segurop1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel59)
                                        .addGap(119, 119, 119)))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(enfcronica, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(guardarp3))
                                    .addComponent(jLabel65))))
                        .addComponent(jLabel23)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(recatencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel36))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(termtratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(155, 155, 155)
                                    .addComponent(jLabel40)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ocaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(endonde)
                                    .addGap(5, 5, 5))))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(recatencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(termtratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ocaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endonde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(motsus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(bajomed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel65))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imss)
                            .addComponent(isste)
                            .addComponent(segurop)
                            .addComponent(segurop1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enfcronica, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(guardarp3))
                        .addContainerGap())))
        );

        Expediente.addTab("3. Exploración clínica/Sintomatología referida por el paciente ", jPanel4);

        jPanel5.setBackground(new java.awt.Color(93, 183, 121));

        jLabel42.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Peso:");

        jLabel43.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Talla:");

        jLabel44.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Higiene");

        jLabel45.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Alteraciones en la marcha");

        jlabel.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jlabel.setForeground(new java.awt.Color(255, 255, 255));
        jlabel.setText("Alteraciones en el habla");

        anotacion.setColumns(20);
        anotacion.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        anotacion.setLineWrap(true);
        anotacion.setRows(5);

        jLabel47.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Anotaciones:");

        altermarcha.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        altermarcha.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------", "SI", "NO" }));

        higiene.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        higiene.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------------", "BUENA", "REGULAR ", "MALA", "DESCUIDADA" }));
        higiene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                higieneActionPerformed(evt);
            }
        });

        alterhabla.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        alterhabla.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "SI", "NO" }));

        jLabel61.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("IMC");

        imc1.setEditable(false);
        imc1.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        imc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imc1ActionPerformed(evt);
            }
        });

        talla11.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        talla11.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        talla11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talla11ActionPerformed(evt);
            }
        });
        talla11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                talla11KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                talla11KeyTyped(evt);
            }
        });

        peso11.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        peso11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peso11ActionPerformed(evt);
            }
        });
        peso11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                peso11KeyTyped(evt);
            }
        });

        calcularb.setText("Calcular");
        calcularb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularbActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("cm");

        jLabel67.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("kg");

        guardarp4.setText("Guardar");
        guardarp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarp4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anotacion, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel45)
                                        .addGap(18, 18, 18)
                                        .addComponent(altermarcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(peso11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel67)
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(talla11))
                                    .addComponent(jLabel47))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(jlabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(alterhabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel66)
                                        .addGap(18, 18, 18)
                                        .addComponent(calcularb)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel61)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(imc1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel44)
                                        .addGap(18, 18, 18)
                                        .addComponent(higiene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(guardarp4)))
                .addGap(27, 27, 27))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(peso11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43)
                            .addComponent(talla11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61)
                            .addComponent(imc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44)
                            .addComponent(higiene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66)
                            .addComponent(jLabel67))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(calcularb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(altermarcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel)
                    .addComponent(alterhabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anotacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(guardarp4)
                .addGap(22, 22, 22))
        );

        Expediente.addTab("4.Descripción impresionista del paciente/Habitus Exterior ", jPanel5);

        jPanel6.setBackground(new java.awt.Color(93, 183, 121));

        tabaco.setBackground(new java.awt.Color(93, 183, 121));
        tabaco.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        tabaco.setForeground(new java.awt.Color(255, 255, 255));
        tabaco.setText("Tabaco");
        tabaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabacoActionPerformed(evt);
            }
        });

        alcohol.setBackground(new java.awt.Color(93, 183, 121));
        alcohol.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        alcohol.setForeground(new java.awt.Color(255, 255, 255));
        alcohol.setText("Alcohol");
        alcohol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alcoholActionPerformed(evt);
            }
        });

        altersueño.setBackground(new java.awt.Color(93, 183, 121));
        altersueño.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        altersueño.setForeground(new java.awt.Color(255, 255, 255));
        altersueño.setText("Alteraciones de sueño");
        altersueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altersueñoActionPerformed(evt);
            }
        });

        otra.setBackground(new java.awt.Color(93, 183, 121));
        otra.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        otra.setForeground(new java.awt.Color(255, 255, 255));
        otra.setText("Otras drogas");
        otra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otraActionPerformed(evt);
            }
        });

        alteralimen.setBackground(new java.awt.Color(93, 183, 121));
        alteralimen.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        alteralimen.setForeground(new java.awt.Color(255, 255, 255));
        alteralimen.setText("Alteraciones alimentarias");
        alteralimen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alteralimenActionPerformed(evt);
            }
        });

        camb.setBackground(new java.awt.Color(93, 183, 121));
        camb.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        camb.setForeground(new java.awt.Color(255, 255, 255));
        camb.setText("Cambios del estado de ánimo");
        camb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Frecuencia");

        jLabel49.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Frecuencia");

        jLabel50.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Frecuencia");

        jLabel51.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("¿Cuál?");

        jLabel52.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("¿Cuál?");

        jLabel53.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("¿Cuál?");

        jLabel54.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("¿Desde cuándo?");

        frectab.setFont(new java.awt.Font("EngraversGothic BT", 0, 24)); // NOI18N

        desalteralimen.setFont(new java.awt.Font("EngraversGothic BT", 0, 24)); // NOI18N

        cualalteralimen.setFont(new java.awt.Font("EngraversGothic BT", 0, 24)); // NOI18N

        cualaltersueño.setFont(new java.awt.Font("EngraversGothic BT", 0, 24)); // NOI18N

        cualdroga.setFont(new java.awt.Font("EngraversGothic BT", 0, 24)); // NOI18N

        frecalco.setFont(new java.awt.Font("EngraversGothic BT", 0, 24)); // NOI18N

        jLabel68.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("¿Desde cuándo?");

        desalteralimen1.setFont(new java.awt.Font("EngraversGothic BT", 0, 24)); // NOI18N

        jLabel69.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("¿Desde cuándo?");

        desalteralimen2.setFont(new java.awt.Font("EngraversGothic BT", 0, 24)); // NOI18N

        guardarp5.setText("Guardar");
        guardarp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarp5ActionPerformed(evt);
            }
        });

        camb1.setBackground(new java.awt.Color(93, 183, 121));
        camb1.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        camb1.setForeground(new java.awt.Color(255, 255, 255));
        camb1.setText("Antecedentes penales");
        camb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camb1ActionPerformed(evt);
            }
        });

        jLabel70.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("¿Cuáles antecedentes?");

        desalteralimen3.setFont(new java.awt.Font("EngraversGothic BT", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator7)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(camb1)
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel70)
                                        .addGap(18, 18, 18)
                                        .addComponent(desalteralimen3)
                                        .addGap(1, 1, 1))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(camb)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel68)
                                        .addGap(18, 18, 18)
                                        .addComponent(desalteralimen))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tabaco)
                                            .addComponent(alcohol)
                                            .addComponent(altersueño)
                                            .addComponent(alteralimen)
                                            .addComponent(otra))
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel49)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(frecalco, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                                        .addComponent(jLabel51)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cualdroga))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                        .addComponent(jLabel52)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cualaltersueño))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                        .addComponent(jLabel53)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cualalteralimen, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                                        .addComponent(jLabel54)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(desalteralimen1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                                        .addComponent(jLabel50)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(frecotra3))
                                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                                        .addComponent(jLabel69)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(desalteralimen2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel48)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(frectab, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarp5)
                .addGap(455, 455, 455))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabaco)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel48)
                        .addComponent(frectab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(frecalco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alcohol))
                .addGap(5, 5, 5)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frecotra3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel51)
                        .addComponent(jLabel50)
                        .addComponent(cualdroga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(otra)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(cualaltersueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altersueño)
                    .addComponent(jLabel69)
                    .addComponent(desalteralimen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(cualalteralimen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alteralimen)
                    .addComponent(jLabel54)
                    .addComponent(desalteralimen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(camb)
                    .addComponent(jLabel68)
                    .addComponent(desalteralimen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(camb1)
                    .addComponent(jLabel70)
                    .addComponent(desalteralimen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(guardarp5)
                .addGap(24, 24, 24))
        );

        Expediente.addTab("5. Antecedentes conductales", jPanel6);

        jPanel7.setBackground(new java.awt.Color(93, 183, 121));

        buscargeno.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        buscargeno.setText("Buscar");
        buscargeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscargenoActionPerformed(evt);
            }
        });

        imagenlbl.setBackground(new java.awt.Color(255, 255, 255));
        imagenlbl.setForeground(new java.awt.Color(255, 255, 255));
        imagenlbl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GENOGRAMA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscargeno)
                    .addComponent(imagenlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(buscargeno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagenlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );

        Expediente.addTab("6. Genograma ", jPanel7);

        jPanel8.setBackground(new java.awt.Color(93, 183, 121));

        jLabel56.setBackground(new java.awt.Color(255, 255, 255));
        jLabel56.setFont(new java.awt.Font("EngraversGothic BT", 1, 36)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Diagnóstico presuntivo:");

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setFont(new java.awt.Font("EngraversGothic BT", 1, 36)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Derivado a");

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Cuota");

        diagnostico.setColumns(20);
        diagnostico.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        diagnostico.setLineWrap(true);
        diagnostico.setRows(5);
        jScrollPane5.setViewportView(diagnostico);

        psiquiatria.setBackground(new java.awt.Color(93, 183, 121));
        psiquiatria.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        psiquiatria.setForeground(new java.awt.Color(255, 255, 255));
        psiquiatria.setText("Psiquiatria");
        psiquiatria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psiquiatriaActionPerformed(evt);
            }
        });

        psicologia.setBackground(new java.awt.Color(93, 183, 121));
        psicologia.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        psicologia.setForeground(new java.awt.Color(255, 255, 255));
        psicologia.setText("Psicologia");
        psicologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psicologiaActionPerformed(evt);
            }
        });

        nutricion.setBackground(new java.awt.Color(93, 183, 121));
        nutricion.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        nutricion.setForeground(new java.awt.Color(255, 255, 255));
        nutricion.setText("Nutricion");
        nutricion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutricionActionPerformed(evt);
            }
        });

        asesoria.setBackground(new java.awt.Color(93, 183, 121));
        asesoria.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        asesoria.setForeground(new java.awt.Color(255, 255, 255));
        asesoria.setText("Asesoria Legal");
        asesoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asesoriaActionPerformed(evt);
            }
        });

        atenesp.setBackground(new java.awt.Color(93, 183, 121));
        atenesp.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        atenesp.setForeground(new java.awt.Color(255, 255, 255));
        atenesp.setText("Atencion Espiritual");
        atenesp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atenespActionPerformed(evt);
            }
        });

        neurologia.setBackground(new java.awt.Color(93, 183, 121));
        neurologia.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        neurologia.setForeground(new java.awt.Color(255, 255, 255));
        neurologia.setText("Neurologia");
        neurologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neurologiaActionPerformed(evt);
            }
        });

        cuota.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        cuota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cuotaKeyTyped(evt);
            }
        });

        jLabel71.setBackground(new java.awt.Color(255, 255, 255));
        jLabel71.setFont(new java.awt.Font("EngraversGothic BT", 1, 36)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Estado");

        estadocmbx.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        estadocmbx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------", "EN CURSO", "ALTA ABIERTA", "ALTA DEFINITIVA", "DERIVADO", "BAJA" }));

        jLabel72.setBackground(new java.awt.Color(255, 255, 255));
        jLabel72.setFont(new java.awt.Font("EngraversGothic BT", 1, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("Atendido por");

        atendiocmbx.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        atendiocmbx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------", "LUIS MANUEL IBARRA GUTIÉRREZ", "JAYDI CARREÑO ÁVALOS", "JOSE ELÍAS PÉREZ MARTÍNEZ", "LUIS ÁNGEL SOTO GARCÍA" }));

        guardarp7.setText("Guardar");
        guardarp7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarp7ActionPerformed(evt);
            }
        });

        jLabel73.setBackground(new java.awt.Color(255, 255, 255));
        jLabel73.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Expediente");

        estadocmbx1.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        estadocmbx1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------", "FAMILIAR", "INDIVIDUAL" }));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        otro.setBackground(new java.awt.Color(93, 183, 121));
        otro.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        otro.setForeground(new java.awt.Color(255, 255, 255));
        otro.setText("Otro");
        otro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(otro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardarp7)
                        .addGap(98, 98, 98))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atenesp)
                            .addComponent(psiquiatria)
                            .addComponent(asesoria)
                            .addComponent(psicologia)
                            .addComponent(jLabel57)
                            .addComponent(neurologia)
                            .addComponent(nutricion))
                        .addGap(102, 102, 102)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(estadocmbx1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(estadocmbx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52))
                            .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(atendiocmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(jButton1))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel58)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cuota, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel57)
                            .addComponent(jLabel71))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estadocmbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(estadocmbx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel72)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(atendiocmbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(cuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(neurologia)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nutricion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(psicologia)
                        .addGap(18, 18, 18)
                        .addComponent(asesoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atenesp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(psiquiatria)))
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarp7)
                    .addComponent(otro))
                .addGap(99, 99, 99))
        );

        Expediente.addTab("7. Impresión diagnóstica", jPanel8);

        impexp.setFont(new java.awt.Font("EngraversGothic BT", 0, 24)); // NOI18N
        impexp.setText("Imprimir Expediente");
        impexp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impexpActionPerformed(evt);
            }
        });

        generar.setFont(new java.awt.Font("EngraversGothic BT", 0, 24)); // NOI18N
        generar.setText("Generar Expediente");
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/nuevo exp.png"))); // NOI18N

        guardar1.setFont(new java.awt.Font("EngraversGothic BT", 0, 24)); // NOI18N
        guardar1.setText("Salir");
        guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar1ActionPerformed(evt);
            }
        });

        buscar.setFont(new java.awt.Font("EngraversGothic BT", 0, 24)); // NOI18N
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        buscarpertxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buscarpertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarpertxtKeyReleased(evt);
            }
        });

        personaexp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "NOMBRE", "APELLIDOS"
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
        personaexp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personaexpMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(personaexp);

        expedientestxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        expedientestxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                expedientestxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                expedientestxtKeyTyped(evt);
            }
        });

        buscar1.setFont(new java.awt.Font("EngraversGothic BT", 0, 24)); // NOI18N
        buscar1.setText("Buscar");
        buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar1ActionPerformed(evt);
            }
        });

        expedientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EXPEDIENTE", "PACIENTE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        expedientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expedientesMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(expedientes);

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel46.setText("Personas");

        jLabel55.setBackground(new java.awt.Color(255, 255, 255));
        jLabel55.setFont(new java.awt.Font("EngraversGothic BT", 1, 24)); // NOI18N
        jLabel55.setText("Expediente");

        mod.setFont(new java.awt.Font("EngraversGothic BT", 0, 24)); // NOI18N
        mod.setText("Modificar Expediente");
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });

        guardar.setFont(new java.awt.Font("EngraversGothic BT", 0, 24)); // NOI18N
        guardar.setText("Guardar Cambios");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 1335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1632, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Expediente, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel46))
                            .addComponent(generar, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buscarpertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel62))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(expedientestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar1))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(guardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(impexp, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel63)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel62))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buscar)
                                    .addComponent(buscarpertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(generar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(expedientestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(impexp)
                        .addGap(18, 18, 18)
                        .addComponent(mod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardar1))
                    .addComponent(Expediente, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 336, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1346, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apematActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apematActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apematActionPerformed

    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telActionPerformed

    private void domActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_domActionPerformed

    private void colActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colActionPerformed

    private void parroquiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parroquiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parroquiaActionPerformed

    private void muni1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muni1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_muni1ActionPerformed

    private void indigenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indigenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indigenteActionPerformed

    private void descuandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descuandoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descuandoActionPerformed

    private void persingrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persingrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_persingrActionPerformed

    private void endondeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endondeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endondeActionPerformed

    private void higieneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_higieneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_higieneActionPerformed

    private void imc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imc1ActionPerformed

    private void talla11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talla11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_talla11ActionPerformed

    private void peso11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peso11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peso11ActionPerformed

    private void impexpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impexpActionPerformed
        if(expedientes.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Seleccione primero un expediente de la lista.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Integer exp = (Integer)expedientes.getValueAt(expedientes.getSelectedRow(), 0);
            reporteexpediente.Expediente imprimir = new reporteexpediente.Expediente("192.168.1.100", "Aplicacion", "postgres", "$@Lud1n73gral");
            imprimir.imprimir(exp);
        }
    }//GEN-LAST:event_impexpActionPerformed

    private void buscargenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscargenoActionPerformed
     cargarImagen();
    }//GEN-LAST:event_buscargenoActionPerformed

    private void guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar1ActionPerformed
       //preguntar al usuario si esta seguro de que desea salir cuando esta generando un expediente
        int i=JOptionPane.showConfirmDialog(this, "¿Estás seguro que deseas salir?", "Cierre de formulario", JOptionPane.YES_NO_OPTION);
        if (i==0)
            this.hide();
    }//GEN-LAST:event_guardar1ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        //filtrar las persona que tenemos registradas previamente para generar un expediente
        try{
            expedienteDAO edao=new expedienteDAO();
            Collection<SetGetPcontacto> consulta=edao.buscarPersona(buscarpertxt.getText());
            Iterator<SetGetPcontacto> it=consulta.iterator();
            SetGetPcontacto arreglo;
            DefaultTableModel tabla = (DefaultTableModel)personaexp.getModel();
            tabla.setRowCount(0);
            while(it.hasNext()){
            arreglo=it.next();
            tabla.addRow(arreglo.toObjectArray1());
        }
        }catch(Exception re){
            JOptionPane.showMessageDialog(null,
                    "No se pudo conectar a la base de datos: " + re.getMessage(),
                    "Error de conexion",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void buscarpertxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarpertxtKeyReleased
        char cTeclaPresionada=evt.getKeyChar();
       String aux=buscarpertxt.getText();
        buscarpertxt.setText(aux.toUpperCase());
       if(cTeclaPresionada==KeyEvent.VK_ENTER){           
            buscar.doClick();
        }
    }//GEN-LAST:event_buscarpertxtKeyReleased

    private void personaexpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personaexpMouseClicked
        //consultar todos los datos de una persona para agregarlos al expediente
        int i=personaexp.getSelectedColumn();
        int z=personaexp.getSelectedRow();
        if(i==0){
        try{
            expedienteDAO edao=new expedienteDAO();
            Collection<SetGetPcontacto> consulta=edao.cargarPersona(Integer.parseInt(personaexp.getValueAt
                                                            (personaexp.getSelectedRow(), 0).toString()));           
            Iterator<SetGetPcontacto> it=consulta.iterator();
            SetGetPcontacto arreglo;
            if(it.hasNext()){
            arreglo=it.next();
            nombre.setText(arreglo.getNombre());
            apepat.setText(arreglo.getApellidoP());
            apemat.setText(arreglo.getApellidoM());
            tel.setText(arreglo.getTelefono());
            idpersona.setText(personaexp.getValueAt(personaexp.getSelectedRow(), 0).toString());
        }
        }catch(Exception re){
            JOptionPane.showMessageDialog(null,
                    "No se pudo conectar a la base de datos: " + re.getMessage(),
                    "Error de conexion",
                    JOptionPane.ERROR_MESSAGE);
        }
        }
        else{
        JOptionPane.showMessageDialog(null,
                    "Debe seleccionar el nombre se la persona" ,
                    "Error de seleccion",
                    JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_personaexpMouseClicked

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
        //recoger todos los valores de la interfaz para generar un expeidente
        String serviciosm="";
        String derivadoa="";
        Integer nuevoID;
        Date now = new Date(System.currentTimeMillis());
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");//fecha del sistema de compunto en turno
        expedienteDAO edao=new expedienteDAO();
        if(!edao.verificarPersonaExpediente(Integer.parseInt(idpersona.getText()))){
        try{
        
        //SetGetExp ex= new SetGetExp();
        
        ex.setEscolaridad(escola.getSelectedItem().toString().toUpperCase());
        ex.setEdad(Integer.parseInt(edad.getSelectedItem().toString()));
        ex.setSexo(sexo.getSelectedItem().toString().toUpperCase());
        ex.setOcupacion(ocup.getText().toUpperCase());
        ex.setEstadoCivil(estcivil.getSelectedItem().toString().toUpperCase());
        ex.setReligion(religion.getText().toUpperCase());
        ex.setDomicilo(dom.getText().toUpperCase());
        ex.setParroquia(parroquia.getText().toUpperCase());
        ex.setColonia(col.getText().toUpperCase());
        ex.setMunicipio(muni1.getText().toUpperCase());
        if(primvez.getSelectedItem().equals("SI"))
            ex.setPrimeraVez(true);
        else           
        ex.setPrimeraVez(false);
        
        ex.setCuando(cuando.getText().toUpperCase());
        ex.setQuienDerivo(quienderivo.getSelectedItem().toString().toUpperCase());
        
        if(disposicion.getSelectedItem().equals("SI"))
            ex.setDisposicion(true);
        else
            ex.setDisposicion(false);
        
        if(depecon.getSelectedItem().equals("SI"))
            ex.setDependienteEc(true);
        else
            ex.setDependienteEc(false);
        
        ex.setQuienLabora(quienlab.getText().toUpperCase());
        /**/ex.setFuncionTrabajo(funtrab.getText().toUpperCase());
        ex.setDesdeCuandoTra(descuando.getText().toUpperCase());
        ex.setIngresoMes(Integer.valueOf(ingrmes.getText()));
        if(desempleado2.isSelected())
            ex.setEstadoLaboral("DESEMPLEADO");
        if(jubilado.isSelected())
            ex.setEstadoLaboral("JUBILADO");
        if(indigente.isSelected())
            ex.setEstadoLaboral("INDIGENTE");
        
        
        
        ex.setnDependientes(Integer.valueOf(dependientes.getSelectedItem().toString()));
        ex.setnPersonaIngresan(Integer.valueOf(persingr.getSelectedItem().toString()));
         if(propia.isSelected())   
            ex.setPosesionCasa("PROPIA");
         if(rentada.isSelected())   
            ex.setPosesionCasa("RENTADA");
         if(prestada.isSelected())   
            ex.setPosesionCasa("PRESTADA");
        
        if(imss.isSelected())
            serviciosm=serviciosm.concat(",".concat(imss.getText())).toUpperCase();
        if(isste.isSelected())
            serviciosm=serviciosm.concat(",".concat(isste.getText())).toUpperCase();
        if(segurop.isSelected())
            serviciosm=serviciosm.concat(",".concat(segurop.getText())).toUpperCase();
        if(segurop1.isSelected())
            serviciosm=serviciosm.concat(",".concat(segurop1.getText())).toUpperCase();
        ex.setServiciosMedicos(serviciosm);
        
        ex.setEnfermedadCronica(enfcronica.getText().toUpperCase());
        ex.setExploracionClinica(jTextArea1.getText().toUpperCase());
        ex.setAtencionRA(recatencion.getSelectedItem().toString().toUpperCase());
        ex.setLugraRA(endonde.getText().toUpperCase());
        
        if(termtratamiento.getSelectedItem().equals("SI"))
            ex.setTerminoRA(true);
        else
            ex.setTerminoRA(false);
        
        ex.setMotivoTerminoRa(motsus.getText().toUpperCase());
        
        if(bajomed.getSelectedItem().equals("SI"))
            ex.setEstaBajoTrata(true);
        else
            ex.setEstaBajoTrata(false);
        
        ex.setMedicamentos(nommed.getText().toUpperCase());
        ex.setPeso(Double.valueOf(peso11.getText()));
        ex.setTalla(Double.valueOf(talla11.getText()));
        ex.setImc(Double.valueOf(imc1.getText()));
        ex.setHigiene(higiene.getSelectedItem().toString().toUpperCase());
        ex.setAlteracionesMarcha(altermarcha.getSelectedItem().toString().toUpperCase());
        ex.setAlteracionesHabla(alterhabla.getSelectedItem().toString().toUpperCase());
        ex.setFuma(tabaco.isSelected());
        ex.setFrecFuma(frectab.getText().toUpperCase());
        ex.setBebeAlcohol(alcohol.isSelected());
        ex.setFrecAlcohol(frecalco.getText().toUpperCase());
        ex.setDrogas(otra.isSelected());
        ex.setCualesDrogas(cualdroga.getText().toUpperCase());
        ex.setFrecDrogas(frecotra3.getText().toUpperCase());
        ex.setAlteracionesSueño(altersueño.isSelected());
        ex.setTipoAlteraionesSueño(cualaltersueño.getText().toUpperCase());
        ex.setAlteracionesAlimenticias(alteralimen.isSelected());
        ex.setTipoAlteracionesAlim(cualalteralimen.getText().toUpperCase());
        if(camb.isSelected())
            ex.setCambiosAnimo("SI");
        else
            ex.setCambiosAnimo("NO");
        ex.setDesdeCuandoCA(desalteralimen.getText());
        ex.setDiagPresuntivo(diagnostico.getText().toUpperCase());
        if(neurologia.isSelected())
            derivadoa=derivadoa.concat(",".concat(neurologia.getText())).toUpperCase();
        if(nutricion.isSelected())
            derivadoa=derivadoa.concat(",".concat(nutricion.getText())).toUpperCase();
        if(psicologia.isSelected())
            derivadoa=derivadoa.concat(",".concat(psicologia.getText()).toUpperCase());
        if(atenesp.isSelected())
            derivadoa=derivadoa.concat(",".concat(atenesp.getText())).toUpperCase();
        if(psiquiatria.isSelected())
            derivadoa=derivadoa.concat(",".concat(psiquiatria.getText())).toUpperCase();
        if(asesoria.isSelected())
            derivadoa=derivadoa.concat(",".concat(asesoria.getText())).toUpperCase();
        if(otro.isSelected())
            derivadoa=derivadoa.concat(",".concat(otro.getText())).toUpperCase();
        ex.setDerivadoA(derivadoa);
        ex.setProQueAtendio(atendiocmbx.getSelectedItem().toString().toUpperCase());
        ex.setCuota(cuota.getText().toUpperCase());
        ex.setId_persona(Integer.parseInt(idpersona.getText()));
        //ex.setId_terapeuta(Integer.valueOf(idter.getText()));
        ex.setFechaCreacion(now);
        ex.setSantecedentesPenales(camb1.isSelected());
        ex.setAntecedentesPenales(desalteralimen3.getText().toUpperCase());
        ex.setEstadoPaciente(estadocmbx.getSelectedItem().toString().toUpperCase());
        ex.setTipoExp(estadocmbx1.getSelectedItem().toString().toUpperCase());
        ex.setNacimiento(new java.sql.Date(fnacimiento.getDate().getTime()));
        ex.setAnotaciones(anotacion.getText().toUpperCase());
        ex.setDesdeCuandoAlterA(desalteralimen1.getText().toUpperCase());
        ex.setDesdeCuandoAlterS(desalteralimen2.getText().toUpperCase());
        ex.setTiempoLaborando(tiemlab.getText().toUpperCase());
        ex.setnOcaiconesRA(ocaciones.getSelectedItem().toString().toUpperCase());
        ex.setTiempoEstadoLaboral(taprox.getText().toUpperCase());
        ex.setDondeLabora(donlabora.getText().toUpperCase());
       
            //Vector<SetGetExp> vr = new Vector<>();
            this.vr.add(ex);
            nuevoID = edao.guardarExpediente(vr);
            JOptionPane.showMessageDialog(null, "Se ha guardado el expediente exitosamente FOLIO: "+nuevoID);
            this.hide();
        
        }
        
        catch(Exception re){
                JOptionPane.showMessageDialog(null,
                    "No se pudo conectar a la base de datos: " + re.getLocalizedMessage(),
                    "Error en el ingeso de expediente de expediente",
                    JOptionPane.ERROR_MESSAGE);
            }
    }
        else{             
             JOptionPane.showMessageDialog(null, "Esta persona ya esta asignada al expediente "+
                     edao.buscarExpRepetido(Integer.parseInt(idpersona.getText())),
                "Esta persona ya tiene un expediente creado", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_generarActionPerformed

    private void guardarp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarp1ActionPerformed
        //guardar la seccion uno de nuestro expeidente, validar los campos necesarios
        if(nombre.getText().isEmpty() || edad.getSelectedIndex()<=0 || fnacimiento.getDate()==null || sexo.getSelectedIndex()<=0
                || estcivil.getSelectedIndex()<=0 || dom.getText().isEmpty() || muni1.getText().isEmpty() || col.getText().isEmpty()
                || parroquia.getText().isEmpty() || escola.getSelectedIndex()<=0 || religion.getText().isEmpty() 
                || primvez.getSelectedIndex()<=0 || quienderivo.getSelectedIndex()<=0 || disposicion.getSelectedIndex()<=0){
            JOptionPane.showMessageDialog(null, "Revise que todos los campos obligatorios están correctamente llenados",
                "Error en el llenado de formulario.", JOptionPane.ERROR_MESSAGE);
           
       }
        else{
            ban1= true;
            this.Expediente.setBackgroundAt(this.Expediente.getSelectedIndex(), Color.lightGray);
            
            try{ 
                        expedienteDAO rdao=new expedienteDAO();
                        SetGetPcontacto persona=new SetGetPcontacto();
                        persona.setNombre(nombre.getText().toUpperCase());
                        persona.setApellidoP(apepat.getText().toUpperCase());
                        persona.setApellidoM(apemat.getText().toUpperCase());
                        persona.setTelefono(tel.getText().toUpperCase());
                        persona.setId_persona(Integer.parseInt(idpersona.getText().toString()));
                        Vector<SetGetPcontacto> vr = new Vector<>();
                        vr.add(persona);
                        rdao.modificarPersonaBoton(vr);
                        JOptionPane.showMessageDialog(null, "Se ha guardado esta seccion correcamente");
                    }
                    catch(Exception re){
                        JOptionPane.showMessageDialog(null,
                        "No se pudo conectar a la base de datos: " + re.getMessage(),
                        "Error de conexion",
                        JOptionPane.ERROR_MESSAGE);
                    }
            
        }
    }//GEN-LAST:event_guardarp1ActionPerformed
    
    private void guardarp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarp2ActionPerformed
        //guardar seccion dos del expeidente, validar campos
        if(depecon.getSelectedIndex()<=0  || donlabora.getText().isEmpty() || funtrab.getText().isEmpty()
                || descuando.getText().isEmpty() || tiemlab.getText().isEmpty() || ingrmes.getText().isEmpty()  
                || dependientes.getSelectedIndex()<=0 || persingr.getSelectedIndex()<=0 || estadocasa.isSelected(null)){
                JOptionPane.showMessageDialog(null, "Revise que todos los campos obligatorios están correctamente llenados",
                "Error en el llenado de formulario.", JOptionPane.ERROR_MESSAGE);
        }
        
        else{
            this.Expediente.setBackgroundAt(this.Expediente.getSelectedIndex(), Color.lightGray);
            ban2= true;
            JOptionPane.showMessageDialog(null, "Se ha guardado esta seccion correcamente");
        }
    }//GEN-LAST:event_guardarp2ActionPerformed

    private void guardarp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarp3ActionPerformed
        //guardar seccion tres del expeidente, validar campos
        if( jTextArea1.getText().isEmpty() || recatencion.getSelectedIndex()<=0 
                || bajomed.getSelectedIndex()<=0){
            JOptionPane.showMessageDialog(null, "Revise que todos los campos obligatorios están correctamente llenados",
                "Error en el llenado de formulario.", JOptionPane.ERROR_MESSAGE);
        }
        else if(banRA==true &&  (termtratamiento.getSelectedIndex()<=0
                || ocaciones.getSelectedIndex()<=0 || endonde.getText().isEmpty() || motsus.getText().isEmpty())){
            JOptionPane.showMessageDialog(null, "Revise que todos los campos obligatorios están correctamente llenados",
                "Error en el llenado de formulario.", JOptionPane.ERROR_MESSAGE);
        }
        else if(ban2RA==true && (bajomed.getSelectedIndex()<=0 || nommed.getText().isEmpty())){
            JOptionPane.showMessageDialog(null, "Revise que todos los campos obligatorios están correctamente llenados",
                "Error en el llenado de formulario.", JOptionPane.ERROR_MESSAGE);
        }
        else{
            this.Expediente.setBackgroundAt(this.Expediente.getSelectedIndex(), Color.lightGray);
            ban3= true;
            JOptionPane.showMessageDialog(null, "Se ha guardado esta seccion correcamente");
        }
    }//GEN-LAST:event_guardarp3ActionPerformed

    private void recatencionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recatencionMouseClicked
        //ya no se usa tengo que borrarlo
    }//GEN-LAST:event_recatencionMouseClicked

    private void recatencionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_recatencionItemStateChanged
        
        if(recatencion.getSelectedIndex()==1){
            termtratamiento.setEnabled(true);
            ocaciones.setEnabled(true);
            endonde.setEnabled(true);
            motsus.setEnabled(true);
            banRA=true;
        }
        if(recatencion.getSelectedIndex()==2){
            termtratamiento.setEnabled(false);
            termtratamiento.setSelectedIndex(0);
            ocaciones.setEnabled(false);
            ocaciones.setSelectedIndex(0);
            endonde.setEnabled(false);
            endonde.setText(null);
            motsus.setEnabled(false);
            motsus.setText(null);
            banRA=false;
        }
    }//GEN-LAST:event_recatencionItemStateChanged

    private void bajomedItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_bajomedItemStateChanged
        if(bajomed.getSelectedIndex()==1){
            nommed.setEnabled(true);
            ban2RA=true;
        }
        if(bajomed.getSelectedIndex()==2){
            nommed.setEnabled(false);
            nommed.setText(null);
            ban2RA=false;
        }
    }//GEN-LAST:event_bajomedItemStateChanged

    private void talla11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_talla11KeyPressed
                   
    }//GEN-LAST:event_talla11KeyPressed

    private void talla11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_talla11KeyTyped
        char tel=evt.getKeyChar();
       if((tel<'0' || tel>'9')) evt.consume();
    }//GEN-LAST:event_talla11KeyTyped

    private void peso11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_peso11KeyTyped
        char tel=evt.getKeyChar();
        if((tel<'0' || tel>'9')) evt.consume();
        
    }//GEN-LAST:event_peso11KeyTyped

    private void calcularbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularbActionPerformed
        //calcular el INC
        if((peso11.getText().isEmpty() || talla11.getText().isEmpty())){       
        JOptionPane.showMessageDialog(null,
                "Revise que los campos esten correctamente llenados" ,
                "Existen campos vacios",
                JOptionPane.ERROR_MESSAGE);
        }
        else{           
            DecimalFormat formato = new DecimalFormat("#.##");
        Double peso,talla,imc;
        peso=Double.parseDouble(peso11.getText());
        talla=Double.parseDouble(talla11.getText())/100;
        System.out.print(talla);
        imc=(peso)/(talla*talla);
        imc1.setText(formato.format(imc));
            
        }
    }//GEN-LAST:event_calcularbActionPerformed

    private void guardarp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarp4ActionPerformed
        //guardar seccion 4 del expeidente, validar campos
        if(imc1.getText().isEmpty() || higiene.getSelectedIndex()<=0 || altermarcha.getSelectedIndex()<=0 || alterhabla.getSelectedIndex()<=0
                || anotacion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Revise que todos los campos obligatorios están correctamente llenados",
                "Error en el llenado de formulario.", JOptionPane.ERROR_MESSAGE);
        }
        else{
            this.Expediente.setBackgroundAt(this.Expediente.getSelectedIndex(), Color.lightGray);
            ban4=true;
            JOptionPane.showMessageDialog(null, "Se ha guardado esta seccion correcamente");
        }
    }//GEN-LAST:event_guardarp4ActionPerformed

    private void guardarp5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarp5ActionPerformed
        //guardar seccion 6 del expeidente, validar campos
        if(tabaco.isSelected() && frectab.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Revise que todos los campos obligatorios están correctamente llenados",
                "Error en el llenado de formulario.", JOptionPane.ERROR_MESSAGE);
        }
        else if(alcohol.isSelected() && frecalco.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Revise que todos los campos obligatorios están correctamente llenados",
                "Error en el llenado de formulario.", JOptionPane.ERROR_MESSAGE);
        }
        else if(otra.isSelected() && (cualdroga.getText().isEmpty() || frecotra3.getText().isEmpty())){
            JOptionPane.showMessageDialog(null, "Revise que todos los campos obligatorios están correctamente llenados",
                "Error en el llenado de formulario.", JOptionPane.ERROR_MESSAGE);
        }
        else if(altersueño.isSelected() && (cualaltersueño.getText().isEmpty() || desalteralimen2.getText().isEmpty())){
            JOptionPane.showMessageDialog(null, "Revise que todos los campos obligatorios están correctamente llenados",
                "Error en el llenado de formulario.", JOptionPane.ERROR_MESSAGE);
        }
        else if(alteralimen.isSelected() && (cualalteralimen.getText().isEmpty() || desalteralimen1.getText().isEmpty())){
             JOptionPane.showMessageDialog(null, "Revise que todos los campos obligatorios están correctamente llenados",
                "Error en el llenado de formulario.", JOptionPane.ERROR_MESSAGE);
        }
        else if(camb.isSelected() && desalteralimen.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Revise que todos los campos obligatorios están correctamente llenados",
                "Error en el llenado de formulario.", JOptionPane.ERROR_MESSAGE);
        }
        else if(camb1.isSelected() && desalteralimen3.getText().isEmpty()){
            
        }
        else{
            this.Expediente.setBackgroundAt(this.Expediente.getSelectedIndex(), Color.lightGray);
            ban5=true;
            JOptionPane.showMessageDialog(null, "Se ha guardado esta seccion correcamente");
        }
    }//GEN-LAST:event_guardarp5ActionPerformed

    private void neurologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neurologiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_neurologiaActionPerformed

    private void atenespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atenespActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atenespActionPerformed

    private void asesoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asesoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asesoriaActionPerformed

    private void nutricionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutricionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nutricionActionPerformed

    private void psicologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psicologiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psicologiaActionPerformed

    private void psiquiatriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psiquiatriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psiquiatriaActionPerformed

    private void guardarp7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarp7ActionPerformed
        
//guardar seccion 7 del expeidente, validar campos
        if(cuota.getText().isEmpty() || estadocmbx.getSelectedIndex()<=0 ||  cuota.getText().isEmpty() || atendiocmbx.getSelectedIndex()==0
                || !(neurologia.isSelected() || nutricion.isSelected() || psicologia.isSelected() || asesoria.isSelected() || atenesp.isSelected()
                || psiquiatria.isSelected())){
            JOptionPane.showMessageDialog(null, "Revise que todos los campos obligatorios están correctamente llenados",
                "Error en el llenado de formulario.", JOptionPane.ERROR_MESSAGE);
        }
        else {
            ban7= true;
            this.Expediente.setBackgroundAt(this.Expediente.getSelectedIndex(), Color.lightGray);
            JOptionPane.showMessageDialog(null, "Se ha guardado esta seccion correcamente");
            if(ban1==true && ban2==true && ban3==true && ban4==true && ban5==true && ban6==true && ban7==true){
                generar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_guardarp7ActionPerformed

    private void tabacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabacoActionPerformed
        //validar campos para habilitar y feshabilitar componentes en el radiobuttom de tabaco
        frectab.setEnabled(true);
        if(!tabaco.isSelected()){
            frectab.setEnabled(false);
            frectab.setText(null);}
    }//GEN-LAST:event_tabacoActionPerformed

    private void alcoholActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alcoholActionPerformed
        //validar campos para habilitar y feshabilitar componentes en el radiobuttom de alcohol
        frecalco.setEnabled(true);
            if(!alcohol.isSelected()){
            frecalco.setEnabled(false);
            frecalco.setText(null);}
    }//GEN-LAST:event_alcoholActionPerformed

    private void otraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otraActionPerformed
        //validar campos para habilitar y feshabilitar componentes en el radiobuttom de drogas
        cualdroga.setEnabled(true);
        frecotra3.setEnabled(true);
        if(!otra.isSelected()){
            cualdroga.setEnabled(false);
            frecotra3.setEnabled(false);
            cualdroga.setText(null);
            frecotra3.setText(null);
            
        }
    }//GEN-LAST:event_otraActionPerformed

    private void altersueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altersueñoActionPerformed
        //validar campos para habilitar y feshabilitar componentes en el radiobuttom de alteraciones en la marcha
        cualaltersueño.setEnabled(true);
        desalteralimen2.setEnabled(true);
        if(!altersueño.isSelected()){
            cualaltersueño.setEnabled(false);
            desalteralimen2.setEnabled(false);
            cualaltersueño.setText(null);
            desalteralimen2.setText(null);
        }
    }//GEN-LAST:event_altersueñoActionPerformed

    private void alteralimenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alteralimenActionPerformed
        //validar campos para habilitar y feshabilitar componentes en el radiobuttom de alteraciones en el sueño
        cualalteralimen.setEnabled(true);
        desalteralimen1.setEnabled(true);
        if(!alteralimen.isSelected()){
            cualalteralimen.setEnabled(false);
            desalteralimen1.setEnabled(false);
            cualalteralimen.setText(null);           
            desalteralimen1.setText(null);
        }
    }//GEN-LAST:event_alteralimenActionPerformed

    private void cambActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambActionPerformed
        desalteralimen.setEnabled(true);
        if(!camb.isSelected()){
            desalteralimen.setEnabled(false);
            desalteralimen.setText(null);}
    }//GEN-LAST:event_cambActionPerformed

    private void camb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camb1ActionPerformed
        desalteralimen3.setEnabled(true);
        if(!camb1.isSelected()){
            desalteralimen3.setEnabled(false);
             desalteralimen3.setText(null);
                     }
    }//GEN-LAST:event_camb1ActionPerformed

    private void ingrmesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingrmesKeyTyped
        char tel=evt.getKeyChar();
        if((tel<'0' || tel>'9')) evt.consume();
    }//GEN-LAST:event_ingrmesKeyTyped

    private void cuotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuotaKeyTyped
        
    }//GEN-LAST:event_cuotaKeyTyped

    private void depeconItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_depeconItemStateChanged
        if(depecon.getSelectedIndex()==1)
            quienlab.setEnabled(true);
        else
            quienlab.setEnabled(false);
    }//GEN-LAST:event_depeconItemStateChanged

    private void expedientestxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_expedientestxtKeyReleased
       char cTeclaPresionada=evt.getKeyChar();
       String aux=expedientestxt.getText();
        expedientestxt.setText(aux.toUpperCase());
       if(cTeclaPresionada==KeyEvent.VK_ENTER){           
            buscar1.doClick();
        }
    }//GEN-LAST:event_expedientestxtKeyReleased

    private void buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar1ActionPerformed
        if(!expedientestxt.getText().isEmpty()){ 
        try{
            expedienteDAO edao=new expedienteDAO();
            Collection<SetGetExp> consulta=edao.buscarExp(Integer.parseInt(expedientestxt.getText()));
            Iterator<SetGetExp> it=consulta.iterator();
            SetGetExp arreglo;
            DefaultTableModel tabla = (DefaultTableModel)expedientes.getModel();
            tabla.setRowCount(0);
            while(it.hasNext()){
            arreglo=it.next();
            tabla.addRow(arreglo.toObjectArray());
        }
        }catch(Exception re){
            JOptionPane.showMessageDialog(null,
                    "No se pudo conectar a la base de datos ",
                    "Error de conexion",
                    JOptionPane.ERROR_MESSAGE);
        }
        }
        else{
            JOptionPane.showMessageDialog(null,
                    "Debe de poner un numero de expediente" ,
                    "Campo vacio",
                    JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_buscar1ActionPerformed

    private void expedientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expedientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_expedientesMouseClicked

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
       if(expedientes.getSelectedRow()>=0){
        
       String serviciosm="";
        String derivadoa="";
        expedienteDAO edao=new expedienteDAO();
        ImageIcon labelGenograma;
       if(banModificar==1){
           try{
            Collection<SetGetExp> consulta=edao.cargarModificaExp(Integer.parseInt(expedientes.getValueAt(expedientes.getSelectedRow(), 0).toString()));
            Iterator<SetGetExp> it=consulta.iterator();
            SetGetExp arreglo;
            while(it.hasNext()){
            arreglo=it.next();
            
            BufferedImage im=ImageIO.read(arreglo.getGeno());
            labelGenograma=new ImageIcon(im);
            Image foto= labelGenograma.getImage();
            Image newfoto= foto.getScaledInstance(imagenlbl.getWidth(), imagenlbl.getHeight(), java.awt.Image.SCALE_SMOOTH);
            ImageIcon newicon=new ImageIcon(newfoto);
            imagenlbl.setIcon(newicon);
            mod.setVisible(false);
            escola.setSelectedItem(arreglo.getEscolaridad());
            edad.setSelectedItem(arreglo.getEdad().toString());
            sexo.setSelectedItem(arreglo.getSexo());
            ocup.setText(arreglo.getOcupacion());
            //System.out.print(arreglo.getEstadoCivil());
            estcivil.setSelectedItem(arreglo.getEstadoCivil()); 
            religion.setText(arreglo.getReligion());
            dom.setText(arreglo.getDomicilo());
            parroquia.setText(arreglo.getParroquia());           
            col.setText(arreglo.getColonia());
            muni1.setText(arreglo.getMunicipio());
            if(arreglo.isPrimeraVez())
            primvez.setSelectedIndex(1);
            else           
            primvez.setSelectedIndex(2);                      
            cuando.setText(arreglo.getCuando());
            quienderivo.setSelectedItem(arreglo.getQuienDerivo());       
            if(arreglo.isDisposicion())
            disposicion.setSelectedIndex(1);
            else
            disposicion.setSelectedIndex(2);
        
            if(arreglo.isDependienteEc())
                depecon.setSelectedIndex(1);
            else
                depecon.setSelectedIndex(2);
            quienlab.setText(arreglo.getQuienLabora());
            funtrab.setText(arreglo.getFuncionTrabajo());
            descuando.setText(arreglo.getDesdeCuandoTra());
           ingrmes.setText(arreglo.getIngresoMes().toString());
           
                
                
                if(arreglo.getEstadoLaboral()=="DESEMPLEADO")
                     desempleado2.setSelected(true);
                if(arreglo.getEstadoLaboral()=="JUBILADO")        
                    jubilado.setSelected(true);
                if(arreglo.getEstadoLaboral()=="INDIGENTE")   
                    indigente.setSelected(true);
           
                        
           dependientes.setSelectedItem(arreglo.getnDependientes().toString());
           persingr.setSelectedItem(arreglo.getnPersonaIngresan().toString());
            
             if(arreglo.getPosesionCasa().equals("PROPIA"))   
                propia.setSelected(true);
             if(arreglo.getPosesionCasa().equals("RENTADA"))   
                rentada.setSelected(true);
             if(arreglo.getPosesionCasa().equals("PRESTADA"))   
                prestada.setSelected(true);
             String array[]=arreglo.getServiciosMedicos().split(",");
             
             for(int i=0;i<array.length;i++){
                if(array[i].equals("IMSS"))
                    imss.setSelected(true);
                if(array[i].equals("ISSTE"))
                    isste.setSelected(true);
                if(array[i].equals("SEGURO P."))
                    segurop.setSelected(true);
                if(array[i].equals("PRIVADO"))
                    segurop1.setSelected(true);
             }
            enfcronica.setText(arreglo.getEnfermedadCronica());
            jTextArea1.setText(arreglo.getExploracionClinica());
            recatencion.setSelectedItem(arreglo.getAtencionRA());
            endonde.setText(arreglo.getLugraRA());

            if(arreglo.isTerminoRA())                
            termtratamiento.setSelectedIndex(1);
            else
                 termtratamiento.setSelectedIndex(2);
            motsus.setText(arreglo.getMotivoTerminoRa());


            if(arreglo.isEstaBajoTrata())               
            bajomed.setSelectedIndex(1);
            else
                bajomed.setSelectedIndex(2);
            nommed.setText(arreglo.getMedicamentos());
            peso11.setText(String.valueOf(arreglo.getPeso()));
            talla11.setText(String.valueOf(arreglo.getTalla()));
            imc1.setText(String.valueOf(arreglo.getImc()));
            higiene.setSelectedItem(arreglo.getHigiene());
            altermarcha.setSelectedItem(arreglo.getAlteracionesMarcha());
            alterhabla.setSelectedItem(arreglo.getAlteracionesHabla());
            if(arreglo.isFuma())
                tabaco.setSelected(true);
            frectab.setText(arreglo.getFrecFuma());
            if(arreglo.isBebeAlcohol())
                alcohol.setSelected(true);
            frecalco.setText(arreglo.getFrecAlcohol());
            if(arreglo.isDrogas())
                otra.setSelected(true);
            cualdroga.setText(arreglo.getCualesDrogas());
            frecotra3.setText(arreglo.getFrecDrogas());
            if(arreglo.isAlteracionesSueño())
                altersueño.setSelected(true);
            cualaltersueño.setText(arreglo.getTipoAlteraionesSueño());
            if(arreglo.isAlteracionesAlimenticias())
                alteralimen.setSelected(true);
            cualalteralimen.setText(arreglo.getTipoAlteracionesAlim());
            if(arreglo.getCambiosAnimo().equals("SI"))
                camb.setSelected(true);
            else
                camb.setSelected(false);
            desalteralimen.setText(arreglo.getDesdeCuandoAlterA());
            diagnostico.setText(arreglo.getDiagPresuntivo());
            String array2[]=arreglo.getDerivadoA().split(",");
            for(int i=0;i<array2.length;i++){
                if(array2[i].equals("NEUROLOGIA"))
                    neurologia.setSelected(true);
                if(array2[i].equals("NUTRICION"))
                    nutricion.setSelected(true);
                if(array2[i].equals("PSICOLOGIA"))
                    psicologia.setSelected(true);
                if(array2[i].equals("ASESORIA LEGAL"))
                    asesoria.setSelected(true);
                if(array2[i].equals("PSIQUIATRIA"))
                    psiquiatria.setSelected(true);
                if(array2[i].equals("ATENCION ESPIRITUAL"))
                    atenesp.setSelected(true);
                if(array2[i].equals("OTRO"))
                    otro.setSelected(true);
            }
            atendiocmbx.setSelectedItem(arreglo.getProQueAtendio());
            cuota.setText(String.valueOf(arreglo.getCuota()));
            idpersona.setText(arreglo.getId_persona().toString());
            //idter.setText(arreglo.getId_terapeuta().toString());
            if(arreglo.isSantecedentesPenales())
                camb1.setSelected(true);
            desalteralimen3.setText(arreglo.getAntecedentesPenales());
            estadocmbx.setSelectedItem(arreglo.getEstadoPaciente());
            estadocmbx1.setSelectedItem(arreglo.getTipoExp());
            fnacimiento.setDate(arreglo.getNacimiento());
            anotacion.setText(arreglo.getAnotaciones());
            desalteralimen1.setText(arreglo.getDesdeCuandoAlterA());
            desalteralimen2.setText(arreglo.getDesdeCuandoAlterS());
            tiemlab.setText(arreglo.getTiempoLaborando());
            ocaciones.setSelectedItem(arreglo.getnOcaiconesRA().toString());
            taprox.setText(arreglo.getTiempoEstadoLaboral());
            donlabora.setText(arreglo.getDondeLabora());
            guardar.setEnabled(true);           
        }
        }catch(Exception re){
            JOptionPane.showMessageDialog(null,
                    "No se pudo conectar a la base de datos",
                    "Error de conexion",
                    JOptionPane.ERROR_MESSAGE);
        }
       }
        //SetGetExp ex= new SetGetExp();
        if(banModificar==2){
            banModificar=0;
                
        try{
        ex.setEscolaridad(escola.getSelectedItem().toString().toUpperCase());
        ex.setEdad(Integer.parseInt(edad.getSelectedItem().toString()));
        ex.setSexo(sexo.getSelectedItem().toString().toUpperCase());
        ex.setOcupacion(ocup.getText().toUpperCase());
        ex.setEstadoCivil(estcivil.getSelectedItem().toString().toUpperCase());
        ex.setReligion(religion.getText().toUpperCase());
        ex.setDomicilo(dom.getText().toUpperCase());
        ex.setParroquia(parroquia.getText().toUpperCase());
        ex.setColonia(col.getText().toUpperCase());
        ex.setMunicipio(muni1.getText().toUpperCase());
        if(primvez.getSelectedItem().equals("SI"))
            ex.setPrimeraVez(true);
        else           
        ex.setPrimeraVez(false);
        
        ex.setCuando(cuando.getText().toUpperCase());
        ex.setQuienDerivo(quienderivo.getSelectedItem().toString().toUpperCase());
        
        if(disposicion.getSelectedItem().equals("SI"))
            ex.setDisposicion(true);
        else
            ex.setDisposicion(false);
        
        if(depecon.getSelectedItem().equals("SI"))
            ex.setDependienteEc(true);
        else
            ex.setDependienteEc(false);
        
        ex.setQuienLabora(quienlab.getText().toUpperCase());
        /**/ex.setFuncionTrabajo(funtrab.getText().toUpperCase());
        ex.setDesdeCuandoTra(descuando.getText().toUpperCase());
        ex.setIngresoMes(Integer.valueOf(ingrmes.getText()));
        if(desempleado2.isSelected())
            ex.setEstadoLaboral("DESEMPLEADO");
        if(jubilado.isSelected())
            ex.setEstadoLaboral("JUBILADO");
        if(indigente.isSelected())
            ex.setEstadoLaboral("INDIGENTE");
        
        
        ex.setnDependientes(Integer.valueOf(dependientes.getSelectedItem().toString()));
        ex.setnPersonaIngresan(Integer.valueOf(persingr.getSelectedItem().toString()));
         if(propia.isSelected())   
            ex.setPosesionCasa("PROPIA");
         if(rentada.isSelected())   
            ex.setPosesionCasa("RENTADA");
         if(prestada.isSelected())   
            ex.setPosesionCasa("PRESTADA");
        
        if(imss.isSelected())
            serviciosm=serviciosm.concat(",".concat(imss.getText())).toUpperCase();
        if(isste.isSelected())
            serviciosm=serviciosm.concat(",".concat(isste.getText())).toUpperCase();
        if(segurop.isSelected())
            serviciosm=serviciosm.concat(",".concat(segurop.getText())).toUpperCase();
        if(segurop1.isSelected())
            serviciosm=serviciosm.concat(",".concat(segurop1.getText())).toUpperCase();
        ex.setServiciosMedicos(serviciosm);
        ex.setEnfermedadCronica(enfcronica.getText().toUpperCase());
        ex.setExploracionClinica(jTextArea1.getText().toUpperCase());
        ex.setAtencionRA(recatencion.getSelectedItem().toString().toUpperCase());
        ex.setLugraRA(endonde.getText().toUpperCase());
        
        if(termtratamiento.getSelectedItem().equals("SI"))
            ex.setTerminoRA(true);
        else
            ex.setTerminoRA(false);
        
        ex.setMotivoTerminoRa(motsus.getText().toUpperCase());
        
        if(bajomed.getSelectedItem().equals("SI"))
            ex.setEstaBajoTrata(true);
        else
            ex.setEstaBajoTrata(false);
        
        ex.setMedicamentos(nommed.getText().toUpperCase());
        ex.setPeso(Double.valueOf(peso11.getText()));
        ex.setTalla(Double.valueOf(talla11.getText()));
        ex.setImc(Double.valueOf(imc1.getText()));
        ex.setHigiene(higiene.getSelectedItem().toString().toUpperCase());
        ex.setAlteracionesMarcha(altermarcha.getSelectedItem().toString().toUpperCase());
        ex.setAlteracionesHabla(alterhabla.getSelectedItem().toString().toUpperCase());
        ex.setFuma(tabaco.isSelected());
        ex.setFrecFuma(frectab.getText().toUpperCase());
        ex.setBebeAlcohol(alcohol.isSelected());
        ex.setFrecAlcohol(frecalco.getText().toUpperCase());
        ex.setDrogas(otra.isSelected());
        ex.setCualesDrogas(cualdroga.getText().toUpperCase());
        ex.setFrecDrogas(frecotra3.getText().toUpperCase());
        ex.setAlteracionesSueño(altersueño.isSelected());
        ex.setTipoAlteraionesSueño(cualaltersueño.getText().toUpperCase());
        ex.setAlteracionesAlimenticias(alteralimen.isSelected());
        ex.setTipoAlteracionesAlim(cualalteralimen.getText().toUpperCase());
        if(camb.isSelected())
            ex.setCambiosAnimo("SI");
        else
            ex.setCambiosAnimo("NO");
        ex.setDesdeCuandoCA(desalteralimen.getText());
        ex.setDiagPresuntivo(diagnostico.getText());
        if(neurologia.isSelected())
            derivadoa=derivadoa.concat(",".concat(neurologia.getText())).toUpperCase();
        if(nutricion.isSelected())
            derivadoa=derivadoa.concat(",".concat(nutricion.getText())).toUpperCase();
        if(psicologia.isSelected())
            derivadoa=derivadoa.concat(",".concat(psicologia.getText()).toUpperCase());
        if(atenesp.isSelected())
            derivadoa=derivadoa.concat(",".concat(atenesp.getText())).toUpperCase();
        if(psiquiatria.isSelected())
            derivadoa=derivadoa.concat(",".concat(psiquiatria.getText())).toUpperCase();
        if(asesoria.isSelected())
            derivadoa=derivadoa.concat(",".concat(asesoria.getText())).toUpperCase();
        if(otro.isSelected())
            derivadoa=derivadoa.concat(",".concat(otro.getText())).toUpperCase();
        ex.setDerivadoA(derivadoa);
        ex.setProQueAtendio(atendiocmbx.getSelectedItem().toString().toUpperCase());
        ex.setCuota(cuota.getText().toUpperCase());
        ex.setId_persona(Integer.parseInt(idpersona.getText()));
        //ex.setId_terapeuta(Integer.valueOf(idter.getText()));
        ex.setSantecedentesPenales(camb1.isSelected());
        ex.setAntecedentesPenales(desalteralimen3.getText().toUpperCase());
        ex.setEstadoPaciente(estadocmbx.getSelectedItem().toString().toUpperCase());
        ex.setTipoExp(estadocmbx1.getSelectedItem().toString().toUpperCase());
        ex.setNacimiento(new java.sql.Date(fnacimiento.getDate().getTime()));
        ex.setAnotaciones(anotacion.getText().toUpperCase());
        ex.setDesdeCuandoAlterA(desalteralimen1.getText().toUpperCase());
        ex.setDesdeCuandoAlterS(desalteralimen2.getText().toUpperCase());
        ex.setTiempoLaborando(tiemlab.getText().toUpperCase());
        ex.setnOcaiconesRA(ocaciones.getSelectedItem().toString().toUpperCase());
        ex.setTiempoEstadoLaboral(taprox.getText().toUpperCase());
        ex.setDondeLabora(donlabora.getText().toUpperCase());
       
            //Vector<SetGetExp> vr = new Vector<>();
            this.vr.add(ex);
            if(banderaImagenModificar)
                edao.modificarExpedienteGeno(vr,Integer.parseInt(expedientes.getValueAt(expedientes.getSelectedRow(), 0).toString()));
            else
                edao.modificarExpedienteNoGeno(vr,Integer.parseInt(expedientes.getValueAt(expedientes.getSelectedRow(), 0).toString()));
            JOptionPane.showMessageDialog(null, "Se ha modificado exitosamente el expediente");
            banderaImagenModificar=false;
            this.hide();
        }catch(Exception re){
                JOptionPane.showMessageDialog(null,
                    "No se pudo conectar a la base de datos: " + re.getMessage(),
                    "Error en la alta de persona",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
       }
       else{
           JOptionPane.showMessageDialog(null,
                    "Debe de selecconar un numero de expediente" ,
                    "No se ha seleccionado expediente",
                    JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_modActionPerformed

    private void expedientestxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_expedientestxtKeyTyped
        char tel=evt.getKeyChar();
        if((tel<'0' || tel>'9')) evt.consume();
    }//GEN-LAST:event_expedientestxtKeyTyped

    private void desempleado2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_desempleado2ItemStateChanged

        
        
        
    }//GEN-LAST:event_desempleado2ItemStateChanged

    private void desempleado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desempleado2ActionPerformed
        
    }//GEN-LAST:event_desempleado2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void otroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otroActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
           banModificar=2;
           mod.doClick();
           mod.setVisible(true);
           
    }//GEN-LAST:event_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(nexpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nexpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nexpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nexpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nexpediente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Expediente;
    private javax.swing.JCheckBox alcohol;
    private javax.swing.JCheckBox alteralimen;
    private javax.swing.JComboBox alterhabla;
    private javax.swing.JComboBox altermarcha;
    private javax.swing.JCheckBox altersueño;
    private javax.swing.JTextArea anotacion;
    private javax.swing.JTextField apemat;
    private javax.swing.JTextField apepat;
    private javax.swing.JCheckBox asesoria;
    private javax.swing.JComboBox atendiocmbx;
    private javax.swing.JCheckBox atenesp;
    private javax.swing.JComboBox bajomed;
    private javax.swing.JButton buscar;
    private javax.swing.JButton buscar1;
    private javax.swing.JButton buscargeno;
    private javax.swing.JTextField buscarpertxt;
    private javax.swing.JButton calcularb;
    private javax.swing.JCheckBox camb;
    private javax.swing.JCheckBox camb1;
    private javax.swing.JTextField col;
    private javax.swing.JTextField cualalteralimen;
    private javax.swing.JTextField cualaltersueño;
    private javax.swing.JTextField cualdroga;
    private javax.swing.JTextField cuando;
    private javax.swing.JTextField cuota;
    private javax.swing.JComboBox depecon;
    private javax.swing.JComboBox dependientes;
    private javax.swing.JTextField desalteralimen;
    private javax.swing.JTextField desalteralimen1;
    private javax.swing.JTextField desalteralimen2;
    private javax.swing.JTextField desalteralimen3;
    private javax.swing.JTextField descuando;
    private javax.swing.JCheckBox desempleado2;
    private javax.swing.JTextArea diagnostico;
    private javax.swing.JComboBox disposicion;
    private javax.swing.JTextField dom;
    private javax.swing.JTextField donlabora;
    private javax.swing.JComboBox edad;
    private javax.swing.JTextField endonde;
    private javax.swing.JTextField enfcronica;
    private javax.swing.JComboBox escola;
    private javax.swing.ButtonGroup estadocasa;
    private javax.swing.JComboBox estadocmbx;
    private javax.swing.JComboBox estadocmbx1;
    private javax.swing.ButtonGroup estatus;
    private javax.swing.JComboBox estcivil;
    private javax.swing.JTable expedientes;
    private javax.swing.JTextField expedientestxt;
    private com.toedter.calendar.JDateChooser fnacimiento;
    private javax.swing.JTextField frecalco;
    private javax.swing.JTextField frecotra3;
    private javax.swing.JTextField frectab;
    private javax.swing.JTextField funtrab;
    private javax.swing.JButton generar;
    private javax.swing.JButton guardar;
    private javax.swing.JButton guardar1;
    private javax.swing.JButton guardarp1;
    private javax.swing.JButton guardarp2;
    private javax.swing.JButton guardarp3;
    private javax.swing.JButton guardarp4;
    private javax.swing.JButton guardarp5;
    private javax.swing.JButton guardarp7;
    private javax.swing.JComboBox higiene;
    private javax.swing.JLabel idpersona;
    private javax.swing.JLabel imagenlbl;
    private javax.swing.JTextField imc1;
    private javax.swing.JButton impexp;
    private javax.swing.JRadioButton imss;
    private javax.swing.JCheckBox indigente;
    private javax.swing.JTextField ingrmes;
    private javax.swing.JRadioButton isste;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JCheckBox jubilado;
    private javax.swing.JButton mod;
    private javax.swing.JTextField motsus;
    private javax.swing.JTextField muni1;
    private javax.swing.JCheckBox neurologia;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextArea nommed;
    private javax.swing.JCheckBox nutricion;
    private javax.swing.JComboBox ocaciones;
    private javax.swing.JTextField ocup;
    private javax.swing.JCheckBox otra;
    private javax.swing.JCheckBox otro;
    private javax.swing.JTextField parroquia;
    private javax.swing.JComboBox persingr;
    private javax.swing.JTable personaexp;
    private javax.swing.JTextField peso11;
    private javax.swing.JRadioButton prestada;
    private javax.swing.JComboBox primvez;
    private javax.swing.JRadioButton propia;
    private javax.swing.JCheckBox psicologia;
    private javax.swing.JCheckBox psiquiatria;
    private javax.swing.JComboBox quienderivo;
    private javax.swing.JTextField quienlab;
    private javax.swing.JComboBox recatencion;
    private javax.swing.JTextField religion;
    private javax.swing.JRadioButton rentada;
    private javax.swing.JRadioButton segurop;
    private javax.swing.JRadioButton segurop1;
    private javax.swing.JComboBox sexo;
    private javax.swing.JCheckBox tabaco;
    private javax.swing.JTextField talla11;
    private javax.swing.JTextField taprox;
    private javax.swing.JTextField tel;
    private javax.swing.JComboBox termtratamiento;
    private javax.swing.JTextField tiemlab;
    // End of variables declaration//GEN-END:variables
    public void cargarImagen(){//cargar la imagen en el genograma
        imagenlbl.setIcon(null);
        JFileChooser j=new JFileChooser();
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado=j.showOpenDialog(null);
        if(estado==JFileChooser.APPROVE_OPTION){
            try{
                
                this.ex.setImagen(new FileInputStream(j.getSelectedFile()));                
                this.ex.setLongitug((int)j.getSelectedFile().length());;
                try{
                    Image icono=ImageIO.read(j.getSelectedFile()).getScaledInstance
                (imagenlbl.getWidth(), imagenlbl.getHeight(), Image.SCALE_DEFAULT);
                    imagenlbl.setIcon(new ImageIcon(icono));
                    imagenlbl.updateUI();
                    JOptionPane.showMessageDialog(null,"Se ha cargado la imagen exitosamente");
                    banderaImagenModificar=true;
                    ban6=true;
                    this.Expediente.setBackgroundAt(this.Expediente.getSelectedIndex(), Color.lightGray);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane, "imagen "+e);
                }
            }catch(Exception e){
                    //ex.printStackTrace();          
            }
        }
    }
    
}
