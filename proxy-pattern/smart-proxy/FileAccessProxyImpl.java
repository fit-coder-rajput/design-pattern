public class FileAccessProxyImpl implements FileAccess {
    FileAccessImpl fileaAccess = null;
    private int accessCount = 0;
    public FileAccessProxyImpl(){
        fileaAccess = new FileAccessImpl();
    }
    @Override
    public String readFile(){
        accessCount++;
        System.out.println("File accessed " + accessCount + " times.");
       return fileaAccess.readFile();

    }
}
