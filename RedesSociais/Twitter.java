package RedesSociais;

import Interfaces.Compartilhamento;

public class Twitter extends RedeSocial implements Compartilhamento {

    @Override
    public void postarFoto() {
        System.out.println("O usuário postou uma foto no Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("O usuário postou um vídeo no Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("O usuário postou um comentário no Twitter!");
    }

    @Override
    public void compartilhar() {
        System.out.println("O usuário compartilhou uma publicação no Twitter!");
    }

}
