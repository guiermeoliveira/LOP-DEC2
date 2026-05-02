import java.math.BigDecimal;

void main () {
        boolean continuarcomprando = true;
        BigDecimal total = new BigDecimal("0.00");

        IO.println("===== Caixa da Loja =====");
        IO.println("Digite o valor dos produtos. Digite 0 para finalizar a compra.");

        while (continuarcomprando) {
            BigDecimal valorProduto = new BigDecimal(IO.readln());
            if (valorProduto.compareTo(BigDecimal.ZERO) == 0) {
                IO.println(String.format("Compra finalizada. Valor total da compra: %.2f", total));
                continuarcomprando = false;
            } else {
                total = total.add(valorProduto);
                IO.println(String.format("Valor do produto adicionado: %.2f", valorProduto));          
            }
        }
    }
