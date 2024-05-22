package com.mycompany.floriculturapi.models;

/**
 *
 * @author migue
 */
public class RelatorioAnalitico {
    
    private String nomeProduto;
    private String tipoProduto;
    private int qtdProduto;
    private float valorUnitario;

    public RelatorioAnalitico(String nomeProduto, String tipoProduto, int qtdProduto, float valorUnitario) {
        this.nomeProduto = nomeProduto;
        this.tipoProduto = tipoProduto;
        this.qtdProduto = qtdProduto;
        this.valorUnitario = valorUnitario;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    
}
