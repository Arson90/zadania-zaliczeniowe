package shop;

public class TV {
    private int id;
    private String brand;
    private String model;
    private double price;
    private double resolution;

    public TV(int id, String brand, String model, double price, double resolution) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.resolution = resolution;
    }

    public String showDetails() {
        return "TV{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                "$, resolution=" + resolution +
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

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }
}
