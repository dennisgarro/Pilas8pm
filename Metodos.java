import java.util.Stack;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class Metodos {
    int opt = 0;
    Scanner sc = new Scanner(System.in);

    public Stack<vehiculo> LLenarPila1() {
        Stack<vehiculo> pila = new Stack<>();
        Scanner sc = new Scanner(System.in);
        Boolean bandera = true;

        while (bandera) {
            vehiculo o = new vehiculo();
            System.out.println("ingrese la marca");
            o.setMarca(JOptionPane.showInputDialog("Ingrese el Marca"));
            o.setColor(JOptionPane.showInputDialog("Ingrese el color"));
            o.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Precio")));
            pila.push(o);
            System.out.println("Desea agregar mas registros 1: SI, 2: NO");
            while (!sc.hasNextInt()) {
                System.out.println("esto no es comfama dato numerico");
                sc.next();
            }
            opt = sc.nextInt();
            while (opt < 1 || opt > 2) {
                System.out.println("esa opcion no existe por favor valide nuevo ");
                opt = sc.nextInt();
            }
            if (opt == 2) {
                bandera = false;
            }
        }
        return pila;
    }

    public Stack<vehiculo> LLenarPila2() {
        Stack<vehiculo> pila = new Stack<>();

        Boolean bandera = true;
        String Marca;
        String Color;
        int Precio;
        while (bandera) {

            System.out.println("ingrese la marca");
            Marca = (JOptionPane.showInputDialog("Ingrese el Marca"));
            Color = (JOptionPane.showInputDialog("Ingrese el color"));
            Precio = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Marca")));
            vehiculo o = new vehiculo(Marca, Color, Precio);
            System.out.println("Desea agregar mas registros 1: SI, 2: NO");
            while (!sc.hasNextInt()) {
                System.out.println("esto no es comfama dato numerico");
                sc.next();
            }
            opt = sc.nextInt();
            while (opt < 1 || opt > 2) {
                System.out.println("esa opcion no existe por favor valide nuevo ");
                opt = sc.nextInt();
            }
            if (opt == 2) {
                bandera = false;
            }

        }
        return pila;
    }

    public void MostrarPila(Stack<vehiculo> pila) {
        for (vehiculo o : pila) {
            System.out.println(o.getMarca());
            System.out.println(o.getColor());
            System.out.println(o.getPrecio());
        }
    }

    public void MostrarRegistro(Stack<vehiculo> pila) {
        String marca = "";
        boolean existe = false;
        System.out.println("ingrese la marca que desea buscar");
        marca = sc.next();
        for (vehiculo o : pila) {
            if (marca.equalsIgnoreCase(o.getMarca())) {
                System.out.println(o.getMarca());
                System.out.println(o.getColor());
                System.out.println(o.getPrecio());
                existe = true;
            }

        }
        if (!existe) {
            System.out.println("la marca no existe o ne se encuentra");
        }
    }
}
