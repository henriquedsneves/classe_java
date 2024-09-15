package classe;

public class Data {
      // A data tem que ser 01/01/1970
    int dia;
    int mes;
    int ano;

     Data(){
          dia = 1;
          mes = 1;
          ano = 1970;

     }
     Data(int diaPadrao, int mesPadrao,int anoPadrao){
          dia = diaPadrao;
          mes = mesPadrao;
          ano = anoPadrao;
     }

     // Método
   String obterDataFormatada(){
        return  String.format("%d/%d/%d", dia, mes,ano);
   }
    
}
