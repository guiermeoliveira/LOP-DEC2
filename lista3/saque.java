import java.math.BigDecimal;

public class saque {
    void main() {
        BigDecimal valor_inicial = new BigDecimal("500.00");
        int sacar = 1;
        int deposito = 2;
        int saldo = 3;
        int sair = 4;

        IO.println("============================ || Bem-vindo! || =========================");
        IO.println("Seu saldo é: " + valor_inicial);
        IO.println("Qual operação deseja realizar?");
        IO.println("Digite '1' para saque, '2' para depósito, '3' para saldo e '4' para sair");

        while (true) {
            try {
                int opcao = Integer.parseInt(IO.readln("\nPor favor, insira a opção desejada: "));
                
                if (opcao == sacar) {
                    boolean saqueSucesso = false;
                    while (!saqueSucesso) { // Laço interno para o saque
                        try {
                            BigDecimal valor_saque = new BigDecimal(IO.readln("Digite o valor do saque (ou '0' para cancelar): "));
                            
                            if (valor_saque.compareTo(BigDecimal.ZERO) == 0) break; // Opção de cancelamento

                            if (valor_saque.compareTo(valor_inicial) <= 0 && valor_saque.compareTo(BigDecimal.ZERO) > 0) {
                                valor_inicial = valor_inicial.subtract(valor_saque);
                                IO.println("Saque realizado! Saldo atual: " + valor_inicial);
                                saqueSucesso = true; // Sai do laço do saque
                            } else {
                                IO.println("Saldo insuficiente. Tente um valor menor.");
                            }
                        } catch (Exception e) {
                            IO.println("Valor inválido! Digite um número decimal (ex: 50.00).");
                        }
                    }

                } else if (opcao == deposito) {
                    boolean depositoSucesso = false;
                    while (!depositoSucesso) { // Laço interno para o depósito
                        try {
                            BigDecimal valor_deposito = new BigDecimal(IO.readln("Digite o valor do depósito (ou '0' para cancelar): "));
                            
                            if (valor_deposito.compareTo(BigDecimal.ZERO) == 0 && valor_deposito.compareTo(BigDecimal.ZERO) > 0) break;

                            valor_inicial = valor_inicial.add(valor_deposito);
                            IO.println("Depósito realizado! Saldo atual: " + valor_inicial);
                            depositoSucesso = true; // Sai do laço do depósito
                        } catch (Exception e) {
                            IO.println("Erro: insira um valor numérico válido para depósito.");
                        }
                    }

                } else if (opcao == saldo) {
                    IO.println("Seu saldo atual é: " + valor_inicial);
                } else if (opcao == sair) {
                    IO.println("Obrigado por usar nossos serviços. Até logo!");
                    break;
                } else {
                    IO.println("Opção inválida.");
                }

            } catch (NumberFormatException e) {
                IO.println("Entrada inválida. Escolha entre 1, 2, 3 ou 4.");
            }
        }
    }
}