package Behavioural.observer;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        
        Client client1 = new Client();
        Client client2 = new Client();
        
        
        server.addClient(client1);
        server.addClient(client2);


        server.setState("Server is free");

        server.removeClient(client1);
        server.setState("Server is busy");
    }    
}
