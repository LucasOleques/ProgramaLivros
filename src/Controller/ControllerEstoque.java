package Controller;

import Model.Estoque;

import java.util.ArrayList;

public class ControllerEstoque {

    private static ArrayList<Estoque> listalivrosestoque = new ArrayList<>();

    public static void createLivroNoEstoque(Estoque estoque){
        listalivrosestoque.add(estoque);
        System.out.println("Livro adicionado ao estoque na posição " + estoque.getPosicao() +
                " e prateleira " + estoque.getNumprateleira());
    }

    public static void readLivroNoEstoque(int posicao, int numrateleira){
        boolean encontrado = false;
        for(Estoque estoque : listalivrosestoque){
            if(estoque.getPosicao() == posicao && estoque.getNumprateleira() == numrateleira){
                System.out.println("Livro encontrado no estoque: " + estoque);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Livro não encontrado nesse local.");
        }
    }

    public static void updateEstoque(Estoque estoque) {
        // Exemplo de lógica de atualização
        for (Estoque e : listalivrosestoque) {
            if (e.getPosicao() == estoque.getPosicao() && e.getNumprateleira() == estoque.getNumprateleira()) {
                System.out.println("Estoque atualizado: " + e);
                return;
            }
        }
        System.out.println("Estoque não encontrado.");
    }

    public static void deleteLivroNoEstoque(Estoque estoque){
        if (listalivrosestoque.remove(estoque)) {
            System.out.println("Livro removido do estoque.");
        } else {
            System.out.println("Livro não encontrado no estoque.");
        }
    }
}
