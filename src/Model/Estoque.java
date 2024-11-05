package Model;

import java.util.ArrayList;

public class Estoque{

    private ArrayList<Livro> listalivros = new ArrayList<>();
    private int posicao;
    private int numprateleira;

    public Estoque(int posicao, int numprateleira){
        this.posicao = posicao;
        this.numprateleira = numprateleira;
    }

    public int getPosicao() {
        return posicao;
    }
    public int getNumprateleira() {
        return numprateleira;
    }
    public ArrayList<Livro> getListalivros() {
        return listalivros;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    public void setNumprateleira(int numprateleira) {
        this.numprateleira = numprateleira;
    }
    public void setListalivros(ArrayList<Livro> listalivros) {
        this.listalivros = listalivros;
    }

}
