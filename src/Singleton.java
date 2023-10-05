public class Singleton {
    private static Singleton instance;

    // Private constructor to prevent direct instantiation
    private Singleton() {}

    // Lazy initialization with double-check locking for thread safety
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Method to demonstrate Singleton functionality
    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");
    }
}
