import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class teste {
    public static void main() {
        // Garantir que a interface gráfica seja criada na thread correta
        SwingUtilities.invokeLater(() -> criarJanela());
    }

    private static void criarJanela() {
        // Criar a janela principal
        JFrame frame = new JFrame("Minha Primeira Janela");

        // Definir tamanho inicial
        frame.setSize(400, 300);

        // Centralizar na tela
        frame.setLocationRelativeTo(null);

        // Definir ação ao fechar
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Adicionar evento de confirmação ao fechar
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int resposta = JOptionPane.showConfirmDialog(
                        frame,
                        "Deseja realmente sair?",
                        "Confirmação",
                        JOptionPane.YES_NO_OPTION
                );
                if (resposta == JOptionPane.YES_OPTION) {
                    frame.dispose();
                }
            }
        });

        // Criar um painel com um rótulo
        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout());
        JLabel label = new JLabel("Olá, Swing!", SwingConstants.CENTER);
        painel.add(label, BorderLayout.CENTER);

        // Adicionar painel à janela
        frame.add(painel);

        // Tornar a janela visível
        frame.setVisible(true);
    }
}
