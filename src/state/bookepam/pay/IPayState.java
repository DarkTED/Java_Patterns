package state.bookepam.pay;

public interface IPayState {
    public void check(Order order);

    public void purchase(Order order);
}
