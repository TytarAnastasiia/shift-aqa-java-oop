public interface Action {

    void fire();

    void charge();

    default void run() {
        System.out.println("is running");
    }
}