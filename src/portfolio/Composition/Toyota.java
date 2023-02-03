package portfolio.Composition;

public class Toyota extends Car {
    public void setStart() {
        // Declaring an engine object and calling the start() function of the engine.
        ToyotaEngine engine = new ToyotaEngine();
        engine.start();
    }
}
