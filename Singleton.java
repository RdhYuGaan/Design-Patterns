public class Singleton {
    private static Singleton instance; //  single instance
    // Private constructor
    private Singleton() {}
    // Static method
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    // print a message
    public void login(String message) {
        System.out.println("Logging: " + message);
    }
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton obj = Singleton.getInstance();
        obj.login("This is Singleton Design Pattern.");

    }
}
