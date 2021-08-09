import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int duration = scanner.nextInt();
        int food = scanner.nextInt();
        int flight = scanner.nextInt();
        int stay = scanner.nextInt();
        System.out.println(duration * food + flight * 2 + stay * (duration - 1));
    }
}