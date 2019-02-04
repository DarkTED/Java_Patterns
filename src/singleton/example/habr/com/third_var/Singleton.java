package singleton.example.habr.com.third_var;


//В данном случае мы полностью решили проблему
// ленивой инициализации – объект инициализируется
// при первом вызове метода getInstance().
// Но у нас осталась проблема с обработкой
// исключительных ситуаций в конструкторе.
// Так что, если конструктор класса не вызывает
// опасений создания исключительных ситуаций,
// то смело можно использовать этот метод.
public class Singleton {
    private Singleton instance;

    private Singleton() {
    }
    private static class SingletonHolder{
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {

       return SingletonHolder.instance;
    }
}
