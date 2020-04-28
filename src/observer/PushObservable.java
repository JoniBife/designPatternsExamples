package observer;

import java.util.ArrayList;

public class PushObservable<T> {

    private ArrayList<PushObserver<T>> observers = new ArrayList<>();
    private T state;

    public void setState(T state) {
        this.state = state;
        notifyAllObservers();
    }

    public void registerObserver(PushObserver<T> observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (PushObserver<T> observer : observers) {
            observer.onUpdate(state);
        }
    }
}



