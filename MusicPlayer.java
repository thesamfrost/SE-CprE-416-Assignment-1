public class MusicPlayer {

    // Stamp Coupling example: passing a Song object.
    public void loadSong(Song song) {
        System.out.println("Loading song: " + song.title + " (" + song.duration + " sec)");
    }

    public static void main(String[] args) {
        // Create instances demonstrating inheritance.
        Instrument guitar = new Guitar("Fender Stratocaster");
        Instrument piano = new Piano("Yamaha Grand");

        // Polymorphism: Method Overriding.
        guitar.play();
        piano.play();

        // Polymorphism: Method Overloading (specific to Piano).
        if (piano instanceof Piano) {
            ((Piano) piano).play("Moonlight Sonata");
        }

        // Data Coupling: adjustVolume passes a primitive int.
        guitar.adjustVolume(7);

        // Stamp Coupling: passing an object.
        MusicPlayer player = new MusicPlayer();
        Song song = new Song("Imagine", 183);
        player.loadSong(song);

        // Interface Implementation: using Recordable's record() method.
        if (piano instanceof Recordable) {
            ((Recordable) piano).record();
        }
    }
}
