public class Autobot extends Transformer {
    private String teamName;        // свойство teamName
    private final String eyeColor = "blue";     // свойство eyeColor
    private boolean kindness = true;        // свойство kindness

    public Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    public void transform() {
        System.out.println(super.name + " is transforming into a vehicle");
    }
}