package data;

/**
 * Concrete {@link DataStore} that stores all model dependant data for {@link input.VM2}
 */
public class DataStore2 extends DataStore {

    // Identifier for additive Cream
    public static final String CREAM = "cream";

    // Identifier for additive Sugar
    public static final String SUGAR = "sugar";

    // Identifier for drink Coffee
    public static final String COFFEE = "coffee";

    private float temp_p;
    private float temp_v;
    private float cf;
    private float price;


    public float getTemp_p() {
        return temp_p;
    }

    public void setTemp_p(float temp_p) {
        this.temp_p = temp_p;
    }

    public float getTemp_v() {
        return temp_v;
    }

    public void setTemp_v(float temp_v) {
        this.temp_v = temp_v;
    }

    public float getCf() {
        return cf;
    }

    public void setCf(float cf) {
        this.cf = cf;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
