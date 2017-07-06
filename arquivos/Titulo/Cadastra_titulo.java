/*


 */
package UsandoInterface1;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author 16113009
 */
public class Cadastra_titulo {
    public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
    String Nome = null;
    System.out.printf("Informe o Nome:\n");
    Nome = ler.next(Nome);
        try (FileWriter arq = new FileWriter("M:\\nome.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf("Nome: \n" + Nome);
        
System.out.printf("\nNome: \n"+ Nome);
        }
    }
}
