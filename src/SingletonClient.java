public class SingletonClient {
    public static void main(String[] args) {
        // Create multiple threads to access the Singleton instance
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                Singleton singleton = Singleton.getInstance();
                singleton.showMessage();
            });
            thread.start();
        }
    }
}
