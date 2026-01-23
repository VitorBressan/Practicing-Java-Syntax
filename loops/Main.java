package loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int userNumber = 1;
        int attempts = 0;
        do {
            System.out.println("Please type the number 0: ");
            userNumber = scanner.nextInt();
            attempts++;

        } while(userNumber != 0);
        scanner.close();

        System.out.println("Well done! You needed " + attempts + " attempts!");
    }
}
