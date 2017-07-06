/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Loja;

/**
 *
 * @author 16113013
 */
public class Estoque {
    public int idEstoque;
    public int qtdEstoque;
    
    void cadastrarEstoque(){}
    void atualizarEstoque(){}
    void listarEstoque(){} 
    
    public int getIdEstoque(){
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque){
        this.idEstoque = idEstoque;
    }    
    
    public int getQtdEstoque(){
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque){
        this.qtdEstoque = qtdEstoque;
    }    
}
