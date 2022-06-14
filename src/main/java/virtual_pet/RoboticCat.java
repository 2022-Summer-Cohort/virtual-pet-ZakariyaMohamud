package virtual_pet;
import virtual_pet.Walking;

public class RoboticCat extends RoboticPet {
    public RoboticCat(String name, int hungerLevel, int thirstLevel, int boredomLevel, int oilLevel, int maintenanceLevel) {
        super(name, hungerLevel, thirstLevel, boredomLevel, oilLevel, maintenanceLevel);
    }

    @Override
    public void getMaintenanceOilLevel() {
        maintenanceLevel = 10;
    }

    @Override
    public void showStatus() {
        System.out.println("Im " + getName() + " My hunger level is  " + getHungerLevel() +
                " my thirst level is " + getThirstLevel() + " my boredom level " + getBoredomLevel() + "My oil level is " + getOilLevel() + "and My maintenance level is" + getMaintenanceLevel());
    }
}
