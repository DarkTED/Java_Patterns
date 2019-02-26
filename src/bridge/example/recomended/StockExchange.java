package bridge.example.recomended;

public class StockExchange extends Program{
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println(" StockExchange  development  in progress... ");
        developer.writeCode();
    }
}
