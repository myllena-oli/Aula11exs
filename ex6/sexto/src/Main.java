public class Main {
    public static void main(String[] args) {

        //aqui teria que usar um print para imprimir e scan para receber o valor das variáveis.
        String time1 = "flamengo";
        String time2 = "fluminense";
        int golsFla = 3;
        int golsFlu = 0;

        if (golsFla > golsFlu) {
            System.out.println(time1);
        } else if (golsFlu > golsFla) {
            System.out.println(time2);
        } else {
            System.out.println("EMPATE");
        }
    }
}