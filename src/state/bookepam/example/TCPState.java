package state.bookepam.example;

public interface TCPState {
    void open(TCPConnection context);

    void close(TCPConnection context);

    void synchronize(TCPConnection context);
}
