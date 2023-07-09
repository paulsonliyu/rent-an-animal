package RentAnAnimal;
import java.util.Scanner;

public class Animal {
    private String name;
    private String date;
    private String tag;
    private String animal;
    private String breed;
    private String returnDate;
    private String returnHealth;

    public void rent(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        this.name = input.nextLine();
        System.out.print("Enter today's date: ");
        this.date = input.nextLine();
        System.out.print("Enter the animal you want: ");
        this.animal = input.nextLine();
        System.out.print("Enter the breed you want: ");
        this.breed = input.nextLine();

        this.tag = createTag();
        System.out.printf("The tag for your animal is : %s\n", this.tag);
    }

    private String createTag(){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String nums = "0123456789";
        char[] tag = new char[10];
        for(int i = 0; i < tag.length/2; i++) {
            int rng = (int) (Math.random() * chars.length());
            tag[i] = chars.charAt(rng);
        }

        for (int i = tag.length/2; i < tag.length; i++) {
            int rng = (int) (Math.random() * nums.length());
            tag[i] = nums.charAt(rng);
        }

        return new String(tag);
    }

    public void returnAnimal() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the return date?: ");
        this.returnDate = input.nextLine();
        System.out.print("What is the health?: ");
        this.returnHealth = input.nextLine();

        System.out.print("\nHere is your receipt: ");
        receipt();
    }

    private void receipt(){
        System.out.printf("\nName: %s", this.name);
        System.out.printf("\nDate: %s", this.date);
        System.out.printf("\nAnimal: %s", this.animal);
        System.out.printf("\nBreed: %s", this.breed);
        System.out.printf("\nTag: %s", this.tag);
        System.out.printf("\nReturn Date: %s", this.returnDate);
        System.out.printf("\nReturn Health: %s\n", this.returnHealth);
    }

}
