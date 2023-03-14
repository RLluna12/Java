package uscs;


public class TestaPessoa {

   
    public static void main(String[] args) 
    {
        Pessoa p1 = new Pessoa();
        p1.setNome  ("daniel");
        p1.setIdade(19);
        p1.setEmail( "daniel@uol.com");
        System.out.println("Pessoa 1");

        p1.imprime();
        Pessoa p2 = new Pessoa();
        p2.setNome ("Ana");
        p2.setIdade (18);
        p2.setEmail( "ana@uol.com");
        System.out.println("Pessoa 2");

        p2.imprime();
        
    }
    
}
