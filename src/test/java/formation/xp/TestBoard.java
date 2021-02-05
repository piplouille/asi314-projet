package formation.xp;

import formation.xp.Board;
import java.util.*;
import org.junit.*;


public class TestBoard {

    @Test 
    public void testDisplay() {
        Board test = new Board("Oui",9);
        test.printBoard(); 
    } 
}