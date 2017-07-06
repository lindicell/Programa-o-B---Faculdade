/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author 16113041
 */
public class ClasseGenericaGravar {

    private String resultado = "";

    public ClasseGenericaGravar() {
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void GravarArquivo(String caminho, String mensagem) {
        String caminho_arquivo = caminho;
        try {
            FileWriter arq = new FileWriter(caminho_arquivo);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf(mensagem);
            arq.close();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso em: " + caminho_arquivo);
        } catch (IOException e) {
            System.err.printf("Erro ao gravar arquivo: %s.\n",
                    e.getMessage());
        }

    }

    protected void finalize() {
    }
}
