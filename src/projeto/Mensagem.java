package Projeto;
public class Mensagem {
    private String mensagem;
    private Usuario quemEnvia;
    private Usuario quemRecebe;
    private boolean ehPrivado;
    public void setMensagem(String mensagem){
         this.mensagem = mensagem;
     }
    public String getMensagem(){
        return mensagem;
    }
    public void setQuemEnvia(Usuario quemEnvia){
        this.quemEnvia=quemEnvia;
    }
    public Usuario getQuemEnvia(){
        return quemEnvia;
    }
    public void setQuemRecebe(Usuario quemRecebe){
        this.quemRecebe=quemRecebe;
    }
    public Usuario getQuemRecebe (){
        return quemRecebe;
    }
    public void setEhPrivado(boolean ehPrivado){
        this.ehPrivado=ehPrivado;
    }
    public boolean getEhPrivado(){
        return ehPrivado;
    }

    @Override
    public String toString() {
        return "Mensagem{" + "mensagem=" + mensagem + ", quemEnvia=" + quemEnvia + ", quemRecebe=" + quemRecebe + ", ehPrivado=" + ehPrivado + '}';
    }
    
}