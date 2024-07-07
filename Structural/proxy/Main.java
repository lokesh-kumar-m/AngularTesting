package Structural.proxy;

public class Main {
    public static void main(String[] args) {
        Connector conn=new ProxyConnect();
        conn.connect();
    }
}
