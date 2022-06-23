package virtual_pet;

import virtual_pet.VirtualPet;

import java.util.ArrayList;


public class VirtualPetShelter {

    private ArrayList<VirtualPet> shelter;

    public VirtualPetShelter() {
        shelter = new ArrayList<>();
        shelter.add(new RoboticDog("santa", 6, 6, 1, 2, 2));
        shelter.add(new RoboticCat("Rolland", 2, 4, 5, 3, 6));
        shelter.add(new OrganicDog("Husky", 3, 5, 2, 6));
        shelter.add(new OrganicCat("Dusty", 3, 5, 1, 3));

    }

    public void adoptPet(String name) {
        shelter.remove(findByName(name));
    }

    public VirtualPet findByName(String name) {
        for (VirtualPet pet : shelter) {
            if (pet.getName().equalsIgnoreCase(name)) {
                return pet;
            }
        }
        return null;
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

    public void OilChangeRobots() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).OilChangeRobots();
            }
        }
    }

    public void MaintainRobots() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).MaintainRobots();
            }
        }
    }

    public void CleanCage() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).CleanCage();
            }
        }
    }

    public void walking() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof Walking) {
                ((Walking) pet).walking();
            }
        }
    }

    public void CleanLitterBox() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).CleanLitterBox();
            }
        }
    }

    protected void SoilCage() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).SoilCage();
            }
        }
    }
}

