package cadastro;

public class Escolaridade {
    private int idEscolaridade;
    private String localEstudo;
    private String formacao;
    private String escolaridade;

    

    public int getIdEscolaridade() {
        return idEscolaridade;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public void setIdEscolaridade(int idEscolaridade) {
        this.idEscolaridade = idEscolaridade;
    }

    public String getLocalEstudo() {
        return localEstudo;
    }

    public void setLocalEstudo(String localEstudo) {
        this.localEstudo = localEstudo;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
