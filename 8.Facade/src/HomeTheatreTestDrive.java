import homeTheatre.*;

public class HomeTheatreTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheatreLights theatreLights = new TheatreLights();
        PopcornPopper popcornPopper = new PopcornPopper();

        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, screen, theatreLights, popcornPopper);

        homeTheatreFacade.watchMovie("Raiders of the Lost Ark");
        homeTheatreFacade.endMovie();
    }
}
