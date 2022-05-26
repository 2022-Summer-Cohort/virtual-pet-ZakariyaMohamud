public class VirtualPet {
    private String name;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;

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

   public void showGrade() {
      System.out.println("Im " + getName() + "Im  " + getHungerLevel() +
               "Im " + getThirstLevel() + "Im " + getBoredomLevel());
    }

    public void feed() {
        hungerLevel = 0;
    }

    public void watered() {
        thirstLevel = 0;
    }

    public void played() {
        boredomLevel = 0;
    }
    public void tick() {
        hungerLevel++;
        thirstLevel++;
        boredomLevel++;
    }
}
