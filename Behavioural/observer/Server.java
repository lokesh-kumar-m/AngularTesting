package Behavioural.observer;

import java.util.ArrayList;
import java.util.List;

class Server {
    private List<ClientServer> clients = new ArrayList<>();
    private String state;

    public void addClient(ClientServer client) {
        clients.add(client);
    }

    public void removeClient(ClientServer client) {
        clients.remove(client);
    }

    public void setState(String state) {
        this.state = state;
        notifyAllClients();
    }

    private void notifyAllClients() {
        for (ClientServer client : clients) {
            client.update(state);
        }
    }
}
