/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author 16113041
 */
public class ClassConta extends Abstract.ContaAbstrata {

    // ATRIBUTOS
    private int id_conta = 0;
    private int fk_tipo_conta = 0;
    private String descricao = "";
    private String data = "";
    private double valor = 0;

    // CONSTRUTOR
    public ClassConta() {
    }

    public int getIdconta() {
        return id_conta;
    }

    public void setIdconta(int idconta) {
        this.id_conta = idconta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getFktipo_conta() {
        return fk_tipo_conta;
    }

    public void setFktipo_conta(int fktipo_conta) {
        this.fk_tipo_conta = fktipo_conta;
    }

    // DESTRUTOR
    protected void finalize() {
    }

    // sobrescrita de metodos    
    @Override
    public void cadastrarConta() {

    }

    @Override
    public void pesquisarConta() {

    }

    @Override
    public void editarConta() {

    }

    @Override
    public void excluirConta() {

    }
}
