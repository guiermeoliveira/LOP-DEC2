public class residencia_social {
    void main() {

        
        double consumo = Double.parseDouble(IO.readln("Digite o consumo de água (m³): "));

        double valor;

        if (consumo <= 10) {
            valor = 7.59;
        } else if (consumo <= 20) {
            valor = consumo * 1.31;
        } else if (consumo <= 30) {
            valor = consumo * 4.64;
        } else if (consumo <= 50) {
            valor = consumo * 6.62;
        } else {
            valor = consumo * 7.31;
        }

        IO.println(String.format("Valor da conta: R$ %.2f%n", valor));
        char resposta = IO.readln("Deseja reiniciar? (s/n)").charAt(0);
        if (resposta == 's' || resposta == 'S') {
            main(); // Chama o método main novamente para reiniciar a calculadora
            } else {
                IO.println("Encerrando a calculadora. Até mais!");
            }
    }
}
