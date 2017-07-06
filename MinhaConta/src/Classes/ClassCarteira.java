/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Abstract.CarteiraAbstrata;

/**
 *
 * @author 16113041
 */
public class ClassCarteira extends Abstract.CarteiraAbstrata {

    // ATRIBUTOS
    private int idcarteira = 0;
    private String descricao = "";
    private double saldo = 0;
    private String fkusuario = "";

    // CONSTRUTOR
    public ClassCarteira() {
    }

    // GET E SET    
    public int getIdcarteira() {
        return idcarteira;
    }

    public void setIdcarteira(int idcarteira) {
        this.idcarteira = idcarteira;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getFkusuario() {
        return fkusuario;
    }

    public void setFkusuario(String fkusuario) {
        this.fkusuario = fkusuario;
    }

    // sobrescrita de metodos
    @Override
    public void cadastrarCarteira() {
        System.out.println("Cadastrado com sucesso!");
    }

    @Override
    public void pesquisarCarteira() {
        System.out.println("Descricao Carteira: " + getDescricao());
    }

    @Override
    public void editarCarteira() {
    }

    @Override
    public void excluirCarteira() {
    }

    // DESTRUTOR
    protected void finalize() {
    }
}
