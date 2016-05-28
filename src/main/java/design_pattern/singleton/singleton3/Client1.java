package design_pattern.singleton.singleton3;

/**
 * Created by LIGHTNING on 2016/5/28.
 */
public class Client1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Singleton1 singleton1 = Singleton1.getInstance();
            System.out.println(singleton1 + " " + singleton1.getName());

        }
    }
}
