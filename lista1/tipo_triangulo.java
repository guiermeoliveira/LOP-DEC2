public class tipo_triangulo {
    void main() {
        double a = Double.parseDouble(IO.readln("Digite o lado A: "));
        double b = Double.parseDouble(IO.readln("Digite o lado B: "));
        double c = Double.parseDouble(IO.readln("Digite o lado C: "));

        // boolean verifica se os lados formam um triângulo usando a desigualdade triangular
        boolean formaTriangulo = (a + b > c) && (a + c > b) && (b + c > a);

        if (!formaTriangulo // *!formaTriangulo* == verdadeiro se os lados NÃO formarem um triângulo
        ) {
            IO.println("Os valores informados NÃO formam um triângulo.");
        } else {
            // Determina o tipo do triângulo com base nos lados se eles formarem um triângulo
            String tipo;
            if (a == b && b == c) {
                tipo = "Equilátero";
            } else if (a == b || a == c || b == c) {
                tipo = "Isósceles";
            } else {
                tipo = "Escaleno";
            }
            IO.println("Os valores formam um triângulo " + tipo + ".");

            char resposta = IO.readln("Deseja saber outro tipo de triângulo? (s/n)").charAt(0);
            if (resposta == 's' || resposta == 'S') {
                main(); // Chama o método main novamente para reiniciar o processo
            } else {
                IO.println("Encerrando. Até mais!");
            }
        }
    }
}
