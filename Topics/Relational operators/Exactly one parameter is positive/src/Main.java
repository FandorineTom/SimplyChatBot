import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        boolean res1 = num1 > 0 && num2 <= 0 && num3 <= 0;
        boolean res2 = num2 > 0 && num1 <= 0 && num3 <= 0;
        boolean res3 = num3 > 0 && num1 <= 0 && num2 <= 0;
        boolean res = res1 || res2 || res3;
        
        System.out.println(res);
    }
}
