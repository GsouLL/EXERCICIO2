package br.Inatel.GuilhermeHenrique.exercicio2.Arquivo;

public class Facebook extends RedeSocial implements VideoConferencia,Compartilhamento{
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }
    @Override
    public void postarVideo() {
        System.out.println("Postando video no facebook");

    }

    @Override
    public void postarComentario() {
        System.out.println("Postando comentario  do facebook");
    }


    @Override
    public void curtirPublicacao() {
        System.out.println("Curtindo Publicacao do facebook");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compatilhando no facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo streaming no facebook");

    }
}
