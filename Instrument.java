public abstract class Instrument {
    protected String name;
    protected int volume;

    public Instrument(String name) {
        this.name = name;
        this.volume = 5; // default volume
    }

    // Abstract method to be overridden by subclasses (Polymorphism: Method Overriding)
    public abstract void play();

    // Data Coupling example: passing a primitive int to another method.
    public void adjustVolume(int newVolume) {
        changeVolume(newVolume); // Passing a primitive int value.
    }

    // Helper method that takes a primitive data type.
    private void changeVolume(int newVolume) {
        this.volume = newVolume;
        System.out.println(name + " volume set to " + volume);
    }
}