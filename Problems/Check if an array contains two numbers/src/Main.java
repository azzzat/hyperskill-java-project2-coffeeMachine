import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arrayLength = scan.nextInt();

        int[] numbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = scan.nextInt();
        }

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        boolean answer = false;

        for (int i = 1; i < arrayLength; i++) {
            if (number1 == numbers[i - 1] && number2 == numbers[i] || number2 == numbers[i - 1] && number1 == numbers[i]) {
                answer = true;
            }
        }

        System.out.println(answer);
    }
}