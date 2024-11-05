package Model;

public class Livro{

    private String nomelivro;
    private String editora;
    private String autor;
    private String categoria;
    private String idioma;
    private int numeropagina;
    private int datainclusao;
    private int avaliacao;
    private String resumo;

    public Livro(String nomelivro, String editora, String autor, String categoria, String idioma,
                 int numeropagina, int datainclusao, int avaliacao, String resumo) {
        this.nomelivro = nomelivro;
        this.editora = editora;
        this.autor = autor;
        this.categoria = categoria;
        this.idioma = idioma;
        this.numeropagina = numeropagina;
        this.datainclusao = datainclusao;
        this.avaliacao = avaliacao;
        this.resumo = resumo;
    }

    public void setNomelivro(String nomelivro) {
        this.nomelivro = nomelivro;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public void setNumeropagina(int numeropagina) {
        this.numeropagina = numeropagina;
    }
    public void setDatainclusao(int datainclusao) {
        this.datainclusao = datainclusao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getNomelivro() {
        return nomelivro;
    }
    public String getEditora() {
        return editora;
    }
    public String getAutor() {
        return autor;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getIdioma() {
        return idioma;
    }
    public int getNumeropagina() {
        return numeropagina;
    }
    public int getDatainclusao() {
        return datainclusao;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public String getResumo() {
        return resumo;
    }
    //--------------------------------------------------------------------------------------------
}

