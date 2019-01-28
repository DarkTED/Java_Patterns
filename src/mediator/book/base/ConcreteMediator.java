package mediator.book.base;

public class ConcreteMediator implements Mediator {
    private ConcreteColleagueOne colleagueOne;
    private ConcreteColleagueTwo colleagueTwo;
    public ConcreteMediator() {
        colleagueOne = new ConcreteColleagueOne();
        colleagueTwo = new ConcreteColleagueTwo();
    }
    public void setTrue() {
        colleagueOne.changetFlag(true);
        colleagueTwo.changetFlag(true);
        System.out.println("Both set to true");
    }
    public void setFalse() {
        colleagueOne.changetFlag(false);
        colleagueTwo.changetFlag(false);
        System.out.println("Both set to false");
    }
    public void setDifferent() {
        colleagueOne.changetFlag(true);
        colleagueTwo.changetFlag(false);
        System.out.println("First - true. Second - false");
    }
}
