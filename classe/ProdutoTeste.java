package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        // usando o contrutor novo de forma Explícita
        var p1 = new Produto("Ps5 Slim", 3900);
      
        // usando o construtor padrão ou Método
        var p2 = new Produto();
        p2.Nome = "PS5 Pro";
        p2.Precos = 7000;
       

        System.out.println("o "+ p1.Nome + " custa " + p1.Precos );
        double precoFinal1 = p1.precoComDesconto(0);
        double precoFinal2 = p2.precoComDesconto(0.1);
        System.out.println(precoFinal1);
        System.out.println(precoFinal2);


    }
    
}
