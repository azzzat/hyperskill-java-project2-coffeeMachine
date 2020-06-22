import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String row = scan.nextLine();
        String[] nums = row.split(" ");

        int shift = scan.nextInt();
        shift = shift % nums.length;


        for (int i = 0; i < nums.length; i++) {
            if (i - shift < 0) {
                System.out.print(nums[i + nums.length - shift] + " ");
            } else if (i - shift >= 0) {
                System.out.print(nums[i - shift] + " ");
            }
        }
    }
}