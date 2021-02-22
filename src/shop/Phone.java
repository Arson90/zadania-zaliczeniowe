package shop;

public class Phone {
    private int id;
    private String brand;
    private String model;
    private double price;
    private int cameraResolution;

    public Phone(int id, String brand, String model, double price, int cameraResolution) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.cameraResolution = cameraResolution;
    }

    public String showDetails() {
        return "Phone{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                "$, cameraResolution=" + cameraResolution +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
}
