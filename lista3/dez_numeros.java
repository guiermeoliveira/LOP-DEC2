void main() {
    IO.println("=======================");
    int somatotal = 0;
    int maior = Integer.MIN_VALUE;
    int menor = Integer.MAX_VALUE;
    int media;
    int somapares = 0;
    int contapares = 0;
    int somaimpares = 0;
    int contaimpares = 0;
    
    for (int i = 0; i < 10; i++) {
        try{
        int numero = Integer.parseInt(IO.readln("Digite o " + (i+1) + "º número inteiro: "));
        somatotal += numero;
        if (numero > maior) {
            maior = numero;
        }
        if (numero < menor) {
            menor = numero;
        }
        if (numero % 2 == 0) {
            somapares += numero;
            contapares++;
        } else {
            somaimpares += numero;
            contaimpares++;
        }
    } catch (NumberFormatException e) {
        IO.println("Entrada inválida. Por favor, digite um número inteiro.");
        i--; // Decrementa o contador para repetir a entrada
    }
    }
    media = somatotal / 10;
    IO.println("============ || =============");
    IO.println("Soma total: " + somatotal);
    IO.println("Maior número: " + maior);
    IO.println("Menor número: " + menor);
    IO.println("Média: " + media);
    IO.println("Soma dos pares: " + somapares);
    IO.println("Quantidade de pares: " + contapares);
    IO.println("Soma dos ímpares: " + somaimpares);
    IO.println("Quantidade de ímpares: " + contaimpares);
}