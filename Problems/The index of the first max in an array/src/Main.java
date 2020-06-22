import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numsLength = scan.nextInt();
        int[] nums = new int[numsLength];

        for (int i = 0; i < numsLength; i++) {
            nums[i] = scan.nextInt();
        }

        int maxNumber = nums[0];
        int indexOfMaxNumber = 0;

        for (int i = 1; i < numsLength; i++) {
            if (nums[i] > maxNumber) {
                maxNumber = nums[i];
                indexOfMaxNumber = i;
            }
        }

        System.out.println(indexOfMaxNumber);
    }
}