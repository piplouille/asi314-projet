package formation.xp;
import formation.xp.bateaux.Carrier;
import formation.xp.bateaux.Cardinal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarrierTest {

    @Test
    public void test_creation_carrier() {
        
        Carrier mon_bateau = new Carrier("CDG", Cardinal.e);
        String name = mon_bateau.getName();
        assertTrue(name == "CDG");

        Character label = mon_bateau.getLabel();
        assertTrue(label == 'C');

        int size = mon_bateau.getSize();
        assertTrue(size == 5);

        Cardinal card = mon_bateau.getOrientation();
        assertTrue(card == Cardinal.e);
    }

}