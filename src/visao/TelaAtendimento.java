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
 * @author XL
 */
public class TelaAtendimento extends javax.swing.JFrame {
    
    private int id_atendimento;                                             
    private Atendimento buscaAtendimento;
    private String[] nomedosproblemas;
    private String erroComboBoxProblema = "Você precisa cadastrar ao menos um problema!";
    private Problema problemas;
    private int funcional;
    /**
     * Creates new form TelaAtendimento
     */
    public TelaAtendimento() {
        initComponents();
        listarTodosOsCLientesQuandoAbrir();
        listarTodosOsProblemas();
        funcionalText.setEditable(false);
        this.funcional = Sessao.getInstance().getUsuario().getFuncional();
        funcionalText.setText(String.valueOf(Sessao.getInstance().getUsuario().getNomeDeUsuario()));
    }
    
    public void listarTodosOsProblemas(){
        this.problemas = new Problema(null, null);
        this.problemas = this.problemas.listarProblemas(this.problemas);
        if(this.problemas != null){
            this.nomedosproblemas = this.problemas.lista_nome_problema.toArray(new String[this.problemas.lista_id_problema.size()]);
            jComboBoxProblema.setModel(new javax.swing.DefaultComboBoxModel<>(this.nomedosproblemas));
        } else {
            jComboBoxProblema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {erroComboBoxProblema}));
        }
    }

    public void listarTodosOsCLientesQuandoAbrir(){
        Cliente buscarCliente = new Cliente(null,null,null,null,null,null,null,null,"0","0","0");
        buscarCliente = buscarCliente.listarOsClientes(buscarCliente, 0);
        
        int tamanho = buscarCliente.listaCnpj.size();
        
        javax.swing.table.DefaultTableModel dtm2 = (javax.swing.table.DefaultTableModel)Tabela1.getModel();
        dtm2.setNumRows(0);
        //ISSO TIRA AS LINHAS DA TABELA
        int x=0;
        
        for(int i = 0; i < tamanho; i++){
            dtm2.addRow(new Object[]{" "," "," "," "," "," "});// cada " " para cada coluna
            Tabela1.setValueAt(String.valueOf(buscarCliente.listaCnpj.get(i)),x,0);
            Tabela1.setValueAt(buscarCliente.listaRazaoSocial.get(i),x,1);
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

        idAtendimento = new javax.swing.JLabel();
        idAtendimentoTextField = new javax.swing.JTextField();
        clienteLabelGerCon = new javax.swing.JLabel();
        clienteTextFieldGerCon = new javax.swing.JFormattedTextField();
        userLabelGerCon = new javax.swing.JLabel();
        funcionalText = new javax.swing.JTextField();
        telLabelGerCon = new javax.swing.JLabel();
        telTextFieldGerCon = new javax.swing.JTextField();
        emailLabelGerCon = new javax.swing.JLabel();
        emailTextFieldGerCon = new javax.swing.JTextField();
        respLabelGerCon = new javax.swing.JLabel();
        respTextFieldGerCon = new javax.swing.JTextField();
        assuntoLabelGerCon = new javax.swing.JLabel();
        assuntoTextFieldGerCon = new javax.swing.JTextField();
        lupaLabelGerCon1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriTextFieldGerCon = new javax.swing.JTextArea();
        assuntoLabelGerCon1 = new javax.swing.JLabel();
        saveButtonGerCon = new javax.swing.JButton();
        jButtonGerCon = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBoxProblema = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
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
        setAlwaysOnTop(true);
        setFocusTraversalPolicyProvider(true);
        setPreferredSize(new java.awt.Dimension(1050, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 550));
        getContentPane().setLayout(null);

        idAtendimento.setText("Id do atendimento");
        getContentPane().add(idAtendimento);
        idAtendimento.setBounds(20, 50, 90, 20);

        idAtendimentoTextField.setEditable(false);
        idAtendimentoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idAtendimentoTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(idAtendimentoTextField);
        idAtendimentoTextField.setBounds(20, 70, 120, 30);

        clienteLabelGerCon.setText("CNPJ Cliente");
        getContentPane().add(clienteLabelGerCon);
        clienteLabelGerCon.setBounds(160, 50, 90, 24);

        try {
            clienteTextFieldGerCon.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(clienteTextFieldGerCon);
        clienteTextFieldGerCon.setBounds(160, 70, 300, 30);

        userLabelGerCon.setText("Usuário");
        getContentPane().add(userLabelGerCon);
        userLabelGerCon.setBounds(510, 50, 70, 20);

        funcionalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionalTextActionPerformed(evt);
            }
        });
        getContentPane().add(funcionalText);
        funcionalText.setBounds(510, 70, 130, 30);

        telLabelGerCon.setText("Telefone");
        getContentPane().add(telLabelGerCon);
        telLabelGerCon.setBounds(20, 120, 80, 14);
        getContentPane().add(telTextFieldGerCon);
        telTextFieldGerCon.setBounds(20, 140, 120, 30);

        emailLabelGerCon.setText("Email");
        getContentPane().add(emailLabelGerCon);
        emailLabelGerCon.setBounds(160, 120, 200, 14);
        getContentPane().add(emailTextFieldGerCon);
        emailTextFieldGerCon.setBounds(160, 140, 300, 30);

        respLabelGerCon.setText("Responsável");
        getContentPane().add(respLabelGerCon);
        respLabelGerCon.setBounds(510, 120, 80, 14);
        getContentPane().add(respTextFieldGerCon);
        respTextFieldGerCon.setBounds(510, 140, 130, 30);

        assuntoLabelGerCon.setText("Descrição");
        getContentPane().add(assuntoLabelGerCon);
        assuntoLabelGerCon.setBounds(20, 280, 70, 20);
        getContentPane().add(assuntoTextFieldGerCon);
        assuntoTextFieldGerCon.setBounds(20, 240, 240, 30);

        lupaLabelGerCon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-pesquisar-32.png"))); // NOI18N
        lupaLabelGerCon1.setText("jLabel5");
        lupaLabelGerCon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lupaLabelGerCon1MouseClicked(evt);
            }
        });
        getContentPane().add(lupaLabelGerCon1);
        lupaLabelGerCon1.setBounds(470, 70, 30, 30);

        descriTextFieldGerCon.setColumns(20);
        descriTextFieldGerCon.setRows(5);
        jScrollPane1.setViewportView(descriTextFieldGerCon);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 300, 400, 140);

        assuntoLabelGerCon1.setText("Assunto");
        getContentPane().add(assuntoLabelGerCon1);
        assuntoLabelGerCon1.setBounds(20, 210, 70, 20);

        saveButtonGerCon.setText("Salvar");
        saveButtonGerCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonGerConMouseClicked(evt);
            }
        });
        getContentPane().add(saveButtonGerCon);
        saveButtonGerCon.setBounds(450, 350, 80, 23);

        jButtonGerCon.setText("Limpar");
        jButtonGerCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGerConMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonGerCon);
        jButtonGerCon.setBounds(540, 350, 80, 23);

        Tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CNPJ", "Razão"
            }
        ));
        jScrollPane2.setViewportView(Tabela1);
        if (Tabela1.getColumnModel().getColumnCount() > 0) {
            Tabela1.getColumnModel().getColumn(0).setPreferredWidth(70);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(650, 50, 360, 402);

        jButton1.setText("Buscar por Razão Social");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(650, 20, 190, 23);

        jComboBoxProblema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inserir produto", "Consultar produto", "Cadastro de novos produto", "Outros" }));
        getContentPane().add(jComboBoxProblema);
        jComboBoxProblema.setBounds(300, 240, 200, 30);

        jLabel1.setText("Tipo de problema");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 204, 120, 30);

        jMenuBar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuBar2MouseClicked(evt);
            }
        });

        jMenu2.setText("Inicio");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu2);

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

        jMenuBar2.add(jMenuSair);

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

        jMenuBar2.add(jMenuEditar);

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

        jMenuBar2.add(jMenuExibir);

        jMenu3Sair.setText("Sair");
        jMenu3Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3SairMouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu3Sair);

        setJMenuBar(jMenuBar2);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void funcionalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcionalTextActionPerformed

    private void idAtendimentoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idAtendimentoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idAtendimentoTextFieldActionPerformed

    private void saveButtonGerConMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonGerConMouseClicked
            
        int erro = 0;
        
        String tipo_de_problema = jComboBoxProblema.getSelectedItem().toString();
        if(tipo_de_problema.equals(erroComboBoxProblema)){
            JOptionPane.showMessageDialog(null, "Você deve ao menos cadastrar um tipo de problema!");
            erro++;
        }

        for(int x = 0; x < this.problemas.lista_id_problema.size(); x++){
            if(this.problemas.lista_nome_problema.get(x).equals(tipo_de_problema)){
                tipo_de_problema = this.problemas.lista_id_problema.get(x);
            }
        }
        
        
        String assunto = assuntoTextFieldGerCon.getText();
        String descricao = descriTextFieldGerCon.getText();
        String email = emailTextFieldGerCon.getText();
        String responsavel = respTextFieldGerCon.getText();
        String telefone = telTextFieldGerCon.getText(); 
        String cnpj = clienteTextFieldGerCon.getText();  
        try{
            int telefoneInteger = Integer.parseInt(telefone);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ERRO, o telefone possui letras!");
            erro++;
        }   
        if(telefone.length() > 8){
            JOptionPane.showMessageDialog(null, "ERRO, o telefone excede o limite de caracteres");
            erro++;
        }
        if(erro == 0){
            Atendimento salvar = new Atendimento(assunto, descricao, email, responsavel, telefone, cnpj);
            salvar.setTipo_de_problema(Integer.parseInt(tipo_de_problema));
            salvar.setFuncional(this.funcional);
            if(salvar.inserirAtendimento() == true){
                JOptionPane.showMessageDialog(null, "Sucesso ao inserir atendimento");
                idAtendimentoTextField.setText(salvar.getIdAtendimento());
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir atendimento");
                idAtendimentoTextField.setText("ERRO!");
            }
        }
    }//GEN-LAST:event_saveButtonGerConMouseClicked

    private void lupaLabelGerCon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lupaLabelGerCon1MouseClicked
        Cliente buscarCliente = new Cliente(null,null,null,null,null,null,null,null,"0","0","0");
        buscarCliente.setCnpj(clienteTextFieldGerCon.getText());
        buscarCliente = buscarCliente.listarOsClientes(buscarCliente, 1);
        
        int tamanho = buscarCliente.listaCnpj.size();
        
        javax.swing.table.DefaultTableModel dtm2 = (javax.swing.table.DefaultTableModel)Tabela1.getModel();
        dtm2.setNumRows(0);
        //ISSO TIRA AS LINHAS DA TABELA
        int x=0;
        
        for(int i = 0; i < tamanho; i++){
            dtm2.addRow(new Object[]{" "," "," "," "," "," "});// cada " " para cada coluna
            Tabela1.setValueAt(String.valueOf(buscarCliente.listaCnpj.get(i)),x,0);
            Tabela1.setValueAt(buscarCliente.listaRazaoSocial.get(i),x,1);
            x++;
        }
        
        
        
    }//GEN-LAST:event_lupaLabelGerCon1MouseClicked

    private void jButtonGerConMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGerConMouseClicked
        assuntoTextFieldGerCon.setText("");
        descriTextFieldGerCon.setText("");
        emailTextFieldGerCon.setText("");
        respTextFieldGerCon.setText("");
        telTextFieldGerCon.setText(""); 
        clienteTextFieldGerCon.setText("");  
    }//GEN-LAST:event_jButtonGerConMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Cliente buscarCliente = new Cliente(null,null,null,null,null,null,null,null,"0","0","0");
        buscarCliente.setRazaoSocial(JOptionPane.showInputDialog("Digite a razão social desejada"));
        buscarCliente = buscarCliente.listarOsClientes(buscarCliente, 2);
        
        int tamanho = buscarCliente.listaCnpj.size();
        
        javax.swing.table.DefaultTableModel dtm2 = (javax.swing.table.DefaultTableModel)Tabela1.getModel();
        dtm2.setNumRows(0);
        //ISSO TIRA AS LINHAS DA TABELA
        int x=0;
        
        for(int i = 0; i < tamanho; i++){
            dtm2.addRow(new Object[]{" "," "," "," "," "," "});// cada " " para cada coluna
            Tabela1.setValueAt(String.valueOf(buscarCliente.listaCnpj.get(i)),x,0);
            Tabela1.setValueAt(buscarCliente.listaRazaoSocial.get(i),x,1);
            x++;
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        new TelaInicio().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        new TelaInicio().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu3SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3SairMouseClicked
        // Botão Sair - tela principal
        System.exit(0);
    }//GEN-LAST:event_jMenu3SairMouseClicked

    private void jMenuBar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBar2MouseClicked

    private void jMenuProblemaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuProblemaMousePressed
         new TelaProblema().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuProblemaMousePressed

    private void jMenuEdProblemaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEdProblemaMousePressed
        String tipodeusuario = Sessao.getInstance().getUsuario().getTipo_de_usuario();
        if(tipodeusuario.equals("Gerente") || tipodeusuario.equals("Tecnico")){
           new TelaEditaProblema().setVisible(true);
           dispose();
        } else {
           JOptionPane.showMessageDialog(null, "Apenas Gerentes e tecnicos!");
        }
    }//GEN-LAST:event_jMenuEdProblemaMousePressed

    private void jMenuConsultaProblemaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConsultaProblemaMousePressed
       new TelaConsultaProblema().setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuConsultaProblemaMousePressed

    private void jMenuConsultaUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConsultaUsuarioMousePressed
        String tipodeusuario = Sessao.getInstance().getUsuario().getTipo_de_usuario();
        if(tipodeusuario.equals("Gerente") || tipodeusuario.equals("Tecnico")){
            new TelaConsultaUsuario().setVisible(true);
            dispose();
        } else {
           JOptionPane.showMessageDialog(null, "Apenas Gerentes e Tecnicos!");
        }
    }//GEN-LAST:event_jMenuConsultaUsuarioMousePressed

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
            java.util.logging.Logger.getLogger(TelaAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAtendimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela1;
    private javax.swing.JLabel assuntoLabelGerCon;
    private javax.swing.JLabel assuntoLabelGerCon1;
    private javax.swing.JTextField assuntoTextFieldGerCon;
    private javax.swing.JLabel clienteLabelGerCon;
    private javax.swing.JFormattedTextField clienteTextFieldGerCon;
    private javax.swing.JTextArea descriTextFieldGerCon;
    private javax.swing.JLabel emailLabelGerCon;
    private javax.swing.JTextField emailTextFieldGerCon;
    private javax.swing.JTextField funcionalText;
    private javax.swing.JLabel idAtendimento;
    private javax.swing.JTextField idAtendimentoTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonGerCon;
    private javax.swing.JComboBox<String> jComboBoxProblema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3Sair;
    private javax.swing.JMenuItem jMenuAtendimento;
    private javax.swing.JMenuBar jMenuBar2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lupaLabelGerCon1;
    private javax.swing.JLabel respLabelGerCon;
    private javax.swing.JTextField respTextFieldGerCon;
    private javax.swing.JButton saveButtonGerCon;
    private javax.swing.JLabel telLabelGerCon;
    private javax.swing.JTextField telTextFieldGerCon;
    private javax.swing.JLabel userLabelGerCon;
    // End of variables declaration//GEN-END:variables
}
