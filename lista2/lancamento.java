public class lancamento {
    void main() {
        IO.println("Bem-vindo ao sistema de lançamento, pressione Enter para iniciar a contagem regressiva!");
        IO.readln(); // Aguarda a entrada do usuário
        for (int i = 10; i >= 0; i--) {
            IO.println(i);
            try {
                Thread.sleep(1000); // Pausa por 1 segundo
            } catch (InterruptedException e) {
                IO.println("Contagem interrompida!");
                return;
            }
        }
    }
}