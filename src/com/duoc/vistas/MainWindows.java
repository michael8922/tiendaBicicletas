
package com.duoc.vistas;

import com.duoc.controlador.BicicletaControlador;
import com.duoc.controlador.CategoriaControlador;
import com.duoc.controlador.FabricanteControlador;
import com.duoc.controlador.UsuarioControlador;
import com.duoc.modelos.Bicicleta;
import com.duoc.modelos.Categoria;
import com.duoc.modelos.CustomException;
import com.duoc.modelos.Fabricante;
import com.duoc.modelos.Usuario;
import com.sun.glass.events.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class MainWindows extends javax.swing.JFrame {
    
    /// definir instancias controladores 
    private CategoriaControlador cc = new CategoriaControlador();
    private FabricanteControlador fc = new FabricanteControlador();       
    private BicicletaControlador bc = new BicicletaControlador();
    private UsuarioControlador uc = new UsuarioControlador();
    private int nivel_acceso = 0;
    
    
    /**
     * Creates new form MainWindows
     */
    public MainWindows() {
        initComponents();
        OcultarVentanasInicio();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupOpcionesFiltro = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jInternalFrameControlAcceso = new javax.swing.JInternalFrame();
        jLabelusername = new javax.swing.JLabel();
        jLabelpassword = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jButtonLogin = new javax.swing.JButton();
        jButtonLimpiarLogin = new javax.swing.JButton();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabelImagenLogo = new javax.swing.JLabel();
        jInternalFrameRegistroCategoria = new javax.swing.JInternalFrame();
        jLabelIdCategoria = new javax.swing.JLabel();
        jLabelDescripcionCategoria = new javax.swing.JLabel();
        jTextFieldIdCategoria = new javax.swing.JTextField();
        jTextFieldDescripcionCategoria = new javax.swing.JTextField();
        jButtonRegistrarCategoria = new javax.swing.JButton();
        jButtonLimpiarRegistroCategoria = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCategorias = new javax.swing.JTable();
        jButtonEliminarCategoria = new javax.swing.JButton();
        jButtonModificarCategoria = new javax.swing.JButton();
        jInternalRegistroFabricante = new javax.swing.JInternalFrame();
        jLabelIdFabricante = new javax.swing.JLabel();
        jLabelNombreFabricante = new javax.swing.JLabel();
        jTextFieldIdFabricante = new javax.swing.JTextField();
        jTextFieldNombreFabricante = new javax.swing.JTextField();
        jButtonRegistrarFabricante = new javax.swing.JButton();
        jButtonLimpiarRegistroFabricante = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFabricantes = new javax.swing.JTable();
        jButtonEliminarFabricante = new javax.swing.JButton();
        jButtonModificarFabricante = new javax.swing.JButton();
        jInternalFrameRegistroBicicletas = new javax.swing.JInternalFrame();
        jLabelIdBicicleta = new javax.swing.JLabel();
        jLabelmodeloBicicleta = new javax.swing.JLabel();
        jLabelfabricanteBicicleta = new javax.swing.JLabel();
        jLabelcategoriaBicicleta = new javax.swing.JLabel();
        jLabeltallaBicicleta = new javax.swing.JLabel();
        jLabelsuspensionBicicleta = new javax.swing.JLabel();
        jLabeltransmisionBicicleta = new javax.swing.JLabel();
        jLabelfrenosBicicleta = new javax.swing.JLabel();
        jLabelstockBicicleta = new javax.swing.JLabel();
        jLabelvalorBicicleta = new javax.swing.JLabel();
        jTextFieldidBicicleta = new javax.swing.JTextField();
        jTextFieldmodeloBicicleta = new javax.swing.JTextField();
        jTextFieldtallaBicicleta = new javax.swing.JTextField();
        jTextFieldsuspensionBicicleta = new javax.swing.JTextField();
        jTextFieldtransmisionBicicleta = new javax.swing.JTextField();
        jTextFieldfrenosBicicleta = new javax.swing.JTextField();
        jTextFieldstockBicicleta = new javax.swing.JTextField();
        jTextFieldvalorBicicleta = new javax.swing.JTextField();
        jComboBoxFabricantes = new javax.swing.JComboBox<>();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jButtonRegistrarBicicleta = new javax.swing.JButton();
        jButtonLimpiarBicicleta = new javax.swing.JButton();
        jButtonEliminarBicicleta = new javax.swing.JButton();
        jButtonModificarBicicleta = new javax.swing.JButton();
        jButtonBuscarBicicleta = new javax.swing.JButton();
        jButtonRedireccionRegistroFabricante = new javax.swing.JButton();
        jButtonRedireccionRegistroCategoria = new javax.swing.JButton();
        jInternalFrameAcercaDe = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelImagen = new javax.swing.JLabel();
        jInternalListadoRegistroBicicletas = new javax.swing.JInternalFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableListaRegistroBicicletas = new javax.swing.JTable();
        jPanelfiltrosBicicletas = new javax.swing.JPanel();
        jTextFieldtextoBusqueda = new javax.swing.JTextField();
        jRadioButtonfiltroModelo = new javax.swing.JRadioButton();
        jRadioButtonfiltroFabricante = new javax.swing.JRadioButton();
        jRadioButtonfiltroCategoria = new javax.swing.JRadioButton();
        jRadioButtonfiltroId = new javax.swing.JRadioButton();
        jButtonbuscarBicicleta = new javax.swing.JButton();
        jButtonRestablecerBusquedaBicicletas = new javax.swing.JButton();
        jButtonCargarDatosBicicleta = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemIniciarSesion = new javax.swing.JMenuItem();
        jMenuItemCerrarSesion = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuRegistrar = new javax.swing.JMenu();
        jMenuItemRegistroCategoria = new javax.swing.JMenuItem();
        jMenuItemRegistroFabricantes = new javax.swing.JMenuItem();
        jMenuItemRegistroBicicletas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemListadoBicicletas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemAcercaDe = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interfaz TERRY - BIKE");

        jInternalFrameControlAcceso.setClosable(true);
        jInternalFrameControlAcceso.setTitle("Control acceso");
        jInternalFrameControlAcceso.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/login.png"))); // NOI18N
        jInternalFrameControlAcceso.setVisible(true);
        jInternalFrameControlAcceso.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameControlAccesoInternalFrameOpened(evt);
            }
        });
        jInternalFrameControlAcceso.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jInternalFrameControlAccesoComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jInternalFrameControlAccesoComponentShown(evt);
            }
        });

        jLabelusername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/user.png"))); // NOI18N
        jLabelusername.setText("USUARIO");

        jLabelpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/lock.png"))); // NOI18N
        jLabelpassword.setText("CLAVE");

        jTextFieldUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUsernameFocusGained(evt);
            }
        });

        jButtonLogin.setText("LOGIN");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jButtonLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonLoginKeyPressed(evt);
            }
        });

        jButtonLimpiarLogin.setText("LIMPIAR");
        jButtonLimpiarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarLoginActionPerformed(evt);
            }
        });

        jPasswordFieldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldPasswordFocusGained(evt);
            }
        });
        jPasswordFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPasswordActionPerformed(evt);
            }
        });
        jPasswordFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldPasswordKeyPressed(evt);
            }
        });

        jLabelImagenLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagenLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/LOGO.png"))); // NOI18N

        javax.swing.GroupLayout jInternalFrameControlAccesoLayout = new javax.swing.GroupLayout(jInternalFrameControlAcceso.getContentPane());
        jInternalFrameControlAcceso.getContentPane().setLayout(jInternalFrameControlAccesoLayout);
        jInternalFrameControlAccesoLayout.setHorizontalGroup(
            jInternalFrameControlAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameControlAccesoLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jInternalFrameControlAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameControlAccesoLayout.createSequentialGroup()
                        .addGroup(jInternalFrameControlAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelusername)
                            .addComponent(jLabelpassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jInternalFrameControlAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldPassword)))
                    .addGroup(jInternalFrameControlAccesoLayout.createSequentialGroup()
                        .addComponent(jLabelImagenLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jInternalFrameControlAccesoLayout.createSequentialGroup()
                        .addComponent(jButtonLimpiarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        jInternalFrameControlAccesoLayout.setVerticalGroup(
            jInternalFrameControlAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameControlAccesoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabelImagenLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrameControlAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelusername))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameControlAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelpassword))
                .addGap(72, 72, 72)
                .addGroup(jInternalFrameControlAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpiarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        jInternalFrameRegistroCategoria.setClosable(true);
        jInternalFrameRegistroCategoria.setTitle("Registro Categoria");
        jInternalFrameRegistroCategoria.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/standings.png"))); // NOI18N
        jInternalFrameRegistroCategoria.setVisible(true);
        jInternalFrameRegistroCategoria.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jInternalFrameRegistroCategoriaComponentShown(evt);
            }
        });

        jLabelIdCategoria.setText("ID");

        jLabelDescripcionCategoria.setText("DESCRIPCION");

        jTextFieldIdCategoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldIdCategoriaFocusGained(evt);
            }
        });
        jTextFieldIdCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIdCategoriaKeyTyped(evt);
            }
        });

        jTextFieldDescripcionCategoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldDescripcionCategoriaFocusGained(evt);
            }
        });
        jTextFieldDescripcionCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDescripcionCategoriaKeyTyped(evt);
            }
        });

        jButtonRegistrarCategoria.setText("REGISTRAR");
        jButtonRegistrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarCategoriaActionPerformed(evt);
            }
        });

        jButtonLimpiarRegistroCategoria.setText("LIMPIAR");
        jButtonLimpiarRegistroCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarRegistroCategoriaActionPerformed(evt);
            }
        });

        jTableCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIPCION"
            }
        ));
        jTableCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCategoriasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCategorias);

        jButtonEliminarCategoria.setText("ELIMINAR");
        jButtonEliminarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCategoriaActionPerformed(evt);
            }
        });

        jButtonModificarCategoria.setText("MODIFICAR");
        jButtonModificarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameRegistroCategoriaLayout = new javax.swing.GroupLayout(jInternalFrameRegistroCategoria.getContentPane());
        jInternalFrameRegistroCategoria.getContentPane().setLayout(jInternalFrameRegistroCategoriaLayout);
        jInternalFrameRegistroCategoriaLayout.setHorizontalGroup(
            jInternalFrameRegistroCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameRegistroCategoriaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jInternalFrameRegistroCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jInternalFrameRegistroCategoriaLayout.createSequentialGroup()
                        .addGroup(jInternalFrameRegistroCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIdCategoria)
                            .addComponent(jLabelDescripcionCategoria)
                            .addComponent(jButtonRegistrarCategoria))
                        .addGroup(jInternalFrameRegistroCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrameRegistroCategoriaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButtonLimpiarRegistroCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonModificarCategoria)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEliminarCategoria))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameRegistroCategoriaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jInternalFrameRegistroCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDescripcionCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameRegistroCategoriaLayout.createSequentialGroup()
                                        .addComponent(jTextFieldIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)))))))
                .addGap(40, 40, 40))
        );
        jInternalFrameRegistroCategoriaLayout.setVerticalGroup(
            jInternalFrameRegistroCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameRegistroCategoriaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jInternalFrameRegistroCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdCategoria)
                    .addComponent(jTextFieldIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jInternalFrameRegistroCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescripcionCategoria)
                    .addComponent(jTextFieldDescripcionCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jInternalFrameRegistroCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpiarRegistroCategoria)
                    .addComponent(jButtonRegistrarCategoria)
                    .addComponent(jButtonModificarCategoria)
                    .addComponent(jButtonEliminarCategoria))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jInternalRegistroFabricante.setClosable(true);
        jInternalRegistroFabricante.setTitle("Registro Fabricante");
        jInternalRegistroFabricante.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/settings.png"))); // NOI18N
        jInternalRegistroFabricante.setVisible(true);
        jInternalRegistroFabricante.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jInternalRegistroFabricanteComponentShown(evt);
            }
        });

        jLabelIdFabricante.setText("ID");

        jLabelNombreFabricante.setText("NOMBRE");

        jTextFieldIdFabricante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldIdFabricanteFocusGained(evt);
            }
        });
        jTextFieldIdFabricante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIdFabricanteKeyTyped(evt);
            }
        });

        jTextFieldNombreFabricante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNombreFabricanteFocusGained(evt);
            }
        });
        jTextFieldNombreFabricante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreFabricanteKeyTyped(evt);
            }
        });

        jButtonRegistrarFabricante.setText("REGISTRAR");
        jButtonRegistrarFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarFabricanteActionPerformed(evt);
            }
        });

        jButtonLimpiarRegistroFabricante.setText("LIMPIAR");
        jButtonLimpiarRegistroFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarRegistroFabricanteActionPerformed(evt);
            }
        });

        jTableFabricantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE"
            }
        ));
        jTableFabricantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFabricantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFabricantes);

        jButtonEliminarFabricante.setText("ELIMINAR");
        jButtonEliminarFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarFabricanteActionPerformed(evt);
            }
        });

        jButtonModificarFabricante.setText("MODIFICAR");
        jButtonModificarFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarFabricanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalRegistroFabricanteLayout = new javax.swing.GroupLayout(jInternalRegistroFabricante.getContentPane());
        jInternalRegistroFabricante.getContentPane().setLayout(jInternalRegistroFabricanteLayout);
        jInternalRegistroFabricanteLayout.setHorizontalGroup(
            jInternalRegistroFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalRegistroFabricanteLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jInternalRegistroFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalRegistroFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jInternalRegistroFabricanteLayout.createSequentialGroup()
                            .addComponent(jButtonRegistrarFabricante)
                            .addGap(10, 10, 10)
                            .addComponent(jButtonEliminarFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonModificarFabricante)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonLimpiarRegistroFabricante))
                        .addGroup(jInternalRegistroFabricanteLayout.createSequentialGroup()
                            .addGroup(jInternalRegistroFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelIdFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelNombreFabricante))
                            .addGap(51, 51, 51)
                            .addGroup(jInternalRegistroFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldIdFabricante)
                                .addComponent(jTextFieldNombreFabricante)))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jInternalRegistroFabricanteLayout.setVerticalGroup(
            jInternalRegistroFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalRegistroFabricanteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jInternalRegistroFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIdFabricante)
                    .addComponent(jTextFieldIdFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jInternalRegistroFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreFabricante)
                    .addComponent(jTextFieldNombreFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jInternalRegistroFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrarFabricante)
                    .addComponent(jButtonLimpiarRegistroFabricante)
                    .addComponent(jButtonEliminarFabricante)
                    .addComponent(jButtonModificarFabricante))
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jInternalFrameRegistroBicicletas.setClosable(true);
        jInternalFrameRegistroBicicletas.setTitle("Registro Bicicletas");
        jInternalFrameRegistroBicicletas.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/bike.png"))); // NOI18N
        jInternalFrameRegistroBicicletas.setVisible(true);
        jInternalFrameRegistroBicicletas.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameRegistroBicicletasInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameRegistroBicicletasInternalFrameOpened(evt);
            }
        });
        jInternalFrameRegistroBicicletas.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jInternalFrameRegistroBicicletasComponentShown(evt);
            }
        });

        jLabelIdBicicleta.setText("ID");

        jLabelmodeloBicicleta.setText("MODELO");

        jLabelfabricanteBicicleta.setText("FABRICANTE");

        jLabelcategoriaBicicleta.setText("CATEGORIA");

        jLabeltallaBicicleta.setText("TALLA");

        jLabelsuspensionBicicleta.setText("SUSPENSION");

        jLabeltransmisionBicicleta.setText("TRANSMISION");

        jLabelfrenosBicicleta.setText("FRENOS");

        jLabelstockBicicleta.setText("STOCK");

        jLabelvalorBicicleta.setText("VALOR");

        jTextFieldidBicicleta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldidBicicletaKeyTyped(evt);
            }
        });

        jTextFieldmodeloBicicleta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldmodeloBicicletaKeyTyped(evt);
            }
        });

        jTextFieldtallaBicicleta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldtallaBicicletaKeyTyped(evt);
            }
        });

        jTextFieldsuspensionBicicleta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldsuspensionBicicletaKeyTyped(evt);
            }
        });

        jTextFieldtransmisionBicicleta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldtransmisionBicicletaKeyTyped(evt);
            }
        });

        jTextFieldfrenosBicicleta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldfrenosBicicletaKeyTyped(evt);
            }
        });

        jTextFieldstockBicicleta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldstockBicicletaKeyTyped(evt);
            }
        });

        jTextFieldvalorBicicleta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldvalorBicicletaKeyTyped(evt);
            }
        });

        jButtonRegistrarBicicleta.setText("REGISTRAR");
        jButtonRegistrarBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarBicicletaActionPerformed(evt);
            }
        });

        jButtonLimpiarBicicleta.setText("LIMPIAR");
        jButtonLimpiarBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarBicicletaActionPerformed(evt);
            }
        });

        jButtonEliminarBicicleta.setText("ELIMINAR");
        jButtonEliminarBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarBicicletaActionPerformed(evt);
            }
        });

        jButtonModificarBicicleta.setText("MODIFICAR");
        jButtonModificarBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarBicicletaActionPerformed(evt);
            }
        });

        jButtonBuscarBicicleta.setText("BUSCAR");
        jButtonBuscarBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarBicicletaActionPerformed(evt);
            }
        });

        jButtonRedireccionRegistroFabricante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/plus.png"))); // NOI18N
        jButtonRedireccionRegistroFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedireccionRegistroFabricanteActionPerformed(evt);
            }
        });

        jButtonRedireccionRegistroCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/plus.png"))); // NOI18N
        jButtonRedireccionRegistroCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedireccionRegistroCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameRegistroBicicletasLayout = new javax.swing.GroupLayout(jInternalFrameRegistroBicicletas.getContentPane());
        jInternalFrameRegistroBicicletas.getContentPane().setLayout(jInternalFrameRegistroBicicletasLayout);
        jInternalFrameRegistroBicicletasLayout.setHorizontalGroup(
            jInternalFrameRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameRegistroBicicletasLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jInternalFrameRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameRegistroBicicletasLayout.createSequentialGroup()
                        .addGroup(jInternalFrameRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jInternalFrameRegistroBicicletasLayout.createSequentialGroup()
                                .addGroup(jInternalFrameRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelmodeloBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelfabricanteBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelcategoriaBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jInternalFrameRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldmodeloBicicleta)
                                    .addComponent(jComboBoxFabricantes, 0, 90, Short.MAX_VALUE)
                                    .addComponent(jComboBoxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jInternalFrameRegistroBicicletasLayout.createSequentialGroup()
                                .addGroup(jInternalFrameRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabeltallaBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelIdBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jInternalFrameRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldidBicicleta, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(jTextFieldtallaBicicleta))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrameRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonRedireccionRegistroCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRedireccionRegistroFabricante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jInternalFrameRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelsuspensionBicicleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabeltransmisionBicicleta, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jLabelfrenosBicicleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelstockBicicleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelvalorBicicleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrameRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldsuspensionBicicleta, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(jTextFieldtransmisionBicicleta)
                            .addComponent(jTextFieldfrenosBicicleta)
                            .addComponent(jTextFieldstockBicicleta)
                            .addComponent(jTextFieldvalorBicicleta))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jInternalFrameRegistroBicicletasLayout.createSequentialGroup()
                        .addComponent(jButtonRegistrarBicicleta)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpiarBicicleta)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminarBicicleta)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonModificarBicicleta)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscarBicicleta)
                        .addGap(0, 45, Short.MAX_VALUE))))
        );
        jInternalFrameRegistroBicicletasLayout.setVerticalGroup(
            jInternalFrameRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameRegistroBicicletasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdBicicleta)
                    .addComponent(jLabelsuspensionBicicleta)
                    .addComponent(jTextFieldidBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldsuspensionBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelmodeloBicicleta)
                    .addComponent(jLabeltransmisionBicicleta)
                    .addComponent(jTextFieldmodeloBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldtransmisionBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jInternalFrameRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelfabricanteBicicleta)
                    .addComponent(jLabelfrenosBicicleta)
                    .addComponent(jTextFieldfrenosBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFabricantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRedireccionRegistroFabricante))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxCategoria)
                    .addGroup(jInternalFrameRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelcategoriaBicicleta)
                        .addComponent(jLabelstockBicicleta)
                        .addComponent(jTextFieldstockBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonRedireccionRegistroCategoria)))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeltallaBicicleta)
                    .addComponent(jLabelvalorBicicleta)
                    .addComponent(jTextFieldtallaBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldvalorBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jInternalFrameRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrarBicicleta)
                    .addComponent(jButtonLimpiarBicicleta)
                    .addComponent(jButtonEliminarBicicleta)
                    .addComponent(jButtonModificarBicicleta)
                    .addComponent(jButtonBuscarBicicleta))
                .addGap(44, 44, 44))
        );

        jInternalFrameAcercaDe.setClosable(true);
        jInternalFrameAcercaDe.setTitle("Acerca De");
        jInternalFrameAcercaDe.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/about.png"))); // NOI18N
        jInternalFrameAcercaDe.setVisible(true);

        jLabel1.setText("Proyecto Desarrollo de Software de escritorio");

        jLabel2.setText("Seccion : 003V");

        jLabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duoc/vistas/foto software final.jpg"))); // NOI18N

        javax.swing.GroupLayout jInternalFrameAcercaDeLayout = new javax.swing.GroupLayout(jInternalFrameAcercaDe.getContentPane());
        jInternalFrameAcercaDe.getContentPane().setLayout(jInternalFrameAcercaDeLayout);
        jInternalFrameAcercaDeLayout.setHorizontalGroup(
            jInternalFrameAcercaDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameAcercaDeLayout.createSequentialGroup()
                .addGroup(jInternalFrameAcercaDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameAcercaDeLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jInternalFrameAcercaDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(jInternalFrameAcercaDeLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jInternalFrameAcercaDeLayout.setVerticalGroup(
            jInternalFrameAcercaDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameAcercaDeLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jInternalListadoRegistroBicicletas.setClosable(true);
        jInternalListadoRegistroBicicletas.setTitle("Listado de Bicicletas");
        jInternalListadoRegistroBicicletas.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/checklist.png"))); // NOI18N
        jInternalListadoRegistroBicicletas.setVisible(true);
        jInternalListadoRegistroBicicletas.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                jInternalListadoRegistroBicicletasInternalFrameOpened(evt);
            }
        });
        jInternalListadoRegistroBicicletas.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jInternalListadoRegistroBicicletasComponentShown(evt);
            }
        });

        jTableListaRegistroBicicletas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MODELO", "FABRICANTE", "CATEGORIA", "TALLA", "SUSPENSION", "TRANSMISION", "FRENOS", "STOCK", "VALOR"
            }
        ));
        jScrollPane3.setViewportView(jTableListaRegistroBicicletas);

        jPanelfiltrosBicicletas.setBorder(javax.swing.BorderFactory.createTitledBorder("Escriba la busqueda"));

        buttonGroupOpcionesFiltro.add(jRadioButtonfiltroModelo);
        jRadioButtonfiltroModelo.setText("Modelo");

        buttonGroupOpcionesFiltro.add(jRadioButtonfiltroFabricante);
        jRadioButtonfiltroFabricante.setText("fabricante");

        buttonGroupOpcionesFiltro.add(jRadioButtonfiltroCategoria);
        jRadioButtonfiltroCategoria.setText("Categoria");

        buttonGroupOpcionesFiltro.add(jRadioButtonfiltroId);
        jRadioButtonfiltroId.setSelected(true);
        jRadioButtonfiltroId.setText("Id");

        jButtonbuscarBicicleta.setText("BUSCAR");
        jButtonbuscarBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbuscarBicicletaActionPerformed(evt);
            }
        });

        jButtonRestablecerBusquedaBicicletas.setText("RESTABLECER LISTADO");
        jButtonRestablecerBusquedaBicicletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestablecerBusquedaBicicletasActionPerformed(evt);
            }
        });

        jButtonCargarDatosBicicleta.setText("CARGAR DATOS BICICLETA");
        jButtonCargarDatosBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarDatosBicicletaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelfiltrosBicicletasLayout = new javax.swing.GroupLayout(jPanelfiltrosBicicletas);
        jPanelfiltrosBicicletas.setLayout(jPanelfiltrosBicicletasLayout);
        jPanelfiltrosBicicletasLayout.setHorizontalGroup(
            jPanelfiltrosBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelfiltrosBicicletasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelfiltrosBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelfiltrosBicicletasLayout.createSequentialGroup()
                        .addComponent(jTextFieldtextoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonfiltroModelo)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonfiltroFabricante)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonfiltroCategoria)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonfiltroId))
                    .addGroup(jPanelfiltrosBicicletasLayout.createSequentialGroup()
                        .addComponent(jButtonbuscarBicicleta)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRestablecerBusquedaBicicletas)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCargarDatosBicicleta)))
                .addContainerGap(422, Short.MAX_VALUE))
        );
        jPanelfiltrosBicicletasLayout.setVerticalGroup(
            jPanelfiltrosBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelfiltrosBicicletasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelfiltrosBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldtextoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonfiltroModelo)
                    .addComponent(jRadioButtonfiltroFabricante)
                    .addComponent(jRadioButtonfiltroCategoria)
                    .addComponent(jRadioButtonfiltroId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanelfiltrosBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRestablecerBusquedaBicicletas)
                    .addComponent(jButtonCargarDatosBicicleta)
                    .addComponent(jButtonbuscarBicicleta))
                .addContainerGap())
        );

        javax.swing.GroupLayout jInternalListadoRegistroBicicletasLayout = new javax.swing.GroupLayout(jInternalListadoRegistroBicicletas.getContentPane());
        jInternalListadoRegistroBicicletas.getContentPane().setLayout(jInternalListadoRegistroBicicletasLayout);
        jInternalListadoRegistroBicicletasLayout.setHorizontalGroup(
            jInternalListadoRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalListadoRegistroBicicletasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalListadoRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                    .addComponent(jPanelfiltrosBicicletas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jInternalListadoRegistroBicicletasLayout.setVerticalGroup(
            jInternalListadoRegistroBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalListadoRegistroBicicletasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelfiltrosBicicletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jMenuArchivo.setText("archivo");

        jMenuItemIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/log-in.png"))); // NOI18N
        jMenuItemIniciarSesion.setText("Iniciar Sesion");
        jMenuItemIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIniciarSesionActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemIniciarSesion);

        jMenuItemCerrarSesion.setText("Cerrar Sesion");
        jMenuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCerrarSesionActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemCerrarSesion);

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBar1.add(jMenuArchivo);

        jMenuRegistrar.setText("registrar");
        jMenuRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegistrarActionPerformed(evt);
            }
        });

        jMenuItemRegistroCategoria.setText("Categorias");
        jMenuItemRegistroCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistroCategoriaActionPerformed(evt);
            }
        });
        jMenuRegistrar.add(jMenuItemRegistroCategoria);

        jMenuItemRegistroFabricantes.setText("Fabricantes");
        jMenuItemRegistroFabricantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistroFabricantesActionPerformed(evt);
            }
        });
        jMenuRegistrar.add(jMenuItemRegistroFabricantes);

        jMenuItemRegistroBicicletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/bike.png"))); // NOI18N
        jMenuItemRegistroBicicletas.setText("Bicicletas");
        jMenuItemRegistroBicicletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistroBicicletasActionPerformed(evt);
            }
        });
        jMenuRegistrar.add(jMenuItemRegistroBicicletas);

        jMenuBar1.add(jMenuRegistrar);

        jMenu3.setText("Informes");

        jMenuItemListadoBicicletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/checklist.png"))); // NOI18N
        jMenuItemListadoBicicletas.setText("Listado Bicicletas");
        jMenuItemListadoBicicletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListadoBicicletasActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemListadoBicicletas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ayuda");

        jMenuItemAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/about.png"))); // NOI18N
        jMenuItemAcercaDe.setText("Acerca De");
        jMenuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAcercaDeActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemAcercaDe);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jInternalFrameControlAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInternalRegistroFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jInternalFrameRegistroBicicletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jInternalFrameRegistroCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jInternalListadoRegistroBicicletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInternalFrameAcercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(775, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jInternalFrameRegistroBicicletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jInternalFrameRegistroCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jInternalListadoRegistroBicicletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jInternalFrameAcercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jInternalFrameControlAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jInternalRegistroFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        try {
            jInternalFrameControlAcceso.setIcon(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimpiarRegistroFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarRegistroFabricanteActionPerformed
        LimpiarFormularioRegistroFabricante();
        
    }//GEN-LAST:event_jButtonLimpiarRegistroFabricanteActionPerformed

    private void jMenuItemRegistroFabricantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistroFabricantesActionPerformed
        this.jInternalRegistroFabricante.setVisible(true);
    }//GEN-LAST:event_jMenuItemRegistroFabricantesActionPerformed

    private void jMenuItemRegistroBicicletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistroBicicletasActionPerformed
        this.jInternalFrameRegistroBicicletas.setVisible(true);
    }//GEN-LAST:event_jMenuItemRegistroBicicletasActionPerformed

    private void jMenuItemRegistroCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistroCategoriaActionPerformed
        this.jInternalFrameRegistroCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItemRegistroCategoriaActionPerformed

    private void jButtonLimpiarRegistroCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarRegistroCategoriaActionPerformed
        LimpiarFormularioRegistroCategoria();
        
    }//GEN-LAST:event_jButtonLimpiarRegistroCategoriaActionPerformed

    private void jInternalFrameRegistroCategoriaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jInternalFrameRegistroCategoriaComponentShown
        LimpiarFormularioRegistroCategoria();
    }//GEN-LAST:event_jInternalFrameRegistroCategoriaComponentShown

    private void jInternalRegistroFabricanteComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jInternalRegistroFabricanteComponentShown
        LimpiarFormularioRegistroFabricante();
    }//GEN-LAST:event_jInternalRegistroFabricanteComponentShown

    private void jTextFieldIdCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdCategoriaKeyTyped
        char caracter = evt.getKeyChar();
        if(this.jTextFieldIdCategoria.getText().length() == 11 || ! Character.isDigit(caracter))
        {
            evt.consume();
        }
        
    }//GEN-LAST:event_jTextFieldIdCategoriaKeyTyped

    private void jTextFieldIdFabricanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdFabricanteKeyTyped
        char caracter = evt.getKeyChar();
        if(this.jTextFieldIdFabricante.getText().length() == 11 || ! Character.isDigit(caracter))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldIdFabricanteKeyTyped

    private void jTextFieldDescripcionCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionCategoriaKeyTyped
        char caracter = evt.getKeyChar();
        if(this.jTextFieldDescripcionCategoria.getText().length() == 50 || ! (Character.isLetter(caracter) || caracter == KeyEvent.VK_SPACE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldDescripcionCategoriaKeyTyped

    private void jTextFieldNombreFabricanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreFabricanteKeyTyped
        char caracter = evt.getKeyChar();
        if(this.jTextFieldNombreFabricante.getText().length() == 100 || ! (Character.isLetter(caracter)|| Character.isDigit(caracter) || caracter == KeyEvent.VK_SPACE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNombreFabricanteKeyTyped

    private void jTextFieldIdCategoriaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldIdCategoriaFocusGained
        this.jTextFieldIdCategoria.selectAll();
    }//GEN-LAST:event_jTextFieldIdCategoriaFocusGained

    private void jTextFieldDescripcionCategoriaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionCategoriaFocusGained
        this.jTextFieldDescripcionCategoria.selectAll();
    }//GEN-LAST:event_jTextFieldDescripcionCategoriaFocusGained

    private void jTextFieldIdFabricanteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldIdFabricanteFocusGained
        this.jTextFieldIdFabricante.selectAll();
    }//GEN-LAST:event_jTextFieldIdFabricanteFocusGained

    private void jTextFieldNombreFabricanteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNombreFabricanteFocusGained
        this.jTextFieldNombreFabricante.selectAll();
    }//GEN-LAST:event_jTextFieldNombreFabricanteFocusGained

    private void jButtonRegistrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarCategoriaActionPerformed
        registrarCategoria();
    }//GEN-LAST:event_jButtonRegistrarCategoriaActionPerformed

    private void jButtonRegistrarFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarFabricanteActionPerformed
        registrarFabricante();
    }//GEN-LAST:event_jButtonRegistrarFabricanteActionPerformed

    private void jButtonEliminarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarCategoriaActionPerformed
        eliminarCategoria();
    }//GEN-LAST:event_jButtonEliminarCategoriaActionPerformed

    private void jButtonEliminarFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarFabricanteActionPerformed
        eliminarFabricante();
    }//GEN-LAST:event_jButtonEliminarFabricanteActionPerformed

    private void jTableCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCategoriasMouseClicked
        buscarCategoria();
    }//GEN-LAST:event_jTableCategoriasMouseClicked

    private void jTableFabricantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFabricantesMouseClicked
        buscarFabricante();
    }//GEN-LAST:event_jTableFabricantesMouseClicked

    private void jButtonModificarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarCategoriaActionPerformed
        modificarCategoria();
    }//GEN-LAST:event_jButtonModificarCategoriaActionPerformed

    private void jButtonModificarFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarFabricanteActionPerformed
        modificarFabricante();
    }//GEN-LAST:event_jButtonModificarFabricanteActionPerformed

    private void jMenuRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegistrarActionPerformed
        LimpiarFormularioRegistroBicicleta();
    }//GEN-LAST:event_jMenuRegistrarActionPerformed

    private void jInternalFrameRegistroBicicletasComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jInternalFrameRegistroBicicletasComponentShown
        LimpiarFormularioRegistroBicicleta();
    }//GEN-LAST:event_jInternalFrameRegistroBicicletasComponentShown

    private void jButtonRedireccionRegistroFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedireccionRegistroFabricanteActionPerformed
        this.jInternalRegistroFabricante.setVisible(true);
    }//GEN-LAST:event_jButtonRedireccionRegistroFabricanteActionPerformed

    private void jButtonRedireccionRegistroCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedireccionRegistroCategoriaActionPerformed
        this.jInternalFrameRegistroCategoria.setVisible(true);
    }//GEN-LAST:event_jButtonRedireccionRegistroCategoriaActionPerformed

    private void jInternalListadoRegistroBicicletasComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jInternalListadoRegistroBicicletasComponentShown
        cargarListadoBicicletas();
        habilitarButtonCargarBicicleta();
    }//GEN-LAST:event_jInternalListadoRegistroBicicletasComponentShown

    private void jButtonRegistrarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarBicicletaActionPerformed
        
        registrarBicicleta();
    }//GEN-LAST:event_jButtonRegistrarBicicletaActionPerformed

    private void jMenuItemListadoBicicletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListadoBicicletasActionPerformed
        this.jInternalListadoRegistroBicicletas.setVisible(true);
    }//GEN-LAST:event_jMenuItemListadoBicicletasActionPerformed

    private void jTextFieldidBicicletaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldidBicicletaKeyTyped
        char caracter = evt.getKeyChar();
        if(this.jTextFieldidBicicleta.getText().length() == 11 || ! Character.isDigit(caracter))
        {
            evt.consume();
        }
                                                   
        
     
    }//GEN-LAST:event_jTextFieldidBicicletaKeyTyped

    private void jButtonbuscarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbuscarBicicletaActionPerformed
        cargarDatosFiltrados();
    }//GEN-LAST:event_jButtonbuscarBicicletaActionPerformed

    private void jButtonRestablecerBusquedaBicicletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestablecerBusquedaBicicletasActionPerformed
        cargarListadoBicicletas();
    }//GEN-LAST:event_jButtonRestablecerBusquedaBicicletasActionPerformed

    private void jButtonCargarDatosBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarDatosBicicletaActionPerformed
        
        cargarDatosBicicleta();
        
    }//GEN-LAST:event_jButtonCargarDatosBicicletaActionPerformed

    private void jInternalFrameRegistroBicicletasInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameRegistroBicicletasInternalFrameOpened
        LimpiarFormularioRegistroBicicleta();
    }//GEN-LAST:event_jInternalFrameRegistroBicicletasInternalFrameOpened

    private void jInternalFrameRegistroBicicletasInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameRegistroBicicletasInternalFrameClosing
        LimpiarFormularioRegistroBicicleta();
    }//GEN-LAST:event_jInternalFrameRegistroBicicletasInternalFrameClosing

    private void jButtonBuscarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarBicicletaActionPerformed
        buscarBicicleta();
    }//GEN-LAST:event_jButtonBuscarBicicletaActionPerformed

    private void jButtonEliminarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarBicicletaActionPerformed
        eliminarBicicleta();
    }//GEN-LAST:event_jButtonEliminarBicicletaActionPerformed

    private void jButtonModificarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarBicicletaActionPerformed
       modificarBicicleta();
    }//GEN-LAST:event_jButtonModificarBicicletaActionPerformed

    private void jButtonLimpiarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarBicicletaActionPerformed
        LimpiarFormularioRegistroBicicleta();
    }//GEN-LAST:event_jButtonLimpiarBicicletaActionPerformed

    private void jMenuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAcercaDeActionPerformed
        this.jInternalFrameAcercaDe.setVisible(true);
    }//GEN-LAST:event_jMenuItemAcercaDeActionPerformed

    private void jMenuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCerrarSesionActionPerformed
        OcultarVentanasInicio();
    }//GEN-LAST:event_jMenuItemCerrarSesionActionPerformed

    private void jMenuItemIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIniciarSesionActionPerformed
        this.jInternalFrameControlAcceso.setVisible(true);
    }//GEN-LAST:event_jMenuItemIniciarSesionActionPerformed

    private void jButtonLimpiarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarLoginActionPerformed
        LimpiarFormularioLogin();
    }//GEN-LAST:event_jButtonLimpiarLoginActionPerformed

    private void jPasswordFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPasswordActionPerformed

    private void jInternalFrameControlAccesoInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameControlAccesoInternalFrameOpened
        LimpiarFormularioLogin();
    }//GEN-LAST:event_jInternalFrameControlAccesoInternalFrameOpened

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        validarAcceso();
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jTextFieldUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsernameFocusGained
        this.jTextFieldUsername.selectAll();
    }//GEN-LAST:event_jTextFieldUsernameFocusGained

    private void jPasswordFieldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordFocusGained
        this.jPasswordFieldPassword.selectAll();
    }//GEN-LAST:event_jPasswordFieldPasswordFocusGained

    private void jInternalFrameControlAccesoComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jInternalFrameControlAccesoComponentHidden
        LimpiarFormularioLogin();
    }//GEN-LAST:event_jInternalFrameControlAccesoComponentHidden

    private void jInternalFrameControlAccesoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jInternalFrameControlAccesoComponentShown
        LimpiarFormularioLogin();
    }//GEN-LAST:event_jInternalFrameControlAccesoComponentShown

    private void jPasswordFieldPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            validarAcceso();
        }
        
    }//GEN-LAST:event_jPasswordFieldPasswordKeyPressed

    private void jButtonLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonLoginKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            validarAcceso();
        }
    }//GEN-LAST:event_jButtonLoginKeyPressed

    private void jInternalListadoRegistroBicicletasInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalListadoRegistroBicicletasInternalFrameOpened
        habilitarButtonCargarBicicleta();
    }//GEN-LAST:event_jInternalListadoRegistroBicicletasInternalFrameOpened

    private void jTextFieldstockBicicletaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldstockBicicletaKeyTyped
         char caracter = evt.getKeyChar();
        if(this.jTextFieldstockBicicleta.getText().length() == 11 || ! Character.isDigit(caracter))
        {
            evt.consume();
        }
           
    }//GEN-LAST:event_jTextFieldstockBicicletaKeyTyped

    private void jTextFieldvalorBicicletaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldvalorBicicletaKeyTyped
        char caracter = evt.getKeyChar();
        if(this.jTextFieldvalorBicicleta.getText().length() == 11 || ! Character.isDigit(caracter))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldvalorBicicletaKeyTyped

    private void jTextFieldmodeloBicicletaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldmodeloBicicletaKeyTyped
        
        if(this.jTextFieldmodeloBicicleta.getText().length() == 100 )
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldmodeloBicicletaKeyTyped

    private void jTextFieldtallaBicicletaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldtallaBicicletaKeyTyped
        
        if(this.jTextFieldtallaBicicleta.getText().length() == 5 )
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldtallaBicicletaKeyTyped

    private void jTextFieldsuspensionBicicletaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldsuspensionBicicletaKeyTyped
        if(this.jTextFieldsuspensionBicicleta.getText().length() == 30 )
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldsuspensionBicicletaKeyTyped

    private void jTextFieldtransmisionBicicletaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldtransmisionBicicletaKeyTyped
        if(this.jTextFieldtransmisionBicicleta.getText().length() == 30 )
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldtransmisionBicicletaKeyTyped

    private void jTextFieldfrenosBicicletaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldfrenosBicicletaKeyTyped
        
        if(this.jTextFieldfrenosBicicleta.getText().length() == 30 )
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldfrenosBicicletaKeyTyped

    
/// ************************************************************ CODIGO PARA VALIDACION DE ACCESO AL SISTEMA ***************************************************************
    
    
    private void validarAcceso(){
        String privilegios[] = {"administrador","usuario"};
        String username = this.jTextFieldUsername.getText();
        String password = String.valueOf(this.jPasswordFieldPassword.getPassword());
        Usuario u = uc.read(username);
        if(u != null)
        {
            if(u.getUsername().equals(username) && u.getPassword().equals(password))
            {
                int acceso = u.getNivel_privilegio();
                JOptionPane.showMessageDialog(this, "ingreso aceptado \n  tipo de privilegios :  " + privilegios[acceso-1], "mensajes", JOptionPane.INFORMATION_MESSAGE);
                privilegiosSistema(acceso);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "acceso denegado", "mensajes", JOptionPane.ERROR_MESSAGE);
                this.jTextFieldUsername.requestFocus();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "no se encontraron datos", "mensajes", JOptionPane.ERROR_MESSAGE);
            this.jTextFieldUsername.requestFocus();
        }
    }
       
