package Task5;

public class Singleton {

    private static Singleton instance = null;

    public String message;

    private Singleton() {
        this.message = "Singleton Class Here";
    }

    public static Singleton getInstance()
    {
        if (instance == null){
            instance = new Singleton();
            return instance;
        }else{
            return instance;
        }

    }
}
