public class varias_opcoes {
    void main() {
        IO.println("1 - Opção 1");
        IO.println("2 - Opção 2");
        IO.println("3 - Opção 3");
        IO.println("4 - Sair");

        char opcao = IO.readln("Digite uma opção: ").charAt(0);

        if (opcao == '1') {
            IO.println("Você selecionou a opção 1");
        } else if (opcao == '2') {
            IO.println("Você selecionou a opção 2");
        } else if (opcao == '3') {
            IO.println("Você selecionou a opção 3");
        } else if (opcao == '4') {
            IO.println("Você selecionou sair");
        } else {
            IO.println("Opção inválida!!!");
        }
        char resposta = IO.readln("Deseja escolher outra opção? (s/n)").charAt(0);
        if (resposta == 's' || resposta == 'S') {
        main(); // Chama o método main novamente para reiniciar
        } else {
            IO.println("Encerrando. Até mais!");
        }

    }
}
