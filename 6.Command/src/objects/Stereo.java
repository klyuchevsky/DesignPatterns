package objects;

public class Stereo {
    String name;

    public Stereo(String string) {
        this.name = string;
        System.out.println(string);
    }

    public void on() {
        System.out.println(name + " on");
    }

    public void off() {
        System.out.println(name + " off");
    }

    public void setCD() {
        System.out.println("set CD on " + name);
    }

    public void setDVD() {
        System.out.println("set DVD on " + name);
    }

    public void setRadio() {
        System.out.println("ser radio on " + name);
    }

    public void setVolume(int i) {
        System.out.println("set volume to " + i + " on " + name);
    }
}
