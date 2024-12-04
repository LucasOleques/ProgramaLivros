package EntidadesMVC.Model;

public class Livro{

    private String nomelivro;
    private String editora;
    private String autor;
    private int numeropagina;


    public void setNomelivro(String nomelivro) {
        this.nomelivro = nomelivro;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public void setAutor(String autor) {
        this.autor = autor;
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
    public int getNumeropagina() {
        return numeropagina;
    }
}

