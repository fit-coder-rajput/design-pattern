public class SmartProxyPattern {

    public static void main(String[] args) {
        FileAccess file = new FileAccessProxyImpl();
        file.readFile();
        file.readFile();
        file.readFile();
        file.readFile();
    }
   
    
}
