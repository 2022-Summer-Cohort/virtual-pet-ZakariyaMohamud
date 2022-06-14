package virtual_pet;

public abstract class RoboticPet extends VirtualPet {
    protected int oilLevel;
    protected int maintenanceLevel;
    private int cleanlinessLevel;

    public int getOilLevel() {
        return oilLevel;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public RoboticPet(String name, int hungerLevel, int thirstLevel, int boredomLevel, int oilLevel, int maintenanceLevel) {
        super(name, hungerLevel, thirstLevel, boredomLevel);
        this.oilLevel = oilLevel;
        this.maintenanceLevel = maintenanceLevel;

    }

    public void getMaintenanceOilLevel(){

    }

    public void MaintainRobots() {
        maintenanceLevel = 10;
    }
    public void OilChangeRobots(){
        oilLevel = 10;
    }
@Override
    public void tick(){
        maintenanceLevel--;
        oilLevel--;
        cleanlinessLevel--;
        super.tick();
    }
}

