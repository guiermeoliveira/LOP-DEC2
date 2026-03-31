public class viagens {
    void main() {
        IO.println("--------------------------------");
        IO.println("Bem-vindo ao sistema de viagens!");
        IO.println("Por favor, insira os detalhes da sua viagem.");
        IO.println("--------------------------------");
        double distancia = Double.parseDouble(IO.readln("Digite a distância da viagem em km: "));
        if (distancia > 200) {
            double valor_por_km = 0.50;
            double valor_total1 = distancia * valor_por_km; // Valor por km para viagens acima de 200 km
            IO.println(String.format("O valor total da viagem é: R$ %.2f%n", valor_total1));    
        } else {
            double valor_por_km = 0.75; // Valor por km para viagens de até 200 km
            double valor_total = distancia * valor_por_km;
            IO.println(String.format("O valor total da viagem é: R$ %.2f%n", valor_total));  
        }  
    }
}
