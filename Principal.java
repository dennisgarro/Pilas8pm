import java.util.Stack;

public class Principal {
    public static void main(String[] args) {
        Metodos m = new Metodos();
        Stack<vehiculo> pila = m.LLenarPila1();
        m.MostrarPila(pila);
        m.MostrarRegistro(pila);
    }
}
