package formation.xp;
import formation.xp.bateaux.Battleship;
import formation.xp.bateaux.Carrier;
import formation.xp.bateaux.Submarine;
import formation.xp.bateaux.Destroyer;
import formation.xp.bateaux.Cardinal;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTest {

    @Test
    public void testInitializeGame() {
        String expectedSize = "9";
        int actualSize = -1;
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(expectedSize.getBytes()));
            stdin = System.in;
            Game game = new Game();
            actualSize = game.getPlayer1().getSize();
        } finally {
            System.setIn(stdin);
        }
        assertEquals(Integer.parseInt(expectedSize), actualSize);
    }

}
