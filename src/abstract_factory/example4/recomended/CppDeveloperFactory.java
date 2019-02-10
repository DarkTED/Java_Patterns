package abstract_factory.example4.recomended;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createddeveloper() {
        return new CppDeveloper();
    }
}
