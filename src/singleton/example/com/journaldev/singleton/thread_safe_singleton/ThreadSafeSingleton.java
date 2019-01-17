package singleton.example.com.journaldev.singleton.thread_safe_singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    /*
    Вышеприведенная реализация работает нормально
    и обеспечивает безопасность потоков,
    но снижает производительность из-за
    затрат, связанных с синхронизированным методом
     */
}
