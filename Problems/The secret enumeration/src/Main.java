public class Main {

    public static void main(String[] args) {
        Secret[] constants = Secret.values();
        int length = constants.length;

        String value = null;
        int answer = 0;

        for (int i = 0; i < length; i++) {
            value = constants[i].toString();
            if (value.startsWith("STAR")) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}

/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
*/