import java.io.IOException;
        import java.io.BufferedReader;
        import java.io.InputStreamReader;


public class num_pares{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) System.out.println(i);
        }

    }

}