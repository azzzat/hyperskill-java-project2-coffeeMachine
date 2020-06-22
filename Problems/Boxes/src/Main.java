import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] box1 = new int[3];
        int[] box2 = new int[3];

        box1[0] = scan.nextInt();
        box1[1] = scan.nextInt();
        box1[2] = scan.nextInt();
        box2[0] = scan.nextInt();
        box2[1] = scan.nextInt();
        box2[2] = scan.nextInt();

        String answer = "answer";


        loop: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i != j && i != k && k != j) {
                        if (box1[0] == box2[i] && box1[1] == box2[j] && box1[2] == box2[k]) {
                            answer = "Box 1 = Box 2";
                            break loop;
                        } else if (box1[0] >= box2[i] && box1[1] >= box2[j] && box1[2] >= box2[k]) {
                            answer = "Box 1 > Box 2";
                            break loop;
                        } else if (box1[0] <= box2[i] && box1[1] <= box2[j] && box1[2] <= box2[k]) {
                            answer = "Box 1 < Box 2";
                            break loop;
                        } else {
                            answer = "Incomparable";
                        }
                    }
                }
            }
        }

        System.out.println(answer);


    }
}