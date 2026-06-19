public class Transformer {
    // переменная класса (поле) - имя
    private String name;

    // конструктор класса
    public Transformer(String name) {
        this.name = name;
    }

    //метод для получения значения
    public String getName() {
        return name;
    }

    // метод для установки значения
    public void setName(String name) {
        this.name = name;
    }

    // метод run (бежать)
    public void run() {
        System.out.println(this.name + " is running");
    }

    // метод fire (стрелять)
    public void fire() {
        System.out.println(this.name + " is firing");
    }

    // метод charge (зарядиться)
    public void charge() {
        System.out.println(this.name + " is charging");
    }
}