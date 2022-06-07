package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPet dog1 = new VirtualPet("Maddog", 5 , 5,5);
        VirtualPetShelter pets = new VirtualPetShelter();
        pets.admitPet(dog1);
        Scanner input = new Scanner(System.in);
        while (pets.areAlive()) {
            pets.showAllPetStatus();
            System.out.println("Enter selection: Feed|Water|Play|Adopt|Quit");
            String userSelection = input.nextLine();
            switch (userSelection.toLowerCase()){
                case "feed":
                    pets.feedAll();
                    break;
                case "water":
                    pets.wateredAll();
                    break;
                case "play":
                    pets.playAll();
                    break;
                case "quit":
                    System.exit(0);
                    break;
                case "adopt":
                    System.out.println("Which pet would you like to adopt?");
                    String name = input.nextLine();
                    pets.adoptPet(name);
                default:
                    System.out.println("invalid choice");

            }
            pets.tick();

        }
        //Interact with a virtual_pet.VirtualPet object in this method
        // TODO: 5/26/2022 add gameloop to interact with user. 
    }

}
