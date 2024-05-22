/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.floriculturapi.utils;

/**
 *
 * @author migue
 */
import com.mycompany.floriculturapi.dao.ClienteDAO;
import com.mycompany.floriculturapi.models.Cliente;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author fernando.tfernandes
 */
public class Validador {
    
    public ArrayList<String> mensagensErro = new ArrayList<>();
    
    /**
     * Valida somente campos inteiros
     * @param txt Recebe um objeto do tipo JTextField
     */
    public void validarNumero(JTextField txt){
    
        try{
            
            //Verifico se o campo está vazio
            if(txt.getText().trim().equals("")){
                throw new IllegalArgumentException();
            }
            float valorConvertido = Float.parseFloat(txt.getText());
            txt.setBackground(Color.WHITE);
            
        }catch(NumberFormatException e){
        
            this.mensagensErro.add("Digite Apenas numeros");
            txt.setBackground(Color.red);
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Não são permitidos valores nulos");
            txt.setBackground(Color.red);
        }
    
    }
    
    public void validarCPF(JFormattedTextField cpf){
        cpf.setBackground(Color.WHITE);
        if("   .   .   -  ".equals(cpf.getText())){
             this.mensagensErro.add("Digite um CPF");
             cpf.setBackground(Color.red);
        }
        else{
            String cpfConsulta = cpf.getText();
            Cliente clientePesquisa = ClienteDAO.pesquisa(cpfConsulta);
            
            if(clientePesquisa != null){
                this.mensagensErro.add("Erro: CPF já cadastrado");
                cpf.setBackground(Color.red);
            }
        }
        
        
    }
    /**
     * Valida somente campos texto
     * @param txt Recebe um objeto do tipo JTextField
     */
    
    public void validarTelefone(JFormattedTextField tel){
        tel.setBackground(Color.WHITE); 
        if("(  )     -    ".equals(tel.getText())){
             this.mensagensErro.add("Digite um telefone");
             tel.setBackground(Color.red);
        }
    }
    
     public void validarTexto(JTextField txt){
     
         try{
            
            //Verifico se o campo está vazio
            if(txt.getText().trim().equals("")){
                throw new IllegalArgumentException();
            }
            
            txt.setBackground(Color.white);
            
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Não são permitidos valores nulos");
            txt.setBackground(Color.red);
        }
     
     }
     
     public void validarBotao(ButtonGroup bg){
         //resgato o numero de botões
         int grupoDeBotoes = bg.getButtonCount();
         
         try{
             //verifico se algum foi selecionado
             if(bg.getSelection() == null){
                 throw new IllegalArgumentException();
             }
         }
         catch(IllegalArgumentException e){
             /*verifico qual informação não foi dada pela quantidade de botões
               presentes no buttonGroup, caso for 3 faltou o sexo(masculino, 
               feminino, outro), senão
               faltou o estado civil (solteiro, casado)
             */ 
             if(grupoDeBotoes == 3){
                 this.mensagensErro.add("Selecione o sexo");
             }
        
             else{
                 this.mensagensErro.add("Selecione o estado Civil");
        
             }
         }
     }
     
     
     public void limparMensagens(){
     
         this.mensagensErro.clear();
     }
     
     /**@deprecated substituida por {@link #getMensagensErro()}
      * Método para exibir mensagens de erro na tela com JOptionPane
      */
     public void ExibirMensagensErro(){
         
        String errosFormulario = "";
        for (String msg : this.mensagensErro) {
            errosFormulario += msg + "\n";
        }
        
        if(!errosFormulario.equals("")){
            JOptionPane.showMessageDialog(null, errosFormulario);
            this.limparMensagens();
        }     

     }
     
     /**
      * Resgata todos os erros gerados em uma única String
      * @return 
      */
     public String getMensagensErro(){
         
        String errosFormulario = "";
        
        //Percorro o arrayList e concateno na variável errosFormulario
        for (String msg : this.mensagensErro) {
            errosFormulario += msg + "\n";
        }
        
        if(!errosFormulario.equals("")){
            this.limparMensagens();
        }     
        
        return errosFormulario;
        
     }
     
     public boolean hasErro(){
     
         if(this.mensagensErro.size()>0){
            return true;    
         }else{
             return false;
         }
     }

    public void validarData(JDateChooser data) {
        try{
             
             if(data.getDate() == null){
                 throw new IllegalArgumentException();
             }
         }
         catch(IllegalArgumentException e){
             this.mensagensErro.add("Insira uma data");
         } 
    }
    
}
