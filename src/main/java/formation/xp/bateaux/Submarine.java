package formation.xp.bateaux;

public class Submarine extends AbstractBateau {

    public Submarine(String n_name, Cardinal n_orientation) {
        super(n_name, 'S', 3, n_orientation);
    }
}