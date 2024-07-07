package Structural.proxy;

public class ConnectorImpl implements Connector{
    private static int time=10;
    public ConnectorImpl(){
        establish();
    }
    
    private void establish() {
        int i=0;
        while(i<time){
            System.out.println("Starting connection...");
            i++;
        }
    }

    @Override
    public void connect() {
        System.out.println("Link Established");
    }
    
}
