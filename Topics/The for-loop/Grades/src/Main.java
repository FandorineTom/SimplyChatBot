import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num == 5) {
                a++;
            } else if (num == 4) {
                b++;
            } else if (num == 3) {
                c++;
            } else {
                d++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}