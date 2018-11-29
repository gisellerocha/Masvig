/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;
import dao.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author XL
 */
public class TelaCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaCliente() {
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

        jLabelNome = new javax.swing.JLabel();
        nomeTextCad = new javax.swing.JTextField();
        jLabelTel = new javax.swing.JLabel();
        telTextCad = new javax.swing.JTextField();
        jLabelCel = new javax.swing.JLabel();
        celTextCad = new javax.swing.JTextField();
        jLabelEnd = new javax.swing.JLabel();
        endTextCad = new javax.swing.JTextField();
        jLabelNum = new javax.swing.JLabel();
        numTextCad = new javax.swing.JTextField();
        jLabelComplemento = new javax.swing.JLabel();
        complementoTextCad = new javax.swing.JTextField();
        jLabelMunicipio = new javax.swing.JLabel();
        municipioComboBox = new javax.swing.JComboBox<>();
        jLabelEstado = new javax.swing.JLabel();
        estadoComboBox = new javax.swing.JComboBox<>();
        jLabelCNPJ = new javax.swing.JLabel();
        cnpjFormattedCad = new javax.swing.JFormattedTextField();
        jLabelRazao = new javax.swing.JLabel();
        razaoTextField = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        emailTextCad = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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
        jMenuExConsultaAtendimento = new javax.swing.JMenuItem();
        jMenuConsultaFuncional = new javax.swing.JMenuItem();
        jMenuConsultaCliente = new javax.swing.JMenuItem();
        jMenuConsultaUsuario = new javax.swing.JMenuItem();
        jMenuConsultaProblema = new javax.swing.JMenuItem();
        jMenu3Sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TelaCliente");
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        jLabelNome.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(51, 102, 0));
        jLabelNome.setText("Nome");
        jLabelNome.setToolTipText("");
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(20, 130, 50, 30);

        nomeTextCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomeTextCadMouseClicked(evt);
            }
        });
        nomeTextCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextCadActionPerformed(evt);
            }
        });
        getContentPane().add(nomeTextCad);
        nomeTextCad.setBounds(20, 160, 250, 30);

        jLabelTel.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabelTel.setForeground(new java.awt.Color(51, 102, 0));
        jLabelTel.setText("Tel");
        jLabelTel.setToolTipText("");
        getContentPane().add(jLabelTel);
        jLabelTel.setBounds(290, 270, 50, 30);
        getContentPane().add(telTextCad);
        telTextCad.setBounds(290, 300, 240, 30);

        jLabelCel.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabelCel.setForeground(new java.awt.Color(51, 102, 0));
        jLabelCel.setText("Cel");
        jLabelCel.setToolTipText("");
        getContentPane().add(jLabelCel);
        jLabelCel.setBounds(570, 270, 50, 30);
        getContentPane().add(celTextCad);
        celTextCad.setBounds(550, 300, 210, 30);

        jLabelEnd.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabelEnd.setForeground(new java.awt.Color(51, 102, 0));
        jLabelEnd.setText("Logradouro");
        jLabelEnd.setToolTipText("");
        getContentPane().add(jLabelEnd);
        jLabelEnd.setBounds(20, 200, 90, 40);

        endTextCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endTextCadActionPerformed(evt);
            }
        });
        getContentPane().add(endTextCad);
        endTextCad.setBounds(20, 230, 250, 30);

        jLabelNum.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabelNum.setForeground(new java.awt.Color(51, 102, 0));
        jLabelNum.setText("Num");
        jLabelNum.setToolTipText("");
        getContentPane().add(jLabelNum);
        jLabelNum.setBounds(290, 200, 40, 40);

        numTextCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTextCadActionPerformed(evt);
            }
        });
        getContentPane().add(numTextCad);
        numTextCad.setBounds(290, 230, 80, 30);

        jLabelComplemento.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabelComplemento.setForeground(new java.awt.Color(51, 102, 0));
        jLabelComplemento.setText("Complemento");
        jLabelComplemento.setToolTipText("");
        getContentPane().add(jLabelComplemento);
        jLabelComplemento.setBounds(390, 200, 130, 40);
        getContentPane().add(complementoTextCad);
        complementoTextCad.setBounds(390, 230, 190, 30);

        jLabelMunicipio.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabelMunicipio.setForeground(new java.awt.Color(51, 102, 0));
        jLabelMunicipio.setText("Municipio");
        jLabelMunicipio.setToolTipText("");
        getContentPane().add(jLabelMunicipio);
        jLabelMunicipio.setBounds(600, 200, 80, 40);

        municipioComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SP", "RS", "MG", "RJ" }));
        municipioComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                municipioComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(municipioComboBox);
        municipioComboBox.setBounds(600, 230, 80, 30);

        jLabelEstado.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(51, 102, 0));
        jLabelEstado.setText("Estado");
        jLabelEstado.setToolTipText("");
        getContentPane().add(jLabelEstado);
        jLabelEstado.setBounds(700, 200, 80, 40);

        estadoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "São Paulo", "Rio Grande do Sul", "Minas Gerais", "Rio de Janeiro" }));
        estadoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(estadoComboBox);
        estadoComboBox.setBounds(700, 230, 160, 30);

        jLabelCNPJ.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabelCNPJ.setForeground(new java.awt.Color(51, 102, 0));
        jLabelCNPJ.setText("CNPJ");
        jLabelCNPJ.setToolTipText("");
        getContentPane().add(jLabelCNPJ);
        jLabelCNPJ.setBounds(290, 130, 50, 30);

        try {
            cnpjFormattedCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cnpjFormattedCad.setToolTipText("oiii");
        cnpjFormattedCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpjFormattedCadActionPerformed(evt);
            }
        });
        getContentPane().add(cnpjFormattedCad);
        cnpjFormattedCad.setBounds(290, 160, 250, 30);

        jLabelRazao.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabelRazao.setForeground(new java.awt.Color(51, 102, 0));
        jLabelRazao.setText("Razão social");
        jLabelRazao.setToolTipText("");
        getContentPane().add(jLabelRazao);
        jLabelRazao.setBounds(560, 130, 150, 30);
        getContentPane().add(razaoTextField);
        razaoTextField.setBounds(560, 160, 290, 30);

        jLabelEmail.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(51, 102, 0));
        jLabelEmail.setText("Email");
        jLabelEmail.setToolTipText("");
        getContentPane().add(jLabelEmail);
        jLabelEmail.setBounds(20, 270, 90, 30);

        emailTextCad.setToolTipText("");
        emailTextCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextCadActionPerformed(evt);
            }
        });
        getContentPane().add(emailTextCad);
        emailTextCad.setBounds(20, 300, 250, 30);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalvarMouseClicked(evt);
            }
        });
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(330, 380, 80, 23);

        jButtonCancel.setText("Limpar");
        jButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonCancel);
        jButtonCancel.setBounds(480, 380, 90, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/MASVIG_phixrClienteCad.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 890, 460);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setText("Inicio");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
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

        jMenuConsultaProblema.setText("Consulta de problema");
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
        jMenu3Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3SairActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3Sair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(879, 511));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTextCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextCadActionPerformed

    private void emailTextCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextCadActionPerformed

    private void jButtonSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarMouseClicked
        String cnpj = cnpjFormattedCad.getText();
        String razao = razaoTextField.getText();
        String nome = nomeTextCad.getText();
        String end = endTextCad.getText();
        String complemento = complementoTextCad.getText();
        String municipio = municipioComboBox.getSelectedItem().toString();
        String estado = estadoComboBox.getSelectedItem().toString();
        String email = emailTextCad.getText();
        String num = numTextCad.getText();
        String tel = telTextCad.getText();
        String cel = celTextCad.getText();
        
        /* Date data = null;
    	String dataBanco ; 
        data = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(nasc);
        dataBanco = new SimpleDateFormat("yyyy-MM-dd").format(data);
        */
       
        Cliente novoCliente = new Cliente(cnpj, razao, nome, end, complemento, municipio, estado, email, num, tel, cel);
        novoCliente.insereCliente();
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        //limpa os canais de preenchimento
        cnpjFormattedCad.setText("");
        razaoTextField.setText("");
        nomeTextCad.setText("");
        endTextCad.setText("");
        complementoTextCad.setText("");
        emailTextCad.setText("");
        numTextCad.setText("");
        telTextCad.setText("");
        celTextCad.setText("");
        
    }//GEN-LAST:event_jButtonSalvarMouseClicked

    private void nomeTextCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomeTextCadMouseClicked
        //nomeTextUsu.setText("");
    }//GEN-LAST:event_nomeTextCadMouseClicked

    private void endTextCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endTextCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endTextCadActionPerformed

    private void numTextCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTextCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numTextCadActionPerformed

    private void municipioComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_municipioComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_municipioComboBoxActionPerformed

    private void estadoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoComboBoxActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void cnpjFormattedCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpjFormattedCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnpjFormattedCadActionPerformed

    private void jButtonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseClicked
        cnpjFormattedCad.setText("");
        razaoTextField.setText("");
        nomeTextCad.setText("");
        endTextCad.setText("");
        complementoTextCad.setText("");
        emailTextCad.setText("");
        numTextCad.setText("");
        telTextCad.setText("");
        celTextCad.setText("");
    }//GEN-LAST:event_jButtonCancelMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        new TelaInicio().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuProblemaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuProblemaMousePressed
        String tipodeusuario = Sessao.getInstance().getUsuario().getTipo_de_usuario();
        if(tipodeusuario.equals("Gerente") || tipodeusuario.equals("Atendente")){
           new TelaProblema().setVisible(true);
           dispose();
        } else {
           JOptionPane.showMessageDialog(null, "Apenas Gerentes e Atendentes!");
        }
    }//GEN-LAST:event_jMenuProblemaMousePressed

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

    private void jMenu3SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenu3SairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField celTextCad;
    private javax.swing.JFormattedTextField cnpjFormattedCad;
    private javax.swing.JTextField complementoTextCad;
    private javax.swing.JTextField emailTextCad;
    private javax.swing.JTextField endTextCad;
    private javax.swing.JComboBox<String> estadoComboBox;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCNPJ;
    private javax.swing.JLabel jLabelCel;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEnd;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelMunicipio;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNum;
    private javax.swing.JLabel jLabelRazao;
    private javax.swing.JLabel jLabelTel;
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
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenuItem jMenuExConsultaAtendimento;
    private javax.swing.JMenu jMenuExibir;
    private javax.swing.JMenuItem jMenuProblema;
    private javax.swing.JMenuItem jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenuItem jMenuUsuario;
    private javax.swing.JComboBox<String> municipioComboBox;
    private javax.swing.JTextField nomeTextCad;
    private javax.swing.JTextField numTextCad;
    private javax.swing.JTextField razaoTextField;
    private javax.swing.JTextField telTextCad;
    // End of variables declaration//GEN-END:variables
}
