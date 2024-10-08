// Autores: Camile Oliveira e Gabriel Olavo

package com.mycompany.imagensadaptadas;

import entidade.*;
import java.util.Scanner;

public class ImagensAdaptadas 
{
    public static void main(String[] args) 
    {
       // Declaração de Objetos e variáveis
        
       String caminhoImagem;
       ImagemJPG imagemJPG = new ImagemJPG();
       Scanner scan = new Scanner(System.in);
       
       // Leitura de dados
       
       System.out.print("Informe o caminho da imagem para realizar a conversão: ");
       caminhoImagem = scan.nextLine();
              
       ConversorImagemPNG adapter = new AdapterImagemJPG(imagemJPG);
       
       // Salvando a imagem JPG
         
       imagemJPG.salvarImagemJPG(caminhoImagem);
       
       // Convertendo a imagem para PNG
       adapter.converterParaPNG(caminhoImagem);
    }
}
