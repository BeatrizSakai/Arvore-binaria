public class ArvoreBinaria {
    NoArvore raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private NoArvore inserirRec(NoArvore raiz, int valor) {
        if (raiz == null) {
            raiz = new NoArvore(valor);
            return raiz;
        }

        if (valor < raiz.valor) {
            raiz.esquerda = inserirRec(raiz.esquerda, valor);
        } else if (valor > raiz.valor) {
            raiz.direita = inserirRec(raiz.direita, valor);
        }

        return raiz;
    }

    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(NoArvore raiz, int valor) {
        if (raiz == null) {
            return false;
        }

        if (valor == raiz.valor) {
            return true;
        }

        if (valor < raiz.valor) {
            return buscarRec(raiz.esquerda, valor);
        }

        return buscarRec(raiz.direita, valor);
    }

    public void remover(int valor) {
        raiz = removerRec(raiz, valor);
    }

    private NoArvore removerRec(NoArvore raiz, int valor) {
        if (raiz == null) {
            return raiz;
        }

        if (valor < raiz.valor) {
            raiz.esquerda = removerRec(raiz.esquerda, valor);
        } else if (valor > raiz.valor) {
            raiz.direita = removerRec(raiz.direita, valor);
        } else {
            if (raiz.esquerda == null) {
                return raiz.direita;
            } else if (raiz.direita == null) {
                return raiz.esquerda;
            }

            raiz.valor = minValue(raiz.direita);
            raiz.direita = removerRec(raiz.direita, raiz.valor);
        }

        return raiz;
    }

    private int minValue(NoArvore raiz) {
        int minValue = raiz.valor;
        while (raiz.esquerda != null) {
            minValue = raiz.esquerda.valor;
            raiz = raiz.esquerda;
        }
        return minValue;
    }

    public void printArvore(NoArvore raiz, String prefix) {
        if (raiz != null) {
            System.out.println(prefix + "" + raiz.valor);
            printArvore(raiz.esquerda, prefix + " ");
            printArvore(raiz.direita, prefix + " ");
        }
    }

}
