/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import dao.*;

/**
 *
 * @author XL
 */
public class Consultar extends javax.swing.JFrame {

    /**
     * Creates new form Consultar
     */
    public Consultar() {
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

        textcpfLabel = new javax.swing.JLabel();
        textfuncionalLabel = new javax.swing.JLabel();
        cpfTextField = new javax.swing.JTextField();
        funcionalTextField = new javax.swing.JTextField();
        buscaButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fundoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        textcpfLabel.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        textcpfLabel.setForeground(new java.awt.Color(51, 102, 0));
        textcpfLabel.setText("CPF");
        getContentPane().add(textcpfLabel);
        textcpfLabel.setBounds(10, 70, 60, 20);

        textfuncionalLabel.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        textfuncionalLabel.setForeground(new java.awt.Color(51, 102, 0));
        textfuncionalLabel.setText("Funcional:");
        getContentPane().add(textfuncionalLabel);
        textfuncionalLabel.setBounds(10, 110, 100, 30);
        getContentPane().add(cpfTextField);
        cpfTextField.setBounds(130, 60, 155, 30);

        funcionalTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionalTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(funcionalTextField);
        funcionalTextField.setBounds(130, 110, 155, 30);

        buscaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-pesquisar-32.png"))); // NOI18N
        buscaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(buscaButton);
        buscaButton.setBounds(110, 170, 40, 40);

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });
        getContentPane().add(limparButton);
        limparButton.setBounds(170, 180, 73, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-cancelar-25.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 10, 30, 30);

        fundoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/MASVIG_phixr300x330.jpg"))); // NOI18N
        getContentPane().add(fundoLabel);
        fundoLabel.setBounds(0, 0, 310, 300);

        setSize(new java.awt.Dimension(325, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void funcionalTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionalTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcionalTextFieldActionPerformed

    private void buscaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaButtonActionPerformed
       String cpf = cpfTextField.getText();
        UsuarioDAO dao = new UsuarioDAO();
        // declara uma variável da classe UsuarioDAO chamada dao
        // e cria um novo objeto do tipo UsuarioDAO
        int funcional = dao.consulta(cpf);
        funcionalTextField.setText(Integer.toString(funcional));
    }//GEN-LAST:event_buscaButtonActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        cpfTextField.setText("");
        funcionalTextField.setText("");
    }//GEN-LAST:event_limparButtonActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscaButton;
    private javax.swing.JTextField cpfTextField;
    private javax.swing.JTextField funcionalTextField;
    private javax.swing.JLabel fundoLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel textcpfLabel;
    private javax.swing.JLabel textfuncionalLabel;
    // End of variables declaration//GEN-END:variables
}
