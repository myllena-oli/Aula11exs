public class Main {
    public static void main(String[] args) {

        //aqui teria que usar um print para imprimir e scan para receber os valores das notas.
        double nota1 = 2.0;
        double nota2 = 10.0;
        double nota3 = 7.0;
        double nota4 = 6.0;

        double media;

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Aluno aprovado. A média foi " + media +". ");
        } else {
            System.out.println("Aluno reprovado. A média foi " + media +". ");
        }
    }
}
