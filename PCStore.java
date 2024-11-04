import java.util.HashSet;
import java.util.Set;

public class PCStore {
    public static void main(String[] args) {
        
        Set<Laptop> laptops = new HashSet<>();
        
        laptops.add(new Laptop(27000D, "qwerty", "Windows 10", 8, 1024, "Blue"));
        laptops.add(new Laptop(15000D, "asdfgh", "Windows 7", 2, 256, "Gray"));
        laptops.add(new Laptop(75000D, "zxcvbn", "macOS", 32, 1024, "Black"));
        laptops.add(new Laptop(35000D, "ghjkli", "Ubuntu", 16, 512, "Purple"));
        laptops.add(new Laptop(90000D, "mvnjg8", "Windows 10", 32, 2048, "Black"));
        laptops.add(new Laptop(105000D, "ldncjh", "macOS", 32, 1024, "White"));

        

    }
}