import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int num = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean res1 = !weekend && num >= 10 && num <= 20;
        boolean res2 = weekend && num >= 15 && num <= 25;
        boolean res = res1 || res2;

        System.out.println(res);
    }
}