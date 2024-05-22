/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.floriculturapi.dao;

import com.mycompany.floriculturapi.models.RelatorioSintetico;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author migue
 */
public class RelatorioSinteticoDAO {
    
    static String url = "jdbc:mysql://localhost:3306/floriculturapi";
    static String login = "root";
    static String senha = "adminadmin";

    public static ArrayList<RelatorioSintetico> listarPorPeriodo(Date dataInicio, Date dataTermino){
        
        Connection conexao = null;
        ResultSet rs = null;
        
        ArrayList<RelatorioSintetico> listaRetorno = new ArrayList();

        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url,login,senha);
            
            String sql = "SELECT Venda.idVenda, Venda.idCliente, Cliente.nomeCliente, Venda.dataVenda, Venda.valorVenda FROM Venda "
                    + "   INNER JOIN Cliente ON Venda.idCliente = Cliente.idCliente"
                    + "   WHERE dataVenda BETWEEN ? AND ?";
            
            PreparedStatement comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setDate(1, new java.sql.Date(dataInicio.getTime()));
            comandoSQL.setDate(2, new java.sql.Date(dataTermino.getTime()));
            
            
            rs = comandoSQL.executeQuery();
            
            if(rs != null){
                
                while(rs.next()){
                    RelatorioSintetico item = null;
                
                    int idVenda = rs.getInt("idVenda");
                    int idCliente = rs.getInt("idCliente");
                    String nomeCliente = rs.getString("nomeCliente");
                    Date dataVenda = rs.getDate("dataVenda");
                    float valorVenda = rs.getFloat("valorVenda");
                
                    item = new RelatorioSintetico(idVenda, dataVenda, idCliente, nomeCliente, valorVenda);
                
                    listaRetorno.add(item);
                }
                
                
            }
        }catch(Exception e){
            listaRetorno = null;
        }
        return listaRetorno;
    }
}
