package singleton;

/* Logic:
   Same as LazySingleton but use
   a double-checked-lock to obtain instance
    */
public class ThreadSafeSingleton {

    private ThreadSafeSingleton() {}

    private static ThreadSafeSingleton instance = null;

    public static ThreadSafeSingleton getInstance() {
        if(instance != null) {
            synchronized (ThreadSafeSingleton.class) {
                if(instance != null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
