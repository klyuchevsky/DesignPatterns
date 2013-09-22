package objects;

public class Hottub {
    String name;

    public Hottub(String name) {
        this.name = name;
        System.out.println("hottub " + name);
    }

    public void on() {
        System.out.println("Hottub on " + name);
    }

    public void off() {
        System.out.println("Hottub off " + name);
    }
}
