import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        int secConverted1 = (hours1 * 60 + minutes1) * 60 + seconds1;
        int secConverted2 = (hours2 * 60 + minutes2) * 60 + seconds2;
        System.out.println(secConverted2 - secConverted1);
    }
}