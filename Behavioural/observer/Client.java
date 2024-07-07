package Behavioural.observer;

class Client implements ClientServer {
    private String state;

    @Override
    public void update(String serverState) {
        this.state = serverState;
        System.out.println("Client received server state update: " + serverState);
    }
}
