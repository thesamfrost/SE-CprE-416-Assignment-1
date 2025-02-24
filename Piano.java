public class Piano extends Instrument implements Recordable {

    public Piano(String name) {
        super(name);
    }

    // Overriding play() method (Polymorphism)
    @Override
    public void play() {
        System.out.println(name + " is playing a melody.");
    }

    // Overloading play() method (Polymorphism: Method Overloading)
    public void play(String songName) {
        System.out.println(name + " is playing the song: " + songName);
    }

    // Implementing the Recordable interface.
    @Override
    public void record() {
        System.out.println(name + " recording started.");
    }
}
