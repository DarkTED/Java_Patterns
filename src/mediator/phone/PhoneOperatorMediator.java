package mediator.phone;
/* # 29 # функционал медиатора и его реализация # PhoneOperatorMediator.java #
ConcretePhoneOperatorMediator.java */
public interface PhoneOperatorMediator {
    long generatePhoneNumber();
    void addPhoneSubscriber(PhoneSubsciber ps);
    boolean isSupported(PhoneSubsciber ps);
    boolean connect(PhoneSubsciber ps1, PhoneSubsciber ps2);
    boolean disconnect(PhoneSubsciber ps);
}