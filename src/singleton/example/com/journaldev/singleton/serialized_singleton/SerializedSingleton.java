package singleton.example.com.journaldev.singleton.serialized_singleton;

import java.io.Serializable;
    /*
    Проблема с сериализованным одноэлементным классом состоит
    в том, что всякий раз, когда мы десериализовываем его,
    он создает новый экземпляр класса.
    Давайте посмотрим на это с помощью простой программы.
     */
public class SerializedSingleton implements Serializable{

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }

}
