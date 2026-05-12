import java.util.ArrayList;

public class pila<T> {
    private ArrayList<T> items;
    
    //constructor
    public pila() {
        items = new ArrayList<>();
    }
    
    //metodo push
    public void push(T item) {
        items.add(item);
        System.out.println("-> Apilado: " + item);
    }
    
    //metodo pop
    public T pop() {
        if (estaVacia()) {
            System.out.println("La pila está vacía");
            return null;
        }
        T item = items.remove(items.size() - 1);
        System.out.println("-> Desapilado: " + item);
        return item;
    }
    
    //metodo pekk
    public T peek() {
        if (estaVacia()) return null;
        return items.get(items.size() - 1);
    }
    
    public boolean estaVacia() {
        return items.isEmpty();
    }
    
    public void mostrar() {
        System.out.println("PILA [Tope -> Base]: " + items);
    }
}