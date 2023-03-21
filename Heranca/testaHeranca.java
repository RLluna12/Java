package herancafuncionario;

public class testaHeranca {

    public static void main(String[] args) {
       Gerente x = new Gerente(2400, "Paulo", 16700, 55320 ); // x é gerente...

        Funcionario[] set = new Funcionario[3];
        set[0] = x;
        set[1] = new Funcionario("Antonieta",
                760.5, 49211); // set[1] é empregado

        set[2] = new Funcionario("Aurio",
                1220.5, 43678); // set[2] é empregado

        for (int i = 0; i < set.length; i++) {
            System.out.println(set[i].getNome()
                    + " " + set[i].getSalario());
        }
    }

}
