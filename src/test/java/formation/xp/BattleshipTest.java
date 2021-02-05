package formation.xp;
import formation.xp.bateaux.Battleship;
import formation.xp.bateaux.Cardinal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BattleshipTest {
    @Test
    public void test_creation_battleship() {
        
        Battleship mon_bateau = new Battleship("myBateau", Cardinal.e);
        String name = mon_bateau.getName();
        assertTrue(name == "myBateau");

        Character label = mon_bateau.getLabel();
        assertTrue(label == 'B');

        int size = mon_bateau.getSize();
        assertTrue(size == 4);

        Cardinal card = mon_bateau.getOrientation();
        assertTrue(card == Cardinal.e);
    }

}