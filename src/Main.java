import java.util.LinkedList;
import java.util.Queue;

public class FilaBanco {

    public static void main(String[] args) {

        // Criação da fila
        Queue<String> fila = new LinkedList<>();

        // Adicionando clientes na fila
        fila.add("Cliente 1");
        fila.add("Cliente 2");
        fila.add("Cliente 3");
        fila.add("Cliente 4");
        fila.add("Cliente 5");

        while (!fila.isEmpty()) {

            String cliente = fila.remove();
            System.out.println("Atendendo o cliente: " + cliente);
        }

        System.out.println("Todos os clientes foram atendidos!");

    }

}