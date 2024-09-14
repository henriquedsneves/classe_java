package classe;

public class Produto {
    String Nome;
    double Precos;
    double Desconto;
    double precoComDesconto(double descontoDoGerente){
        return Precos * (1- (Desconto + descontoDoGerente));
    }

}