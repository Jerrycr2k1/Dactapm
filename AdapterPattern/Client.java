package AdapterPattern;

public class Client {
    public static void main(String[] args) {
        VietNam client = new TransAdp(new JapanAdp());
        client.send("Xin chào");
    }
}
