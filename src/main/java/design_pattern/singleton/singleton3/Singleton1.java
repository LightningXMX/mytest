package design_pattern.singleton.singleton3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by LIGHTNING on 2016/5/28.
 */
public class Singleton1 {
    private int num = 0;
    private static int instanceNum = 2;

    private Singleton1(int num) {
        this.num = num;
    }

    private static List<Singleton1> singleton1List = new ArrayList<Singleton1>();

    static {
        for (int i = 0; i < instanceNum; i++) {
            singleton1List.add(new Singleton1(i+1));
        }
    }

    public static Singleton1 getInstance() {
        Random random = new Random();
        return singleton1List.get(random.nextInt(instanceNum));
    }

    public String getName() {
        return new String("I am No:" + num);
    }
}
