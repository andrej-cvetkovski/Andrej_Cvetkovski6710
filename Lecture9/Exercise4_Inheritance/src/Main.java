import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "test4.txt";
        Child child = new Child();
        child.setBrand("Brand");
        child.setProductId(535);
        child.setProductName("Product");

        try{
            SerelizationLibrary.doSerialize(child, fileName);
            child = (Child) SerelizationLibrary.doDeserialize(fileName);
            System.out.println(child);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}