package Model;

public class Livro{

    private String nomelivro;
    private String editora;
    private String autor;
    private String idioma;
    private int numeropagina;
    
    public Livro(String nomelivro, String editora, String autor, String idioma,
                 int numeropagina) {
        this.nomelivro = nomelivro;
        this.editora = editora;
        this.autor = autor;
        this.idioma = idioma;
        this.numeropagina = numeropagina;
        
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
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public void setNumeropagina(int numeropagina) {
        this.numeropagina = numeropagina;
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
    public String getIdioma() {
        return idioma;
    }
    public int getNumeropagina() {
        return numeropagina;
    }
}

