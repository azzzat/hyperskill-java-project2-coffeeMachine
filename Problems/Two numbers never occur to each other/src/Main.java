import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numsLength = scan.nextInt();
        int[] nums = new int[numsLength];

        for (int i = 0; i < numsLength; i++) {
            nums[i] = scan.nextInt();
        }

        boolean answer = true;

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        for (int i = 1; i < numsLength; i++) {
            if (nums[i - 1] == num1 && nums[i] == num2 || nums[i - 1] == num2 && nums[i] == num1) {
                answer = false;
            }
        }

        System.out.println(answer);
    }
}