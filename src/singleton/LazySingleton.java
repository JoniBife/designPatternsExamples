package singleton;

/* Logic:
   1ª Has an instance of LazySingleton been created?
   2ª Yes, return it
   3ª No, create an instance, save it in the field and return it
    */
public class LazySingleton {

    private LazySingleton() {}

    private static LazySingleton instance = null;

    public static LazySingleton getInstance() {
        if(instance != null)
            instance = new LazySingleton();
        return instance;
    }
}
