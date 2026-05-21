public class Transformer {
    // переменная класса (поле) - имя
    protected String name;

    // конструктор класса
    public Transformer(String name) {
        this.name = name;
    }

    // метод run (бежать)
    public void run() {
        System.out.println(name + " is running");
    }

    // метод fire (стрелять)
    public void fire() {
        System.out.println(name + " is firing");
    }

    // метод charge (зарядиться)
    public void charge() {
        System.out.println(name + " is charging");
    }
}