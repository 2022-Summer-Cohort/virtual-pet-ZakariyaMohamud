package virtual_pet;

import virtual_pet.VirtualPet;

public class RoboticDog extends RoboticPet implements Walking{

    public RoboticDog(String name, int hungerLevel, int thirstLevel, int boredomLevel, int oilLevel, int maintenanceLevel) {
        super(name, hungerLevel, thirstLevel, boredomLevel, oilLevel, maintenanceLevel);

    }



    @Override
    public void walking() {
        oilLevel--;
        maintenanceLevel--;
        boredomLevel--;
        System.out.println("The RoboticDog walks!");
    }

    @Override
    public void OilChangeRobots() {

        super.OilChangeRobots();
    }

    @Override
    public void showStatus() {
        System.out.println("Im " + getName() + " My hunger  level is  " + getHungerLevel() +
                " thirst is " + getThirstLevel() + "  boredom level is " + getBoredomLevel() + "My oil change level is " + getOilLevel() + "and My maintenance level is" + getMaintenanceLevel());
    }
}

