package com.mycompany.floriculturapi.views;

import com.mycompany.floriculturapi.utils.Validador;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Pedro
 */
public class Relatorio extends javax.swing.JFrame {

    /**
     * Creates new form Relatorio
     */
    public Relatorio() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnDetalhes = new javax.swing.JButton();
        dcDataInicio = new com.toedter.calendar.JDateChooser();
        dcDataTermino = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuMenu = new javax.swing.JMenuItem();
        mnuManutencaoCliente = new javax.swing.JMenuItem();
        mnuManutencaoProduto = new javax.swing.JMenuItem();
        mnuVendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Data Inicio:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 170));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 160));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Valor Total:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Data Término:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel2.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, 30));

        btnDetalhes.setText("Detalhes");
        jPanel2.add(btnDetalhes, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 180, 40));
        jPanel2.add(dcDataInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));
        jPanel2.add(dcDataTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 710, 480));

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

    private void mnuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVendasActionPerformed
        Vendas vendas = new Vendas();
        this.dispose();
        vendas.setVisible(true);
    }//GEN-LAST:event_mnuVendasActionPerformed

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

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        Validador objValidador = new Validador();
        objValidador.validarData(dcDataInicio);
        objValidador.validarData(dcDataTermino);
        
        if(objValidador.hasErro()){
            JOptionPane.showMessageDialog(rootPane, objValidador.getMensagensErro());    
        }
            /*############
            Colocar else
            ############*/
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
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnPesquisar;
    private com.toedter.calendar.JDateChooser dcDataInicio;
    private com.toedter.calendar.JDateChooser dcDataTermino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JMenuItem mnuManutencaoCliente;
    private javax.swing.JMenuItem mnuManutencaoProduto;
    private javax.swing.JMenuItem mnuMenu;
    private javax.swing.JMenuItem mnuVendas;
    // End of variables declaration//GEN-END:variables
}
