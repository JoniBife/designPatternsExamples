package singleton;

/* Logic:
   1ª Create instance at compile time
   2ª Always return instance
    */
public class EagerSingleton {

    private EagerSingleton() {}

    private static EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return instance;
    }
}
