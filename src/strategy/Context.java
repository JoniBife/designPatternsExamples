package strategy;

/**
 * Makes use of the strategy
 */
public class Context {

    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeContext() {
        //Use strategy to do whatever it needs
    }
}
