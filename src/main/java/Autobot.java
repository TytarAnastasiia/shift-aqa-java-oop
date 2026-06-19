public class Autobot extends Transformer {
    private String teamName;        // свойство teamName
    private final String eyeColor = "blue";     // свойство eyeColor
    private boolean kindness = true;        // свойство kindness

    public Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public boolean getKindness() {
        return kindness;
    }

    public void setKindness(String kindness) {
        this.kindness = Boolean.parseBoolean(kindness);
    }

    public String getEyeColor() {
        return eyeColor;
    }


    public void transform() {
        System.out.println(super.name + " is transforming into a vehicle");
    }
}