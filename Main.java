public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(70);
        arvore.inserir(60);
        arvore.inserir(80);
        arvore.printArvore(arvore.raiz, "");
        

        int chave = 60;
        System.out.println("\nBuscando o elemento " + chave + ": " + arvore.buscar(chave));

        chave = 90;
        System.out.println("Buscando o elemento " + chave + ": " + arvore.buscar(chave));

        chave = 30;
        arvore.remover(chave);
        System.out.println("\nRemovendo o elemento " + chave + "...");
        arvore.printArvore(arvore.raiz, "");
    }
}
