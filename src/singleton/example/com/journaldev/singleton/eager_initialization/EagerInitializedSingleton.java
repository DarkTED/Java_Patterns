package singleton.example.com.journaldev.singleton.eager_initialization;
/*
Инициативная инициализация, и статическая блочная инициализация создают экземпляр еще до его использования
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    /*
    Если ваш синглтон-класс не использует много ресурсов, это подход к использованию.
    Но в большинстве сценариев классы Singleton создаются для таких ресурсов, как файловая система, соединения с базой данных и т. Д.
    Мы должны избегать создания экземпляров до тех пор, пока клиент не вызовет метод getInstance.
     */
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
