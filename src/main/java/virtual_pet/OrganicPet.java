package virtual_pet;

public abstract class OrganicPet extends VirtualPet {
    protected int cleanlinessLevel;


    public OrganicPet(String name, int hungerLevel, int thirstLevel, int boredomLevel, int cleanlinessLevel) {
        super(name, hungerLevel, thirstLevel, boredomLevel);
        this.cleanlinessLevel = cleanlinessLevel;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;

    }

    public void CleanCage() {

        cleanlinessLevel = 10;
    }
    public void SoilCage(){
        cleanlinessLevel--;
    }

    public void CleanLitterBox() {
        cleanlinessLevel = 10;
}
}
