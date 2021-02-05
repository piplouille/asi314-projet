package formation.xp;

import formation.xp.bateaux.Destroyer;
import formation.xp.bateaux.Cardinal;
import formation.xp.Board;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BoardTest {

    @Test 
    public void testDisplay() {
        Board test = new Board("Oui",9);
        String board = test.toString();
        String expectedBoard = "-- PLAYER : Oui\n" +
                "Navires :\n" +
                "   A B C D E F G H I \n" +
                "1  . . . . . . . . . \n" +
                "2  . . . . . . . . . \n" +
                "3  . . . . . . . . . \n" +
                "4  . . . . . . . . . \n" +
                "5  . . . . . . . . . \n" +
                "6  . . . . . . . . . \n" +
                "7  . . . . . . . . . \n" +
                "8  . . . . . . . . . \n" +
                "9  . . . . . . . . . \n";

        assertEquals(expectedBoard, board);

        test = new Board("Oui",10);
        board = test.toString();
        expectedBoard = "-- PLAYER : Oui\n" +
                "Navires :\n" +
                "   A B C D E F G H I J \n" +
                "1  . . . . . . . . . . \n" +
                "2  . . . . . . . . . . \n" +
                "3  . . . . . . . . . . \n" +
                "4  . . . . . . . . . . \n" +
                "5  . . . . . . . . . . \n" +
                "6  . . . . . . . . . . \n" +
                "7  . . . . . . . . . . \n" +
                "8  . . . . . . . . . . \n" +
                "9  . . . . . . . . . . \n" +
                "10 . . . . . . . . . . \n";

        assertEquals(expectedBoard, board);
    }

    @Test
    public void testSize() {
        int expectedSize = 9;
        Board test = new Board("Oui",expectedSize);
        int size = test.getSize();
        assertEquals(expectedSize, size);
    }

    @Test
    public void testPutBateau() {
        Destroyer monBateau= new Destroyer("myBateau", Cardinal.s);
        Board test = new Board("Oui", 9);

        try {
            test.putBateau(monBateau, 0, 0);
    
            assertTrue(test.getCase(0, 0) == monBateau.getLabel());
            assertTrue(test.getCase(0, 1) == monBateau.getLabel());
            assertTrue(test.getCase(1, 1) == '.');
            assertTrue(test.getCase(0, 2) == '.');
        }
        catch (Exception e) {
            System.out.println("Erreur put bateau" + e.getMessage());
        }
    }
}