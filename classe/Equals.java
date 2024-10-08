package classe;
import java.util.Date;
public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Henrique";
        u1.email = "Henrique@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Henrique";
        u2.email = "Henrique@gmail.com";
        
        System.out.println( u1 == u2);
        System.out.println( u1.equals(u2));
        System.out.println( u1.equals(new Date()));
        
    }
    
}