/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author 16113041
 */
public class OpeMovimento_carteira {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassMovimento_carteira c = new ClassMovimento_carteira();
        c.setData_movimento("2017-07-03");
        c.setFkconta(1);
        c.setValor_credito(0);
        c.setValor_debito(0);
        c.insereMovimentoCarteira();
    }
}
