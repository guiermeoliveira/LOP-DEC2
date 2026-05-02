import java.util.Random;

public class entradas {;

    public String gerar() {
        Random random = new Random();
        int[] cpf = new int[11];

        // 1. Gera os 9 primeiros dígitos aleatórios
        for (int i = 0; i < 9; i++) {
            cpf[i] = random.nextInt(10);
        }
        // 2. Calcula o 1º dígito (mesma lógica que você já fez)
        cpf[9] = calcularDigito(cpf, 10);

        // 3. Calcula o 2º dígito
        cpf[10] = calcularDigito(cpf, 11);

        // 4. Converte o array para String
        StringBuilder sb = new StringBuilder();
        for (int num : cpf) {
            sb.append(num);
        }
        return sb.toString();
    }

    // Método auxiliar para não repetir código de cálculo
    private int calcularDigito(int[] cpf, int pesoInicial) {
        int soma = 0;
        int peso = pesoInicial;
        
        // Se pesoInicial é 10, percorre 9 dígitos. Se é 11, percorre 10.
        for (int i = 0; i < (pesoInicial - 1); i++) {
            soma += cpf[i] * peso--;
        }

        int resto = (soma * 10) % 11;
        return (resto == 10) ? 0 : resto;
    }

    void main() {
    int quantidade = 10; // Quantos CPFs você quer gerar
    
    IO.println("=========================================================================================");
    // %-15s -> String com 15 espaços, alinhada à esquerda
    IO.println(String.format("| %-15s | %-5s | %-60s |", "CPF", "COD", "REGIÃO FISCAL"));
    IO.println("-----------------------------------------------------------------------------------------");

    for (int i = 0; i < quantidade; i++) {
        String cpf = gerar();
        int regionCod = Character.getNumericValue(cpf.charAt(8));
        
        String regiao = switch (regionCod) {
            case 1 -> "DF, GO, MT, MS, TO";
            case 2 -> "AM, PA, RR, AP, AC, RO";
            case 3 -> "CE, MA, PI";
            case 4 -> "PB, PE, AL, RN";
            case 5 -> "BA, SE";
            case 6 -> "Minas Gerais";
            case 7 -> "RJ, ES";
            case 8 -> "São Paulo";
            case 9 -> "PR, SC";
            case 0 -> "Rio Grande do Sul";
            default -> "Desconhecido";
        };

        // Formata o CPF para ficar bonitinho: 000.000.000-00
        String cpfFormatado = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + 
                              cpf.substring(6, 9) + "-" + cpf.substring(9, 11);

        IO.println(String.format("| %-15s | %-5d | %-60s |", cpfFormatado, regionCod, regiao));
    }
    IO.println("=========================================================================================");
}
}