public class validar_int {
    void main() {
        // 1. Primeiro, declaramos a variável (inicializada com um valor padrão)
        int input; 

        try {
            // 2. A leitura e a conversão DEVEM estar dentro do try
            // Se o usuário digitar "" ou "s", o parseInt pula direto para o catch
            input = Integer.parseInt(IO.readln("Digite um número inteiro: "));

            // 3. Lógica para o número zero ou outros números
            if (input == 0) {
                IO.println("O número é zero.");
            } else {
                IO.println("O número digitado é: " + input);
            }

        } catch (NumberFormatException e) {
            // 4. Aqui você trata a entrada vazia ou letras
            IO.println("Entrada inválida. Por favor, digite um número inteiro válido.");
        }
    }
}