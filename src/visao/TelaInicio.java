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

        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();
        jMenuCliente = new javax.swing.JMenuItem();
        jMenuUsuario = new javax.swing.JMenuItem();
        jMenuAtendimento = new javax.swing.JMenuItem();
        jMenuProblema = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();
        jMenuEdCliente = new javax.swing.JMenuItem();
        jMenuEdUsuario = new javax.swing.JMenuItem();
        jMenuEdAtendimento = new javax.swing.JMenuItem();
        jMenuEdProblema = new javax.swing.JMenuItem();
        jMenuExibir = new javax.swing.JMenu();
        jMenuRelatorio = new javax.swing.JMenuItem();
        jMenuExConsultaAtendimento = new javax.swing.JMenuItem();
        jMenuConsultaFuncional = new javax.swing.JMenuItem();
        jMenuConsultaCliente = new javax.swing.JMenuItem();
        jMenuConsultaUsuario = new javax.swing.JMenuItem();
        jMenuConsultaProblema = new javax.swing.JMenuItem();
        jMenu3Sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));

        jMenuBar3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuBar3MouseClicked(evt);
            }
        });

        jMenu3.setText("Inicio");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar3.add(jMenu3);

        jMenuSair.setText("Cadastros");

        jMenuCliente.setText("Cliente");
        jMenuCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuClienteMousePressed(evt);
            }
        });
        jMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClienteActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuCliente);

        jMenuUsuario.setText("Usuário");
        jMenuUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuUsuarioMousePressed(evt);
            }
        });
        jMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUsuarioActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuUsuario);

        jMenuAtendimento.setText("Atendimento");
        jMenuAtendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuAtendimentoMousePressed(evt);
            }
        });
        jMenuAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAtendimentoActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuAtendimento);

        jMenuProblema.setText("Problema");
        jMenuProblema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuProblemaMousePressed(evt);
            }
        });
        jMenuSair.add(jMenuProblema);

        jMenuBar3.add(jMenuSair);

        jMenuEditar.setText("Editar");

        jMenuEdCliente.setText("Cliente");
        jMenuEdCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuEdClienteMousePressed(evt);
            }
        });
        jMenuEdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEdClienteActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuEdCliente);

        jMenuEdUsuario.setText("Usuário");
        jMenuEdUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuEdUsuarioMousePressed(evt);
            }
        });
        jMenuEdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEdUsuarioActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuEdUsuario);

        jMenuEdAtendimento.setText("Atendimento");
        jMenuEdAtendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuEdAtendimentoMousePressed(evt);
            }
        });
        jMenuEdAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEdAtendimentoActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuEdAtendimento);

        jMenuEdProblema.setText("Problema");
        jMenuEdProblema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuEdProblemaMousePressed(evt);
            }
        });
        jMenuEditar.add(jMenuEdProblema);

        jMenuBar3.add(jMenuEditar);

        jMenuExibir.setText("Exibir");

        jMenuRelatorio.setText("Relatórios");
        jMenuRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuRelatorioMousePressed(evt);
            }
        });
        jMenuRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRelatorioActionPerformed(evt);
            }
        });
        jMenuExibir.add(jMenuRelatorio);

        jMenuExConsultaAtendimento.setText("Consulta atendimento");
        jMenuExConsultaAtendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuExConsultaAtendimentoMousePressed(evt);
            }
        });
        jMenuExConsultaAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExConsultaAtendimentoActionPerformed(evt);
            }
        });
        jMenuExibir.add(jMenuExConsultaAtendimento);

        jMenuConsultaFuncional.setText("Consulta funcional");
        jMenuConsultaFuncional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuConsultaFuncionalMousePressed(evt);
            }
        });
        jMenuConsultaFuncional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultaFuncionalActionPerformed(evt);
            }
        });
        jMenuExibir.add(jMenuConsultaFuncional);

        jMenuConsultaCliente.setText("Consulta cliente");
        jMenuConsultaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuConsultaClienteMousePressed(evt);
            }
        });
        jMenuConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultaClienteActionPerformed(evt);
            }
        });
        jMenuExibir.add(jMenuConsultaCliente);

        jMenuConsultaUsuario.setText("Consulta usuário");
        jMenuConsultaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuConsultaUsuarioMousePressed(evt);
            }
        });
        jMenuExibir.add(jMenuConsultaUsuario);

        jMenuConsultaProblema.setText("Consulta problema");
        jMenuConsultaProblema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuConsultaProblemaMousePressed(evt);
            }
        });
        jMenuExibir.add(jMenuConsultaProblema);

        jMenuBar3.add(jMenuExibir);

        jMenu3Sair.setText("Sair");
        jMenu3Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3SairMouseClicked(evt);
            }
        });
        jMenuBar3.add(jMenu3Sair);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        new TelaInicio().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        new TelaInicio().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu3ActionPerformed

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
//INICIO DA PARTE DE EDIÇÃO!//
    private void jMenuEdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEdClienteActionPerformed
        if(Sessao.getInstance().getUsuario().getTipo_de_usuario().equals("Gerente")){
            new TelaEditaCliente().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Apenas Gerentes!");
        }
    }//GEN-LAST:event_jMenuEdClienteActionPerformed

    private void jMenuEdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEdUsuarioActionPerformed
        if(Sessao.getInstance().getUsuario().getTipo_de_usuario().equals("Gerente")){
            new TelaEditaUsuario().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Apenas Gerentes!");
        }
    }//GEN-LAST:event_jMenuEdUsuarioActionPerformed

    private void jMenuEdAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEdAtendimentoActionPerformed
        if(Sessao.getInstance().getUsuario().getTipo_de_usuario().equals("Gerente")){
            new TelaAtendimentoEditar().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Apenas Gerentes!");
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

    private void jMenuConsultaFuncionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultaFuncionalActionPerformed
        new Consultar().setVisible(true);
    }//GEN-LAST:event_jMenuConsultaFuncionalActionPerformed

    private void jMenuConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultaClienteActionPerformed
        new TelaConsultaCliente().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuConsultaClienteActionPerformed

    private void jMenu3SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3SairMouseClicked
        // Botão Sair - tela principal
        System.exit(0);
    }//GEN-LAST:event_jMenu3SairMouseClicked

    private void jMenuBar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBar3MouseClicked

    private void jMenuClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuClienteMousePressed
       new TelaCliente().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuClienteMousePressed

    private void jMenuUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuUsuarioMousePressed
       new TelaUser().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuUsuarioMousePressed

    private void jMenuAtendimentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAtendimentoMousePressed
       new TelaAtendimento().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuAtendimentoMousePressed

    private void jMenuProblemaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuProblemaMousePressed
       new TelaProblema().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuProblemaMousePressed

    private void jMenuEdClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEdClienteMousePressed
       if(Sessao.getInstance().getUsuario().getTipo_de_usuario().equals("Gerente")){
            new TelaEditaCliente().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Apenas Gerentes!");
        }
    }//GEN-LAST:event_jMenuEdClienteMousePressed

    private void jMenuEdUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEdUsuarioMousePressed
       if(Sessao.getInstance().getUsuario().getTipo_de_usuario().equals("Gerente")){
            new TelaEditaUsuario().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Apenas Gerentes!");
        }
    }//GEN-LAST:event_jMenuEdUsuarioMousePressed

    private void jMenuEdAtendimentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEdAtendimentoMousePressed
        if(Sessao.getInstance().getUsuario().getTipo_de_usuario().equals("Gerente")){
            new TelaAtendimentoEditar().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Apenas Gerentes!");
        }
    }//GEN-LAST:event_jMenuEdAtendimentoMousePressed

    private void jMenuEdProblemaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEdProblemaMousePressed
       if(Sessao.getInstance().getUsuario().getTipo_de_usuario().equals("Gerente")){
            new TelaEditaProblema().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Apenas Gerentes!");
        }
    }//GEN-LAST:event_jMenuEdProblemaMousePressed
