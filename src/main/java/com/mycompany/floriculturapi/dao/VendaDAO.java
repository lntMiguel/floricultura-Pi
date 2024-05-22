/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.floriculturapi.dao;

import com.mycompany.floriculturapi.models.ItemVenda;
import com.mycompany.floriculturapi.models.Venda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author migue
 */
public class VendaDAO {
    static String url = "jdbc:mysql://localhost:3306/floriculturapi";
    static String login = "root";
    static String senha = "adminadmin";
    
    public static boolean salvar(Venda obj){
        
        Connection conexao = null;
        boolean retorno = false;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao =  DriverManager.getConnection(url, login, senha);
            
            String sql = "INSERT INTO Venda (valorVenda, dataVenda, idCliente) VALUES (?,?,?)" ;
            PreparedStatement comandoSQL = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            comandoSQL.setFloat(1, obj.getValorVenda());
            comandoSQL.setDate(2, new java.sql.Date (obj.getDataVenda().getTime()));
            comandoSQL.setInt(3, obj.getIdCliente());
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            
            if(linhasAfetadas > 0){
                ResultSet rs = comandoSQL.getGeneratedKeys();
                
                if(rs.next()){
                    int id = rs.getInt(1);
                    
                    for(ItemVenda item : obj.getListaItens()){
                        String sql2 = "INSERT INTO ItemVenda (idVenda, idProduto, qtdProduto, valorUnitario) VALUES(?,?,?,?)";
                        PreparedStatement comandoSQL2 = conexao.prepareStatement(sql2);
                        
                        comandoSQL2.setInt(1, id);
                        comandoSQL2.setInt(2, item.getIdProduto());
                        comandoSQL2.setInt(3, item.getQtdProduto());
                        comandoSQL2.setFloat(4, item.getValorUnitario());
                        
                        int linhas = comandoSQL2.executeUpdate();
                        if(linhas > 0){
                            retorno = true;
                        }
                        
                        else{
                            throw new Exception("Falha ao adicionar itens");
                        }
                        
                    }
                }
                else{
                    throw new Exception("Falha ao criar venda"); 
                }
            }
        }catch(Exception e){
            
        }
        
        return retorno;
    }
    
    public static boolean atualizarEstoque(int idProduto, int qtdNova){
        boolean retorno = false;
        Connection conexao = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao =  DriverManager.getConnection(url, login, senha);
            
            String sql = "UPDATE Produto SET qtdProduto=? WHERE idProduto = ?";
            PreparedStatement comandoSQL = conexao.prepareStatement(sql);
            
            comandoSQL.setInt(1, qtdNova);
            comandoSQL.setInt(2, idProduto);
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            
            if(linhasAfetadas > 0){
                retorno = true;
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            if(conexao != null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    
        }
        
        return retorno;
    }
    
    public static int consultarEstoque(int idProduto){
        
        Connection conexao = null;
        ResultSet rs = null;
        int retorno = -1;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao =  DriverManager.getConnection(url, login, senha);
            
            String sql = "SELECT qtdProduto FROM Produto WHERE idProduto = ?";
            PreparedStatement comandoSQL = conexao.prepareStatement(sql);
            
            comandoSQL.setInt(1, idProduto);
            
            rs = comandoSQL.executeQuery();
            
            
            
            if(rs != null){
              while(rs.next()){
                  retorno = rs.getInt("qtdProduto");
              }
              
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            if(conexao != null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    
        }
        
       return retorno;
    }
}
