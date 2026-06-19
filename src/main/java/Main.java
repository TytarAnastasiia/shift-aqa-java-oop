public class Main {
    public static void main(String[] args) {
        // cоздание Autobot
        Autobot optimus = new Autobot("Optimus Prime", "Autobots");

        // cоздание Decepticon
        Decepticon megatron = new Decepticon("Megatron", "Decepticons");

        // Autobot выполняет действия
        System.out.println("=== Autobot actions ===");
        optimus.run();
        optimus.fire();
        optimus.charge();
        optimus.transform();

        System.out.println();

        // Decepticon выполняет действия
        System.out.println("=== Decepticon actions ===");
        megatron.run();
        megatron.fire();
        megatron.charge();
        megatron.transform();
    }
}