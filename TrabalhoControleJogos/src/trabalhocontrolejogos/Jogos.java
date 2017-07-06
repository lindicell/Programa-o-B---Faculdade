/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhocontrolejogos;

/**
 *
 * @author 16113037
 */
public class Jogos extends Genero
{
    String nome_jogo = "";
    String ano_jogo = "";
    
    public Jogos(){}
    public Jogos(String novonome_jogo, String novoano_jogo)
    {
        
    }
    
    public void set_nome_jogo(String ne_jg){
        this.nome_jogo = ne_jg ;
    }
    public String get_nome_jogo(){
        return nome_jogo;
    }
    
    public void set_ano_jogo(String an_jg){
        this.ano_jogo = an_jg ;
    }
    public String get_ano_jogo(){
        return ano_jogo;
    }
    
    void cadastrar_Jogos(String nome_jogo,String ano_jogo)
    {
        
    }
    
    void pesquisar_Jogos(String nome_jogo,String ano_jogo)
    {
        
    }

    void editar_Jogos(String nome_jogo,String ano_jogo)
    {
        
    }
    
    void deletar_Jogos(String nome_jogo,String ano_jogo)
    {
        
    }
    
    protected void finalize()
    {
        //codigo para arrumar a casa, antes que o objeto seja apagado
    }
    
}
