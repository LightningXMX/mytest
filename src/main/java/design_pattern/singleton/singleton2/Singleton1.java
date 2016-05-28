package design_pattern.singleton.singleton2;

/**
 * Created by LIGHTNING on 2016/5/28.
 */
public class Singleton1 {
    private static Singleton1 singleton1 = null;
    private Singleton1(){}
    //线程不安全
    public static Singleton1 getInstance() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

}
