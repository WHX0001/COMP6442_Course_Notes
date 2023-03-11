package Design_Patterns.Observer;

import java.util.ArrayList;

public class Place implements Subject{
    private ArrayList<Observer> observers;
    private String name;

    public Place(String name){
        this.name = name;
        observers = new ArrayList<>();
    }
    @Override
    public void attach(Observer observer){
        observers.add(observer);
    }
    @Override
    public void detach(Observer observer){
        observers.remove(observer);
    }
    @Override
    public void notifyAllObservers(){
        for(Observer observer: observers){
            observer.update(this.name + " has a confirmed case.");
        }
    }
}
