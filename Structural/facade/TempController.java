package Structural.facade;

public class TempController {
    private int MAX_TEMP;
    private int MIN_TEMP;
    private int current_Temp;
    private ElectricityGen electricityGen=new ElectricityGen();

    public void start(boolean stats) {
        this.current_Temp=MIN_TEMP;
        while(stats){
            System.out.println("Current Temp "+ this.current_Temp);
            this.current_Temp+=1;
            if(this.current_Temp>=MAX_TEMP){
                boolean hStatus=electricityGen.off();
                System.out.println("Temprature too hot! turning off heater.");
                System.out.println("Heater Status: "+ hStatus);
                break;
            }
        }
    }

    public void HighestTemp(int MAX_TEMP) {
       this.MAX_TEMP=MAX_TEMP;
    }

    public void LowestTemp(int MIN_TEMP) {
       this.MIN_TEMP=MIN_TEMP;
    }

}
