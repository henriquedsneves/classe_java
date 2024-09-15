package classe;
// aplicar 25% para todos os produtos mas pode aumentar
public class Produto {
    String Nome;
    double Precos;
    static double Desconto = 0.25;
   

    Produto(){
        
    }

    Produto(String nomeInicial){
        Nome = nomeInicial;
    }
   
    Produto(String nomeInicial, double precoInicial){
        Nome = nomeInicial;
        Precos = precoInicial;
    }

    // Método
    double precoComDesconto(double descontoDoGerente){
        return Precos * (1- (Desconto + descontoDoGerente));
    }

}
