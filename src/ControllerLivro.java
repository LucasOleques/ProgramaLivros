import java.util.ArrayList;

public class ControllerLivro {

    private static ArrayList<Livro> listalivros;

    //--------------------------------------------------------------------------------------------
    public static void adicionarLivro(Livro livro){
        listalivros.add(livro);
    }
    public static void removerLivro(Livro livro){
        listalivros.remove(livro);
    }
    //--------------------------------------------------------------------------------------------
    public static void adicionaOLivro(int posicao, int numprateleira, String nomelivro, String editora, String autor, String categoria, String idioma,
                                      int numeropagina, int datainclusao, int avaliacao, String resumo) {
        Livro livro = new Livro(posicao,numprateleira,nomelivro,editora,autor,categoria,idioma,
                numeropagina,datainclusao,avaliacao,resumo);
        listalivros.add(livro);
    }
    //--------------------------------------------------------------------------------------------
    public void removeOLivro(String nomelivro) {
        Livro livro = buscarLivroPorNomeLivro(nomelivro);
        if (livro != null) {
            removerLivro(livro);
        }
    }
    //--------------------------------------------------------------------------------------------
    public static ArrayList<Livro> getListalivros(){
        return listalivros;
    }
    //--------------------------------------------------------------------------------------------
    public static Livro buscarLivroPorNomeLivro(String nomelivro){
        for (Livro livro : listalivros) {
            if (livro.getNomelivro().equalsIgnoreCase(nomelivro)) {
                return livro;
            }
        }
        return null;
    }
    //--------------------------------------------------------------------------------------------
    public static ArrayList<Livro> buscarLivroPorPosicao(int posicao){
        ArrayList<Livro> livrosNaPosicao = new ArrayList<>();
        for(Livro livro : listalivros){
            if(livro.getPosicao() == posicao){
                livrosNaPosicao.add(livro);
            }
        }
        return livrosNaPosicao;
    }
}