//************************************************** **************  CODIGO PARA HABILITAR BOTON CARGAR BICICLETA *************************************************************
    
    
    private void habilitarButtonCargarBicicleta(){
            if(nivel_acceso == 1)
            {
                this.jButtonCargarDatosBicicleta.setEnabled(true);
            }
            else
            {
                this.jButtonCargarDatosBicicleta.setEnabled(false);
            }
        }
        
        

//************************************************************ CODIGO PARA OTORGAR PRIVILIEGIOS DE SISTEMA ********************************************************************
    
   private void privilegiosSistema(int nivel_acceso){
        if(nivel_acceso == 1 )
        {
            this.jInternalFrameControlAcceso.setVisible(false);
            this.jInternalFrameRegistroCategoria.setVisible(false);
            this.jInternalRegistroFabricante.setVisible(false);
            this.jInternalFrameRegistroBicicletas.setVisible(false);
            this.jInternalListadoRegistroBicicletas.setVisible(false);
            this.jInternalFrameAcercaDe.setVisible(false);
            this.jMenuItemIniciarSesion.setEnabled(true);
            this.jMenuItemCerrarSesion.setEnabled(true);
            this.jMenuItemRegistroCategoria.setEnabled(true);
            this.jMenuItemRegistroFabricantes.setEnabled(true);
            this.jMenuItemRegistroBicicletas.setEnabled(true);
            this.jMenuItemListadoBicicletas.setEnabled(true);
            this.jMenuItemAcercaDe.setEnabled(true);
            this.nivel_acceso = 1;
        }
        else
        {
            if(nivel_acceso == 2)
            {
                this.jInternalFrameControlAcceso.setVisible(false);
                this.jInternalFrameRegistroCategoria.setVisible(false);
                this.jInternalRegistroFabricante.setVisible(false);
                this.jInternalFrameRegistroBicicletas.setVisible(false);
                this.jInternalListadoRegistroBicicletas.setVisible(false);
                this.jInternalFrameAcercaDe.setVisible(false);
                this.jMenuItemIniciarSesion.setEnabled(false);
                this.jMenuItemCerrarSesion.setEnabled(true);
                this.jMenuItemRegistroCategoria.setEnabled(false);
                this.jMenuItemRegistroFabricantes.setEnabled(false);
                this.jMenuItemRegistroBicicletas.setEnabled(false);
                this.jMenuItemListadoBicicletas.setEnabled(true);
                this.jMenuItemAcercaDe.setEnabled(true);
                this.nivel_acceso = 2;
            }
        }
  
    }    
