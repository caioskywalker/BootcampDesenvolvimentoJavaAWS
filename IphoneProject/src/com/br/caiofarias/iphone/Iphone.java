package com.br.caiofarias.iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");

    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica...");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica...");

    }


    @Override
    public void ligar() {
        System.out.println("Fazendo ligacao...");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");

    }
}
