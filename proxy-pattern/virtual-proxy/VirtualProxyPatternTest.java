public class VirtualProxyPatternTest {
    public static void main(String[] args) {
        Image img  = new ProxyImageDisplay("img1.jpg");

        img.display();  // when display called then only real subject will load i,e, lazy loading

        img.display(); // it will return the subsequent call without loading again
    }
}
