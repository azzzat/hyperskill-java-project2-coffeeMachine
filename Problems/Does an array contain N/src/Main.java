import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numLength = scan.nextInt();

        int[] num = new int[numLength];
        for (int i = 0; i < numLength; i++) {
            num[i] = scan.nextInt();
        }

        int num1 = scan.nextInt();
        boolean answer = false;

        for (int i = 0; i < numLength; i++) {
            if (num[i] == num1) {
                answer = true;
            }
        }

        System.out.println(answer);
    }
}