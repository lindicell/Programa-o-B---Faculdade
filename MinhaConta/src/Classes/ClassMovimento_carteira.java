/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author 16113041
 */
public class ClassMovimento_carteira extends Abstract.Movimento_carteiraAbstrata {

    // ATRIBUTOS
    private int id_movimento_carteira = 0;
    private int fk_conta = 0;
    private String data_movimento = "";
    private double valor_credito = 0;
    private double valor_debito = 0;

    // CONSTRUTOR
    public ClassMovimento_carteira() {
    }

    public int getIdmovimento_carteira() {
        return id_movimento_carteira;
    }

    public void setIdmovimento_carteira(int idmovimento_carteira) {
        this.id_movimento_carteira = idmovimento_carteira;
    }

    public int getFkconta() {
        return fk_conta;
    }

    public void setFkconta(int fkconta) {
        this.fk_conta = fkconta;
    }

    public String getData_movimento() {
        return data_movimento;
    }

    public void setData_movimento(String data_movimento) {
        this.data_movimento = data_movimento;
    }

    public double getValor_credito() {
        return valor_credito;
    }

    public void setValor_credito(double valor_credito) {
        this.valor_credito = valor_credito;
    }

    public double getValor_debito() {
        return valor_debito;
    }

    public void setValor_debito(double valor_debito) {
        this.valor_debito = valor_debito;
    }

    // DESTRUTOR
    protected void finalize() {
    }

    // sobrescrita de metodos
    @Override
    public void insereMovimentoCarteira() {

    }
}
