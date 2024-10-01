package classe;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Henrique", 78);

        Comida c1 = new Comida("Arroz", 0.300);
        var c2 = new Comida("Carne", 0.200);
        System.out.println(p1.nome + " comeu " + c1.nome + " e " + c2.nome);
        System.out.println("Antes ele tinha " + p1.peso + "kg");
        System.out.println(p1.peso + c1.peso + c2.peso + "kg");
    }
    
    
}
