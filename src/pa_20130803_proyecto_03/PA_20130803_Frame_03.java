/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_20130803_proyecto_03;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author cgl05
 */
public class PA_20130803_Frame_03 extends javax.swing.JFrame {

    /**
     * Creates new form PA_20130803_Frame_03
     */
    JuegoMesa[] lista = new JuegoMesa[4];
    
    public PA_20130803_Frame_03() {
        initComponents();
        jTableJuegos.setShowGrid(true);
        
        jLabClase.setVisible(false);
        jLabDescripcion.setVisible(false);
        jLabNumeroJugadores.setVisible(false);
        jLabPropiedadUno.setVisible(false);
        jLabPropiedadDos.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableJuegos = new javax.swing.JTable();
        jButEjemplo = new javax.swing.JButton();
        jButCrear = new javax.swing.JButton();
        jSpinJuego = new javax.swing.JSpinner();
        jButMostrar = new javax.swing.JButton();
        jButDesfile = new javax.swing.JButton();
        jLabClase = new javax.swing.JLabel();
        jLabDescripcion = new javax.swing.JLabel();
        jLabNumeroJugadores = new javax.swing.JLabel();
        jLabPropiedadUno = new javax.swing.JLabel();
        jLabPropiedadDos = new javax.swing.JLabel();
        jLabNombre = new javax.swing.JLabel();
        jLabNumeroDeControl = new javax.swing.JLabel();
        jLabNumeroDeProyecto = new javax.swing.JLabel();
        jLabDescripcionUno = new javax.swing.JLabel();
        jLabDescripcionDos = new javax.swing.JLabel();
        jLabAsignacion = new javax.swing.JLabel();
        jLabDiagrama = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableJuegos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Clase", "Descripcion", "Num de Jugadores", "Propiedad 1", "Propiedad 2"
            }
        ));
        jScrollPane1.setViewportView(jTableJuegos);
        if (jTableJuegos.getColumnModel().getColumnCount() > 0) {
            jTableJuegos.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTableJuegos.getColumnModel().getColumn(1).setPreferredWidth(500);
        }

        jButEjemplo.setText("Ejemplo");
        jButEjemplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEjemploActionPerformed(evt);
            }
        });

        jButCrear.setText("Crear Objetos");
        jButCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCrearActionPerformed(evt);
            }
        });

        jSpinJuego.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));

        jButMostrar.setText("Mostrar");
        jButMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButMostrarActionPerformed(evt);
            }
        });

        jButDesfile.setText("Desfile");
        jButDesfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDesfileActionPerformed(evt);
            }
        });

        jLabClase.setBackground(new java.awt.Color(255, 255, 102));
        jLabClase.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabClase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabClase.setOpaque(true);

        jLabDescripcion.setBackground(new java.awt.Color(255, 255, 102));
        jLabDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabDescripcion.setOpaque(true);

        jLabNumeroJugadores.setBackground(new java.awt.Color(255, 255, 102));
        jLabNumeroJugadores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabNumeroJugadores.setOpaque(true);

        jLabPropiedadUno.setBackground(new java.awt.Color(255, 255, 102));
        jLabPropiedadUno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabPropiedadUno.setOpaque(true);

        jLabPropiedadDos.setBackground(new java.awt.Color(255, 255, 102));
        jLabPropiedadDos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabPropiedadDos.setOpaque(true);

        jLabNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabNombre.setText("Nombre: Carson Alejandro Gomez Lugo");

        jLabNumeroDeControl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabNumeroDeControl.setText("Numero de control: 20130803");

        jLabNumeroDeProyecto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabNumeroDeProyecto.setText("Numero de Proyecto: 03");

        jLabDescripcionUno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabDescripcionUno.setText("Descripcion: Esta Aplicacion te permite ver los datos ");

        jLabDescripcionDos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabDescripcionDos.setText("y un pequeño dibujo del juego de mesa.");

        jLabAsignacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pa_20130803_proyecto_03/AsignacionP3.png"))); // NOI18N

        jLabDiagrama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pa_20130803_proyecto_03/P3ImagenDocumento.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jButEjemplo)
                .addGap(18, 18, 18)
                .addComponent(jButCrear)
                .addGap(54, 54, 54)
                .addComponent(jSpinJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButMostrar)
                .addGap(71, 71, 71)
                .addComponent(jButDesfile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabNumeroJugadores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabPropiedadUno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabPropiedadDos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabClase, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabAsignacion)
                                .addGap(81, 81, 81))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabNombre)
                            .addComponent(jLabNumeroDeControl)
                            .addComponent(jLabNumeroDeProyecto))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabDescripcionUno))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabDescripcionDos)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabDiagrama)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButEjemplo)
                    .addComponent(jButCrear)
                    .addComponent(jSpinJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButMostrar)
                    .addComponent(jButDesfile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabDescripcionUno)
                            .addComponent(jLabNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabNumeroDeControl)
                            .addComponent(jLabDescripcionDos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabNumeroDeProyecto)
                        .addGap(15, 15, 15)
                        .addComponent(jLabClase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabNumeroJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabPropiedadUno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabPropiedadDos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabAsignacion))
                    .addComponent(jLabDiagrama))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButEjemploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEjemploActionPerformed
        // TODO add your handling code here:
        jTableJuegos.setValueAt("Uno", 0, 0);
        jTableJuegos.setValueAt("Los jugadores toman turnos para hacer pares con una carta en su lote, con la carta que se muestra en la parte superior de la baraja, ya sea por su color o su número", 0, 1);
        jTableJuegos.setValueAt("2-10", 0, 2);
        jTableJuegos.setValueAt("Si", 0, 3);
        jTableJuegos.setValueAt("Explosion", 0, 4);
                        
        jTableJuegos.setValueAt("Monopoly", 1, 0);
        jTableJuegos.setValueAt("Consiste obtener un monopolio de calles e inmuebles. Los jugadores mueven sus fichas por turnos en sentido horario alrededor de un tablero, basándose en la puntuación de los dados", 1, 1);
        jTableJuegos.setValueAt("2-8", 1, 2);
        jTableJuegos.setValueAt("Si", 1, 3);
        jTableJuegos.setValueAt("Harry potter", 1, 4);
        
        jTableJuegos.setValueAt("Blackjack", 2, 0);
        jTableJuegos.setValueAt("Consiste en sumar un valor lo más próximo a 21 pero sin pasarse.", 2, 1);
        jTableJuegos.setValueAt("4-7", 2, 2);
        jTableJuegos.setValueAt("Si", 2, 3);
        jTableJuegos.setValueAt("Francesa", 2, 4);
        
        jTableJuegos.setValueAt("SerpientesYEscaleras", 3, 0);
        jTableJuegos.setValueAt("Si caes en una casilla con una escalera ascenderás a la casilla que indique el final de la escalera; mientras que si caes en una casilla con serpiente siempre descenderás.", 3, 1);
        jTableJuegos.setValueAt("2-4", 3, 2);
        jTableJuegos.setValueAt("Si", 3, 3);
        jTableJuegos.setValueAt("Media", 3, 4);
        
    }//GEN-LAST:event_jButEjemploActionPerformed

    private void jButCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCrearActionPerformed
        // TODO add your handling code here:
            lista[0] = new Uno(jTableJuegos.getValueAt(0, 4) + "",jTableJuegos.getValueAt(0, 3) + "",jTableJuegos.getValueAt(0, 1) + "",jTableJuegos.getValueAt(0, 2) +"");
            lista[1] = new Monopoly(jTableJuegos.getValueAt(1, 4) + "",jTableJuegos.getValueAt(1, 3) + "",jTableJuegos.getValueAt(1, 1)+"",jTableJuegos.getValueAt(1, 2) +"");
            lista[2] = new Blackjack(jTableJuegos.getValueAt(2, 4) + "",jTableJuegos.getValueAt(2, 3) + "",jTableJuegos.getValueAt(2, 1)+"",jTableJuegos.getValueAt(2, 2) +"");
            lista[3] = new SerpientesYEscaleras(jTableJuegos.getValueAt(3, 4) + "",jTableJuegos.getValueAt(3, 3) + "",jTableJuegos.getValueAt(3, 1) + "",jTableJuegos.getValueAt(3, 2) +"");
        
            JOptionPane.showMessageDialog(rootPane, "Los objetos fueron creados...");
        
    }//GEN-LAST:event_jButCrearActionPerformed

    private void jButMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButMostrarActionPerformed
        // TODO add your handling code here:
        int n = (int)jSpinJuego.getValue()-1;
        lista[n].dibujar(this);
        jLabClase.setVisible(true);
        jLabDescripcion.setVisible(true);
        jLabNumeroJugadores.setVisible(true);
        jLabPropiedadUno.setVisible(true);
        jLabPropiedadDos.setVisible(true);
        jLabClase.setText(lista[n].nombre());
        jLabDescripcion.setText(lista[n].getDescripcion());
        jLabNumeroJugadores.setText(lista[n].getNumJugadores());
        jLabPropiedadUno.setText(lista[n].atributoUno());
        jLabPropiedadDos.setText(lista[n].atributoDos());
        
        if((int)jSpinJuego.getValue() == 4)
            jSpinJuego.setValue(1);
        else
            jSpinJuego.setValue((int)jSpinJuego.getValue()+1);
                    
    }//GEN-LAST:event_jButMostrarActionPerformed

    private void jButDesfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDesfileActionPerformed
        // TODO add your handling code here:
        jLabClase.setVisible(false);
        jLabDescripcion.setVisible(false);
        jLabNumeroJugadores.setVisible(false);
        jLabPropiedadUno.setVisible(false);
        jLabPropiedadDos.setVisible(false);
        
        Arrays.sort(lista);
        for (int n = 0; n <= 3; n++)
            lista[n].mover(this);
        
        jLabDiagrama.setVisible(true);
        jLabAsignacion.setVisible(true);
        
    }//GEN-LAST:event_jButDesfileActionPerformed

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
            java.util.logging.Logger.getLogger(PA_20130803_Frame_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PA_20130803_Frame_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PA_20130803_Frame_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PA_20130803_Frame_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PA_20130803_Frame_03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButCrear;
    private javax.swing.JButton jButDesfile;
    private javax.swing.JButton jButEjemplo;
    private javax.swing.JButton jButMostrar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabAsignacion;
    private javax.swing.JLabel jLabClase;
    private javax.swing.JLabel jLabDescripcion;
    private javax.swing.JLabel jLabDescripcionDos;
    private javax.swing.JLabel jLabDescripcionUno;
    private javax.swing.JLabel jLabDiagrama;
    private javax.swing.JLabel jLabNombre;
    private javax.swing.JLabel jLabNumeroDeControl;
    private javax.swing.JLabel jLabNumeroDeProyecto;
    private javax.swing.JLabel jLabNumeroJugadores;
    private javax.swing.JLabel jLabPropiedadDos;
    private javax.swing.JLabel jLabPropiedadUno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinJuego;
    private javax.swing.JTable jTableJuegos;
    // End of variables declaration//GEN-END:variables
}
