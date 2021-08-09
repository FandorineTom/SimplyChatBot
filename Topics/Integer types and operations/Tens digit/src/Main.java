import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int original = scanner.nextInt();
        int hundreds = original % 100;
        int tens = hundreds / 10;
        System.out.println(tens);
    }
}