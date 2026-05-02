public class multiplo_de_3 {
    
    void main() {
        IO.println("==========================");
        boolean continuar = true;
        do {
            for (int i = 1; i < 100; i++) {
                if (i % 3 == 0) {
                    try {
                        Thread.sleep(500); // Pausa de 500 milissegundos para melhor visualização
                    } catch (InterruptedException e) {
                        IO.println("A exibição foi interrompida!");
                        return;
                    }                    
                    IO.println("O número " + i + " é múltiplo de 3.");
                       continuar = false;
                }
            }
        } while (continuar);
        
    }
}

