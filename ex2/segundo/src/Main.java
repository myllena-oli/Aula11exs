public class Main {
    public static void main(String[] args) {

        //aqui teria que usar um print para imprimir e scan para receber os valores de altura e peso.
        double altura = 1.63;
        double peso = 66;
        double imc = peso / (altura * altura);


        if (imc < 18.5) {
            System.out.println("Usuário se encontra em classificação de peso: magreza.");
        } else if (imc < 24.9) {
            System.out.println("Usuário se encontra em classificação de peso normal.");
        } else if (imc < 29.9) {
            System.out.println("Usuário se encontra em classificação de peso: sobrepeso.");
        } else if (imc < 39.9) {
            System.out.println("Usuário se encontra em classificação de peso: obesidade.");
        } else {
            System.out.println("Usuário se encontra em classificação de peso: obesidade grave.");
        }

    }
}