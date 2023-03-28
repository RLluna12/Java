
package uscs;


public class TesteAluno {

    
    public static void main(String[] args) {
        Pessoa J = new Pessoa();
        J.setNome("Jose");
        J.setEndereco("Rua Antonio Marques, 30");
        J.setCpf("568.234.981-15");
        J.setRg("3.698.222-8");
        J.ImprimePessoa();
        Aluno P = new Aluno("Pedro","Rua Almeida,20","456.876.123-12","4.687.098-2",59751,4.5,8.0,11);
        P.ImprimeAluno();   
        P.Result();
         Aluno F = new Aluno("Francisco","Rua Almeida,20","456.876.123-12","4.687.098-2",59751,9.0,9.5,11);
         F.ImprimeAluno();
         F.Result();
        
        
        
    }
    
}
