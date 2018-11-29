/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import dao.Cliente;
import dao.*;
import javax.swing.JOptionPane;

/**
 *
 * @author XL
 */
public class TelaConsultaUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaConsultaCliente
     */
    public TelaConsultaUsuario() {
        initComponents();
        listarTodosQuandoAbrir();
    }

    public void listarTodosQuandoAbrir(){
        Usuario buscarUsuario = new Usuario(null, null, null, null, null, null, null, null, null, null, null, null, null, "0", "0", "0", "0");
        buscarUsuario = buscarUsuario.listarOsUsuarios(buscarUsuario, 0);
        
        int tamanho = buscarUsuario.listaFuncional.size();
        
        javax.swing.table.DefaultTableModel dtm2 = (javax.swing.table.DefaultTableModel)Tabela1.getModel();
        dtm2.setNumRows(0);
        //ISSO TIRA AS LINHAS DA TABELA
        int x=0;
        
        for(int i = 0; i < tamanho; i++){
            dtm2.addRow(new Object[]{" "," "," "," "," "," "," "});// cada " " para cada coluna
            Tabela1.setValueAt(String.valueOf(buscarUsuario.listaFuncional.get(i)),x,0);
            Tabela1.setValueAt(buscarUsuario.listaNome.get(i),x,1);
            Tabela1.setValueAt(buscarUsuario.listaCpf.get(i),x,2);
            Tabela1.setValueAt(buscarUsuario.listaTelefone.get(i),x,3);
            Tabela1.setValueAt(buscarUsuario.listaCargo.get(i),x,4);
            Tabela1.setValueAt(buscarUsuario.listaSenha.get(i),x,5);
            Tabela1.setValueAt(buscarUsuario.listaEmail.get(i),x,6);
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

        jPanel1 = new javax.swing.JPanel();
        nome = new javax.swing.JTextField();
        lupaCpf = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cpf = new javax.swing.JFormattedTextField();
        lupaNome = new javax.swing.JLabel();
        botaoListarTodos = new javax.swing.JButton();
        funcional = new javax.swing.JTextField();
        lupaFuncional = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
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
        jMenuConsultaAtendimento = new javax.swing.JMenuItem();
        jMenuConsultaFuncional = new javax.swing.JMenuItem();
        jMenuConsultaCliente = new javax.swing.JMenuItem();
        jMenuConsultaUsuario = new javax.swing.JMenuItem();
        jMenuConsultaProblema = new javax.swing.JMenuItem();
        jMenu3Sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta de clientes");

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        lupaCpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-pesquisar-32.png"))); // NOI18N
        lupaCpf.setText("jLabel1");
        lupaCpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lupaCpfMouseClicked(evt);
            }
        });

        Tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Funcional", "Nome", "Cpf", "Telefone", "Cargo", "Senha", "Email"
            }
        ));
        jScrollPane1.setViewportView(Tabela1);

        jLabel2.setText("Nome");

        jLabel3.setText("CPF");

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lupaNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-pesquisar-32.png"))); // NOI18N
        lupaNome.setText("jLabel1");
        lupaNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lupaNomeMouseClicked(evt);
            }
        });

        botaoListarTodos.setText("Listar Todos");
        botaoListarTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoListarTodosMouseClicked(evt);
            }
        });

        lupaFuncional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-pesquisar-32.png"))); // NOI18N
        lupaFuncional.setText("jLabel1");
        lupaFuncional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lupaFuncionalMouseClicked(evt);
            }
        });

        jLabel4.setText("Funcional");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1086, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(296, 296, 296)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lupaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lupaCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(funcional, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(lupaFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(botaoListarTodos))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lupaNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lupaCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(funcional, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lupaFuncional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoListarTodos)
                    .addComponent(cpf))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

        jMenuProblema.setText("Problema");
        jMenuProblema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuProblemaMousePressed(evt);
            }
        });
        jMenuSair.add(jMenuProblema);

        jMenuBar1.add(jMenuSair);

        jMenuEditar.setText("Editar");

        jMenuEdCliente.setText("Cliente");
        jMenuEdCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuEdClienteMousePressed(evt);
            }
        });
        jMenuEditar.add(jMenuEdCliente);

        jMenuEdUsuario.setText("Usuário");
        jMenuEdUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuEdUsuarioMousePressed(evt);
            }
        });
        jMenuEditar.add(jMenuEdUsuario);

        jMenuEdAtendimento.setText("Atendimento");
        jMenuEdAtendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuEdAtendimentoMousePressed(evt);
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

        jMenuBar1.add(jMenuEditar);

        jMenuExibir.setText("Exibir");

        jMenuRelatorio.setText("Relatórios");
        jMenuRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuRelatorioMousePressed(evt);
            }
        });
        jMenuExibir.add(jMenuRelatorio);

        jMenuConsultaAtendimento.setText("Consulta atendimento");
        jMenuConsultaAtendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuConsultaAtendimentoMousePressed(evt);
            }
        });
        jMenuExibir.add(jMenuConsultaAtendimento);

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu3SairMousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu3Sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void lupaCpfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lupaCpfMouseClicked
        Usuario buscarUsuario = new Usuario(null, null, null, null, null, null, null, null, null, null, null, null, null, "0", "0", "0", "0");
        buscarUsuario.setCpf(cpf.getText());
        buscarUsuario = buscarUsuario.listarOsUsuarios(buscarUsuario, 3);
        
        int tamanho = buscarUsuario.listaFuncional.size();
        
        javax.swing.table.DefaultTableModel dtm2 = (javax.swing.table.DefaultTableModel)Tabela1.getModel();
        dtm2.setNumRows(0);
        //ISSO TIRA AS LINHAS DA TABELA
        int x=0;
        
        for(int i = 0; i < tamanho; i++){
            dtm2.addRow(new Object[]{" "," "," "," "," "," "," "});// cada " " para cada coluna
            Tabela1.setValueAt(String.valueOf(buscarUsuario.listaFuncional.get(i)),x,0);
            Tabela1.setValueAt(buscarUsuario.listaNome.get(i),x,1);
            Tabela1.setValueAt(buscarUsuario.listaCpf.get(i),x,2);
            Tabela1.setValueAt(buscarUsuario.listaTelefone.get(i),x,3);
            Tabela1.setValueAt(buscarUsuario.listaCargo.get(i),x,4);
            Tabela1.setValueAt(buscarUsuario.listaSenha.get(i),x,5);
            Tabela1.setValueAt(buscarUsuario.listaEmail.get(i),x,6);
            
            x++;
        }
    }//GEN-LAST:event_lupaCpfMouseClicked

    private void botaoListarTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoListarTodosMouseClicked
        listarTodosQuandoAbrir();
    }//GEN-LAST:event_botaoListarTodosMouseClicked

    private void lupaNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lupaNomeMouseClicked
        Usuario buscarUsuario = new Usuario(null, null, null, null, null, null, null, null, null, null, null, null, null, "0", "0", "0", "0");
        buscarUsuario.setNome(nome.getText());
        buscarUsuario = buscarUsuario.listarOsUsuarios(buscarUsuario, 2);
        
        int tamanho = buscarUsuario.listaFuncional.size();
        
        javax.swing.table.DefaultTableModel dtm2 = (javax.swing.table.DefaultTableModel)Tabela1.getModel();
        dtm2.setNumRows(0);
        //ISSO TIRA AS LINHAS DA TABELA
        int x=0;
        
        for(int i = 0; i < tamanho; i++){
            dtm2.addRow(new Object[]{" "," "," "," "," "," "," "});// cada " " para cada coluna
            Tabela1.setValueAt(String.valueOf(buscarUsuario.listaFuncional.get(i)),x,0);
            Tabela1.setValueAt(buscarUsuario.listaNome.get(i),x,1);
            Tabela1.setValueAt(buscarUsuario.listaCpf.get(i),x,2);
            Tabela1.setValueAt(buscarUsuario.listaTelefone.get(i),x,3);
            Tabela1.setValueAt(buscarUsuario.listaCargo.get(i),x,4);
            Tabela1.setValueAt(buscarUsuario.listaSenha.get(i),x,5);
            Tabela1.setValueAt(buscarUsuario.listaEmail.get(i),x,6);
            x++;
        }
    }//GEN-LAST:event_lupaNomeMouseClicked

    private void lupaFuncionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lupaFuncionalMouseClicked
        Usuario buscarUsuario = new Usuario(null, null, null, null, null, null, null, null, null, null, null, null, null, "0", "0", "0", "0");
        buscarUsuario.setFuncional(Integer.parseInt(funcional.getText()));
        buscarUsuario = buscarUsuario.listarOsUsuarios(buscarUsuario, 1);
        
        int tamanho = buscarUsuario.listaFuncional.size();
        
        javax.swing.table.DefaultTableModel dtm2 = (javax.swing.table.DefaultTableModel)Tabela1.getModel();
        dtm2.setNumRows(0);
        //ISSO TIRA AS LINHAS DA TABELA
        int x=0;
        
        for(int i = 0; i < tamanho; i++){
            dtm2.addRow(new Object[]{" "," "," "," "," "," "," "});// cada " " para cada coluna
            Tabela1.setValueAt(String.valueOf(buscarUsuario.listaFuncional.get(i)),x,0);
            Tabela1.setValueAt(buscarUsuario.listaNome.get(i),x,1);
            Tabela1.setValueAt(buscarUsuario.listaCpf.get(i),x,2);
            Tabela1.setValueAt(buscarUsuario.listaTelefone.get(i),x,3);
            Tabela1.setValueAt(buscarUsuario.listaCargo.get(i),x,4);
            Tabela1.setValueAt(buscarUsuario.listaSenha.get(i),x,5);
            Tabela1.setValueAt(buscarUsuario.listaEmail.get(i),x,6);
            x++;
        }
    }//GEN-LAST:event_lupaFuncionalMouseClicked

    private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed
       new TelaInicio().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenu1MousePressed

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
       new TelaEditaCliente().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuEdClienteMousePressed

    private void jMenuEdUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEdUsuarioMousePressed
       new TelaEditaUsuario().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuEdUsuarioMousePressed

    private void jMenuEdAtendimentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEdAtendimentoMousePressed
       new TelaAtendimentoEditar().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuEdAtendimentoMousePressed

    private void jMenuEdProblemaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEdProblemaMousePressed
       new TelaEditaProblema().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuEdProblemaMousePressed

    private void jMenuRelatorioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuRelatorioMousePressed
       new TelaGerenteRelatorio().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuRelatorioMousePressed

    private void jMenuConsultaAtendimentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConsultaAtendimentoMousePressed
       new TelaAtendimentoConsulta().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuConsultaAtendimentoMousePressed

    private void jMenuConsultaFuncionalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConsultaFuncionalMousePressed
       new Consultar().setVisible(true);
    }//GEN-LAST:event_jMenuConsultaFuncionalMousePressed

    private void jMenuConsultaClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConsultaClienteMousePressed
       new TelaConsultaCliente().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuConsultaClienteMousePressed

    private void jMenuConsultaProblemaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConsultaProblemaMousePressed
       new TelaConsultaProblema().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuConsultaProblemaMousePressed

    private void jMenu3SairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3SairMousePressed
       System.exit(0);
    }//GEN-LAST:event_jMenu3SairMousePressed

    private void jMenuConsultaUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConsultaUsuarioMousePressed
       new TelaConsultaUsuario().setVisible(true);
       dispose();
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
            java.util.logging.Logger.getLogger(TelaConsultaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela1;
    private javax.swing.JButton botaoListarTodos;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JTextField funcional;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3Sair;
    private javax.swing.JMenuItem jMenuAtendimento;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCliente;
    private javax.swing.JMenuItem jMenuConsultaAtendimento;
    private javax.swing.JMenuItem jMenuConsultaCliente;
    private javax.swing.JMenuItem jMenuConsultaFuncional;
    private javax.swing.JMenuItem jMenuConsultaProblema;
    private javax.swing.JMenuItem jMenuConsultaUsuario;
    private javax.swing.JMenuItem jMenuEdAtendimento;
    private javax.swing.JMenuItem jMenuEdCliente;
    private javax.swing.JMenuItem jMenuEdProblema;
    private javax.swing.JMenuItem jMenuEdUsuario;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenu jMenuExibir;
    private javax.swing.JMenuItem jMenuProblema;
    private javax.swing.JMenuItem jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenuItem jMenuUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lupaCpf;
    private javax.swing.JLabel lupaFuncional;
    private javax.swing.JLabel lupaNome;
    private javax.swing.JTextField nome;
    // End of variables declaration//GEN-END:variables
}
