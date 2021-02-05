package formation.xp;
import formation.xp.bateaux.Submarine;
import formation.xp.bateaux.Cardinal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubmarineTest {

    @Test
    public void test_creation_submarine() {
        
        Submarine mon_bateau = new Submarine("Le Terrible", Cardinal.e);
        String name = mon_bateau.get_name();
        assertTrue(name == "Le Terrible");

        Character label = mon_bateau.get_label();
        assertTrue(label == 'S');

        int size = mon_bateau.get_size();
        assertTrue(size == 3);

        Cardinal card = mon_bateau.get_orientation();
        assertTrue(card == Cardinal.e);
    }
}