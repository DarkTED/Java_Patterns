package abstract_factory.example4.recomended;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createddeveloper() {
        return new JavaDeveloper();
    }
}
