/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package clix.crud.create;

import clix.home.Home;
import clix.jnafilechooser.api.JnaFileChooser;
import clix.manager.FormsManager;
import clix.model.ModelReceta;
import clix.util.db;
import com.formdev.flatlaf.FlatClientProperties;

import javax.swing.*;
import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;

/**
 *
 * @author clint
 */
public class MainCrud extends javax.swing.JPanel {
     private String imagePath = "";
    ModelReceta recetaPas = new ModelReceta();

    /**
     * Creates new form MainCrud
     */
    public MainCrud() {
        initComponents();

        textNombreReceta.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese el nombre de la receta");
        textNombreReceta.putClientProperty(FlatClientProperties.STYLE, "" +
                "showClearButton:true"
        );

        // dar colores


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombreReceta = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        textNombreReceta = new javax.swing.JTextField();
        comboboxCategoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescripcionReceta = new javax.swing.JTextPane();
        lblDificultad = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboboxTiempoPrep = new javax.swing.JComboBox<>();
        comboboxDificultad = new javax.swing.JComboBox<>();
        lnlPasosReceta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textPasosReceta = new javax.swing.JTextPane();
        btnBuscarImagen = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblImagen = new javax.swing.JLabel();
        seguir = new clix.components.btn.Button();
        guardar = new clix.components.btn.Button();
        regresar = new clix.components.btn.Button();
        lblDescripcion1 = new javax.swing.JLabel();

        lblNombreReceta.setText("Nombre Receta");
        // poner negrita
        lblNombreReceta.setFont(new java.awt.Font("Segoe UI", 1, 13));

        lblCategoria.setText("Categoria");
        lblCategoria.setFont(new java.awt.Font("Segoe UI", 1, 13));

        lblDescripcion.setText("Descripcion");
        lblDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 13));

        textNombreReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreRecetaActionPerformed(evt);
            }
        });

        comboboxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una categoria", "Desayuno", "Almuerzo", "Cena", "Postre"}));
        comboboxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxCategoriaActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(textDescripcionReceta);

        lblDificultad.setText("Dificultad");
        lblDificultad.setFont(new java.awt.Font("Segoe UI", 1, 13));

        jLabel5.setText("Tiempo de Preparacion");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13));

        comboboxTiempoPrep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tiempo en minutos", "15", "30", "45", "60", "90", "120","150","180","240","300" }));
        // dejar que puedan realizar cambios
        comboboxTiempoPrep.setEditable(true);

        comboboxDificultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una dificultad", "Facil", "Moderado", "Dificil" }));

        lnlPasosReceta.setText("Pasos a Seguir");
        lnlPasosReceta.setFont(new java.awt.Font("Segoe UI", 1, 13));


        jScrollPane2.setViewportView(textPasosReceta);

        btnBuscarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsImg/file-and-folder.png"))); // NOI18N
        btnBuscarImagen.setText("buscar");
        btnBuscarImagen.setBackground(new java.awt.Color(103, 103, 103));
        btnBuscarImagen.setForeground(new java.awt.Color(245, 245, 245));
        btnBuscarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarImagenActionPerformed(evt);
            }
        });

        seguir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsImg/flecha-correcta.png"))); // NOI18N
        // poner el icono a la derecha
        seguir.setHorizontalTextPosition(SwingConstants.LEFT);
        // centrar el texto
        seguir.setHorizontalAlignment(SwingConstants.CENTER);
        seguir.setBackground(new java.awt.Color(29, 162, 253));
        seguir.setForeground(new java.awt.Color(245, 245, 245));
        seguir.setRippleColor(new java.awt.Color(255, 255, 255));
        seguir.setShadowColor(new java.awt.Color(29, 162, 253));
        seguir.setText("seguir");
        seguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seguirActionPerformed(evt);
            }
        });

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsImg/guardar-datos.png"))); // NOI18N
        guardar.setText("guardar");
        //centrar el texto
        guardar.setHorizontalAlignment(SwingConstants.CENTER);
        guardar.setBackground(new java.awt.Color(30, 180, 114));
        guardar.setForeground(new java.awt.Color(245, 245, 245));
        guardar.setRippleColor(new java.awt.Color(255, 255, 255));
        guardar.setShadowColor(new java.awt.Color(30, 180, 114));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsImg/flecha-izquierda.png"))); // NOI18N

        regresar.setText("regresar");
        // centrar el texto
        regresar.setHorizontalAlignment(SwingConstants.CENTER);
        regresar.setBackground(new java.awt.Color(253, 83, 83));
        regresar.setForeground(new java.awt.Color(245, 245, 245));
        regresar.setRippleColor(new java.awt.Color(255, 255, 255));
        regresar.setShadowColor(new java.awt.Color(253, 83, 83));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        lblDescripcion1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblDescripcion1.setText("\" Después de cada paso, poner guion: ' - ' \"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDificultad)
                            .addComponent(comboboxDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(comboboxTiempoPrep, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNombreReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreReceta))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategoria)
                            .addComponent(comboboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(btnBuscarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lnlPasosReceta)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(seguir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreReceta)
                            .addComponent(lblDescripcion)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCategoria)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNombreReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(comboboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDificultad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboboxDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboboxTiempoPrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lnlPasosReceta)
                .addGap(12, 12, 12)
                .addComponent(lblDescripcion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarImagen))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seguir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreRecetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreRecetaActionPerformed

    private void btnBuscarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarImagenActionPerformed

        JnaFileChooser jnaCh = new JnaFileChooser();
        jnaCh.addFilter("images","png","jpg","jpeg");
        jnaCh.setMultiSelectionEnabled(false);
        boolean save = jnaCh.showOpenDialog(SwingUtilities.getWindowAncestor(this));
        if (save) {
            imagePath = jnaCh.getSelectedFile().getAbsolutePath();
            Image img = new ImageIcon(imagePath).getImage();
            ImageIcon img2 = new ImageIcon(img.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH));
            lblImagen.setIcon(img2);
        }




    }//GEN-LAST:event_btnBuscarImagenActionPerformed

    private void comboboxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxCategoriaActionPerformed

    private byte[] convertImageToBytes (String imagePath) {
        byte[] imageBytes = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            FileInputStream fis = new FileInputStream(new File(imagePath));
            byte[] buffer = new byte[1024];
            int read = 0;
            while ((read = fis.read(buffer)) != -1) {
                baos.write(buffer,0,read);
            }
            imageBytes = baos.toByteArray();
        } catch (Exception e) {
            System.out.println(e);
        }
        return imageBytes;
    }

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {
        String nombreReceta = textNombreReceta.getText();
        String categoriaString = Objects.requireNonNull(comboboxCategoria.getSelectedItem()).toString();
        int categoria = switch (categoriaString) {
            case "Desayuno" -> 1;
            case "Almuerzo" -> 2;
            case "Cena" -> 3;
            case "Postre" -> 4;
            default -> 0;
        };

        String descripcion = textDescripcionReceta.getText();
        String dificultadString = Objects.requireNonNull(comboboxDificultad.getSelectedItem()).toString();
        int dificultad = switch (dificultadString) {
            case "Facil" -> 1;
            case "Moderado" -> 2;
            case "Dificil" -> 3;
            default -> 0;
        };


        String pasosReceta = textPasosReceta.getText();
        byte[] imageBytes = convertImageToBytes(imagePath);


        String tiempoPrepString = Objects.requireNonNull(comboboxTiempoPrep.getSelectedItem()).toString();
        double tiempoPrep = Double.parseDouble(tiempoPrepString);


        if (nombreReceta.isEmpty() || descripcion.isEmpty() || dificultad == 0 || categoria == 0 || pasosReceta.isEmpty() || tiempoPrep == 0 || imageBytes == null) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        } else {
            try {
                String sql = "INSERT INTO Receta (nombre, descripcion, tiempo_de_preparacion, instruccion_de_preparacion, dificultad, id_categoria, imagen) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = db.getConnection().prepareStatement(sql);
                pstmt.setString(1, nombreReceta);
                pstmt.setString(2, descripcion);
                pstmt.setDouble(3, tiempoPrep);
                pstmt.setString(4, pasosReceta);
                pstmt.setInt(5, dificultad);
                pstmt.setInt(6, categoria);
                pstmt.setBytes(7, imageBytes);
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Receta guardada correctamente");

                // ahora sacar de la base de datos el id de la receta que se acaba de guardar y guardar en el objeto recetaPas
                Statement stmt = db.getConnection().createStatement();
                String sql2 = "SELECT id_receta FROM Receta WHERE nombre = '" + nombreReceta + "'";
                ResultSet rs = stmt.executeQuery(sql2);
                if (rs.next()) {
                    recetaPas.setId_receta(rs.getInt("id_receta"));
                }else {
                    System.out.println("No se encontro el id de la receta");
                }


            } catch (Exception ex) {
                System.out.println(ex);
            }
        }

        // CREAR UN OBJETO PARA PASAR AL SIGUIENTE FORM
        recetaPas.setNombre(nombreReceta);
        recetaPas.setDescripcion(descripcion);
        recetaPas.setTiempo_de_preparacion(tiempoPrep);
        recetaPas.setInstruccion_de_preparacion(pasosReceta);
        recetaPas.setDificultad(dificultad);
        recetaPas.setId_categoria(categoria);
        recetaPas.setImagen(new ImageIcon(imageBytes));

        // PASAR AL SIGUIENTE FORM





    }

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {

        FormsManager.getInstance().showForm(new Home());
    }

    private void seguirActionPerformed(java.awt.event.ActionEvent evt) {


        FormsManager.getInstance().showForm(new MainCrud2(recetaPas));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarImagen;
    private javax.swing.JComboBox<String> comboboxCategoria;
    private javax.swing.JComboBox<String> comboboxDificultad;
    private javax.swing.JComboBox<String> comboboxTiempoPrep;
    private clix.components.btn.Button guardar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescripcion1;
    private javax.swing.JLabel lblDificultad;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombreReceta;
    private javax.swing.JLabel lnlPasosReceta;
    private clix.components.btn.Button regresar;
    private clix.components.btn.Button seguir;
    private javax.swing.JTextPane textDescripcionReceta;
    private javax.swing.JTextField textNombreReceta;
    private javax.swing.JTextPane textPasosReceta;
    // End of variables declaration//GEN-END:variables
}