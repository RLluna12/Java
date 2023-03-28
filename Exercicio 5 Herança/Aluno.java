
package uscs;


public class Aluno extends Pessoa {
    private int matricula;
    private double P1;
    private double P2;
    private int faltas;
    
    public Aluno (){
        
    }

    public Aluno(String nome, String endereco, String cpf, String rg, int matricula, double P1, double P2, int faltas ) {
        super(nome, endereco, cpf, rg);
        this.matricula = matricula;
        this.P1 = P1;
        this.P2= P2;
        this.faltas = faltas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double P1) {
        this.P1 = P1;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double P2) {
        this.P2 = P2;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
    public void Result(){
        double media = (getP1()+ getP2())/2;
        if(faltas >10){
            System.out.println("Reprovado");
        }
        else if(media >= 7){
            System.out.println("Aprovado");
        }
            else if (media < 3){
                    System.out.println("Reprovado");
            }
            else{
                System.out.println("Reavaliacao");
            }
        }
    public void ImprimeAluno(){
        ImprimePessoa();
        System.out.println("Matricula: "+ getMatricula());
        System.out.println("Nota P1: "+ getP1());
        System.out.println("Nota P2: "+ getP2());
        System.out.println("Faltas: "+ getFaltas());
    }
    }


