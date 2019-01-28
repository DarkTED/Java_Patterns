package state.bookepam.base;

public class Context {
    private State state;

    public class context {
        private State state;

        public context() {

        }

        public void changeStateRequest() {
            state.someAction();
        }
    }
}
