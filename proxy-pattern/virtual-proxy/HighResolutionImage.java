public class HighResolutionImage implements Image {
   String fileName;
   public HighResolutionImage(String fileName){
    this.fileName  = fileName;
    loadImageFromDisk();
   }
    private void loadImageFromDisk() {
    System.out.println("loading image "+fileName+" from disk");
    }   
    
    @Override
    public void display(){
        System.out.println("loading high resolution image ....");
    }


}
