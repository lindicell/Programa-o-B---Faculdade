/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author 16113041
 */
public class OpeTipo_de_conta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassTipo_de_conta tpc = new ClassTipo_de_conta();
        tpc.setDescricao("tipo_de_conta");
        tpc.setTipo("credito");
        tpc.cadastrarTipo_de_conta();
        tpc.pesquisarTipo_de_conta();
    }
}
