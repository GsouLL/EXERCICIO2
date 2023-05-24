package br.Inatel.GuilhermeHenrique.exercicio2.Arquivo;

public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;

    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }
    public void postarFoto(){
        System.out.println("Postando foto");
    }
    public abstract void postarVideo();

    public abstract void postarComentario();

    public abstract void curtirPublicacao();

}
