package br.Inatel.GuilhermeHenrique.exercicio2.Arquivo;

public class GooglePlus extends RedeSocial implements VideoConferencia,Compartilhamento{
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Google plus nao curti mais Publicações");
    }

    @Override
    public void postarComentario() {
        System.out.println("Google plus nao posta mais comentários");

    }

    @Override
    public void postarFoto() {
        System.out.println("Google Plus nao posta mais fotos");

    }

    @Override
    public void postarVideo() {
        System.out.println("Google Plus nao posta mais videos");

    }

    @Override
    public void compartilhar() {
        System.out.println("Google plus nao faz mais compartilhamentos");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Google plus nao faz mais streaming");
    }

}
