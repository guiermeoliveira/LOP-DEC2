public class dois_logins {
    void main(){
        String usuario1 = "atila";
        String usuario2 = "olivi";
        String senha1 = "12345";
        String senha2 = "54321";

        String usuario = IO.readln("Digite o nome de usuário: ");
        String senha = IO.readln("Digite a senha: ");

        if ((usuario.equals(usuario1) && senha.equals(senha1)) || (usuario.equals(usuario2) && senha.equals(senha2))) {
            IO.println("Login bem-sucedido! Bem-vindo, " + usuario + "!");
        } else {
            IO.println("Login falhou! Nome de usuário ou senha incorretos.");
        }
    }
}
