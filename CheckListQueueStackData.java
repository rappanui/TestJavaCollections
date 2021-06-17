import java.util.*;

public class CheckListQueueStackData {

    static boolean secondPart = false;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(5);
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new ArrayDeque<>(10);

        insertFirst5DataIntoList(list);   // Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células;
        removeDataFromListAndInsertIntoStack(list, stack);   // Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista;
        removeDataFromStackAndInsertIntoQueue(stack, queue);   // Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células;

        secondPart = true;
        insertLast5DataIntoList(list);   // Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista;
        removeDataFromListAndInsertIntoStack(list, stack);   // Passo 5: Repita os passos 2 e 3.
        removeDataFromStackAndInsertIntoQueue(stack, queue);    // Passo 5: Repita os passos 2 e 3.

        System.out.println("Fila apos execucao do processo inteiro: " + queue);
    }


    private static void insertFirst5DataIntoList(List<Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        System.out.println("Lista apos execucao do Passo 1: " + list);
    }

    private static void insertLast5DataIntoList(List<Integer> list) {
        for (int i = 6; i <= 10; i++) {
            list.add(i);
        }
        System.out.println("Lista apos execucao do Passo 4: " + list);
    }

    private static void removeDataFromListAndInsertIntoStack(List<Integer> list, Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(list.get(i));
        }
        list.clear();

        if(!secondPart) {
            System.out.println("Pilha apos execucao do Passo 2: " + stack);
        } else {
            System.out.println("Pilha apos execucao do Passo 5: " + stack);
        }
    }

    private static void removeDataFromStackAndInsertIntoQueue(Stack<Integer> stack, Queue<Integer> queue) {

        for (int i = 0; i < 5; i++) {
            queue.offer(stack.pop());
        }
        stack.clear();

        if(!secondPart) {
            System.out.println("Fila apos execucao do Passo 3: " + queue);
        } else {
            System.out.println("Fila apos execucao do Passo 6: " + queue);
        }

    }

}
