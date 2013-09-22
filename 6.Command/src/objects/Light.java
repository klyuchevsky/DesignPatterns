package objects;

public class Light {
    String name;

    public Light(String name) {
        this.name = name;
        System.out.println("light in " + name);
    }

    public void on() {
        System.out.println("light on " + name);
    }

    public void off() {
        System.out.println("light off " + name);
    }
}
