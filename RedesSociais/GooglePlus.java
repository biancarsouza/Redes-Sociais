package RedesSociais;

import Interfaces.Compartilhamento;
import Interfaces.VideoConferencia;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {

    @Override
    public void postarFoto() {
        System.out.println("O usuário postou uma foto no Google Plus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("O usuário postou um vídeo no Google Plus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("O usuário postou um comentário no Google Plus!");
    }

    @Override
    public void compartilhar() {
        System.out.println("O usuário compartilhou uma publicação no Google Plus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("O usuário está ao vivo no Google Plus!");
    }

}