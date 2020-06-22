import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numsLength = scan.nextInt();
        int[] nums = new int[numsLength];


        for (int i = 0; i < numsLength; i++) {
            nums[i] = scan.nextInt();
        }

        int answer = nums[0] * nums[1];

        for (int n = 0; n < numsLength; n++) {
            for (int m = 0; m < numsLength; m++) {
                if (m == n) {
                    continue;
                }
                if (nums[m] * nums[n] > answer) {
                    answer = nums[m] * nums[n];
                }
            }
        }

        System.out.println(answer);

    }
}