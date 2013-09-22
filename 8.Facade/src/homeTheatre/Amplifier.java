package homeTheatre;

public class Amplifier {
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public void on() {
        System.out.println("amplifier on");
    }

    public void off() {
        System.out.println("amplifier off");
    }

    public void setCD() {
        System.out.println("amplifier set CD");
    }

    public void setDVD(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
        System.out.println("amplifier set DVD");
    }

    public void setStereoSound() {
        System.out.println("amplifier set stereo sound");
    }

    public void setSurroundSound() {
        System.out.println("amplifier set surround sound");
    }

    public void setTuner() {
        System.out.println("amplifier set tuner");
    }

    public void setVolume(int volume) {
        System.out.println("amplifier set volume to " + volume);
    }
}
