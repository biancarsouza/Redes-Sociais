package RedesSociais;

import Interfaces.Compartilhamento;
import Interfaces.VideoConferencia;

public class Facebook extends RedeSocial implements Compartilhamento, VideoConferencia {
    @Override
    public void postarFoto() {
        System.out.println("O usuário postou uma foto no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("O usuário postou um vídeo no Facebook!");
    }

    @Override
    public void postarComentario() {
        System.out.println("O usuário postou um comentário no Facebook!");
    }

    @Override
    public void compartilhar() {
        System.out.println("O usuário compartilhou uma publicação no Facebook!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("O usuário está ao vivo no Facebook!");
    }
}