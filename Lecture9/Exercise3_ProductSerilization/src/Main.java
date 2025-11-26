import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String fileName = "test3.txt";
        SerilizationDef serilizationDef = new SerilizationDef();
        serilizationDef.setFeature("Feature");
        serilizationDef.setFeatureCount(64);
        serilizationDef.setProductName("Product");

        try {
            SerelizationLibrary.doSerialize(serilizationDef, fileName);
            serilizationDef = (SerilizationDef) SerelizationLibrary.doDeserialize(fileName);
            System.out.println(serilizationDef);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}