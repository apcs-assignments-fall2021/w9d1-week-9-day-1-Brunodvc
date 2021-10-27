import java.util.Locale;

public class numword {
    // Instance variables
    private int num;
    private String word;
    //constructor
    public numword(int a, String b) {
        num = a;
        word = b;
    }
    public int add(){
        return num+= 2;
    }
    public int sub(){
        return num-= 2;
    }
    public String cap(){
        return word.toUpperCase(Locale.ROOT);
    }
    public String low(){
        return word.toLowerCase();
    }
}
