package virtual_pet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoboticPetTest {
    @Test
    public void oilLevelShouldGoUPWhenOilChangeRobots() {
       VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.OilChangeRobots();
        Assertions.assertEquals(10, ((RoboticPet)underTest.getAPet(0)  ).getOilLevel());
    }
    @Test
    public void maintenanceLevelShouldIncreaseWhenMaintainRobots(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.MaintainRobots();
        Assertions.assertEquals(10,((RoboticPet)underTest.getAPet(1)).getMaintenanceLevel());
    }
}
