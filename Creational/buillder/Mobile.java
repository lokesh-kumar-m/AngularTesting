package Creational.buillder;

public class Mobile {
    private String modelName;
    private int publishedYear;
    private String manufacturerName;
    private String processorName;

    public Mobile(String modelName,int publishedYear,String manufacturerName, String processorName ) {
        this.modelName = modelName;
        this.publishedYear = publishedYear;
        this.manufacturerName = manufacturerName;
        this.processorName = processorName;
    }

    public String getModelName() {
        return modelName;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public String getProcessorName() {
        return processorName;
    }

    @Override public String toString() { 
        return "Mobile{" + "modelName='" + modelName + " " + ", publishedYear=" + publishedYear + ", manufacturerName='" + manufacturerName + " " + ", processorName='" + processorName + " " + '}'; 
    }
       
}
