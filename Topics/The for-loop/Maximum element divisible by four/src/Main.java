import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int res = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 4 == 0 && num > res) {
                res = num;
            }
        }
        System.out.println(res);
    }
}