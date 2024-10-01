package app;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import entidade.*;

public class AppAtividade {

    public static void main(String[] args) 
    {   
        float preco;
        String nome, 
               tipoProduto;
        int quantProdutos;
                
        Scanner sc = new Scanner(System.in);            
        List<Produto> produtos = new ArrayList<>();
        
        System.out.print("Informe quantos produtos deseja inserir: ");
        quantProdutos = sc.nextInt();
        sc.nextLine();
        
        for (int a = 0; a < quantProdutos; a++) 
        {
            System.out.print("Digite qual é o tipo de produto!");
            tipoProduto = sc.nextLine();
            
            System.out.print("Digite o nome do produto: ");            
            nome = sc.nextLine();            
            System.out.print("Digite o preco do produto: ");            
            preco = sc.nextFloat();
            
            switch (tipoProduto.toLowerCase()) 
            {
                case "normal":
                    produtos.add(new ProdutoNormal(nome, preco));
                    break;
                    
                case "importado":                       
                    System.out.print("Informe o valor da taxa: ");
                    float taxa = sc.nextFloat();                    
                    produtos.add(new ProdutoImportado(nome, preco, taxa));
                    break;
                
                case "usado":                                                            
                    System.out.print("Informe a data de fabricação do produto (dd/mm/aaa): ");
                    String data = sc.nextLine();
                    produtos.add(new ProdutoUsado(nome, preco, data));
                    break;
                
                default:
                    System.out.println("Tipo de produto é inválido!");
                    a--;
                    break;
            }
        }
        
        System.out.println("\nEtiqueta de Preco!");
        for (Produto prod : produtos)
        {
            System.out.println(prod.etiquetaPreco());
        }
    }
}