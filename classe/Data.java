package classe;

public class Data {
      // A data tem que ser 01/01/1970
    int dia;
    int mes;
    int ano;

     Data(){
          //dia = 1;
          //mes = 1;
          //ano = 1970;
          this(1, 1, 1970); // como método

     }
     Data(int dia, int mesPadrao,int anoPadrao){
          this.dia = dia; // como instancia
          mes = mesPadrao;
          ano = anoPadrao;
     }

     // Método
   String obterDataFormatada(){
        return  String.format("%d/%d/%d", dia, mes,ano);
   }
    
}
