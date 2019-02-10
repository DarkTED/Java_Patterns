package abstract_factory.example3;

public class OrderFactory { // простейшая реализация шаблона
    public static AbstractOrder createOrderFromFactory(String type) {
        TypeOrder sign = TypeOrder.valueOf(type.toUpperCase());
        switch(sign) {
            case SIMPLE: return new SimpleOrder();
            case EXTENDED: return new ExtendedOrder();
            default : throw new EnumConstantNotPresentException(TypeOrder.class, sign.name());
        }
    }
    public void anOperation() {
        System.out.println("operation");
    }
}
