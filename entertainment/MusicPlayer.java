package entertainment;

public class MusicPlayer implements Playable {
    private String song;
    private boolean isPlaying;
    public MusicPlayer(String song) {
        this.song = song;
        this.isPlaying = false;
    }

    @Override
    public void play() {
        System.out.println("Playing: " + song);
        if (!isPlaying) {
            System.out.println("Playing: " + song);
            isPlaying = true;
        } else {
            System.out.println("Already playing: " + song);
        }
    }

    @Override
    public void pause() {
        System.out.println("Pausing: " + song);
        if (isPlaying) {
            System.out.println("Pausing: " + song);
            isPlaying = false;
        } else {
            System.out.println("Nothing is playing to pause.");
        }
    }

    @Override
    public void stop() {
        System.out.println("Stopping: " + song);
        if (isPlaying) {
            System.out.println("Stopping: " + song);
            isPlaying = false;
        } else {
            System.out.println("Nothing is playing to stop.");
        }
    }
}
