package virtual_pet;

import virtual_pet.VirtualPet;

import java.util.ArrayList;


public class VirtualPetShelter {

    private ArrayList<VirtualPet> shelter;

    public VirtualPetShelter() {
        shelter = new ArrayList<>();
        shelter.add(new VirtualPet("santa", 6, 6, 1));
        shelter.add(new VirtualPet("Rolland", 2, 4, 5));
        shelter.add(new VirtualPet("Husky", 3, 5, 2));
    }

    public void admitPet(VirtualPet pet) {
        shelter.add(pet);
    }

    public void feedAll() {
        for (VirtualPet pet : shelter) {
            pet.feed();
        }
    }

    public void wateredAll() {
        for (VirtualPet pet : shelter) {
            pet.watered();
        }
    }

    public void showAllPetStatus() {
        for (VirtualPet pet : shelter) {
            pet.showStatus();
        }
    }

    public boolean areAlive() {
        for (VirtualPet pet : shelter) {
            if (!pet.isAlive()) {
                return false;
            }
        }
        return true;
    }

    public void playAll() {
        for (VirtualPet pet : shelter) {
            pet.played();
        }
    }

    public void tick() {
        for (VirtualPet pet : shelter) {
            pet.tick();
        }
    }
    public VirtualPet getAPet(int index) {
        return shelter.get(index);
    }
}

