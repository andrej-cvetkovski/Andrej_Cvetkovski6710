import java.io.Serializable;

public class SerilizationDef implements Serializable {
    private String productName;
    private String feature;
    private transient int featureCount;

    @Override
    public String toString() {
        return "SerilizationDef{" +
                "productName='" + productName + '\'' +
                ", feature='" + feature + '\'' +
                ", featureCount=" + featureCount +
                '}';
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public int getFeatureCount() {
        return featureCount;
    }

    public void setFeatureCount(int featureCount) {
        this.featureCount = featureCount;
    }


}
