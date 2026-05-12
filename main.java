import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pila<String> pila = new pila<>();
        cola<String> cola = new cola<>();
        int opcion;
        
        do {
            System.out.println("========== COLAS VS PILAS ==========");
            System.out.println("1. Probar PILA - Simular Ctrl+Z");
            System.out.println("2. Probar COLA - Simular Cola de Impresión");
            System.out.println("3. Comparar ambas con datos de ejemplo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer
            
            switch (opcion) {
                case 1:
                    menuPila(sc, pila);
                    break;
                case 2:
                    menuCola(sc, cola);
                    break;
                case 3:
                    demostracionComparativa(pila, cola);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 4);
    }
    
    static void menuPila(Scanner sc, pila<String> pila) {
        int op;
        do {
            System.out.println("\n--- MENU PILA ---");
            System.out.println("1. Push - Escribir texto");
            System.out.println("2. Pop - Deshacer Ctrl+Z");
            System.out.println("3. Mostrar pila");
            System.out.println("4. Volver");
            System.out.print("Opción: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch (op) {
                case 1:
                    System.out.print("Escribe texto: ");
                    String texto = sc.nextLine();
                    pila.push(texto);
                    break;
                case 2:
                    pila.pop();
                    break;
                case 3:
                    pila.mostrar();
                    break;
            }
        } while (op != 4);
    }
    
    static void menuCola(Scanner sc, Cola<String> cola) {
        int op;
        do {
            System.out.println("\n--- MENU COLA ---");
            System.out.println("1. Enqueue - Agregar documento a imprimir");
            System.out.println("2. Dequeue - Imprimir siguiente documento");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Volver");
            System.out.print("Opción: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch (op) {
                case 1:
                    System.out.print("Nombre del documento: ");
                    String doc = sc.nextLine();
                    cola.enqueue(doc);
                    break;
                case 2:
                    cola.dequeue();
                    break;
                case 3:
                    cola.mostrar();
                    break;
            }
        } while (op != 4);
    }
    
    static void demostracionComparativa(Pila<String> pila, Cola<String> cola) {
        System.out.println("\n=== DEMOSTRACIÓN: Mismos datos, diferente orden ===");
        
        // Limpiar
        while (!pila.estaVacia()) pila.pop();
        while (!cola.estaVacia()) cola.dequeue();
        
        String[] datos = {"A", "B", "C"};
        
        System.out.println("\nInsertamos: A, B, C");
        for (String d : datos) {
            pila.push(d);
            cola.enqueue(d);
        }
        
        System.out.println("\nSacamos 3 elementos:");
        System.out.print("PILA saca: ");
        for (int i = 0; i < 3; i++) System.out.print(pila.pop() + " ");
        
        System.out.print("\nCOLA saca: ");
        for (int i = 0; i < 3; i++) System.out.print(cola.dequeue() + " ");
        
        System.out.println("\n\nCONCLUSIÓN: Pila = C B A | Cola = A B C");
    }
}