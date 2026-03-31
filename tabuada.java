public class tabuada {
    void main() {
        IO.println("--------------------------------");
        int num = Integer.parseInt(IO.readln("Digite um número para ver a tabuada: "));
        IO.println("--------------------------------");
        IO.println("Tabuada do " + num + ":");
        IO.println("--------------------------------");
        for (int i = 1; i <= 10; i++) {
            IO.println(num + " x " + i + " = " + (num * i));
        }
    }
}
