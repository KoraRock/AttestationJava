import java.util.Objects;

public abstract class Computer {
    protected double price;
    private  String vendorCode; // артикул
    private String os; // операционная система
    private int ram; // ОЗУ
    private int hdd; // Объем жесткого диска
    public Computer(double price, String vendorCode, String os, int ram, int hdd) {
        this.price = price;
        this.vendorCode = vendorCode;
        this.os = os;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getPCType() {
        return getClass().getSimpleName();
    }
     @Override
    public String toString() {
        return getPCType() + " {" +
                "price = " + price +
                ", vendorCode = '" + vendorCode + '\'' +
                ", OC = " + os + '\'' +
                ", ОЗУ = " + ram + "GB" +
                ", HDD = " + hdd + "GB" +
                '}';
    }

    public int getRam(){
        return ram;
    }
    
    public void setRam(int ram) {
            this.ram = ram;
        }
    
    public int getHdd(){
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
    public String getOs(){
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getVendorCode() {
            return vendorCode;
        }

    public void setVendorCode(String vendorCode) {
            this.vendorCode = vendorCode;
        }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return computer.equals(computer.vendorCode) && ram == computer.ram && hdd==computer.hdd && os.equals(computer.os) ;
    }
    @Override
    public int hashCode() {
        return Objects.hash(price, vendorCode, ram, hdd, os);
    }
}
