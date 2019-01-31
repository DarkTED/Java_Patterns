package observer.www.baeldung.com.example;

public class Demo {
    public static void main(String[] args) {


        ONewsAgency observable = new ONewsAgency();
        ONewsChannel observer = new ONewsChannel();

        observable.addObserver(observer);
        observable.setNews("news");

    }
}
