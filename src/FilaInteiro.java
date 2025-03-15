public class FilaInteiro {
    private static int[] vetorEstrutura;
    private int quantidade;
    private int inicio;
    private int fim;

    public FilaInteiro(int tamanhoFila) {
        vetorEstrutura = new int[tamanhoFila];
        quantidade = 0;
        inicio = -1;
        fim = -1;
    }

    public void enqueue(int value) {
        if (isEmpty()) {
            inicio++;
            fim++;
            vetorEstrutura[inicio] = value;
            quantidade++;
        } else {
            if (!isFull()) { // Se não estiver cheia
                fim++;
                vetorEstrutura[fim] = value;
                quantidade++;
            } else {
                System.out.println("Fila Cheia!");
            }
        }
    }

    public int dequeue() {
        int valorRetorno = 0;
        if (isEmpty()) {
            System.out.println("Fila Vazia!");
        } else {
            // Obtendo o primeiro da fila para que seja retornado.
            valorRetorno = vetorEstrutura[inicio];

            if (inicio == fim) {
                inicio = -1;
                fim = -1;
                quantidade--;
            } else {
                inicio++;
                reorganizar();
            }
        }
        return valorRetorno;
    }

    public boolean isEmpty() {
        return inicio == -1;
    }

    public boolean isFull() {
        return fim == vetorEstrutura.length - 1;
    }

    public int size() {
        return quantidade;
    }

    private void reorganizar() {
        for (int i = inicio; i <= fim; i++) {
            vetorEstrutura[i - 1] = vetorEstrutura[i];
        }
        inicio--;
        fim--;
    }

    public void ExibirFila() {
        if (!isEmpty()) {
            for (int i = inicio; i <= fim; i++) {
                System.out.print(vetorEstrutura[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("\nFila vazia!");
        }
    }
}