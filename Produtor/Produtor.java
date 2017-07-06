package ProjetoDvd;


import ProjetoDvd.Classificacao;

/**
 *
 * @author 16113009
 */
public class Produtor extends Classificacao {
   public Produtor(){}
   String Nome;
   String Empresa;
   String Pais;
   
   
   public String GetNome(){
       return Nome;
   }
   
   public void setNome(String Nome){
       this.Nome = "Produtor:" + Nome;
   }
   
   public String getEmpresa(){
   
       return Empresa;
   }
   public void setEmpresa(String Empresa){
       this.Empresa = "Empresa:" + Empresa;
   }
   public String getPais(){
       return Pais;
   }
   public void setPais(String Pais){
       this.Pais = "País:" +  Pais;
   }
   
   void deletar_Produtor(String Produtor) 
     {}
    void atualizar_Produtor(String Produtor)
    {}
    void pesquisar_Produtor(String Produtor)
    {}
    void cadastra_Produtor(String Produtor)
    {}
   
   
   
   protected void finalize(){}
    
    
    
    
}
