package adapter.example.database;

public class AdapterJavaToDatabase extends JavaApplication implements Database {


    @Override
    public void insert() {
        updateObject();
    }

    @Override
    public void remove() {
        remObject();
    }

    @Override
    public void select() {
    seveObject();
    }
}
