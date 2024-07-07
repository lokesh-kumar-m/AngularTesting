package Structural.proxy;

public class ProxyConnect implements Connector {
    private static Connector connector;
    @Override
    public void connect() {
        if(connector==null){
            connector=new ConnectorImpl();
        }
        connector.connect();
    }
    
}
