package observer;

import java.util.ArrayList;

public class PullObservable {

    private ArrayList<PullObserver> observers = new ArrayList<>();
    private int state1;
    private int state2;
    private int state3;

    public int getState1() {
        return state1;
    }

    public int getState2() {
        return state2;
    }

    public int getState3() {
        return state3;
    }

    public void setState1(int state) {
        this.state1 = state;
        notifyAllObservers();
    }

    public void setState2(int state) {
        this.state2 = state;
        notifyAllObservers();
    }

    public void setState3(int state) {
        this.state3 = state;
        notifyAllObservers();
    }

    public void registerObserver(PullObserver observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (PullObserver observer : observers) {
            observer.onUpdate(this);
        }
    }
}
