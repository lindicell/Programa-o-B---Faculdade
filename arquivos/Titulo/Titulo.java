package ProjetoDvd;






/**
 *
 * @author 16113009
 */
public abstract class Titulo  {
    public Titulo(){}
    public abstract void nome();
   
    
    String Tittle;
    Integer Minutos;
    String Cor;
    Integer Qualidade;
    
    public String getTittle (){
        return Tittle;
    }
    
    public void setTittle(String Tittle)
    {
        this.Tittle = "Titulo:" + Tittle;
    }
    
    public Integer getMinutos(){
        return Minutos;
    }
    public void setMinutos(Integer Minutos)
    {
        this.Minutos = Minutos;
    }
    
    public String getCor(){
        return Cor;
    }
    public void setCor(String Cor)
    {
        this.Cor = Cor;
    }
    public Integer getQualidade(){
        return Qualidade;
    }
    public void setQualidade(Integer Qualidade){
        this.Qualidade = Qualidade;
    }
   
    void deletar_Titulo(String Titulo) 
     {}
    void atualizar_Titulo()
    {}
    void pesquisar_Titulo()
    {}
    void cadastra_Titulo()
    {}
            
            
    protected void finalize(){}
}
