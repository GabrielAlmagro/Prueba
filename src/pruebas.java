import java.util.Scanner;

public class pruebas {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        System.out.print("Introduce un número: ");
        A = sc.nextInt();

        System.out.print("Introduce otro número: ");
        B = sc.nextInt();

        numerosEnteros(A,B);

    }
    static void numerosEnteros(int A, int B) {
        for (; A <= B; A++) {
            System.out.println(A);
        }

    }
}
