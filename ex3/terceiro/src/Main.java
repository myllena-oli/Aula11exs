public class Main {
    public static void main(String[] args) {

        //aqui teria que usar um print para imprimir e scan para receber um valor, dessa forma eu não usaria o for.

        for (int valor = 1; valor < 13; valor++) {
            if (valor <= 10) {
                System.out.println("O valor é " + valor + " e NÃO é maior que 10!.");
            } else {
                System.out.println("O valor é " + valor + " e é maior que 10!.");

            }
        }
    }
}