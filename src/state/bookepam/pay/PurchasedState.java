package state.bookepam.pay;
    /*
    реализация состояний
     */
public class PurchasedState implements IPayState {
    public void check(Order order) {  // проверка
        System.out.println("Оплаченный заказ проверен");
    }

    public void purchase(Order order) {// оплата
        System.out.println("Заказ оплачен");
    }
}
