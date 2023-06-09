package Design_Patterns.Observer;

public interface Subject {
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notifyAllObservers();
}
