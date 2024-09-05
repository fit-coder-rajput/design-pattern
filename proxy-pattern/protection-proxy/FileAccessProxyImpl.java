public class FileAccessProxyImpl implements FileAccess {
    String admin="";
    FileAccessImpl file=null;
    public FileAccessProxyImpl(String admin){
        this.admin = admin;
    }
    @Override
    public void readFile() {
        if("ADMIN".equals(admin)){
            if(file == null)
                file = new FileAccessImpl();
            file.readFile();
        }else{
            System.out.println("only admin can acess the file");
        }
       
    }
    
}
