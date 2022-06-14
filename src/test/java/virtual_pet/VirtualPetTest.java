package virtual_pet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualPetTest {
@Test
    public void hungerShouldDecreaseWhenFed() {
    VirtualPet underTest = new RoboticDog("testPet" , 5 , 5 , 7,8,6);
    underTest.feed();
    Assertions.assertEquals(0,underTest.getHungerLevel());

}
@Test
    public void thirstShouldDecreaseWhenWatered() {
    VirtualPet underTest = new OrganicCat("testPet" , 5 , 5 , 7,7);
    underTest.watered();
    Assertions.assertEquals(0,underTest.getThirstLevel());
}
@Test
    public void boredomShouldDecreaseWhenPlayed() {
        VirtualPet underTest = new OrganicDog("testPet" , 5 , 5 , 7,7);
        underTest.played();
        Assertions.assertEquals(0,underTest.getBoredomLevel());
    }
    @Test
    public void hungerThirstBoredomShouldIncreaseWithTime() {
        VirtualPet underTest = new OrganicCat("testPet" , 5 , 5 , 7,3);
        underTest.tick();
        assertTrue( underTest.getHungerLevel() >5);
        assertTrue(underTest.getThirstLevel() >5);
        assertTrue(underTest.getBoredomLevel()>7);
    }
}