import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int original = scanner.nextInt();
        int num1 = original / 100;
        original = original % 100;
        int num2 = original / 10;
        int num3 = original % 10;
        System.out.println(num1 + num2 + num3);
    }
}