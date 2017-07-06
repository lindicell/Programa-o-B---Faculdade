
package Loja;

import javax.swing.JOptionPane;

public class Produto implements ProdutoInterface {
    public int idProduto;
    public String nomeProduto;
    public float valorAtualProduto;
    public float valorAntigoProduto;
    public float descontoProduto;
    
    public void cadastrarProduto(){}
    public void atualizarProduto(){}
    public void listarProduto(){
        
        switch(getNomeProduto())
        {
            case "Arroz":
                 
                setValorAtual(10.0f);
                
                if(getDescontoProduto() > 0)
                {
                    setValorAtual(getValorAtual() - getDescontoProduto());
                }
                
             break;
                
            case "Feijao":
                
                setValorAtual(550.0f);
               
                if(getDescontoProduto() > 0)
                {
                    setValorAtual(getDescontoProduto() - getValorAtual());
                }
             
             break;
        }
    }
    public void deletarProduto(){}
    
    public void listarProdutosVendidos()
    {
        JOptionPane.showMessageDialog(null, getNomeProduto() + ": " + getValorAtual());
    }
    
    public int getIdProduto(){
        return idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
    
    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    
    public float getValorAtual(){
        return valorAtualProduto;
    }

    public void setValorAtual(float valorAtualProduto){
        this.valorAtualProduto = valorAtualProduto;
    }
    
    public float getValorAntigo(){
        return valorAntigoProduto;
    }

    public void setValorAntigo(float valorAntigoProduto){
        this.valorAntigoProduto = valorAntigoProduto;
    }

    public void setDescontoProduto(float descontoProduto) {
        this.descontoProduto = descontoProduto;
    }

    public float getDescontoProduto() {
        return descontoProduto;
    }
}
