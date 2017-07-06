package ProjetoDvd;

import AnoAbstract;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16113009
 */
public class Ano extends AnoAbstract {
    public  Ano(){}
   
    
    Integer Ano = 0;
    
    public Integer getAno(){
        return Ano;
    }
    
    public void setAno(Integer Ano){
        this.Ano = Ano;
    }
   
    
    //
    void deletar_Ano(int Ano) 
     {}
    void atualizar_Ano()
    {}
    void pesquisar_Ano()
    {
        System.out.println("Ano: " + getAno());
    }
    void cadastra_Ano()
    {
        System.out.println("Cadastrado com sucesso!");
    }
    
    
    
    protected void finalize(){}
    
}
