import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String age = scanner.nextLine();
        String stageOfEducation = scanner.nextLine();
        String yearsOfExperience = scanner.nextLine();
        String preference = scanner.nextLine();

        System.out.print("The form for " + name + " is completed. ");
        System.out.println("We will contact you if we need a chef that cooks " + preference + " dishes.");

    }
}