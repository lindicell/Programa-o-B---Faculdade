/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhocontrolejogos;

import javax.swing.JOptionPane;

/**
 *
 * @author 16113037
 */
public class Classificacao extends Produtora
{
    String faixa_Etaria = "";
    String estilo_Jogo = "";
    
    public Classificacao(){}
    
    public void set_faixa_Etaria(String fx_et){
        this.faixa_Etaria = fx_et ;
    }
    public String get_faixa_Etaria(){
        return faixa_Etaria;
    }
    
    public void set_estilo_Jogo(String el_jg){
        this.estilo_Jogo = el_jg;
    }
    public String get_estilo_Jogo(){
        return estilo_Jogo;
    }
    
    void cadastrar_classificacao(String faixa_Etaria,String estilo_Jogo)
    {
   
    }
    
    void pesquisar_classificacao(String faixa_Etaria,String estilo_Jogo)
    {
        
    }

    void editar_classificacao(String faixa_Etaria,String estilo_Jogo)
    {
        
    }
    
    void deletar_classificacao(String faixa_Etaria,String estilo_Jogo)
    {
        
    }

    protected void finalize()
    {
        //codigo para arrumar a casa, antes que o objeto seja apagado
    }
    
}
