package abstract_factory.example4.recomended;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("java");
        Developer developer = developerFactory.createddeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if(specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        }else if (specialty.equalsIgnoreCase("C++"))
        {
            return new CppDeveloperFactory();
        }
        else {
            throw new RuntimeException(specialty + "нет ");
        }

    }
}
