package ProjetoDvd;

/**
 *
 * @author 16113009
 */
public class Genero extends Titulo {
    public Genero(){};
    String Gen;
    
    public String getGen(){
        return Gen;
    }
    
    public void setGen(String Gen){
        this.Gen = "Gênero:" + Gen;
    }
    
    void deletar_Genero(String Gen) 
     {}
    void atualizar_Genero()
    {}
    void pesquisar_Genero()
    {}
    void cadastra_Genero()
    {}
    
    
    protected void finalize(){}

  
    public void nome() {
        System.out.println("teste");
    }
}
