package escola;

public class Escola {
    public static void main(String [] args) {
        Aluno vinicius = new Aluno();
        vinicius.setNome("Vinicius");
        vinicius.setIdade(18);

        System.out.println("O Aluno " + vinicius.getNome() + "  tem  " + vinicius.getIdade() + " anos");
    }
}
