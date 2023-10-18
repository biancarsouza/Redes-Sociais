import RedesSociais.RedeSocial;

public class Usuario {

    private String nome;
    private String email;
    private RedeSocial [] redesSociais;

    // Lógica das redes sociais tomando como base a aula 8.
    public Usuario(RedeSocial[] redesSociais) {
        this.redesSociais = redesSociais;
    }

    public RedeSocial[] getRedesSociais() {
        return redesSociais;
    }

    // Getters e setters do nome e email.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}
