package br.Inatel.GuilhermeHenrique.exercicio2.Arquivo;

public class Instagram extends RedeSocial {

    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando video no instagram");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postando comentário no instagram");

    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtindo publicação no instagram");
    }
}
