package homeTheatre;

public class DvdPlayer {
    public void on() {
        System.out.println("DVD player on");
    }

    public void off() {
        System.out.println("DVD player off");
    }

    public void eject() {
        System.out.println("DVD player eject");
    }

    public void pause() {
        System.out.println("DVD player pause");
    }

    public void play(String movie) {
        System.out.println("DVD player play movie: " + movie);
    }

    public void setSurroundAudio() {
        System.out.println("DVD player set surround audio");
    }

    public void setTwoChannelAudio() {
        System.out.println("DVD player set two channel audio");
    }

    public void stop() {
        System.out.println("DVD player stop");
    }
}
