class SingleTonPattern{
    public static void main(String[] args) {
        ScrabbleSingleton instance1 = ScrabbleSingleton.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance1.getTheLetterList());
        System.out.println(instance1.getTiles(7).toString());
        System.out.println(instance1.getTheLetterList());

        ScrabbleSingleton instance2 = ScrabbleSingleton.getInstance();
        System.out.println(instance2.hashCode());
        System.out.println(instance2.getTheLetterList());
        System.out.println(instance2.getTiles(7).toString());
        System.out.println(instance2.getTheLetterList());

    }
}