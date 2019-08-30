package data;

/**
 * Concrete {@link DataStore} that stores all model dependant data for {@link input.VM1}
 */
public class DataStore1 extends DataStore {

    // Identifier for additive Sugar
    public static final String SUGAR = "sugar";

    // Identifier for drink Tea
    public static final String TEA = "tea";

    // Identifier for drink Chocolate
    public static final String CHOCOLATE = "chocolate";

    private int temp_v;
    private int temp_p;
    private int cf;
    private int price;

    public int getTemp_p() {
        return temp_p;
    }

    public void setTemp_p(int temp_p) {
        this.temp_p = temp_p;
    }

    public int getTemp_v() {
        return temp_v;
    }

    public void setTemp_v(int temp_v) {
        this.temp_v = temp_v;
    }

    public int getCf() {
        return cf;
    }

    public void setCf(int cf) {
        this.cf = cf;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
