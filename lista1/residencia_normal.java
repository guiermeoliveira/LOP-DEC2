public class residencia_normal {
    void main() {
        
        double consumo = Double.parseDouble(IO.readln("Digite o consumo de água (m³): "));

        double valor;

        if (consumo <= 10) {
            valor = 22.38;
        } else if (consumo <= 20) {
            valor = consumo * 3.50;
        } else if (consumo <= 50) {
            valor = consumo * 8.75;
        } else {
            valor = consumo * 9.64;
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
