/*
 * ============================================================
 * Mauricio de Melo Zaquia
 * 
 * Estimado = Controle de carteira - 20Hr - R$100 = R$5,00
 * Total = Controle de carteira - 33Hr Aula + 10Hr casa = 43 Hr - R$100 = R$2,38
 * ============================================================
 *
 * # Classes
 *
 * -ClassUsuario
 * int idusuario;
 * string nome;
 * string senha;
 * 
 * -Carteira
 * int idcarteira;
 * string descricao;
 * float saldo;
 * 
 * -Tipo de Conta
 * int idtipo_de_conta;
 * string descricao;
 * string tipo; 
 * 
 * -Conta
 * int idconta;
 * int fktipo_conta;
 * String descricao;
 * date data;
 * double valor;
 *
 * -Movimento_carteira
 * int idmovimento_carteira;
 * int fkconta;
 * Date data_movimento;
 * 
 * ============================================================ 
 */
package Documentacao;

import Classes.ClassUsuario;

/**
 *
 * @author 16113041
 */
public class MinhaConta extends ClassUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
    }
}
