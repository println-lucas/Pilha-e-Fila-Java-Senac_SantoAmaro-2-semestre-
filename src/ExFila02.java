public class ExFila02 {
    static final int max = 100;

    public static void main(String[] args) {
        Queue q = new Queue();
        q.front = 0;
        q.rear = 0;

        System.out.println("Valor " + enqueue(q, 1) + " inserido na fila ");
        System.out.println("Valor " + enqueue(q, 2) + " inserido na fila ");
        System.out.println("Valor " + enqueue(q, 3) + " inserido na fila ");
        System.out.println("Valor " + enqueue(q, 4) + " inserido na fila \n");

        System.out.println("Fila com " + (size(q) - 1) + " itens\n");

        System.out.println("proximo valor da fila " + front(q));
        System.out.println("Tirando o valor " + dequeue(q) + " da fila...\n");

        System.out.println("Proximo valor da fila " + front(q));
        System.out.println("Tirando o valor " + dequeue(q) + " da fila ...\n");

        System.out.println("Proximo valor da fila " + front(q));
        System.out.println("Tirando o valor " + dequeue(q) + " da fila ...\n");

        System.out.println("Proximo valor da fila " + front(q));
        System.out.println("Tirando o valor " + dequeue(q) + " da fila ...\n");

        System.out.println("Fila vazia, fila com " + (empty(q)-1) + "itens\n");
    }

    static int empty(Queue pq){
        if(pq.front == pq.rear){
            return 1;
        }
        return 0;
    }

    static int enqueue(Queue pq, int x){
        if(pq.rear + 1 >= max){
            System.out.println("\n estouro da capacidade da fila");
        }
        pq.itens[pq.rear++] = x;
        return x;
    }

    static int size(Queue pq){
        return (pq.rear + 1);
    }

    static int front(Queue pq){
        return pq.itens[0];
    }

    static int dequeue(Queue pq){
        int x, i;
        if(empty(pq)==1){
            System.out.println("Fila vazia");
        }

        x = pq.itens[0];
        for(i =0; i< pq.rear;i++){
            pq.itens[i] = pq.itens[i + 1];
        }

        pq.rear --;
        return x;
    }
}