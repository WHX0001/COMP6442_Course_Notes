package Design_Patterns.Singleton;

public class SingletonConnection {
    private static SingletonConnection instance = null;
    private SingletonConnection(){};
    public static SingletonConnection getInstance(){
        if(instance==null){
            System.out.println("Instance created!");
            instance = new SingletonConnection();
        }else
            System.out.println("Instance has already been created!");
        return instance;
    }
}
