package trabalhocontrolejogos;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16113037
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class GravarArquivo 
{
    private String generico_arquivo = "";
    
    public GravarArquivo(){}

    public String getGenerico_arquivo() {
        return generico_arquivo;
    }
    public void setGenerico_arquivo(String generico_arquivo) {
        this.generico_arquivo = generico_arquivo;
    }
    
    public void cadastrar_arquivo(String caminho, String texto)
    {
        String temp_caminho = caminho;//armazena o nome do arquivo
        
        try//pesquisa o arquivo e lê o arquivo
        {
            FileWriter arq = new FileWriter(temp_caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
            //gravarArq.printf("+--Resultado--+%n");
            gravarArq.printf(texto);
            arq.close();
        } catch (IOException e)//apresenta se o codigo estiver com algum erro.
        {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
            e.getMessage());
        }
        System.out.println();
    }
    
    protected void finalize(){} 
}
