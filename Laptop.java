public class Laptop extends Computer {

    public String color;

    public Laptop(double price, String vendorCode, String os, int ram, int hdd, String color) {
        super(price, vendorCode, os, ram, hdd);
        this.color = color;
    }
}