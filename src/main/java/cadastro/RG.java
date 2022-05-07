package cadastro;

public class RG {
    private String rgNo;
    private String emissor;
    private String dataExpedicao;
    private String uf;
    private String naturalidade;

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public String getRgNo() {
        return rgNo;
    }

    public void setRgNo(String rgNo) {
        this.rgNo = rgNo;
    }

    public String getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(String dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }
}
