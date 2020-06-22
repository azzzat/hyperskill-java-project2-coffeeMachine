import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arrayLength = scan.nextInt();

        int[] numbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = scan.nextInt();
        }

        int answer = numbers[0];
        for (int number : numbers) {
            if (number <= answer) {
                answer = number;
            }
        }

        System.out.println(answer);

    }
}