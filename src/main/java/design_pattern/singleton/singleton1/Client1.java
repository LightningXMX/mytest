package design_pattern.singleton.singleton1;

/**
 * Created by LIGHTNING on 2016/5/28.
 */
public class Client1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Singleton1.getInstance());
        }
    }
}
