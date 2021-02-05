package formation.xp;
import formation.xp.bateaux.Destroyer;
import formation.xp.bateaux.Cardinal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DestroyerTest {

    @Test
    public void test_creation_destroyer() {
        
        Destroyer mon_bateau2 = new Destroyer("myBateau", Cardinal.s);
        String name = mon_bateau2.getName();
        assertTrue(name == "myBateau");

        Character label = mon_bateau2.getLabel();
        assertTrue(label == 'D');

        int size = mon_bateau2.getSize();
        assertTrue(size == 2);

        Cardinal card = mon_bateau2.getOrientation();
        assertTrue(card == Cardinal.s);
    }
}