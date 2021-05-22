import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int hours = scanner.nextInt();

        if(hours >= min && hours <= max){
            System.out.println("Normal");
        } else if(hours < min) {
            System.out.println("Deficiency");
        } else {
            System.out.println("Excess");
        }
    }
}