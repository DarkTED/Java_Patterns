package template_method.example2;

public class NewsPage extends WebsiteTemplate {
    @Override
    public void showPageContent() {
        System.out.println("News");
    }
}
