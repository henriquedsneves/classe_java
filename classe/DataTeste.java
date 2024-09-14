package classe;
public class DataTeste {
    public static void main(String[] args) {
        var d1 = new Data();
        d1.dia = 16;
        d1.mes = 5;
        d1.ano = 2009;

        var d2 = new Data();
        d2.dia = 1;
        d2.mes = 1;
        d2.ano = 2025;

        
        System.out.println(d1.obterDataFormatada() );
        System.out.println(d2.obterDataFormatada() );



    }
    
}
