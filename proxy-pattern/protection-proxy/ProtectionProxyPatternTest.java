public class ProtectionProxyPatternTest {
    public static void main(String[] args) {
        FileAccess file = new FileAccessProxyImpl("adm");

        file.readFile();

        FileAccess file2 = new FileAccessProxyImpl("ADMIN");
        file2.readFile();
    }
}
