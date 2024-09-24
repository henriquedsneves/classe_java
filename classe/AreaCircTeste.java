package classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        
        var a1 = new AreaCirc(5.6); 
        System.out.println(a1.area());

        var a2 = new AreaCirc(5);
        
        System.out.println(AreaCirc.PI);
        System.out.println(a2);
    }
        
}
