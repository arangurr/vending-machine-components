package output.actions;

import data.DataStore;
import data.DataStore2;

/**
 * Concrete strategy to store price for {@link input.VM2}
 */
public class StorePrice2 implements StorePriceStrategy {

    @Override
    public void storePrice(DataStore dataStore) {

        DataStore2 ds2 = (DataStore2) dataStore;
        float p = ds2.getTemp_p();
        ds2.setPrice(p);
        System.out.format("Drink price set to %f\n", p);

    }
}
