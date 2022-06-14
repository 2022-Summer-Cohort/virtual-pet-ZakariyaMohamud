package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetApplication {
    private Scanner input;
    private VirtualPetShelter pets;
    public static void main(String[] args) {
        VirtualPetApplication myApp = new VirtualPetApplication();
        myApp.gameLoop();
    }
    public void gameLoop(){
        VirtualPet dog1 = new OrganicCat("Maddog", 5 , 5,5,5);
        pets = new VirtualPetShelter();
        pets.admitPet(dog1);
        input = new Scanner(System.in);
        while (pets.areAlive()) {
            pets.showAllPetStatus();
            System.out.println("Enter selection: feed|walking|oil change|clean cage|interact| clean litter box|maintain robots|water|play|adopt|admit|quit");
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
                case "admit":
                    System.out.println("Whats the name of the pet you want to admit?");
                    String name = input.nextLine();
                    System.out.println("What kind of pet do you want to admit? RoboticDog|RoboticCat|OrganicDog|OrganicCat, ");
                    String petType = input.nextLine();
                    if (petType.equalsIgnoreCase("RoboticDog")){
                        pets.admitPet(new RoboticDog(name,2,4,1,2,3));
                    }
                   if (petType.equalsIgnoreCase("RoboticCat")){
                       pets.admitPet(new RoboticCat(name,2,4,4,4,4));
                   }
                   if (petType.equalsIgnoreCase("OrganicDog")) {
                       pets.admitPet(new OrganicDog(name, 3, 3, 3, 3));
                   }
                   if(petType.equalsIgnoreCase("OrganicCat")) {
                       pets.admitPet(new OrganicCat(name,3,3,3,3));
                }
                    break;
                case "adopt":
                    System.out.println("Which pet would you like to adopt?");
                    String name1 = input.nextLine();
                    pets.adoptPet(name1);
                    break;
                case "oil change":
                    pets.OilChangeRobots();
                    break;
                case "clean cage":
                    pets.CleanCage();
                break;
                case "soil cage":
                    pets.SoilCage();
                    break;
                case "clean litter box":
                    pets.CleanLitterBox();
                    break;
                case "walking":
                    pets.walking();
                    break;
                case "maintain robots":
                    pets.MaintainRobots();
                    break;
                case "interact":
                    System.out.println("Which pet would you like to interact with? santa|Rolland|Husky|Dusty|Maddog" );
                    String name2 = input.nextLine();
                    interactWithIndividualPet(pets.findByName(name2));
                    break;
                default:
                    System.out.println("invalid choice");

            }
            pets.tick();

        }

        //Interact with a virtual_pet.VirtualPet object in this method
        // TODO: 5/26/2022 add gameloop to interact with user. 
    }
    public  void interactWithIndividualPet(VirtualPet pet) {

        if (pet instanceof RoboticDog) {
            System.out.println("Walking|Oil Change|Clean Cage|Maintenance|Water|Feed|Play");
        }
        if (pet instanceof RoboticCat) {
            System.out.println("OilChange,CleanLitterBox,Maintenance");
        }
        if (pet instanceof OrganicDog) {
            System.out.println("SoilCage|CleanCage|Walking");
        }
        if (pet instanceof OrganicCat) {
            System.out.println("CleanLitterBox");
        }
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("walking") && pet instanceof Walking) {
            ((Walking) pet).walking();
        }
        if (choice.equalsIgnoreCase("oil change")) {
            pets.OilChangeRobots();
        }
        if (choice.equalsIgnoreCase("maintenance")) {
            pets.MaintainRobots();
        }
        if (choice.equalsIgnoreCase("clean Cage")) {
            pets.CleanCage();
        }
        if (choice.equalsIgnoreCase("water")) {
            pets.wateredAll();
        }
        if (choice.equalsIgnoreCase("feed")) {
            pets.feedAll();
        }
        if (choice.equalsIgnoreCase("play")) {
            pets.playAll();
        }
        if (choice.equalsIgnoreCase("soil cage")) {
            pets.SoilCage();
        }
        if (choice.equalsIgnoreCase("clean litter box")) {
            pets.CleanLitterBox();
        }
    }
}
