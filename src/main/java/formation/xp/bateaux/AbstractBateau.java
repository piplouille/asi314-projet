package formation.xp.bateaux;

public abstract class AbstractBateau {
    protected Character label;
    protected String name;
    protected int size;
    protected Cardinal orientation;

    public Character get_label() {return label;}
    public String get_name() {return name;}
    public int get_size() {return size;}
    public Cardinal get_orientation() {return orientation;}

    public void set_orientation(Cardinal n_orientation) {
        orientation = n_orientation;
    }

    public AbstractBateau(String n_name, Character n_label, int n_size, Cardinal n_orientation) {
        name = n_name;
        label = n_label;
        size = n_size;
        orientation = n_orientation;
    }

    @Override
    public String toString() {
        return String.format("bateau :" + name +" "+ size + " " +orientation);
    }

}