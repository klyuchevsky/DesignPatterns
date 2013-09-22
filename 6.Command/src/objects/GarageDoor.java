package objects;

public class GarageDoor {
    String name;

    public GarageDoor(String name) {
        this.name = name;
        System.out.println(name);
    }

    public void up() {
        System.out.println(name + " up");
    }

    public void down() {
        System.out.println(name + " down");
    }
}
