package formation.xp;

public class Board {
    private final Character[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G',
            'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
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

    public String toString() {
        StringBuilder board = new StringBuilder();
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
}
