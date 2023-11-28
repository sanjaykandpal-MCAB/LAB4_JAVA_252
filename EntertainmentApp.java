import entertainment.*;

public class EntertainmentApp {
    public static void main(String[] args) {
        // Creating a MusicPlayer object
        MusicPlayer player = new MusicPlayer("Song Title");

        // Using methods defined in the Playable interface
        player.play();
        player.pause();
        player.stop();
    }
}
