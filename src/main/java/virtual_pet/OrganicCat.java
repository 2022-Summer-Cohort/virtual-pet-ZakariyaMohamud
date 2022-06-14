package virtual_pet;

public class OrganicCat extends OrganicPet {
    public OrganicCat(String name, int hungerLevel, int thirstLevel, int boredomLevel, int cleanlinessLevel) {
        super(name, hungerLevel, thirstLevel, boredomLevel, cleanlinessLevel);

    }

    @Override
    public void showStatus() {
        System.out.println(" Hi! Im " + getName() + " my hunger level is   " + getHungerLevel() +
                " my thirst level is  " + getThirstLevel() + " my boredom level is " + getBoredomLevel() + "and my Litter box cleanliness level is" + getCleanlinessLevel());
    }
}
