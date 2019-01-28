package state.bookepam.univ;

public abstract class AbstractState implements IState {
    @Override
    public void learning() {

    }

    @Override
    public void toCancel() {

    }

    protected IState nextState;
}