import java.util.Scanner;
import java.util.Locale;

public class desafio_cpf {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String STR = leitor.next();
        String A = STR.substring(0, 3);
        String B = STR.substring(4, 7);
        String C = STR.substring(8, 11);
        String D = STR.substring(12, 14);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);

    }
}