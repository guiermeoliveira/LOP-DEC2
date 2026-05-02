
import java.util.List;

public class calculadora_basica {
    void main() {
        
        // Exibe o menu de operações
        IO.println(List.of("Adição (1)", 
        "Subtração (2)", 
        "Multiplicação (3)", 
        "Divisão (4)", 
        "Potência (5)", 
        "Raiz quadrada (6)", 
        "Número ímpar (7)", 
        "Número par (8)"));
        // Lê a opção escolhida pelo usuário
        int opcao = Integer.parseInt(IO.readln("Escolha uma operação: "));
        // Lê o primeiro número do usuário (necessário para todas as operações)
        // IO.print("Digite o primeiro número: ");
        double n1 = Double.parseDouble(IO.readln("Digite o primeiro número: "));

        // Define o segundo número como 0 por padrão, para operações que não exigem um segundo número
        double n2 = 0; 
        if (opcao >= 1 && opcao <= 5) {

            // Entrada do segundo número para as operações que exigem dois números
            n2 = Double.parseDouble(IO.readln("Digite o segundo número: "));
        }
        // Switch trata as operações com base na opção escolhida pelo usuário
        // Cada caso corresponde a uma operação diferente
        // O resultado é exibido formatado com duas casas decimais
        // Usar o if e else poluiria o código com muitos blocos
        switch (opcao) {
            case 1 -> IO.println(String.format("Resultado: %.2f%n", n1 + n2));
            case 2 -> IO.println(String.format("Resultado: %.2f%n", n1 - n2));
            case 3 -> IO.println(String.format("Resultado: %.2f%n", n1 * n2));
            case 4 -> {
                if (n2 == 0) {
                    IO.println("Erro: divisão por zero!");
                } else {
                    IO.println(String.format("Resultado: %.2f%n", n1 / n2));
                }
            }
            case 5 -> IO.println(String.format("Resultado: %.2f%n", Math.pow(n1, n2)));
            case 6 -> IO.println(String.format("Resultado: %.2f%n", Math.sqrt(n1)));
            case 7 -> IO.println((n1 % 2 != 0) ? n1 + " é ímpar." : n1 + " não é ímpar.");
            case 8 -> IO.println((n1 % 2 == 0) ? n1 + " é par." : n1 + " não é par.");
            default -> IO.println("Opção inválida!");
        }

        // Pergunta ao usuário se deseja realizar outra operação
        char resposta = IO.readln("Deseja realizar outra operação? (s/n)").charAt(0);
        if (resposta == 's' || resposta == 'S') {
            main(); // Chama o método main novamente para reiniciar a calculadora
        } else {
            IO.println("Encerrando a calculadora. Até mais!");
        }        
    }
}
