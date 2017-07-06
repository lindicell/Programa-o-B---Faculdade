/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Loja;

//import Trabalho1.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author 16113013
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Venda venda = new Venda();
        Pessoa pessoa = new Pessoa();
        Produto produto = new Produto();
        
        String resp = JOptionPane.showInputDialog(null, "Deseja realizar uma compra");
        
        while(resp.contentEquals("sim"))
        {
            String login = JOptionPane.showInputDialog(null, "Voce já é cadastrado? ");
            
            if(login.contentEquals("sim"))
            {
                
                produto.setNomeProduto(JOptionPane.showInputDialog(null, "Digite o nome do produto: "));
                produto.listarProduto();
                String respDesconto = JOptionPane.showInputDialog(null, "Possui desconto? ");
                
                if(respDesconto.contentEquals("sim"))
                {
                    produto.setDescontoProduto(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor do desconto: ")));
                }
                else
                {
                    continue;
                }
                venda.cadastrarPedido();
                produto.listarProdutosVendidos();
            }
            else
            {
                pessoa.cadastrarPessoa(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero do tipo de cliente: ")));
            }

            resp = JOptionPane.showInputDialog(null, "Deseja realizar uma nova compra");
        }
    }
}
