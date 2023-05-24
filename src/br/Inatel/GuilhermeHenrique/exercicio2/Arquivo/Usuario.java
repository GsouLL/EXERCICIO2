package br.Inatel.GuilhermeHenrique.exercicio2.Arquivo;

import java.util.AbstractList;
import java.util.ArrayList;

public class Usuario {

    public ArrayList<RedeSocial>rede;
    private String nome;
    private String email;


    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
    public Usuario(String nome, String email,ArrayList<RedeSocial> rede) {
        this.nome = nome;
        this.email = email;
        this.rede = rede;
    }

    }

