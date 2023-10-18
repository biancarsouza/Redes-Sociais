import RedesSociais.*;

public class Main {

    public static void main(String[] args) {

        Facebook facebook = new Facebook();
        facebook.setSenha("BRF#359");
        facebook.setNumAmigos(268);

        GooglePlus googlePlus = new GooglePlus();
        googlePlus.setSenha("512@KLP");
        googlePlus.setNumAmigos(41);

        Twitter twitter = new Twitter();
        twitter.setSenha("HYS*871");
        twitter.setNumAmigos(942);

        Instagram instagram = new Instagram();
        instagram.setSenha("469$CQZ");
        instagram.setNumAmigos(752);

        RedeSocial[] redesSociais = new RedeSocial[2];
        redesSociais[0] = facebook;
        redesSociais[1] = twitter;

        Usuario usuario = new Usuario(redesSociais);
        usuario.setNome("Zeca");
        usuario.setEmail("zeca@gmail.com");

        System.out.println();

        System.out.println("--------------------------------------------------------------------");
        System.out.println("|   Trabalho por Bianca Ribeiro de Souza e Pedro Rosa dos Santos   |");
        System.out.println("|          C206 A           Matrículas 226 GES & 9783 GET          |");
        System.out.println("--------------------------------------------------------------------");

        System.out.println();

        System.out.println("Atividades recentes do usuário " + usuario.getNome() + " (" + usuario.getEmail() + "):");

        System.out.println();

        usuario.getRedesSociais()[0].postarVideo();
        usuario.getRedesSociais()[0].postarComentario();
        ((Facebook) usuario.getRedesSociais()[0]).fazStreaming();

        System.out.println();

        usuario.getRedesSociais()[1].postarFoto();
        usuario.getRedesSociais()[1].curtirPublicacao();
        ((Twitter) usuario.getRedesSociais()[1]).compartilhar();

    }

}