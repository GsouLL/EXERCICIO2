package br.Inatel.GuilhermeHenrique.exercicio2.Arquivo;

import java.lang.reflect.Parameter;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //criando um array list de redes sociais
        ArrayList<RedeSocial> redes= new ArrayList<>();
        ArrayList<RedeSocial>rede2 = new ArrayList<>();

        Facebook facebook = new Facebook("Naosei",500);
        Instagram instagram = new Instagram("Naosei2",502);
        Twitter twitter = new Twitter("Naosei3",503);
        GooglePlus googleplus = new GooglePlus("Naosei4",504);

        //adicionando no array list de cada rede social
        redes.add(facebook);
        redes.add(instagram);
        redes.add(twitter);
        redes.add(googleplus);

        //criando um usuário
        Usuario user1 = new Usuario("Guilherme","guilherme.ferreira@gmail.com",redes);

        //percorrendo arraylist
        System.out.println("Nome do usuário1: "+ user1.getNome());
        System.out.println("Email "+user1.getEmail());

        System.out.println("Redes sociais: ");

        System.out.println("Facebook ");
        System.out.println("Senha: " +redes.get(0).senha);
        System.out.println("Numero de amigos: "+redes.get(0).numAmigos);

        facebook.postarComentario();
        facebook.compartilhar();
        facebook.fazStreaming();

        System.out.println("Instagram ");
        System.out.println("Senha: " +redes.get(1).senha);
        System.out.println("Numero de amigos: "+redes.get(1).numAmigos);

        instagram.postarVideo();
        instagram.postarComentario();
        instagram.curtirPublicacao();

        System.out.println("Twitter ");
        System.out.println("Senha: " +redes.get(2).senha);
        System.out.println("Numero de amigos: "+redes.get(2).numAmigos);

        twitter.postarFoto();
        twitter.postarVideo();

        System.out.println("GooglePlus ");
        System.out.println("Senha: " +redes.get(3).senha);
        System.out.println("Numero de amigos: "+redes.get(3).numAmigos);

        googleplus.compartilhar();
        googleplus.fazStreaming();

        //tratamento se nada for adicionado na rede
        try{
            for (RedeSocial redeSocial : rede2 = null) {

            }

        }catch(NullPointerException e) {
            System.out.println("Nao há redes sociais disponíveis para o usuário2 "+e);

        }


    }

}