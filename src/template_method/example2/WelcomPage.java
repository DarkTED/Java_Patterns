package template_method.example2;

public class WelcomPage extends WebsiteTemplate {

    @Override
    public void showPageContent() {
        System.out.println("Welcom");
    }
}
