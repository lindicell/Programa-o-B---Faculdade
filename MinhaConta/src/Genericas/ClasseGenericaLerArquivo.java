/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author 16113041
 */
public class ClasseGenericaLerArquivo {

    private String Resultado = "";

    public ClasseGenericaLerArquivo() {
    }

    public String getResultado() {
        return Resultado;
    }

    public void setResultado(String Resultado) {
        this.Resultado = Resultado;
    }

    public void LerArquivo(String caminho) {
        try {
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            String temp = "";
            while (linha != null) {
                temp = temp + linha + "\n";
                setResultado(temp);
                linha = lerArq.readLine();
            }
            JOptionPane.showMessageDialog(null, temp);
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
        //return caminho;

    }

    protected void finalize() {
    }
}
