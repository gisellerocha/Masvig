/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import dao.Sessao;
import javax.swing.JOptionPane;

/**
 *
 * @author XL
 */
public class TelaInicio extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicio
     */
    public TelaInicio() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();
        jMenuCliente = new javax.swing.JMenuItem();
        jMenuUsuario = new javax.swing.JMenuItem();
        jMenuAtendimento = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();
        jMenuEdCliente = new javax.swing.JMenuItem();
        jMenuEdUsuario = new javax.swing.JMenuItem();
        jMenuEdAtendimento = new javax.swing.JMenuItem();
        jMenuExibir = new javax.swing.JMenu();
        jMenuRelatorio = new javax.swing.JMenuItem();
        jMenuExConsultaAtendimento = new javax.swing.JMenuItem();
        jMenuConsultaFuncional = new javax.swing.JMenuItem();
        jMenuConsultaCliente = new javax.swing.JMenuItem();
        jMenu3Sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(890, 520));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/MASVIG_phixr.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseClicked(evt);
            }
        });

        jMenu1.setText("Inicio");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenuSair.setText("Cadastros");

        jMenuCliente.setText("Cliente");
        jMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClienteActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuCliente);

        jMenuUsuario.setText("Usuário");
        jMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUsuarioActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuUsuario);

        jMenuAtendimento.setText("Atendimento");
        jMenuAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAtendimentoActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuAtendimento);

        jMenuBar1.add(jMenuSair);

        jMenuEditar.setText("Editar");

        jMenuEdCliente.setText("Cliente");
        jMenuEdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEdClienteActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuEdCliente);

        jMenuEdUsuario.setText("Usuário");
        jMenuEdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEdUsuarioActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuEdUsuario);

        jMenuEdAtendimento.setText("Atendimento");
        jMenuEdAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEdAtendimentoActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuEdAtendimento);

        jMenuBar1.add(jMenuEditar);

        jMenuExibir.setText("Exibir");

        jMenuRelatorio.setText("Relatórios");
        jMenuRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRelatorioActionPerformed(evt);
            }
        });
        jMenuExibir.add(jMenuRelatorio);

        jMenuExConsultaAtendimento.setText("Consulta atendimento");
        jMenuExConsultaAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExConsultaAtendimentoActionPerformed(evt);
            }
        });
        jMenuExibir.add(jMenuExConsultaAtendimento);

        jMenuConsultaFuncional.setText("Consulta funcional");
        jMenuConsultaFuncional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultaFuncionalActionPerformed(evt);
            }
        });
        jMenuExibir.add(jMenuConsultaFuncional);

        jMenuConsultaCliente.setText("Consulta cliente");
        jMenuConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultaClienteActionPerformed(evt);
            }
        });
        jMenuExibir.add(jMenuConsultaCliente);

        jMenuBar1.add(jMenuExibir);

        jMenu3Sair.setText("Sair");
        jMenu3Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3SairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3Sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClienteActionPerformed
        new TelaCliente().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuClienteActionPerformed

    private void jMenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUsuarioActionPerformed
        new TelaUser().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuUsuarioActionPerformed

    private void jMenuAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAtendimentoActionPerformed
        new TelaAtendimento().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuAtendimentoActionPerformed
//PARTE DE EDIÇÃO!//
    private void jMenuEdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEdClienteActionPerformed
        if(Sessao.getInstance().getUsuario().getTipo_de_usuario().equals("Gerente")){
            new TelaEditaCliente().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Apenas Gerentes!");
        }
    }//GEN-LAST:event_jMenuEdClienteActionPerformed

    private void jMenuEdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEdUsuarioActionPerformed
        if(Sessao.getInstance().getUsuario().getTipo_de_usuario().equals("Gerente")){
            new TelaEditaUsuario().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Apenas Gerentes!");
        }
    }//GEN-LAST:event_jMenuEdUsuarioActionPerformed

    private void jMenuEdAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEdAtendimentoActionPerformed
        if(Sessao.getInstance().getUsuario().getTipo_de_usuario().equals("Gerente")){
            new TelaAtendimentoEditar().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Apenas Gerentes!");
        }
    }//GEN-LAST:event_jMenuEdAtendimentoActionPerformed
//FIM DA PARTE DE EDIÇÃO!//
    private void jMenuRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRelatorioActionPerformed
        new TelaGerenteRelatorio().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuRelatorioActionPerformed

    private void jMenuExConsultaAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExConsultaAtendimentoActionPerformed
        new TelaAtendimentoConsulta().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuExConsultaAtendimentoActionPerformed

    private void jMenu3SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3SairMouseClicked
        // Botão Sair - tela principal
        System.exit(0);
    }//GEN-LAST:event_jMenu3SairMouseClicked

    private void jMenuBar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBar1MouseClicked

    private void jMenuConsultaFuncionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultaFuncionalActionPerformed
        new Consultar().setVisible(true);
    }//GEN-LAST:event_jMenuConsultaFuncionalActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
       new TelaInicio().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultaClienteActionPerformed
       new TelaConsultaCliente().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuConsultaClienteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3Sair;
    private javax.swing.JMenuItem jMenuAtendimento;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCliente;
    private javax.swing.JMenuItem jMenuConsultaCliente;
    private javax.swing.JMenuItem jMenuConsultaFuncional;
    private javax.swing.JMenuItem jMenuEdAtendimento;
    private javax.swing.JMenuItem jMenuEdCliente;
    private javax.swing.JMenuItem jMenuEdUsuario;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenuItem jMenuExConsultaAtendimento;
    private javax.swing.JMenu jMenuExibir;
    private javax.swing.JMenuItem jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenuItem jMenuUsuario;
    // End of variables declaration//GEN-END:variables
}
