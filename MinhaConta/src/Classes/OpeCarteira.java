/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author 16113041
 */
public class OpeCarteira {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassCarteira c = new ClassCarteira();
        c.setIdcarteira(1);
        c.setDescricao("Teste");
        c.setSaldo(10);
        c.cadastrarCarteira();
        c.pesquisarCarteira();
    }
}
