public class grandeza {
    void main (){
        IO.println("------------------------------");
        IO.println("CÁLCULO DE GRANDEZAS ELÉTRICAS");
        IO.println("------------------------------");
        IO.println(1 + " - Cálculo de Tensão (V)");
        IO.println(2 + " - Cálculo de Resistência (Ohm)");
        IO.println(3 + " - Cálculo de Corrente (Ampère)");
        IO.println(4 + " - Sair do programa");
        IO.println("------------------------------");
        int escolha = Integer.parseInt(IO.readln("Escolha uma opção: "));
        switch (escolha) {
            case 1:
                double corrente = Double.parseDouble(IO.readln("Digite a corrente (A): "));
                double resistencia = Double.parseDouble(IO.readln("Digite a resistência (Ohm): "));
                double tensao = corrente * resistencia;
                IO.println("A tensão é: " + tensao + " V");
                break;
            case 2:
                double tensao2 = Double.parseDouble(IO.readln("Digite a tensão (V): "));
                double corrente2 = Double.parseDouble(IO.readln("Digite a corrente (A): "));
                double resistencia2 = tensao2 / corrente2;
                IO.println("A resistência é: " + resistencia2 + " Ohm");
                break;
            case 3:
                double tensao3 = Double.parseDouble(IO.readln("Digite a tensão (V): "));
                double resistencia3 = Double.parseDouble(IO.readln("Digite a resistência (Ohm): "));
                double corrente3 = tensao3 / resistencia3;
                IO.println("A corrente é: " + corrente3 + " A");
                break;
            case 4:
                IO.println("Saindo do programa...");
                break;
            default:
                IO.println("Opção inválida. Por favor, escolha uma opção entre 1 e 4.");
                break;
            
        }   
        if (escolha == 4) {
                IO.println("Obrigado por usar o programa. Até a próxima!");
            } else { 
                char continuar = IO.readln("Deseja realizar outro cálculo? (s/n): ").charAt(0);
                if (continuar == 's' || continuar == 'S') {
                    main(); // Chama o método main novamente para permitir outro cálculo
                }
            }
        }
    }
