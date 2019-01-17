package singleton.example.com.journaldev.singleton.static_block_initialization;
    /*
    Инициативная инициализация, и статическая блочная инициализация создают экземпляр еще до его использования
     */
public class StaticBlockSingleton {
    /*
    Реализация инициализации статического блока аналогична активной инициализации,
    за исключением того, что экземпляр класса создается в статическом блоке,
    который предоставляет возможность обработки исключений.
     */
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}