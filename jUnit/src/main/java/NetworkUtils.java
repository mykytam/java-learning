
public class NetworkUtils {
    public static void getConnection() {
        // getting connection with server, not more that 1s
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return;
    }
}
