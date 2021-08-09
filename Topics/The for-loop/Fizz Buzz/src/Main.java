import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (; a <= b; a++) {
            if (a % 3 != 0 && a % 5 != 0) {
                System.out.print(a);
            }
            if (a % 3 == 0) {
                System.out.print("Fizz");
            }
            if (a % 5 == 0) {
                System.out.print("Buzz");
            }
            System.out.println();
        }
    }
}