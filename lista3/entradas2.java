import java.util.Random;

public class entradas2 {
    
    // Método que gera o CPF completo
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

    void cpfGerado() {
        IO.println("Gerando 5 CPFs válidos para teste:");
        for (int i = 0; i < 5; i++) {
            IO.println(gerar());
        }
    }
}
