package abstract_factory.example2;

public abstract class Creator {
    public abstract Product factoryMethod();
    public void anOperation() {
        System.out.println("operation");
    }
}