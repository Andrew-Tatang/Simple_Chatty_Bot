import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int height = scanner.nextInt();
        int up = scanner.nextInt();
        int down = scanner.nextInt();

        int currHeight=0, day = 0;

        while(currHeight != height){
            currHeight += up;

            if(currHeight != height){
                currHeight -= down;
            }

            day++;
        }

        System.out.println(day);
    }
}