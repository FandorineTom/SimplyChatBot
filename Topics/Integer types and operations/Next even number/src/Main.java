import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int original = scanner.nextInt();
        System.out.println(original - (original % 2) + 2);
    }
}