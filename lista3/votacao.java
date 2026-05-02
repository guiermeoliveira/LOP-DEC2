public class votacao {
    void main() {
        int total = 0;
        int joao = 0;
        int maria = 0;
        int nulo = 0;

        IO.println("============= || Bem-vindo à votação! || ============");
        IO.println("Por favor, vote para João (1), Maria (2) ou Nulo (3).");
        
        while (total < 10) {
            try{
            int voto = Integer.parseInt(IO.readln("Por gentileza, insira seu voto (1, 2 ou 3): ")); // código para ler o voto do usuário
            if (voto == 1) {
                joao++;
                IO.println("Voto registrado.");
            } else if (voto == 2) {
                maria++;
                IO.println("Voto registrado.");
            } else if (voto == 3) {
                nulo++;
                IO.println("Voto registrado.");
            } else {
                IO.println("Voto inválido. Por favor, insira um voto válido (1, 2 ou 3).");
                continue; // Pula para a próxima iteração sem incrementar o total
            }
            total++;
            } catch (NumberFormatException e) {
                IO.println("Entrada inválida. Por favor, insira um número (1, 2 ou 3).");
            }
            if (total == 10) {
                IO.println("Votação encerrada!");
                IO.println("Total de votos para João: " + joao);
                IO.println("Total de votos para Maria: " + maria);
                IO.println("Total de votos nulos: " + nulo);
                IO.println("Vencedor: " + (joao > maria ? "João" : maria > joao ? "Maria" : "Empate"));
            }

        }
    }
}