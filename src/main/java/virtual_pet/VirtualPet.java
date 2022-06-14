package virtual_pet;

public abstract class VirtualPet {
    private String name;
    private int hungerLevel;
    private int thirstLevel;
    protected int boredomLevel;

    public VirtualPet(String name, int hungerLevel, int thirstLevel, int boredomLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
    }

    public String getName() {
        return name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public abstract void showStatus();

    public void feed() {
        hungerLevel = 0;
    }

    public void watered() {
        thirstLevel = 0;
    }

    public void played() {
        boredomLevel= 0;
    }

    public void tick() {
        hungerLevel++;
        thirstLevel++;
        boredomLevel++;
    }

    public boolean isAlive() {
        if (hungerLevel > 9 || thirstLevel > 9 || boredomLevel > 9) {
            return false;
        }
        return true;
    }
}
