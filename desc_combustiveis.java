public class desc_combustiveis {
    void main() {
    IO.println("-------------------------");
    IO.println("- TABELA DE DESCONTOS - ");
    IO.println("- ALCOOL: ");
    IO.println("- Até 20 litros: 3% de desconto por Litro, acima de 20 litros: 5% de desconto por Litro");
    IO.println("- GASOLINA: ");
    IO.println("- Até 20 litros: 4% de desconto por Litro, acima de 20 litros: 6% de desconto por Litro");
    IO.println("-------------------------");
    char tipo_combustivel = IO.readln("Digite o tipo de combustível (A para Álcool, G para Gasolina): ").charAt(0);
    double quantidade_litros = Double.parseDouble(IO.readln("Digite a quantidade de litros: "));
    double preco_gasolina;
    double preco_alcool;

    if (tipo_combustivel == 'A' || tipo_combustivel == 'a') {
        preco_alcool = 2.89; // Preço do álcool por litro
        double desconto;
        if (quantidade_litros <= 20) {
            desconto = preco_alcool * 0.03; // 3% de desconto por litro
        } else {
            desconto = preco_alcool * 0.05; // 5% de desconto por litro
        }
        double valor_total = (preco_alcool - desconto) * quantidade_litros;
        IO.println("Valor total a pagar: R$ " + valor_total);
    } else if (tipo_combustivel == 'G' || tipo_combustivel == 'g') {
        preco_gasolina = 4.95; // Preço da gasolina por litro
        double desconto;
        if (quantidade_litros <= 20) {
            desconto = preco_gasolina * 0.04; // 4% de desconto por litro
        } else {
            desconto = preco_gasolina * 0.06; // 6% de desconto por litro
        }
        double valor_total = (preco_gasolina - desconto) * quantidade_litros;
        IO.println("Valor total a pagar: R$ " + valor_total);
    } else {
        IO.println("Tipo de combustível inválido. Por favor, digite 'A' para Álcool ou 'G' para Gasolina.");

    }
}
}
