/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhocontrolejogos;

/**
 *
 * @author 16113037
 */
public class Produtora extends Plataforma
{
    String nome_produtora = "";
    String ano_produtora = "";
    
    public Produtora(){}
    public Produtora(String novonome_produtora, String novoano_produtora)
    {
        
    }
    
    public void set_nome_produtora(String nm_pr){
        this.nome_produtora = nm_pr ;
    }
    public String get_nome_produtora(){
        return nome_produtora;
    }
    
    public void set_ano_plataforma(String an_pr){
        this.ano_produtora = an_pr ;
    }
    public String get_ano_plataforma(){
        return ano_produtora;
    }
    
    void cadastrar_Produtora(String nome_produtora,String ano_produtora)
    {
        
    }
    
    void pesquisar_Produtora(String nome_produtora,String ano_produtora)
    {
        
    }

    void editar_Produtora(String nome_produtora,String ano_produtora)
    {
        
    }
    
    void deletar_Produtora(String nome_produtora,String ano_produtora)
    {
        
    }
    
    protected void finalize()
    {
        //codigo para arrumar a casa, antes que o objeto seja apagado
    }
    
}
