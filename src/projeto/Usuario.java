package Projeto;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String login;
    private String nome;
    private String senha;
    private int idade;
    private String profissao;
    private String sexo;
    private List<Usuario> amigos;
    private List<Mensagem> mensagens;

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<Usuario> amigos) {
        this.amigos = amigos;
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }

    public boolean fazerLogin(String senha, String login) {
        boolean valido = false;
        if (senha.equalsIgnoreCase(this.senha) && login.equalsIgnoreCase(this.login)) {
            valido = true;
        }
        return valido;
    }

    public void fazerAmizade(Usuario amigo) {
        this.amigos.add(amigo);
    }

    public boolean desfazerAmizade(Usuario amigo) {
        Usuario removerAmigo = null;
        if (this.amigos.isEmpty()) {
            return false;
        } else {
            if (this.amigos.contains(amigo)) {
                for (int i = 0; i < this.amigos.size(); i++) {
                    if (amigos.get(i).equals(amigo)) {
                        removerAmigo = amigos.get(i);
                        break;
                    }
                }
            }
        }
        
        if(removerAmigo != null){
            this.amigos.remove(removerAmigo);
            return true;
        }
        return false;
        
    }

    public void enviarMensagem(Mensagem mensagem) {
        this.mensagens.add(mensagem);
    }

    public List<Mensagem> mensagensTrocadas(Usuario usuario){
         List<Mensagem>  mensagemsT = new ArrayList<>();
         for (int i = 0; i < this.mensagens.size(); i++) {
            if(this.mensagens.get(i).getQuemRecebe().equals(usuario) && this.mensagens.get(i).getEhPrivado()){
                 mensagemsT.add(this.mensagens.get(i));
            }
        }
        return mensagemsT;
    }
    
    public List<Usuario> pesquisarUsuario(String nomeUsuario) {
        List<Usuario> amigosEncontrados = new ArrayList<>();
        for (int i = 0; i < this.amigos.size(); i++) {
            if(this.amigos.get(i).getNome().toUpperCase().contains(nomeUsuario.toUpperCase())){
                amigosEncontrados.add(this.amigos.get(i));
            }
        }
        return amigosEncontrados;
    }

    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissão) {
        this.profissao = profissão;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
       System.out.println("Usuario{" + "login=" + login + ", nome=" + nome + ", senha=" + senha + ", idade=" + idade + ", profissao=" + profissao + ", sexo=" + sexo + ", amigos=" + amigos + ", mensagens=" + mensagens + '}');
    return "oi";
    }
    
}