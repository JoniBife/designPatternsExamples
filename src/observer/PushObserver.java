package observer;

public interface PushObserver<T> {
    void onUpdate(T state);
}