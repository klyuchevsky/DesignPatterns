package objects;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String name;
    int speed;

    public CeilingFan(String name) {
        this.name = name;
        System.out.println(name);
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("set speed to high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("set speed to medium");
    }

    public void low() {
        speed = LOW;
        System.out.println("set speed to low");
    }

    public void off() {
        speed = OFF;
        System.out.println("ceiling fan off");
    }

    public int getSpeed() {
        return speed;
    }
}
