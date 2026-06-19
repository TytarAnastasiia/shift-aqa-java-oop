public abstract class Transformer {
    protected String name;

    public Transformer(String name) {
        this.name = name;
    }

    public abstract void transform();

    @Override
    public String toString() {
        return name;
    }
}