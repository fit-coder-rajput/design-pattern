import java.util.LinkedList;
public class ScrabbleSingleton {
    private static ScrabbleSingleton firstInstance = null;
    private ScrabbleSingleton(){}

    private   static  LinkedList<Character> letterList = new LinkedList<>();
    private  static  char[] str = "oepclobbnttfflnfjegfuubsfwatqngugyjkjoglxmsgxdjsgaufptngpnneilqexdbtehtvxqeedfccdgxzxviyrikvvmxxjnvx".toCharArray();

    static {

        for(char c: str){
            letterList.add(c);
        }
    }
    public static ScrabbleSingleton getInstance(){

        if(firstInstance == null){ // check one if already have instance dont excecute static block
           synchronized(ScrabbleSingleton.class){
            if(firstInstance == null){ // if no instance is created create one
                firstInstance = new ScrabbleSingleton();
            }
        }
        }
        return firstInstance;
    }

    public LinkedList<Character> getTiles(int noOfTiles){
        LinkedList<Character> tiles = new LinkedList<>();

        for(int i=0; i<noOfTiles; i++){
            tiles.add(letterList.removeFirst());
        }
        return tiles;
    }

    public LinkedList<Character> getTheLetterList(){
        return letterList;
    }
    
}
