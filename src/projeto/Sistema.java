package Projeto;
import Projeto.Usuario;
import Projeto.Mensagem;
import java.util.List;
import java.util.Scanner;
public class Sistema {
    
    public Usuario cadastrarUsuario(Usuario usuario){
        Scanner sc = new Scanner(System.in);
        System.out.println("Email: ");
        usuario.setLogin(sc.nextLine());
        System.out.println("Sexo: ");
        usuario.setSexo(sc.nextLine());
        System.out.println("Senha: ");
        usuario.setSenha(sc.nextLine());
        System.out.println("Profissão: ");
        usuario.setProfissao(sc.nextLine());
        System.out.println("Nome: ");
        usuario.setNome(sc.nextLine());
        System.out.println("Idade: ");
        usuario.setIdade(sc.nextInt());
        
        
        //ler as entrados e criar um objeto usuário e retorna.
        //utilizar os get's e set's 
        return null;
    }
    public boolean verificarLogin(){
        //ler a entrada com o scanner
        Scanner sc = new Scanner(System.in);
        Usuario usuario = null;
        System.out.println("Login: ");
        String log = sc.nextLine();
        System.out.println("Senha: ");
        String sen = sc.nextLine();
        //chamar o método do usuario que verifica o login
        if(usuario.fazerLogin(sen, log) == true){
            return true;
        }else{
            return false;
        }
     }
   
    public boolean fazerAmizade(Usuario usuario, Usuario novoAmigo){
        usuario.fazerAmizade(novoAmigo);
        return true;
    }
    
    public boolean enviarMensagemPrivada(Usuario quemEnvia, Usuario quemRecebe){
        //ler  a mensagem que vai ser enviada.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a mensagem: ");
        String msgg = sc.nextLine();
        // montar um objeto mensagem.
        Mensagem msg = new Mensagem();
        msg.setQuemEnvia(quemEnvia);
        msg.setQuemRecebe(quemRecebe);
        msg.setMensagem(msgg);
        msg.setEhPrivado(true);
        // adionar a mensagem enviada na lista do usuario que enviou.
        //envia para um unico usuario
        return false;
    }
    public List<Usuario> pesquisarUsuario(Usuario usuario){ 
        //ler o nome do usuário para pesquisa
        Scanner sc = new Scanner(System.in);
        String pesq = sc.nextLine();
        //criar uma string e passar como parametro.
        return  usuario.pesquisarUsuario(pesq);
    }
    
}