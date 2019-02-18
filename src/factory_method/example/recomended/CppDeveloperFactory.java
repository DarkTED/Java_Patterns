package factory_method.example.recomended;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createddeveloper() {
        return new CppDeveloper();
    }
}
