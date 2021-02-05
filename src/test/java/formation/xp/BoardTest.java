package formation.xp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BoardTest {

    @Test 
    public void testDisplay() {
        Board test = new Board("Oui",9);
        String board = test.toString();
        String expectedBoard = "Navires :\n" +
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
        expectedBoard = "Navires :\n" +
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
}