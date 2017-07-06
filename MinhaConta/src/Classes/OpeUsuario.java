/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author 16113041
 */
public class OpeUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassUsuario u = new ClassUsuario();
        u.setNome("Teste");
        u.setSenha("*****");
        u.setCpf_cnpj("12345678974");
        u.setTipo_fisica_juridica("F");
        u.setCelular("5192345678");
        u.setTelefone("314125478");
        u.setEndereco("XXXX, 94");
        u.cadastrarUsuario();
    }
}
