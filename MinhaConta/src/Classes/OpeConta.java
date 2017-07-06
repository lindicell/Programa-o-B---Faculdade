/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author 16113041
 */
public class OpeConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassConta c = new ClassConta();
        c.setIdconta(1);
        c.setDescricao("Teste");
        c.setData("2017-07-03");
        c.setValor(0);        
        c.cadastrarConta();
        c.pesquisarConta();
    }
}
