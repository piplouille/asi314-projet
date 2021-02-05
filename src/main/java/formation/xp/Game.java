package formation.xp;

import java.util.Scanner;

public class Game {
    private Board player1;

    public Board getPlayer1() {
        return player1;
    }

    public Board getPlayer2() {
        return player2;
    }

    private Board player2;

    public Game() {
        System.out.println("Bataille Navale");

        initializeGame();
    }

    private void initializeGame() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Entrer la taille du plateau");
        String userInput = myObj.nextLine();
        Integer sizeBoard = Integer.parseInt(userInput);

        player1 = new Board("Joueur 1", sizeBoard);
        player2 = new Board("Joueur 2", sizeBoard);
    }
}
