package RentAnAnimal;
import java.util.Scanner;

public class RentAnAnimal {
    public static void main(String[] args) {
        System.out.println("Welcome to Rent-An-Animal!");
        Animal renter = new Animal();
        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nWhat would you like to do?");
            System.out.print("\n1. Rent an Animal\n2. Return animal\n3. Quit\n");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch(choice) {
                case 1:
                    renter.rent();
                    break;
                case 2:
                    renter.returnAnimal();
                    break;
                case 3:
                    System.exit(0);
            }

        }
    }
}
