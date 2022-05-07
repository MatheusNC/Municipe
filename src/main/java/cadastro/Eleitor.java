package cadastro;

public class Eleitor {
    private String titulo;
    private String secao;
    private String zona;
    
    public String getSecao() {
        return secao;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getZona() {
        return zona;
    }
    public void setZona(String zona) {
        this.zona = zona;
    }
    public void setSecao(String secao) {
        this.secao = secao;
    }


}
