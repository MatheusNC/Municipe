package cadastro;

public class Profissional{
    private int idProfissional;
    private String ocupacao;
    private String formacao;
    private Escolaridade escolaridade;

    public int getIdProfissional() {
        return idProfissional;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public void setIdProfissional(int idProfissional) {
        this.idProfissional = idProfissional;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
