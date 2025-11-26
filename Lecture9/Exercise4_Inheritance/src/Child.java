import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Child extends  Parent implements Serializable {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Parent product name: " + getProductName() + " , " + getProductId() + "Child{" +
                "brand='" + brand + '\'' +
                '}';
    }

    private void writeObject(ObjectOutputStream o) throws IOException {
        o.defaultWriteObject();
        o.writeObject(getProductName());
        o.writeInt(getProductId());
    }

    private void readObject(ObjectInputStream o) throws IOException, ClassNotFoundException {
        o.defaultReadObject();
        setProductName((String) o.readObject());
        o.readInt();

    }
}
