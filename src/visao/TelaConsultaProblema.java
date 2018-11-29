/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;
import dao.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Pandorum
 */
public class TelaConsultaProblema extends javax.swing.JFrame {

    /**
     * Creates new form TelaConsultaProblema
     */
    public TelaConsultaProblema() {
        initComponents();
        listaTodosOsProblemas();
    }
    
    public void listaTodosOsProblemas(){
        Problema todosOsProblemas = new Problema(null, null);
        todosOsProblemas = todosOsProblemas.listarProblemas(todosOsProblemas);
        
        int tamanho = todosOsProblemas.lista_id_problema.size();
        
        javax.swing.table.DefaultTableModel dtm2 = (javax.swing.table.DefaultTableModel)Tabela1.getModel();
        dtm2.setNumRows(0);
        //ISSO TIRA AS LINHAS DA TABELA
        int x=0;
        
        for(int i = 0; i < tamanho; i++){
            dtm2.addRow(new Object[]{" "," ", " "});// cada " " para cada coluna
            Tabela1.setValueAt(String.valueOf(todosOsProblemas.lista_id_problema.get(i)),x,0);
            Tabela1.setValueAt(todosOsProblemas.lista_nome_problema.get(i),x,1);
            Tabela1.setValueAt(todosOsProblemas.lista_descricao_problema.get(i),x,2);
            x++;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();
        jMenuCliente = new javax.swing.JMenuItem();
        jMenuUsuario = new javax.swing.JMenuItem();
        jMenuAtendimento = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuProblema = new javax.swing.JMenu();
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
        setTitle("Todos os problemas cadastrados");

        Tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabela1);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setText("Inicio");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu1MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenuSair.setText("Cadastros");

        jMenuCliente.setText("Cliente");
        jMenuCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuClienteMousePressed(evt);
            }
        });
        jMenuSair.add(jMenuCliente);

        jMenuUsuario.setText("Usuário");
        jMenuUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuUsuarioMousePressed(evt);
            }
        });
        jMenuSair.add(jMenuUsuario);

        jMenuAtendimento.setText("Atendimento");
        jMenuAtendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuAtendimentoMousePressed(evt);
            }
        });
        jMenuSair.add(jMenuAtendimento);

        jMenuItem1.setText("Problema");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenuSair.add(jMenuItem1);

        jMenuBar1.add(jMenuSair);

        jMenuProblema.setText("Editar");

        jMenuEdCliente.setText("Cliente");
        jMenuEdCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuEdClienteMousePressed(evt);
            }
        });
        jMenuProblema.add(jMenuEdCliente);

        jMenuEdUsuario.setText("Usuário");
        jMenuEdUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuEdUsuarioMousePressed(evt);
            }
        });
        jMenuProblema.add(jMenuEdUsuario);

        jMenuEdAtendimento.setText("Atendimento");
        jMenuEdAtendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuEdAtendimentoMousePressed(evt);
            }
        });
        jMenuProblema.add(jMenuEdAtendimento);

        jMenuEdProblema.setText("Problema");
        jMenuEdProblema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuEdProblemaMousePressed(evt);
            }
        });
        jMenuProblema.add(jMenuEdProblema);

        jMenuBar1.add(jMenuProblema);

        jMenuExibir.setText("Exibir");

        jMenuRelatorio.setText("Relatórios");
        jMenuRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuRelatorioMousePressed(evt);
            }
        });
        jMenuExibir.add(jMenuRelatorio);

        jMenuExConsultaAtendimento.setText("Consulta atendimento");
        jMenuExConsultaAtendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuExConsultaAtendimentoMousePressed(evt);
            }
        });
        jMenuExibir.add(jMenuExConsultaAtendimento);

        jMenuConsultaFuncional.setText("Consulta funcional");
        jMenuConsultaFuncional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuConsultaFuncionalMousePressed(evt);
            }
        });
        jMenuExibir.add(jMenuConsultaFuncional);

        jMenuConsultaCliente.setText("Consulta cliente");
        jMenuConsultaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuConsultaClienteMousePressed(evt);
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed
       new TelaInicio().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenu1MousePressed

    private void jMenuClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuClienteMousePressed
        String tipodeusuario = Sessao.getInstance().getUsuario().getTipo_de_usuario();
        if(tipodeusuario.equals("Gerente") || tipodeusuario.equals("Atendente")){
           new TelaCliente().setVisible(true);
           dispose();
        } else {
           JOptionPane.showMessageDialog(null, "Apenas Gerentes e Atendentes!");
        }
    }//GEN-LAST:event_jMenuClienteMousePressed

    private void jMenuUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuUsuarioMousePressed
        String tipodeusuario = Sessao.getInstance().getUsuario().getTipo_de_usuario();
        if(tipodeusuario.equals("Gerente") || tipodeusuario.equals("Atendente")){
           new TelaUser().setVisible(true);
           dispose();
        } else {
           JOptionPane.showMessageDialog(null, "Apenas Gerentes e Atendentes!");
        }
    }//GEN-LAST:event_jMenuUsuarioMousePressed

    private void jMenuAtendimentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAtendimentoMousePressed
           String tipodeusuario = Sessao.getInstance().getUsuario().getTipo_de_usuario();
        if(tipodeusuario.equals("Gerente") || tipodeusuario.equals("Atendente")){
           new TelaAtendimento().setVisible(true);
           dispose();
        } else {
           JOptionPane.showMessageDialog(null, "Apenas Gerentes e Atendentes!");
        }
    }//GEN-LAST:event_jMenuAtendimentoMousePressed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
         String tipodeusuario = Sessao.getInstance().getUsuario().getTipo_de_usuario();
        if(tipodeusuario.equals("Gerente") || tipodeusuario.equals("Atendente")){
           new TelaProblema().setVisible(true);
           dispose();
        } else {
           JOptionPane.showMessageDialog(null, "Apenas Gerentes e Atendentes!");
        }
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void jMenuEdClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEdClienteMousePressed
    String tipodeusuario = Sessao.getInstance().getUsuario().getTipo_de_usuario();
    if(tipodeusuario.equals("Gerente") || tipodeusuario.equals("Tecnico")){
       new TelaEditaCliente().setVisible(true);
       dispose();
    } else {
       JOptionPane.showMessageDialog(null, "Apenas Gerentes e Tecnicos!");
    }
    }//GEN-LAST:event_jMenuEdClienteMousePressed

    private void jMenuEdUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEdUsuarioMousePressed
        String tipodeusuario = Sessao.getInstance().getUsuario().getTipo_de_usuario();
        if(tipodeusuario.equals("Gerente") || tipodeusuario.equals("Tecnico")){
           new TelaEditaUsuario().setVisible(true);
           dispose();
        } else {
           JOptionPane.showMessageDialog(null, "Apenas Gerentes e Tecnicos!");
        }
    }//GEN-LAST:event_jMenuEdUsuarioMousePressed

    private void jMenuEdAtendimentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEdAtendimentoMousePressed
           String tipodeusuario = Sessao.getInstance().getUsuario().getTipo_de_usuario();
        if(tipodeusuario.equals("Gerente") || tipodeusuario.equals("Tecnico")){
           new TelaAtendimentoEditar().setVisible(true);
           dispose();
        } else {
           JOptionPane.showMessageDialog(null, "Apenas Gerentes e Tecnicos!");
        }
    }//GEN-LAST:event_jMenuEdAtendimentoMousePressed

    private void jMenuEdProblemaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEdProblemaMousePressed
         String tipodeusuario = Sessao.getInstance().getUsuario().getTipo_de_usuario();
        if(tipodeusuario.equals("Gerente") || tipodeusuario.equals("Tecnico")){
           new TelaEditaProblema().setVisible(true);
           dispose();
        } else {
           JOptionPane.showMessageDialog(null, "Apenas Gerentes e tecnicos!");
        }
    }//GEN-LAST:event_jMenuEdProblemaMousePressed

    private void jMenuRelatorioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuRelatorioMousePressed
        String tipodeusuario = Sessao.getInstance().getUsuario().getTipo_de_usuario();
        if(tipodeusuario.equals("Gerente")){
           new TelaGerenteRelatorio().setVisible(true);
           dispose();
        } else {
           JOptionPane.showMessageDialog(null, "Apenas Gerentes!");
        }
    }//GEN-LAST:event_jMenuRelatorioMousePressed

    private void jMenuExConsultaAtendimentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuExConsultaAtendimentoMousePressed
        String tipodeusuario = Sessao.getInstance().getUsuario().getTipo_de_usuario();
        if(tipodeusuario.equals("Gerente") || tipodeusuario.equals("Tecnico")){
           new TelaAtendimentoConsulta().setVisible(true);
           dispose();
        } else {
           JOptionPane.showMessageDialog(null, "Apenas Gerentes e Tecnicos!");
        }
    }//GEN-LAST:event_jMenuExConsultaAtendimentoMousePressed

    private void jMenuConsultaFuncionalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConsultaFuncionalMousePressed
       new Consultar().setVisible(true);
    }//GEN-LAST:event_jMenuConsultaFuncionalMousePressed

    private void jMenuConsultaClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConsultaClienteMousePressed
        String tipodeusuario = Sessao.getInstance().getUsuario().getTipo_de_usuario();
        if(tipodeusuario.equals("Gerente") || tipodeusuario.equals("Tecnico")){
           new TelaConsultaCliente().setVisible(true);
           dispose();
        } else {
           JOptionPane.showMessageDialog(null, "Apenas Gerentes e Tecnicos!");
        }
    }//GEN-LAST:event_jMenuConsultaClienteMousePressed

    private void jMenuConsultaProblemaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConsultaProblemaMousePressed
       new TelaConsultaProblema().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuConsultaProblemaMousePressed

    private void jMenu3SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3SairMouseClicked
       System.exit(0);
    }//GEN-LAST:event_jMenu3SairMouseClicked

    private void jMenuConsultaUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConsultaUsuarioMousePressed
        String tipodeusuario = Sessao.getInstance().getUsuario().getTipo_de_usuario();
        if(tipodeusuario.equals("Gerente") || tipodeusuario.equals("Tecnico")){
            new TelaConsultaUsuario().setVisible(true);
            dispose();
        } else {
           JOptionPane.showMessageDialog(null, "Apenas Gerentes e Tecnicos!");
        }
    }//GEN-LAST:event_jMenuConsultaUsuarioMousePressed

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
            java.util.logging.Logger.getLogger(TelaConsultaProblema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaProblema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaProblema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaProblema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaProblema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3Sair;
    private javax.swing.JMenuItem jMenuAtendimento;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCliente;
    private javax.swing.JMenuItem jMenuConsultaCliente;
    private javax.swing.JMenuItem jMenuConsultaFuncional;
    private javax.swing.JMenuItem jMenuConsultaProblema;
    private javax.swing.JMenuItem jMenuConsultaUsuario;
    private javax.swing.JMenuItem jMenuEdAtendimento;
    private javax.swing.JMenuItem jMenuEdCliente;
    private javax.swing.JMenuItem jMenuEdProblema;
    private javax.swing.JMenuItem jMenuEdUsuario;
    private javax.swing.JMenuItem jMenuExConsultaAtendimento;
    private javax.swing.JMenu jMenuExibir;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuProblema;
    private javax.swing.JMenuItem jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenuItem jMenuUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
