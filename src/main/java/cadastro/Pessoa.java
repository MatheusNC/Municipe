package cadastro;

public class Pessoa {
    private double CPF;
    private String primeiroNome;
    private String sobrenome;
    private RG rg;
    private Eleitor eleitor;
    private String dataNascimento;
    private String estadoCivil;
    private String cor;
    private String nacionalidade;
    private String sexo;
    private Localizacao localizacao;
    private Profissional profissional;
    private String pcd;
    private Religiao religiao;
    private Sindicato sindicato;
    private int telefone;

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getCPF() {
        return CPF;
    }

    public void setCPF(double CPF) {
        this.CPF = CPF;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public RG getRg() {
        return rg;
    }

    public void setRg(RG rg) {
        this.rg = rg;
    }

    public Eleitor getEleitor() {
        return eleitor;
    }

    public void setEleitor(Eleitor eleitor) { this.eleitor = eleitor; }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public String getPcd() {
        return pcd;
    }

    public void setPcd(String pcd) {
        this.pcd = pcd;
    }

    public Religiao getReligiao() {
        return religiao;
    }

    public void setReligiao(Religiao religiao) {
        this.religiao = religiao;
    }

    public Sindicato getSindicato() {
        return sindicato;
    }

    public void setSindicato(Sindicato sindicato) {
        this.sindicato = sindicato;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNomeCompleto() {
        return this.primeiroNome + " " + this.sobrenome;
    }
}
