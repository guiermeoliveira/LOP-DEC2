public class cinco_num {
    int num1, num2, num3, num4, num5;
    boolean entradaValida = false;
    void main() {
    while (!entradaValida) {
        try{
        num1 = Integer.parseInt(IO.readln("Digite o primeiro número: "));
        num2 = Integer.parseInt(IO.readln("Digite o segundo número: "));
        num3 = Integer.parseInt(IO.readln("Digite o terceiro número: "));
        num4 = Integer.parseInt(IO.readln("Digite o quarto número: "));
        num5 = Integer.parseInt(IO.readln("Digite o quinto número: "));
        entradaValida = true; // Se chegou aqui, a entrada é válida
        IO.println("Os números digitados foram: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
    } catch (NumberFormatException e) {
        IO.println("Entrada inválida. Por favor, digite um número inteiro válido.");
    }
    }
}}