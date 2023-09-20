public class Toy {
    private int id;
    private String name;
    private int chance;

    public Toy(int id, String name, int chance) {
        this.id = id;
        this.chance = chance;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getChance() {
        return chance;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
