package cadastro;

public class Dependente extends Pessoa{
    private int idDependente;
    private String nomeDependente;
    private String sobrenomeDependente;
    private Pessoa responsavel;

    public int getIdDependente() {
        return idDependente;
    }

    public void setIdDependente(int idDependente) {
        this.idDependente = idDependente;
    }

    public String getNomeDependente() {
        return nomeDependente;
    }

    public void setNomeDependente(String nomeDependente) {
        this.nomeDependente = nomeDependente;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }

    public void setSobrenomeDependente(String sobrenomeDependente) {
        this.sobrenomeDependente = sobrenomeDependente;
    }

    @Override
    public String getNomeCompleto() {
        return this.nomeDependente + " " + this.sobrenomeDependente;
    }
}
