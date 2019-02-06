package template_method.example2;

public class Demo {
    public static void main(String[] args) {
        WebsiteTemplate welcom = new WelcomPage();
        WebsiteTemplate newsPge = new NewsPage();

        welcom.showPage();

        System.out.println("\n ++++++++++++++++++++++++++++++++");

         newsPge.showPage();
    }
}
