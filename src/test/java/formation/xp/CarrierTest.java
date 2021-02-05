package formation.xp;
import formation.xp.bateaux.Carrier;
import formation.xp.bateaux.Cardinal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarrierTest {

    @Test
    public void test_creation_carrier() {
        
        Carrier mon_bateau = new Carrier("CDG", Cardinal.e);
        String name = mon_bateau.get_name();
        assertTrue(name == "CDG");

        Character label = mon_bateau.get_label();
        assertTrue(label == 'C');

        int size = mon_bateau.get_size();
        assertTrue(size == 5);

        Cardinal card = mon_bateau.get_orientation();
        assertTrue(card == Cardinal.e);
    }

}