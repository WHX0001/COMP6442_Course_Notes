package Design_Patterns.State;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StateTest {
    public static void main(String[] args) {

        Package pkg = new Package();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();
    }
}
