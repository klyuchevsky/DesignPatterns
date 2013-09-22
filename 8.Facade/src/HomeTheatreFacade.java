import homeTheatre.*;

public class HomeTheatreFacade {
    Amplifier amplifier;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Projector projector;
    TheatreLights theatreLights;
    Screen screen;
    PopcornPopper popcornPopper;

    public HomeTheatreFacade(Amplifier amplifier, Tuner tuner,
                             DvdPlayer dvdPlayer, CdPlayer cdPlayer,
                             Projector projector, Screen screen,
                             TheatreLights theatreLights, PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.theatreLights = theatreLights;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movie) {
        System.out.println("get ready to watch a movie...");
        popcornPopper.on();
        popcornPopper.pop();
        theatreLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDVD(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("shutting movie theatre down...");
        popcornPopper.off();
        theatreLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
