public class multa {
    void main() {
        IO.println("--------------------------------------------------");
        double velocidade = Double.parseDouble(IO.readln("Digite a velocidade do veículo em km/h: "));

        if (velocidade <= 80) {
            IO.println("Velocidade dentro do limite permitido. Sem multa.");
        } else {
            IO.println("Você fou multado por excesso de velocidade. o Valor da multa é: R$" + String.format("%.2f", (velocidade - 80) * 50) + ".");
        }
    }
}
