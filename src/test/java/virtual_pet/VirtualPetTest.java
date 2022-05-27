package virtual_pet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualPetTest {
@Test
    public void hungerShouldDecreaseWhenFed() {
    VirtualPet underTest = new VirtualPet("testPet" , 5 , 5 , 7);
    underTest.feed();
    Assertions.assertEquals(0,underTest.getHungerLevel());

}
@Test
    public void thirstShouldDecreaseWhenWatered() {
    VirtualPet underTest = new VirtualPet("testPet" , 5 , 5 , 7);
    underTest.watered();
    Assertions.assertEquals(0,underTest.getThirstLevel());
}
@Test
    public void boredomShouldDecreaseWhenPlayed() {
        VirtualPet underTest = new VirtualPet("testPet" , 5 , 5 , 7);
        underTest.played();
        Assertions.assertEquals(0,underTest.getBoredomLevel());
    }
    @Test
    public void hungerThirstBoredomShouldIncreaseWithTime() {
        VirtualPet underTest = new VirtualPet("testPet" , 5 , 5 , 7);
        underTest.tick();
        assertTrue( underTest.getHungerLevel() >5);
        assertTrue(underTest.getThirstLevel() >5);
        assertTrue(underTest.getBoredomLevel()>7);
    }
}