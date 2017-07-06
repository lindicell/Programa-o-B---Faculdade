/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhocontrolejogos;

/**
 *
 * @author 16113037
 */
public class Plataforma 
{
    String nome_plataforma = "";
    String ano_plataforma = "";
    String fabricante_plataforma = "";
    
    public Plataforma(){}
    public Plataforma(String novonome_plataforma, String novoano_plataforma,String novofabricante_plataforma)
    {
        
    }
    
    public void set_nome_plataforma(String n_pl){
        this.nome_plataforma = n_pl ;
    }
    public String get_nome_plataforma(){
        return nome_plataforma;
    }
    
    public void set_ano_plataforma(String an_pl){
        this.ano_plataforma = an_pl ;
    }
    public String get_ano_plataforma(){
        return ano_plataforma;
    }
    
    public void set_fabricante_plataforma(String fb_pl){
        this.fabricante_plataforma = fb_pl ;
    }
    public String get_fabricante_plataforma(){
        return fabricante_plataforma;
    }
    
    void cadastrar_Plataforma(String nome_plataforma,String ano_plataforma, String fabricante_plataforma)
    {
        
    }
    
    void pesquisar_Plataforma(String nome_plataforma,String ano_plataforma, String fabricante_plataforma)
    {
        
    }

    void editar_Plataforma(String nome_plataforma,String ano_plataforma, String fabricante_plataforma)
    {
        
    }
    
    void deletar_Plataforma(String nome_plataforma,String ano_plataforma, String fabricante_plataforma)
    {
        
    }
    
    protected void finalize()
    {
        //codigo para arrumar a casa, antes que o objeto seja apagado
    }
    
}
