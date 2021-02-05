package formation.xp;
import formation.xp.bateaux.Destroyer;
import formation.xp.bateaux.Cardinal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DestroyerTest {

    @Test
    public void test_creation_destroyer() {
        
        Destroyer mon_bateau2 = new Destroyer("myBateau", Cardinal.s);
        String name = mon_bateau2.get_name();
        assertTrue(name == "myBateau");

        Character label = mon_bateau2.get_label();
        assertTrue(label == 'D');

        int size = mon_bateau2.get_size();
        assertTrue(size == 2);

        Cardinal card = mon_bateau2.get_orientation();
        assertTrue(card == Cardinal.s);
    }
}