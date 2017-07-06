/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Abstract.UsuarioAbstrata;

/**
 *
 * @author 16113041
 */
public class ClassUsuario extends UsuarioAbstrata {

    // ATRIBUTOS
    private int idusuario = 0;
    private String nome = "";
    private String telefone = "";
    private String celular = "";
    private String endereco = "";
    private int idade = 0;
    private String sexo = "";
    private String tipo_fisica_juridica = "";
    private String cpf_cnpj = "";
    private String senha = "";

    // CONSTRUTOR
    public ClassUsuario() {
    }

    // GET E SET
    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipo_fisica_juridica() {
        return tipo_fisica_juridica;
    }

    public void setTipo_fisica_juridica(String tipo_fisica_juridica) {
        this.tipo_fisica_juridica = tipo_fisica_juridica;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void cadastrarUsuario() {
        System.out.println("Nome: " + getNome());
    }

    // sobrescrita de metodos    
    @Override
    public void pesquisarUsuario() {

    }

    @Override
    public void editarUsuario() {

    }

    @Override
    public void excluirUsuario() {

    }

    // DESTRUTOR
    protected void finalize() {
    }
}
