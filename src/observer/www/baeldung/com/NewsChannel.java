package observer.www.baeldung.com;

public class NewsChannel implements Channel {
    public void setNews(String news) {
        this.news = news;
    }

    private String news;

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }
}