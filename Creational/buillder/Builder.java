package Creational.buillder;

public class Builder {
    private String modelName;
    private int publishedYear;
    private String manufacturerName;
    private String processorName;


    public Builder setModelName(String modelName){
        this.modelName=modelName;
        return this;
    }

    public Builder setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
        return this;
    }

    public Builder setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
        return this;
    }

    public Builder setProcessorName(String processorName) {
        this.processorName = processorName;
        return this;
    }

    public Mobile build() {
        return new Mobile(modelName,publishedYear,manufacturerName,processorName);
    }

    public static void main(String[] args) {
        Mobile mobile = new Builder()
                .setModelName("Apple iPhone 13")
                .setPublishedYear(2022)
                .setManufacturerName("Apple")
                .setProcessorName("Snapdragon 888")
                .build();

        System.out.println("Model Details: " + mobile);
    }
}
