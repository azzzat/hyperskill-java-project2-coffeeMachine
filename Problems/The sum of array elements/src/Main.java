import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numLength = scan.nextInt();
        int[] num = new int[numLength];

        int answer = 0;
        for (int i = 0; i < numLength; i++) {
            num[i] = scan.nextInt();
            answer += num[i];
        }

        System.out.println(answer);
    }
}