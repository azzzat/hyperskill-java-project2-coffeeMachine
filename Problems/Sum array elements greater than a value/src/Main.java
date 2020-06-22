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

        int checkNum = scan.nextInt();
        for (int num : nums) {
            if (num > checkNum) {
                answer += num;
            }
        }
        System.out.println(answer);
    }
}