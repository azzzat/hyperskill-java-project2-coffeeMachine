import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();

        int[] comp = new int[length];
        for (int i = 0; i < length; i++) {
            comp[i] = scan.nextInt();
        }

        int[] taxes = new int[length];
        for (int j = 0; j < length; j++) {
            taxes[j] = scan.nextInt();
        }

        int answer = 0;
        int maxTaxes = 0;
        for (int k = 0; k < length; k++) {
            if (comp[k] * taxes[k] >= maxTaxes) {
                maxTaxes = comp[k] * taxes[k];
                answer = k + 1;
            }
        }

        System.out.println(answer);
    }
}