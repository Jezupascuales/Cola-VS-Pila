import java.util.LinkedList;
import java.util.Queue;

public class cola<T> {
    private Queue<T> items;
    
    //constructor
    public cola() {
        items = new LinkedList<>();
    }
    
    //metodo enqueue
    public void enqueue(T item) {
        items.add(item);
        System.out.println("-> Encolado: " + item);
    }
    
    //metodo dequeue
    public T dequeue() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return null;
        }
        T item = items.poll();
        System.out.println("-> Desencolado: " + item);
        return item;
    }
    
    //metodo front
    public T front() {
        return items.peek();
    }
    
    public boolean estaVacia() {
        return items.isEmpty();
    }
    
    public void mostrar() {
        System.out.println("COLA [Frente -> Final]: " + items);
    }
}
