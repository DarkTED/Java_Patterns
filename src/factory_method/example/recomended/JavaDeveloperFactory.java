package factory_method.example.recomended;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createddeveloper() {
        return new JavaDeveloper();
    }
}
