import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int arrayLength = scan.nextInt();

        int[] numbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = scan.nextInt();
        }

        boolean answer = true;
        for (int i = 1; i < arrayLength; i++) {
            if (numbers[i] < numbers[i - 1]) {
                answer = false;
            }
        }

        System.out.println(answer);
    }
}