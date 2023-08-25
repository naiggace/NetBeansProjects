package t3.vista1;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author naigg
 */
public class SumadorView extends javax.swing.JFrame {

    /**
     * Creates new form SumadorView
     */
    public SumadorView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlSumador = new javax.swing.JLabel();
        jlNum1 = new javax.swing.JLabel();
        jlNum2 = new javax.swing.JLabel();
        jtNum2 = new javax.swing.JTextField();
        jtNum1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jbSumar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jlResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlSumador.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jlSumador.setForeground(new java.awt.Color(51, 51, 255));
        jlSumador.setText("SUMADOR");

        jlNum1.setText("Ingrese un numero");

        jlNum2.setText("Ingrese otro numero");

        jtNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNum2ActionPerformed(evt);
            }
        });

        jtNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNum1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jbSumar.setText("Sumar");
        jbSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSumarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jlResultado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlResultado.setForeground(new java.awt.Color(255, 51, 51));
        jlResultado.setText("Resultado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbSumar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbLimpiar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jlResultado)
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jlResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSumar)
                    .addComponent(jbLimpiar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlNum1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlNum2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlSumador)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jlSumador)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNum1)
                    .addComponent(jtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNum2)
                    .addComponent(jtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSumarActionPerformed
        try {
            int nro1 = Integer.parseInt(jtNum1.getText());
            int nro2 = Integer.parseInt(jtNum2.getText());
            int resultado = nro1 + nro2;
            jlResultado.setText(resultado + "");
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Usted debe ingresar solo enteros");
            jtNum1.setText("");
            jtNum2.setText("");
        }
    }//GEN-LAST:event_jbSumarActionPerformed

    private void jtNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNum1ActionPerformed

    private void jtNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNum2ActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtNum1.setText("");
        jtNum2.setText("");
        jlResultado.setText("Resultado");
    }//GEN-LAST:event_jbLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(SumadorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SumadorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SumadorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SumadorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SumadorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSumar;
    private javax.swing.JLabel jlNum1;
    private javax.swing.JLabel jlNum2;
    private javax.swing.JLabel jlResultado;
    private javax.swing.JLabel jlSumador;
    private javax.swing.JTextField jtNum1;
    private javax.swing.JTextField jtNum2;
    // End of variables declaration//GEN-END:variables
}
