import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numsLength = scan.nextInt();
        int[] nums = new int[numsLength];
        for (int i = 0; i < numsLength; i++) {
            nums[i] = scan.nextInt();
        }
        int answer = 1;

        if (numsLength == 0) {
            answer = 0;
        } else if (numsLength == 1) {
            answer = 1;
        } else if (numsLength == 2) {
            if (nums[0] > nums[1]) {
                answer = 1;
            } else {
                answer = 2;
            }
        } else if (numsLength > 2) {
            int answer1 = 2;
            for (int i = 2; i < numsLength; i++) {
                if (nums[i - 2] == nums[i - 1]) {
                    answer1 = 2;
                }
                if (nums[i - 2] < nums[i - 1]) {
                    if (nums[i - 1] < nums[i]) {
                        answer1 += 1;
                    } else {
                        answer1 = 2;
                    }
                    if (answer1 > answer) {
                        answer = answer1;
                    }
                }

            }
        }

        System.out.println(answer);

    }
}