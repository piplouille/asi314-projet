package formation.xp.bateaux;
public class Battleship extends AbstractBateau {

    public Battleship(String n_name, Cardinal n_orientation) {
        super(n_name, 'B', 4, n_orientation);
    }
}