package Structural.facade;

public class Controller {
    private static int MIN_TEMP = 20;
    private static int MAX_TEMP = 30;
    private ElectricityGen electricityGen=new ElectricityGen();
    private TempController tempController=new TempController();
    public void igniteHeater(){
        boolean stats=electricityGen.on();
        tempController.HighestTemp(MAX_TEMP);
        tempController.LowestTemp(MIN_TEMP);
        tempController.start(stats);
    }

}

