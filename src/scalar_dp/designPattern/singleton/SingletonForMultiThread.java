package scalar_dp.designPattern.singleton;

public class SingletonForMultiThread {
    private static SingletonForMultiThread obj;

    private SingletonForMultiThread() {

    }

    public static SingletonForMultiThread getObj() {
        if(obj == null) {
            synchronized (SingletonForMultiThread.class) {
                if (obj == null) {
                    obj = new SingletonForMultiThread();
                }
            }
        }
        return obj;
    }

}
