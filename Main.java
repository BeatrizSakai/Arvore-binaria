public class Main {
    public static void main(String[] args) {
        ArvoreBinaria tree = new ArvoreBinaria();

        tree.inserir(50);
        tree.inserir(30);
        tree.inserir(20);
        tree.inserir(40);
        tree.inserir(70);
        tree.inserir(60);
        tree.inserir(80);
        tree.printTree(tree.raiz, "");
        

        int chave = 60;
        System.out.println("\nBuscando o elemento " + chave + ": " + tree.buscar(chave));

        chave = 90;
        System.out.println("Buscando o elemento " + chave + ": " + tree.buscar(chave));

        chave = 30;
        tree.remover(chave);
        System.out.println("\nRemovendo o elemento " + chave + "...");
    }
}
