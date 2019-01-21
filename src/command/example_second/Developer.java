package command.example_second;

public class Developer {

    Command insert;
    Command upadate;
    Command select;
    Command delete;

    public Developer(Command insert, Command upadate, Command select, Command delete) {
        this.insert = insert;
        this.upadate = upadate;
        this.select = select;
        this.delete = delete;
    }
    public void insertRecord(){
        insert.execute();
    }
    public void updateRecord(){
        upadate.execute();
    }
    public void selectRecord(){
        select.execute();
    }
    public void deleteRecord(){
        delete.execute();
    }
}
