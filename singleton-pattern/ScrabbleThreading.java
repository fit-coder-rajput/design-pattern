public class ScrabbleThreading implements Runnable {

    @Override
    public void run() {
        // synchronzied way
        // ScrabbleSingleton instance1 = ScrabbleSingleton.getInstance();
        // System.out.println(instance1.hashCode());
        // System.out.println(instance1.getTheLetterList());
        // System.out.println(instance1.getTiles(7).toString());
        // System.out.println(instance1.getTheLetterList());

        // bill pugh singleton
        BillPughSingletonPattern instance1 = BillPughSingletonPattern.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance1.getTheLetterList());
        System.out.println(instance1.getTiles(7).toString());
        System.out.println(instance1.getTheLetterList());

    }

    
}
