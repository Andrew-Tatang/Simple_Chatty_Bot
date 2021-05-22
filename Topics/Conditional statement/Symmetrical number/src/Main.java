import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int a = number % 10000 / 1000;
        int b = number % 1000 / 100;
        int c = number % 100 / 10;
        int d = number % 10;

        if(a == d && c == b){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}