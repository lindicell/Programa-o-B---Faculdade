/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Abstract.Tipo_de_contaAbstrata;
import javax.swing.JOptionPane;

/**
 *
 * @author 16113041
 */
public class ClassTipo_de_conta extends Tipo_de_contaAbstrata {

    // ATRIBUTOS
    private int idtipo_de_conta = 0;
    private String descricao = "";
    private String tipo = "";

    // CONSTRUTOR
    public ClassTipo_de_conta() {
    }

    public int getIdtipo_de_conta() {
        return idtipo_de_conta;
    }

    public void setIdtipo_de_conta(int idtipo_de_conta) {
        this.idtipo_de_conta = idtipo_de_conta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // sobrescrita de metodos
    @Override
    public void cadastrarTipo_de_conta() {
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
    }

    @Override
    public void pesquisarTipo_de_conta() {
        JOptionPane.showMessageDialog(null, "id:" + getIdtipo_de_conta() + "\n" + "Descricao:" + getDescricao() + "\n" + "Tipo: " + getTipo());
    }

    @Override
    public void editarConta() {

    }

    @Override
    public void excluirConta() {
    }

    // DESTRUTOR
    protected void finalize() {
    }

}
