import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arrayLength = scan.nextInt();
        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = scan.nextInt();
        }

        int checkNumber = scan.nextInt();
        int counter = 0;
        for (int check : numbers) {
            if (checkNumber == check) {
                counter += 1;
            }
        }

        System.out.println(counter);

    }
}