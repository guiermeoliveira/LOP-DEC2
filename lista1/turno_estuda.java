public class turno_estuda {
    void main() {
        String turno = IO.readln("Olá, qual turno você estuda? (M-Matutino, T-Tarde, N-Noturno): ").toLowerCase();

        String mensagem = switch (turno) {
            case "m" -> "Bom Dia e bons estudos!";
            case "t" -> "Boa Tarde e bons estudos!";
            case "n" -> "Boa Noite e bons estudos!";
            default -> "Valor Inválido!";
        };

        IO.println(mensagem);

        char resposta = IO.readln("Deseja reiniciar? (s/n)").charAt(0);
        if (resposta == 's' || resposta == 'S') {
        main(); // Chama o método main novamente para reiniciar
        } else {
            IO.println("Encerrando. Até mais!");
        }
    }
}
