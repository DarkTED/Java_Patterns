package singleton.example.habr.com.second_var;

//Проблему многопоточности мы решили, но потеряли две важные вещи:
//1. Ленивую инициализацию (Объект instance будет создан classloader-ом во время инициализации класса)
//2. Отсутствует возможность обработки исключительных ситуаций(exceptions) во время вызова конструктора.
//Решение подходит для многопоточных приложений, при условии
// отсутствия опасности возникновения
// исключительных ситуаций в конструкторе и отсутствии необходимости ленивой инициализации.



public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {

        instance = new Singleton();

        return instance;
    }
}
