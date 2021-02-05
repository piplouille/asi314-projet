package formation.xp;
import formation.xp.bateaux.Battleship;
import formation.xp.bateaux.Cardinal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    @Test
    public void test_creation_bateau() {
        
        Battleship mon_bateau = new Battleship("myBateau", Cardinal.e);
        String name = mon_bateau.get_name();
        assertTrue(name == "myBateau");

        Character label = mon_bateau.get_label();
        assertTrue(label == 'B');

        int size = mon_bateau.get_size();
        assertTrue(size == 4);

        Cardinal card = mon_bateau.get_orientation();
        assertTrue(card == Cardinal.e);
    }
}
