/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.floriculturapi.views;

import com.mycompany.floriculturapi.dao.ClienteDAO;
import com.mycompany.floriculturapi.dao.ProdutoDAO;
import com.mycompany.floriculturapi.dao.VendaDAO;
import com.mycompany.floriculturapi.models.Cliente;
import com.mycompany.floriculturapi.models.ItemVenda;
import com.mycompany.floriculturapi.models.Produto;
import com.mycompany.floriculturapi.models.Venda;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pedro
 */
public class Vendas extends javax.swing.JFrame {

    float valorTotal = 0;
    
    Venda objVenda = new Venda();
    
   
    public Vendas() {
        initComponents();
        
        cboProdutos.removeAllItems();
        
        ArrayList<Produto> listaProdutos = ProdutoDAO.listar();
        
        for(Produto item : listaProdutos){
            cboProdutos.addItem(item);
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
        jPanel2 = new javax.swing.JPanel();
        lbCpf = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        cboProdutos = new javax.swing.JComboBox<Produto>();
        spnQtd = new javax.swing.JSpinner();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCPF = new javax.swing.JFormattedTextField();
        lblNomeCliente = new javax.swing.JLabel();
        lblValorTotal = new javax.swing.JLabel();
        lblQtd = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuMenu = new javax.swing.JMenuItem();
        mnuManutencaoCliente = new javax.swing.JMenuItem();
        mnuManutencaoProduto = new javax.swing.JMenuItem();
        mnuRelatorios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCpf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCpf.setText("CPF:");
        jPanel2.add(lbCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 30, 20));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        cboProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProdutosActionPerformed(evt);
            }
        });
        jPanel2.add(cboProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 280, 30));

        spnQtd.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel2.add(spnQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 60, 70, 30));

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 120, 30));

        tblVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produto", "Tipo", "Quantidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVendas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 610, 220));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Valor Total:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 130, 60));

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel2.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 300, 60));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 300, 60));

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });
        jPanel2.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 160, -1));
        jPanel2.add(lblNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 16, 230, 30));

        lblValorTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel2.add(lblValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 180, 30));
        jPanel2.add(lblQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 800, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fundo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        jMenu1.setText("Abrir");

        mnuMenu.setText("Menu");
        mnuMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMenuActionPerformed(evt);
            }
        });
        jMenu1.add(mnuMenu);

        mnuManutencaoCliente.setText("Manutenção de Cliente");
        mnuManutencaoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManutencaoClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mnuManutencaoCliente);

        mnuManutencaoProduto.setText("Manutenção de Produto");
        mnuManutencaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManutencaoProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuManutencaoProduto);

        mnuRelatorios.setText("Relatórios");
        mnuRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelatoriosActionPerformed(evt);
            }
        });
        jMenu1.add(mnuRelatorios);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMenuActionPerformed
        Inicio inicio = new Inicio();
        this.dispose();
        inicio.setVisible(true);
    }//GEN-LAST:event_mnuMenuActionPerformed

    private void mnuManutencaoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManutencaoClienteActionPerformed
        ManutencaoCliente manutencaoCliente = new ManutencaoCliente();
        this.dispose();
        manutencaoCliente.setVisible(true);
    }//GEN-LAST:event_mnuManutencaoClienteActionPerformed

    private void mnuManutencaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManutencaoProdutoActionPerformed
        ProdutoManutencao produtoManutencao = new ProdutoManutencao();
        this.dispose();
        produtoManutencao.setVisible(true);
    }//GEN-LAST:event_mnuManutencaoProdutoActionPerformed

    private void mnuRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelatoriosActionPerformed
        Relatorio relatorio = new Relatorio();
        this.dispose();
        relatorio.setVisible(true);

    }//GEN-LAST:event_mnuRelatoriosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        Integer idCliente = objVenda.getIdCliente();
        
        if(idCliente == 0){
            JOptionPane.showMessageDialog(rootPane, "Digite um CPF");
        }
        else{
            DefaultTableModel modelo = (DefaultTableModel) tblVendas.getModel();

            for(int i = 0; i < modelo.getRowCount(); i++){

                ItemVenda novoItem = null;
                int idProduto = Integer.parseInt(modelo.getValueAt(i, 0).toString());
                String nomeProduto = modelo.getValueAt(i, 1).toString();
                String tipoProduto = modelo.getValueAt(i, 2).toString();
                int qtdProduto = Integer.parseInt(modelo.getValueAt(i, 3).toString());
                float valorUnitario = Float.parseFloat(modelo.getValueAt(i, 4).toString());
                
                novoItem = new ItemVenda(idProduto,qtdProduto,valorUnitario);

                objVenda.getListaItens().add(novoItem);
            }
            if(Float.parseFloat(lblValorTotal.getText()) == 0){
                JOptionPane.showMessageDialog(rootPane, "Venda Cancelada: Não há itens a serem vendidos");
                objVenda = null;
                limparCampos();
            }
            else{
                Float v = Float.parseFloat(lblValorTotal.getText());
                objVenda.setValorVenda(v);
                objVenda.setDataVenda(new Date());

                boolean retorno = VendaDAO.salvar(objVenda);

                if(retorno){
                    JOptionPane.showMessageDialog(rootPane, "Venda realizada com sucesso");

                    int tamanhoLista = objVenda.getListaItens().size();

                    for(int i = 0; i < tamanhoLista; i++){
                        int idProduto = objVenda.getListaItens().get(i).getIdProduto();
                        int qtdProduto = Integer.parseInt(modelo.getValueAt(i, 3).toString());
                        int qtdEstoque = VendaDAO.consultarEstoque(idProduto);

                        int qtdNova = qtdEstoque - qtdProduto;

                        boolean alterarEstoque = VendaDAO.atualizarEstoque(idProduto, qtdNova);

                        if(!alterarEstoque){
                            JOptionPane.showMessageDialog(rootPane, "Erro ao atualizar estoque");
                            break;
                        }

                        else{

                            lblQtd.setText("Qtd em estoque: ");
                            Produto produtoSelecionado = (Produto) cboProdutos.getSelectedItem();
                            String qtdEmEstoque = String.valueOf(VendaDAO.consultarEstoque(produtoSelecionado.getIdProduto()));
                            lblQtd.setText("Qtd em estoque: " + qtdEmEstoque);

                        }
                    }
                    valorTotal = 0;
                    objVenda.getListaItens().clear();
                    objVenda.setIdCliente(0);
                    limparCampos();
            }
            
            else{
                JOptionPane.showMessageDialog(rootPane, "Erro ao realizar venda");
            
            }
            
           }
            
            
        }
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linhaSelecionada = tblVendas.getSelectedRow();
   
        if(linhaSelecionada >= 0){
            DefaultTableModel modelo = (DefaultTableModel) tblVendas.getModel();
            
            float valorItem = Float.parseFloat(modelo.getValueAt(linhaSelecionada, 4).toString());
            valorTotal -= valorItem * Integer.parseInt(modelo.getValueAt(linhaSelecionada, 3).toString());
            lblValorTotal.setText(String.valueOf(valorTotal));
            modelo.removeRow(linhaSelecionada);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Selecione um produto para excluir");
        }
        
        
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed

        Produto produtoSelecionado = (Produto) cboProdutos.getSelectedItem();
        
        if(produtoSelecionado != null){
            
            int qtdPedido = Integer.parseInt(spnQtd.getValue().toString());
            int qtdEstoque = produtoSelecionado.getQtdProduto();
            if(qtdEstoque >= qtdPedido){
                
                DefaultTableModel modelo = (DefaultTableModel)tblVendas.getModel();
           
                modelo.addRow(new String[]{
                    String.valueOf(produtoSelecionado.getIdProduto()),
                    produtoSelecionado.getNomeProduto(),
                    produtoSelecionado.getTipoProduto(),
                    String.valueOf(Integer.parseInt(spnQtd.getValue().toString())),
                    String.valueOf(produtoSelecionado.getPrecoProduto())
                });
            
                float valorUnitario = produtoSelecionado.getPrecoProduto();
                float valorLinha = valorUnitario * qtdPedido;
                valorTotal += valorLinha;
                lblValorTotal.setText(String.valueOf(valorTotal));
           }
          
            else{
               JOptionPane.showMessageDialog(rootPane, "Erro: Quantidade solicitada maior que a do estoque");
            }
        }

        

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void cboProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProdutosActionPerformed
        lblQtd.setText("Qtd em estoque: ");
        Produto produtoSelecionado = (Produto) cboProdutos.getSelectedItem();

        String qtdEmEstoque = String.valueOf(VendaDAO.consultarEstoque(produtoSelecionado.getIdProduto()));

        lblQtd.setText("Qtd em estoque: " + qtdEmEstoque);
    }//GEN-LAST:event_cboProdutosActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if("   .   .   -  ".equals(txtCPF.getText())){
            JOptionPane.showMessageDialog(rootPane, "Digite um CPF");
        }
        else{
            Cliente clientePesquisa = ClienteDAO.pesquisa(txtCPF.getText());

            if(clientePesquisa == null){
                JOptionPane.showMessageDialog(rootPane, "Cliente não Cadastrado");
            }

            else{
                lblNomeCliente.setText(clientePesquisa.getNomeCliente());
                objVenda.setIdCliente(clientePesquisa.getIdCliente());
            }

        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void limparCampos(){
        
        txtCPF.setText("");
        lblNomeCliente.setText("");
        lblValorTotal.setText("");
        valorTotal = 0;
        spnQtd.setValue(0);
        objVenda.getListaItens().clear();
        objVenda.setIdCliente(0);
        DefaultTableModel modelo = (DefaultTableModel) tblVendas.getModel();
        
        for(int i = modelo.getRowCount() - 1; i >= 0; i--){
            modelo.removeRow(i);
        }
    }
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
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<Produto> cboProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblQtd;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JMenuItem mnuManutencaoCliente;
    private javax.swing.JMenuItem mnuManutencaoProduto;
    private javax.swing.JMenuItem mnuMenu;
    private javax.swing.JMenuItem mnuRelatorios;
    private javax.swing.JSpinner spnQtd;
    private javax.swing.JTable tblVendas;
    private javax.swing.JFormattedTextField txtCPF;
    // End of variables declaration//GEN-END:variables
}
