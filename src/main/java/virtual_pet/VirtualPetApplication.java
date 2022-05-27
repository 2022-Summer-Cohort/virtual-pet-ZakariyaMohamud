package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPet santa = new VirtualPet("Santa", 5 , 5,5);
        Scanner input = new Scanner(System.in);
        while (santa.isAlive()) {
            santa.showStatus();
            System.out.println("Enter selection: Feed|Water|Play|Quit");
            String userSelection = input.nextLine();
            switch (userSelection.toLowerCase()){
                case "feed":
                    santa.feed();
                    break;
                case "water":
                    santa.watered();
                    break;
                case "play":
                    santa.played();
                    break;
                case "quit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid choice");

            }
            santa.tick();

        }
        //Interact with a virtual_pet.VirtualPet object in this method
        // TODO: 5/26/2022 add gameloop to interact with user. 
    }

}
