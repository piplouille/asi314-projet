package formation.xp;

public class Board {
    private Character[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
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

    public Character[] getalphabet() {
        return this.alphabet;
    }

    public void setalphabet(Character[] alphabet) {
        this.alphabet = alphabet;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character[][] getBoats_array() {
        return this.boats_array;
    }

    public void setBoats_array(Character[][] boats_array) {
        this.boats_array = boats_array;
    }

    private void printFirstLine() {
        System.out.print("Navires :");
        System.out.println("");
        System.out.print("   ");
        for (int i = 0; i < size; i++) {
            System.out.print(alphabet[i].toString() + " ");
        }
        System.out.println("");
    }

    public void printBoard() {

        this.printFirstLine();
        for (int line = 1; line <= size; line++) {
            System.out.print(line + "  ");
            for (int col = 1; col <= size; col++) {
                System.out.print(boats_array[line - 1][col - 1] + " ");
            }
            System.out.println("");
        }
    }

}
