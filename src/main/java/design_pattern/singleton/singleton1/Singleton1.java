package design_pattern.singleton.singleton1;

/**
 * Created by LIGHTNING on 2016/5/28.
 */
public class Singleton1 {

    private static final Singleton1 singleton1 = new Singleton1();

    private Singleton1() {}

    public static Singleton1 getInstance() {
        return singleton1;
    }

}
