package esercizioCostruttoreDue;

public class Auto {
    private String brand;
    private String model;
    private String plateNumber;
    private String vehicleDisplacement;

    //metodo costruttore
    public Auto( String brand, String model, String plateNumber, String vehicleDisplacement){
        this.brand = brand;
        this.model = model;
        this.plateNumber = plateNumber;
        this.vehicleDisplacement = vehicleDisplacement;
    }

    @Override
    public String toString() {
        return "Auto: " +
                "brand= " + brand + '\n' +
                ", model= " + model + '\n' +
                ", plateNumber= " + plateNumber + '\n' +
                ", vehicleDisplacement= " + vehicleDisplacement;
    }

    //dichiaro getter e setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getVehicleDisplacement() {
        return vehicleDisplacement;
    }

    public void setVehicleDisplacement(String vehicleDisplacement) {
        this.vehicleDisplacement = vehicleDisplacement;
    }
}
//Scrivere un programma che contenga una classe
// che definisce un Auto che abbia come proprietà
// cilindrata, targa, marca e modello.
//Per questa classe saranno necessari i metodi
// accessori (getters e setters) ed un costruttore.
//Nel main dichiarare un oggetto di tipo Auto.