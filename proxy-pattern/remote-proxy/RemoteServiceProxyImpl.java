public class RemoteServiceProxyImpl implements RemoteService {

   RemoteServiceImpl rService;
   public RemoteServiceProxyImpl(){
    rService = new RemoteServiceImpl();
   }
   
    @Override
    public String fetchData() {
        System.out.println("fetching data from remote server...");
        networkLatency();
        return rService.fetchData();
    }

    private void networkLatency() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
