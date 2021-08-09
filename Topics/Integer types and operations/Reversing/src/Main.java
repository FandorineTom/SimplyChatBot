import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int original = scanner.nextInt();
        int hundreds = original / 100;
        int tens = original % 100 / 10;
        int rest = original % 10;
        int res = rest * 100 + tens * 10 + hundreds;

        System.out.println(res);
    }
}