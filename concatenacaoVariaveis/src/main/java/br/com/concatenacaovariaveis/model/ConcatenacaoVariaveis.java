package br.com.concatenacaovariaveis.model;

public class ConcatenacaoVariaveis {

    public static void main(String[] args) {
        float precoCompt = 2100.00f,
              precoMesa = 650.50F;
        double codigo = 5290.00F; 
        byte idade = 30;
        char sexo = 'F';
        
        System.out.println ("Produtos:");
        System.out.printf ("Computador, o preço é $ %.2f\n", precoCompt);
        System.out.printf ("Mesa de Escritório, o preço é $ %.2f\n\n", precoMesa);
        System.out.printf ("Registro: %d anos de idade, código %.2f e sexo: %c\n\n", idade, codigo, sexo);
        System.out.printf ("Medida com oito casas decimais: %.8f\n", codigo);
        System.out.printf ("Arredondamento (três casas decimais): %.3f\n", codigo);
        System.out.printf ("Decimal usado nos EUA: %.3f\n", codigo);
        
    }
}
