import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int perfect = 0;
        int fix = 0;
        int reject = 0;
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            if (d == -1) {
                reject++;
            } else if (d == 1) {
                fix++;
            } else {
                perfect++;
            }
        }
        System.out.println(perfect + " " + fix + " " + reject);
    }
}