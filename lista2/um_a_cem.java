public class um_a_cem {
    void main() {
        IO.println("Números de 1 a 100:");
        // 1. Primeiro, declaramos a variável (inicializada com um valor padrão)
        int input;
        boolean validInput = false; // Variável para controlar a validação 
        while (!validInput) { 
            try {
            // 2. A leitura e a conversão DEVEM estar dentro do try
            // Se o usuário digitar "" ou "s", o parseInt pula direto para o catch
            input = Integer.parseInt(IO.readln("Digite um número inteiro: "));

            // 3. Lógica para o número zero ou outros números
            if (input == 0) {
                IO.println("O número é zero.");
            } else if (input >= 1 && input <= 100) {
                IO.println("O número digitado é: " + input);
            } else {
                IO.println("O número digitado está fora do intervalo de 1 a 100.");
            }
            validInput = true; // Se chegou aqui, a entrada é válida


        } catch (NumberFormatException e) {
            // 4. Aqui você trata a entrada vazia ou letras
            IO.println("Entrada inválida. Por favor, digite um número inteiro válido.");
        }
    }
}}
