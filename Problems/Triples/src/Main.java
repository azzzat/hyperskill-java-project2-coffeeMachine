import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numsLength = scan.nextInt();
        int[] nums = new int[numsLength];
        for (int i = 0; i < numsLength; i++) {
            nums[i] = scan.nextInt();
        }
        int answer = 0;

        for (int i = 2; i < numsLength; i++) {
            if ((nums[i - 2] + 1 == nums[i - 1]) && (nums[i - 1] + 1 == nums[i])) {
                answer += 1;
            }
        }

        System.out.println(answer);
    }
}