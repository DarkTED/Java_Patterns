package singleton.example.habr.com.first_var;

//Вариант первый – самый простой, который приходит в голову сразу после понимания проблемы.
//У этого решения есть единственный недостаток – оно не работает в многопоточной среде и
// поэтому не подходит в большинстве случаев. Решение подходит исключительно для однопоточных приложений.
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
