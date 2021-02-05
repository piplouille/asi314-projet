package formation.xp;

import formation.xp.bateaux.AbstractBateau;
import formation.xp.bateaux.Cardinal;
import formation.xp.exception.PutBateauException;

public class Board {
    private final Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G',
            'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    protected int size;
    protected String name;
    protected Character[][] boats_array = new Character[26][26];

    public Board(String name, int size) {
        this.name = name;
        this.size = size;
        for (int line = 0; line < size; line++) {
            for (int col = 0; col < size; col++)
                this.boats_array[line][col] = '.';
        }
    }

    public Character[] getAlphabet() {
        return this.alphabet;
    }

    public int getSize() {
        return this.size;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBoats_array(Character[][] boats_array) {
        this.boats_array = boats_array;
    }

    public void putBateau(final AbstractBateau bateau, final int x, final int y) throws PutBateauException {
        Cardinal orientation = bateau.getOrientation();
        int sizeBateau = bateau.getSize();

        int vertical = 0;
        int horizontal = 0;

        switch (orientation) {
            case n:
                vertical = 1;
                break;
            case s:
                vertical = -1;
                break;
            case e:
                horizontal = -1;
                break;
            case w:
                horizontal = 1;
                break;
        }

        //On vérifie que les cases sont libres et suffisamment grande pour le bateau à ajouter
        for (int i = 0 ; i < sizeBateau ; i++)
        {
            if ( x+vertical*i >= this.size || x+vertical*i < 0 || y+horizontal*i >= this.size || y+horizontal*i < 0) {
                throw new PutBateauException();
            }
            else if (boats_array[x+vertical*i][y+horizontal*i] != null) {
                throw new PutBateauException();
            }
        }
        
        for (int i=0; i < sizeBateau ; i++) {
            boats_array[x+vertical*i][y+horizontal*i] = bateau.getLabel();
        }
    }

    public String toString() {
        StringBuilder board = new StringBuilder();
        board.append("-- PLAYER : ");
        board.append(this.name);
        board.append("\n");
        board.append("Navires :\n   ");
        for (int col = 0; col < size; col++)
            board.append(alphabet[col].toString()).append(" ");
        board.append("\n");
        for (int line = 1; line <= size; line++) {
            if (line >= 10)
                board.append(line).append(" ");
            else
                board.append(line).append("  ");
            for (int col = 1; col <= size; col++) {
                board.append(boats_array[line - 1][col - 1]).append(" ");
            }
            board.append("\n");
        }
        return board.toString();
    }

    public Character getCase(int x, int y) {
        return boats_array[x][y];
    }

}
