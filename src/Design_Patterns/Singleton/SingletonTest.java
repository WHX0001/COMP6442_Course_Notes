package Design_Patterns.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        SingletonConnection.getInstance();
        SingletonConnection.getInstance();
        SingletonConnection.getInstance();
    }
}
