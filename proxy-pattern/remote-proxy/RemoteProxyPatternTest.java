public class RemoteProxyPatternTest {
    public static void main(String[] args) {
        RemoteService rService = new RemoteServiceProxyImpl();
       String result =  rService.fetchData();
       System.out.println(result);
    }
}
