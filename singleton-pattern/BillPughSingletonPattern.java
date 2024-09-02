import java.util.LinkedList;

public class BillPughSingletonPattern {
  
    private BillPughSingletonPattern(){}

    private   static  LinkedList<Character> letterList = new LinkedList<>();
    private  static  char[] str = "oepclobbnttfflnfjegfuubsfwatqngugyjkjoglxmsgxdjsgaufptngpnneilqexdbtehtvxqeedfccdgxzxviyrikvvmxxjnvx".toCharArray();

    static {

        for(char c: str){
            letterList.add(c);
        }
    }

    private static class SingleTonLazyLoad{  // jvm will load when it referenced and
        public static final BillPughSingletonPattern instance  = new BillPughSingletonPattern();
    }
    public static BillPughSingletonPattern getInstance(){
        return SingleTonLazyLoad.instance;
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
