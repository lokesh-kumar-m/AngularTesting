package Structural.facade;

public class ElectricityGen {

    private boolean state;

    protected boolean on(){
        this.state=true;
        System.out.println("Heater Status: "+ this.state);
        return this.state;
    }
    protected boolean off(){
        this.state=false;
        return this.state;
    }
}
