
package Loja;

public class Venda extends loja.VendaAbstract{
    public int idPedido;
    public int qtdVendido;
    public float descontoPedido;

    public void cadastrarPedido(){
    }
    
    public float getIdPedido(){
        return idPedido;
    }

    public void setIdPedido(int idPedido){
        this.idPedido = idPedido;
    }    
    
    public float getQtdVendido(){
        return qtdVendido;
    }

    public void setQtdVendido(int qtdVendido){
        this.qtdVendido = qtdVendido;
    }
    
    public float getDesconto(){
        return qtdVendido;
    }

    public void setDesconto(float descontoPedido){
        this.descontoPedido = descontoPedido;
    }   
    
     public  void listarProduto(){}
    
    
}
