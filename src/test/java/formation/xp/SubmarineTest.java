package formation.xp;
import formation.xp.bateaux.Submarine;
import formation.xp.bateaux.Cardinal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubmarineTest {

    @Test
    public void test_creation_submarine() {
        
        Submarine mon_bateau = new Submarine("Le Terrible", Cardinal.e);
        String name = mon_bateau.getName();
        assertTrue(name == "Le Terrible");

        Character label = mon_bateau.getLabel();
        assertTrue(label == 'S');

        int size = mon_bateau.getSize();
        assertTrue(size == 3);

        Cardinal card = mon_bateau.getOrientation();
        assertTrue(card == Cardinal.e);
    }
}