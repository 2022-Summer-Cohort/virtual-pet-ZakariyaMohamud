package virtual_pet;

public class OrganicDog extends OrganicPet implements Walking {

    public OrganicDog(String name, int hungerLevel, int thirstLevel, int boredomLevel, int cleanlinessLevel) {
        super(name, hungerLevel, thirstLevel, boredomLevel, cleanlinessLevel);
    }

    @Override
    public void walking() {
        boredomLevel--;

    }


    @Override
    public void showStatus() {
        System.out.println("Hi! Im " + getName() + " my hunger level is   " + getHungerLevel() +
                " my thirst level is " + getThirstLevel() + " my boredom level is  " + getBoredomLevel() + " and my Cage cleanliness level is " + getCleanlinessLevel() + ".");
    }

    @Override
    public void SoilCage() {
        super.SoilCage();
        cleanlinessLevel--;
    }
}
