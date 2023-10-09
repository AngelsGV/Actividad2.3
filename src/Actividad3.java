import  java.util.Scanner;
public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2; //Los 2 números enteros.
        System.out.println("Introduce un número entero: ");
        n1 = sc.nextInt();
        System.out.println("Introduce otro número entero: ");
        n2 = sc.nextInt();
        if (n1 != n2 || n1 == 0 || n2 == 0) { // n1 es distinto n2 o n1 = 0 o n2=0
            System.out.println("True");// Es verdadero.
        } else {// En cualquier otro caso es falso
            System.out.println("False");
        }
    }
}
