package Projeto;
import java.util.ArrayList;

public class Projeto {

    public static void main(String[] args) {
        Sistema le = new Sistema();
        Usuario leh = new Usuario();
        le.cadastrarUsuario(leh);
        leh.setAmigos(new ArrayList<>());
        leh.toString();
        le.verificarLogin();
        System.out.println(leh.getIdade());
        System.out.println(leh.getNome());
        System.out.println(leh.getLogin());
        System.out.println(leh.getProfissao());
        System.out.println(leh.getSexo());
        System.out.println(leh.getSenha());
        
        System.out.println("Login valid:"+leh.fazerLogin("3343", "ererere"));
        leh.fazerAmizade(new Usuario());
        
    }
    
}