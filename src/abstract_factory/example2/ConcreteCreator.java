package abstract_factory.example2;

public class ConcreteCreator extends Creator {
    public Product factoryMethod() {
        // подготовительные действия
        this.anOperation();
        return new ConcreteProduct();
    }
}