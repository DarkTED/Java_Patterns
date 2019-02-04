package singleton.example.habr.com.seventh_var;

//Double Checked Locking & volatile
//+ Ленивая инициализация
//+ Высокая производительность
//- Поддерживается только с JDK 1.5 [5]
//https://habr.com/ru/post/129494/

public class Singleton {
    private static volatile Singleton instance;

    public static Singleton getInstance() {
        Singleton localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton();
                }
            }
        }
        return localInstance;
    }
}