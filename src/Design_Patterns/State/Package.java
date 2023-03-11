package Design_Patterns.State;

public class Package {

    private PackageState state = new OrderedState();

    // getter, setter

    public void setState(PackageState packageState) {
        this.state = packageState;
    }

    public PackageState getState() {
        return state;
    }
    //use for test
    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}