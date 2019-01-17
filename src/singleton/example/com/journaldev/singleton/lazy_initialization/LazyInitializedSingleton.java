package singleton.example.com.journaldev.singleton.lazy_initialization;
    /*
    Ленивый метод инициализации для реализации
    шаблона Singleton создает экземпляр в методе
    глобального доступа. Вот пример кода для создания класса Singleton с этим подходом.
     */
    /*
    отлично работает в случае однопоточной среды,
    но когда речь идет о многопоточных системах, это может вызвать проблемы
     */
    public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