// *********************************************************************  CODIGO PARA OCULTAR VENTANAS ***********************************************************************   
    
    private void OcultarVentanasInicio(){
        nivel_acceso = 0;
        this.jInternalFrameControlAcceso.setVisible(true);
        this.jInternalFrameRegistroCategoria.setVisible(false);
        this.jInternalRegistroFabricante.setVisible(false);
        this.jInternalFrameRegistroBicicletas.setVisible(false);
        this.jInternalListadoRegistroBicicletas.setVisible(false);
        this.jInternalFrameAcercaDe.setVisible(false);
        this.jMenuItemIniciarSesion.setEnabled(true);
        this.jMenuItemCerrarSesion.setEnabled(true);
        this.jMenuItemRegistroCategoria.setEnabled(false);
        this.jMenuItemRegistroFabricantes.setEnabled(false);
        this.jMenuItemRegistroBicicletas.setEnabled(false);
        this.jMenuItemListadoBicicletas.setEnabled(false);
        this.jMenuItemAcercaDe.setEnabled(true);
        
    }

//  ******************************************************************** CODIGOS PARA LIMPIAR FORMULARIOS  *******************************************************************

    /// LIMPIAR FORMULARIO DE LOGIN ----------------------------------
    
    private void LimpiarFormularioLogin(){
        this.jTextFieldUsername.setText("");
        this.jPasswordFieldPassword.setText("");
        this.jTextFieldUsername.requestFocus();
        
    }
    //---    LIMPIAR FORMULARIO PARA REGISTRAR CATEGORIAS ------------
    private void LimpiarFormularioRegistroCategoria(){
        this.jTextFieldIdCategoria.setText("");
        this.jTextFieldDescripcionCategoria.setText("");
        this.jTextFieldIdCategoria.requestFocus();
        cargarListadoTablaCategorias();
        
    }
    
    //  ---  LIMPIAR FORMULARIO PARA REGISTRAR  FABRICANTES --------------
    private void LimpiarFormularioRegistroFabricante(){
        this.jTextFieldIdFabricante.setText("");
        this.jTextFieldNombreFabricante.setText("");
        this.jTextFieldIdFabricante.requestFocus();
        cargarListadoTablaFabricantes();
    }
    
    
    // ---- LIMPIAR FORMULARIO PARA REGISTRAR  BICICLETAS -----------------
    private void LimpiarFormularioRegistroBicicleta(){
        this.jTextFieldidBicicleta.setText("");
        this.jTextFieldfrenosBicicleta.setText("");
        this.jTextFieldmodeloBicicleta.setText("");
        cargarListadoFabricantes();
        this.jComboBoxFabricantes.setSelectedIndex(-1);
        cargarListadoCategorias();
        this.jComboBoxCategoria.setSelectedIndex(-1);
        this.jTextFieldstockBicicleta.setText("");
        this.jTextFieldsuspensionBicicleta.setText("");
        this.jTextFieldtallaBicicleta.setText("");
        this.jTextFieldtransmisionBicicleta.setText("");
        this.jTextFieldvalorBicicleta.setText("");
        this.jTextFieldidBicicleta.requestFocus();
    }
