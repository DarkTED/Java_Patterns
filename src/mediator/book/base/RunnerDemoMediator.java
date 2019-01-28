package mediator.book.base;
/* # 28 # использование медиатора # RunnerDemoMediator.java */

public class RunnerDemoMediator {
    public static void main(String[] args) {
        ConcreteMediator cm = new ConcreteMediator();

        cm.setTrue();
        cm.setFalse();
        cm.setDifferent();
    }
}