/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Loja;

import javax.swing.JOptionPane;

/**
 *
 * @author 16113013
 */
public class Pessoa extends loja.PessoaAbstract{
    public int idTipo;
    public String nomeTipo;
    
    public void cadastrarPessoa(int idtipo){
        
        switch(idTipo) {
           case 1:
           int idCliente;
           String nomeCliente;
           int cpfCliente;
           break;

           case 2:
           int idFuncionario;
           String nomeFuncionario;
           float salarioFuncionario;
           String Setor;
           break;
                              
           case 3:
           int idFornecedor;
           String nomeFornecedor;          
           break;
              
           default:
           JOptionPane.showMessageDialog(null, "Numero invalido. Digite 1: Cliente | 2: Funcionario | 3: Fornecedor");
           break;
        }
    }
    
}
