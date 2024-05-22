package com.mycompany.floriculturapi.dao;

import com.mycompany.floriculturapi.models.RelatorioAnalitico;
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
public class RelatorioAnaliticoDAO {
    
    static String url = "jdbc:mysql://localhost:3306/floriculturapi";
    static String login = "root";
    static String senha = "adminadmin";

    public static ArrayList<RelatorioAnalitico> listarPorVenda(int idVenda){
        
        Connection conexao = null;
        ResultSet rs = null;
        
        ArrayList<RelatorioAnalitico> listaRetorno = new ArrayList();

        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url,login,senha);
            
            String sql = "SELECT ItemVenda.idProduto, Produto.nomeProduto, Produto.tipoProduto, ItemVenda.valorUnitario, ItemVenda.qtdProduto FROM ItemVenda "
                    + "   INNER JOIN Produto ON ItemVenda.idProduto = Produto.idProduto"
                    + "   WHERE idVenda =?";
            
            PreparedStatement comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setInt(1, idVenda);
            
            rs = comandoSQL.executeQuery();
            
            if(rs != null){
                
                while(rs.next()){
                    RelatorioAnalitico item = null;
                
                    //int idProduto = rs.getInt("idProduto");
                    String nomeProduto = rs.getString("nomeProduto");
                    String tipoProduto = rs.getString("tipoProduto");
                    float valorUnitario = rs.getFloat("valorUnitario");
                    int qtdProduto = rs.getInt("qtdProduto");
                    
                    item = new RelatorioAnalitico(nomeProduto, tipoProduto, qtdProduto, valorUnitario);
                
                    listaRetorno.add(item);
                }
                
                
            }
        }catch(Exception e){
            listaRetorno = null;
        }
        return listaRetorno;
    }
}
