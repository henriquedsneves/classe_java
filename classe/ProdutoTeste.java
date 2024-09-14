package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        var p1 = new Produto();
        p1.Nome = "Ps5 Slim";
        p1.Precos = 3900;
        p1.Desconto = 0.10;

        var p2 = new Produto();
        p2.Nome = "PS5 Pro";
        p2.Precos = 7000;
        p2.Desconto = 0.10;

        System.out.println("o "+ p1.Nome + " custa " + p1.Precos );
        double precoFinal1 = p1.precoComDesconto(0);
        double precoFinal2 = p2.precoComDesconto(0.1);
        System.out.println(precoFinal1);
        System.out.println(precoFinal2);


    }
    
}
