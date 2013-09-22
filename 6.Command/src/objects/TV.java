package objects;

public class TV {
    String name;

    public TV(String name) {
        this.name = name;
        System.out.println("TV in " + name);
    }

    public void on() {
        System.out.println("TV on " + name);
    }

    public void off() {
        System.out.println("TV off " + name);
    }
}
