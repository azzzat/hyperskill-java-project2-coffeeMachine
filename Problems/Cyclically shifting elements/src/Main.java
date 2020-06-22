import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numsLength = scanner.nextInt();
        int[] nums = new int[numsLength];
        for (int i = 0; i < numsLength; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print(nums[numsLength - 1] + " ");
        for (int i = 0; i < numsLength - 1; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}