import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String strings = scan.nextLine();
        String[] str = strings.split(" ");

        boolean answer = true;

        for (int i = 1; i < str.length; i++) {
                int compare1 = str[i - 1].compareTo(str[i]); //норм
                if (compare1 > 0) {
                    answer = false;
            }

        }

        System.out.println(answer);
    }
}