// *************************************************************** CODIGOS PARA GARGAR LISTADOS *************************************************************
    
    //  --------  CARGAR LISTADO DE CATEGORIAS---------------
    private void cargarListadoCategorias(){
        try
        {
            this.jComboBoxCategoria.removeAllItems();
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            ArrayList<Categoria> categorias = cc.readAll();
            for(Categoria c: categorias)
            {
                modelo.addElement(c);
            }
            this.jComboBoxCategoria.setModel(modelo);
                    
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, " problemas de conexion " +  ex.getMessage() , "mensajes", JOptionPane.ERROR_MESSAGE);
        }
                
    }   
    
    // -----------  CARGAR  LISTADO DE FABRICANTES ------------------
    private void cargarListadoFabricantes(){
        try
        {
            this.jComboBoxFabricantes.removeAllItems();
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            ArrayList<Fabricante> fabricantes = fc.readAll();
            for(Fabricante f: fabricantes)
            {
                modelo.addElement(f);
            }
            this.jComboBoxFabricantes.setModel(modelo);
                    
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, " problemas de conexion " +  ex.getMessage() , "mensajes", JOptionPane.ERROR_MESSAGE);
        }
                
    }
    
    // ------------ CARGAR LISTADO DE BICICLETCAS --------------------
    private void cargarListadoBicicletas(){
        try
        {
            DecimalFormat formato = new DecimalFormat("$ #,###");
            ArrayList<Bicicleta> bicicletas = bc.readAll();
            ArrayList<Fabricante> fabricantes = fc.readAll();
            ArrayList<Categoria> categorias = cc.readAll();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("id");
            modelo.addColumn("modelo");
            modelo.addColumn("fabricante");
            modelo.addColumn("categoria");
            modelo.addColumn("talla");
            modelo.addColumn("suspension");
            modelo.addColumn("transmision");
            modelo.addColumn("frenos");
            modelo.addColumn("stock");
            modelo.addColumn("valor");
            for(Bicicleta b: bicicletas)
            {
                Object fila[] = new Object[10];
                fila[0] = b.getId();
                fila[1] = b.getModelo();
                for(Fabricante f: fabricantes)
                {
                    if(f.getId() == b.getFabricante())
                    {
                        fila[2] = f.getNombre();
                    }
                }
                for(Categoria c: categorias)
                {
                    if(c.getId() == b.getCategoria())
                    {
                        fila[3] = c.getDescripcion();
                    }
                }
                
                fila[4] = b.getTalla();
                fila[5] = b.getSuspension();
                fila[6] = b.getTrasmision();
                fila[7] = b.getFrenos();
                fila[8] = b.getStock();
                fila[9] = formato.format(b.getValor());
                modelo.addRow(fila);
                        
            }
            this.jTableListaRegistroBicicletas.setModel(modelo);
            
            alinearValorBicicletas(9);
                    
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, " problemas de conexion " +  ex.getMessage() , "mensajes", JOptionPane.ERROR_MESSAGE);
        }
                
    }
    
    
    // ---------  CARGAR DATOS FILTRADOS BICICLETAS  -----------
    
    private void cargarDatosFiltrados(){
        try
        {
            String Buscar = this.jTextFieldtextoBusqueda.getText();
            DecimalFormat formato = new DecimalFormat("$ #,###");
            ArrayList<Bicicleta> bicicletas = bc.readAll();
            ArrayList<Fabricante> fabricantes = fc.readAll();
            ArrayList<Categoria> categorias = cc.readAll();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("id");
            modelo.addColumn("modelo");
            modelo.addColumn("fabricante");
            modelo.addColumn("categoria");
            modelo.addColumn("talla");
            modelo.addColumn("suspension");
            modelo.addColumn("transmision");
            modelo.addColumn("frenos");
            modelo.addColumn("stock");
            modelo.addColumn("valor");
            for(Bicicleta b: bicicletas)
            {
                Object fila[] = new Object[10];
                fila[0] = b.getId();
                fila[1] = b.getModelo();
                for(Fabricante f: fabricantes)
                {
                    if(f.getId() == b.getFabricante())
                    {
                        fila[2] = f.getNombre();
                    }
                }
                for(Categoria c: categorias)
                {
                    if(c.getId() == b.getCategoria())
                    {
                        fila[3] = c.getDescripcion();
                    }
                }
                
                fila[4] = b.getTalla();
                fila[5] = b.getSuspension();
                fila[6] = b.getTrasmision();
                fila[7] = b.getFrenos();
                fila[8] = b.getStock();
                fila[9] = formato.format(b.getValor());
                if(this.jRadioButtonfiltroModelo.isSelected())
                {
                    if(b.getModelo().toLowerCase().contains(Buscar.toLowerCase()))
                    {
                        modelo.addRow(fila);
                    }
                }
                else if(this.jRadioButtonfiltroId.isSelected())
                {
                    String id = String.valueOf(b.getId());
                    if(id.toLowerCase().contains(Buscar.toLowerCase()))
                    {
                        modelo.addRow(fila);
                    }
                }
                else if(this.jRadioButtonfiltroCategoria.isSelected())
                {
                    String nombreCategoria = "";
                    for(Categoria c: categorias)
                    {
                        if(c.getId() == b.getCategoria())
                        {
                            nombreCategoria = c.getDescripcion();
                        }
                    }
                    if(nombreCategoria.toLowerCase().contains(Buscar.toLowerCase()))
                    {
                        modelo.addRow(fila);
                    }
                }
                
                else if(this.jRadioButtonfiltroFabricante.isSelected())
                {
                    String nombreFabricante = "";
                    for(Fabricante f: fabricantes)
                    {
                        if(f.getId() == b.getFabricante())
                        {
                            nombreFabricante = f.getNombre();
                        }
                    }
                    if(nombreFabricante.toLowerCase().contains(Buscar.toLowerCase()))
                    {
                        modelo.addRow(fila);
                    }
                }
                
                
                        
            }
            this.jTableListaRegistroBicicletas.setModel(modelo);
            
            alinearValorBicicletas(9);
                    
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, " problemas de conexion " +  ex.getMessage() , "mensajes", JOptionPane.ERROR_MESSAGE);
        }
                
    }
    
    
    
