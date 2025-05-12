import java.util.*;

public class Main {
    public static void main(String[] args) {
        ProductoManager p = new ProductoManager();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("1. Agregar producto\n2. Ver productos\n3. Buscar\n4. Eliminar\n5. Salir");
            int o = s.nextInt();
            if (o == 1) {
                System.out.println("Nombre?");
                String n = s.next();
                System.out.println("Precio?");
                double pr = s.nextDouble();
                System.out.println("Categoría?");
                String c = s.next();
                p.a(n, pr, c);
            } else if (o == 2) {
                p.v();
            } else if (o == 3) {
                System.out.println("ID?");
                int id = s.nextInt();
                Producto x = p.b(id);
                if (x != null) {
                    System.out.println(x.n + " " + x.p);
                }
            } else if (o == 4) {
                System.out.println("ID?");
                p.r(s.nextInt());
            } else if (o == 5) {
                System.out.println("Bye");
                break;
            }
        }
    }
}
