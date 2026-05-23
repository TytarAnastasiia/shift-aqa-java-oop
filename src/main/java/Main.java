import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // создание по одному трансформеру
        Autobot optimus = new Autobot("Optimus Prime", "Autobots");
        Decepticon megatron = new Decepticon("Megatron", "Decepticons");

        // выполнение действий
        System.out.println("=== Autobot actions ===");
        optimus.run();
        optimus.fire();
        optimus.charge();
        optimus.transform();

        System.out.println();

        System.out.println("=== Decepticon actions ===");
        megatron.run();
        megatron.fire();
        megatron.charge();
        megatron.transform();

        System.out.println();

        // список
        List<Transformer> transformers = new ArrayList<>();
        transformers.add(optimus);
        transformers.add(megatron);

        System.out.println("=== List of transformers ===");
        for (Transformer t : transformers) {
            System.out.println(t);
        }
    }
}