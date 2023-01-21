package scalar_dp.designPattern.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getObj();
        Singleton s2 = Singleton.getObj();
        Singleton s3 = Singleton.getObj();

        SingletonForMultiThread sm1 = SingletonForMultiThread.getObj();
        SingletonForMultiThread sm2 = SingletonForMultiThread.getObj();
        SingletonForMultiThread sm3 = SingletonForMultiThread.getObj();
    }
}
