public class somente_pares {
    void main() {
        IO.println("--------------------------------");
        IO.println("Bem vindo! pronto pra ver os numeros pares de 1 a 100?");
        IO.println("--------------------------------");
        char resposta = IO.readln("Digite 's' para sim ou 'n' para não: ").charAt(0);
        IO.println("--------------------------------");
        if (resposta == 's' || resposta == 'S') {
            IO.println("Aqui estão os números pares de 1 a 100:");
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    IO.println(i);
                    try {
                        Thread.sleep(500); // Pausa de 500 milissegundos para melhor visualização
                    } catch (InterruptedException e) {
                        IO.println("A exibição foi interrompida!");
                        return;
                    }
                }
            }
        } else if (resposta == 'n' || resposta == 'N') {
            IO.println("Tudo bem! Se mudar de ideia, é só executar o programa novamente.");
        } else {
            IO.println("Resposta inválida. Por favor, execute o programa novamente e digite 's' ou 'n'.");
        }
    }
}
