package utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FuncoesUteis {

    
    public int Soma(int a, int b) {
        return a + b;
    }

    
    public void Triangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    
    public void printArquivo(String caminhoArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}

package aplicacao;

import utilidades.FuncoesUteis;

public class Main {

    public static void main(String[] args) {
        
        FuncoesUteis util = new FuncoesUteis();

        
        int resultadoSoma = util.Soma(5, 10);
        System.out.println("Resultado da soma: " + resultadoSoma);

        
        System.out.println("Exibindo triângulo de altura 5:");
        util.Triangulo(5);

        
        System.out.println("Conteúdo do arquivo:");
        util.printArquivo("caminho/do/arquivo.txt");  
    }
}

