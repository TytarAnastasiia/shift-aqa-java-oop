public class Decepticon extends Transformer implements Action {
    private String teamName;
    private final String eyeColor = "red";
    private boolean kindness = false;

    public Decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    @Override
    public void transform() {
        System.out.println(super.name + " is transforming into a fighter jet");
    }

    @Override
    public void fire() {
        System.out.println(super.name + " is firing");
    }

    @Override
    public void charge() {
        System.out.println(super.name + " is charging");
    }

    @Override
    public void run() {
        System.out.println(super.name + " is running");
    }
}