// ********************************************** CODIGOS PARA FORMULARIOS DE REGISTRO *************************************************
    
    // -------  REGISTRO DE CATEGORIAS --------------------------------------
    
    private void registrarCategoria(){
        try
        {
            int id = Integer.parseInt(this.jTextFieldIdCategoria.getText());
            String descripcion = this.jTextFieldDescripcionCategoria.getText();
            Categoria c = new Categoria(id,descripcion);
            if(cc.create(c))
            {
                JOptionPane.showMessageDialog(this, "categoria registrada" , "mensajes", JOptionPane.INFORMATION_MESSAGE);
                LimpiarFormularioRegistroCategoria();
                if(this.jInternalFrameRegistroCategoria.isVisible())
                {
                    cargarListadoCategorias();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "no se pudo registrar la categoria" , "mensajes", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "debes ingresar un id valido", "mensajes", JOptionPane.ERROR_MESSAGE);
        } 
        catch (CustomException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage() , "mensajes", JOptionPane.ERROR_MESSAGE);
        } 
        
        
    }
    
    // --------------- REGISTRO DE FABRICANTES -----------------------------------------------------------------------
    
    private void registrarFabricante(){
        try
        {
            int id = Integer.parseInt(this.jTextFieldIdFabricante.getText());
            String nombre = this.jTextFieldNombreFabricante.getText();
            Fabricante f = new Fabricante(id,nombre);
            if(fc.create(f))
            {
                JOptionPane.showMessageDialog(this, "fabricante registrado" , "mensajes", JOptionPane.INFORMATION_MESSAGE);
                LimpiarFormularioRegistroFabricante();
                if(this.jInternalRegistroFabricante.isVisible())
                {
                    cargarListadoFabricantes();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "no se pudo registrar el fabricante" , "mensajes", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "debes ingresar un id valido", "mensajes", JOptionPane.ERROR_MESSAGE);
        } 
        catch (CustomException ex) 
        {
            JOptionPane.showMessageDialog(this, ex.getMessage() , "mensajes", JOptionPane.ERROR_MESSAGE);
        }
                
                    
                
    }
    
    // ------------------  REGISTRAR BICICLETAS ---------------------------------------------------------------------------
    
    private void registrarBicicleta(){
        try
        {
            
            int id = Integer.parseInt(this.jTextFieldidBicicleta.getText());
            String modelo = this.jTextFieldmodeloBicicleta.getText();
            Fabricante f = (Fabricante)this.jComboBoxFabricantes.getSelectedItem();
            int id_fabricante = f.getId();
            Categoria c = (Categoria)this.jComboBoxCategoria.getSelectedItem();
            int id_categoria = c.getId();
            String talla = this.jTextFieldtallaBicicleta.getText();
            String suspension = this.jTextFieldsuspensionBicicleta.getText();
            String transmision = this.jTextFieldtransmisionBicicleta.getText();
            String frenos = this.jTextFieldfrenosBicicleta.getText();
            int stock = Integer.parseInt(this.jTextFieldstockBicicleta.getText());
            int valor = Integer.parseInt(this.jTextFieldvalorBicicleta.getText());
            Bicicleta b = new Bicicleta(id,modelo,id_fabricante,id_categoria,talla,suspension,transmision,frenos,stock,valor);
            if(bc.create(b))
            {
                JOptionPane.showMessageDialog(this, "bicicleta registrada" , "mensajes", JOptionPane.INFORMATION_MESSAGE);
                LimpiarFormularioRegistroBicicleta();
                if(this.jInternalListadoRegistroBicicletas.isVisible())
                {
                    cargarListadoBicicletas();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "no se pudo registrar la bicicleta" , "mensajes", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "debes ingresar los datos correctos", "mensajes", JOptionPane.ERROR_MESSAGE);
        } 
        catch (CustomException ex) 
        {
            JOptionPane.showMessageDialog(this, ex.getMessage() , "mensajes", JOptionPane.ERROR_MESSAGE);
        }
                
                    
                
    }
    
    
//  ***************************************************  CODIGOS PARA CARGAR LISTADO EN LAS  TABLAS *********************************************************  
    
    
    
    ///-------  CARGAR TABLA DE CATEGORIAS -----------------------------
    
    
    private void cargarListadoTablaCategorias(){
        try
        {
            ArrayList<Categoria> categorias = cc.readAll();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("id");
            modelo.addColumn("descripcion");
            for(Categoria c: categorias)
            {
                Object fila[] = new Object[2];
                fila[0] = c.getId();
                fila[1] = c.getDescripcion();
                modelo.addRow(fila);
            }
            this.jTableCategorias.setModel(modelo);
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(this, " problemas de conexion " +  ex.getMessage() , "mensajes", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // ------------  CARGAR TABLE DE FABRICANTES ---------------------------
    
    
    private void cargarListadoTablaFabricantes(){
         try
        {
            ArrayList<Fabricante> fabricantes = fc.readAll();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Id");
            modelo.addColumn("Nombre");
            for(Fabricante f: fabricantes)
            {
                Object fila[] = new Object[2];
                fila[0] = f.getId();
                fila[1] = f.getNombre();
                modelo.addRow(fila);
            }
            this.jTableFabricantes.setModel(modelo);
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(this, " problemas de conexion " +  ex.getMessage() , "mensajes", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    ///// ------------------ CARGAR DATOS DE BICICLETAS ----------------------------------------
    
    
    private void cargarDatosBicicleta(){
        int filaSeleccionada = this.jTableListaRegistroBicicletas.getSelectedRow();
        if(filaSeleccionada > - 1)
        {
            int id = (int)this.jTableListaRegistroBicicletas.getModel().getValueAt(filaSeleccionada, 0);
            Bicicleta b = bc.read(id);
            Fabricante f = fc.read(b.getFabricante());
            Categoria c = cc.read(b.getCategoria());
            ArrayList<Fabricante> fabricantes = fc.readAll();
            ArrayList<Categoria> categorias = cc.readAll();
            if (b != null)
            {
                if(this.jInternalFrameRegistroBicicletas.isVisible() == false)
                {
                    this.jInternalFrameRegistroBicicletas.show();
                }    
                this.jTextFieldidBicicleta.setText(String.valueOf(b.getId()));
                this.jTextFieldmodeloBicicleta.setText(b.getModelo());
                int indice = -1;
                for(int i = 0; i < fabricantes.size(); i++)
                {
                    if(fabricantes.get(i).getNombre().equals(f.getNombre()))
                    {
                        indice = i;
                    }
                } 
                this.jComboBoxFabricantes.setSelectedIndex(indice);
                int indice2 = -1;
                for(int i = 0; i < categorias.size(); i++)
                {
                    if(categorias.get(i).getDescripcion().equals(c.getDescripcion()))
                    {
                        indice2 = i;
                    }
                } 
                this.jComboBoxCategoria.setSelectedIndex(indice2);
                this.jTextFieldtallaBicicleta.setText(b.getTalla());
                this.jTextFieldsuspensionBicicleta.setText(b.getSuspension());
                this.jTextFieldtransmisionBicicleta.setText(b.getTrasmision());
                this.jTextFieldfrenosBicicleta.setText(b.getFrenos());
                this.jTextFieldstockBicicleta.setText(String.valueOf(b.getStock()));
                this.jTextFieldvalorBicicleta.setText(String.valueOf(b.getValor()));
                       
                
            }
            else
            {
                 JOptionPane.showMessageDialog(this, " no se encontro bicicleta " , "mensajes", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
// ************************************************ CODIGOS PARA ELIMINAR CAMPOS DE REGISTROS ******************************************************
    
    
    
    ///----------  ELIMINAR CATEGORIA ---------------------------------------
    
    private void eliminarCategoria(){
        int filaSeleccionada = this.jTableCategorias.getSelectedRow();
        if(filaSeleccionada > -1 )
        {
            int respuesta = JOptionPane.showConfirmDialog(this, "confirmar eliminacion", "mensajes", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(respuesta == JOptionPane.YES_OPTION)
            {
                int id = (int)this.jTableCategorias.getModel().getValueAt(filaSeleccionada, 0);
                if(cc.delete(id))
                {
                    JOptionPane.showMessageDialog(this, "categoria eliminada","mensajes",JOptionPane.INFORMATION_MESSAGE);
                    LimpiarFormularioRegistroCategoria();
                }
                else
                {
                    JOptionPane.showConfirmDialog(this, "no se puede eliminar categoria", "mensajes", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else
        {
             JOptionPane.showMessageDialog(this, "selecciona una fila de la tabla" , "mensajes", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // ------------------- ELIMINAR FABRICANTE -----------------------------------------------------------------------------------------
    
    private void eliminarFabricante(){
        int filaSeleccionada = this.jTableFabricantes.getSelectedRow();
        if(filaSeleccionada > -1 )
           {
            int respuesta = JOptionPane.showConfirmDialog(this, "confirmar eliminacion", "mensajes", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(respuesta == JOptionPane.YES_OPTION)
            {
                int id = (int)this.jTableFabricantes.getModel().getValueAt(filaSeleccionada, 0);
                if(fc.delete(id))
                {
                    JOptionPane.showMessageDialog(this, "categoria eliminada","mensajes",JOptionPane.INFORMATION_MESSAGE);
                    LimpiarFormularioRegistroFabricante();
                }
                else
                {
                    JOptionPane.showConfirmDialog(this, "no se puede eliminar categoria", "mensajes", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else
        {
             JOptionPane.showMessageDialog(this, "selecciona una fila de la tabla" , "mensajes", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    //------------------------------------- ELIMINAR BICICLETA --------------------------------------------------------
    
    private void eliminarBicicleta(){
        try
        {
            int respuesta = JOptionPane.showConfirmDialog(this, "confirmar eliminacion", "mensajes", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(respuesta == JOptionPane.YES_OPTION)
            {
                int id = Integer.parseInt(this.jTextFieldidBicicleta.getText());
                if(bc.delete(id))
                {
                    JOptionPane.showMessageDialog(this, "bicicleta eliminada","mensajes",JOptionPane.INFORMATION_MESSAGE);
                    LimpiarFormularioRegistroBicicleta();
                    if(this.jInternalListadoRegistroBicicletas.isVisible())
                    {
                        cargarListadoBicicletas();
                    }
                }
                else
                {
                    JOptionPane.showConfirmDialog(this, "no se puede eliminar la bicicleta", "mensajes", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(this, "selecciona una fila de la tabla" , "mensajes", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
//   ********************************************  CODICOS PARA LA MODIFICACIION DE REGISTROS *****************************************************
    
    
    ///  ------------ MODIFICAR CATEGORIAS -------------------------------
    
    private void modificarCategoria(){
          try
        {
            int id = Integer.parseInt(this.jTextFieldIdCategoria.getText());
            String descripcion = this.jTextFieldDescripcionCategoria.getText();
            Categoria c = new Categoria(id,descripcion);
            if(cc.update(c))
            {
                JOptionPane.showMessageDialog(this, "se modifico la categoria" , "mensajes", JOptionPane.INFORMATION_MESSAGE);
                LimpiarFormularioRegistroCategoria();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "no se pudo modificar la categoria" , "mensajes", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "debes ingresar un id valido", "mensajes", JOptionPane.ERROR_MESSAGE);
        } 
        catch (CustomException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage() , "mensajes", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    //  ------------------  MODIFICAR  FABRICANTES ---------------------------------
    
    private void modificarFabricante(){
         try
        {
            int id = Integer.parseInt(this.jTextFieldIdFabricante.getText());
            String nombre = this.jTextFieldNombreFabricante.getText();
            Fabricante f = new Fabricante(id,nombre);
            if(fc.update(f))
            {
                JOptionPane.showMessageDialog(this, "se modifico el fabricante" , "mensajes", JOptionPane.INFORMATION_MESSAGE);
                LimpiarFormularioRegistroFabricante();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "no se pudo modificar el fabricante" , "mensajes", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "debes ingresar un id valido", "mensajes", JOptionPane.ERROR_MESSAGE);
        } 
        catch (CustomException ex) 
        {
            JOptionPane.showMessageDialog(this, ex.getMessage() , "mensajes", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    ///  ------------------  MODIFICAR BICICLETA -------------------------------------------------
    
    private void modificarBicicleta(){
        
        try
        {
            int id = Integer.parseInt(this.jTextFieldidBicicleta.getText());
            String modelo = this.jTextFieldmodeloBicicleta.getText();
            Fabricante f = (Fabricante)this.jComboBoxFabricantes.getSelectedItem();
            int id_fabricante = f.getId();
            Categoria c = (Categoria)this.jComboBoxCategoria.getSelectedItem();
            int id_categoria = c.getId();
            String talla = this.jTextFieldtallaBicicleta.getText();
            String suspension = this.jTextFieldsuspensionBicicleta.getText();
            String transmision = this.jTextFieldtransmisionBicicleta.getText();
            String frenos = this.jTextFieldfrenosBicicleta.getText();
            int stock = Integer.parseInt(this.jTextFieldstockBicicleta.getText());
            int valor = Integer.parseInt(this.jTextFieldvalorBicicleta.getText());
            Bicicleta b = new Bicicleta(id,modelo,id_fabricante,id_categoria,talla,suspension,transmision,frenos,stock,valor);
            if(bc.update(b))
            {
                JOptionPane.showMessageDialog(this, "datos modificados de la bicicleta" , "mensajes", JOptionPane.INFORMATION_MESSAGE);
                LimpiarFormularioRegistroBicicleta();
                if(this.jInternalListadoRegistroBicicletas.isVisible())
                {
                    cargarListadoBicicletas();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "no se pudo modificar el registro de la bicicleta" , "mensajes", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "debes ingresar los datos correctos", "mensajes", JOptionPane.ERROR_MESSAGE);
        } 
        catch (CustomException ex) 
        {
            JOptionPane.showMessageDialog(this, ex.getMessage() , "mensajes", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
//***********************************************************************  CODIGOS PARA BUSCAR REGISTROS **********************************************
    
    
    // -------------  BUSCAR CATEGORIAS ------------------------------------
    
    private void buscarCategoria(){
        int filaSeleccionada = this.jTableCategorias.getSelectedRow();
        if(filaSeleccionada > - 1)
        {
            int id = (int)this.jTableCategorias.getModel().getValueAt(filaSeleccionada, 0);
            Categoria c = cc.read(id);
            if (c != null)
            {
                this.jTextFieldIdCategoria.setText(String.valueOf(c.getId()));
                this.jTextFieldDescripcionCategoria.setText(c.getDescripcion());
            }
            
        }
    }
    
    // --------------  BUSCAR FABRICANTES --------------------------------------
    
    private void buscarFabricante(){
        int filaSeleccionada = this.jTableFabricantes.getSelectedRow();
        if(filaSeleccionada > - 1)
        {
            int id = (int)this.jTableFabricantes.getModel().getValueAt(filaSeleccionada, 0);
            Fabricante f = fc.read(id);
            if (f != null)
            {
                this.jTextFieldIdFabricante.setText(String.valueOf(f.getId()));
                this.jTextFieldNombreFabricante.setText(f.getNombre());
            }
            
        }
    }
    
    
    ///  ---------------- BUSCAR BICICLETA --------------------------------------
    
    
    private void buscarBicicleta(){
        try
        {
            int id = Integer.parseInt(this.jTextFieldidBicicleta.getText());
            Bicicleta b = bc.read(id);
            if(b != null)
            {
                Fabricante f = fc.read(b.getFabricante());
                Categoria c = cc.read(b.getCategoria());
                ArrayList<Fabricante> fabricantes = fc.readAll();
                ArrayList<Categoria> categorias = cc.readAll();
                this.jTextFieldidBicicleta.setText(String.valueOf(b.getId()));
                this.jTextFieldmodeloBicicleta.setText(b.getModelo());
                int indice = -1;
                for(int i = 0; i < fabricantes.size(); i++)
                {
                    if(fabricantes.get(i).getNombre().equals(f.getNombre()))
                    {
                        indice = i;
                    }
                } 
                this.jComboBoxFabricantes.setSelectedIndex(indice);
                int indice2 = -1;
                for(int i = 0; i < categorias.size(); i++)
                {
                    if(categorias.get(i).getDescripcion().equals(c.getDescripcion()))
                    {
                        indice2 = i;
                    }
                } 
                this.jComboBoxCategoria.setSelectedIndex(indice2);
                this.jTextFieldtallaBicicleta.setText(b.getTalla());
                this.jTextFieldsuspensionBicicleta.setText(b.getSuspension());
                this.jTextFieldtransmisionBicicleta.setText(b.getTrasmision());
                this.jTextFieldfrenosBicicleta.setText(b.getFrenos());
                this.jTextFieldstockBicicleta.setText(String.valueOf(b.getStock()));
                this.jTextFieldvalorBicicleta.setText(String.valueOf(b.getValor()));
            }
            else
            {
                JOptionPane.showMessageDialog(this, "la bicicleta no esta registrada", "mensajes", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, " se produjo un error", "mensajes", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
//**************************************************************  CODIGO PARA ALINEAR CAMPO DE VALOR DE BICICLETAS A LA DERECHA ***********************************************
    
    
    /// ------------------ ALINEAR A LA DERECHA ------------------------------------------
    private void alinearValorBicicletas(int columna){
        DefaultTableCellRenderer alinearValorDerecha = new DefaultTableCellRenderer();
        alinearValorDerecha.setHorizontalAlignment(SwingConstants.RIGHT);
        this.jTableListaRegistroBicicletas.getColumnModel().getColumn(columna).setCellRenderer(alinearValorDerecha);
    }
            
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindows().setVisible(true);
            }
        });
    }
    
  
    
  
   
    
   
    
   
    

 
    
    
   
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupOpcionesFiltro;
    private javax.swing.JButton jButtonBuscarBicicleta;
    private javax.swing.JButton jButtonCargarDatosBicicleta;
    private javax.swing.JButton jButtonEliminarBicicleta;
    private javax.swing.JButton jButtonEliminarCategoria;
    private javax.swing.JButton jButtonEliminarFabricante;
    private javax.swing.JButton jButtonLimpiarBicicleta;
    private javax.swing.JButton jButtonLimpiarLogin;
    private javax.swing.JButton jButtonLimpiarRegistroCategoria;
    private javax.swing.JButton jButtonLimpiarRegistroFabricante;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonModificarBicicleta;
    private javax.swing.JButton jButtonModificarCategoria;
    private javax.swing.JButton jButtonModificarFabricante;
    private javax.swing.JButton jButtonRedireccionRegistroCategoria;
    private javax.swing.JButton jButtonRedireccionRegistroFabricante;
    private javax.swing.JButton jButtonRegistrarBicicleta;
    private javax.swing.JButton jButtonRegistrarCategoria;
    private javax.swing.JButton jButtonRegistrarFabricante;
    private javax.swing.JButton jButtonRestablecerBusquedaBicicletas;
    private javax.swing.JButton jButtonbuscarBicicleta;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxFabricantes;
    private javax.swing.JInternalFrame jInternalFrameAcercaDe;
    private javax.swing.JInternalFrame jInternalFrameControlAcceso;
    private javax.swing.JInternalFrame jInternalFrameRegistroBicicletas;
    private javax.swing.JInternalFrame jInternalFrameRegistroCategoria;
    private javax.swing.JInternalFrame jInternalListadoRegistroBicicletas;
    private javax.swing.JInternalFrame jInternalRegistroFabricante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDescripcionCategoria;
    private javax.swing.JLabel jLabelIdBicicleta;
    private javax.swing.JLabel jLabelIdCategoria;
    private javax.swing.JLabel jLabelIdFabricante;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelImagenLogo;
    private javax.swing.JLabel jLabelNombreFabricante;
    private javax.swing.JLabel jLabelcategoriaBicicleta;
    private javax.swing.JLabel jLabelfabricanteBicicleta;
    private javax.swing.JLabel jLabelfrenosBicicleta;
    private javax.swing.JLabel jLabelmodeloBicicleta;
    private javax.swing.JLabel jLabelpassword;
    private javax.swing.JLabel jLabelstockBicicleta;
    private javax.swing.JLabel jLabelsuspensionBicicleta;
    private javax.swing.JLabel jLabeltallaBicicleta;
    private javax.swing.JLabel jLabeltransmisionBicicleta;
    private javax.swing.JLabel jLabelusername;
    private javax.swing.JLabel jLabelvalorBicicleta;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAcercaDe;
    private javax.swing.JMenuItem jMenuItemCerrarSesion;
    private javax.swing.JMenuItem jMenuItemIniciarSesion;
    private javax.swing.JMenuItem jMenuItemListadoBicicletas;
    private javax.swing.JMenuItem jMenuItemRegistroBicicletas;
    private javax.swing.JMenuItem jMenuItemRegistroCategoria;
    private javax.swing.JMenuItem jMenuItemRegistroFabricantes;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuRegistrar;
    private javax.swing.JPanel jPanelfiltrosBicicletas;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JRadioButton jRadioButtonfiltroCategoria;
    private javax.swing.JRadioButton jRadioButtonfiltroFabricante;
    private javax.swing.JRadioButton jRadioButtonfiltroId;
    private javax.swing.JRadioButton jRadioButtonfiltroModelo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableCategorias;
    private javax.swing.JTable jTableFabricantes;
    private javax.swing.JTable jTableListaRegistroBicicletas;
    private javax.swing.JTextField jTextFieldDescripcionCategoria;
    private javax.swing.JTextField jTextFieldIdCategoria;
    private javax.swing.JTextField jTextFieldIdFabricante;
    private javax.swing.JTextField jTextFieldNombreFabricante;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JTextField jTextFieldfrenosBicicleta;
    private javax.swing.JTextField jTextFieldidBicicleta;
    private javax.swing.JTextField jTextFieldmodeloBicicleta;
    private javax.swing.JTextField jTextFieldstockBicicleta;
    private javax.swing.JTextField jTextFieldsuspensionBicicleta;
    private javax.swing.JTextField jTextFieldtallaBicicleta;
    private javax.swing.JTextField jTextFieldtextoBusqueda;
    private javax.swing.JTextField jTextFieldtransmisionBicicleta;
    private javax.swing.JTextField jTextFieldvalorBicicleta;
    // End of variables declaration//GEN-END:variables
}
