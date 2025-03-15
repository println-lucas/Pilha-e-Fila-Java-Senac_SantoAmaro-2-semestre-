import java.util.Scanner;

public class ExFila01 {
    static Scanner in = new Scanner(System.in);
    static int max = 5, tam = 0;

    public static void main(String[] args) {
        int vet[] = new int[10], op, elem;

        do {
            System.out.println("1 - inserir item na lista");
            System.out.println("2 - Remover item da lista");
            System.out.println("3 - Exibir Lista");
            System.out.println("4 - Sair");

            op = in.nextInt();
            switch (op) {
                case 1:
                    if (tam == max) {
                        System.out.println("fila cheia");
                        break;
                    }

                    System.out.println("Digite o elemento (Maximo de itens suportado = " + max + "): ");

                    elem = in.nextInt();
                    enfileirar(vet, elem);
                    break;

                case 2:
                    elem = desenfileirar(vet);
                    System.out.println("Elemento removido da fila = " + elem);
                    break;

                case 3:
                    exibe(vet);
                    break;

                default:
                    System.out.println("Digite um numero válido!");
                    break;
            }
        } while (op != 0);
    }

    static void exibe(int vet[]) {
        int i;
        System.out.println("Exibindo a lista \n");
        if (tam >= 1) {
            for (i = 0; i < tam; i++) {
                System.out.println(" vet[" + i + "] =" + vet[i]);
            }
        } else {
            System.out.println(" fila vazia");
        }
    }

    static void enfileirar(int vet[], int elem) {
        if (tam == max) {
            System.out.println("fila cheia");
        } else {
            vet[tam] = elem;
            tam++;
        }
    }

    static int desenfileirar(int vet[]) {
        int i, elem = -1;
        if (tam >= 1) {
            elem = vet[0];
            tam--;

            for (i = 0; i < tam; i++) {
                vet[i] = vet[i + 1];
            }
        }
        return elem;
    }
}