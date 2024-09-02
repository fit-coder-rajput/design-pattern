public class BillPughSingletonTest {
    public static void main(String[] args) {
        Runnable player1 = new ScrabbleThreading();
        Runnable player2 = new ScrabbleThreading();
 
         new Thread(player1).start();
         new Thread(player2).start();
     }
}
