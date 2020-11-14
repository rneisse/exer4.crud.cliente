/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import model.bean.Cliente;

/**
 *
 * @author Ricardo
 */
public class CadastroCliente extends javax.swing.JFrame {

    private MaskFormatter cpf;
    private MaskFormatter fone;    
    private MaskFormatter data; 
   
    ClienteController clienteController = new ClienteController();
    
    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        
        try {
            cpf = new MaskFormatter("###.###.###-##");
            fone = new MaskFormatter("(##) ####-####");
            data = new MaskFormatter("##/##/####");            
        } catch (Exception ex) {
            //Logger.getLogger(CadastroEmprestimos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
       
        initComponents();
        DefaultTableModel modeloTableClientes = (DefaultTableModel) jTableCliente.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDadosCliente = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelCpf = new javax.swing.JLabel();
        jLabelDataAniversario = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField(cpf);
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField(fone);
        jFormattedTextFieldDataAniversario = new javax.swing.JFormattedTextField(data);
        jPanelFuncoes = new javax.swing.JPanel();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jPanelBusca = new javax.swing.JPanel();
        jButtonConsultar = new javax.swing.JButton();
        jTextFieldNomeBusca = new javax.swing.JTextField();
        jLabelNomeBusca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelDadosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cliente"));

        jLabelNome.setText("Nome:");

        jTextFieldNome.setToolTipText("nome do cliente");

        jLabelEmail.setText("Email:");

        jTextFieldEmail.setToolTipText("email do cliente");

        jLabelCpf.setText("CPF:");

        jLabelDataAniversario.setText("Data de aniversário:");

        jLabelTelefone.setText("Telefone:");

        jFormattedTextFieldCpf.setToolTipText("CPF do cliente");

        jFormattedTextFieldTelefone.setToolTipText("telefone do cliente");

        jFormattedTextFieldDataAniversario.setToolTipText("data de aniversário");

        javax.swing.GroupLayout jPanelDadosClienteLayout = new javax.swing.GroupLayout(jPanelDadosCliente);
        jPanelDadosCliente.setLayout(jPanelDadosClienteLayout);
        jPanelDadosClienteLayout.setHorizontalGroup(
            jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCpf)
                    .addComponent(jLabelEmail)
                    .addComponent(jLabelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelDadosClienteLayout.createSequentialGroup()
                        .addGroup(jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(jFormattedTextFieldCpf))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelDataAniversario)
                            .addComponent(jLabelTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jFormattedTextFieldDataAniversario)))
                    .addComponent(jTextFieldNome))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanelDadosClienteLayout.setVerticalGroup(
            jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCpf)
                    .addComponent(jLabelDataAniversario)
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldDataAniversario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelFuncoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelFuncoes.setToolTipText("");

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setToolTipText("Cadastrar cliente");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.setToolTipText("Atualizar dados do cliente");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setToolTipText("Excluir cliente");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.setToolTipText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFuncoesLayout = new javax.swing.GroupLayout(jPanelFuncoes);
        jPanelFuncoes.setLayout(jPanelFuncoesLayout);
        jPanelFuncoesLayout.setHorizontalGroup(
            jPanelFuncoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFuncoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelFuncoesLayout.setVerticalGroup(
            jPanelFuncoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFuncoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFuncoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Nome", "E-mail", "CPF", "Telefone", "Dada de Aniversário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliente);

        jPanelBusca.setBorder(javax.swing.BorderFactory.createTitledBorder("Busca"));

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.setToolTipText("");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jTextFieldNomeBusca.setToolTipText("Informe o nome que deseja buscar");

        jLabelNomeBusca.setText("Nome:");

        javax.swing.GroupLayout jPanelBuscaLayout = new javax.swing.GroupLayout(jPanelBusca);
        jPanelBusca.setLayout(jPanelBuscaLayout);
        jPanelBuscaLayout.setHorizontalGroup(
            jPanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNomeBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNomeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConsultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBuscaLayout.setVerticalGroup(
            jPanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscaLayout.createSequentialGroup()
                .addGroup(jPanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultar)
                    .addComponent(jTextFieldNomeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeBusca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelFuncoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelFuncoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        
        String nome = jTextFieldNome.getText();
        String email = jTextFieldEmail.getText();
        String cpf = jFormattedTextFieldCpf.getText();
        String fone = jFormattedTextFieldTelefone.getText();
        String data = jFormattedTextFieldDataAniversario.getText();
        
        clienteController.create(nome, email, cpf, fone, data);
        
        limpaCampos();       
        
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
              
        if (jTableCliente.getSelectedRow() != -1){        
            String nome = jTextFieldNome.getText();
            String email = jTextFieldEmail.getText();
            String cpf = jFormattedTextFieldCpf.getText();
            String fone = jFormattedTextFieldTelefone.getText();
            String data = jFormattedTextFieldDataAniversario.getText();

            clienteController.update((int) jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 0), nome, email, cpf, fone, data);

            this.getListaCliente();

            limpaCampos(); 
        }
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        
        if (jTableCliente.getSelectedRow() != -1){        
            clienteController.delete((int) jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 0));

            this.getListaCliente();

            limpaCampos(); 
        } else {
            JOptionPane.showMessageDialog(null, "Seleciona um produto para excluir!");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        DefaultTableModel modeloTableClientes = (DefaultTableModel) jTableCliente.getModel();
        modeloTableClientes.setNumRows(0);
        
        for( Cliente c : clienteController.query(jTextFieldNomeBusca.getText())){
          modeloTableClientes.addRow(new Object[]{
              c.getId(),
              c.getNome(),
              c.getEmail(),
              c.getCpf(),
              c.getTelefone(),
              c.getDataAniversario()         
          });
      } 
        
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.getListaCliente();
    }//GEN-LAST:event_formWindowOpened

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        
        if (jTableCliente.getSelectedRow() != -1){            
            jTextFieldNome.setText(jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 1).toString());
            jTextFieldEmail.setText(jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 2).toString());
            jFormattedTextFieldCpf.setText(jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 3).toString());
            jFormattedTextFieldTelefone.setText(jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 4).toString());
            jFormattedTextFieldDataAniversario.setText(jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 5).toString());    
        }
        
    }//GEN-LAST:event_jTableClienteMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataAniversario;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDataAniversario;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNomeBusca;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanelBusca;
    private javax.swing.JPanel jPanelDadosCliente;
    private javax.swing.JPanel jPanelFuncoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNomeBusca;
    // End of variables declaration//GEN-END:variables

    public void getListaCliente(){
      DefaultTableModel modeloTableClientes = (DefaultTableModel) jTableCliente.getModel();
      modeloTableClientes.setNumRows(0);
      
      for( Cliente c : clienteController.read()){
          modeloTableClientes.addRow(new Object[]{
              c.getId(),
              c.getNome(),
              c.getEmail(),
              c.getCpf(),
              c.getTelefone(),
              c.getDataAniversario()         
          });
      }      
    }
    
    public void limpaCampos(){
        jTextFieldNome.setText("");
        jTextFieldEmail.setText("");
        jFormattedTextFieldCpf.setText("");
        jFormattedTextFieldTelefone.setText("");
        jFormattedTextFieldDataAniversario.setText("");
    }

}
