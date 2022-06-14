package virtual_pet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrganicPetTest {
    @Test
    public void cleanlinessLevelShouldIncreaseWhenCleanCage() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.CleanCage();
        Assertions.assertEquals(10,((OrganicPet)underTest.getAPet(2)).getCleanlinessLevel());
    }
    @Test
    public void cleanlinessLevelShouldIncreaseWhenCleanLitterBox(){
        VirtualPetShelter underTest =new VirtualPetShelter();
        underTest.CleanLitterBox();
        Assertions.assertEquals(10,((OrganicPet)underTest.getAPet(3)).getCleanlinessLevel());
    }
}
