/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.floriculturapi.views;

import com.mycompany.floriculturapi.dao.ProdutoDAO;
import com.mycompany.floriculturapi.models.Produto;
import com.mycompany.floriculturapi.utils.Validador;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pedro
 */
public class ProdutoManutencao extends javax.swing.JFrame {
        Produto objAlterar = null;
    /**
     * Creates new form ManutencaoProduto
     */
    public ProdutoManutencao() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox<>();
        lbTipo = new javax.swing.JLabel();
        spnQtd = new javax.swing.JSpinner();
        lbQnt = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuInicio = new javax.swing.JMenuItem();
        mnuManutencaoCliente = new javax.swing.JMenuItem();
        mnuRelatorios = new javax.swing.JMenuItem();
        mnuVendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Tipo", "Quantidade", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProdutos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 77, 600, 380));

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 290, 60));

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, 290, 60));

        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 130, 60));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbPreco.setText("Preço:");
        jPanel2.add(lbPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });
        jPanel2.add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 260, 25));

        lbNome.setText("Nome:");
        jPanel2.add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 32, 260, 25));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flor", "Planta", "Substrato", "Acessório p/ Jardim" }));
        jPanel2.add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 30));

        lbTipo.setText("Tipo");
        jPanel2.add(lbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        spnQtd.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel2.add(spnQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, -1));

        lbQnt.setText("Quantidade");
        jPanel2.add(lbQnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 320, 230));
        jPanel1.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 190, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Pesquise um produto pelo nome:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fundo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        jMenu1.setText("Abrir");

        mnuInicio.setText("Menu");
        mnuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInicioActionPerformed(evt);
            }
        });
        jMenu1.add(mnuInicio);

        mnuManutencaoCliente.setText("Manutenção de Cliente");
        mnuManutencaoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManutencaoClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mnuManutencaoCliente);

        mnuRelatorios.setText("Relatórios");
        mnuRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelatoriosActionPerformed(evt);
            }
        });
        jMenu1.add(mnuRelatorios);

        mnuVendas.setText("Vendas");
        mnuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVendasActionPerformed(evt);
            }
        });
        jMenu1.add(mnuVendas);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
       
        if(objAlterar != null){
            Validador objValidador = new Validador();
            objValidador.validarNumero(txtPreco);
            objValidador.validarTexto(txtNome);
        
            if(objValidador.hasErro()){
                   JOptionPane.showMessageDialog(rootPane, objValidador.getMensagensErro());
               }
            
            else{
                String nome = txtNome.getText() ;
                String tipo = cbTipo.getSelectedItem().toString();
                int qtd = Integer.parseInt(spnQtd.getValue().toString());
                Float preco = Float.parseFloat(txtPreco.getText());
                
                objAlterar.setNomeProduto(nome);
                objAlterar.setTipoProduto(tipo);
                objAlterar.setQtdProduto(qtd);
                objAlterar.setPrecoProduto(preco);
                
                boolean retornoAlteracao = ProdutoDAO.alterar(objAlterar);
                
                if(retornoAlteracao){
                    JOptionPane.showMessageDialog(rootPane, "Dados Alterados com sucesso!");
                    //limpar campos
                    objAlterar = null;
                    txtNome.setText("");
                    spnQtd.setValue(0);
                    txtPreco.setText("");
                    
                    atualizarTabela();
            }
            else
                JOptionPane.showMessageDialog(rootPane, "Falha ao alterar os dados!");
            
            }
        
        }
        
        else{
            DefaultTableModel tabelaProdutos = (DefaultTableModel) tblProdutos.getModel();
        
            Validador objValidador = new Validador();
            objValidador.validarNumero(txtPreco);
            objValidador.validarTexto(txtNome);

            if(objValidador.hasErro()){
                JOptionPane.showMessageDialog(rootPane, objValidador.getMensagensErro());    
            }
        
            else{
                objValidador.limparMensagens();
                String nome = txtNome.getText();
                String tipo = (cbTipo.getSelectedItem()).toString();
                int qtd = Integer.parseInt(spnQtd.getValue().toString());
                float preco = Float.parseFloat(txtPreco.getText());

               // Object[] dados = {txtNome.getText(), cbTipo.getSelectedItem(), spnQtd.getValue(), preco };
                //tabelaProdutos.addRow(dados);

                Produto objCadastrar = new Produto(nome, tipo, qtd, preco);
                boolean retornoBanco = ProdutoDAO.salvar(objCadastrar);

                if(retornoBanco){
                        JOptionPane.showMessageDialog(rootPane, "Produto cadastrado com sucesso!");
                        txtNome.setText("");
                        txtPreco.setText("");
                        spnQtd.setValue(0);

                        atualizarTabela();
                    }

                    else
                        JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar Produto");


            }
        
        
        }
        
         
    }//GEN-LAST:event_btnCadastrarActionPerformed
 
    public void atualizarTabela(){
        ArrayList<Produto> lista = ProdutoDAO.listar();
        DefaultTableModel modeloTabela = (DefaultTableModel) tblProdutos.getModel();
        modeloTabela.setRowCount(0);
        
        for(Produto item : lista){
            
            modeloTabela.addRow(new String[]{
                String.valueOf(item.getIdProduto()),
                item.getNomeProduto(),
                item.getTipoProduto(),
                String.valueOf(item.getQtdProduto()),
                String.valueOf(item.getPrecoProduto()),
      
            });
        }
    }
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        DefaultTableModel modeloProdutos = (DefaultTableModel) tblProdutos.getModel();
        int linhaSelecionada = tblProdutos.getSelectedRow();
        
        if(linhaSelecionada >= 0){
                 
                   int id = Integer.parseInt(modeloProdutos.getValueAt(linhaSelecionada, 0).toString());
                   String nome = modeloProdutos.getValueAt(linhaSelecionada, 1).toString();
                   String tipo = modeloProdutos.getValueAt(linhaSelecionada, 2).toString();
                   int qtd = Integer.parseInt(modeloProdutos.getValueAt(linhaSelecionada, 3).toString());
                   float preco = Float.parseFloat(modeloProdutos.getValueAt(linhaSelecionada, 4).toString());
                
                   objAlterar = new Produto(id, nome, tipo, qtd,preco);
                   
                   txtNome.setText(objAlterar.getNomeProduto());
                   spnQtd.getModel().setValue(objAlterar.getQtdProduto());
                   txtPreco.setText(Float.toString(objAlterar.getPrecoProduto()));
                  
           
          
       }
       
       else{
            JOptionPane.showMessageDialog(null,"Selecione um produto para editar");
        }
        /*if(tblProdutos.getSelectedRow() !=  -1){
           
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Você realmente deseja editar este produto?", "Editar Produto", 2);
           
            if(resposta == 0){
               
               Validador objValidador = new Validador();
               objValidador.validarNumero(txtPreco);
               objValidador.validarTexto(txtNome);
               
               if(objValidador.hasErro()){
                   JOptionPane.showMessageDialog(rootPane, objValidador.getMensagensErro());
               }
               
               else{
                   objValidador.limparMensagens();
                   float preco = Float.parseFloat(txtPreco.getText());
                   tblProdutos.setValueAt(txtNome.getText(), tblProdutos.getSelectedRow(), 0);
                   tblProdutos.setValueAt(cbTipo.getSelectedItem(), tblProdutos.getSelectedRow(), 1);
                   tblProdutos.setValueAt(spnQtd.getValue(), tblProdutos.getSelectedRow(), 2);
                   tblProdutos.setValueAt(preco, tblProdutos.getSelectedRow(), 3);
               }
            }
            
            else{
                JOptionPane.showMessageDialog(null,"Operação Cancelada");
           }
          
       }
       
       else{
            JOptionPane.showMessageDialog(null,"Selecione um produto para editar");
        }*/
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
           int linhaSelecionada = tblProdutos.getSelectedRow();
        if(linhaSelecionada >= 0){
            
            DefaultTableModel modeloTabela = (DefaultTableModel) tblProdutos.getModel();          
            int idExcluir = Integer.parseInt(modeloTabela.getValueAt(linhaSelecionada,0).toString());
            //chamar dao para excluir;
            boolean retorno = ProdutoDAO.excluir(idExcluir);
            
            if(retorno){
                JOptionPane.showMessageDialog(rootPane, "Produto deletado com sucesso!");
                atualizarTabela();
            }
            else
                JOptionPane.showMessageDialog(rootPane, "Erro ao deletar Produto!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void mnuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInicioActionPerformed
        Inicio inicio = new Inicio();
        this.dispose();
        inicio.setVisible(true);
    }//GEN-LAST:event_mnuInicioActionPerformed

    private void mnuManutencaoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManutencaoClienteActionPerformed
        ManutencaoCliente manutencaoCliente = new ManutencaoCliente();
        this.dispose();
        manutencaoCliente.setVisible(true);

    }//GEN-LAST:event_mnuManutencaoClienteActionPerformed

    private void mnuRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelatoriosActionPerformed
        Relatorio relatorio = new Relatorio();
        this.dispose();
        relatorio.setVisible(true);
    }//GEN-LAST:event_mnuRelatoriosActionPerformed

    private void mnuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVendasActionPerformed
        Vendas vendas = new Vendas();
        this.dispose();
        vendas.setVisible(true);
    }//GEN-LAST:event_mnuVendasActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        if("".equals(txtPesquisa.getText()))
            atualizarTabela();
        
        else{
            String nomeConsulta = txtPesquisa.getText();
            ArrayList<Produto> lista = ProdutoDAO.pesquisar(nomeConsulta);
            DefaultTableModel modeloTabela = (DefaultTableModel) tblProdutos.getModel();
            modeloTabela.setRowCount(0);

            for(Produto item : lista){

                modeloTabela.addRow(new String[]{
                    String.valueOf(item.getIdProduto()),
                    item.getNomeProduto(),
                    item.getTipoProduto(),
                    String.valueOf(item.getQtdProduto()),
                    String.valueOf(item.getPrecoProduto()),
                    

                });
            }
            txtPesquisa.setText("");
        }  
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(ProdutoManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoManutencao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JLabel lbQnt;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JMenuItem mnuInicio;
    private javax.swing.JMenuItem mnuManutencaoCliente;
    private javax.swing.JMenuItem mnuRelatorios;
    private javax.swing.JMenuItem mnuVendas;
    private javax.swing.JSpinner spnQtd;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
