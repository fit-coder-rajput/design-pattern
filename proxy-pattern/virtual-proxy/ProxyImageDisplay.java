public class ProxyImageDisplay implements Image {
    
    HighResolutionImage himg = null;
    String fileName;
    public ProxyImageDisplay(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void display(){
        if(himg == null)
            himg = new HighResolutionImage(fileName);
            himg.display();
    }

}
