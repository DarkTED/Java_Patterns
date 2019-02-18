package adapter.example.database;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.remove();
        database.select();
    }
}
