import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.println(str.substring(0, 1).equalsIgnoreCase("J"));
    }
}