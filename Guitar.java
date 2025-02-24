public class Guitar extends Instrument {

    public Guitar(String name) {
        super(name);
    }

    // Overriding play() method (Polymorphism)
    @Override
    public void play() {
        System.out.println(name + " is strumming chords.");
    }
}