package design_pattern.singleton.singleton2;

/**
 * Created by LIGHTNING on 2016/5/28.
 */
public class Client1 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    System.out.println(Singleton1.getInstance());
                }
            }).start();
        }
    }
}
