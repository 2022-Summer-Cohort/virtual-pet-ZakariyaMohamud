package virtual_pet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    @Test
    public void HungerShouldDecreaseWhenFeedAllPets() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.feedAll();
        Assertions.assertEquals(0, underTest.getAPet(0).getHungerLevel());
    }

    @Test
    public void ThirstShouldDecreaseWhenWateredAll() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.wateredAll();
        Assertions.assertEquals(0, underTest.getAPet(2).getThirstLevel());
    }

    @Test
    public void BoredomLevelShouldDecreaseWhenPlayAll() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.playAll();
        Assertions.assertEquals(0, underTest.getAPet(1).getBoredomLevel());
    }
}