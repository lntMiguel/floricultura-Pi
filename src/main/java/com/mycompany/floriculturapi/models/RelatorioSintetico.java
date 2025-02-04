package com.mycompany.floriculturapi.models;

import java.util.Date;

/**
 *Classe que registra os dados de um relatório sintético, usando a dao consegue-se gravar os dados no banco e fazer sua visualização
 * 
 * @author migue
 * @see com.mycompany.floriculturapi.dao.RelatorioSinteticoDAO
 * @see Venda
 * @see Cliente
 */
public class RelatorioSintetico {
    
    private int idVenda;
    private Date dataVenda;
    private int idCliente;
    private String nomeCliente;
    private float valorVenda;

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public RelatorioSintetico(int idVenda, Date dataVenda, int idCliente, String nomeCliente, float valorVenda) {
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.valorVenda = valorVenda;
    }
    
    
}