//FIM DOS MENUS DE EDITAR
    private void jMenuRelatorioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuRelatorioMousePressed
       new TelaGerenteRelatorio().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuRelatorioMousePressed

    private void jMenuExConsultaAtendimentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuExConsultaAtendimentoMousePressed
       new TelaAtendimentoConsulta().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuExConsultaAtendimentoMousePressed

    private void jMenuConsultaFuncionalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConsultaFuncionalMousePressed
       new Consultar().setVisible(true);
    }//GEN-LAST:event_jMenuConsultaFuncionalMousePressed

    private void jMenuConsultaClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConsultaClienteMousePressed
       new TelaConsultaCliente().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuConsultaClienteMousePressed

    private void jMenuConsultaUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConsultaUsuarioMousePressed
       new TelaConsultaUsuario().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuConsultaUsuarioMousePressed

    private void jMenuConsultaProblemaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConsultaProblemaMousePressed
       new TelaConsultaProblema().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuConsultaProblemaMousePressed

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
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu3Sair;
    private javax.swing.JMenuItem jMenuAtendimento;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuCliente;
    private javax.swing.JMenuItem jMenuConsultaCliente;
    private javax.swing.JMenuItem jMenuConsultaFuncional;
    private javax.swing.JMenuItem jMenuConsultaProblema;
    private javax.swing.JMenuItem jMenuConsultaUsuario;
    private javax.swing.JMenuItem jMenuEdAtendimento;
    private javax.swing.JMenuItem jMenuEdCliente;
    private javax.swing.JMenuItem jMenuEdProblema;
    private javax.swing.JMenuItem jMenuEdUsuario;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenuItem jMenuExConsultaAtendimento;
    private javax.swing.JMenu jMenuExibir;
    private javax.swing.JMenuItem jMenuProblema;
    private javax.swing.JMenuItem jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenuItem jMenuUsuario;
    // End of variables declaration//GEN-END:variables
}
