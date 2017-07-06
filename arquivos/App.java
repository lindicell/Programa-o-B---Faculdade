/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UsandoInterface1;

/**
 *
 * @author 16113009
 */
public class App {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
      int d=0;
      int a=42/d;
      
      System.out.println("Execução continua!");
    }
        catch(ArithmeticException E)
        {
        System.out.println("Minha mensagem "+E.getMessage());
           System.out.println("Minha mensagem "+E.getCause());
           System.out.println("Minha mensagem "+E.getStackTrace());
           System.out.println("Minha mensagem "+E.getClass());
        
        }
        
        catch (Exception E){
           System.out.println("Minha mensagem "+E.getMessage());
           System.out.println("Minha mensagem "+E.getCause());
           System.out.println("Minha mensagem "+E.getStackTrace());
           System.out.println("Minha mensagem "+E.getClass());
    }
        
        
        finally{
            System.out.println("Sempre é executado!");
        }
    }
}
